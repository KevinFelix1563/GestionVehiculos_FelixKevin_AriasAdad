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
public class MotocicletaTableModel extends AbstractTableModel {
    private final List<Motocicleta> motos;
    private final String[] columnas = {"ID", "Marca", "Modelo", "Año","Color","Tipo de motor","Cilindrada (cc)","Precio"};
    public MotocicletaTableModel(List<Motocicleta> motos) {
        this.motos = motos;
    }
     @Override
    public int getRowCount() {
        return motos.size();
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
        Motocicleta moto = motos.get(rowIndex);
        switch (columnIndex) {
            case 0: return moto.getId();
            case 1: return moto.getMarca();
            case 2: return moto.getModelo();
            case 3: return moto.getYear();
            case 4: return moto.getColor();
            case 5: return moto.getTipoMotor();
            case 6: return moto.getCilindrada();
            case 7: return moto.getPrecio();
            default: return null;
        }
    }

        @Override
public void setValueAt(Object value, int rowIndex, int columnIndex) {
    Motocicleta moto = motos.get(rowIndex);
    switch (columnIndex) {
        case 1: moto.setMarca((String) value); break;
        case 2: moto.setModelo((String) value); break;
        case 3: moto.setYear(Integer.parseInt((String)value)); break;
        case 4: moto.setColor((String) value); break;
        case 5: moto.setTipoMotor((String) value); break;
        case 6: moto.setCilindrada(Integer.parseInt((String)value)); break;
        case 7: moto.setPrecio(Double.parseDouble((String)value)); break;
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

