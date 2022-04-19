package dev.local.springjwt.dao;

import dev.local.springjwt.model.Classe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasseDao extends JpaRepository<Classe, Long> {
}
