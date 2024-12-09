package com.senac.JoseReceptorMicroservico.service;

import com.senac.JoseReceptorMicroservico.entities.Loteria;
import com.senac.JoseReceptorMicroservico.repositories.LoteriaRepository;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class LoteriaService {

    private final LoteriaRepository loteriaRepository;

    public LoteriaService(LoteriaRepository loteriaRepository) {
        this.loteriaRepository = loteriaRepository;
    }

    @RabbitListener(queues = "fila-ecommerce")
    public void subscribe(Loteria loteria) {
        Loteria novaLoteria = new Loteria(loteria.getNome());
        loteriaRepository.save(novaLoteria);
    }
}
