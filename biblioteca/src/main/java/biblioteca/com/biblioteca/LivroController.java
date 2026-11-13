package main.java.biblioteca.com.biblioteca;

import jdk.internal.classfile.impl.BufferedCodeBuilder;
import main.model.Livro;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Livros")
public class LivroController {
    @GetMapping
    public String inicio(){
        return "livros/inicio";
    }

}
public String exibirLivro(BufferedCodeBuilder.Model model){
    Livro livro = new Livro();
    livro.setTitulo("Dom Casmurro");
    livro.setAutor("Machado de Assis");
    livro.setIsbn("978-85-00-00000-0");

    model.addAtribute("livro", livro);

    return "livro";
}