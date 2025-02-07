import factory.Usine;
import inventory.Inventaire;

import java.util.Scanner;

public class Main
{

    Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
       Usine usine = new Usine();

       usine.creerAppareil(1);
       usine.creerAppareil(2);
       usine.creerAppareil(3);
       usine.creerAppareil(4);

       Inventaire.getInstance().afficherAppareils();

    }

    private void faireLeChoix(Usine usine)
    {
        int choix = 0;
        while (choix != 9)
        {
            System.out.println("1) creer un telephone");
            System.out.println("2) creer un ordinateur portable");
            System.out.println("3) creer un mac");
            System.out.println("4) creer un ordinateur asus");
            System.out.println("5) afficher les appareils");
            System.out.println("6) agir sur 1 appareil");
            System.out.println("9) quitter");
            choix = scan.nextInt();
            scan.nextLine();

            switch (choix)
            {
                case 1:
                case 2:
                case 3:
                case 4:
                    usine.creerAppareil(choix);
                    break;

                case 5:
                    Inventaire.getInstance().afficherAppareils();
                    break;

                case 6:
                    agirSurAppareil();
                    break;

                case 9:
                    break;

                default:
                    System.out.println("entree invalide");
            }
        }
    }

    private void agirSurAppareil()
    {
        System.out.println("quel est l'index de l'element sur lequel tu veux agir");
        System.out.println("0) quitter");
        choix = scan.nextInt();
        scan.nextLine();
    }
}