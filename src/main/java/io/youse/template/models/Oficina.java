package io.youse.template.models;

import io.youse.template.validation.constraints.PlacaCarro;
import lombok.Data;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.List;

@Data
@Entity
@Table(name = "oficinas")
public class Oficina {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "Campo não informado")
    @Pattern(regexp = "^[A-Z]+(.)*", message = "Campo nome deve inciar com letra maiúscula")
    private String nome;

    @Email(message = "Campo inválido")
    @NotBlank(message = "Campo não informado")
    private String email;

    @CPF(message = "Campo inválido")
    @CNPJ(message = "Campo inválido")
    @NotBlank(message = "Campo não informado")
    private String cpfCnpj;

    @NotBlank(message = "Campo não informado")
    @PlacaCarro(message = "Campo inválido")
    private String placaCarro;

    @OneToMany()
    private List<Endereco> enderecos;
}
