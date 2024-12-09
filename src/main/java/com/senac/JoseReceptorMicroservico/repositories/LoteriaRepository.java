package com.senac.JoseReceptorMicroservico.repositories;
import com.senac.JoseReceptorMicroservico.entities.Loteria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoteriaRepository extends JpaRepository<Loteria,Long> {
}
