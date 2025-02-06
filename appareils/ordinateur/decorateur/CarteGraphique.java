package appareils.ordinateur.decorateur;

public enum CarteGraphique
{
    RTX4060(30),
    RTX4070(50),
    RTX4080(70),
    RTX4090(100);

    private final Integer prix;

    CarteGraphique(int prix)
    {
        this.prix = prix;
    }

    public int getPrix()
    {
        return prix;
    }
}
