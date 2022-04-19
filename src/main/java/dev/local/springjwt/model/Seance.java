package dev.local.springjwt.model;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Seance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private int numero;
    @Column(nullable = false)
    private String travail;
    @Column(nullable = false)
    private Date dateSeance;
    @ManyToOne
    private FicheSuivi ficheSuivi;

}
