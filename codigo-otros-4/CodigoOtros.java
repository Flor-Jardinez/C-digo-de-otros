package codigoOtros4;

import java.util.Scanner; // Importar Scanner para leer entradas desde la consola

public class CodigoOtros {
	//agregar el main
	public static void main (String[] args) {
	    Scanner s = new Scanner(System.in); //agregar el system in
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	    //cambiando el numero de jugador
	    //Scanner s2 = new Scanner();//no se necesita este scanner
	    String j2 = s.nextLine();
	    
	    if (j1 == j2) {
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":
	          if (j2.equals("tijeras")) { //agregar.equals
	            g = 1;
	          }
	          break; //agregar break

	        case "papel":
	          if (j2.equals("piedra")) { //agregar.equals
	            g = 2;
	          }
	          break; //agregar break
	          
	        case "tijera":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	        default:
	        	System.out.println("Entrada inválida"); // mensaje de entrada no valida
	        	break; // salimos si hay una entrada invalida
	      }
	      System.out.println("Gana el jugador " + g);
	    }
	  
	    s.close(); // cerrar el scanner
	  
	}
}
