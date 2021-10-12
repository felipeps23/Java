package cl.favorit.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import cl.favorit.model.Categoria;
import cl.favorit.repository.CategoriaRepository;

@Service
public class CategoriaService implements CategoriaRepository{

	@Autowired 
	private CategoriaRepository categoriaRepository;

	@Override
	public List<Categoria> findAll() {
		// TODO Esbozo de método generado automáticamente
		return categoriaRepository.findAll();
	}

	@Override
	public List<Categoria> findAll(Sort sort) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public List<Categoria> findAllById(Iterable<Long> ids) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public <S extends Categoria> List<S> saveAll(Iterable<S> entities) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public void flush() {
		// TODO Esbozo de método generado automáticamente
		
	}

	@Override
	public <S extends Categoria> S saveAndFlush(S entity) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public <S extends Categoria> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Categoria> entities) {
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
	public Categoria getOne(Long id) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Categoria getById(Long id) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public <S extends Categoria> List<S> findAll(Example<S> example) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public <S extends Categoria> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Page<Categoria> findAll(Pageable pageable) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public <S extends Categoria> S save(S entity) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public Optional<Categoria> findById(Long id) {
		
		return categoriaRepository.findById(id);
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
	public void delete(Categoria entity) {
		// TODO Esbozo de método generado automáticamente
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Esbozo de método generado automáticamente
		
	}

	@Override
	public void deleteAll(Iterable<? extends Categoria> entities) {
		// TODO Esbozo de método generado automáticamente
		
	}

	@Override
	public void deleteAll() {
		// TODO Esbozo de método generado automáticamente
		
	}

	@Override
	public <S extends Categoria> Optional<S> findOne(Example<S> example) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public <S extends Categoria> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Esbozo de método generado automáticamente
		return null;
	}

	@Override
	public <S extends Categoria> long count(Example<S> example) {
		// TODO Esbozo de método generado automáticamente
		return 0;
	}

	@Override
	public <S extends Categoria> boolean exists(Example<S> example) {
		// TODO Esbozo de método generado automáticamente
		return false;
	}
	
	
}

