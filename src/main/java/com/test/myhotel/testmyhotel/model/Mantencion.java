package com.test.myhotel.testmyhotel.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Mantencion {

	@Id
	@GeneratedValue
	private int id;
	@ManyToOne
    @JoinColumn(name = "vehiculo_id")
	@JsonBackReference
	private Vehiculo vehiculo;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private Timestamp fecha;

	public Mantencion() {

	}

	public Mantencion(int id, Vehiculo vehiculo, Timestamp fecha) {
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

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Timestamp getFecha() {
		return fecha;
	}

	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}

}
