package CollectionsV;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorsExampleList {
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Pedro",19));
        estudantes.add(new Estudante("Carlos",23));
        estudantes.add(new Estudante("Mariana",22));
        estudantes.add(new Estudante("João",18));
        estudantes.add(new Estudante("Thiago",19));
        estudantes.add(new Estudante("George",22));
        estudantes.add(new Estudante("larissa",21));

        System.out.println("---- ORDEM DE INSERÇÃO ---");
        System.out.println(estudantes);


        estudantes.sort((primeiro, segundo) -> primeiro.getIdade() - segundo.getIdade());
        System.out.println("--- ORDEM NATURAL DOS NÚMEROS - IDADE ----");
        System.out.println(estudantes);

        estudantes.sort((primeiro, segundo) -> segundo.getIdade() - primeiro.getIdade());
        System.out.println("--- ORDEM REVERSA DOS NÚMEROS - IDADE ----");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println("--- ORDEM NATURAL DOS NÚMEROS - IDADE (method reference) ----");
        System.out.println(estudantes);

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println("--- ORDEM REVERSA DOS NÚMEROS - IDADE (method reference) ----");
        System.out.println(estudantes);

        Collections.sort(estudantes);
        System.out.println("--- ORDEM NATURAL DOS NÚMEROS - IDADE (interface Comparable) ----");
        System.out.println(estudantes);

        Collections.sort(estudantes,new EstudanteOrdemIdadeReversaCoparator());
        System.out.println("--- ORDEM REVERSA DOS NÚMEROS - IDADE (interface Comparable) ----");
        System.out.println(estudantes);
    }
}
