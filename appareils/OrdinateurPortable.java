package appareils;

/**
 * Classe representant un ordinateur portable, qui est un type d'Appareil.
 */
public class OrdinateurPortable extends Appareil {

    /** Taille de l'ecran de l'ordinateur portable en pouces. */
    private float taille;

    /**
     * Constructeur de l'ordinateur portable.
     *
     * @param id         Identifiant unique de l'ordinateur.
     * @param nom        Nom de l'ordinateur.
     * @param prixDeBase Prix de base de l'ordinateur.
     * @param taille     Taille de l'ecran en pouces.
     */
    public OrdinateurPortable(Integer id, String nom, Integer prixDeBase, float taille) {
        super(id, nom, prixDeBase, Categorie.ORDINATEURPORTABLE);
        this.taille = taille;
    }

    /**
     * Active l'ordinateur portable en l'allumant.
     */
    @Override
    public void activer() {
        System.out.println("Ordinateur portable allume");
    }

    /**
     * Retourne une description de l'ordinateur portable.
     *
     * @return Une chaine de caracteres decrivant l'ordinateur portable.
     */
    @Override
    public String getDescription() {
        return "Voici l'ordinateur portable : " + getNom() + ", de taille : " + taille;
    }

    /**
     * Calcule et retourne le prix final de l'ordinateur portable apres une majoration de 20%.
     *
     * @return Le prix final avec la majoration.
     */
    @Override
    public double getPrixFinal() {
        return prixDeBase * 1.20;
    }

    /**
     * Retourne la taille de l'ecran de l'ordinateur portable.
     *
     * @return Taille de l'ecran en pouces.
     */
    public float getTaille() {
        return taille;
    }
}
