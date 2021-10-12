package cl.favorit.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.favorit.persona.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
