package appareils.ordinateur.decorateur;

public enum Processeur
{
    I3_13100(10),
    I5_13400(20),
    I7_13700(40),
    I9_13900(50);

    private final Integer prix;

    Processeur(int prix)
    {
        this.prix = prix;
    }

    public int getPrix()
    {
        return prix;
    }
}
