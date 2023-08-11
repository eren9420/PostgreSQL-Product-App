package com.example.postgreapp.service;

import com.example.postgreapp.entity.Urun;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UrunService {
    List<Urun> find();
    Urun create(Urun urun);
    Urun update (Long id,int fiyat);
    void delete (Long id);



}
