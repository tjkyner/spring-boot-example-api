package com.example.demo.billionaire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillionaireService {

    private final BillionaireRepository billionaireRepository;

    @Autowired
    public BillionaireService(BillionaireRepository billionaireRepository) {
        this.billionaireRepository = billionaireRepository;
    }

    public List<Billionaire> getBillionaires() {
        return billionaireRepository.findAll();
    }

    public void addNewBillionaire(Billionaire billionaire) {
        System.out.println("Received information: " + billionaire);
        billionaireRepository.save(billionaire);
    }

    public void deleteBillionaire(Long billionaireId) {
        boolean exists = billionaireRepository.existsById(billionaireId);
        if (!exists) {
            throw new IllegalStateException(
                    "Billionaire with ID " + billionaireId + " does not exist");
        }
        billionaireRepository.deleteById(billionaireId);
    }
}
