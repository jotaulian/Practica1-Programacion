package es.studium.Programacion;

import java.util.Scanner;

public class Intercalar
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String cadena1, cadena2;
		int i;
		
		//Pedimos la primer cadena y guardamos el valor ingresado por teclado en la variable tipo String "cadena1":
		System.out.println("Dame la primera cadena: ");
		cadena1 = teclado.nextLine();
		
		
		//Pedimos la segunda cadena y guardamos el valor ingresado por teclado en la variable tipo String "cadena2"
		System.out.println("Dame la segunda cadena: ");
		cadena2 = teclado.nextLine();
		
		teclado.close();
		
		//Creamos una cadena vacía en donde iremos agregando los caracteres de las cadenas ingresadas por teclado.
		String cadena3 = "";

		//Creamos un bucle que se repetira tantas veces como la cantidad de caracteres de la cadena mas larga.
		//En cada vuelta, se agregara un caracter de la cadena1 y otro de la cadena2 a la cadena3.
		for (i = 0; i < cadena1.length() || i < cadena2.length(); i++) { 
			  
            //Agregamos el caracter de la cadena1 correspondiente a la posición por la que se encuentre el bucle. 
			//Siempre y cuando la posición actual del bucle sea menor al largo de la cadena1.
            if (i < cadena1.length()) {
            	cadena3 = cadena3 + cadena1.charAt(i); 
            }
            
            //Agregamos el caracter de la cadena2 correspondiente a la posición por la que se encuentre el bucle. 
			//Siempre y cuando la posición actual del bucle sea menor al largo de la cadena2.
            if (i < cadena2.length()) {
            	cadena3 = cadena3 + cadena2.charAt(i);             	
            }
        }
		
//		Muestramos la nueva cadena por pantalla: 
		System.out.println("La cadena resultante de intercalar una letra de una cadena con otra letra de la otra cadena es: " + cadena3);
	}
	
}
