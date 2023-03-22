package com.reservation.reservation.controllers;

import com.reservation.reservation.models.Reservation;
import com.reservation.reservation.services.IReservationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/v1/reservations")
public class ReservationController {

    private final IReservationService service;
    public ReservationController(final IReservationService service) {
        this.service = service;
    }


    /**
     * Get all reservations.
     * @return List of reservations.
     */
    @GetMapping
    public ResponseEntity<List<Reservation>> getReservations() {
        try {
            return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
        } catch (Exception exception) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Reservation not found");
        }
    }
}
