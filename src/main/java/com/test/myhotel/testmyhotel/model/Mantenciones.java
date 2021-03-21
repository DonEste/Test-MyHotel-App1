package com.test.myhotel.testmyhotel.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(appliesTo = "mantenciones")
public class Mantenciones {

	@Id
	@GeneratedValue
	private int id;
	private int vehiculo;
	private Timestamp fecha;
}
