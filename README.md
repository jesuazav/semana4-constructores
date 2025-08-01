# semana4-constructores


## Estructura de Clases

A continuación se presenta un diagrama UML de las clases principales que componen este proyecto. Cada clase incluye sus atributos (privados), su constructor y sus métodos `toString()`, además de los métodos **getter y setter** para cada uno de sus atributos, lo que permite el acceso y la modificación controlada de sus propiedades.

```mermaid
classDiagram
    class Parqueadero {
        - int capacidad
        - boolean conVigilante
        - String localizacion
        - boolean iluminacion
        - boolean senalizacion
        - boolean conPago
        + Parqueadero(int, boolean, String, boolean, boolean, boolean)
        + getCapacidad(): int
        + setCapacidad(int)
        + getConVigilante(): boolean
        + setConVigilante(boolean)
        + getLocalizacion(): String
        + setLocalizacion(String)
        + getIluminacion(): boolean
        + setIluminacion(boolean)
        + getSenalizacion(): boolean
        + setSenalizacion(boolean)
        + getConPago(): boolean
        + setConPago(boolean)
        + toString(): String
    }

    class Estudiante {
        - String nombre
        - String apellido
        - int edad
        - String id
        - String curso
        - int semestre
        + Estudiante(String, String, int, String, String, int)
        + getNombre(): String
        + setNombre(String)
        + getApellido(): String
        + setApellido(String)
        + getEdad(): int
        + setEdad(int)
        + getId(): String
        + setId(String)
        + getCurso(): String
        + setCurso(String)
        + getSemestre(): int
        + setSemestre(int)
        + toString(): String
    }

    class Computador {
        - int precio
        - String marca
        - String sistemaOperativo
        - int capacidadAlmacenamiento
        - int memoriaRam
        - String tipo
        + Computador(int, String, String, int, int, String)
        + getPrecio(): int
        + setPrecio(int)
        + getMarca(): String
        + setMarca(String)
        + getSistemaOperativo(): String
        + setSistemaOperativo(String)
        + getCapacidadAlmacenamiento(): int
        + setCapacidadAlmacenamiento(int)
        + getMemoriaRam(): int
        + setMemoriaRam(int)
        + getTipo(): String
        + setTipo(String)
        + toString(): String
    }