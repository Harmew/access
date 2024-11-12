package com.harmew.access.core.domain;

public class Resident {

    private Long id;
    private String cpf;
    private String address;
    private String phone_number;
    private Person person;

    public Resident() {
    }

    public Resident(Long id, String cpf, String address, String phone_number, Person person) {
        this.id = id;
        this.cpf = cpf;
        this.address = address;
        this.phone_number = phone_number;
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}