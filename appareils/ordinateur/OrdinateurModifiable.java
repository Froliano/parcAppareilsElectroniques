package appareils.ordinateur;

import appareils.Categorie;

/**
 * Classe abstraite representant un ordinateur modifiable.
 * Cette classe permet de modifier les composants d'un ordinateur comme le processeur et la carte graphique.
 */
public abstract class OrdinateurModifiable extends Ordinateur {

    /**
     * Constructeur protege de l'ordinateur modifiable.
     *
     * @param id              Identifiant unique de l'ordinateur.
     * @param nom             Nom de l'ordinateur.
     * @param prixDeBase      Prix de base de l'ordinateur.
     * @param type            Categorie de l'ordinateur.
     * @param processeur      Processeur de l'ordinateur.
     * @param carteGraphique  Carte graphique de l'ordinateur.
     */
    protected OrdinateurModifiable(Integer id, String nom, Integer prixDeBase, Categorie type, Processeur processeur, CarteGraphique carteGraphique) {
        super(id, nom, prixDeBase, type, processeur, carteGraphique);
    }

    /**
     * Retourne une description complete de l'ordinateur modifiable, incluant les informations
     * sur le processeur et la carte graphique.
     *
     * @return Description de l'ordinateur modifiable.
     */
    @Override
    public String getDescription() {
        return super.getDescription() + " avec la carte graphique : " + carteGraphique + " et le processeur : " + processeur;
    }

    /**
     * Retourne le processeur de l'ordinateur.
     *
     * @return Le processeur de l'ordinateur.
     */
    public Processeur getProcesseur() {
        return processeur;
    }

    /**
     * Retourne la carte graphique de l'ordinateur.
     *
     * @return La carte graphique de l'ordinateur.
     */
    public CarteGraphique getCarteGraphique() {
        return carteGraphique;
    }

    /**
     * Active l'ordinateur. Cette methode doit etre implementee dans les classes filles.
     */
    @Override
    public void activer() {
        System.out.println("Activation ordinateur");
    }

    /**
     * Defini un nouveau processeur pour l'ordinateur modifiable.
     *
     * @param processeur Nouveau processeur a installer.
     */
    public void setProcesseur(Processeur processeur) {
        this.processeur = processeur;
    }

    /**
     * Defini une nouvelle carte graphique pour l'ordinateur modifiable.
     *
     * @param carteGraphique Nouvelle carte graphique a installer.
     */
    public void setCarteGraphique(CarteGraphique carteGraphique) {
        this.carteGraphique = carteGraphique;
    }
}
