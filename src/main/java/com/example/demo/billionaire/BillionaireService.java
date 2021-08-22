package com.example.demo.billionaire;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillionaireService {

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
