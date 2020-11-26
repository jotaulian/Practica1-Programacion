package es.studium.Programacion;

import java.util.Scanner;

public class Hopolapa
{

	public static void main(String[] args)
	{
		
		String cadena;
		Scanner teclado = new Scanner(System.in);
		/*
		 Pedimos una cadena por pantalla y guardo el valor ingresado por teclado en la variable "cadena".
		 */
		System.out.println("Por favor, ingresa una cadena: ");
		cadena = teclado.nextLine();
		teclado.close();
		
		/*
		 Reemplazamos cada vocal de la cadena por --> La vocal más una "p" y la vocal.
		 */
		cadena = cadena.replace("a","apa").replace("e","epe").replace("i","ipi").replace("o","opo").replace("u","upu");
		
		//Mostramos la cadena por pantalla_
		System.out.println(cadena);
	}

}
