package lista01.exercicio4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperaturaCelsius = solicitarTemperaturaCelsius(scanner);
        double temperaturaFahrenheit = calcularTemperaturaFahrenheit(temperaturaCelsius);
        System.out.println("A temperatura em Fahrenheit é: " + String.format("%.4f", temperaturaFahrenheit));
    }

    public static double solicitarTemperaturaCelsius(Scanner scanner) {
        System.out.println("Digite a temperatura em graus Celsius: ");
        return scanner.nextDouble();
    }

    public static double calcularTemperaturaFahrenheit(double temperaturaCelsius) {
        return temperaturaCelsius * 1.8 + 32;
    }
}