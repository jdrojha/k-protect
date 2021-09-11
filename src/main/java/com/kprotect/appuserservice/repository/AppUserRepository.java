package com.kprotect.appuserservice.repository;

import com.kprotect.appuserservice.entity.AppUserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/****
 * @Author - Rajesh Ojha
 * Repository Class and use for DB Operation.
 *
 */
public interface AppUserRepository extends CrudRepository<AppUserEntity, Integer> {

    @Transactional(readOnly = true)
    @Query("SELECT appuser FROM AppUserEntity  appuser WHERE appuser.userId = ?1 and appuser.companyId = ?2")
    AppUserEntity findByUserId(String userId, String companyId);
}



