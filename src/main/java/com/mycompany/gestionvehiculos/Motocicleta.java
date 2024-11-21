/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionvehiculos;

/**
 *
 * @author Kevin Felix
 */
public class Motocicleta extends Vehiculo {
    private String tipoMotor;
    private int cilindrada; //100cc, 150cc, etc

    public Motocicleta(int id,String marca, String modelo, int year,
                       String color, String tipoMotor, int cilindrada, double precio) {
        super(id,marca, modelo, year, precio, color);
        this.tipoMotor = tipoMotor;
        this.cilindrada = cilindrada;
    }
    public String getTipoMotor() {
        return tipoMotor;
    }
    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
    public int getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    @Override
    public String toString(){
        return "Motocicleta,"+getId()+","+getMarca()+","+getModelo()+","+getYear()+","+getColor()+","+getTipoMotor()+","+getCilindrada()+","+getPrecio();
    }
}
