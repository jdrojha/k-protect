
package com.kprotect.appuserservice.api;

import com.kprotect.appuserservice.dto.AppUserDTO;
import com.kprotect.appuserservice.service.AppUserService;
import com.kprotect.appuserservice.util.exceptions.InvalidInputException;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/***
 * @author Rajesh Ojha
 * @Description Supporting class of API
 *
 */
@RestController
public class AppUserApiServiceImpl implements AppUserApiService {
    private static final Logger LOG = LoggerFactory.getLogger(AppUserApiServiceImpl.class);

    private final AppUserService appUserService;

    @Autowired
    public AppUserApiServiceImpl(AppUserService appUserService) {
        this.appUserService = appUserService;
    }


    @Override
    public AppUserDTO createUser(AppUserDTO body) {
        AppUserDTO appUserDTO = appUserService.saveUser(body);
        return appUserDTO;
    }



    @Override
    public AppUserDTO findByUserId(String userId, String companyId) {

        if (StringUtils.isEmpty(userId) || StringUtils.isEmpty(companyId) )
            throw new InvalidInputException("Invalid User Id: " + userId);

        LOG.debug("AppUserId :"+userId + " companyid :"+companyId);
        AppUserDTO appUserDTO = appUserService.findByUserId(userId, companyId);

        LOG.debug("User: response size: {}", appUserDTO);
        return appUserDTO;
    }

    @Override
    public Map<String, Object> deleteUser(String userId, String companyId) {

        if (StringUtils.isEmpty(userId) || StringUtils.isEmpty(companyId) )
            throw new InvalidInputException("Invalid User Id: " + userId);

        LOG.debug("AppUserId :"+userId + " companyid :"+companyId);
        appUserService.deleteUser(userId, companyId);
        return null;
    }

    @Override
    public List<AppUserDTO> testService() {
        LOG.debug("testService");
        List<AppUserDTO> appUserDTOS = new ArrayList<>();
        AppUserDTO appUserDTO = new AppUserDTO();
        appUserDTO.setUserId("Rajesh");
        appUserDTO.setEmail("rk.ojha@yahoo.com");
        appUserDTOS.add(appUserDTO);
        return appUserDTOS;
    }
}
