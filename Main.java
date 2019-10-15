

public class Main {
    static int[] arrayOfInts = {0,1,2,3,4};

    static void change (int[] t){
        t[0] = 5;
    }

    public static void main(String args[]){
        change(arrayOfInts);
        //System.out.println(arrayOfInts[0]);
        //Q1- La fonction change prend en parametre une copie de l'adresse du tableau, ce qui lui permet d'avoir un accès directe au contenu du tableau

        //Création d'un tableau vide
        IntTab liste=new IntTab();
        //Ajout d'élément à la fin du tableau
        liste.addLast(3);
        liste.addLast(7);
        liste.addLast(1);
        liste.addLast(8);  
        liste.addLast(2);
        System.out.println(liste.getSize());
        System.out.println(liste.toString());

        //suppression d'un élément du tableau
        //liste.remove(2);  //Resultat attendu est Tab=[3,7,8,2]
        //System.out.println(liste.getSize());
        //System.out.println(liste.toString());

        //Insertion à la position i
        liste.insert(6, 8); //Resultat attendu est Tab=[3,7,6,1,8,2]

        //Redimenssionner le tableau
        System.out.println(liste.getSize());
        System.out.println(liste.toString());
    }
}
