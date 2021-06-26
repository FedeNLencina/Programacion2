package Parcial2_2021;

import java.util.HashMap;
import java.util.Iterator;

import Entregable2ResolucionEnClase.Prog2_Entregables.src.tarea2.Alumno;

public class CarritoVenta {
	private HashMap<String, Producto> productos;
	
	
	public CarritoVenta() {
		this.productos= new HashMap<String, Producto>();	
	}
	
	public float importe() {
		float precio=0;
		for(Producto producto: productos.values()) {
			precio = precio +  producto.getPrecio();
		}
		return precio;
	}
	
	public boolean agregar(String nombre, float costo,String codigo ) {
	if (productos.containsKey(nombre))
		return false;
	productos.put(nombre, new Producto(nombre, costo, codigo);
		return true;
	}
	public void eliminarProducto(String nombre) {
		productos.remove(nombre);
	}	
}
