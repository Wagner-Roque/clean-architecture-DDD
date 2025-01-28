package br.com.roque.codechella.aplication.usuario;

import br.com.roque.codechella.infra.usuario.Usuario;

public interface EnviarCupomDesconto {

    void enviarEmailPara(Usuario usuario);
}
