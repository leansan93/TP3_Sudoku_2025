package model;

public class Backtracking {

	 
	
	public boolean resolverSudoku( Sudoku sudoku ) {
		int [][] tablero = sudoku.getTablaSudoku();
		
		for (int fila = 0 ; fila < 9 ; fila ++ ) {
			
			for (int col = 0 ; col < 9 ; col ++) {
				if ( tablero[fila] [col] == 0 ) { // si es vacio la zelda 
					for (int num = 1 ; num < 9 ; num ++) { // recorres del 
						if (sudoku.esValido(fila, col, num)) { // si esvalido lo puesto entre 1 a 9 
							 tablero[fila][col]= num ; // lo agrega 
							 
							 if ( resolverSudoku(sudoku)) { // recursion 
								 
								 return true;
								 
							 
							 }  
							 tablero [fila][col]=0 ; // backtracking
							
						}
						
						
					}
					return false; // ninguna opcion valida 
					
				}
				
				
				
			}
			
		}
		
		return true; // completado 
	}
	
	
}
