package cl.favorit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.favorit.model.DetalleFactura;
import cl.favorit.services.DetalleFacturaService;



@RestController
@RequestMapping("/detalles_facturas/")
public class DetalleFacturaREST {

	@Autowired
	private DetalleFacturaService detallefacturaservice;
	
	@GetMapping
	private ResponseEntity<List<DetalleFactura>> getAllDetallesFacturas (){
		return ResponseEntity.ok(detallefacturaservice.findAll());
	}
}

