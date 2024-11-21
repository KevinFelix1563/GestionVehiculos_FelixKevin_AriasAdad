/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionvehiculos;
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author Kevin Felix
 */
public class CamionTableModel extends AbstractTableModel {
    private final List<Camion> camiones;
    private final String[] columnas = {"ID", "Marca", "Modelo", "Año","Color","Ejes","Carga Maxima (kg)","Precio"};
    public CamionTableModel(List<Camion> camiones) {
        this.camiones = camiones;
    }
     @Override
    public int getRowCount() {
        return camiones.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnas[columnIndex];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Camion camion = camiones.get(rowIndex);
        switch (columnIndex) {
            case 0: return camion.getId();
            case 1: return camion.getMarca();
            case 2: return camion.getModelo();
            case 3: return camion.getYear();
            case 4: return camion.getColor();
            case 5: return camion.getNumeroEjes();
            case 6: return camion.getCargaMaxima();
            case 7: return camion.getPrecio();
            default: return null;
        }
    }
    
        @Override
public void setValueAt(Object value, int rowIndex, int columnIndex) {
    Camion camion = camiones.get(rowIndex);
    switch (columnIndex) {
        case 1: camion.setMarca((String) value); break;
        case 2: camion.setModelo((String) value); break;
        case 3: camion.setYear(Integer.parseInt((String)value)); break;
        case 4: camion.setColor((String) value); break;
        case 5: camion.setNumeroEjes(Integer.parseInt((String)value)); break;
        case 6: camion.setCargaMaxima(Double.parseDouble((String)value)); break;
        case 7: camion.setPrecio(Double.parseDouble((String)value)); break;
    }
    fireTableCellUpdated(rowIndex, columnIndex);
}


    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if(columnIndex==0){
            return false;
        }
        return true;
    }
}

