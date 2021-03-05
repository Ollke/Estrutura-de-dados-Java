package main;

import java.util.Vector;

class Pessoa{
    String nome;

    public Pessoa(){

    }
    public Pessoa(String nome){
        this.nome = nome;
    }
}


class main {
    
    public static void main(String[] args) {

        Vector<Pessoa> v = new Vector<Pessoa>();

        String x = "opa";

        Pessoa p1 = new Pessoa(x);
        Pessoa p2 = new Pessoa("jorge");

        v.add(p1);
        v.add(p2);

        System.out.println(v.isEmpty());


    }
}