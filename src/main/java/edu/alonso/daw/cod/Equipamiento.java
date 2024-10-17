package edu.alonso.daw.cod;

import java.util.Objects;

public class Equipamiento {
	
	private static int cont_id = 1;
	
	private int id;
	private int espaciosOcupa;
	private String nombre;
	
	
	public Equipamiento(String nombre, int espaciosOcupa) {
		this.id = cont_id++;
		this.espaciosOcupa = espaciosOcupa;
		this.nombre = nombre;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEspaciosOcupa() {
		return espaciosOcupa;
	}
	public void setEspaciosOcupa(int espaciosOcupa) {
		this.espaciosOcupa = espaciosOcupa;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "\nid: " + id + "\nEspacios ocupa en la mochila: " + espaciosOcupa + "\nNombre: " + nombre;
	}
	@Override
	public int hashCode() {
		return Objects.hash(espaciosOcupa, id, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equipamiento other = (Equipamiento) obj;
		return espaciosOcupa == other.espaciosOcupa && id == other.id && Objects.equals(nombre, other.nombre);
	}

	
	
	

}
