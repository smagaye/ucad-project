package com.ucad.developement.dao;

import com.ucad.developement.bo.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EtudiantDao extends JpaRepository<Etudiant,Integer>{

    @Override
    public List<Etudiant> findAll();

    @Override
    public <S extends Etudiant> S save(S s);

    public Optional<Etudiant> findById(Integer integer);
}
