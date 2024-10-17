package edu.alonso.daw.cod;

public class ArmaSecundaria extends Arma {

	private String tipo; // Machete, Sable_laser....


	public ArmaSecundaria(String nombre, int espaciosEnMochila, String tipo) {
		super(nombre, espaciosEnMochila);
		this.tipo = tipo;
	}


	public String getTipo() {
		return tipo;
	}


	@Override
	public String toString() {
		return "Arma secundaria: " +  super.toString() + "\nTipo: " + tipo;
	}

	
	
}
