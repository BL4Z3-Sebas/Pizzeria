/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizza;

import java.util.ArrayList;

/**
 *
 * @author smindiola
 */
public class Pizzeria {

    private String nombre;
    private ArrayList<Cliente> cliente;
    private ArrayList<Item> items;
    private ArrayList<Pedido> pedidos;

    public Pizzeria(String nombre, ArrayList<Cliente> cliente, ArrayList<Item> items, ArrayList<Pedido> pedidos) {
        this.nombre = nombre;
        this.cliente = cliente;
        this.items = items;
        this.pedidos = pedidos;
    }

    public boolean addCliente(Cliente cliente) {
         boolean verificar = false;

        if (this.cliente.contains(cliente)) {
            verificar = false;
        } else {
            this.cliente.add(cliente);
            verificar = true;
        }

        return verificar;
    }

    public boolean addPedido(Pedido pedidos) {
          boolean verificar = false;

        if (this.pedidos.contains(pedidos)) {
            verificar = false;
        } else {
            this.pedidos.add(pedidos);
            verificar = true;
        }

        return verificar;
    }

    public boolean addItem(Item items) {
        boolean verificar = false;

        if (this.items.contains(items)) {
            verificar = false;
        } else {
            this.items.add(items);
            verificar = true;
        }

        return verificar;
    }

}
