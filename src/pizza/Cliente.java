/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizza;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private ArrayList<Pedido> pedidos;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

   }
