import java.util.*;
class gender{
  public static void main(String[] args){
    char M,F;
    Scanner obj=new Scanner(System.in);
     System.out.println("Enter your Letter:");
     M=obj.next().charAt(0);
    F=obj.next().charAt(0);
    if(M =='m'){
      System.out.println("Male"); 
    }else if(F=='f') {
      System.out.println("Female");
    }
  }
}
    
