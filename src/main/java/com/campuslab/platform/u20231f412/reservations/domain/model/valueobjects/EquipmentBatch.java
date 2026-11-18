package com.campuslab.platform.u20231f412.reservations.domain.model.valueobjects;

public record EquipmentBatch(Integer quantity, String unit) {

    public EquipmentBatch{
        if ( quantity < 0 || quantity == null)
            throw new IllegalArgumentException("Quantity cannot be null or less than 0");
        if (unit == null || unit.isBlank())
            throw new IllegalArgumentException("Unit cannot be null or blank");
    }
    }
}
