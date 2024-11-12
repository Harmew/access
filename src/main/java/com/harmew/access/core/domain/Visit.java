package com.harmew.access.core.domain;

import java.time.LocalDateTime;

public class Visit {

    private Long id;
    private LocalDateTime dateTime;
    private Long resident_id;
    private Long visitant_id;

    public Visit() {
    }

    public Visit(Long id, LocalDateTime dateTime, Long resident_id, Long visitant_id) {
        this.id = id;
        this.dateTime = dateTime;
        this.resident_id = resident_id;
        this.visitant_id = visitant_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Long getResident_id() {
        return resident_id;
    }

    public void setResident_id(Long resident_id) {
        this.resident_id = resident_id;
    }

    public Long getVisitant_id() {
        return visitant_id;
    }

    public void setVisitant_id(Long visitant_id) {
        this.visitant_id = visitant_id;
    }
}