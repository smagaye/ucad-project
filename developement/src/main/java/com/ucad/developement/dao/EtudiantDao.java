package com.ucad.developement.dao;

import com.ucad.developement.bo.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantDao extends JpaRepository<Etudiant,Integer>{

    @Override
    public List<Etudiant> findAll();

    @Override
    public <S extends Etudiant> S save(S s);
}
