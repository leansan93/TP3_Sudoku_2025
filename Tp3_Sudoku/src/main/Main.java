package main;
import model.*;
import view.*;

import javax.swing.SwingUtilities;

import controller.*;

public class Main {
    public static void main(String[] args) {
    	 SwingUtilities.invokeLater(() -> {
             VentanaSudoku vista = new VentanaSudoku();
             Sudoku modelo = new Sudoku();
             ControladorSudoku controlador = new ControladorSudoku(vista, modelo);
             
             vista.mostrar(); // método que muestra la ventana (lo agregamos abajo)
         });
     }

}
