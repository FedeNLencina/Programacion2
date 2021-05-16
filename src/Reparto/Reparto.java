package Reparto;

import java.util.HashMap;
import java.util.Map;

public class Reparto {
	// clave = nombre del depósito
	// valor = depósito
	private Map<String,Deposito> depositos;
	
	// clave = código del paquete
	// valor = nombre del depósito
	private Map<Integer,String> paquetes;

	public Reparto() {
		paquetes = new HashMap<Integer,String>();
		depositos = new HashMap<String,Deposito>();
		crearDeposito("DESPACHO");
	}
	public void crearDeposito(String nombre){
		if (nombre==null)
			throw new RuntimeException("No esta informado el nombre del deposito");
		if (depositos.containsKey(nombre))
			throw new RuntimeException("Ya existe un deposito con nombre "+nombre);
		depositos.put(nombre, new Deposito());
	}
	public void cargarPaquete(String nomDep, int cod, String dest){
		if (!depositos.containsKey(nomDep))
			throw new RuntimeException("No existe un deposito con nombre "+nomDep);
		if (paquetes.containsKey(cod))
			throw new RuntimeException("Ya existe un paquete con codigo "+cod);
		depositos.get(nomDep).agregarPaquete(cod, dest);
		paquetes.put(cod, nomDep);
	}
	public boolean quitarPaquete(String nomDep, int cod){
		if (!depositos.containsKey(nomDep))
			return false;
		if (depositos.get(nomDep).quitarPaquete(cod)==null)
			return false;
		paquetes.remove(cod);
		return true;
	}
	public boolean cargarDespacho(int[] paq, String destCam){
		boolean todos = true;
		String nomDep, dest;
		for (int cod: paq) {
			nomDep = paquetes.get(cod);
			if (nomDep!=null) {
				dest = depositos.get(nomDep).quitarPaquete(cod);
				if (dest==destCam) {
					depositos.get("DESPACHO").agregarPaquete(cod, dest);
					paquetes.put(cod,"DESPACHO");
				}
				else {
					depositos.get(nomDep).agregarPaquete(cod, dest);
					todos = false;
				}
			}
			else
				todos = false;
		}
		return todos;
	}
}
