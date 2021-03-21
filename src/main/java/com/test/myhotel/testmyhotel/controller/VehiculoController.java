package com.test.myhotel.testmyhotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.myhotel.testmyhotel.model.Mantencion;
import com.test.myhotel.testmyhotel.model.Vehiculo;
import com.test.myhotel.testmyhotel.service.VehiculoService;

import java.util.List;

@RestController
public class VehiculoController {
	
	@Autowired
	private VehiculoService service;
	
	@PostMapping("/addVehiculo")
    public Vehiculo addVehiculo(@RequestBody Vehiculo vehiculo) {
        return service.saveVehiculo(vehiculo);
    }

    @PostMapping("/addVehiculos")
    public List<Vehiculo> addVehiculos(@RequestBody List<Vehiculo> vehiculos) {
        return service.saveVehiculos(vehiculos);
    }

    @GetMapping("/vehiculos")
    public List<Vehiculo> findAllVehiculos() {
        return service.getVehiculos();
    }

    @GetMapping("/vehiculoById/{id}")
    public Vehiculo findVehiculoById(@PathVariable int id) {
        return service.getVehiculoById(id);
    }

    @PutMapping("/update")
    public Vehiculo updateVehiculo(@RequestBody Vehiculo vehiculo) {
        return service.updateVehiculo(vehiculo);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteVehiculo(@PathVariable int id) {
        return service.deleteVehiculo(id);
    }

    @PostMapping("/addMantencion")
    public Mantencion deleteVehiculo(@RequestBody Mantencion mantencion) {
        return service.addMantencionVehiculo(mantencion);
    }

}
