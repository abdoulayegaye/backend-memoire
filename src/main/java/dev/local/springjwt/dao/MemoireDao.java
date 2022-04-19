package dev.local.springjwt.dao;

import dev.local.springjwt.model.Memoire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemoireDao extends JpaRepository<Memoire, Long> {
}
