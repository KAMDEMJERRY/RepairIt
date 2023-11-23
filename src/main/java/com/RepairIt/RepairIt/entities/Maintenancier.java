package com.app.FixIt.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name="Maintenancier")
public class Maintenancier extends User {
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // private Long idM;
    
    //private byte[] cv;
    private String Specialite;
    @OneToMany
    private List<Taches> taches;
    private String nom_complet;
    private Boolean status;
    private String num_compte; 
    private String adresse; 
    private double lattitude;
    
    private double longitude;
    private String sexe;

    public double getLattitude() {
        return lattitude;
    }
    public void setLattitude(double lattitude) {
        this.lattitude = lattitude;
    }
    public double getLongitude() {
        return longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    
   
   /*  public byte[] getCv() {
        return cv;
    }
    public void setCv(byte[] cv) {
        this.cv = cv;
    }*/
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
