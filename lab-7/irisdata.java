import java.io.*;
import java.util.*;
class irisdata{
    
    public static double main(String args[]){
        try{
            File file = new File("Iris.csv");
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        

    }
}