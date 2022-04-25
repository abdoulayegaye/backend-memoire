package dev.local.springjwt.model;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Technologie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(nullable = false)
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    private TypeTechnologie typeTechnologie;

    @ManyToMany(cascade = {
            CascadeType.MERGE,
    },fetch=FetchType.EAGER)
    @JoinTable(name = "sujet_technologie",
            joinColumns = @JoinColumn(name = "technologie_id"),
            inverseJoinColumns = @JoinColumn(name = "sujet_id")
    )
    Collection<Sujet> sujets ;
}
