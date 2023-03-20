/**
 * Copyright [2023] [jesus.joanaazuara@usp.ceu.es]
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing,
software distributed under the License is distributed on an
"AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
either express or implied. See the License for the specific
language governing permissions and limitations under the
License
 */

package com.jjoana;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        NumeroPi objeto = new NumeroPi();
        Scanner sc = new Scanner(System.in);
        int numeroIteraciones=0;
        System.out.println("Introduzca el numero de iteraciones");
        numeroIteraciones = sc.nextInt();
        float resultado = objeto.NumeroPiI(numeroIteraciones);
        System.out.println("resultado: + " + resultado);
    }
}

class NumeroPi {

    float total = 0f;
    float circulo = 0f;

    public float NumeroPiI(int numeroIteraciones) {
        for (int i = 1; i <= numeroIteraciones; i++) {
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
