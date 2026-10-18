package com.javademo.spring_boot_tutorial.dto;

public class EmployeeDto {
    private Long id;
    private String email;
    private String name;
    private Long salary;

    public EmployeeDto() {
    }

    public EmployeeDto(Long id, String email, String name, Long salary) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}