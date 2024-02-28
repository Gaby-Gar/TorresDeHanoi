/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package torresdehanoi;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class TorresDeHanoiRecursividad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de discos: ");
        int n = scanner.nextInt();

        System.out.println("Movimientos para resolver las Torres de Hanoi:");
        resolverHanoi(n, 'A', 'C', 'B');
    }

    public static void resolverHanoi(int n, char origen, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("Mover disco 1 de " + origen + " a " + destino);
        } else {
            resolverHanoi(n - 1, origen, auxiliar, destino);
            System.out.println("Mover disco " + n + " de " + origen + " a " + destino);
            resolverHanoi(n - 1, auxiliar, destino, origen);
        }
    }
}

