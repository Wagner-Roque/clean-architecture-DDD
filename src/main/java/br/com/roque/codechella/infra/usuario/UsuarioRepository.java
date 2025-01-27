package br.com.roque.codechella.infra.usuario;

import br.com.roque.codechella.infra.usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
