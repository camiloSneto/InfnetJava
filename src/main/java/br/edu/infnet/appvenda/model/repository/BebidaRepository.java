package br.edu.infnet.appvenda.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appvenda.model.domain.Bebida;

@Repository
public interface BebidaRepository extends CrudRepository<Bebida, Integer>{

}
