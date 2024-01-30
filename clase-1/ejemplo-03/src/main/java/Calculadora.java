public class Calculadora {
    public static void main(String[] args) {
        // Recibe entrada un numero
        // Recibe entrada otro numero
        // Suma los dos numeros
        // Imprime el resultado
        String primerEntrada = "2";
        String segundaEntrada = "2";
        // Parsear a int
        int primerNumero = Integer.parseInt(primerEntrada);
        int segundoNumero = Integer.parseInt(segundaEntrada);
        int resultado = primerNumero + segundoNumero;
        System.out.println("El resultado es: " + resultado);
    }
    
}