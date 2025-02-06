package appareils.ordinateur;

import appareils.Categorie;
import appareils.ordinateur.decorateur.CarteGraphique;
import appareils.ordinateur.decorateur.Processeur;

public class Apple extends Ordinateur
{
    public Apple(Integer id, String nom, Integer prixDeBase, Categorie type, Processeur processeur, CarteGraphique carteGraphique) {
        super(id, nom, prixDeBase, type, processeur, carteGraphique);
    }

    @Override
    public void activer()
    {
        System.out.println("Ordinateur Apple allumé");
    }

    @Override
    public double getPrixFinal() {
        return (prixDeBase + processeur.getPrix() + carteGraphique.getPrix()) * 1.20;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "de la marque Apple : " ;
    }
}
