package dev.local.springjwt.dao;
import dev.local.springjwt.model.TypeTechnologie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeTechnologieDao extends JpaRepository<TypeTechnologie, Long> {
}
