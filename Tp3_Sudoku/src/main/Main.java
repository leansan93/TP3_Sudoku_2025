package main;
import model.*;
import view.*;
import controller.*;

public class Main {
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        VentanaSudoku vista = new VentanaSudoku();
        new ControladorSudoku(vista, sudoku);
    }

}
