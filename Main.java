import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client(1, "jaouad");

        Commande cmd1 = new Commande(101, new Date(), 120.5, client1);
        Commande cmd2 = new Commande(102, new Date(), 89.0, client1);

        client1.ajouterCommande(cmd1);
        client1.ajouterCommande(cmd2);

        client1.afficherCommandes();
    }
}
