package com.crud_oprations.jpa.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Name cannot be null")
    @NotEmpty
    @NotBlank
    private String name;

    @NotNull(message = "City cannot be null")
    private String city;

    @Min(value = 18,message = "Age should not be less than 18")
    @Max(value = 30,message = "Age should not be greater than 30")
    private Integer age;

    @Size(min = 10,max = 300,message = "About me must be between 10-300 characters")
    private String aboutMe;

    @NotBlank(message = "Email should not be blank")
    @Email(message = "Email should be valid")
    private String email;

    private Date birthDate;
    private Date createdDate=new Date();
}
