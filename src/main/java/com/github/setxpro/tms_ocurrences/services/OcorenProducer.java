package com.github.setxpro.tms_ocurrences.services;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.github.setxpro.tms_ocurrences.domain.core.entities.Ocoren;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OcorenProducer {
    private KafkaTemplate<String, Object> kafkaTemplate;

    private static final Logger logger = LoggerFactory.getLogger(OcorenProducer.class);

    public OcorenProducer(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendOcoren(Ocoren ocoren) {
        try {
            kafkaTemplate.send("topics.sla.request.topic", ocoren);
            logger.info("Mensagem enviada com sucesso: {}", ocoren);
        } catch (Exception e) {
            logger.error("Erro ao enviar mensagem para o Kafka", e);
        }
    }
}
