package dev.local.springjwt.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Collection;
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
    @ManyToOne(fetch = FetchType.LAZY)
    private Professeur professeur;

    @ManyToMany(mappedBy = "sujets",fetch = FetchType.LAZY)
    @JsonIgnore
    @ToString.Exclude
    Collection<Technologie> technologies;
}
