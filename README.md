# LiterAlura

Bienvenidos al proyecto **LiterAlura**, un catálogo de libros para el desafío back-end de Oracle Next Education. Este proyecto fue desarrollado utilizando **Java**, **Spring**, y **PostgreSQL**. La aplicación permite a los usuarios registrar libros en una base de datos y recibir información sobre los libros ya registrados. A continuación, se detallan las características, requisitos y configuración del proyecto.

## Descripción del Proyecto

**LiterAlura** es una aplicación de consola que interactúa con la API de Gutendex, basada en el Proyecto Gutenberg, una biblioteca digital con más de 70,000 libros disponibles para descargar gratuitamente. La aplicación permite buscar libros por título, registrar libros en la base de datos y realizar varias operaciones sobre los datos almacenados.

## Funcionalidades

1. **Buscar libro por título**: Permite a los usuarios buscar un libro ingresando su título. La aplicación consulta la API de Gutendex, recupera la información y registra el libro en la base de datos.
2. **Listar libros registrados**: Muestra una lista de todos los libros registrados en la base de datos.
3. **Listar autores registrados**: Muestra una lista de todos los autores de los libros registrados.
4. **Listar autores vivos en un año determinado**: Permite listar autores que estaban vivos en un año específico.
5. **Listar libros por idioma**: Permite buscar libros registrados según su idioma (ES, EN, FR, PT).

## Requisitos

- **Java** (versión 17)
- **Spring Boot** (versión 3.2.4)
- **PostgreSQL**
- **Dependencias de Maven**:
  - Spring Data JPA
  - PostgreSQL Driver

## Configuración del Proyecto

1. Clonar el repositorio desde GitHub:
    ```bash
    git clone https://github.com/tu_usuario/literalura.git
    ```

2. Crear el proyecto en [Spring Initializr](https://start.spring.io/):
    - Project: Maven
    - Language: Java
    - Spring Boot: 3.2.4
    - Group: `com.alura`
    - Artifact: `literalura`
    - Packaging: JAR
    - Java: 17
    - Dependencias: Spring Data JPA, PostgreSQL Driver

3. Configurar la base de datos PostgreSQL en el archivo `application.properties`:
    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/literalura
    spring.datasource.username=tu_usuario
    spring.datasource.password=tu_contraseña
    spring.jpa.hibernate.ddl-auto=update
    ```

4. Ejecutar la aplicación:
    ```bash
    mvn spring-boot:run
    ```

## Uso de la API Gutendex

La API de Gutendex se encuentra en [gutendex.com](https://gutendex.com). Asegúrate de revisar la documentación para entender cómo realizar las consultas y manejar los datos de los libros.

## Estructura del Proyecto

- **src/main/java/com/alura/literalura**: Contiene el código fuente del proyecto.
- **src/main/resources**: Contiene archivos de configuración y recursos estáticos.
- **pom.xml**: Archivo de configuración de Maven.

## Contribuciones

Si deseas contribuir a este proyecto, por favor sigue los siguientes pasos:

1. Realiza un fork del proyecto.
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza los cambios necesarios y realiza commits (`git commit -m 'Agrega nueva funcionalidad'`).
4. Sube tus cambios a GitHub (`git push origin feature/nueva-funcionalidad`).
5. Abre un Pull Request.

## Contacto

Para cualquier consulta o sugerencia, por favor contacta al instructor **Eric Monné**.

## Licencia

Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.

---

¡Gracias por participar en este desafío y feliz codificación!
