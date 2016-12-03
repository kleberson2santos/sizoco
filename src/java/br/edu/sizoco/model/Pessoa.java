
package br.edu.sizoco.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "pessoa")
public class Pessoa implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pessoa")
    private Collection<Cliente> clienteCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_pessoa")
    private Integer idPessoa;

    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "nome")
    private String nome;
    
    @Size(max = 20)
    @Column(name = "telefone")
    private String telefone;
    
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "email")
    private String email;
    
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "usuario_login")
    private String usuarioLogin;
    
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "usuario_password")
    private String usuarioPassword;
    
    @JoinColumn(name = "id_tipo_perfil", referencedColumnName = "id_tipo_perfil")
    @ManyToOne(optional = false)
    private TipoPerfil idTipoPerfil;

    public Pessoa() {
    }

    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public String getUsuarioLogin() {
        return usuarioLogin;
    }

    public void setUsuarioLogin(String usuarioLogin) {
        this.usuarioLogin = usuarioLogin;
    }

    public String getUsuarioPassword() {
        return usuarioPassword;
    }

    public void setUsuarioPassword(String usuarioPassword) {
        this.usuarioPassword = usuarioPassword;
    }

    public TipoPerfil getIdTipoPerfil() {
        return idTipoPerfil;
    }

    public void setIdTipoPerfil(TipoPerfil idTipoPerfil) {
        this.idTipoPerfil = idTipoPerfil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPessoa != null ? idPessoa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pessoa)) {
            return false;
        }
        Pessoa other = (Pessoa) object;
        if ((this.idPessoa == null && other.idPessoa != null) || (this.idPessoa != null && !this.idPessoa.equals(other.idPessoa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "[" + idPessoa + "]";
    }

    public Collection<Cliente> getClienteCollection() {
        return clienteCollection;
    }

    public void setClienteCollection(Collection<Cliente> clienteCollection) {
        this.clienteCollection = clienteCollection;
    }
    
}
