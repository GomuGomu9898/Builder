package com.builder;

import com.builder.domain.Direccion;
import com.builder.domain.Contacto;
import com.builder.domain.Telefono;

public class Main {
    public static void main(String[] args) {

        // Ejemplo 1: Empleado 1
        Empleado empleado1 = new Empleado.EmpleadoBuilder()
                .setEdad(28)
                .setNombre("Sofía")
                .setGenero("Femenino")
                .setDireccion("Avenida Reforma", "CDMX", "México", "06500")
                .setTelefono("55 1234 5678", "52", "Fijo")
                .setContacto(new Contacto("Carlos",
                        new Telefono("55 8765 4321", null, "Celular"),
                        new Direccion("Calle 12", "CDMX", "México", "10000")))
                .build();

        // Ejemplo 2: Empleado 2
        Empleado empleado2 = new Empleado.EmpleadoBuilder()
                .setEdad(35)
                .setNombre("Diego")
                .setGenero("Masculino")
                .setDireccion("Insurgentes Sur", "CDMX", "México", "04530")
                .setTelefono("55 2345 6789", "52", "Fijo")
                .setTelefono("55 6789 1234", null, "Celular")
                .setContacto(new Contacto("Laura",
                        new Telefono("55 3456 7890", null, "Celular"),
                        new Direccion("Calle del Sol", "Monterrey", "México", "64000")))
                .setContacto(new Contacto("Andrés",
                        new Telefono("55 6543 2109", "52", "Fijo"),
                        new Direccion("Av. Juárez", "Guadalajara", "México", "44100")))
                .build();

        // Ejemplo 3: Empleado 3
        Empleado empleado3 = new Empleado.EmpleadoBuilder()
                .setEdad(42)
                .setNombre("Mariana")
                .setGenero("Femenino")
                .setDireccion("Paseo de la Reforma", "CDMX", "México", "11000")
                .setTelefono("55 3456 7891", "52", "Fijo")
                .setContacto(new Contacto("José",
                        new Telefono("55 7890 1234", null, "Celular"),
                        new Direccion("Calle Luna", "CDMX", "México", "20000")))
                .build();

        // Imprimiendo los datos de los empleados
        System.out.println("Empleado 1 = " + empleado1);
        System.out.println("\nEmpleado 2 = " + empleado2);
        System.out.println("\nEmpleado 3 = " + empleado3);
    }
}
