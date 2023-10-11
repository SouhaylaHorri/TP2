public class testlivree {
    public static void main(String[]args)
    {
        livree l1= new livree(1,"java","ali",100.00);
        livree l2= new livree();
        l1.affiche();
        l1.setAuteur("souhayla");
        System.out.println(l1.getAuteur());
        l2.setAuteur("souhayla");
        System.out.println(l2);
        System.out.printf("Le nombre de livre est :"+livree.cpt);

    }
}
