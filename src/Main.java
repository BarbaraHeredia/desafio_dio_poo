import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do curso");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devBarbara = new Dev();
        devBarbara.setNome("Barbara");
        devBarbara.inscreverBootcamp(bootcamp);

        System.out.println("Conteudos inscritos de Barbara:" + devBarbara.getConteudosInscritos());

        devBarbara.progredir();
        devBarbara.progredir();

        System.out.println("Conteudos concliodos de Barbara:" + devBarbara.getConteudosConcluidos());
        System.out.println("Conteudos inscritos de Barbara:" + devBarbara.getConteudosInscritos());
        System.out.println("XP- " + devBarbara.calcularTotalXp());

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);

        System.out.println("\n--------------------" +
                "\nConteudos inscritos de Camila: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();

        System.out.println("Conteudos concluidos de Camila: " + devCamila.getConteudosConcluidos());
        System.out.println("Conteudos inscritos de Camila: " + devCamila.getConteudosInscritos());
        System.out.println("XP- " + devCamila.calcularTotalXp());

    }
}
