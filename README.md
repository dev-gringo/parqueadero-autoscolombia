# Autos Colombia - Sistema de Gestión de Parqueaderos 

**Autos Colombia** es una solución backend desarrollada para digitalizar y optimizar la operación diaria de estacionamientos. El sistema permite gestionar el flujo de vehículos, controlar la disponibilidad de celdas en tiempo real y automatizar el cálculo de tiempos de permanencia.

##  Estado del Proyecto (Iteración 1)

* Actualmente, el proyecto ha completado su primera fase de integración, logrando la persistencia de datos real y la exposición de servicios REST funcionales. Se ha migrado exitosamente de una base de datos en memoria a un entorno persistente con MySQL.

## Tecnologías Utilizadas

* **Lenguaje:** Java 17+
* **Framework:** Spring Boot 3.4.3
* **Gestor de Dependencias:** Maven
* **Persistencia:** Spring Data JPA
* **Base de Datos:** MYSQL 8.0
* **Herramientas:** Git para control de versiones.
* **pruebas de API:** Postman

## Estructura del Proyecto

El proyecto sigue una estructura de paquetes organizada por responsabilidades:
* `com.autoscolombia.model`: Entidades JPA que representan las tablas de la base de datos parqueadero_autoscolombia.
* `com.autoscolombia.repository`: Interfaces para el acceso a datos.
* `com.autoscolombia.service`: Lógica de negocio y reglas del sistema.
* `com.autoscolombia.controller`: Endpoints de la API REST.

## 🔧 Configuración e Instalación
**1. Requisitos Previos**
* Java JDK 17 o superior.
* MySQL Server activo.
* Un IDE (IntelliJ IDEA recomendado).

**2. Base de Datos**
* Asegúrese de crear la base de datos y las tablas ejecutando el script de inicialización en su cliente MySQL:
* CREATE DATABASE parqueadero_autoscolombia;
*USE parqueadero_autoscolombia;
*Ejecutar script de creación de tablas e inserts iniciales
   
   **3. Configuración de Spring**
   *Actualice las credenciales en el archivo src/main/resources/application.properties:
   *spring.datasource.url=jdbc:mysql://localhost:3306/parqueadero_autoscolombia
   *spring.datasource.username=root
   *spring.datasource.password=NuevaClave2026

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/dev-gringo/parqueadero-autoscolombia.git
