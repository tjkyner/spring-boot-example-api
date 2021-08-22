package com.example.demo.billionaire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

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

    @Transactional
    public void updateBillionaire(Long billionaireId, String name, Float netWorth, Integer age, String country) {
        Billionaire billionaire = billionaireRepository.findById(billionaireId).orElseThrow(
                () -> new IllegalStateException("Billionaire with ID " + billionaireId + " does not exist")
        );

        if (name != null && name.length() > 0 && !Objects.equals(billionaire.getName(), name)) {
            billionaire.setName(name);
        }

        if (netWorth != null && netWorth > 0) {
            billionaire.setNetWorth(netWorth);
        }

        if (age != null && age > 0) {
            billionaire.setAge(age);
        }

        if (country != null && country.length() > 0) {
            billionaire.setCountry(country);
        }
    }
}
