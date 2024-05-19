
package com.mycompany.dricamp.logic;



import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Cliente implements Serializable{
     
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private int idCliente;
    
    
    private String nombre;
    private String contrasena;
    private String cedula;
    private String telefono;
    private String rol;

    public Cliente() {
    }

    public Cliente(int idCliente, String nombre, String contrasena, String cedula, String telefono, String rol) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.cedula = cedula;
        this.telefono = telefono;
        this.rol = rol;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
