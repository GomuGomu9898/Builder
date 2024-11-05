package com.builder.domain;

public class Contacto {
    private String nombre;
    private Telefono telefono;
    private Direccion direccion;

    public Contacto() {
    }

    public Contacto(String nombre, Telefono telefono, Direccion direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "Nombre:'" + nombre + '\'' +
                ", Teléfono:" + telefono +
                ", Dirección:" + direccion +
                '}';
    }
}
