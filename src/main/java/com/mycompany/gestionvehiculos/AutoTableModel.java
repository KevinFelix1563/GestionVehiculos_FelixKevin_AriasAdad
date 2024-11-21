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
public class AutoTableModel extends AbstractTableModel {
    private final List<Auto> autos;
    private final String[] columnas = {"ID", "Marca", "Modelo", "Año","Color","Tipo de motor","Puertas","Precio"};
    public AutoTableModel(List<Auto> autos) {
        this.autos = autos;
    }
     @Override
    public int getRowCount() {
        return autos.size();
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
        Auto auto = autos.get(rowIndex);
        switch (columnIndex) {
            case 0: return auto.getId();
            case 1: return auto.getMarca();
            case 2: return auto.getModelo();
            case 3: return auto.getYear();
            case 4: return auto.getColor();
            case 5: return auto.getTipoMotor();
            case 6: return auto.getNumPuertas();
            case 7: return auto.getPrecio();
            default: return null;
        }
    }
    
    @Override
public void setValueAt(Object value, int rowIndex, int columnIndex) {
    Auto auto = autos.get(rowIndex);
    switch (columnIndex) {
        case 1: auto.setMarca((String) value); break;
        case 2: auto.setModelo((String) value); break;
        case 3: auto.setYear(Integer.parseInt((String)value)); break;
        case 4: auto.setColor((String) value); break;
        case 5: auto.setTipoMotor((String) value); break;
        case 6: auto.setNumPuertas(Integer.parseInt((String)value)); break;
        case 7: auto.setPrecio(Double.parseDouble((String)value)); break;
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

