package mx.com.balanceneural.services.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.com.balanceneural.services.entity.Ficha;


public interface FichaRepository extends JpaRepository<Ficha,Long> {

}
