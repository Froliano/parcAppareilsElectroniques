package appareils.ordinateur;

import appareils.Appareil;
import appareils.Categorie;

/**
 * Classe abstraite representant un ordinateur.
 * Les ordinateurs possedent un processeur et une carte graphique,
 * et leur prix de base est modifie en fonction de ces composants.
 */
public abstract class Ordinateur extends Appareil {

    /** Processeur de l'ordinateur. */
    protected Processeur processeur;

    /** Carte graphique de l'ordinateur. */
    protected CarteGraphique carteGraphique;

    /**
     * Constructeur protege de l'ordinateur.
     * Le prix de base est modifie en tenant compte du prix du processeur et de la carte graphique.
     *
     * @param id              Identifiant unique de l'ordinateur.
     * @param nom             Nom de l'ordinateur.
     * @param prixDeBase      Prix de base de l'ordinateur.
     * @param type            Categorie de l'ordinateur.
     * @param processeur      Processeur de l'ordinateur.
     * @param carteGraphique  Carte graphique de l'ordinateur.
     */
    protected Ordinateur(Integer id, String nom, Integer prixDeBase, Categorie type, Processeur processeur, CarteGraphique carteGraphique) {
        // Le prix de base est modifie en ajoutant le prix du processeur et de la carte graphique
        prixDeBase += processeur.getPrix() + carteGraphique.getPrix();
        super(id, nom, prixDeBase, type);
        this.processeur = processeur;
        this.carteGraphique = carteGraphique;
    }

    /**
     * Retourne une description de l'ordinateur.
     * Cette description de base peut etre etendue par les sous-classes.
     *
     * @return Description de l'ordinateur.
     */
    @Override
    public String getDescription() {
        return "Voici l'ordinateur ";
    }
}
