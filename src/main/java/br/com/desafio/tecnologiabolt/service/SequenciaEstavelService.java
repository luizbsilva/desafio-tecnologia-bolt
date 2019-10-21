package br.com.desafio.tecnologiabolt.service;

import br.com.desafio.tecnologiabolt.model.SequenciaEstavel;
import br.com.desafio.tecnologiabolt.regras.RegrasSequenciaEstavel;
import br.com.desafio.tecnologiabolt.repository.SequenciaEstavelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SequenciaEstavelService {

    @Autowired
    private SequenciaEstavelRepository repository;

    @Autowired
    private RegrasSequenciaEstavel regras;

    public Long validarOperacoesNecessarias(String input) {
        Optional<SequenciaEstavel> exists = repository.findById(input);
        if (exists.isPresent()) {
            System.out.println("Essa sequencia já foi adicionado recentemente");
            return exists.get().getQuantidadeDeOperacoes();
        } else {
            Long cost = regras.operacoesNecessarias(input);
            SequenciaEstavel obj = new SequenciaEstavel();
            obj.setQuantidadeDeOperacoes(cost);
            obj.setSequencia(input);
            repository.save(obj);
            System.out.println("Sequencia não encontrada no Banco");
            return cost;
        }
    }
}
