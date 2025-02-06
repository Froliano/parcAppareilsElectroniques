package appareils.ordinateur;

import appareils.Categorie;
import appareils.ordinateur.decorateur.CarteGraphique;
import appareils.ordinateur.decorateur.Processeur;

public abstract class OrdinateurModifiable extends Ordinateur
{

    public OrdinateurModifiable(Integer id, String nom, Integer prixDeBase, Categorie type, Processeur processeur, CarteGraphique carteGraphique) {
        super(id, nom, prixDeBase, type, processeur, carteGraphique);
    }
}
