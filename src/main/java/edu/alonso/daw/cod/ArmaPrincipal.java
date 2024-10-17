package edu.alonso.daw.cod;

public class ArmaPrincipal extends Arma {
	
	private int municion;
	
	public ArmaPrincipal(String nombre, int espaciosOcupa, int municion) {
		super(nombre, espaciosOcupa);
		this.municion = municion;
	}

	public ArmaPrincipal(int espaciosOcupa, String nombre, int tasaFuego, int rango, int municion) {
		super(nombre, espaciosOcupa, tasaFuego, rango);
		this.municion = municion;
	}

	public int getMunicion() {
		return municion;
	}

	@Override
	public String toString() {
		return "Arma principal: " +  super.toString() + "\nMunición: " + municion;
	}


}
