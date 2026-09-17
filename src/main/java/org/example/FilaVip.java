package org.example;

import java.util.LinkedList;

public class FilaVip {

    private LinkedList <String> cola = new LinkedList<>();

    public void agregarClienteNormal(String nombreClienteN){
        cola.addLast(nombreClienteN);
        System.out.println("Cliente Normal" + nombreClienteN + "Agregado");
    };

    public void agregarClienteVIP(String nombreClienteVIP){
        cola.addFirst(nombreClienteVIP);
        System.out.println("Cliente VIP" + nombreClienteVIP + "Agregado");
    }

    public void atenderSiguienteCliente() {
        if (!cola.isEmpty()) {
            String atendido = cola.pollFirst();
            System.out.println("Atendiendo a:" + atendido);
            System.out.println("Siguiente en lista: " + cola.peekFirst());
        } else {
            System.out.println("No hay clientes en cola");
        }
    }
}
