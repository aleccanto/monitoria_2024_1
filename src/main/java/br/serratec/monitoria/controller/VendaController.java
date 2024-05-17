package br.serratec.monitoria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.serratec.monitoria.model.Venda;
import br.serratec.monitoria.model.Vendedor;
import br.serratec.monitoria.repository.VendaRepository;
import br.serratec.monitoria.repository.VendedorRepository;

@RestController
@RequestMapping("/vendas")
public class VendaController {

	@Autowired
	private VendaRepository repository;

	@Autowired
	private VendedorRepository vendedorRepository;
	
//	@GetMapping
//	public ResponseEntity<List<Venda>> listar() {
//		
//	}

	@PostMapping("/vendedor/{vendedorId}")
	public Venda inserir(@RequestBody Venda venda, @PathVariable Long vendedorId) {
		Vendedor vendedor = vendedorRepository.findById(vendedorId).orElse(null);
		if (vendedor != null) {
			venda.setVendedor(vendedor);
			return repository.save(venda);
		}
		return null;
	}
}
