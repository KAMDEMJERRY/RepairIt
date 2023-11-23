package com.RepairIt.RepairIt.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;



/**
 * Toute modification sur cette classe est proscrite
 * Et doit etre signale si necessaire
*/
@Entity
@Table(name="Maintenancier")
public class Maintenancier extends User {
  

    private String Specialite;
    
    private String nom_complet;
    
    /**
     * Occupe / Libre
     * Le type de ce champs devra 
     * etre modifie par une enumeration
     */
    private Boolean status;

    private String num_compte; 

    /**
     * Champ dont l'utilite est a revoir
    */
    private String adresse; 

    private Double latitude;
    
    private double longitude;

    private String sexe;

    /**
     * La liste des Taches 
     * Proposees du maintenancier
     */
    @OneToMany
    private List<Taches> taches;















































    public double getLattitude() {
        return latitude;
    }

    public void setLattitude(double lattitude) {
        this.latitude = lattitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    
   
    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }
    public String getNom_complet() {
        return nom_complet;
    }
    public void setNom_complet(String nom_complet) {
        this.nom_complet = nom_complet;
    }
    public String getSpecialite() {
        return Specialite;
    }
    public void setSpecialite(String specialite) {
        Specialite = specialite;
    }
    public List<Taches> getTaches() {
        return taches;
    }
    public void setTaches(List<Taches> taches) {
        this.taches = taches;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public String getNum_compte() {
        return num_compte;
    }
    public void setNum_compte(String num_compte) {
        this.num_compte = num_compte;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
}
