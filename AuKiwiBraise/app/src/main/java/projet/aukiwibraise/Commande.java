package projet.aukiwibraise;

/**
 * Created by Nicolas & Corentin on 23/03/2017.
 *
 * This class save the client's command
 */

public class Commande {

    public static String formule;
    public static int prix_formule;
    public static String entree="";
    public static String plat;
    public static String dessert="";
    public static String boisson;
    public static int prix_boisson;
    public static boolean isWine;
    public static int prix;

    public static void setFormule(String para_formule)
    {
        formule = para_formule;
        if(formule=="KiwiManjaro")
            prix=20;
        else if(formule=="Le Plumé")
            prix=16;
        else
            prix=15;
    }

    public static void setEntree(String para_entree)
    {
        entree = para_entree;
    }

    public static void setPlat(String para_plat)
    {
        plat = para_plat;
    }

    public static void setDessert(String para_dessert)
    {
        dessert = para_dessert;
    }

    public static void setBoisson(String para_boisson)
    {
        boisson = para_boisson;
    }

    public static void setPrix(int para_prix)
    {
        prix = para_prix;
    }

    public static int getPrix(){

        return prix;
    }

    public static String getEntree()
    {
        return entree;
    }

    public static String getPlat(){return plat;}

    public static String getDessert(){return dessert;}

    public static String affiche_resume()
    {
        return formule+"\n "+entree+"\n "+plat+"\n"+dessert;
    }

    public static void setIsWine(boolean a)
    {
        isWine = a;
    }
}