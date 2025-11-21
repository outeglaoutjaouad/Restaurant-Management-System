public class Serveur {
    private int id;
    private String nom;
    private int nombreCommandes;
     public Serveur(int id, String nom , int nombreCommandes){
         this.id = id;
         this.nom = nom;
         this.nombreCommandes = nombreCommandes;


    }
    public String getNom(){
         return nom;

    }
    public void setNom(String nom){
        this.nom = nom;


    }
    public int getId(){
         return id;
    }
    public void setId(int id){
         this.id = id;
    }

    public int getNombreCommandes() {
        return nombreCommandes;
    }

    public void setNombreCommandes(int nombreCommandes) {
        this.nombreCommandes = nombreCommandes;
    }

    public void prendreCommande(){
        System.out.println(nom+ "prend nouvelle commande");
        incrementerNombresCommandes();

    }
    public void incrementerNombresCommandes(){
        this.nombreCommandes++;

    }
    public void afficherInfos(){

        System.out.println("id de serveur est :"+getId());
        System.out.println("le nom  de serveur est :"+getNom());
        System.out.println("le nombre  de  commandes du serveur est :"+getNombreCommandes());

    }
}
