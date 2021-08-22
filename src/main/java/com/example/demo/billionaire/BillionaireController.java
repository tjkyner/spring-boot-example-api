package com.example.demo.billionaire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/billionaires")
public class BillionaireController {

    private final BillionaireService billionaireService;

    @Autowired
    public BillionaireController(BillionaireService billionaireService) {
        this.billionaireService = billionaireService;
    }

    @GetMapping
    public List<Billionaire> getBillionaires() {
        return billionaireService.getBillionaires();
    }
}
