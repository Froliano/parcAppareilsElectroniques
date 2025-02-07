package appareils.ordinateur;

/**
 * Enumeration representant les differents modeles de processeurs disponibles.
 * Chaque processeur a un prix supplementaire associe.
 */
public enum Processeur {

    /** Processeur Intel Core i3-13100 avec un cout supplementaire de 10. */
    I3_13100(10),

    /** Processeur Intel Core i5-13400 avec un cout supplementaire de 20. */
    I5_13400(20),

    /** Processeur Intel Core i7-13700 avec un cout supplementaire de 40. */
    I7_13700(40),

    /** Processeur Intel Core i9-13900 avec un cout supplementaire de 50. */
    I9_13900(50);

    /** Prix supplementaire du processeur en fonction de sa performance. */
    private final Integer prix;

    /**
     * Constructeur prive de l'enumeration.
     *
     * @param prix Prix supplementaire du processeur.
     */
    Processeur(int prix) {
        this.prix = prix;
    }

    /**
     * Retourne le prix supplementaire du processeur.
     *
     * @return Prix du processeur.
     */
    public int getPrix() {
        return prix;
    }
}
