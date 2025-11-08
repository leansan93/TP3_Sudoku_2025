package model;

public class Backtracking {

	 
	
	public boolean resolverSudoku( Sudoku sudoku ) {
		int [][] tablero = sudoku.getTablaSudoku();
		
		for (int fila = 0 ; fila < 9 ; fila ++ ) { // recorre todas las filas 
			 
			for (int col = 0 ; col < 9 ; col ++) { // recorre todas las columnas 
				if ( tablero[fila] [col] == 0 ) { // si es vacio la zelda 
					for (int num = 1 ; num < 9 ; num ++) { // recorres del  1 al 9 para luego ver 
						if (sudoku.esValido(fila, col, num)) { // si es esvalido lo puesto entre 1 a 9 
							 tablero[fila][col]= num ; // lo agrega 
							 
							 if (resolverSudoku(sudoku)) { // recursion 
								 
								 return true;
								 
							 
							 }  
							 tablero [fila][col] = 0 ; // backtracking
							
						}
						
						
					}
					return false; // ninguna opcion valida 
					
				}
				
				
				
			}
			
		}
		
		return true; // completado 
	}
	
	
}
