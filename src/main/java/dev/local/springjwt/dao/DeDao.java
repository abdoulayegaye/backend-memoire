package dev.local.springjwt.dao;

import dev.local.springjwt.model.De;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeDao extends JpaRepository<De, Long> {
}
