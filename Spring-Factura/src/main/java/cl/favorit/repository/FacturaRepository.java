package cl.favorit.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import cl.favorit.model.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Long> {

}
