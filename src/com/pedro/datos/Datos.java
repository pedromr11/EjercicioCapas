package com.pedro.datos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Datos {
	
	public List<String> consultaCoches(String nombre) throws IOException {
		
		//Decimos donde esta el fichero ubicado
		File file = new File("C:\\Users\\Usuario\\Desktop\\EjercicioCapas.txt");
		BufferedReader lector;
		
		//Creamos un ArrayList para los nombres de la lista
		List<String> listaNombres = new ArrayList();
		
		//Vamos leyendo el fichero
		lector = new BufferedReader(new FileReader(file));
		String linea;
		
		while((linea = lector.readLine()) != null) {
			
			String[] arrayCoche = linea.split("-");
			listaNombres.add(arrayCoche[0]);
		}
		
		
		
		return listaNombres;		
	}
	
	
	
	
	
}
