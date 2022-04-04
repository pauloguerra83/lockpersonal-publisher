package br.com.lockpersonal.publisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class LockpersonalPubApplication {

	public static void main(String[] args) {
		SpringApplication.run(LockpersonalPubApplication.class, args);
	}

}
