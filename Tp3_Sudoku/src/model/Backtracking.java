package model;

public class Backtracking {

	private Sudoku sudoku;
	
	public Backtracking (Sudoku sudoku) {
		
		this.sudoku= sudoku;
	}
	
	public boolean resolver() {
		return resolverSudo_Recursivo();
	}
	// -------------------------------- Rusuelve el sudoku //
	
	 boolean resolverSudo_Recursivo() {
		int [][] tablero = sudoku.getTablero();
		
		for (int fila = 0 ; fila < 9 ; fila ++ ) { // recorre todas las filas 
			 
			for (int col = 0 ; col < 9 ; col ++) { // recorre todas las columnas 
				if ( tablero[fila] [col] == 0 ) { // si es vacio la zelda 
					for (int num = 1 ; num < 9 ; num ++) { // recorres del  1 al 9 para luego ver 
						if (esValido(fila, col, num)) { // si es esvalido lo puesto entre 1 a 9 
							 tablero[fila][col]= num ; // lo agrega 
							 
							 if (resolverSudo_Recursivo()) { // recursion 
								 
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
	// Se fija si es VALIDO el sudoku que se arma 
	// chequea tanto a lo largo de la tabla sudoku como los bloques 3x3 
		boolean esValido (  int fila , int col, int num ) {
			int [][] tablero = sudoku.getTablero();
			// Fila recorre y compara toda la fila con num si hay uno igual devolvera false y no sera valido
	        for (int j = 0; j < 9; j++)
	            if (tablero[fila][j] == num) {
	                return false;
	            }
	        // Columna recorre y compara toda la columna con num y si hay uno igual devolvera false y no sera valido
	        for (int i = 0; i < 9; i++)
	            if (tablero[i][col] == num) {
	                return false;
	            }
	        // se inicia las Subtablas o bloques de 3x3 para comparar y hacer lo mismo que lo anterior , si hay alguno igual devolvera false
	        int subtablaFila = fila - fila % 3;
	        int subtablaColumna = col - col % 3;
	        for (int i = 0; i < 3; i++)
	            for (int j = 0; j < 3; j++)
	                if (tablero[subtablaFila+ i][subtablaColumna + j] == num)
	                    return false;

	        // caso contrario sera valido 
	        return true;
	    }

	
	
	
}
