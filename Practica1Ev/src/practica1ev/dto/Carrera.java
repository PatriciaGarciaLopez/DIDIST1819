/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1ev.dto;

import java.util.Date;

/**
 *
 * @author abago
 */
public class Carrera {
    private String nombre;
    private Date fecha;
    private String lugar;
    private int maxParticipantes;
    
    //Constructor

    public Carrera(String nombre, Date fecha, String lugar, int maxParticipantes) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.maxParticipantes = maxParticipantes;
    }
    
    //getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getMaxParticipantes() {
        return maxParticipantes;
    }

    public void setMaxParticipantes(int maxParticipantes) {
        this.maxParticipantes = maxParticipantes;
    }
    
    //Array
    public String[] Array(){
        String[]s=new String[4];
                s[0]=nombre;
                s[1]=fecha.toString();
                s[2]=lugar;
                s[3]=String.valueOf(maxParticipantes);
                return s;
    }
    
    
}
