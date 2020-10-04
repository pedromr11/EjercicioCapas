package com.pedro.presentacion;

import java.io.IOException;
import java.util.Scanner;

import com.pedro.negocio.Logica;

public class Vista {

	public static void main(String[] args) throws IOException {
		
		
		//Creamos el scanner.
		Scanner sc = new Scanner(System.in);
		//Pedimos al usuario que introduzca un nombre de la lista.
		System.out.println("Introduzca el nombre de la persona."+"\n");
		
		
		String nombre = sc.next();
		
		//Imprimimos el resultado de los coches que tiene la persona introducida. 
		System.out.println("Tiene " + new Logica().coches(nombre) + "coche/es.");
		
		
	}

}
