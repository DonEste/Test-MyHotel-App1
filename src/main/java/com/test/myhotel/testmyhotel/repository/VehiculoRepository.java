package com.test.myhotel.testmyhotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.myhotel.testmyhotel.model.Vehiculo;

public interface VehiculoRepository<V extends Vehiculo> extends JpaRepository<Vehiculo, Integer>  {

}
