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
		// acá conectamos los botones con las acciones
        inicializarEventos();
		// Escuchar los botones
        
    }
	 private void inicializarEventos() {
	        vista.getBtnResolver().addActionListener(e -> resolverSudoku());
	        vista.getBtnLimpiar().addActionListener(e -> limpiarTablero());
	    }
	 private void resolverSudoku() {
	        int[][] tablero = vista.obtenerTablero();
	        modelo.setTablero(tablero);

	        if (modelo.resolver()) {
	            vista.mostrarTablero(modelo.getTablero());
	            vista.mostrarMensaje("¡Sudoku resuelto!");
	        } else {
	            vista.mostrarMensaje("No tiene solución.");
	        }
	    }

	    private void limpiarTablero() {
	        modelo.limpiar();
	        vista.mostrarTablero(modelo.getTablero());
	    }
	
	
	

}
