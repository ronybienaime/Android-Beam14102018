package com.brett.beam.models;

/**
 * Created by Rony BIEN-AIME
 * on 5/13/2018.
 */

import com.brett.beam.database.MyDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

@Table(database = MyDatabase.class)
public class Form extends BaseModel {
    @Column
    @PrimaryKey(autoincrement = true)
    private long id;

    @Column
    private int type;

    @Column
    private String nom;

    @Column
    private String prenom;

    @Column
    private String phone;

    @Column
    private String email;

    @Column
    private String web;

    @Column
    private String compagnie;

    public Form() {
    }

    //Constructeur
    public Form( String nom, String prenom, String phone, String email, String web, String compagnie){
        this.nom=nom;
        this.prenom=prenom;
        this.phone=phone;
        this.email=email;
        this.web=web;
        this.compagnie=compagnie;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getCompagnie() {
        return compagnie;
    }

    public void setCompagnie(String compagnie) {
        this.compagnie = compagnie;
    }

    @Override
    public String toString() {
        return nom + " " + prenom;
    }
}

