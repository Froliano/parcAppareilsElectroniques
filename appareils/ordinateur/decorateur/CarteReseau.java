package appareils.ordinateur.decorateur;

import appareils.ordinateur.OrdinateurModifiable;

/**
 * Decorateur ajoutant une carte reseau a un ordinateur modifiable.
 * Cette classe permet d'ajouter une fonctionnalite "carte reseau" a un ordinateur
 * en utilisant le pattern Decorator, en modifiant son prix et sa description.
 */
public class CarteReseau extends Decorateur {

    /** Ordinateur modifiable auquel la carte reseau est ajoutee. */
    OrdinateurModifiable ordinateur;

    /**
     * Constructeur du decorateur CarteReseau.
     * Ce constructeur permet d'ajouter une carte reseau a un ordinateur modifiable
     * et de mettre a jour son prix de base en ajoutant le prix de la carte reseau.
     *
     * @param ordinateur Ordinateur modifiable auquel la carte reseau sera ajoutee.
     */
    public CarteReseau(OrdinateurModifiable ordinateur) {
        super(ordinateur);
        setPrixDeBase(ordinateur.getPrixDeBase() + 15); // Augmente le prix de base de l'ordinateur
        this.ordinateur = ordinateur;
    }

    /**
     * Modifie le prix de base de l'ordinateur.
     * Cette methode permet de definir un nouveau prix de base.
     *
     * @param prixDeBase Nouveau prix de base de l'ordinateur.
     */
    @Override
    protected void setPrixDeBase(Integer prixDeBase) {
        super.setPrixDeBase(prixDeBase);
    }

    /**
     * Active l'ordinateur avec la carte reseau.
     * Cette methode appelle la methode d'activation de l'ordinateur sous-jacent.
     */
    @Override
    public void activer() {
        ordinateur.activer();
    }

    /**
     * Retourne une description de l'ordinateur avec la carte reseau.
     * Cette description combine celle de l'ordinateur sous-jacent avec l'ajout de la carte reseau.
     *
     * @return Description complete de l'ordinateur avec carte reseau.
     */
    @Override
    public String getDescription() {
        return ordinateur.getDescription() + " avec une carte reseau";
    }

    /**
     * Retourne le prix final de l'ordinateur avec la carte reseau.
     * Le prix est augmente de 20% par rapport au prix de base de l'ordinateur avec la carte reseau.
     *
     * @return Prix final de l'ordinateur avec carte reseau.
     */
    @Override
    public double getPrixFinal() {
        return prixDeBase * 1.20;
    }
}
