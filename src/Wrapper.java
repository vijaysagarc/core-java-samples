public class Wrapper {

    public static void main(String[] args) {
        int a=5;
        int b=10;
        swap(a,b);

        //Wrapper obj=new Wrapper();
        //obj.swap2(1,2);
        System.out.println("after swap a: "+a+" b: "+b);

    }

    static void swap(int a,int b){

        int temp=a;
        a=b;
        b=temp;

        
    }



}
