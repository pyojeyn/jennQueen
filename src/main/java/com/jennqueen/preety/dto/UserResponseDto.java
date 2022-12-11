package com.jennqueen.preety.dto;

import com.jennqueen.preety.entity.embeddable.Address;
import lombok.*;

import javax.persistence.Column;
import java.math.BigInteger;

//@Builder 이거 하면 mapper 할 때 에러남.
//is not public in 'com.jennqueen.preety.dto.UserResponseDto'. Cannot be accessed from outside package
@Getter
@Setter
@ToString
public class UserResponseDto {
    private BigInteger id;
    private String name;
    private String email;
    private AddressDto address;
    private String phoneNumber;
    private String role;
    private String grade;



    @Getter
    @Setter
    public static class AddressDto{
        private String address1;
        private String address2;
        private String address3;
        private Integer zipCode;
    }


}
