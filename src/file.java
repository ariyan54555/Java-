import javax.imageio.IIOException;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class file {
    public static void main(String[] args) {
//        //create a file
//        File file = new File("test.txt");
//        try{
//            file.createNewFile();
//        }
//        catch(java.io.IOException e){
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
        //write a file
//        try{
//            FileWriter fileWriter = new FileWriter("test.txt");
//            fileWriter.write("Hello, World!");
//            fileWriter.close();
//        }
//        catch(java.io.IOException e){
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
        //Reading a file
        File file = new File("test.txt");
        try{
            Scanner input = new Scanner(file);
            while(input.hasNextLine()){
                String data = input.nextLine();
                System.out.println(data);
            }
            input.close();
        }
        catch(java.io.IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
