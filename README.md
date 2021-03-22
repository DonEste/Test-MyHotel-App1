# MyHotel Test

## Compilar el proyecto
	
	./mvnw clean package
	
## ejecutar el proyecto
	
	java -jar target/test-myhotel-0.0.1-SNAPSHOT.jar

## BD:
    Se debe configurar la conexión a alguna BD MySQL para que se creen las tablas necesarias, que en este caso son la tabla vehiculos y la tabla mantenciones
    Estas tablas las creará Hybernate, solamante es necesario tener una conexión a un schema válido

## Estructura del proyecto
    Es la estrctura estándar de Spring Boot, con los paquetes controller, service, model y repository.
    Solo es necesario tener un JRE o JDK instalado, preferentemente la versión 11
	
## Los endpint son los siguientes:

	Listar todos los vehículos (GET)
		http://localhost:8080/vehiculos

	Buscar un vehículo por ID (GET)
		http://localhost:8080/vehiculo/{id}

	Insertar un vehículo (POST) - Puede recibir tanto automoviles como camiones con la estructura que se especificó en las instrucciones
    Todos excepto el campo "tipoVehiculo" son opcionales
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

    Insertar un listado de vehiculos - Puede recibir tanto automoviles como camiones con la estructura que se especificó en las instrucciones
    Todos excepto el campo "tipoVehiculo" son opcionales
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

	Actualizar un vehiculo (PUT) - Puede recibir tanto automoviles como camiones con la estructura que se especificó en las instrucciones
    El id es obligatorio para actualizar el registro
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

    Agregar una mantención (POST) - Es necesario el objeto de el vehículo que se asociará con la mantención, este al igual que los demás endpoin puede recibir un camion o un automovil
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

    Los objetos JSON en cada endpoint deberían funcionar perfectamente para hacer pruebas

## Manejo de errores
    Para este caso no me pareció necesario agregar un manejo de errores más detallado, ya qu los errores arrojados por defecto son suficientemente descriptivos
	
## GIT Repository
	https://github.com/DonEste/Test-MyHotel-App1

## comentarios
	Generalmente todo lo que respecta al código y la documentación es en ingles, pero en este caso ya que las entidades tenían nombres en español, hice algunas partes en español para mantener los nombres y que no quede tan extraño tener solo esos nombres en español
	