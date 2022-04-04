package br.com.lockpersonal.publisher.controllers;

import br.com.lockpersonal.publisher.services.PersonalTopicProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/kafka")
public class PersonalController {

    @Autowired
    PersonalTopicProducer personalTopicProducer;

    @GetMapping(value = "/send")
    public void send(){
        personalTopicProducer.send("Mensagem de teste enviada ao tópico");
    }
}
