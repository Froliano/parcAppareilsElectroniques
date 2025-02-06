package appareils.ordinateur;

import appareils.Appareil;
import appareils.Categorie;
import appareils.ordinateur.decorateur.CarteGraphique;
import appareils.ordinateur.decorateur.Processeur;

public abstract class Ordinateur extends Appareil
{
    protected Processeur processeur;
    protected CarteGraphique carteGraphique;

    protected Ordinateur(Integer id, String nom, Integer prixDeBase, Categorie type, Processeur processeur, CarteGraphique carteGraphique)
    {
        super(id, nom, prixDeBase, type);
        this.processeur = processeur;
        this.carteGraphique = carteGraphique;
    }

    @Override
    protected String getDescription() {
        return "Voici l'ordinateur ";
    }

}
