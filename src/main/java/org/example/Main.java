package org.example;

import java.sql.Struct;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        FilaVip filaVip = new FilaVip();
        int opcion;

        do {
            System.out.println("CONTROL DE CLIENTES EN FILA VIP DE BANCO NACIONAL TISNADO´S CORPORATION");
            System.out.println("1. Agregar cliente normal");
            System.out.println("2. Agregar cliente VIP");
            System.out.println("3. Ver cola de clientes pendientes");
            System.out.println("4. Atender cliente");
            System.out.println("5. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine();

        }switch (opcion) {

            case 1:
                System.out.println("Registrar un cliente normal");
                String nombreClienteNormal = scanner.nextLine();

                filaVip.agregarClienteNormal(nombreClienteNormal);

                System.out.println("Cliente agregado al final de la fila.");
                break;
            case 2:
                System.out.println("Ingrese el nmbre del cliente VIP: ");
                String nombreClienteVip = scanner.nextLine();

                filaVip.agregarClienteVIP(nombreClienteVip);
                System.out.println("Cliente Vip Agregado al principio de la fila");
                break;
            case 3:
                String cliente = scanner.nextLine();
                filaVip.atenderSiguienteCliente();

                if (cliente == null) {
                    System.out.println("No hay clientes en la fila");
                } else {
                    System.out.println("atendiendo al cliente: " + cliente);
                }
                break;
            case 4:
                System.out.println("programa finalizado");
                break;

            default:
                System.out.println("Opcion no valida");
        } while (opcion != 4);

        scanner.close();
    }
}