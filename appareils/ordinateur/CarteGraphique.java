package appareils.ordinateur;

/**
 * Enumeration representant les differents modeles de cartes graphiques disponibles.
 * Chaque carte graphique a un prix supplementaire associe.
 */
public enum CarteGraphique {

    /** Carte graphique Nvidia RTX 4060 avec un cout supplementaire de 30. */
    RTX4060(30),

    /** Carte graphique Nvidia RTX 4070 avec un cout supplementaire de 50. */
    RTX4070(50),

    /** Carte graphique Nvidia RTX 4080 avec un cout supplementaire de 70. */
    RTX4080(70),

    /** Carte graphique Nvidia RTX 4090 avec un cout supplementaire de 100. */
    RTX4090(100);

    /** Prix supplementaire de la carte graphique. */
    private final Integer prix;

    /**
     * Constructeur prive de l'enumeration pour definir le prix de chaque carte graphique.
     *
     * @param prix Prix supplementaire de la carte graphique.
     */
    CarteGraphique(int prix) {
        this.prix = prix;
    }

    /**
     * Retourne le prix supplementaire de la carte graphique.
     *
     * @return Prix de la carte graphique.
     */
    public int getPrix() {
        return prix;
    }
}
