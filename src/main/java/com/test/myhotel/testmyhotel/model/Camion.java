package com.test.myhotel.testmyhotel.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "camion")
public class Camion extends Vehiculo {

	private String tipo;
	private int capacidadToneladas;
	private int cantidadEjes;

	public Camion() {
		
	}

	public Camion(int id, String marca, String modelo, String patente, int año, int kilometraje, int cilindrada, String tipo, int capacidadToneladas, int cantidadEjes) {
		super(id, marca, modelo, patente, año, kilometraje, cilindrada);
		this.tipo = tipo;
		this.capacidadToneladas = capacidadToneladas;
		this.cantidadEjes = cantidadEjes;
	}

	@Override
	public void fill(Vehiculo vehiculo) {

		fillVehiculo(vehiculo);

		Camion camion = (Camion) vehiculo;

		this.tipo = camion.tipo;
		this.capacidadToneladas = camion.capacidadToneladas;
		this.cantidadEjes = camion.cantidadEjes;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCapacidadToneladas() {
		return capacidadToneladas;
	}

	public void setCapacidadToneladas(int capacidadToneladas) {
		this.capacidadToneladas = capacidadToneladas;
	}

	public int getCantidadEjes() {
		return cantidadEjes;
	}

	public void setCantidadEjes(int cantidadEjes) {
		this.cantidadEjes = cantidadEjes;
	}
	
}
