package ui;
import java.util.Scanner;
public class  MayorEdad {
	public static void main (String [] args){
		Scanner dc = new Scanner(System.in);
		String Nombre;
		String Apellido;
		int Edad;
		
		System.out.println("ingrese su nombre");
		Nombre= dc.nextLine ();
		System.out.println("ingrese su apellido");
		Apellido= dc.nextLine ();
		System.out.println("ingrese su edad");
		Edad= dc.nextInt ();
        System.out.println("su nombre es "+Nombre+" su apellido es "+Apellido+" su edad es "+Edad);
        if(Edad<=18)
          System.out.println("Usted es menor de edad");
        else if(Edad >= 18)
          System.out.println("usted es mayor de edad");
        
	}
}   