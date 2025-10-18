package model;

import java.util.Random;

public class Sudoku {
	
	// tabla del sudoku 
	private int[][] tabla;
	private int tamano; // tamaño de la tabla en este caso se comenzara 9x9 como default 
	
	public Sudoku (int tamano) {
	this.tamano= tamano;
	this.tabla= new int [tamano][tamano];	
	
	}

	
	private  void crearTabla() {
		 Random rand= new Random ();
		for (int fil = 0 ; fil < tabla.length; fil ++) {
			
			for (int col=0 ; col < tabla[0].length ; col ++  ) {
				
				tabla[fil][col]= rand.nextInt(9); // entre 0 hasta 9 
				
				System.out.print(tabla [fil ] [col] + "  " );
			
			}
			System.out.println();
		}
		
	}
	
	

	
	
	// prueba main para la tabla sudoku 
	public static void main(String[] args) {
		
		Sudoku table = new Sudoku (9);
		 table.crearTabla() ;
	}
	
	
}
