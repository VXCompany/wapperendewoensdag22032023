package com.reservation.reservation.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "RESERVATION")
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    String emailadress;
    int phoneNumber;

    public Reservation(Long id,
                       String emailadress,
                       int phoneNumber) {
        this.id = id;
        this.emailadress = emailadress;
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEailadress() {
        return emailadress;
    }

    public void setEmailadress(String emailadress) {
        this.emailadress = emailadress;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Reservation() {

    }

//    @ManyToMany
//    List<Machine> machines;

    @Override
    public String toString() {
        return "Reservation is: id= "+id +
                " emailadress " + emailadress +
                "phonenumber: " + phoneNumber;
    }
}
