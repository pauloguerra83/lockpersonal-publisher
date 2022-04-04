package br.com.lockpersonal.publisher.services;

import br.com.lockpersonal.publisher.configurations.KafkaProducerConfig;
import br.com.lockpersonal.publisher.configurations.KafkaTopicConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PersonalTopicProducer {

    @Autowired
    private KafkaProducerConfig kafkaProducerConfig;

    @Autowired
    private KafkaTopicConfig kafkaTopicConfig;

    public PersonalTopicProducer(KafkaProducerConfig kafkaProducerConfig,
                                 KafkaTopicConfig kafkaTopicConfig) {
        this.kafkaProducerConfig = kafkaProducerConfig;
        this.kafkaTopicConfig = kafkaTopicConfig;
    }

    public void send(String message){
        log.info("Payload enviado: {}", message);

        KafkaTemplate<String,String> stringTopic = kafkaProducerConfig.stringKafkaTemplate();
        stringTopic.send(kafkaTopicConfig.getTopicName(), message);
    }

}
