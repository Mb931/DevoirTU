package Entities.Exo1;

import java.util.ArrayList;

public class Captage
{
    private int idCaptage;
    private String nom;
    private int hauteur;
    private int debitMax;
    private Cuve cuve;

    public Captage(int idCaptage, String nom, int hauteur, int debitMax) {
        this.idCaptage = idCaptage;
        this.nom = nom;
        this.hauteur = hauteur;
        this.debitMax = debitMax;
    }

    public Captage() {
    }

    public int getIdCaptage() {
        return idCaptage;
    }

    public void setIdCaptage(int idCaptage) {
        this.idCaptage = idCaptage;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public float getDebitMax() {
        return debitMax;
    }

    public void setDebitMax(int debitMax) {
        this.debitMax = debitMax;
    }

    public Cuve getCuve() {
        return cuve;
    }

    public String getDescription(){
        String description= nom+" - "+hauteur+" - "+debitMax;
        return  description;
    }
}
