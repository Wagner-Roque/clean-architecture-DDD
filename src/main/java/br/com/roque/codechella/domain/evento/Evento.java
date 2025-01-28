package br.com.roque.codechella.domain.evento;


import br.com.roque.codechella.domain.ingresso.TipoIngresso;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;

public class Evento {

    /**
     * Classe que só tem getter e setter é classe anêmica, não tem regra.
     * não esta aplicando regra de domínio
     * geralmente quando vamos cliar uma classe de domínio só cliamos os getters
     */

    private UUID uuid;
    private Categoria categoria;
    private String descricao;
    private Endereco endereco;
    private LocalDateTime data;
    private List<TipoIngresso> tipoIngressos = new ArrayList<>();

    public Evento (Categoria categoria, String descricao, Endereco endereco, LocalDateTime data ) {

        this.categoria = categoria;
        this.descricao = descricao;
        this.endereco = endereco;
        this.data = data;

        gerarIdentificadorUnico();
    }

    private void gerarIdentificadorUnico() {
        this.uuid = UUID.randomUUID();
    }

    private Evento() {}

    public void incluiNovoTipoDeIngressoAoEvento(TipoIngresso tipoIngresso){
        this.tipoIngressos.add(tipoIngresso);
    }

    public static class Builder{
        private Evento evento;

        public Builder() {
            this.evento = new Evento();
        }

        public Builder comCategoria(Categoria categoria){
            evento.categoria = categoria;
            return this;
        }

        public Builder comDescricao(String descricao){
            evento.descricao = descricao;
            return this;
        }

        public Builder comEndereco(String cep, Integer numero, String complemento) {
            Endereco endereco = new Endereco(cep, numero, complemento);
            evento.endereco = endereco;
            return this;
        }

        public Builder comData(LocalDateTime data){
            evento.data = data;
            return this;
        }
        public Evento build(){
            evento.gerarIdentificadorUnico();
            return evento;
        }

    }
    public void aumentaNumeroDeIngressoPorTipo(String tipo, int quantidade) {
//        for (TipoIngresso ingresso : ingressos) {
//            if (TipoIngresso.getIngresso(). equals(tipo)) {
//                ingresso.setQuantidade(ingresso.getQuantidade() + quantidade);
//                break;
//            }
//        }
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public LocalDateTime getData() {
        return data;
    }

    public List<TipoIngresso> getTipoIngressos() {
        return tipoIngressos;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "categoria=" + categoria +
                ", descricao='" + descricao + '\'' +
                ", endereco=" + endereco +
                ", data=" + data +
                '}';
    }
}
