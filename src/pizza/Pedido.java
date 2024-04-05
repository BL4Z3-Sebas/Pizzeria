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
public abstract class  Pedido {
    protected Cliente cliente;
    protected ArrayList<Item> items;

    public Pedido(Cliente cliente, ArrayList<Item> items) {
        this.cliente = cliente;
        this.items = items;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
    
}
