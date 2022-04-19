package dev.local.springjwt.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Soutenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private Date dateSoutenance;
    @Column(nullable = false)
    private String lieuSoutenance;
    @Column(nullable = false)
    private int dureeEnMinutes;
    @Column(nullable = false)
    private double note;
    @Column(nullable = false)
    private String appreciation;
    @Column(nullable = false)
    private int statut;
    @ManyToOne(fetch = FetchType.LAZY)
    private Jury jury;
    @OneToOne
    @JoinColumn(name = "etudiant_id", referencedColumnName = "")
    private Etudiant etudiant;
}
