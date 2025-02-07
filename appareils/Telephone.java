package appareils;

import java.util.Vector;

/**
 * Classe representant un telephone, qui est un type d'Appareil.
 * Il peut stocker des contacts et passer des appels.
 */
public class Telephone extends Appareil {

    /** Liste des contacts enregistres sous forme de numeros de telephone. */
    private Vector<String> contacts = new Vector<>();

    /**
     * Constructeur du telephone.
     *
     * @param id         Identifiant unique du telephone.
     * @param nom        Nom du telephone.
     * @param prixDeBase Prix de base du telephone.
     */
    public Telephone(Integer id, String nom, Integer prixDeBase) {
        super(id, nom, prixDeBase, Categorie.TELEPHONE);
    }

    /**
     * Active le telephone en l'allumant.
     */
    @Override
    public void activer() {
        System.out.println("Telephone allume");
    }

    /**
     * Retourne une description du telephone.
     *
     * @return Une chaine de caracteres decrivant le telephone.
     */
    @Override
    public String getDescription() {
        return "Voici le telephone : " + getNom();
    }

    /**
     * Calcule et retourne le prix final du telephone apres une majoration de 20%.
     *
     * @return Le prix final avec la majoration.
     */
    @Override
    public double getPrixFinal() {
        return prixDeBase * 1.20;
    }

    /**
     * Ajoute un contact si le numero est valide (10 chiffres uniquement).
     *
     * @param contact Numero de telephone a ajouter.
     * @return 0 si le contact a ete ajoute, 1 si la longueur est incorrecte, 2 si un caractere invalide est detecte.
     */
    public int ajouterContact(String contact) {
        if (contact.length() == 10) {
            for (char numero : contact.toCharArray()) {
                if (!Character.isDigit(numero)) { // Correction : Verification que tous les caracteres sont des chiffres
                    return 2;
                }
            }
            contacts.add(contact);
            return 0;
        }
        return 1; // Numero invalide
    }

    /**
     * Affiche tous les contacts enregistres avec leur position dans la liste.
     */
    public void afficherContacts() {
        int index = 1;
        for (String contact : contacts) {
            System.out.println(index + ") " + contact);
            index++;
        }
    }

    /**
     * Effectue un appel vers un contact en fonction de son identifiant dans la liste.
     *
     * @param id Position du contact dans la liste (1-based index).
     */
    public void appel(int id) {
        try {
            System.out.println("Appel en cours : " + contacts.get(id - 1)); // Correction : Gestion des erreurs avec try-catch
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Erreur : Contact introuvable. Verifiez l'ID fourni.");
        }
    }
}
