package cl.favorit.persona.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.favorit.persona.model.Estado;
import cl.favorit.persona.service.EstadoService;

@RestController
@RequestMapping ("/estado/")
public class EstadoREST {

	@Autowired
	private EstadoService estadoService;
	
	@GetMapping
	private ResponseEntity<List<Estado>> getAllEstados () {
		return ResponseEntity.ok(estadoService.findAll());
	}
	
	@PostMapping
	private ResponseEntity<Estado> saveEstado (@RequestBody Estado estado) {
		try {
			Estado estadoGuardado = estadoService.save(estado);
			return ResponseEntity.created(new URI("/pais/" + estadoGuardado.getId())).body(estadoGuardado);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean>  deleteEstado(@PathVariable ("id") Long id){
		try {
			estadoService.deleteById(id);
			return ResponseEntity.ok(!(estadoService.findById(id)!=null));
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
	}
	
}
