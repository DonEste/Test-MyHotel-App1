package com.test.myhotel.testmyhotel.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.myhotel.testmyhotel.model.Automovil;
import com.test.myhotel.testmyhotel.model.Mantencion;
import com.test.myhotel.testmyhotel.model.Vehiculo;
import com.test.myhotel.testmyhotel.repository.AutomovilRepository;
import com.test.myhotel.testmyhotel.repository.MantencionRepository;

import java.util.List;

@Service
public class VehiculoService {
	@Autowired
	private AutomovilRepository vehiculoRepository;

	@Autowired
	private MantencionRepository mantencionRepository;

	public Vehiculo saveVehiculo(Vehiculo vehiculo) {
		if (vehiculo instanceof Automovil) {
			System.out.println("Es un automovil");
		} else {
			System.out.println("Es un camion?: ");
		}
		return vehiculoRepository.save(vehiculo);
	}

	public List<Vehiculo> saveVehiculos(List<Vehiculo> vehiculos) {

		for (Vehiculo v : vehiculos) {
			if (v instanceof Automovil) {
				System.out.println("Es un automovil");
			} else {
				System.out.println("Es un camion?: ");
			}
		}
		return vehiculoRepository.saveAll(vehiculos);
	}

	public List<Vehiculo> getVehiculos() {
		return vehiculoRepository.findAll();
	}

	public Vehiculo getVehiculoById(int id) {
		return vehiculoRepository.findById(id).orElse(null);
	}

	public String deleteVehiculo(int id) {
		vehiculoRepository.deleteById(id);
		return "Vehiculo removido: " + id;
	}

	public Vehiculo updateVehiculo(Vehiculo vehiculo) {
		if (vehiculo instanceof Automovil) {
			System.out.println("Es un automovil");
		} else {
			System.out.println("Es un camion?: ");
		}
		Vehiculo vehiculoGuardado = vehiculoRepository.findById(vehiculo.getId()).orElse(null);
		vehiculoGuardado.fill(vehiculo);
		return vehiculoRepository.save(vehiculoGuardado);
	}

	public Mantencion addMantencionVehiculo(Mantencion mantencion) {
		return mantencionRepository.save(mantencion);
	}

}
