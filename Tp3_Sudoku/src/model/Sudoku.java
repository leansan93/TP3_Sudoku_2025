package model;

import java.util.Random;

public class Sudoku {
	
	// tabla del sudoku 
	private int[][] tablaSudoku ; 

	
	public Sudoku () {
		
	this.tablaSudoku= new int [][] {
		    {0, 0, 0, 0, 0, 2, 1, 0, 0},
		    {1, 0, 2, 4, 6, 0, 0, 3, 9},
		    {0, 0, 8, 1, 9, 7, 0, 5, 0},
		    {0, 0, 0, 2, 0, 0, 7, 9, 3},
		    {0, 4, 7, 0, 5, 9, 0, 0, 2},
		    {0, 0, 0, 7, 1, 6, 4, 8, 0},
		    {9, 0, 0, 6, 0, 0, 5, 0, 0},
		    {0, 2, 0, 0, 0, 1, 0, 0, 4},
		    {7, 0, 5, 9, 2, 0, 0, 0, 1}
		};
	}

	
	private  void crearTabla() {
		for (int fil = 0 ; fil < tablaSudoku.length; fil ++) {
			
			for (int col=0 ; col < tablaSudoku[0].length ; col ++  ) {
				System.out.print(tablaSudoku [fil ] [col] + "  " );
			
			}
			System.out.println();
		}
		
	}
	
	boolean esValido (  int fila , int col, int num ) {
		// Fila recorre y compara toda la fila con num si hay uno igual devolvera false y no sera valido
        for (int j = 0; j < 9; j++)
            if (tablaSudoku[fila][j] == num) {
                return false;
            }
        // Columna recorre y compara toda la columna con num y si hay uno igual devolvera false y no sera valido
        for (int i = 0; i < 9; i++)
            if (tablaSudoku[i][col] == num) {
                return false;
            }
        // se inicia las Subtablas de 3x3 para comparar y hacer lo mismo que lo anterior , si hay alguno igual devolvera false
        int subtablaFila = fila - fila % 3;
        int subtablaColumna = col - col % 3;
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (tablaSudoku[subtablaFila+ i][subtablaColumna + j] == num)
                    return false;

        // caso contrario sera valido 
        return true;
    }

	// comprueba si la fila y columna es valido para editar osea si es 0 para que el usuario edite 
	// devolvera true si lo es y se editara esa posicion 
	public boolean esCeldaEditable(int fil , int col ) {
		return tablaSudoku[fil][col]==0 ;
	}
	
	
	public int[][] getTablaSudoku() {
		return tablaSudoku;
	}


	public void setTablaSudoku(int[][] tablaSudoku) {
		this.tablaSudoku = tablaSudoku;
	}


	// prueba main para la tabla sudoku 
	public static void main(String[] args) {
		
		Sudoku table = new Sudoku ();
		 table.crearTabla() ;
		 
		 System.out.println(table.esValido(1, 0, 1)); // probando esvalido devolvera false en la subtabla esta el 1 y el num es 1 
		 System.out.println(table.esValido(0, 0, 5)); // devolvera true el num = 5 y 5 no esta en la subtabla ni a lo largo de la columna como fila 
		 System.out.println(table.esValido(0, 1, 1)); // devuelve false el numero = 1 y en la subtabla esta el 1 
		 System.out.println(table.esValido(0, 3, 1)); // devuelve false el numero = 1 y a lo largo de la fila esta el 1 
		 System.out.println(table.esValido(0, 0, 7));  // devuelve false porque el num es 7 y a lo largo de la columna esta 7 
		 System.out.println(table.esValido(0, 0, 5)); // devuelve true porque num es 5 y en la subclase como a lo largo de la columna y fila no esta el 5 

	}
	
}
