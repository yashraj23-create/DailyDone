package com.example.Dailydone.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {
    private Long id;
    private String street;
    private String city;
    private String state;
    private String country;
    private Double latitude;
    private Double longitude;
    private Long userId;
}
