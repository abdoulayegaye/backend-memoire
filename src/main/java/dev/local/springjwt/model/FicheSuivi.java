package dev.local.springjwt.model;

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
public class FicheSuivi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private String decision;
    @ManyToOne(fetch = FetchType.LAZY)
    private Etudiant etudiant;
    @OneToMany(mappedBy = "ficheSuivi")
    private List<Seance> seances;
}
