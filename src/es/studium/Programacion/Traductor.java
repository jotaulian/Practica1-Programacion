package es.studium.Programacion;

import java.util.Scanner;

public class Traductor
{

	public static void main(String[] args)
	{
		String frase;
		int i;
		Scanner teclado = new Scanner(System.in);
		
		/* 
		 Pedimos una frase por teclado y guardamos el valor en una variable tipo String llamada "frase".
		 */
		System.out.println("Dame una frase: ");
		frase = teclado.nextLine();
		
		/* 
		Transformamos la cadena en una matriz de subcadenas, utilizando como delimitador los espacios entre cada palabra.
		 */
		String[] arrFrase = frase.split(" ");
		teclado.close();
		
		/* 
		 Recorremos la matriz con un bucle que se repetira tantas veces como elementos en el array.
		 Mediante la instrucción switch, comparamos el valor de la expresión con los posibles casos. 
		 Si hay una coincidencia se ejecuta el bloque de código que cambiara la palabra de un idioma a otro.
		 */
		for(i=0; i < arrFrase.length ;i++) {
			switch(arrFrase[i]) {
			/* 
			 Para cada palabra en Español, indicamos la equivalente en Ingles.
			 */
			case "yo":
				arrFrase[i] = "I";
				break;
			case "tu":
				arrFrase[i] = "you";
				break;
			case "el":
				arrFrase[i] = "he";
				break;
			case "ella":
				arrFrase[i] = "she";
				break;
			case "soy":
				arrFrase[i] = "am";
				break;
			case "eres":
				arrFrase[i] = "are";
				break;
			case "es":
				arrFrase[i] = "is";
				break;
			case "alto":
				arrFrase[i] = "tall";
				break;
			case "alta":
				arrFrase[i] = "tall";
				break;
			case "bajo":
				arrFrase[i] = "short";
				break;
			case "baja":
				arrFrase[i] = "short";
				break;
			case "español":
				arrFrase[i] = "spanish";
				break;
			case "española":
				arrFrase[i] = "spanish";
				break;
				
			/* Ahora de Ingles a Español*/
			case "i":
				arrFrase[i] = "yo";
				break;
			case "you":
				arrFrase[i] = "tu";
				break;
			case "he":
				arrFrase[i] = "el";
				break;
			case "she":
				arrFrase[i] = "ella";
				break;
			case "am":
				arrFrase[i] = "soy";
				break;
			case "are":
				arrFrase[i] = "eres";
				break;
			case "is":
				arrFrase[i] = "es";
				break;
				/* 
				 Solo para darle mejor funcionalidad al programa, si la frase que introducimos comienza en femenino
				 el adjetivo de la frase también será femenino.
				 */
			case "tall":
				if(arrFrase[0].equals("ella")) {
					arrFrase[i] = "alta";
				}else{
					arrFrase[i] = "alto";
				}
				break;
			case "short":
				if(arrFrase[0].equals("ella")) {
					arrFrase[i] = "baja";
				}else{
					arrFrase[i] = "bajo";
				}
				break;
			case "spanish":
				if(arrFrase[0].equals("ella")) {
					arrFrase[i] = "española";
				}else{
					arrFrase[i] = "español";
				}
				break;
			}
		}
		
		/* 
		 Ahora creamos una cadena vacía y mediante un bucle for iremos agregando cada uno de los elementos del array previamente traducido.
		 */
		String cadena = "";
		for(i=0;i<arrFrase.length;i++) {
			cadena = cadena + arrFrase[i] + " ";
		}
		
		/* 
		 Mostramos el resultado por pantalla:
		 */
		System.out.println("Su traducción al ingles es: " + cadena);
		
	}
	
}
