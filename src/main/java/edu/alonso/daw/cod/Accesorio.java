package edu.alonso.daw.cod;

import java.util.Objects;

public class Accesorio extends Equipamiento {

	public double precio;

	public Accesorio(String nombre, int espaciosEnMochila, double precio) {
		super(nombre, espaciosEnMochila);
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Accesorio" + super.toString() +  "\nPrecio: " + precio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(precio);
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
		Accesorio other = (Accesorio) obj;
		return Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}

}
