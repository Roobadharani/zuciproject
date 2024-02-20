package com.zuci.ZuciIStay.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Registeration {
    @Id
    private String userMailId;
    private String userName;
    private String userPassword;
    private long mobileNumber;
}
