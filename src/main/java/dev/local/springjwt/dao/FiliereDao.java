package dev.local.springjwt.dao;

import dev.local.springjwt.model.Filiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FiliereDao extends JpaRepository<Filiere, Long> {
}
