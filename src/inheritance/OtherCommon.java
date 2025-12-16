package inheritance;

public class OtherCommon {
    public static void main(String[] args) {
        Parent obj=new Child(1,2,3);
        System.out.println("print-> "+obj.a);
        //System.out.println("it wont print -> "+obj.c);

        Child obj1=new Child(4,5,6);
        System.out.println("print second -> "+obj1.a);
        System.out.println("it will print -> "+obj1.c);
    }
}
