package Entities.Exo1;

public class Forage extends Captage {
    private int idForage;
    private String nom;
    private int hauteur;
    private int contenance;
    private int diametre;

    public Forage(int idForage, String nom, int hauteur, int contenance, int diametre) {
        super();
        this.idForage = idForage;
        this.nom = nom;
        this.hauteur = hauteur;
        this.contenance = contenance;
        this.diametre = diametre;
    }


    public String getDescription(){
        String description= nom+" - "+hauteur+" - "+contenance+" - "+diametre;
        return  description;
    }

    public Double getVolume(int diametre,int hauteur){
        double volume= 0;
        volume= 3.14 * diametre * hauteur;
        return volume;
    }
}
