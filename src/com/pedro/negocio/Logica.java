package com.pedro.negocio;

import java.io.IOException;
import java.util.ArrayList;

import com.pedro.datos.Datos;

public class Logica {
	
	public Integer coches(String nombre) { 
		
		//Creo una varibale y la igualo a 0 para ir sumandole 1 en el bucle hasta que acabe la lista
		int numeroCoches = 0;
		
		//Creo un objeto de la clase datos
		Datos d = new Datos();
		ArrayList<String> listNom;
		try {
			listNom = new ArrayList <String> (d.consultaCoches(nombre));
			
			//Aquí se va recorriendo la lista y viendo los coches que tiene el nombre que hayamos metido
			for(int i = 0; i < listNom.size(); i++) {
				if(listNom.get(i).equals(nombre)) {
					numeroCoches++;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return numeroCoches;
		
	}

}