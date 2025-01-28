package br.com.roque.codechella;

import br.com.roque.codechella.domain.evento.Categoria;
import br.com.roque.codechella.domain.evento.Evento;


import java.time.LocalDateTime;

public class TesteFabricaDeEvento {
    public static void main(String[] args) {
        Evento evento = new Evento.Builder()
                .comCategoria(Categoria.MUSICA)
                .comDescricao("The Weeknd")
                .comEndereco("25989785", 50, "Maracanã")
                .comData(LocalDateTime.parse("2025-11-19T19:00:00"))
                .build();
        System.out.println(evento);
    }
}
