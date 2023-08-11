package com.example.postgreapp.controller;

import com.example.postgreapp.service.UrunService;
import com.example.postgreapp.entity.Urun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin( origins = "*" ,allowedHeaders= "*")

public class UrunController {


    private UrunService urunService;

    @GetMapping("/urun")
    public List<Urun> find (){
        return urunService.find();

    }
    @PostMapping("/urun")
    @ResponseStatus(HttpStatus.CREATED)
    public Urun create(@RequestBody Urun urun){
        return urunService.create(urun);


    }
    @PutMapping("/urun/{id}")
    public Urun update(@PathVariable Long id ,@RequestBody Map<String,Object> payLoad){
        return urunService.update(id,(int) payLoad.get("fiyat") );


    }
    @DeleteMapping("/urun/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long id){
    urunService.delete(id);

    }
}
