package com.ucad.developement.bo;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Etudiant {
    private int idetudiant;
    private String nce;
    private String prenom;
    private String nom;
    private Date dateNaissance;
    private Integer idclasse;

    @Id
    @Column(name = "idetudiant")
    public int getIdetudiant() {
        return idetudiant;
    }

    public void setIdetudiant(int idetudiant) {
        this.idetudiant = idetudiant;
    }

    @Basic
    @Column(name = "nce")
    public String getNce() {
        return nce;
    }

    public void setNce(String nce) {
        this.nce = nce;
    }

    @Basic
    @Column(name = "prenom")
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Basic
    @Column(name = "nom")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "date_naissance")
    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Etudiant etudiant = (Etudiant) o;

        if (idetudiant != etudiant.idetudiant) return false;
        if (nce != null ? !nce.equals(etudiant.nce) : etudiant.nce != null) return false;
        if (prenom != null ? !prenom.equals(etudiant.prenom) : etudiant.prenom != null) return false;
        if (nom != null ? !nom.equals(etudiant.nom) : etudiant.nom != null) return false;
        if (dateNaissance != null ? !dateNaissance.equals(etudiant.dateNaissance) : etudiant.dateNaissance != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idetudiant;
        result = 31 * result + (nce != null ? nce.hashCode() : 0);
        result = 31 * result + (prenom != null ? prenom.hashCode() : 0);
        result = 31 * result + (nom != null ? nom.hashCode() : 0);
        result = 31 * result + (dateNaissance != null ? dateNaissance.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "idclasse")
    public Integer getIdclasse() {
        return idclasse;
    }

    public void setIdclasse(Integer idclasse) {
        this.idclasse = idclasse;
    }
}
