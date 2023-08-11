package com.example.postgreapp.repository;


import com.example.postgreapp.entity.Urun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UrunRepository extends JpaRepository<Urun,Long> {
    List<Urun> findAllByOrderByIdAsc();

}
