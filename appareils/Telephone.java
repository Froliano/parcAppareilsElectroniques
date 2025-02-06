package appareils;

import java.util.Vector;

public class Telephone extends Appareil
{
    private Vector<String> contacts = new Vector<String>();

    protected Telephone(Integer id, String nom, Integer prixDeBase, Categorie type) {
        super(id, nom, prixDeBase, type);
    }

    @Override
    public void activer()
    {
        System.out.println("telephone allumé");
    }

    @Override
    public String getDescription()
    {
        return "Voici le telephone : " + getNom() ;
    }

    @Override
    public double getPrixFinal()
    {
        return prixDeBase * 1.20;
    }

    public int ajouterContact(String contact)
    {
        if (contact.length() == 10)
        {
            for (char numero : contact.toCharArray())
            {
                if (!Character.isDefined(numero))
                {
                    return 2;
                }
            }
            contacts.add(contact);
            return 0;
        }
        return 1;
    }

    public void afficherContacts()
    {
        for (int i = 1; i <= contacts.size(); i++)
        {
            System.out.println(i + ") " + contacts.get(i - 1));
        }
    }

     public void appel(int id)
     {
         System.out.println("appel en cours : " + contacts.get(id -1));
     }

}
