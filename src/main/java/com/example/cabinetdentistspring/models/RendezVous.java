package com.example.cabinetdentistspring.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")



public class RendezVous {

    public enum Etat {
        CONFIRMED,
        CANCELED,
        PENDING
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Date dateReservation;
    @Column
    private String motif;

    @Enumerated (EnumType.STRING)
    private Etat etat;




    @OneToOne
     private Patient patient;


}

