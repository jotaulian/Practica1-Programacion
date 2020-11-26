package es.studium.Programacion;

import java.util.Scanner;

public class Iva
{

	public static void main(String[] args)
	{
		float cantidad, iva, calculo;
		Scanner teclado = new Scanner(System.in);
		//Inicio un bucle que realizara las instrucciones indicadas al menos una vez. 
		do
		{
			//Pido la cantidad monetaria por pantalla y guardo el valor ingresado en la variable "cantidad".
			System.out.println("Ingresar cantidad monetaria: ");
			cantidad = teclado.nextFloat();
			
			//Pido el IVA por pantalla y guardo el valor ingresado en la variable "iva".
			System.out.println("Ingresar el IVA que desea aplicarle a esa cantidad: ");
			iva = teclado.nextFloat();
			
			//Multiplico la cantidad ingresada por el iva y lo guardo en una variable llamada "calculo".
			calculo = cantidad*iva;
			
			//Muestro por pantalla el resultado del calculo.
			System.out.println("El IVA correspondiente a la cantidad indicada es de: " + calculo);
		} 		
		//Si la cantidad es diferente a cero, el bucle continuara corriendo.
		while (cantidad != 0.0);
		teclado.close();
	}
}
