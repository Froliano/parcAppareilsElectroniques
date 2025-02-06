package appareils;

public class OrdinateurPortable extends Appareil
{
    private float taille;

    protected OrdinateurPortable(Integer id, String nom, Integer prixDeBase, Categorie type, float taille) {
        super(id, nom, prixDeBase, type);
        this.taille = taille;
    }

    @Override
    public void activer()
    {
        System.out.println("ordinateur portable allumé");
    }

    @Override
    public String getDescription() {
        return  "Voici l'ordinateur portable : " + getNom() ;
    }

    @Override
    public double getPrixFinal() {
        return prixDeBase * 1.20;
    }
}
