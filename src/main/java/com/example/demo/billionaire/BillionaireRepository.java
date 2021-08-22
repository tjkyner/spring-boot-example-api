package com.example.demo.billionaire;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillionaireRepository extends JpaRepository<Billionaire, Long> {}
