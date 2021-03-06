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

import cl.favorit.persona.model.Pais;
import cl.favorit.persona.service.PaisService;

@RestController
@RequestMapping ("/pais/")
public class PaisREST {

	@Autowired
	private PaisService paisService;
	
	@GetMapping
	private ResponseEntity<List<Pais>> getAllPaises () {
		return ResponseEntity.ok(paisService.findAll());
	}
	
	@PostMapping
	private ResponseEntity<Pais> savePais (@RequestBody Pais pais) {
		try {
			Pais paisGuardado = paisService.save(pais);
			return ResponseEntity.created(new URI("/pais/" + paisGuardado.getId())).body(paisGuardado);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean>  deletePais(@PathVariable ("id") Long id){
		try {
			paisService.deleteById(id);
			return ResponseEntity.ok(!(paisService.findById(id)!=null));
			
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
	}
	
}
