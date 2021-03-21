# MyHotel Test

## Compilar el proyecto
	
	./mvnw clean package
	
## ejecutar el proyecto
	
	java -jar target/test-myhotel-0.0.1-SNAPSHOT.jar

## BD:
    Se debe configurar la conexión a alguna BD MySQL para que se creen las tablas necesarias, que en este caso son la tabla vehiculos y la tabla mantenciones
	
## Los endpint son los siguientes:

	Listar todos los vehículos (GET)
		http://localhost:8080/vehiculos

	Buscar un vehículo por ID (GET)
		http://localhost:8080/vehiculo/{id}

	Insertar un vehículo (POST)
		http://localhost:8080/vehiculo/
			Body:
			{
                "tipoVehiculo": "camion",
                "marca": "Iveco",
                "modelo": "Superior",
                "patente": "ASDS-5652",
                "año": "1997",
                "kilometraje": 1500,
                "cilindrada": 3000,
                "tipo": "Tolba",
                "capacidadToneladas": 1000,
                "cantidadEjes": 2
            }

    Insertar un listado de vehiculos
        http://localhost:8080/vehiculos/
            Body:
            [
                {
                    "tipoVehiculo": "automovil",
                    "marca": "Ferrari",
                    "modelo": "F1",
                    "patente": "KFW-044",
                    "año": 2020,
                    "kilometraje": 5000,
                    "cilindrada": 190,
                    "tipo": "hashback",
                    "numeroPuertas": 2,
                    "capacidadPasajeros": 2,
                    "capacidadMaletero": 500
                },
                {
                    "tipoVehiculo": "camion",
                    "marca": "Tres Chanchitos",
                    "modelo": "Camionero",
                    "patente": "KFW-044",
                    "año": 1997,
                    "kilometraje": 5000,
                    "cilindrada": 190,
                    "tipo": "Minero",
                    "capacidadToneladas": 2000,
                    "cantidadEjes": 5
                },
                {
                    "tipoVehiculo": "automovil",
                    "marca": "Kia",
                    "modelo": "Moorning",
                    "patente": "AAA-444",
                    "año": 2000,
                    "kilometraje": 5000,
                    "cilindrada": 600,
                    "tipo": "Compacto",
                    "numeroPuertas": 5,
                    "capacidadPasajeros": 2,
                    "capacidadMaletero": 500
                }
            ]   

	Actualizar un vehiculo (PUT)
		http://localhost:8080/persona/
			Body:
			{
                "id": 1
                "tipoVehiculo": "automovil",
                "marca": "Ferrari",
                "modelo": "F1",
                "patente": "KFW-044",
                "año": 2020,
                "kilometraje": 5000,
                "cilindrada": 190,
                "tipo": "hashback",
                "numeroPuertas": 2,
                "capacidadPasajeros": 2,
                "capacidadMaletero": 500
            }

	Eliminar un vehiculo (DELETE)
		http://localhost:8080/vehiculo/{id}

    Agregar una mantención (DELETE)
		http://localhost:8080/mantencion/{id}
            Body
            {
                {
                    "tipoVehiculo": "automovil",
                    "marca": "Kia",
                    "id": 4,
                    "modelo": "Moorning",
                    "patente": "AAA-444",
                    "año": 2000,
                    "kilometraje": 5000,
                    "cilindrada": 600,
                    "tipo": "Compacto",
                    "numeroPuertas": 5,
                    "capacidadPasajeros": 2,
                    "capacidadMaletero": 500
                }, 
                "fecha": "03-03-2021"
            }
    Con respecto a las mantenciones voy a suponer que es solo para guardar el historial de lkas mantenciones por vehículo, por lo que solo se podrá ingresar mantenciones, y no modificarlas ni editarlas.
	
## GIT Repository
	https://gitlab.com/matiascarreno/nisum-test

## comentarios
	Generalmente todo lo que respecta al código y la documentación es en ingles, pero en este caso ya que las entidades tenían nombres en español, hice algunas partes en español para mantener los nombres y que no quede tan extraño tener solo esos nombres en español
	