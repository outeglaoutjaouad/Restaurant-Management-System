//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Plats plats = new Plats("salade",120);
        PlatSpecial platSpecial= new PlatSpecial("couscous poulet",220,"couscous");
        plats.affichage();
        platSpecial.affichage();

    }
}