package br.edu.infnet.approteiroviagem.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.approteiroviagem.model.domain.Servico;

@Repository
public interface ServicoRepository extends CrudRepository<Servico, Integer>{

}
