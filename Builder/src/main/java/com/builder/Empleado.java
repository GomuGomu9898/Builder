package com.builder;

import com.builder.domain.Direccion;
import com.builder.domain.Contacto;
import com.builder.domain.Telefono;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private int edad;
    private String nombre;
    private String genero;
    private Direccion direccion;
    private List<Telefono> telefonos;
    private List<Contacto> contactos;

    public Empleado() {
    }

    public Empleado(int edad, String nombre, String genero) {
        this.edad = edad;
        this.nombre = nombre;
        this.genero = genero;
    }

    public Empleado(int edad, String nombre, String genero, Direccion direccion, List<Telefono> telefonos, List<Contacto> contactos) {
        this.edad = edad;
        this.nombre = nombre;
        this.genero = genero;
        this.direccion = direccion;
        this.telefonos = telefonos;
        this.contactos = contactos;
    }

    public static class EmpleadoBuilder implements IBuilder<Empleado> {

        private int edad;
        private String nombre;
        private String genero;
        private Direccion direccion;
        private final List<Telefono> telefonos = new ArrayList<>();
        private final List<Contacto> contactos = new ArrayList<>();

        public EmpleadoBuilder() {
        }

        public EmpleadoBuilder setEdad(int edad) {
            this.edad = edad;
            return this;
        }

        public EmpleadoBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public EmpleadoBuilder setGenero(String genero) {
            this.genero = genero;
            return this;
        }

        public EmpleadoBuilder setDireccion(Direccion direccion) {
            this.direccion = direccion;
            return this;
        }

        public EmpleadoBuilder setDireccion(String direccion, String ciudad, String pais, String codigoPostal) {
            this.direccion = new Direccion(direccion, ciudad, pais, codigoPostal);
            return this;
        }

        public EmpleadoBuilder setTelefono(Telefono telefono) {
            this.telefonos.add(telefono);
            return this;
        }

        public EmpleadoBuilder setTelefono(String numeroTelefono, String extension, String tipoTelefono) {
            this.telefonos.add(new Telefono(numeroTelefono, extension, tipoTelefono));
            return this;
        }

        public EmpleadoBuilder setContacto(Contacto contacto) {
            this.contactos.add(contacto);
            return this;
        }

        public EmpleadoBuilder setContacto(String nombre, Telefono telefono, Direccion direccion) {
            this.contactos.add(new Contacto(nombre, telefono, direccion));
            return this;
        }

        @Override
        public Empleado build() {
            return new Empleado(edad, nombre, genero, direccion, telefonos, contactos);
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public List<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "\n, edad=" + edad +
                "\n, nombre='" + nombre + '\'' +
                "\n, genero='" + genero + '\'' +
                "\n, direccion=" + direccion +
                "\n, telefonos=" + telefonos +
                "\n, contactos=" + contactos +
                "}";
    }
}
