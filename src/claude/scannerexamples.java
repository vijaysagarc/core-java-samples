package claude;

import java.io.*;
import java.util.Scanner;

public class scannerexamples {
    public static void main(String[] args) {
/*
       //scanner example
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("enter second number");
        int num2 = scanner.nextInt();
        System.out.printf("the sum of %d and % d is %d \n", num1, num2, num1 + num2);


        //bufferreader example
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a new line");
        String line;
        try {
            line = reader.readLine();
            System.out.println("the line inside is " + line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("the line outside is " + line);

        //scanner.close();
*/
/* //console example
        Console console =System.console();

        if (console == null) {
            System.out.println("Console not available");
            return;
        }

        String name=console.readLine("enter username : ");
        char[] password=console.readPassword("enter Password : ");

        System.out.printf("the username is %s password is%s\n",name,password);
        */

/*
        File file =new File("C:\\Users\\Admin\\Downloads\\Existing_Openauction_Buyer_tables .txt");
        System.out.println("file exist ? "+file.exists());
        Scanner filescanner= null;
        try {
            filescanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while(filescanner.hasNextLine()){
            String line=filescanner.nextLine();
            System.out.println(line);
        }
        filescanner.close();


 */

        /*
        File file =new File("C:\\Users\\Admin\\Downloads\\Existing_Openauction_Buyer_tables .txt");
        System.out.println("file Exist(yes/no) "+file.exists());

        if(file.exists()){
            Scanner filescanner=null;
            try {
                filescanner=new Scanner(file);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }

            while(filescanner.hasNextLine()){
                System.out.println(filescanner.nextLine());
            }
            filescanner.close();
        }

         */
        /*

        FileWriter fileWriter= null;
        try {
            fileWriter = new FileWriter("C:\\Users\\Admin\\Downloads\\Existing_Openauction_Buyer_tables .txt",true);
            fileWriter.write("new line from java program");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        Scanner filescanner= null;
        try {
            filescanner = new Scanner(new File("C:\\Users\\Admin\\Downloads\\Existing_Openauction_Buyer_tables .txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while(filescanner.hasNextLine()) {
            System.out.println(filescanner.nextLine());
        }
        filescanner.close();
         */


        
    }
}
