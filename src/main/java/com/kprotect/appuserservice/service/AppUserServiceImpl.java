package com.kprotect.appuserservice.service;

import com.kprotect.appuserservice.dto.AppUserDTO;
import com.kprotect.appuserservice.entity.AppUserEntity;
import com.kprotect.appuserservice.mapper.AppUserMapper;
import com.kprotect.appuserservice.repository.AppUserRepository;
import com.kprotect.appuserservice.util.http.ServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppUserServiceImpl implements AppUserService {
    private static final Logger LOG = LoggerFactory.getLogger(AppUserServiceImpl.class);

    private final AppUserRepository appUserRepository;
    private final AppUserMapper mapper;
    private final ServiceUtil serviceUtil;


    @Autowired
    public AppUserServiceImpl(AppUserRepository appUserRepository, AppUserMapper mapper, ServiceUtil serviceUtil) {
        this.appUserRepository = appUserRepository;
        this.mapper = mapper;
        this.serviceUtil = serviceUtil;
    }

    @Override
    public AppUserDTO findByUserId(String userId, String companyId) {
        AppUserEntity appUserEntity = appUserRepository.findByUserId(userId, companyId);
        AppUserDTO appUserDTO = mapper.entityToApi(appUserEntity);
        appUserDTO.setServiceAddress(serviceUtil.getServiceAddress());
        return appUserDTO;
    }

    @Override
    public AppUserDTO saveUser(AppUserDTO appUserDTO) {
        AppUserEntity entity = mapper.apiToEntity(appUserDTO);

        AppUserEntity newEntity = appUserRepository.save(entity);
        LOG.debug("created a user entity: {}/{}", appUserDTO);
        return mapper.entityToApi(newEntity);
    }

    @Override
    public void deleteUser(String userId, String companyId) {
        AppUserEntity appUserEntity = appUserRepository.findByUserId(userId, companyId);
        appUserRepository.delete(appUserEntity);
        LOG.debug("Deleted a user entity: {}/{}", appUserEntity);
    }
}
