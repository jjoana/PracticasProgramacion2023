package com.jjoana;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        NumeroPi objeto = new NumeroPi();
        Scanner sc = new Scanner(System.in);
        int valor;

        System.out.println("Introduzca el valor");
        valor = sc.nextInt();
        float resultado = objeto.NumeroPiI(valor);
        System.out.println("resultado: + " + objeto.NumeroPiI(resultado));
    }
}

class NumeroPi {

    float total = 0f;
    float circulo = 0f;

    public float NumeroPiI(float resultado) {
        for (int i = 1; i <= resultado; i++) {
            double coordenadasDeX = -1 + 2 * Math.random();
            double coordenadasDeY = -1 + 2 * Math.random();

            // Dependiendo de donde caiga el punto, aumentaré el total o solo el del circulo
            if (Math.sqrt(Math.pow(coordenadasDeX, 2) + Math.pow(coordenadasDeY, 2)) <= 1) {
                circulo++;
            }
            total++;
        }
        float valorPi = 4 * (circulo / total);
        return valorPi;
    }

}
