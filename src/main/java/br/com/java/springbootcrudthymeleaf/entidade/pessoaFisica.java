package br.com.java.springbootcrudthymeleaf.entidade;

import java.sql.Date;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table( name = "tb_pessoaFisica")
public class pessoaFisica {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pessoaFisica_id")
    private Long id;

    @NotBlank
    @Size(max = 100)
    private String nome;

    @NotBlank
    private Date datanascimento;

    @NotBlank
    @Size(max = 15)
    private String cpf;

    @Pattern(regexp ="^\\+?[0-9. ()-]{7,25}$", message = "Telefone número")
    @Size(max = 25)
    private String telefone;

    @Email(message = "Endereço Email")
    @Size(max = 100)
    private String email;

    @Size(max = 50)
    private String endereco;

    public pessoaFisica() {
    }

    public pessoaFisica(Long id, @NotBlank @Size(max = 100) String nome, @NotBlank Date datanascimento,
            @NotBlank @Size(max = 15) String cpf,
            @Pattern(regexp = "^\\+?[0-9. ()-]{7,25}$", message = "Telefone número") @Size(max = 25) String telefone,
            @Email(message = "Endereço Email") @Size(max = 100) String email, @Size(max = 50) String endereco) {
        this.id = id;
        this.nome = nome;
        this.datanascimento = datanascimento;
        this.cpf = cpf;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Date datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
}
