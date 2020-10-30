package com.sergio.demo.negocio;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface INegocio {
	void RecogerDatos(String nombre) throws FileNotFoundException, IOException;
	double comprobarIMC();
}
