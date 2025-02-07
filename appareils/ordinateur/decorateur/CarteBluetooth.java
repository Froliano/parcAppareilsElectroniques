package appareils.ordinateur.decorateur;

import appareils.ordinateur.OrdinateurModifiable;

/**
 * Decorateur ajoutant une carte bluetooth a un ordinateur modifiable.
 * Cette classe permet d'ajouter la fonctionnalite "carte bluetooth" a un ordinateur,
 * en utilisant le pattern Decorator, en modifiant son prix et sa description.
 */
public class CarteBluetooth extends Decorateur {

    /** Ordinateur modifiable auquel la carte bluetooth est ajoutee. */
    OrdinateurModifiable ordinateur;

    /**
     * Constructeur du decorateur CarteBluetooth.
     * Ce constructeur permet d'ajouter une carte bluetooth a un ordinateur modifiable
     * et de mettre a jour son prix de base en ajoutant le prix de la carte bluetooth.
     *
     * @param ordinateur Ordinateur modifiable auquel la carte bluetooth sera ajoutee.
     */
    public CarteBluetooth(OrdinateurModifiable ordinateur) {
        super(ordinateur);
        setPrixDeBase(ordinateur.getPrixDeBase() + 20);
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
     * Active l'ordinateur avec la carte bluetooth.
     * Cette methode appelle la methode d'activation de l'ordinateur sous-jacent.
     */
    @Override
    public void activer() {
        ordinateur.activer();
    }

    /**
     * Retourne une description de l'ordinateur avec la carte bluetooth.
     * Cette description combine celle de l'ordinateur sous-jacent avec l'ajout de la carte bluetooth.
     *
     * @return Description complete de l'ordinateur avec carte bluetooth.
     */
    @Override
    public String getDescription() {
        return ordinateur.getDescription() + " avec une carte bluetooth";
    }

    /**
     * Retourne le prix final de l'ordinateur avec la carte bluetooth.
     * Le prix est augmente de 20% par rapport au prix de base de l'ordinateur avec la carte bluetooth.
     *
     * @return Prix final de l'ordinateur avec carte bluetooth.
     */
    @Override
    public double getPrixFinal() {
        return prixDeBase * 1.20;
    }
}
