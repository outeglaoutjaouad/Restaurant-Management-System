import java.util.Date;
public class Commande {
    private int id;
    private Date date;
    private double total;
    private Client client;

    public Commande(int id, Date date, double total, Client client) {
        this.id = id;
        this.date = date;
        this.total = total;
        this.client = client;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public double getTotal() {
        return total;
    }

    public Client getClient() {
        return client;
    }
}
