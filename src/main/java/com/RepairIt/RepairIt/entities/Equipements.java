package com.RepairIt.RepairIt.entities;

import jakarta.persistence.*;


/**
 * Toute modification sur cette classe est proscrite
 * Et doit etre signale si necessaire
*/
@Entity
@Table(name="Equipement")
public class Equipements { 

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private Byte[] photo;

    /**
     * 0-gate | 1-en_cours_de_reparation | 2-repare
     */
    private Integer etats;

    private Type type;

    /**
     * Le client a qui l'equipement appartient
     */
    @ManyToOne
    @JoinColumn(name="IdClient")
    private Client client;


















    
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    } 

    public Byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(Byte[] photo) {
        this.photo = photo;
    }

    public Integer getEtats(){
        return etats;
    }

    public void setEtats(Integer etats){
         this.etats = etats;
    }
   
}
