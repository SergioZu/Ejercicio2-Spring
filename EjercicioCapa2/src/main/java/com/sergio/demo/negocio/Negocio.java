package com.sergio.demo.negocio;





import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sergio.demo.consultaDatos.Datos;
import com.sergio.demo.consultaDatos.IDatos;


@Component
public class Negocio  implements INegocio{
	@Autowired
	IDatos iDatos;
	Double iMC;
	public Negocio() {
		
	}
	
	public void RecogerDatos(String nombre) throws FileNotFoundException, IOException {
		
		iDatos.consultaFichero(nombre);
		
	}
	
	public double comprobarIMC() {
		iMC=Double.valueOf(iDatos.getpeso().get(0))/(Double.valueOf(iDatos.getaltura().get(0))/100);
		return iMC;
	}

}
