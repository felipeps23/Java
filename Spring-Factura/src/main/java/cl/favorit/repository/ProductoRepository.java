package cl.favorit.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import cl.favorit.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
