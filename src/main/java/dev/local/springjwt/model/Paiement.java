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
public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private double montant;
    @Column(nullable = false)
    private Date datePaiement;
    @Column(nullable = false)
    private String typePaiement;
    @Column(nullable = false)
    private int statut;
    @Column(nullable = false)
    private Date dateValidation;
    @Column(nullable = false)
    private Date dateAnnulation;
    @OneToOne
    @JoinColumn(name = "etudiant_id", referencedColumnName = "")
    private Etudiant etudiant;
}
