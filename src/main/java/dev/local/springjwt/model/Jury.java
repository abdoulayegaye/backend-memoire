package dev.local.springjwt.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mysql.cj.log.ProfilerEvent;
import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Jury {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Professeur presidentJury;

    @ManyToMany(mappedBy = "jurys",fetch = FetchType.LAZY)
    @JsonIgnore
    @ToString.Exclude
    Collection<Professeur> professeurs;
}
