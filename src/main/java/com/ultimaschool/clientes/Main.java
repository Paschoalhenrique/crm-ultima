package com.ultimaschool.clientes;

import com.ultimaschool.clientes.Cliente;

public class Main {
    public static void main(String[] args) {

        Cliente clienteF = new Cliente("Fernanda", "Ribeiro", "Dutra","123.456.789-00",
                "03/03/1993", 'F', "fernanda@mail.com", "Av Brasil",
                "(11) 9999-9999");
        System.out.println(clienteF.toString());

        Cliente clienteM = new Cliente("Henrique", "", "Dutra","999.888.777-55",
                "22/08/1983", 'M', "rogerio@mail.com", "Av Valter boveri",
                "(15) 8888-8888");

        System.out.println(clienteM.toString());

        ClienteBuilder clienteFCompleto = new ClienteBuilder().comIdentificacao("Ana", "Maria",
                "Santos","123.456.789-00",
                "10/10/1993", 'F').comContatos("ana@mail.com", "Av paulista",
                "(12) 9999-9999");
        System.out.println(clienteFCompleto.toString());

        ClienteBuilder clienteMContatos = new ClienteBuilder();

        ClienteBuilder clienteMIdentificacao = new ClienteBuilder().comIdentificacao("Rogério",
                "", "Azevedo",
                "999.888.777-55", "10/01/2001", 'M');

        System.out.println(clienteMIdentificacao.toStringIndentificacao());

        clienteMContatos = new ClienteBuilder().comContatos("rogerio@mail.com", "Av Interlagos",
                "(21) 8888-8888");

        System.out.println(clienteMContatos.toStringContatos());



    }
}
