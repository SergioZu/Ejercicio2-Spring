package com.sergio.demo.consultaDatos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IDatos {
	void consultaFichero(String nombre) throws FileNotFoundException, IOException;
	
	List<String> getaltura();
	List<String> getpeso();
}
