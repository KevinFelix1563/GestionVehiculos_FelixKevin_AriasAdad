/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionvehiculos;

/**
 *
 * @author Kevin Felix
 */
public class Auto extends Vehiculo {
    private String tipoMotor;
    private int numPuertas;
    public Auto (int id,String marca, String modelo, int year,
                 String color, String tipoMotor, int numPuertas, double precio) {
     super(id,marca,modelo,year,precio,color);
     this.tipoMotor = tipoMotor;
     this.numPuertas = numPuertas;
    }
    public String getTipoMotor() {
        return tipoMotor;
    }
    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
    public int getNumPuertas() {
        return numPuertas;
    }
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    @Override
    public String toString(){
        return "Auto,"+getId()+","+getMarca()+","+getModelo()+","+getYear()+","+getColor()+","+getTipoMotor()+","+getNumPuertas()+","+getPrecio();
    }
}