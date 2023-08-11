package com.example.postgreapp.entity;

import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Entity
@Table(name = "urun")

public class Urun {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String imagefront;
    private String imageback;
    private int fiyat;

    public Urun(String name, String imagefront, String imageback, int fiyat) {
        this.name = name;
        this.imagefront = imagefront;
        this.imageback = imageback;
        this.fiyat = fiyat;
    }

    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagefront() {
        return imagefront;
    }

    public void setImagefront(String imagefront) {
        this.imagefront = imagefront;
    }

    public String getImageback() {
        return imageback;
    }

    public void setImageback(String imageback) {
        this.imageback = imageback;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }
}
