package dev.local.springjwt.dao;

import dev.local.springjwt.model.Seance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeanceDao extends JpaRepository<Seance, Long> {
}
