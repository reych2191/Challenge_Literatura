package com.challenge.literatura.modelos;

import java.util.ArrayList;

public class ReqFinal {

    Integer titulo ;
    String nombre ;
    String fechanacimiento ;
    ArrayList <Object> fechamuerte ;

    public  ReqFinal (ReqFilter reqfilter){
        this.titulo = reqfilter.count();
        this.nombre = reqfilter.next();
        this.fechanacimiento = reqfilter.previous();
        this.fechamuerte = reqfilter.results();
    }

    public Integer getTitulo() {
        return titulo;
    }

    public  String getNombre() {
        return nombre;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }
    public ArrayList<Object> getFechamuerte() {
        return fechamuerte;
    }

    @Override
    public String toString() {
        return nombre +
                String.valueOf(titulo) +
                fechanacimiento +
                fechamuerte;
    }
}
