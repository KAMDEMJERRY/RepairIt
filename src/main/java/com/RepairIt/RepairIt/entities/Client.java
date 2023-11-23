package com.RepairIt.RepairIt.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


/**
 * Toute modification sur cette classe est proscrite
 * Et doit etre signale si necessaire
*/
@Entity
@Table(name="Client")
public class Client extends User{
   

 
    private String num_compte;


    public Client(String num_compte, String username, String password, String email,Integer telephone){
        super(username, password, email, telephone);
        this.num_compte = num_compte;
    }

    public String getNum_compte() {
        return num_compte;
    }

    public void setNum_compte(String num_compte) {
        this.num_compte = num_compte;
    } 
   
}
