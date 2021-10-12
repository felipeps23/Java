package cl.favorit.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import cl.favorit.model.Factura;
import cl.favorit.repository.FacturaRepository;

public class FacturaService implements FacturaRepository{

	@Override
	public List<Factura> findAll() {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public List<Factura> findAll(Sort sort) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public List<Factura> findAllById(Iterable<Long> ids) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public <S extends Factura> List<S> saveAll(Iterable<S> entities) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public void flush() {
		// TODO Esbozo de método generado automáticamente
		
	}

	@Override
	public <S extends Factura> S saveAndFlush(S entity) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public <S extends Factura> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Factura> entities) {
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
	public Factura getOne(Long id) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Factura getById(Long id) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public <S extends Factura> List<S> findAll(Example<S> example) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public <S extends Factura> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Page<Factura> findAll(Pageable pageable) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public <S extends Factura> S save(S entity) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Optional<Factura> findById(Long id) {
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
	public void delete(Factura entity) {
		// TODO Esbozo de método generado automáticamente
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Esbozo de método generado automáticamente
		
	}

	@Override
	public void deleteAll(Iterable<? extends Factura> entities) {
		// TODO Esbozo de método generado automáticamente
		
	}

	@Override
	public void deleteAll() {
		// TODO Esbozo de método generado automáticamente
		
	}

	@Override
	public <S extends Factura> Optional<S> findOne(Example<S> example) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public <S extends Factura> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public <S extends Factura> long count(Example<S> example) {
		// TODO Esbozo de método generado automáticamente
		return 0;
	}

	@Override
	public <S extends Factura> boolean exists(Example<S> example) {
		// TODO Esbozo de método generado automáticamente
		return false;
	}

}
