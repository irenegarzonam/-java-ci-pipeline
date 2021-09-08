package calculadora.swing;

import javax.swing.JOptionPane;


public class CalculadoraSwing {
    // Constantes para evaluar la operación:
    public static final String SUMA = "+", RESTA = "-", MULTIPLICACION = "*", DIVISION = "/";

    public static Float calcularValores(float valor1, float valor2, String operacion) {
        Float resultado = null;

        if (operacion.equals(SUMA)) {
            resultado = valor1 + valor2;
        }

        if (operacion.equals(RESTA)) {
            resultado = valor1 - valor2;
        }

        if (operacion.equals(MULTIPLICACION)) {
            resultado = valor1 * valor2;
        }

        if (operacion.equals(DIVISION)) {
            resultado = valor1 / valor2;
        }

        return resultado;
    }

    public static void mostrarCalculadora() {
        String valor1, valor2, operacion;
        operacion = JOptionPane.showInputDialog("¿Operación? ");
        valor1 = JOptionPane.showInputDialog("Valor 1: ");
        valor2 = JOptionPane.showInputDialog("Valor 2: ");
        System.out.println("Calculando: " + valor1 + " " + operacion + " " + valor2);
        float flotante1 = Float.parseFloat(valor1);
        float flotante2 = Float.parseFloat(valor2);
        Float res = calcularValores(flotante1, flotante2, operacion);

        if(res == null) {
            JOptionPane.showMessageDialog(null, "Operación inválida.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Resultado: " + res);
        }
    }

    public static void main(String[] args) {
        mostrarCalculadora();
		/* Para probar la calculadora:
		System.out.println("SUMA: " + calcularValores(2f, 3f, CalculadoraSwing.SUMA));
		System.out.println("RESTA: " + calcularValores(2f, 3f, CalculadoraSwing.RESTA));
		*/
    }
}
