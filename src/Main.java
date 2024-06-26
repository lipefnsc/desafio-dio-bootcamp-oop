import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso("curso java", "descrição curso java", 8);
        Curso curso2 = new Curso("curso js", "descrição curso js", 4);
        Mentoria mentoria = new Mentoria("mentoria de java", "descrição da mentoria java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");

        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devFelipe = new Dev("Felipe");
        devFelipe.inscreverBootcamp(bootcamp);

        Dev devJoao = new Dev("Joao");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos Felipe: ");
        devFelipe.getConteudosInscritos().forEach(System.out::println);

        System.out.println();
        System.out.println("----- PROGRESSÃO -----");
        System.out.println();

        devFelipe.progredir();
        devFelipe.getConteudosConcluidos().forEach(System.out::println);
        System.out.println("XP Total: " + devFelipe.calcularTotalXp());

        System.out.println();
        System.out.println("Exibir todos os iscritos do bootcamp");
        bootcamp.exibirInscritos();
        System.out.println("Há quantos iscritos no bootcamp?");
        System.out.println(bootcamp.contarInscritos());

    }
}
