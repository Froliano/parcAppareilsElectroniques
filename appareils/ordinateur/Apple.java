package appareils.ordinateur;

import appareils.Categorie;

/**
 * Classe representant un ordinateur Apple.
 * Cette classe herite de la classe Ordinateur et specifie le comportement d'activation
 * et la description d'un ordinateur de marque Apple.
 */
public class Apple extends Ordinateur {

    /**
     * Constructeur de l'ordinateur Apple.
     *
     * @param id              Identifiant unique de l'ordinateur.
     * @param nom             Nom de l'ordinateur.
     * @param prixDeBase      Prix de base de l'ordinateur.
     * @param processeur      Processeur de l'ordinateur.
     * @param carteGraphique  Carte graphique de l'ordinateur.
     */
    public Apple(Integer id, String nom, Integer prixDeBase, Processeur processeur, CarteGraphique carteGraphique) {
        super(id, nom, prixDeBase, Categorie.APPLE, processeur, carteGraphique);
    }

    /**
     * Active l'ordinateur Apple.
     * Cette methode affiche un message specifique indiquant que l'ordinateur Apple est allume.
     */
    @Override
    public void activer() {
        System.out.println("Ordinateur Apple allume");
    }

    /**
     * Retourne le prix final de l'ordinateur Apple.
     * Le prix final est augmente de 20% par rapport au prix de base.
     *
     * @return Prix final de l'ordinateur Apple.
     */
    @Override
    public double getPrixFinal() {
        return prixDeBase * 1.20;
    }

    /**
     * Retourne une description complete de l'ordinateur Apple.
     * Cette description inclut le type d'ordinateur et la marque.
     *
     * @return Description de l'ordinateur Apple.
     */
    @Override
    public String getDescription() {
        return super.getDescription() + " de la marque Apple";
    }
}
