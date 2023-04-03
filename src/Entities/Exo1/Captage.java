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

    public String getDescription(){
        String description= nom+" - "+hauteur+" - "+debitMax;
        return  description;
    }

}
