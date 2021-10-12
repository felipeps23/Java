package cl.favorit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.favorit.model.Producto;
import cl.favorit.services.ProductoService;

@RestController
@RequestMapping("/productos/")
public class ProductoREST {

	@Autowired
	private ProductoService productoservice;
	
	@GetMapping
	private ResponseEntity<List<Producto>> getAllProductos (){
		return ResponseEntity.ok(productoservice.findAll());
	}
}
