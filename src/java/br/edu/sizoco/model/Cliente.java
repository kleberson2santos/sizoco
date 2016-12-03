
package br.edu.sizoco.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;


@Entity
@Table(name = "cliente")
public class Cliente extends Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;
    @NotNull(message = "O CPF não pode ser Nullo")
    @NotBlank(message="O CPF não pode estar em branco")
    @Length(max=14,message="O CPF não pode ter mais de {max} caracteres")
    @CPF(message="O CPF deve ser válido")
    private String cpf;
    
    public Cliente() {
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

   

    
}
