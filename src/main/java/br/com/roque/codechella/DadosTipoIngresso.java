package br.com.roque.codechella;

import br.com.roque.codechella.domain.ingresso.Definicao;
import br.com.roque.codechella.domain.ingresso.Setor;

public record DadosTipoIngresso(
        Integer codigo,
        Setor setor,
        Definicao definicao
) {
}
