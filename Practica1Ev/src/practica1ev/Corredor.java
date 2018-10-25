/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1ev;

import java.util.Date;

/**
 *
 * @author abago
 */
public class Corredor {
    
    private String nombre;
    private String dni;
    private Date fechaNacimiento;
    private String direccion;
    private int telefonoContacto;
    
    //Constructor

    public Corredor(String nombre, String dni, Date fechaNacimiento, String direccion, int telefonoContacto) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefonoContacto = telefonoContacto;
    }
    //Getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(int telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }
    
    //Array
    public String [] toArrayString(){
        String [] s= new String [5];
        s[0]=nombre;
        s[1]=dni;
        s[2]=fechaNacimiento.toString();
        s[3]=direccion;
        s[4]=String.valueOf(telefonoContacto);
        return s;
    }
}
