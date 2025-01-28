package br.com.roque.codechella.aplication.evento;


import br.com.roque.codechella.domain.evento.Endereco;
import br.com.roque.codechella.domain.evento.Evento;

public interface RepositorioDeEvento {

    Evento buscarEventoPorCidade(Endereco endereco);
}
