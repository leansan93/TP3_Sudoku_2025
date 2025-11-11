package model;

import java.util.Random;

public class Sudoku {
	
	// tabla del sudoku 
	private int[][] tablero ; 

	
	public Sudoku () {
		
	this.tablero= new int [9][9]; 
		   
	}

	
    public Sudoku(int[][] tableroInicial) {
        tablero = tableroInicial;
    }

    public int[][] getTablero() {
        return tablero;
    }

    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }
	
	public boolean resolver() {
		
		
		for (int fila = 0 ; fila < 9 ; fila ++ ) { // recorre todas las filas 
			 
			for (int col = 0 ; col < 9 ; col ++) { // recorre todas las columnas 
				if ( tablero[fila] [col] == 0 ) { // si es vacio la zelda 
					for (int num = 1 ; num < 9 ; num ++) { // recorres del  1 al 9 para luego ver 
						if (esValido( fila , col, num)) { // si es esvalido lo puesto entre 1 a 9 
							 tablero[fila][col]= num ; // lo agrega 
							 
							 if (resolver()) { // recursion 
								 
								 return true;
								 
							 
							 }  
							 tablero [fila][col] = 0 ; // backtracking
							
						}
						
						
					}
					return false; // ninguna opcion valida 
					
				}
				
				
				
			}
			
		}
		
		return true; // se recorrio todo el sudoku oesa completado 
	}
	
//-----------------------------------------------------------------------------------------
	private boolean esValido( int fila, int col, int num) {
        for (int j = 0; j < 9; j++)
            if (tablero[fila][j] == num) return false;

        for (int i = 0; i < 9; i++)
            if (tablero[i][col] == num) return false;

        int subFila = fila - fila % 3;
        int subCol = col - col % 3;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (tablero[subFila + i][subCol + j] == num)
                    return false;

        return true;
    }

	
	
 

}
