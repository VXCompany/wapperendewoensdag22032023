package com.reservation.reservation.services;

import com.reservation.reservation.models.Reservation;
import com.reservation.reservation.repositories.IReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReservationService implements IReservationService {

    @Autowired
    private IReservationRepository reservationRepository;

    @Override
    public List<Reservation> findAll() {

        return reservationRepository.findAll();
    }
}
