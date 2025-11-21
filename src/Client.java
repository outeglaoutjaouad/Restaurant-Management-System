import java.util.ArrayList;
import java.util.List;

public class Client {
    private int id;
    private String nom;
    private List<Commande> commandes;

    public Client(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.commandes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void ajouterCommande(Commande commande) {
        commandes.add(commande);
    }

    public void afficherCommandes() {
        System.out.println("Commandes de " + nom + " :");
        for (Commande c : commandes) {
            System.out.println("- Commande ID: " + c.getId() + ", Total: " + c.getTotal());
        }
    }
}
