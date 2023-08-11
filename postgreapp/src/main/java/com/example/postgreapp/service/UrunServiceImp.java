package com.example.postgreapp.service;

import com.example.postgreapp.entity.Urun;
import com.example.postgreapp.repository.UrunRepository;
import com.example.postgreapp.service.UrunService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UrunServiceImp implements UrunService {


    @Autowired
    private UrunRepository urunRepository;


    @Override
    public List<Urun> find() {
        return urunRepository.findAllByOrderByIdAsc();
    }

    @Override
    public Urun create(Urun urun) {
        return urunRepository.save(urun);
    }

    @Override
    public Urun update(Long id, int fiyat) {
        return urunRepository.findById(id).map(existingUrun -> {
            existingUrun.setFiyat(fiyat);
            return urunRepository.save(existingUrun);
        })
                .orElse(null);

    }

    @Override
    public void delete(Long id) {
        urunRepository.deleteById(id);


    }
}
