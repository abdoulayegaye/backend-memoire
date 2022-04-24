package dev.local.springjwt.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @ManyToOne(fetch = FetchType.LAZY)
    //@JsonIgnore
    private Jury jury;
    @ManyToOne(fetch = FetchType.LAZY)
    //@JsonIgnore
    private Domaine domaine;
    @OneToMany(mappedBy = "professeur", fetch = FetchType.LAZY)
    //@JsonIgnore
    private List<Sujet> sujets;
}
