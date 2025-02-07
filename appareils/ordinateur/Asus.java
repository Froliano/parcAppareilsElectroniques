package appareils.ordinateur;

import appareils.Categorie;

/**
 * Classe representant un ordinateur Asus modifiable.
 * Cette classe herite d'OrdinateurModifiable et permet de specifier le type de l'ordinateur,
 * ainsi que de personnaliser son activation et sa description.
 */
public class Asus extends OrdinateurModifiable {

    /**
     * Constructeur de l'ordinateur Asus modifiable.
     *
     * @param id              Identifiant unique de l'ordinateur.
     * @param nom             Nom de l'ordinateur.
     * @param prixDeBase      Prix de base de l'ordinateur.
     * @param processeur      Processeur de l'ordinateur.
     * @param carteGraphique  Carte graphique de l'ordinateur.
     */
    public Asus(Integer id, String nom, Integer prixDeBase, Processeur processeur, CarteGraphique carteGraphique) {
        super(id, nom, prixDeBase, Categorie.ASUS, processeur, carteGraphique);
    }

    /**
     * Active l'ordinateur Asus.
     * Cette methode appele d'abord la methode d'activation de la classe parente puis ajoute
     * un message specifique indiquant qu'il s'agit d'un Asus.
     */
    @Override
    public void activer() {
        super.activer();
        System.out.println("type : Asus");
    }

    /**
     * Retourne le prix final de l'ordinateur Asus.
     * Le prix final est augmente de 20% par rapport au prix de base.
     *
     * @return Prix final de l'ordinateur Asus.
     */
    @Override
    public double getPrixFinal() {
        return prixDeBase * 1.20;
    }

    /**
     * Retourne une description complete de l'ordinateur Asus.
     * Cette description inclut le type de l'ordinateur et la marque.
     *
     * @return Description de l'ordinateur Asus.
     */
    @Override
    public String getDescription() {
        return super.getDescription() + " de la marque Asus";
    }
}
