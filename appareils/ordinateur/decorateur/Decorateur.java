package appareils.ordinateur.decorateur;

import appareils.ordinateur.*;

/**
 * Classe abstraite Decorateur qui permet d'ajouter des fonctionnalites supplmentaires
 * a un ordinateur modifiable. Elle herite de la classe OrdinateurModifiable et utilise
 * le pattern Decorator pour ajouter des comportements.
 */
public abstract class Decorateur extends OrdinateurModifiable {

    /**
     * Constructeur du decorateur.
     * Ce constructeur permet de creer un decorateur pour un ordinateur modifiable
     * en utilisant ses attributs existants (id, nom, prix de base, processeur, carte graphique).
     *
     * @param ordinateur Ordinateur modifiable auquel des fonctionnalites seront ajoutees.
     */
    protected Decorateur(OrdinateurModifiable ordinateur) {
        super(ordinateur.getId(), ordinateur.getNom(), ordinateur.getPrixDeBase(),
                ordinateur.getType(), ordinateur.getProcesseur(), ordinateur.getCarteGraphique());
    }
}
