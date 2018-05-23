package br.edu.ulbra.submissoes.controller;

import br.edu.ulbra.submissoes.exception.UserException;
import br.edu.ulbra.submissoes.input.UserInput;
import br.edu.ulbra.submissoes.model.User;
import br.edu.ulbra.submissoes.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/usuario")
public class UserController {

    private final UserService userService;

    @Autowired
    UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    @ApiOperation(value="Exibe dados do usuário")
    public ModelAndView exibeUsuario(@PathVariable("userId") Long userId){
        ModelAndView mv = new ModelAndView("user/show");
        try {
            User user = userService.findById(userId);
            mv.addObject("user", user);
            return mv;
        } catch (UserException e){
            mv.addObject("error", e.getMessage());
        }
        return mv;
    }


    // Exemplo para insert de usuário via API
    @PostMapping("/exemplo")
    @ApiOperation(value="Exemplo de inserção de dados de usuário")
    @ResponseBody
    public String exemploInsertUsuario(@RequestBody UserInput userInput){
        userInput.setId(null);
        try {
            userService.save(userInput, false);
        } catch (UserException e) {
            return e.getMessage();
        }
        return "OK";
    }

    // Exemplo para insert de usuário via API
    @GetMapping("/exemplo/{userId}/delete")
    @ApiOperation(value="Exemplo de exclusão de dados de usuário")
    @ResponseBody
    public String exemploInsertUsuario(@PathVariable("userId") Long userId){
        try {
            userService.delete(userId);
        } catch (UserException e) {
            return e.getMessage();
        }
        return "OK";
    }

}
