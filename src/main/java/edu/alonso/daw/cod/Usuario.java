package edu.alonso.daw.cod;

import java.util.Arrays;
import java.util.Objects;

public class Usuario {
	
	private final int NUM_ESPACIOS_DEFECTO = 10;
	
	public Usuario(String nombre) {
		this.nombre = nombre;
		this.limiteEspaciosMochila = NUM_ESPACIOS_DEFECTO;
	}
	
	public Usuario(String nombre, int limiteEspaciosMochila) {
		this.nombre = nombre;
		this.limiteEspaciosMochila = limiteEspaciosMochila;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getLimiteEspaciosMochila() {
		return limiteEspaciosMochila;
	}
	public void setLimiteEspaciosMochila(int limiteEspaciosMochila) {
		this.limiteEspaciosMochila = limiteEspaciosMochila;
	}
	public Arma getArmaPrincipal() {
		return armaPrincipal;
	}
	public void setArmaPrincipal(Arma armaPrincipal) {
		this.armaPrincipal = armaPrincipal;
	}
	public Arma getArmaSecundaria() {
		return armaSecundaria;
	}
	public void setArmaSecundaria(Arma armaSecundaria) {
		this.armaSecundaria = armaSecundaria;
	}
	public Accesorio[] getAccesorios() {
		return accesorios;
	}
	public void setAccesorios(Accesorio[] accesorios) {
		this.accesorios = accesorios;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", limiteEspaciosMochila=" + limiteEspaciosMochila + ", armaPrincipal="
				+ armaPrincipal + ", armaSecundaria=" + armaSecundaria + ", accesorios=" + Arrays.toString(accesorios)
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(accesorios);
		result = prime * result + Objects.hash(armaPrincipal, armaSecundaria, limiteEspaciosMochila, nombre);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Arrays.equals(accesorios, other.accesorios) && Objects.equals(armaPrincipal, other.armaPrincipal)
				&& Objects.equals(armaSecundaria, other.armaSecundaria)
				&& limiteEspaciosMochila == other.limiteEspaciosMochila && Objects.equals(nombre, other.nombre);
	}
	private String nombre;
	private int limiteEspaciosMochila;
	private Arma armaPrincipal;
	private Arma armaSecundaria;
	private Accesorio[] accesorios;
	
	
	

}
