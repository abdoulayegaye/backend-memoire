package dev.local.springjwt.model;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Memoire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private String urlDocument;
    @ManyToOne(fetch = FetchType.LAZY)
    private Etudiant proprietaire;
    @ManyToOne(fetch = FetchType.LAZY)
    private Sujet sujet;
    @ManyToOne(fetch = FetchType.LAZY)
    private Professeur encadreur;
}
