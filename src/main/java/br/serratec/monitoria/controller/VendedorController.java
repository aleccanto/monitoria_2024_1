package br.serratec.monitoria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.serratec.monitoria.model.Vendedor;
import br.serratec.monitoria.repository.VendedorRepository;

@RestController
@RequestMapping("/vendedores")
public class VendedorController {

	@Autowired
	private VendedorRepository repository;

	@PostMapping
	public Vendedor inserir(@RequestBody Vendedor vendedor) {
		return repository.save(vendedor);
	}
}
