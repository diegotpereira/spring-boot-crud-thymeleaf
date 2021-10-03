package br.com.java.springbootcrudthymeleaf.entidade;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table( name =  "tb_pessoaJuridica")
public class pessoaJuridica {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pessoaJuridica_id")
    private Long id;

    @NotBlank
    @Size(max = 100)
    private String nomeFantasia;

    @NotBlank
    @Size(max = 100)
    private String razao;

    @NotBlank
    @Size(max = 15)
    private String cnpj;

    @Pattern(regexp ="^\\+?[0-9. ()-]{7,25}$", message = "Telefone número")
    @Size(max = 25)
    private String telefone;

    @Email(message = "Endereço Email")
    @Size(max = 100)
    private String email;

    @Size(max = 50)
    private String endereco;

    public pessoaJuridica() {
    }

    public pessoaJuridica(Long id, @NotBlank @Size(max = 100) String nomeFantasia,
            @NotBlank @Size(max = 100) String razao, @NotBlank @Size(max = 15) String cnpj,
            @Pattern(regexp = "^\\+?[0-9. ()-]{7,25}$", message = "Telefone número") @Size(max = 25) String telefone,
            @Email(message = "Endereço Email") @Size(max = 100) String email, @Size(max = 50) String endereco) {
        this.id = id;
        this.nomeFantasia = nomeFantasia;
        this.razao = razao;
        this.cnpj = cnpj;
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

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
