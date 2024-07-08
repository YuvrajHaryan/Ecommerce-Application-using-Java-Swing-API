/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.ica.part2;

// importing other required libraries
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.AbstractTableModel;
        
/**
 *
 * @author Yuvraj Haryan D3581054
 */
public class YoFishTableModel extends AbstractTableModel{
    
    // Class Members
    private String[] columnNames;
    private Object[][] data;
    
    // Constructor
    public YoFishTableModel(String[] columnNames, List<YoFishItem> dataList) {
        int columnNamesLength = columnNames.length;
        
        this.columnNames = Arrays.copyOf(columnNames,  columnNamesLength);
        
        // Set the length of rows of our data
        int rowLength = dataList.size();
        
        // Create an object of the same size of our ArralList
        data = new Object[rowLength][columnNamesLength];
        
        
        // Loop through the ArrayList
        for(int i=0; i<dataList.size(); i++)
        {
            // Get all the field values for a yo fish item
            int id = dataList.get(i).getId();
            String item = dataList.get(i).getItem();
            double price = dataList.get(i).getPrice();
            int stock  = dataList.get(i).getStock();
            double maxSize = dataList.get(i).getMaxSize();
            int lowTemp = dataList.get(i).getLowTemp();
            int highTemp = dataList.get(i).getHighTemp();
            
            // Create object for a row of data
            Object[] dataRow = new Object[]{id, item, String.format("£ %.2f", price), stock, maxSize, lowTemp, highTemp};
            
            // Add the created data row to the 2D data array
            data[i] = Arrays.copyOf(dataRow, columnNamesLength);
        }
    }

    @Override
    public int getRowCount() {
        return data.length;
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }
    
    @Override
    public void setValueAt(Object value, int rowIndex, int columnIndex) {
        data[rowIndex][columnIndex] = value;
        fireTableCellUpdated(rowIndex, columnIndex);
    }
    
}
