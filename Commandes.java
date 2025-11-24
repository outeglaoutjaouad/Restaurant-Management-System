import java.util.ArrayList;
import java.util.List;

public class Commandes {

    private int Idcommande;
    Client client;
    double prixTotal;
    Serveur serveur;
    List<Plats> plats = new ArrayList<>();

    public Commandes(int idcommande, Client client, double prixTotal, Serveur serveur) {
        Idcommande = idcommande;
        this.client = client;
        this.prixTotal = prixTotal;
        this.serveur = serveur;
    }

    public int getIdcommande() {
        return Idcommande;
    }

    public void setIdcommande(int idcommande) {
        Idcommande = idcommande;
    }

    public double getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(double prixTotal) {
        this.prixTotal = prixTotal;
    }

    public double calculerTotal(){

        for(Plats p: plats){
        prixTotal += p.getPrix();

        }
     return prixTotal;
    }

    public void afficherDetails(){

        System.out.println("la commande de monsieur :" + client.getNom() + ".");

         System.out.println("vous avez commander : ");



        for(Plats p: plats){

        System.out.println("-" + p.getNom() + ":" + p.getPrix());
        System.out.println("le prix total de votre commande est :" + calculerTotal() + "MAD");
        }
        System.out.println("cette commande est assignée au serveur :" + serveur.getNom());


     }
}
