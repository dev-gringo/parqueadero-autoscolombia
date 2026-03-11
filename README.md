# Autos Colombia - Sistema de Gestión de Parqueaderos 🚗

**Autos Colombia** es una solución backend desarrollada para digitalizar y optimizar la operación diaria de estacionamientos. El sistema permite gestionar el flujo de vehículos, controlar la disponibilidad de celdas en tiempo real y automatizar el cálculo de tiempos de permanencia.

## 🚀 Características Principales

* **Registro de Operaciones:** Control de entrada y salida de vehículos con sellado de tiempo.
* **Gestión de Celdas:** Monitoreo dinámico de espacios disponibles y ocupados.
* **Lógica Transaccional:** Procesamiento seguro de datos para garantizar la integridad de los registros.
* **Arquitectura Escalable:** Construido siguiendo principios de diseño limpio para facilitar futuras expansiones.

## 🛠️ Tecnologías Utilizadas

* **Lenguaje:** Java 17+
* **Framework:** Spring Boot 3.x
* **Gestor de Dependencias:** Maven
* **Persistencia:** Spring Data JPA
* **Base de Datos:** H2 (Memoria para desarrollo) / MySQL (Producción)
* **Herramientas:** Git para control de versiones.

## 📂 Estructura del Proyecto

El proyecto sigue una estructura de paquetes organizada por responsabilidades:
* `com.autoscolombia.model`: Entidades del dominio (Vehículo, Movimiento, etc.).
* `com.autoscolombia.repository`: Interfaces para el acceso a datos.
* `com.autoscolombia.service`: Lógica de negocio y reglas del sistema.
* `com.autoscolombia.controller`: Endpoints de la API REST.

## 🔧 Configuración e Instalación

1. **Clonar el repositorio:**
   ```bash
   git clone [https://github.com/tu-usuario/parqueadero-api.git](https://github.com/tu-usuario/parqueadero-api.git)
