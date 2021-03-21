package com.test.myhotel.testmyhotel.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

@Entity
@Table(appliesTo = "mantenciones")
public class Mantenciones {

	@Id
	@GeneratedValue
	private int id;
	private int vehiculo;
	private Timestamp fecha;

	public Mantenciones() {

	}

	public Mantenciones(int id, int vehiculo, Timestamp fecha) {
		super();
		this.id = id;
		this.vehiculo = vehiculo;
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(int vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Timestamp getFecha() {
		return fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

}
