package dev.local.springjwt.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Sujet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private String libelle;
    @Column()
    private String contexte;
    @Column()
    private String problematique;
    @Column()
    private String motivations;
    @OneToMany(mappedBy = "sujet")
    private List<Technologie> technologies;
    @ManyToOne(fetch = FetchType.LAZY)
    private Professeur professeur;
}
