package com.ucad.developement.bo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Classe {
    private int idclasse;
    private String niveau;
    private String departement;
    private String faculte;

    @Id
    @Column(name = "idclasse")
    public int getIdclasse() {
        return idclasse;
    }

    public void setIdclasse(int idclasse) {
        this.idclasse = idclasse;
    }

    @Basic
    @Column(name = "niveau")
    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    @Basic
    @Column(name = "departement")
    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    @Basic
    @Column(name = "faculte")
    public String getFaculte() {
        return faculte;
    }

    public void setFaculte(String faculte) {
        this.faculte = faculte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Classe classe = (Classe) o;

        if (idclasse != classe.idclasse) return false;
        if (niveau != null ? !niveau.equals(classe.niveau) : classe.niveau != null) return false;
        if (departement != null ? !departement.equals(classe.departement) : classe.departement != null) return false;
        if (faculte != null ? !faculte.equals(classe.faculte) : classe.faculte != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idclasse;
        result = 31 * result + (niveau != null ? niveau.hashCode() : 0);
        result = 31 * result + (departement != null ? departement.hashCode() : 0);
        result = 31 * result + (faculte != null ? faculte.hashCode() : 0);
        return result;
    }
}
