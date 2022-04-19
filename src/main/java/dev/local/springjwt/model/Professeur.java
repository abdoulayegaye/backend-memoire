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
public class Professeur{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private int matP;
    @Column(nullable = false)
    private String grade;
    @ManyToOne
    private Jury jury;
    @ManyToOne(fetch = FetchType.LAZY)
    private Domaine domaine;
    @OneToMany(mappedBy = "professeur")
    private List<Sujet> sujets;
}
