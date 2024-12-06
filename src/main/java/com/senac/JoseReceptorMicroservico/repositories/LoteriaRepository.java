package com.senac.JoseReceptorMicroservico.repositories;

import com.senac.JoseReceptorMicroservico.entities.Loteria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoteriaRepository extends JpaRepository<Loteria, Long> {
}
