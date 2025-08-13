package com.example.Dailydone.Mapper;

import com.example.Dailydone.DTO.ErrandDTO;
import com.example.Dailydone.Entity.Address;
import com.example.Dailydone.Entity.Category;
import com.example.Dailydone.Entity.Errand;
import com.example.Dailydone.Entity.User;

public class ErrandMapper {
    public static ErrandDTO toDTO(Errand errand) {
        if (errand == null) {
            return null;
        }
        ErrandDTO dto = new ErrandDTO();
        dto.setId(errand.getId());
        dto.setDescription(errand.getDescription());
        dto.setPrice(errand.getPrice());
        dto.setStatus(errand.getStatus());
        dto.setCreatedAt(errand.getCreatedAt());
        dto.setUpdatedAt(errand.getUpdatedAt());

        // Extract IDs from relations
        dto.setCustomerId(errand.getCustomer() != null ? errand.getCustomer().getId() : null);
        dto.setRunnerId(errand.getRunner() != null ? errand.getRunner().getId() : null);
        dto.setCategoryId(errand.getCategory() != null ? errand.getCategory().getId() : null);
        dto.setPickupAddressId(errand.getPickupAddress() != null ? errand.getPickupAddress().getId() : null);
        dto.setDropAddressId(errand.getDropAddress() != null ? errand.getDropAddress().getId() : null);

        return dto;
    }

    public static Errand toEntity(ErrandDTO dto) {
        if (dto == null) {
            return null;
        }
        Errand errand = new Errand();
        errand.setDescription(dto.getDescription());
        errand.setPrice(dto.getPrice());
        errand.setStatus(dto.getStatus());
        errand.setCreatedAt(dto.getCreatedAt());
        errand.setUpdatedAt(dto.getUpdatedAt());

        // Set only IDs for related entities
        if (dto.getCustomerId() != null) {
            User customer = new User();
            customer.setId(dto.getCustomerId());
            errand.setCustomer(customer);
        }
        if (dto.getRunnerId() != null) {
            User runner = new User();
            runner.setId(dto.getRunnerId());
            errand.setRunner(runner);
        }
        if (dto.getCategoryId() != null) {
            Category category = new Category();
            category.setId(dto.getCategoryId());
            errand.setCategory(category);
        }
        if (dto.getPickupAddressId() != null) {
            Address pickup = new Address();
            pickup.setId(dto.getPickupAddressId());
            errand.setPickupAddress(pickup);
        }
        if (dto.getDropAddressId() != null) {
            Address drop = new Address();
            drop.setId(dto.getDropAddressId());
            errand.setDropAddress(drop);
        }

        return errand;
    }
}
