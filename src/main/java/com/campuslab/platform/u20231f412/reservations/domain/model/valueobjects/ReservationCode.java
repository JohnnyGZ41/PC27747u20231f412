package com.campuslab.platform.u20231f412.reservations.domain.model.valueobjects;

import org.jspecify.annotations.NullMarked;

@NullMarked
public record ReservationCode(String reservationCode) {

    public ReservationCode{
        if (reservationCode == null || reservationCode.isBlank()) {
            throw new IllegalArgumentException("Reservation code id cannot be null or blank");
        }
    }
}
