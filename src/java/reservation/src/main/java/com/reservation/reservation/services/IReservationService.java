package com.reservation.reservation.services;

import com.reservation.reservation.models.Reservation;

import java.util.List;

public interface IReservationService {
    List<Reservation> findAll();
}
