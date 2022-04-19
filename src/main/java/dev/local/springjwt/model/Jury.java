package dev.local.springjwt.model;

import com.mysql.cj.log.ProfilerEvent;
import lombok.*;

import javax.persistence.*;
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
    @OneToMany(mappedBy = "jury")
    private List<Professeur> membres;
    @ManyToOne(fetch = FetchType.LAZY)
    private Professeur presidentJury;
}
