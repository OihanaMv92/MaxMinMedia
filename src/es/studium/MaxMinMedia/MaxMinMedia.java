package es.studium.MaxMinMedia;

import java.util.Scanner;

public class MaxMinMedia
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		int suma=0;
		int max;
		int min;
		int[] tabla=new int [10];
		for (int i=0;i<=9;i++)
		{
			tabla[i] = 0;
		}
		for (int i=0;i<=9;i++)
		{
			System.out.println("Indique el valor de la tabla en la posicion" +i);
			tabla[i] = teclado.nextInt();
		}
		max = tabla[0];
		min = tabla[0];
		for (int i=0;i<=9;i++)
		{
			suma=suma+tabla[i];
			if (tabla[i]>max)
			{
				max=tabla[i];
			}

			   if(tabla[i]<min)
               {
                          min=tabla[i];
               }
   }
   System.out.println("La media de todos los n�meros indicados es: "+((float)suma/(float)10));
   System.out.println("El n�mero m�ximo de los indicados es: "+max);
   System.out.println("El n�mero m�nimo de los indicados es: "+min);
   teclado.close();
}
}
