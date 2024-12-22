# Archetype Spring Boot Accelerator

Este proyecto es un **archetype** para proyectos basados en Spring Boot. Permite a los desarrolladores generar rápidamente una estructura básica de proyecto con configuraciones predefinidas para CORS, Swagger, y dependencias esenciales.

## Características
- Configuración de **CORS** para habilitar solicitudes desde cualquier origen.
- Integración con **Swagger/OpenAPI** para documentar APIs.
- Dependencias básicas de Spring Boot, como `spring-boot-starter-web`, `spring-boot-starter-validation` y `springdoc-openapi-starter-webmvc-ui`.
- Compatible con **Java 17**.
- Configuración de compilación optimizada con Maven.

## Requisitos Previos
- **Java 17** o superior.
- **Maven 3.8.1** o superior.
- Git para clonar el repositorio.

## Estructura del Proyecto
El proyecto tiene la siguiente estructura principal:

```
├── .mvn/                    # Archivos de configuración de Maven Wrapper
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── top.anyel.archetypespringboot/
│   │   │       ├── config/  # Configuraciones principales
│   │   │       │   ├── CorsConfig.java       # Configuración de CORS
│   │   │       │   ├── OpenApiConfig.java    # Configuración de Swagger
│   │   │       └── ArchetypeSpringbootApplication.java # Clase principal
│   │   └── resources/       # Archivos de recursos (application.properties)
│   └── test/                # Archivos de prueba
├── target/
│   └── generated-sources/
│       └── archetype/       # Archivos generados del archetype
├── pom.xml                  # Archivo de configuración de Maven
├── HELP.md                  # Documentación de ayuda
├── mvnw, mvnw.cmd           # Scripts de Maven Wrapper
├── .gitignore               # Archivos ignorados por Git
```

## Pasos para Crear y Generar un Archetype

### 1. Crear un Archetype desde un Proyecto Base

Para crear un archetype desde un proyecto existente, sigue estos pasos:

1. **Estructura inicial:**
   Configura un proyecto base con la estructura y configuraciones que deseas reutilizar (como dependencias, configuraciones de Spring Boot, etc.).

2. **Generar el archetype:**
   Desde la raíz del proyecto base, ejecuta el siguiente comando:

   ```bash
   mvn archetype:create-from-project
   ```

   Esto generará un archetype en la carpeta:

   ```
   target/generated-sources/archetype
   ```

3. **Personaliza el archetype:**
   Modifica los archivos en la carpeta `archetype` para incluir configuraciones adicionales o plantillas de código, como el archivo `archetype-metadata.xml`.

### 2. Instalar el Archetype en el Repositorio Local

Desde la carpeta `target/generated-sources/archetype`, instala el archetype en tu repositorio local de Maven ejecutando:

```bash
mvn install
```

Esto hace que el archetype esté disponible para ser usado en futuros proyectos.

### 3. Generar un Nuevo Proyecto desde el Archetype

Ejecuta el siguiente comando para generar un nuevo proyecto basado en el archetype:

```bash
mvn archetype:generate \
    -DarchetypeGroupId=top.anyel \
    -DarchetypeArtifactId=archetype-springboot \
    -DarchetypeVersion=0.0.1-SNAPSHOT \
    -DgroupId=com.example \
    -DartifactId=my-springboot-app \
    -Dversion=1.0-SNAPSHOT
```

Reemplaza:
- `com.example` con el **groupId** del nuevo proyecto.
- `my-springboot-app` con el **artifactId** del nuevo proyecto.

### 4. Ejecutar el Proyecto Generado

1. Navega a la carpeta del proyecto generado:
   ```bash
   cd my-springboot-app
   ```
2. Ejecuta el proyecto con Maven:
   ```bash
   mvn spring-boot:run
   ```

## Configuraciones Incluidas

### CORS
El archivo `CorsConfig.java` configura CORS para permitir solicitudes desde cualquier origen con los métodos y encabezados permitidos.

### Swagger/OpenAPI
El archivo `OpenApiConfig.java` configura Swagger para documentar las APIs del proyecto. Accede a la documentación desde:

```
http://localhost:8080/swagger-ui.html
```

### Dependencias Clave
- **Spring Boot Starter Web**: Para desarrollo web.
- **Spring Boot Starter Validation**: Para validaciones en los modelos.
- **SpringDoc OpenAPI**: Para generar documentación Swagger.

## Recursos Adicionales
- **Repositorio GitHub**: [Archetype Spring Boot](https://github.com/Anyel-ec/Springboot-Archetype-Accelerators-Introduce/)
- **Autor**: [Angel Patiño](https://www.linkedin.com/in/anyel-ec/)

