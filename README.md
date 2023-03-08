# README RETO_BACK #
# API de reto back #
Este API es una aplicación de Java 17 construida con Spring Boot 3.1.0-SNAPSHOT que permite a los usuarios crear, leer, actualizar y eliminar cuentas .

Funcionalidades
El API proporciona las siguientes funcionalidades para manejar cuentas :

Crear una nueva cuenta .
Leer todas las cuentas .
Leer una cuenta  por su ID.
Actualizar una cuenta  existente.
Eliminar una cuenta .
Cada cuenta  tiene los siguientes atributos:

- Nombre del cliente.
- Número de cuenta.
- Saldo de la cuenta.
- Estado de la cuenta. 

Uso:  
El API se puede usar a través de las siguientes URLs:

- POST http://localhost:8080/api/v1/accounts: crea una nueva cuenta .
- GET http://localhost:8080/api/v1/accounts: devuelve una lista de todas las cuentas .
- GET http://localhost:8080/api/v1/accounts/{id}: devuelve una cuenta  específica según su ID.
- PUT http://localhost:8080/api/v1/accounts/{id}: actualiza una cuenta  existente según su ID.
- DELETE http://localhost:8080/api/v1/accounts/{id}: elimina una cuenta  según su ID.

Parámetros de solicitud
Para crear una cuenta , se deben proporcionar los siguientes parámetros en formato JSON:
```
{
"clientAccount": "1111",
"clientName": "Angel Mendoza",
"accBalance": "10.00",
"accStatus": "ok"
}
```
Para actualizar una cuenta , se deben proporcionar los siguientes parámetros en formato JSON:
```
{
"clientId": 1,
"clientAccount": "1122",
"clientName": "Yorleany Polo",
"accBalance": "12.3",
"accStatus": "ok"
}
```
