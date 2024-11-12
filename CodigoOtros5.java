package codigoOtros5;

import java.util.Scanner; //importar Scanner

public class CodigoOtros5 {

public static void main(String[] args) { //Encapsulamos el método
	Scanner s = new Scanner(System.in);
    System.out.println("Introduzca un número: ");
    
    
    int ni = s.nextInt(); //convierte de String a int
    int c =  ni;
    
    int afo = 0;
    int noAfo = 0;
    
    while (ni > 0) {
	  int digito = (ni % 10);//quitamos int porque arriba convertimos ya la variable y está especificada
      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
		afo++;
      } else {
		noAfo++;
      } //cerramos el else
      
	  ni /= 10;
    }
    if (afo > noAfo) {
      System.out.println("El " + c + " es un número afortunado.");
    } else {
      System.out.println("El " + c + " no es un número afortunado.");
    }
    
    s.close(); // cerramos el scanner
  }
  
}
