package com.harmew.access.core.domain;

public class Visitant {

    private Long id;
    private String rg;
    private Person person;

    public Visitant() {
    }

    public Visitant(Long id, String rg, Person person) {
        this.id = id;
        this.rg = rg;
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}