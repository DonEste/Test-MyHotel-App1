package com.test.myhotel.testmyhotel.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "automovil")
public class Automovil extends Vehiculo {

	private String tipo;
	private int numeroPuertas;
	private int capacidadPasajeros;
	private int capacidadMaletero;

	public Automovil() {

	}

	public Automovil(int id, String marca, String modelo, String patente, int año, int kilometraje, int cilindrada, String tipo, int numeroPuertas, int capacidadPasajeros, int capacidadMaletero) {
		super(id, marca, modelo, patente, año, kilometraje, cilindrada);
		this.tipo = tipo;
		this.numeroPuertas = numeroPuertas;
		this.capacidadPasajeros = capacidadPasajeros;
		this.capacidadMaletero = capacidadMaletero;
	}

	@Override
	public void fill(Vehiculo vehiculo) {

		fillVehiculo(vehiculo);

		Automovil automovil = (Automovil) vehiculo;

		this.tipo = automovil.tipo;
		this.numeroPuertas = automovil.numeroPuertas;
		this.capacidadPasajeros = automovil.capacidadPasajeros;
		this.capacidadMaletero = automovil.capacidadMaletero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumeroPuertas() {
		return numeroPuertas;
	}

	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public int getCapacidadPasajeros() {
		return capacidadPasajeros;
	}

	public void setCapacidadPasajeros(int capacidadPasajeros) {
		this.capacidadPasajeros = capacidadPasajeros;
	}

	public int getCapacidadMaletero() {
		return capacidadMaletero;
	}

	public void setCapacidadMaletero(int capacidadMaletero) {
		this.capacidadMaletero = capacidadMaletero;
	}

}
