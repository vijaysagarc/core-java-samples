package singleton;


import org.w3c.dom.ls.LSOutput;

public class Main {
    //Singleton obj1=new Singleton();


    public static void main(String[] args) {
        Singleton obj=Singleton.getInstance();
        Singleton obj2=Singleton.getInstance();
        System.out.println(obj.toString());
        System.out.println(obj2.toString());


    }

}
