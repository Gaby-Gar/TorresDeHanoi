/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package torresdehanoi;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
import java.util.Stack;

public class TorresDeHanoi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de discos: ");
        int n = scanner.nextInt();

        System.out.println("Movimientos para resolver las Torres de Hanoi:");
        resolverHanoi(n, 'A', 'C', 'B');
    }

    public static void resolverHanoi(int n, char origen, char destino, char auxiliar) {
        Stack<Integer> pilaOrigen = new Stack<>();
        Stack<Integer> pilaDestino = new Stack<>();
        Stack<Integer> pilaAuxiliar = new Stack<>();

        int totalMovimientos = (int) Math.pow(2, n) - 1;

        // Llenar la pila de origen con los discos
        for (int i = n; i >= 1; i--) {
            pilaOrigen.push(i);
        }

        // Realizar los movimientos iterativamente
        for (int i = 1; i <= totalMovimientos; i++) {
            if (i % 3 == 1) {
                moverDisco(pilaOrigen, pilaDestino, origen, destino);
            } else if (i % 3 == 2) {
                moverDisco(pilaOrigen, pilaAuxiliar, origen, auxiliar);
            } else if (i % 3 == 0) {
                moverDisco(pilaAuxiliar, pilaDestino, auxiliar, destino);
            }
        }
    }

    public static void moverDisco(Stack<Integer> pilaOrigen, Stack<Integer> pilaDestino, char origen, char destino) {
        int disco = pilaOrigen.pop();
        pilaDestino.push(disco);
        System.out.println("Mover disco " + disco + " de " + origen + " a " + destino);
    }
}
