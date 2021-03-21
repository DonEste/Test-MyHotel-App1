package com.test.myhotel.testmyhotel.model;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorColumn(name = "tipoVehiculo")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@JsonTypeInfo(
		  use = JsonTypeInfo.Id.NAME, 
		  include = JsonTypeInfo.As.PROPERTY, 
		  property = "tipoVehiculo")
		@JsonSubTypes({ 
		  @Type(value = Automovil.class, name = "automovil"), 
		  @Type(value = Camion.class, name = "camion") 
		})
public abstract class Vehiculo {

	@Id
	@GeneratedValue
	private int id;
	private String marca;
	private String modelo;
	private String patente;
	private int año;
	private int kilometraje;
	private int cilindrada;
	
	public abstract void fill(Vehiculo vehiculo);
	
	public void fillVehiculo(Vehiculo vehiculo) {
		this.marca = vehiculo.marca;
		this.modelo = vehiculo.modelo;
		this.patente = vehiculo.patente;
		this.año = vehiculo.año;
		this.kilometraje = vehiculo.kilometraje;
		this.cilindrada = vehiculo.cilindrada;
	}

	public void fill(Automovil vehiculo) {
		// TODO Auto-generated method stub
		
	}
}
