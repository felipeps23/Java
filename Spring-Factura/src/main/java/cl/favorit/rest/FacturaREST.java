package cl.favorit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.favorit.model.Factura;
import cl.favorit.services.FacturaService;

@RestController
@RequestMapping("/facturas/")
public class FacturaREST {

	@Autowired
	private FacturaService facturaservice;
	
	@GetMapping
	private ResponseEntity<List<Factura>> getAllFacturas (){
		return ResponseEntity.ok(facturaservice.findAll());
	}
	
}