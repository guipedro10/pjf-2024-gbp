package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import application.model.Livro;
import application.repository.LivroRepository;

@Controller
@RequestMapping("/livros")
public class LivroController {
    @Autowired
    private LivroRepository livroRepo;

    @RequestMapping("/list")
    public String list(Model ui) {
        //Livro[] livros = new Livro[2];
        //livros[0] = new Livro();
        //livros[0].setId(1);
        //livros[0].setTitulo("Livro Teste 1");
        //livros[0].setGenero("G1");
        //livros[1] = new Livro();
        //livros[1].setId(2);
        //livros[1].setTitulo("Livro Teste 2");
        //livros[1].setGenero("G2");

        ui.addAttribute("livros", livroRepo.findAll());

        return "/livros/list";
    }

    @RequestMapping("/insert")
    public String insert() {
        return "/livros/insert";
    }

    // Método para enviar os dados para o formulário
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@RequestParam("titulo") String titulo, @RequestParam("genero") String genero) {

        Livro livro = new Livro();
        livro.setTitulo(titulo);
        livro.setGenero(genero);

        livroRepo.save(livro);

        // Redireciona o fluxo da aplicação para outra rota
        return "redirect:/livros/list";
    }

    @RequestMapping("/update/{id}")
    public String update(Model ui, @PathVariable long id) {
        return "/livros/update";
    }

}