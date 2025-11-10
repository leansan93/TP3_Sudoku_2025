package model;

import java.util.Random;

public class Sudoku {
	
	// tabla del sudoku 
	private int[][] tablero ; 

	
	public Sudoku () {
		
	this.tablero= new int [9][9]; 
		   
	}

	
	private  void crearTabla() {
		for (int fil = 0 ; fil < tablero.length; fil ++) {
			
			for (int col=0 ; col < tablero[0].length ; col ++  ) {
				System.out.print(tablero [fil ] [col] + "  " );
			
			}
			System.out.println();
		}
		
	}
	
	
	
	public int getValor(int fila, int col) {
        return tablero[fila][col];
    }

    public void setValor(int fila, int col, int valor) {
        tablero[fila][col] = valor;
    }

    public int[][] getTablero() {
        return tablero;
    }

    public void setTablero(int[][] nuevo) {
        this.tablero = nuevo;
    }
}
