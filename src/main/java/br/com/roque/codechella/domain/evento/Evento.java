package br.com.roque.codechella.domain.evento;


import br.com.roque.codechella.domain.ingresso.TipoIngresso;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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

    public Evento() {}

    public void incluiNovoTipoDeIngressoAoEvento(TipoIngresso tipoIngresso){
        this.tipoIngressos.add(tipoIngresso);
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
}
