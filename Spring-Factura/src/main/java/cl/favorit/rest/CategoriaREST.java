package cl.favorit.rest;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cl.favorit.model.Categoria;
import cl.favorit.model.Producto;
import cl.favorit.services.CategoriaService;
import cl.favorit.services.ProductoService;



@RestController
public class CategoriaREST {

	@Autowired
	private ProductoService productoService;

	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping(value = "/productos/{categoriaid}", headers = "Accept = application/json")
	public @ResponseBody List<Producto> listaProductoPorCategoria(
			@PathVariable(name="categoriaid") int idCategoria){
		List<Producto> listaProductos = productoService.findAll();
		List<Producto> listaProductosCategoria = new ArrayList<Producto>();
		for(Producto a: listaProductos) {
			if(a.getCategoria().getIdCategoria()==idCategoria) {
				listaProductosCategoria.add(a);
			}
		}
		
		return listaProductosCategoria;
		
	}
	
	@PostMapping
	private ResponseEntity<Categoria> saveCategoria (@RequestBody Categoria categoria){
		try {
			Categoria categoriaGuardada = categoriaService.save(categoria);
			return ResponseEntity.created(new URI("/categorias/" + categoriaGuardada.getIdCategoria())).body(categoriaGuardada);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
}
