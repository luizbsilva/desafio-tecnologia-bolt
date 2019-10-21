package br.com.desafio.tecnologiabolt.repository;

import br.com.desafio.tecnologiabolt.model.SequenciaEstavel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SequenciaEstavelRepository extends CrudRepository<SequenciaEstavel,String> {
}
