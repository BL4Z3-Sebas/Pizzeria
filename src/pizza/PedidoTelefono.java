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
public class PedidoTelefono extends Pedido{
    private int telefono;

    public PedidoTelefono(Cliente cliente,int telefono, ArrayList<Item> items) {
        super(cliente, items);
        this.telefono=telefono;
    }
}
