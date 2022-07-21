package br.com.medlab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.medlab.models.Exame;

@Repository
public interface ExameRepository extends JpaRepository<Exame, Long> {

}
