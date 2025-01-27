package br.com.roque.codechella.infra.evento;

import br.com.roque.codechella.infra.evento.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {

}
