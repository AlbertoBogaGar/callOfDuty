package edu.alonso.daw.cod;

import java.util.Objects;

public class Arma extends Equipamiento {
	
	private final int TASA_FUEGO_DEF = 10;
	private final int RANGO_DEF = 10;
	
	private int tasaFuego;
	private int rango;
	
	
	public Arma(String nombre, int espaciosOcupa) {
		super(nombre, espaciosOcupa);
		this.tasaFuego = TASA_FUEGO_DEF;
		this.rango = RANGO_DEF;
	}
    

	public Arma(String nombre, int espaciosOcupa, int tasaFuego, int rango) {
		super(nombre, espaciosOcupa);
		this.tasaFuego = tasaFuego;
		this.rango = rango;
	}
	public int getTasaFuego() {
		return tasaFuego;
	}
	public void setTasaFuego(int tasaFuego) {
		this.tasaFuego = tasaFuego;
	}
	public int getRango() {
		return rango;
	}
	public void setRango(int rango) {
		this.rango = rango;
	}
	@Override
	public String toString() {
		return super.toString() + "\nTasa Fuego " + tasaFuego + "\nRango: " + rango;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(rango, tasaFuego);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arma other = (Arma) obj;
		return rango == other.rango && tasaFuego == other.tasaFuego;
	}
}
