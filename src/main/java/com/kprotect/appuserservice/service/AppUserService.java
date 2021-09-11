package com.kprotect.appuserservice.service;

import com.kprotect.appuserservice.dto.AppUserDTO;

public interface AppUserService {
    AppUserDTO findByUserId(String userId, String companyId);

    AppUserDTO saveUser(AppUserDTO appUserDTO);

    void deleteUser(String userId, String companyId);
}
