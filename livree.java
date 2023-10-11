public class livree {
    private int id;
    private String titre;
    private String auteur;
    private double prix;
    public static int cpt;

    public livree(int id, String titre, String auteur, double prix)
    {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.prix = prix;
        cpt++;
    }
    public livree()
    {
        cpt++;
    }

    public void setAuteur(String a)
    {
        this.auteur=a;
    }

    public void setTitre(String a)
    {
        this.titre=a;
    }
    public void setPrix(double a)
    {
        this.prix=a;
    }
    public void setId(int a)
    {
        this.id=a;
    }

    public String getTitre()
    {
        return  this.titre;
    }

    public String getAuteur()
    {
        return this.auteur;
    }
    public double getPrix()
    {
        return this.prix;
    }
    public int getId()
    {
        return this.id;
    }


    public void affiche()
    {
        System.out.println("le livre 1:"+"id="+this.id+"titre:"+this.titre +"auteur:"+this.auteur+ "prix="+this.prix );
    }

}




