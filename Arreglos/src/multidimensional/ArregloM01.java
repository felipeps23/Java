package multidimensional;

public class ArregloM01 {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		int[][] matrix = {{7, 8, 9}, {1, 5, 7}, {5, 8 , 3}};
		
		int x = matrix[2][2];
		
		// System.out.println(x);

		// Recorremos la matriz
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) { // Este matrix[i] sirve para cuando la matriz no sea cuadrada
				System.out.println(matrix[i][j]);
			}
		}
	}

}
