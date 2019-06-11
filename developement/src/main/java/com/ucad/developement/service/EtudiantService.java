package com.ucad.developement.service;

import com.ucad.developement.bo.Etudiant;
import com.ucad.developement.dao.EtudiantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantService {

    @Autowired
    private EtudiantDao etudiantDao;

    public List<Etudiant> listeEtudiant(){
        return etudiantDao.findAll();
    }

    public boolean ajout (Etudiant etudiant){
        return etudiantDao.save(etudiant) != null;
    }
}
