package appareils;

/**
 * Classe abstraite representant un appareil electronique.
 * Tous les appareils possedent un identifiant, un nom, un prix de base et une categorie.
 */
public abstract class Appareil {

    /** Identifiant unique de l'appareil. */
    protected Integer id;

    /** Nom de l'appareil. */
    protected String nom;

    /** Prix de base de l'appareil. */
    protected Integer prixDeBase;

    /** Categorie de l'appareil. */
    protected Categorie type;

    /**
     * Constructeur protege pour initialiser un appareil.
     *
     * @param id         Identifiant unique de l'appareil.
     * @param nom        Nom de l'appareil.
     * @param prixDeBase Prix de base de l'appareil.
     * @param type       Categorie de l'appareil.
     */
    protected Appareil(Integer id, String nom, Integer prixDeBase, Categorie type) {
        this.id = id;
        this.nom = nom;
        this.prixDeBase = prixDeBase;
        this.type = type;
    }

    /**
     * Methode abstraite permettant d'activer l'appareil.
     */
    public abstract void activer();

    /**
     * Methode abstraite retournant une description detaillee de l'appareil.
     *
     * @return Description de l'appareil sous forme de chaine de caracteres.
     */
    public abstract String getDescription();

    /**
     * Methode abstraite permettant de calculer le prix final de l'appareil.
     *
     * @return Le prix final de l'appareil apres modifications eventuelles.
     */
    public abstract double getPrixFinal();

    /**
     * Retourne le nom de l'appareil.
     *
     * @return Nom de l'appareil.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Retourne l'identifiant de l'appareil.
     *
     * @return Identifiant de l'appareil.
     */
    public Integer getId() {
        return id;
    }

    /**
     * Retourne le prix de base de l'appareil.
     *
     * @return Prix de base de l'appareil.
     */
    public Integer getPrixDeBase() {
        return prixDeBase;
    }

    /**
     * Definit le prix de base de l'appareil.
     * Methode protegee pour restreindre la modification du prix de base.
     *
     * @param prixDeBase Nouveau prix de base.
     */
    protected void setPrixDeBase(Integer prixDeBase) {
        this.prixDeBase = prixDeBase;
    }

    /**
     * Retourne la categorie de l'appareil.
     *
     * @return Categorie de l'appareil.
     */
    public Categorie getType() {
        return type;
    }
}
