package cl.favorit.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import cl.favorit.model.Producto;
import cl.favorit.repository.ProductoRepository;

public class ProductoService implements ProductoRepository{

	
	
	@Override
	public List<Producto> findAll() {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public List<Producto> findAll(Sort sort) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public List<Producto> findAllById(Iterable<Long> ids) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public <S extends Producto> List<S> saveAll(Iterable<S> entities) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public void flush() {
		// TODO Esbozo de método generado automáticamente
		
	}

	@Override
	public <S extends Producto> S saveAndFlush(S entity) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public <S extends Producto> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Producto> entities) {
		// TODO Esbozo de método generado automáticamente
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Esbozo de método generado automáticamente
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Esbozo de método generado automáticamente
		
	}

	@Override
	public Producto getOne(Long id) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Producto getById(Long id) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public <S extends Producto> List<S> findAll(Example<S> example) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public <S extends Producto> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Page<Producto> findAll(Pageable pageable) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public <S extends Producto> S save(S entity) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Optional<Producto> findById(Long id) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Esbozo de método generado automáticamente
		return false;
	}

	@Override
	public long count() {
		// TODO Esbozo de método generado automáticamente
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Esbozo de método generado automáticamente
		
	}

	@Override
	public void delete(Producto entity) {
		// TODO Esbozo de método generado automáticamente
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Esbozo de método generado automáticamente
		
	}

	@Override
	public void deleteAll(Iterable<? extends Producto> entities) {
		// TODO Esbozo de método generado automáticamente
		
	}

	@Override
	public void deleteAll() {
		// TODO Esbozo de método generado automáticamente
		
	}

	@Override
	public <S extends Producto> Optional<S> findOne(Example<S> example) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public <S extends Producto> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public <S extends Producto> long count(Example<S> example) {
		// TODO Esbozo de método generado automáticamente
		return 0;
	}

	@Override
	public <S extends Producto> boolean exists(Example<S> example) {
		// TODO Esbozo de método generado automáticamente
		return false;
	}

}
