package controller;

import javax.swing.JOptionPane;

import model.Backtracking;
import model.Sudoku;
import view.*;

public class ControladorSudoku {
	
	private VentanaSudoku vista;
	private Sudoku modelo;
	
	public ControladorSudoku(VentanaSudoku vista , Sudoku sudoku) {
		this.vista = vista;
		this.modelo= sudoku;	
		 
		  vista.btnResolver.addActionListener(e -> resolverSudoku());
	      vista.btnReiniciar.addActionListener(e -> reiniciar());
	}
	
	private void resolverSudoku() {
		 try {
	            // Cargar datos desde la interfaz
	            for (int i = 0; i < 9; i++) {
	                for (int j = 0; j < 9; j++) {
	                    String texto = vista.celdas[i][j].getText();
	                    int valor = texto.isEmpty() ? 0 : Integer.parseInt(texto);
	                    modelo.setValor(i, j, valor);
	                }
	            }

	            // Resolver
	            Backtracking solver = new Backtracking(modelo);
	            if (solver.resolver()) {
	                int[][] resuelto = modelo.getTablero();
	                for (int i = 0; i < 9; i++) {
	                    for (int j = 0; j < 9; j++) {
	                        vista.celdas[i][j].setText(String.valueOf(resuelto[i][j]));
	                    }
	                }
	                JOptionPane.showInputDialog(vista, "¡Sudoku resuelto!");
	            } else {
	                JOptionPane.showInputDialog(vista, "No existe solución para este Sudoku.");
	            }

		
		
	}
		 catch (Exception ex) {
	            JOptionPane.showInputDialog(vista, "Error: " + ex.getMessage());
	        }
	    }

	    private void reiniciar() {
	        for (int i = 0; i < 9; i++)
	            for (int j = 0; j < 9; j++)
	                vista.celdas[i][j].setText("");
	    }
	
	

}
