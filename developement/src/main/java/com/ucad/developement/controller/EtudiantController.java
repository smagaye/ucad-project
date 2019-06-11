package com.ucad.developement.controller;

import com.ucad.developement.bo.Etudiant;
import com.ucad.developement.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RepositoryRestController
public class EtudiantController {
    @Autowired
    private EtudiantService etudiantService;

    @RequestMapping(value = "/etudiants",method = RequestMethod.GET)
    public List<Etudiant> etudiants(){
        return etudiantService.listeEtudiant();
    }

    @PostMapping(path = "/admin/etudiant/ajout")
    private ResponseEntity addUser(@RequestBody Etudiant etudiant) {
        boolean added = etudiantService.ajout(etudiant);
        if(added){
            return new ResponseEntity(HttpStatus.OK);
        }else
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
