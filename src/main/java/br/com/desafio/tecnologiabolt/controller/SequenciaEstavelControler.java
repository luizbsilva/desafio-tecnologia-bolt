package br.com.desafio.tecnologiabolt.controller;

import br.com.desafio.tecnologiabolt.service.SequenciaEstavelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/bolt-energy")
public class SequenciaEstavelControler {
    @Autowired
    private SequenciaEstavelService service;

    @PostMapping("/validar-sequencia")
    public List<Long> numerosDeOperacoes(@RequestBody List<String> inputs) {
        return inputs.stream().map(i -> service.validarOperacoesNecessarias(i)).collect(Collectors.toList());

    }
}
