package com.reservation.reservation;

import com.reservation.reservation.models.Reservation;
import com.reservation.reservation.repositories.IReservationRepository;
import com.reservation.reservation.services.IReservationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationApplication.class, args);
	}

		@Bean
	public CommandLineRunner loadReservations(IReservationRepository repository) {
		return(args) -> {
			Reservation r1 = new Reservation(1L, "reservation1", 2025);
			Reservation r2 = new Reservation(2L, "reservation2", 2025);
			Reservation r3 = new Reservation(3L, "reservation3", 2025);
			repository.saveAndFlush(r1);
			repository.saveAndFlush(r2);
			repository.saveAndFlush(r3);

		};
	}
}
