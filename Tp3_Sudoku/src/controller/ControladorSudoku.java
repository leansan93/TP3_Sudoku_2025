package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.Sudoku;
import view.VentanaSudoku;

public class ControladorSudoku {
	
	private VentanaSudoku vista;
	private Sudoku modelo;

	
	public ControladorSudoku(VentanaSudoku vista , Sudoku sudoku) {
		this.vista = vista;
		this.modelo= sudoku;	
		// Escuchar los botones
        vista.getBtnResolver().addActionListener((ActionListener) new ResolverListener());
        vista.getBtnLimpiar().addActionListener(new LimpiarListener());
    }

	// --- Listener para resolver ---
    private class ResolverListener implements ActionListener {
       @Override 
       public void actionPerformed(ActionEvent e) {
    	   int [][] tablero = vista.obtenerTablero();
    	   modelo.setTablero(tablero);
    	   
    	   if ( modelo.resolver()) {
    		   vista.mostrarTablero(modelo.getTablero());
    		   vista.mostrarMensaje("Sudoku resuelte correctamente");
    		   
    	   }
    	   else {
    		   
    		   vista.mostrarMensaje("No existe solucion para este Sudoku ");
    	   }
       }
        
    }

    private class LimpiarListener implements ActionListener {
       @Override
       public void actionPerformed(ActionEvent e) {
    	   int [][] vacio = new int [9][9];
    	   vista.mostrarTablero(vacio);
       }
    }
	
	

}
