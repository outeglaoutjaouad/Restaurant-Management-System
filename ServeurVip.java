public class ServeurVip extends Serveur {
    private String serviceVip;
    private double pReduction;
    public ServeurVip(String serviceVip, double pReduction, int id, String nom , int nombreCommandes){
        super(id,nom , nombreCommandes);
        this.serviceVip = serviceVip;
        this.pReduction = pReduction;
    }
    public void offrirServiceVip(){
        System.out.println(getNom()+"offre:"+serviceVip);

    }

    public String getServiceVip() {
        return serviceVip;
    }

    public void setServiceVip(String serviceVip) {
        this.serviceVip = serviceVip;
    }

    public void appliquerReduction(Commande commande){
        double total = commande.calculerTotal();
        double reduction = total *(pReduction /total);
        System.out.println("Réduction :"+reduction);
        System.out.println("Nouveau montant à payer :"+(total - reduction));



    }
    public void afficherInfosVip(){
        afficherInfos();
        System.out.println("Service VIP :" +serviceVip);
        System.out.println("Réduction :" + pReduction +"%");

    }
}
