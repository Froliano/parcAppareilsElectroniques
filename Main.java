import appareils.Appareil;
import appareils.Telephone;
import appareils.ordinateur.CarteGraphique;
import appareils.ordinateur.OrdinateurModifiable;
import appareils.ordinateur.Processeur;
import factory.Usine;
import inventory.Inventaire;

import java.util.Scanner;

public class Main
{

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
       Usine usine = new Usine();

       faireLeChoix(usine);

    }

    private static void faireLeChoix(Usine usine)
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

    private static void agirSurAppareil()
    {
        int choix = -1;
        Appareil appareil;

        System.out.println("quel est l'index de l'element sur lequel tu veux agir");
        choix = scan.nextInt();
        scan.nextLine();

        appareil = Inventaire.getInstance().getAppareil(choix);

        while (choix != 9)
        {
            System.out.println("1) activer");
            System.out.println("2) afficher la description");
            System.out.println("3) afficher le prix");
            if (appareil instanceof Telephone)
            {
                System.out.println("4) ajouter un contact");
                System.out.println("5) afficher tout les contacts");
                System.out.println("6) appeler un contact");
            } else if (appareil instanceof OrdinateurModifiable)
            {
                System.out.println("4) changer la carte graphique");
                System.out.println("5) changer le processeur");
            }
            System.out.println("9) quitter");
            choix = scan.nextInt();
            scan.nextLine();

            switch (choix)
            {
                case 1:
                    appareil.activer();
                    break;
                case 2:
                    appareil.getDescription();
                    break;
                case 3:
                    appareil.getPrixFinal();
                    break;
                case 4:
                    if (appareil instanceof Telephone)
                    {
                        ajouterContact(((Telephone) appareil));
                    } else if (appareil instanceof OrdinateurModifiable)
                    {
                        changerCarteGraphique(((OrdinateurModifiable) appareil));
                    }
                    break;

                case 5:
                    if (appareil instanceof Telephone)
                    {
                        ((Telephone) appareil).afficherContacts();
                    } else if (appareil instanceof OrdinateurModifiable)
                    {
                        changerProcesseur(((OrdinateurModifiable) appareil));
                    }
                    break;

                case 6:
                    if (appareil instanceof Telephone)
                    {
                        appellerContact(((Telephone) appareil));
                    }
                    break;

                case 9:
                    break;

                default:
                    System.out.println("entree invalide");
            }
        }
    }

    private static void appellerContact(Telephone appareil)
    {
        System.out.println("Quel est le contact ?");
        int index = scan.nextInt();
        scan.nextLine();
        appareil.appel(index);
    }

    private static void ajouterContact(Telephone appareil)
    {
        System.out.println("Quel est le numero (ex:0610101010) ?");
        String numero = scan.nextLine();
        appareil.ajouterContact(numero);
    }


    private static void changerProcesseur(OrdinateurModifiable appareil)
    {
        int index = 1;
        for (Processeur processeur : Processeur.values()) {
            System.out.println(index + ") " + processeur);
            index += 1;
        }

        System.out.println("Quel est le processeur ?");
        int id = scan.nextInt();
        scan.nextLine();
        switch (id) {
            case 1:
                appareil.setProcesseur(Processeur.I3_13100);
            case 2:
                appareil.setProcesseur(Processeur.I5_13400);
            case 3:
                appareil.setProcesseur(Processeur.I7_13700);
            case 4:
                appareil.setProcesseur(Processeur.I9_13900);
            default:
                return;
        }
    }

    private static void changerCarteGraphique(OrdinateurModifiable appareil) {
        int index = 1;
        for (CarteGraphique carteGraphique : CarteGraphique.values()) {
            System.out.println(index + ") " + carteGraphique);
            index += 1;
        }

        System.out.println("Quel est la carte graphique ?");
        int id = scan.nextInt();
        scan.nextLine();
        switch (id) {
            case 1:
                appareil.setCarteGraphique(CarteGraphique.RTX4060);
            case 2:
                appareil.setCarteGraphique(CarteGraphique.RTX4070);
            case 3:
                appareil.setCarteGraphique(CarteGraphique.RTX4080);
            case 4:
                appareil.setCarteGraphique(CarteGraphique.RTX4090);
            default:
                return;
        }
    }
}