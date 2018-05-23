package br.edu.ulbra.submissoes.input;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Informações de Usuário")
public class UserInput {

    @ApiModelProperty(example = "1", notes = "Identificador")
    private Long id;
    @ApiModelProperty(example = "user1", notes = "Username")
    private String username;
    @ApiModelProperty(example = "user@dominio.com", notes = "E-mail de contato")
    private String email;
    @ApiModelProperty(example = "Joao Fulano", notes = "Nome do usuário")
    private String nome;
    @ApiModelProperty(example = "password1", notes = "Senha para login")
    private String password;
    @ApiModelProperty(example = "password1", notes = "Confirmação de senha para cadastro/atualização")
    private String passwordConfirm;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }
}
