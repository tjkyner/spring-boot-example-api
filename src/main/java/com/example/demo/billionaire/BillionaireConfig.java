package com.example.demo.billionaire;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BillionaireConfig {

    @Bean
    CommandLineRunner commandLineRunner(BillionaireRepository repository) {
        return args -> {

            Billionaire jeffBezos = new Billionaire(
                    "Jeff Bezos",
                    177.0F,
                    57,
                    "United States"
            );

            Billionaire elonMusk = new Billionaire(
                    "Elon Musk",
                    151.0F,
                    49,
                    "United States"
            );

            repository.saveAll(List.of(jeffBezos, elonMusk));

        };
    }
}
