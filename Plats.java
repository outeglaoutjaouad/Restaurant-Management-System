import java.util.ArrayList;

public class Plats {
    private String nom;
    private double prix;
    public Plats(String nom,double prix){
        this.nom = nom;
        this.prix = prix;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    public void affichage(){
        System.out.println("le plat : "+nom+" prix : "+prix+"DH");
    }
}
