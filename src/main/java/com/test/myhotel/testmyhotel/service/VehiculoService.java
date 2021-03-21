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
	private AutomovilRepository repository;

	@Autowired
	private MantencionRepository mantencionRepository;

	public Vehiculo saveVehiculo(Vehiculo vehiculo) {
		if (vehiculo instanceof Automovil) {
			System.out.println("Es un automovil");
		} else {
			System.out.println("Es un camion?: ");
		}
		return repository.save(vehiculo);
	}

	public List<Vehiculo> saveVehiculos(List<Vehiculo> vehiculos) {

		for (Vehiculo v : vehiculos) {
			if (v instanceof Automovil) {
				System.out.println("Es un automovil");
			} else {
				System.out.println("Es un camion?: ");
			}
		}
		return repository.saveAll(vehiculos);
	}

	public List<Vehiculo> getVehiculos() {
		return repository.findAll();
	}

	public Vehiculo getVehiculoById(int id) {
		return repository.findById(id).orElse(null);
	}

	public String deleteVehiculo(int id) {
		repository.deleteById(id);
		return "Vehiculo removido: " + id;
	}

	public Vehiculo updateVehiculo(Vehiculo vehiculo) {
		if (vehiculo instanceof Automovil) {
			System.out.println("Es un automovil");
		} else {
			System.out.println("Es un camion?: ");
		}
		Vehiculo vehiculoGuardado = repository.findById(vehiculo.getId()).orElse(null);
		vehiculoGuardado.fill(vehiculo);
		return repository.save(vehiculoGuardado);
	}

	public Mantencion addMantencionVehiculo(Mantencion mantencion) {
		return mantencionRepository.save(mantencion);
	}

}
