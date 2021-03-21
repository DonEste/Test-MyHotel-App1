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

@Entity
@DiscriminatorColumn(name = "tipoVehiculo")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "tipoVehiculo")
@JsonSubTypes({ @Type(value = Automovil.class, name = "automovil"), @Type(value = Camion.class, name = "camion") })
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

	public Vehiculo() {

	}

	public Vehiculo(int id, String marca, String modelo, String patente, int año, int kilometraje, int cilindrada) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.año = año;
		this.kilometraje = kilometraje;
		this.cilindrada = cilindrada;
	}

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

}
