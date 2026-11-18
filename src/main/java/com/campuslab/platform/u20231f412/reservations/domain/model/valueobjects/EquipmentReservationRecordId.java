package com.campuslab.platform.u20231f412.reservations.domain.model.valueobjects;

import java.util.UUID;

public record EquipmentReservationRecordId(String equipReservationRecordId) {

    public EquipmentReservationRecordId(){
        this(UUID.randomUUID().toString());
    }

    public EquipmentReservationRecordId{
        if (equipReservationRecordId == null || equipReservationRecordId.isBlank()){
            throw new IllegalArgumentException("Equipment reservation id cannot be null or empty");
        }
        try {
            UUID.fromString(equipReservationRecordId);
        } catch (IllegalArgumentException exception) {
            throw new IllegalArgumentException("Equipment reservation id must be a valid UUID", exception);
        }
    }
}