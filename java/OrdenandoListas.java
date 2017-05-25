package br.com.teste.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenandoListas {

    public static void main(String[] args) {
        ordenandoComArrays();
        System.out.println("-----------------------");
        ordernandoComJava8();
        System.out.println("-----------------------");
        ordernandoComJava8_outroModo();
        System.out.println("-----------------------");
        ordenandoComComparator();
    }

    public static void ordernandoComJava8() {

        List<String> nomes = new ArrayList<>();

        nomes.add("Rogerio");
        nomes.add("Diego");
        nomes.add("Andre");
        nomes.add("Gustavo");
        nomes.add("Thiago");
        nomes = nomes.stream().sorted().collect(Collectors.toList());

        for (String nome : nomes) {
            System.out.println(nome);
        }

    }

    public static void ordenandoComArrays() {

        int[] numeros = { 32, 02, 69, 00, 14 };

        Arrays.sort(numeros);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }

    public static void ordernandoComJava8_outroModo() {

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Rafael", 35));
        pessoas.add(new Pessoa("Joese", 18));
        pessoas.add(new Pessoa("Angelo", 32));
        pessoas.add(new Pessoa("Guilherme", 22));

        pessoas.sort(Comparator.comparing(Pessoa::getNome));

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }

    }

    public static void ordenandoComComparator() {

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Rafael", 35));
        pessoas.add(new Pessoa("Joese", 18));
        pessoas.add(new Pessoa("Angelo", 32));
        pessoas.add(new Pessoa("Guilherme", 22));

        Collections.sort(pessoas, new Comparator<Pessoa>() {
            public int compare(Pessoa p1, Pessoa p2) {
                return p1.getNome().compareTo(p2.getNome());
            }
        });

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }
    }

    public static class Pessoa {

        private String nome;
        private int idade;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public int getIdade() {
            return idade;
        }

    }

}