package model;

import java.util.Random;

public class Sudoku {
	
	// tabla del sudoku 
	private int[][] tablaSudoku ; 

	
	public Sudoku () {
		
	this.tablaSudoku= new int [9][9]; 
		   
	}

	
	private  void crearTabla() {
		for (int fil = 0 ; fil < tablaSudoku.length; fil ++) {
			
			for (int col=0 ; col < tablaSudoku[0].length ; col ++  ) {
				System.out.print(tablaSudoku [fil ] [col] + "  " );
			
			}
			System.out.println();
		}
		
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
/*	public static void main(String[] args) {
		
		Sudoku table = new Sudoku ();
		 table.crearTabla() ;
		 
		 System.out.println(table.esValido(1, 0, 1)); // probando esvalido devolvera false en la subtabla esta el 1 y el num es 1 
		 System.out.println(table.esValido(0, 0, 5)); // devolvera true el num = 5 y 5 no esta en la subtabla ni a lo largo de la columna como fila 
		 System.out.println(table.esValido(0, 1, 1)); // devuelve false el numero = 1 y en la subtabla esta el 1 
		 System.out.println(table.esValido(0, 3, 1)); // devuelve false el numero = 1 y a lo largo de la fila esta el 1 
		 System.out.println(table.esValido(0, 0, 7));  // devuelve false porque el num es 7 y a lo largo de la columna esta 7 
		 System.out.println(table.esValido(0, 0, 5)); // devuelve true porque num es 5 y en la subclase como a lo largo de la columna y fila no esta el 5 

	}*/
	
}
