package com.supermercado.domicilios.principal;

import com.supermercado.domicilios.dao.ClienteDAO;
import com.supermercado.domicilios.modelo.Cliente;

public class App {
    public static void main(String[] args) {
        ClienteDAO dao = new ClienteDAO();

        // Insertar
        Cliente nuevo = new Cliente("Laura Pérez", "laura@email.com");
        dao.insertar(nuevo);

        // Listar
        dao.listar().forEach(c -> System.out.println(c.getNombre() + " - " + c.getCorreo()));

        // Actualizar (usando un ID fijo de ejemplo)
        Cliente actualizado = new Cliente(1, "Laura Actualizada", "laura@nuevo.com");
        dao.actualizar(actualizado);

        // Eliminar (el mismo ID usado antes)
        dao.eliminar(1);
    }
}