package es.Studium.TabEjer11Tema3;

import java.util.Scanner;

public class Simetrica 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int tabla[][] = new int[3][3];
		boolean asimetrica=true;
		Scanner teclado = new Scanner(System.in);
		//Metodo para introduccir datos a la matriz
		introducirDatos(tabla, teclado);
		//Metodo para comprobar si es simetrica la matriz
		asimetrica = comprobarAsimetria(tabla, asimetrica);
		//Mostramos por pantalla el resultado
		imprimirResultado(asimetrica);
		teclado.close();
	}

// Metodo para imprimir si es simetrica o no la matriz
	private static void imprimirResultado(boolean asimetrica) {
		if(asimetrica)
		{
			System.out.print("La matriz introducida es asimetrica");
		}
		else
		{
			System.out.print("La matriz introducida no es asimetrica");
		}
	}

// Funcion para comparar si es asimetrica la matriz
	private static Boolean comprobarAsimetria(int[][] tabla, Boolean asimetrica) {
		int i;
		int e;
		//ponemos un for para recorrer la fila del array
		for(i=0;(i<3)&&(asimetrica);i++)
		{
			//Ponemos un segundo for para recorrer la columna del array
			for(e=0;e<3;e++)
			{
				//Realizamos la comprobacion de si no es asimetrica
				if(tabla[i][e]!=-tabla[e][i])
				{
					//si no es simetrica cambiamos el valor a false
					asimetrica=false;
				}
			}
		}
		return asimetrica;
	}

	// Metodo para introducir los Datos de la matriz por el teclado
	private static void introducirDatos(int[][] tabla, Scanner teclado) {
		int i;
		int e;
		//ponemos un for para recorrer la fila del array
		for(i=0;i<3;i++)
		{
			//Ponemos un segundo for para recorrer la columna del array
			for(e=0;e<3;e++)
			{
				//pedimos que se introduzcan los datos, y leemos por teclado
				System.out.print("Escribir valor " + i + " , " + e + " : ");
	            tabla [i][e] = teclado.nextInt();
			}
		}
	}

}
