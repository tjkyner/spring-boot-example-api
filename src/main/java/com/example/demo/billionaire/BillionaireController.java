package com.example.demo.billionaire;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/billionaires")
public class BillionaireController {

    @GetMapping
    public List<Billionaire> getBillionaires() {
        return List.of(
                new Billionaire(
                        1L,
                        "Jeff Bezos",
                        177.0F,
                        57,
                        "United States"

                )
        );
    }
}
