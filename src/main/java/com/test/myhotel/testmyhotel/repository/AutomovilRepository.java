package com.test.myhotel.testmyhotel.repository;

import javax.transaction.Transactional;
import com.test.myhotel.testmyhotel.model.Automovil;

@Transactional
public interface AutomovilRepository extends VehiculoRepository<Automovil> {

}
