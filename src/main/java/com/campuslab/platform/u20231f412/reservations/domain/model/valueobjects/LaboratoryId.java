package com.campuslab.platform.u20231f412.reservations.domain.model.valueobjects;

import java.util.UUID;

public record LaboratoryId(String laboratoryId) {
    public LaboratoryId(){
        this(UUID.randomUUID().toString());
    }

    public LaboratoryId{
        if (laboratoryId == null || laboratoryId.isBlank()){
            throw new IllegalArgumentException("Laboratory id cannot be null or empty");
        }
        try {
            UUID.fromString(laboratoryId);
        } catch (IllegalArgumentException exception) {
            throw new IllegalArgumentException("Laboratory id must be a valid UUID", exception);
        }
    }
}
