package com.campuslab.platform.u20231f412.reservations.domain.model.valueobjects;

import java.time.LocalDate;

public record ReservationPeriod(LocalDate startDate, LocalDate endDate) {

    public ReservationPeriod{

        if (startDate == null)
            throw new IllegalArgumentException("Start date cannot be null");
        if (endDate == null || endDate.isBefore(startDate) || endDate.isEqual(startDate))
            throw new IllegalArgumentException("End date cannot be null, before startDate or the same as start date");
    }
}
