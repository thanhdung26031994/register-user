package com.example.registeruser.model;

import javax.validation.constraints.*;

public class User {
    @NotBlank(message = "Không được để trống")
    @Size(min = 5, max = 45, message = "Độ dài từ 5-45")
    private String firstName;
    @NotBlank(message = "Không được để trống")
    @Size(min = 5, max = 45, message = "Độ dài từ 5-45")
    private String lastName;
    @Pattern(regexp = "^0[0-9]{9}$",message = "Phải là số và có 10 chữ số")
    private String phone;
    @Min(value = 18,message = "Tuổi phải lớn hơn 18")
    private Integer age;
    @Pattern(regexp = "^[A-Za-z0-9._]{6,32}@([A-Za-z0-9]{2,12}.){1,2}[A-Za-z0-9]{2,12}$",
            message = "Theo định dạng tenmail@gmail.com")
    private String email;

    public User() {
    }

    public User(@NotBlank @Size(min = 5, max = 45) String firstName,
                @NotBlank @Size(min = 5, max = 45) String lastName,
                @Pattern(regexp = "^0[0-9]{9}$") String phone,
                @Min(value = 18) Integer age,
                @Pattern(regexp = "^[A-Za-z0-9._]{6,32}@([A-Za-z0-9]{2,12}.){1,2}[A-Za-z0-9]{2,12}$") String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.age = age;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
