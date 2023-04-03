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

    public int getIdCuve() {
        return idCuve;
    }

    public void setIdCuve(int idCuve) {
        this.idCuve = idCuve;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getMetres() {
        return metres;
    }

    public void setMetres(int metres) {
        this.metres = metres;
    }

    public int getContenance() {
        return contenance;
    }

    public void setContenance(int contenance) {
        this.contenance = contenance;
    }

    public int getLongeur() {
        return longeur;
    }

    public void setLongeur(int longeur) {
        this.longeur = longeur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
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
