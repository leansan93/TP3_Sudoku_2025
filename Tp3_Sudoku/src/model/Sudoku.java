package model;

import java.util.Random;

public class Sudoku {
	
	// tabla del sudoku 
	private int[][] tablaSudoku ; 

	
	public Sudoku ( ) {
		
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
	
	

	
	
	// prueba main para la tabla sudoku 
	public static void main(String[] args) {
		
		Sudoku table = new Sudoku ();
		 table.crearTabla() ;
	}
	
	
}
