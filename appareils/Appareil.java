package appareils;

public abstract class Appareil
{
    protected Integer id;
    protected String nom;
    protected Integer prixDeBase;
    protected Categorie type ;

    protected Appareil(Integer id, String nom, Integer prixDeBase, Categorie type)
    {
        this.id = id;
        this.nom = nom;
        this.prixDeBase = prixDeBase;
        this.type = type;
    }

    protected abstract void activer();

    protected abstract String getDescription();

    protected abstract double getPrixFinal();

    public String getNom() {
        return nom;
    }
}
