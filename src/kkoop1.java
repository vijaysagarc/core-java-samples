public class kkoop1 {
    public static void main(String[] args)
    {
        student vijay=new student();
        vijay.name="vijay sagar";
        vijay.marks=40;
        vijay.rollno=29;

        System.out.println(vijay.name);
        System.out.println(vijay.rollno);
        System.out.println(vijay.marks);

       // student sagar=new student(100,"vjs",13);
       // System.out.println("mark of s :"+sagar.marks+" "++"");
    }
}

class student{
    int rollno;
    String name;
    int marks;

    public student(int marks, String name, int rollno) {
        this.marks = marks;
        this.name = name;
        this.rollno = rollno;
    }

    public student() {
     }
}