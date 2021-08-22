package com.example.demo.billionaire;

import javax.persistence.*;

@Entity
@Table
public class Billionaire {

    @Id
    @SequenceGenerator(
            name = "billionaire_sequence",
            sequenceName = "billionaire_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "billionaire_sequence"
    )
    private Long id;
    private String name;
    private Float netWorth;
    private Integer age;
    private String country;

    public Billionaire() {
    }

    public Billionaire(Long id, String name, Float netWorth, Integer age, String country) {
        this.id = id;
        this.name = name;
        this.netWorth = netWorth;
        this.age = age;
        this.country = country;
    }

    public Billionaire(String name, Float netWorth, Integer age, String country) {
        this.name = name;
        this.netWorth = netWorth;
        this.age = age;
        this.country = country;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(Float netWorth) {
        this.netWorth = netWorth;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Billionaire{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", netWorth=" + netWorth +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}
