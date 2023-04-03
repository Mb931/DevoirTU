package Entities.Exo1;

public class Cuve extends Captage {
    private int idCuve;
    private String nom;
    private int metres;
    private int contenance;
    private int longeur;
    private int largeur;

    public Cuve(int idCuve, String nom, int metres, int contenance, int longeur, int largeur) {
        this.idCuve = idCuve;
        this.nom = nom;
        this.metres = metres;
        this.contenance = contenance;
        this.longeur = longeur;
        this.largeur = largeur;
    }

    public String getDescription(){
        String description= nom+" - "+metres+" - "+contenance+" - "+longeur+" - "+largeur;
        return  description;
    }

    public Double getVolume(int longeur,int largeur){
        double volume= 0;
        volume= longeur*largeur;
        return volume;
    }
}
