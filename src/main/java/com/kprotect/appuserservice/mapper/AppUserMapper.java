package com.kprotect.appuserservice.mapper;

import com.kprotect.appuserservice.dto.AppUserDTO;
import com.kprotect.appuserservice.entity.AppUserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

/***
 * @author Rajesh Ojha
 * @since 1.0
 * Mapper class and using for convert DTO to Entity and viceversa
 */
@Mapper(componentModel = "spring")
public interface AppUserMapper {
        @Mappings({
                @Mapping(target = "serviceAddress", ignore = true)
        })
        AppUserDTO entityToApi(AppUserEntity entity);

        @Mappings({
                @Mapping(target = "id", ignore = true),
                @Mapping(target = "version", ignore = true)
        })
        AppUserEntity apiToEntity(AppUserDTO api);

        List<AppUserDTO> entityListToApiList(List<AppUserEntity> entity);
        List<AppUserEntity> apiListToEntityList(List<AppUserDTO> api);
}
