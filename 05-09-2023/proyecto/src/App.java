import java.util.Scanner;
public class App {
   //Crear un programa para determinar la admisión de personas a una
//disco. El programa le pedirá al usuario su edad y su género. Si el
//usuario es menor de 18 años, no podrá entrar. Si la edad es mayor o
//igual a 18 años y es mujer, podrá entrar al local, pero no podrá
//consumir bebidas alcohólicas a menos que sea mayor de 20 años.
//Si la edad es mayor o igual a 18 años y es hombre, se le deberá
//revisar si porta armas, si porta armas, no podrá entrar al local; en
//caso contrario, podrá entrar al local, pero no podrá consumir bebidas
//alcohólicas a menos que sea mayor de 20 años
   
     public static void main(String[] args) throws Exception {
          
        Scanner lector=new Scanner(System.in);
         
        byte edad;
        char sexo;
        char ingrese;
        System.out.println(" Lleva arma S/N");
        ingrese=lector.next().charAt(0);

        if (ingrese=='S' || ingrese =='s'){
        
        
        System.out.println("Usted no puede entrar a la disco");

          
        } else{
        
        System.out.println("Ingrese su edad");
        edad=lector.nextByte();
        
        if (edad<=0){
                
        System.out.println("Usted no ha nacido ");
        
        } else if(edad<18){
            
            
        System.out.println("Usted es menor de edad no puede ingresar a la disco");
        
        } else{
        System.out.println("Ingrese su sexo M/F");

        sexo=lector.next().charAt(0);
        if((sexo=='f' || sexo=='F') && edad==18){

        System.out.println("Usted puede entrar a la disco pero no puede tomar");

        } else if((sexo=='f' || sexo=='F') && edad>=20){
            
            
        System.out.println("Usted puede entrar a la disco y puede tomar alcohol");

        } else if (sexo=='m' || sexo=='M' && edad>=18 && edad <=21){
            
            
        System.out.println("Usted puede entrar al a la disco pero no puede tomar");
       
        } else if(sexo=='m' || sexo=='M' && edad>=21){
        
        System.out.println("Usted puede entrar a la disco y tomar alcohol");

         

        }

        }

            lector.close();
        }
        
    }
}
    

        

        
        
    
     

         



        
        

        

