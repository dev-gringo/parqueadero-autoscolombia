# Autos Colombia - Sistema de Gestión de Parqueaderos 

**Autos Colombia** es una solución backend desarrollada para digitalizar y optimizar la operación diaria de estacionamientos. El sistema permite gestionar el flujo de vehículos, controlar la disponibilidad de celdas en tiempo real y automatizar el cálculo de tiempos de permanencia.

##  Estado del Proyecto (Iteración 1)

* Actualmente, el proyecto ha completado su primera fase de integración, logrando la persistencia de datos real y la exposición de servicios REST funcionales. Se ha migrado exitosamente de una base de datos en memoria a un entorno persistente con MySQL.

## Tecnologías Utilizadas

* **Lenguaje:** Java 17+
* **Framework:** Spring Boot 3.x
* **Gestor de Dependencias:** Maven
* **Persistencia:** Spring Data JPA
* **Base de Datos:** H2 (Memoria para desarrollo) / MySQL (Producción)
* **Herramientas:** Git para control de versiones.

## Estructura del Proyecto

El proyecto sigue una estructura de paquetes organizada por responsabilidades:
* `com.autoscolombia.model`: Entidades del dominio (Vehículo, Movimiento, etc.).
* `com.autoscolombia.repository`: Interfaces para el acceso a datos.
* `com.autoscolombia.service`: Lógica de negocio y reglas del sistema.
* `com.autoscolombia.controller`: Endpoints de la API REST.

## 🔧 Configuración e Instalación

1. **Clonar el repositorio:**
   ```bash
   git clone https://github.com/dev-gringo/parqueadero-autoscolombia.git
