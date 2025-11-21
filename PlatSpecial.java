public class PlatSpecial extends Plats{
    private String platdujour;
    public PlatSpecial(String nom,double prix, String platdujour){
        super(nom,prix);
        this.platdujour = platdujour;
    }

    public String getPlatdujour() {
        return platdujour;
    }

    public void setPlatdujour(String platdujour) {
        this.platdujour = platdujour;
    }
    @Override
    public void affichage(){
        System.out.println("=========le plat special aujourdhuir ========= \n"+platdujour+"\n  le nom de plat du jour : "+getNom()+" ,prix "+getPrix()+"DH");
    }
}
