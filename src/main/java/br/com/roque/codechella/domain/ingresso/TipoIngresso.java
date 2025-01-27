package br.com.roque.codechella.domain.ingresso;

public class TipoIngresso {
    private String ingresso;
    private int quantidade;

    public TipoIngresso(String ingresso, int quantidade) {
        this.ingresso = ingresso;
        this.quantidade = quantidade;
    }

    public TipoIngresso() {}

    public String getIngresso() {
        return ingresso;
    }

    public void setIngresso(String ingresso) {
        this.ingresso = ingresso;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
