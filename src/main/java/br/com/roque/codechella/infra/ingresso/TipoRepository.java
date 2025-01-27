package br.com.roque.codechella.infra.ingresso;

import br.com.roque.codechella.infra.ingresso.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoRepository extends JpaRepository<Tipo, Long> {
}
