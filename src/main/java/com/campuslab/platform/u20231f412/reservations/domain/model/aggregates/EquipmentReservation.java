package com.campuslab.platform.u20231f412.reservations.domain.model.aggregates;

import com.campuslab.platform.u20231f412.reservations.domain.model.valueobjects.EquipmentBatch;
import com.campuslab.platform.u20231f412.reservations.domain.model.valueobjects.ReservationCode;
import com.campuslab.platform.u20231f412.reservations.domain.model.valueobjects.ReservationPeriod;
import com.campuslab.platform.u20231f412.reservations.domain.model.valueobjects.ReservationStatus;
import com.campuslab.platform.u20231f412.shared.domain.model.aggregates.AbstractDomainAggregateRoot;
import lombok.Getter;

@Getter
public class EquipmentReservation extends AbstractDomainAggregateRoot {
    private Long id;
    private ReservationCode reservationCode;
    private ReservationPeriod reservationPeriod;
    private EquipmentBatch equipmentBatch;
    private ReservationStatus status;
}
