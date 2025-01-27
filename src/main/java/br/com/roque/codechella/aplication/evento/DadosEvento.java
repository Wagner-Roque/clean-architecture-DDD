package br.com.roque.codechella.aplication.evento;

import br.com.roque.codechella.domain.evento.Categoria;
import br.com.roque.codechella.DadosCadastroTipoIngresso;
import br.com.roque.codechella.DadosEndereco;

import java.time.LocalDateTime;
import java.util.List;

public record DadosEvento(
        Long id,
        Categoria categoria,
        String descricao,
        DadosEndereco endereco,
        LocalDateTime data,
        List<DadosCadastroTipoIngresso> tipoIngressos
) {
}
