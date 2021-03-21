package com.test.myhotel.testmyhotel.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.annotations.Table;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorValue(value = "camion")
public class Camion extends Vehiculo {

	private String tipo;
	private int capacidadToneladas;
	private int cantidadEjes;

	@Override
	public void fill(Vehiculo vehiculo) {

		fillVehiculo(vehiculo);

		Camion camion = (Camion) vehiculo;

		this.tipo = camion.tipo;
		this.capacidadToneladas = camion.capacidadToneladas;
		this.cantidadEjes = camion.cantidadEjes;
	}
}
