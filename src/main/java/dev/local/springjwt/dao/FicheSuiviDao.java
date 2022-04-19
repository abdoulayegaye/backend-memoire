package dev.local.springjwt.dao;

import dev.local.springjwt.model.FicheSuivi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FicheSuiviDao extends JpaRepository<FicheSuivi, Long> {
}
