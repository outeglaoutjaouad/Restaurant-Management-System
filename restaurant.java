import java.util.*;


public class restaurant {
    private String name;
    private String address;

    restaurant(String namre, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void affListeDesPlatsDisponibles() {
        boolean comp = true;
        System.out.println("menu :");
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== MENU DU RESTAURANT ===");
        System.out.println("1. Pizza Margherita ");
        System.out.println("2. Burger Classic");
        System.out.println("3. Salade César");
        System.out.println("4. Tiramisu");
        System.out.println("5. plat Speciel ");
        System.out.println("6. Quitte");
        System.out.println("===========================");

        while (comp == true) {
            System.out.print("Choisissez un plat (1-6) : ");

            int choix = scanner.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("Vous avez choisi : Pizza Margherita" + " ==> 40 MAD");
                    System.out.println("----MERCI POUR LA COMMANDE ------");

                    break;
                case 2:
                    System.out.println("Vous avez choisi : Burger Classic" + " ==> 50 MAD");
                    System.out.println("----MERCI POUR LA COMMANDE ------");

                    break;
                case 3:
                    System.out.println("Vous avez choisi : Salade César" + " ==> 25 MAD");
                    System.out.println("----MERCI POUR LA COMMANDE ------");

                    break;
                case 4:
                    System.out.println("Vous avez choisi : Tiramisu" + " ==> 35 MAD");
                    System.out.println("----MERCI POUR LA COMMANDE ------");

                    break;
                case 5:
                    System.out.println("Vous avez choisi " + "plat Speciel ==>" + "couscous");
                    System.out.println("le prix ex 160 MAD    ");
                    break;
                case 6:
                    System.out.println("Merci ! À bientôt.");
                    comp = false;
                    break; default:
                    System.out.println("Choix n'a trouver pas merci :");
                    System.out.print("----EST MERCI ------");

            }
        }



    }

}
