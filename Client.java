import java.util.ArrayList;
import java.util.List;

public class Client {
    private int id;
    private String nom;
    private List<Commandes> commandes;

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

    public List<Commandes> getCommandes() {
        return commandes;
    }

    public void ajouterCommande(Commandes commande) {
        commandes.add(commande);
    }

    public void afficherCommandes() {
        System.out.println("Commandes de " + nom + " :");
        for (Commandes c : commandes) {
            System.out.println("- Commande id: " + c.getIdcommande() + ", Total: " + c.getIdcommande());
        }

    }
}
