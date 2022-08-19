
import java.time.LocalDate;

import javax.swing.text.AbstractDocument.Content;

import model.entities.Conteudo;
import model.entities.Curso;
import model.entities.Mentoria;

public class Main {
    public static void main(String[] args){
        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("descricao curso java");
        curso.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("descricao curso js");
        curso2.setCargahoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso);
        System.out.println(curso2);
        System.out.println(mentoria);
    }
    
}
