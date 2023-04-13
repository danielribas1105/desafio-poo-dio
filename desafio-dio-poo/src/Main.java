import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso de JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição da mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDaniel = new Dev();
        devDaniel.setNome("Daniel");
        devDaniel.inscreverBootcamp(bootcamp);
        System.out.println("*** Daniel Developer ***\n");
        System.out.println("Conteúdos inscritos inicialmente Daniel: " + devDaniel.getConteudosInscritos());
        devDaniel.progredir();
        devDaniel.progredir();
        System.out.println("Conteúdos concluídos Daniel: " + devDaniel.getConteudosConcluidos());
        System.out.println("Créditos XP: " + devDaniel.calcularTotalXp());
        System.out.println("Conteúdos ainda inscritos Daniel: " + devDaniel.getConteudosInscritos());

        System.out.println("\n---------- *** ----------\n");

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("*** João Developer ***\n");
        System.out.println("Conteúdos inscritos inicialmente João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos concluídos João: " + devJoao.getConteudosConcluidos());
        System.out.println("Créditos XP: " + devJoao.calcularTotalXp());
        System.out.println("Conteúdos ainda inscritos João: " + devJoao.getConteudosInscritos());

    }
}