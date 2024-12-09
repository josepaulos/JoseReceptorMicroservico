package com.senac.JoseReceptorMicroservico.repositories;

import com.senac.JoseReceptorMicroservico.entities.Bilhete;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BilheteRepository extends JpaRepository<Bilhete,Long> {
}
