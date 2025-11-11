package view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaSudoku {

	private JFrame frame;
	private JTextField[][] celdas = new JTextField [9][9];
	private JButton btnResolver;
	private JButton btnLimpiar;
	private JPanel panelTablero;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaSudoku window = new VentanaSudoku();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaSudoku() {
		
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 523, 414);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SUDOKU");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(225, 11, 81, 31);
		frame.getContentPane().add(lblNewLabel);
		
		  // === PANEL PRINCIPAL ===
        panelTablero = new JPanel();
        panelTablero.setLayout(new GridLayout(9, 9));
        panelTablero.setBounds(30, 50, 450, 267);
        frame.getContentPane().add(panelTablero);

        // === Crear las 81 celdas ===
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                JTextField celda = new JTextField();
                celda.setHorizontalAlignment(JTextField.CENTER);
                celda.setFont(new Font("Tahoma", Font.BOLD, 16));
                celda.setBackground(Color.WHITE);
                celda.setBorder(crearBordeCelda(i, j));
                celdas[i][j] = celda;
                panelTablero.add(celda);
            }
        }
		
//-----------------------------------------------------------------------------
		//-- BOTONES
		
		btnResolver = new JButton("Resolver");
		btnResolver.setBounds(238, 341, 89, 23);
		frame.getContentPane().add(btnResolver);
		
		btnLimpiar = new JButton("Limpiar");
		
		btnLimpiar.setBounds(344, 341, 89, 23);
		frame.getContentPane().add(btnLimpiar);

		
	}
	
	
	
	 public int[][] obtenerTablero() {
	        int[][] tablero = new int[9][9];
	        for (int i = 0; i < 9; i++) {
	            for (int j = 0; j < 9; j++) {
	                String texto = celdas[i][j].getText();
	                tablero[i][j] = texto.isEmpty() ? 0 : Integer.parseInt(texto);
	            }
	        }
	        return tablero;
	    }

	    public void mostrarTablero(int[][] tablero) {
	        for (int i = 0; i < 9; i++) {
	            for (int j = 0; j < 9; j++) {
	                celdas[i][j].setText(tablero[i][j] == 0 ? "" : String.valueOf(tablero[i][j]));
	            }
	        }
	    }
	    
	    
	 // --- Método para crear bordes más gruesos en los bloques 3x3 ---
	    private javax.swing.border.Border crearBordeCelda(int fila, int col) {
	        int top = (fila % 3 == 0) ? 3 : 1;
	        int left = (col % 3 == 0) ? 3 : 1;
	        int bottom = (fila == 8) ? 3 : 1;
	        int right = (col == 8) ? 3 : 1;

	        return BorderFactory.createMatteBorder(top, left, bottom, right, Color.BLACK);
	    }

	    public void mostrarMensaje(String mensaje) {
	        JOptionPane.showMessageDialog(frame, mensaje);
	    }
	

	    public JButton getBtnResolver() {
	        return btnResolver;
	    }

	    public JButton getBtnLimpiar() {
	        return btnLimpiar;
	    }
}
