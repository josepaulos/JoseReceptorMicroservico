package com.senac.JoseReceptorMicroservico.service;

import com.senac.JoseReceptorMicroservico.entities.Bilhete;
import com.senac.JoseReceptorMicroservico.repositories.BilheteRepository;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service

public class BilheteService {

    private final BilheteRepository bilheteRepository;

    public BilheteService(BilheteRepository bilheteRepository) {
        this.bilheteRepository = bilheteRepository;
    }

    @RabbitListener(queues = "fila-ecommerce")
    public void subscribe(Bilhete bilhete) {
        Bilhete novoBilhete = new Bilhete(bilhete.getNumero(), bilhete.getLoteria());
        bilheteRepository.save(novoBilhete);
    }
}

