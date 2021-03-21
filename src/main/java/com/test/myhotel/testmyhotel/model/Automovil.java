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
@DiscriminatorValue(value = "automovil")
public class Automovil extends Vehiculo {

	private String tipo;
	private int numeroPuertas;
	private int capacidadPasajeros;
	private int capacidadMaletero;

	@Override
	public void fill(Vehiculo vehiculo) {

		fillVehiculo(vehiculo);

		Automovil automovil = (Automovil) vehiculo;

		this.tipo = automovil.tipo;
		this.numeroPuertas = automovil.numeroPuertas;
		this.capacidadPasajeros = automovil.capacidadPasajeros;
		this.capacidadMaletero = automovil.capacidadMaletero;
	}

}
