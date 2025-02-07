package inventory;

import appareils.Appareil;

import java.util.Vector;

/**
 * Classe Inventaire qui gère l'ajout, l'affichage et la récupération d'appareils.
 * Elle utilise le pattern Singleton pour garantir qu'il n'y ait qu'une seule instance de l'inventaire.
 */
public class Inventaire {

    /** Instance unique de la classe Inventaire. */
    private static Inventaire instance;

    /** Liste des appareils stockés dans l'inventaire. */
    private Vector<Appareil> appareils = new Vector<>();

    /** Compteur pour générer un identifiant unique pour chaque appareil ajouté. */
    private Integer id = 0;

    /**
     * Retourne l'identifiant unique suivant.
     * Chaque fois qu'un nouvel appareil est ajouté, l'identifiant est incrémenté.
     *
     * @return Un identifiant unique.
     */
    public Integer getId() {
        id += 1;
        return id;
    }

    /** Constructeur privé pour implémenter le pattern Singleton. */
    private Inventaire() {}

    /**
     * Retourne l'instance unique de la classe Inventaire.
     * Si l'instance n'existe pas encore, elle est créée.
     *
     * @return L'instance unique de l'inventaire.
     */
    public static Inventaire getInstance() {
        if (instance == null) { // Vérification avant de synchroniser
            instance = new Inventaire();
        }
        return instance;
    }

    /**
     * Ajoute un appareil à l'inventaire.
     *
     * @param appareil L'appareil à ajouter à l'inventaire.
     */
    public void ajouterAppareil(Appareil appareil) {
        appareils.add(appareil);
    }

    /**
     * Affiche tous les appareils présents dans l'inventaire.
     * Pour chaque appareil, son index, sa description et son prix final sont affichés.
     */
    public void afficherAppareils() {
        for (int i = 1; i <= appareils.size(); i++) {
            System.out.println(i + ")");
            System.out.println(appareils.get(i - 1).getDescription());
            System.out.println("Le prix est de : " + appareils.get(i - 1).getPrixFinal() + "€");
            System.out.println();
        }
    }

    /**
     * Récupère un appareil par son index dans l'inventaire.
     *
     * @param index L'index de l'appareil à récupérer (1-indexé).
     * @return L'appareil correspondant à l'index.
     * @throws IndexOutOfBoundsException Si l'index est hors des limites de la liste des appareils.
     */
    public Appareil getAppareil(int index) {
        if (index < 1 || index > appareils.size()) {
            throw new IndexOutOfBoundsException("L'index est hors des limites de l'inventaire.");
        }
        return appareils.get(index - 1);
    }
}
