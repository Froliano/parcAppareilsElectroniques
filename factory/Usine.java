package factory;

import appareils.Appareil;
import appareils.OrdinateurPortable;
import appareils.Telephone;
import appareils.ordinateur.*;
import appareils.ordinateur.decorateur.CarteBluetooth;
import appareils.ordinateur.decorateur.CarteReseau;
import inventory.Inventaire;

import java.util.Scanner;

/**
 * Classe Usine qui permet de creer des appareils (telephones, ordinateurs).
 * Cette classe utilise un scanner pour demander des entrees a l'utilisateur
 * et creer des objets de type Appareil (Telephone, OrdinateurPortable, Apple, Asus).
 */
public class Usine {

    /** Scanner pour lire les entrees utilisateur. */
    private Scanner scan = new Scanner(System.in);

    /** Constructeur de la classe Usine. */
    public Usine() {}

    /**
     * Methode qui permet de creer un appareil en fonction du choix de l'utilisateur.
     * Selon le choix, un appareil spécifique (telephone, ordinateur, etc.) est cree.
     *
     * @param choix Choix de l'utilisateur pour le type d'appareil a creer.
     */
    public void creerAppareil(int choix) {
        switch (choix) {
            case 1:
                creerTelephone();
                return;

            case 2:
                creerOrdinateurPortable();
                return;

            case 3:
                creerApple();
                return;

            case 4:
                creerAsus();
                return;

            default:
                System.out.println("Choix invalide.");
                return;
        }
    }

    /**
     * Methode permettant de creer un ordinateur Asus.
     * Elle demande a l'utilisateur des informations comme le nom, le prix,
     * puis permet de choisir un processeur, une carte graphique, et d'ajouter
     * des cartes additionnelles comme une carte reseau ou bluetooth.
     */
    private void creerAsus() {
        try {
            System.out.println("Quel est le nom du pc asus ?");
            String nom = scan.nextLine();
            System.out.println("Quel est le prix ?");
            Integer prix = scan.nextInt();
            scan.nextLine(); // Pour consommer la nouvelle ligne après un nextInt()

            CarteGraphique carteGraphique = choisirCarteGraphique();
            Processeur processeur = choisirProcesseur();

            OrdinateurModifiable asus = new Asus(Inventaire.getInstance().getId(), nom, prix, processeur, carteGraphique);

            System.out.println("Ajouter une carte reseau ?");
            boolean carteReseau = scan.nextBoolean();
            if (carteReseau) {
                asus = new CarteReseau(asus);
            }

            System.out.println("Ajouter une carte bluetooth ?");
            boolean carteBluetooth = scan.nextBoolean();
            if (carteBluetooth) {
                asus = new CarteBluetooth(asus);
            }

            Inventaire.getInstance().ajouterAppareil(asus);
        } catch (Exception e) {
            System.out.println("Erreur lors de la creation de l'ordinateur Asus: " + e.getMessage());
            scan.nextLine();  // Consommer le reste de la ligne pour éviter de bloquer l'entrée suivante
        }
    }

    /**
     * Methode permettant de creer un telephone.
     * Elle demande le nom et le prix du telephone, puis l'ajoute a l'inventaire.
     */
    private void creerTelephone() {
        try {
            System.out.println("Quel est le nom du telephone ?");
            String nom = scan.nextLine();
            System.out.println("Quel est le prix ?");
            Integer prix = scan.nextInt();
            scan.nextLine();  // Consommer la nouvelle ligne après un nextInt()

            Inventaire.getInstance().ajouterAppareil(new Telephone(Inventaire.getInstance().getId(), nom, prix));
        } catch (Exception e) {
            System.out.println("Erreur lors de la creation du telephone: " + e.getMessage());
            scan.nextLine();  // Consommer le reste de la ligne pour éviter de bloquer l'entrée suivante
        }
    }

    /**
     * Methode permettant de creer un ordinateur portable.
     * Elle demande le nom, le prix et la taille de l'ordinateur portable.
     */
    private void creerOrdinateurPortable() {
        try {
            System.out.println("Quel est le nom de l'ordinateur portable ?");
            String nom = scan.nextLine();
            System.out.println("Quel est le prix ?");
            Integer prix = scan.nextInt();
            scan.nextLine(); // Consommer la nouvelle ligne après un nextInt()

            System.out.println("Quel est la taille ?");
            float taille = scan.nextFloat();
            scan.nextLine(); // Consommer la nouvelle ligne après un nextFloat()

            Inventaire.getInstance().ajouterAppareil(new OrdinateurPortable(Inventaire.getInstance().getId(), nom, prix, taille));
        } catch (Exception e) {
            System.out.println("Erreur lors de la creation de l'ordinateur portable: " + e.getMessage());
            scan.nextLine();  // Consommer le reste de la ligne pour éviter de bloquer l'entrée suivante
        }
    }

    /**
     * Methode permettant de creer un ordinateur Apple.
     * Elle demande des informations comme le nom, le prix, le processeur,
     * et la carte graphique, puis ajoute l'ordinateur a l'inventaire.
     */
    private void creerApple() {
        try {
            System.out.println("Quel est le nom du mac ?");
            String nom = scan.nextLine();
            System.out.println("Quel est le prix ?");
            Integer prix = scan.nextInt();
            scan.nextLine(); // Consommer la nouvelle ligne après un nextInt()

            CarteGraphique carteGraphique = choisirCarteGraphique();
            Processeur processeur = choisirProcesseur();

            Inventaire.getInstance().ajouterAppareil(new Apple(Inventaire.getInstance().getId(), nom, prix, processeur, carteGraphique));
        } catch (Exception e) {
            System.out.println("Erreur lors de la creation du Mac: " + e.getMessage());
            scan.nextLine();  // Consommer le reste de la ligne pour éviter de bloquer l'entrée suivante
        }
    }

    /**
     * Methode permettant de choisir une carte graphique parmi les options disponibles.
     * Cette methode affiche les options disponibles et demande a l'utilisateur de choisir.
     *
     * @return La carte graphique choisie par l'utilisateur.
     */
    private CarteGraphique choisirCarteGraphique() {
        try {
            int index = 1;
            for (CarteGraphique carteGraphique : CarteGraphique.values()) {
                System.out.println(index + ") " + carteGraphique);
                index += 1;
            }
            System.out.println("Quel est la carte graphique ?");
            int id = scan.nextInt();
            scan.nextLine();  // Consommer la nouvelle ligne après un nextInt()
            switch (id) {
                case 1:
                    return CarteGraphique.RTX4060;
                case 2:
                    return CarteGraphique.RTX4070;
                case 3:
                    return CarteGraphique.RTX4080;
                case 4:
                    return CarteGraphique.RTX4090;
                default:
                    return null;
            }
        } catch (Exception e) {
            System.out.println("Erreur lors du choix de la carte graphique: " + e.getMessage());
            scan.nextLine();  // Consommer la nouvelle ligne après une exception
            return null;
        }
    }

    /**
     * Methode permettant de choisir un processeur parmi les options disponibles.
     * Cette methode affiche les options disponibles et demande a l'utilisateur de choisir.
     *
     * @return Le processeur choisi par l'utilisateur.
     */
    private Processeur choisirProcesseur() {
        try {
            int index = 1;
            for (Processeur processeur : Processeur.values()) {
                System.out.println(index + ") " + processeur);
                index += 1;
            }
            System.out.println("Quel est le processeur ?");
            int id = scan.nextInt();
            scan.nextLine();  // Consommer la nouvelle ligne après un nextInt()
            switch (id) {
                case 1:
                    return Processeur.I3_13100;
                case 2:
                    return Processeur.I5_13400;
                case 3:
                    return Processeur.I7_13700;
                case 4:
                    return Processeur.I9_13900;
                default:
                    return null;
            }
        } catch (Exception e) {
            System.out.println("Erreur lors du choix du processeur: " + e.getMessage());
            scan.nextLine();  // Consommer la nouvelle ligne après une exception
            return null;
        }
    }
}
