package com.kprotect.appuserservice.api;

import com.kprotect.appuserservice.dto.AppUserDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/***
 * @author Rajesh Ojha
 * @Description - API service interface, it would hold all endpoint which is related to AppUserService
 *
 */
public interface AppUserApiService {

    @PostMapping(
            value    = "/appuser/save",
            consumes = "application/json",
            produces = "application/json")
    AppUserDTO createUser(@RequestBody AppUserDTO appUserDTO);

    @GetMapping(
            value    = "/appuser/{userId}/{companyId}",
            produces = "application/json")
    AppUserDTO findByUserId(@PathVariable String userId, @PathVariable String companyId);

    @DeleteMapping(
            value = "/appuser/{userId}/{companyId}",
            consumes = "application/json",
            produces = "application/json")
    Map<String, Object> deleteUser(@PathVariable String userId, @PathVariable String companyId);

    @GetMapping(
            value = "/appuser/testservice",
            produces = "application/json")
    List<AppUserDTO> testService();

}
