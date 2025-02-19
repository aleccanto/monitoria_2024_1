package br.serratec.monitoria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.serratec.monitoria.model.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Long> {

}
