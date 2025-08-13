package com.example.Dailydone.Mapper;

import com.example.Dailydone.DTO.RoleDTO;
import com.example.Dailydone.Entity.Role;

public class RoleMapper {
    public static RoleDTO toDTO(Role role) {
        if (role == null) return null;

        RoleDTO dto = new RoleDTO();
        dto.setId(role.getId());
        dto.setName(role.getName());
        return dto;
    }

    // DTO → Entity
    public static Role toEntity(RoleDTO dto) {
        if (dto == null) return null;

        Role role = new Role();
        role.setId(dto.getId());
        role.setName(dto.getName());
        return role;
    }

}
