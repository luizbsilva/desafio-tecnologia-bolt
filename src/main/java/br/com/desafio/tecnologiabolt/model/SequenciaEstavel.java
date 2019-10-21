package br.com.desafio.tecnologiabolt.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SequenciaEstavel {

    @Id
    private String sequencia;
    private Long quantidadeDeOperacoes;

    public String getSequencia() {
        return sequencia;
    }

    public void setSequencia(String sequencia) {
        this.sequencia = sequencia;
    }

    public Long getQuantidadeDeOperacoes() {
        return quantidadeDeOperacoes;
    }

    public void setQuantidadeDeOperacoes(Long quantidadeDeOperacoes) {
        this.quantidadeDeOperacoes = quantidadeDeOperacoes;
    }
}
