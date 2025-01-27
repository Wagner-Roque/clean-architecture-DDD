package br.com.roque.codechella.aplication.venda;

import br.com.roque.codechella.DadosTipoIngresso;
import br.com.roque.codechella.aplication.usuario.DadosUsuario;

import java.util.List;

public record DadosVenda(
        Long id,
        DadosUsuario usuario,
        List<DadosTipoIngresso> ingressos
) {
}
