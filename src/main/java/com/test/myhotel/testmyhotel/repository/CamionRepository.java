package com.test.myhotel.testmyhotel.repository;

import javax.transaction.Transactional;
import com.test.myhotel.testmyhotel.model.Camion;

@Transactional
public interface CamionRepository extends VehiculoRepository<Camion>{
	
}
