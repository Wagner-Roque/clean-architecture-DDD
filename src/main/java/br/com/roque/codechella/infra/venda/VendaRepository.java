package br.com.roque.codechella.infra.venda;

import br.com.roque.codechella.infra.venda.Venda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendaRepository extends JpaRepository<Venda, Long> {
}
