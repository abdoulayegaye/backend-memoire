package dev.local.springjwt.dao;

import dev.local.springjwt.model.Soutenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoutenanceDao extends JpaRepository<Soutenance, Long> {
}
