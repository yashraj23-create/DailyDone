package com.example.Dailydone.Mapper;

import com.example.Dailydone.DTO.AddressDTO;
import com.example.Dailydone.Entity.Address;
import com.example.Dailydone.Entity.User;

public class AddressMapper {
    public AddressDTO toDTO(Address address) {
        if (address == null) {
            return null;
        }
        AddressDTO dto = new AddressDTO();
        dto.setId(address.getId());
        dto.setStreet(address.getStreet());
        dto.setCity(address.getCity());
        dto.setState(address.getState());
        dto.setCountry(address.getCountry());
        dto.setLatitude(address.getLatitude());
        dto.setLongitude(address.getLongitude());
        if (address.getUser() != null) {
            dto.setUserId(address.getUser().getId());
        }
        return dto;
    }

    // DTO → Entity
    public Address toEntity(AddressDTO dto, User user) {
        if (dto == null) {
            return null;
        }
        Address address = new Address();
        address.setStreet(dto.getStreet());
        address.setCity(dto.getCity());
        address.setState(dto.getState());
        address.setCountry(dto.getCountry());
        address.setLatitude(dto.getLatitude());
        address.setLongitude(dto.getLongitude());
        address.setUser(user); // User object passed from service
        return address;
    }
}
