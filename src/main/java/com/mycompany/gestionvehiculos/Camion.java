/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionvehiculos;

/**
 *
 * @author Kevin Felix
 */
public class Camion extends Vehiculo{
    private int numeroEjes;
    private double cargaMaxima;
    public Camion (int id,String marca, String model, int year, String color,
                   int numeroEjes, double cargaMaxima, double precio) {
        super(id,marca, model, year, precio, color);
        this.numeroEjes = numeroEjes;
        this.cargaMaxima = cargaMaxima;
    }
    public int getNumeroEjes() {
        return numeroEjes;
    }
    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
    public double getCargaMaxima() {
        return cargaMaxima;
    }
    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
    @Override
    public String toString(){
        return "Camion,"+getId()+","+getMarca()+","+getModelo()+","+getYear()+","+getColor()+","+getNumeroEjes()+","+getCargaMaxima()+","+getPrecio();
    }
}
