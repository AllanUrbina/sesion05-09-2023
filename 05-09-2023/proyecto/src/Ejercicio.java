import java.util.Scanner;

public class Ejercicio{
    public static void main(String[] args) throws Exception {
          
 Scanner lector=new Scanner(System.in);
 
 int ladoa,ladob,ladoc;
  System.out.print("Ingrese ladoa de su Triangulo");
   ladoa=lector.nextInt();
 System.out.print("Ingrese ladob de su Triangulo");
   ladob=lector.nextInt();
    System.out.print("Ingrese ladoc de su Triangulo");
   ladoc=lector.nextInt();

 if(ladoa==ladob){
    if(ladob!=ladoc){
    System.out.println("SU triangulo es isocele");

 
 }

 
 
  lector.close();
}
 }
}
