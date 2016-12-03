/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@MappedSuperclass
@Table(name = "tipo_perfil")
public class TipoPerfil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_perfil")
    private Integer idTipoPerfil;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "descricao")
    private String descricao;

    public TipoPerfil() {
    }

    public TipoPerfil(Integer idTipoPerfil) {
        this.idTipoPerfil = idTipoPerfil;
    }

    public TipoPerfil(Integer idTipoPerfil, String descricao) {
        this.idTipoPerfil = idTipoPerfil;
        this.descricao = descricao;
    }

    public Integer getIdTipoPerfil() {
        return idTipoPerfil;
    }

    public void setIdTipoPerfil(Integer idTipoPerfil) {
        this.idTipoPerfil = idTipoPerfil;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoPerfil != null ? idTipoPerfil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoPerfil)) {
            return false;
        }
        TipoPerfil other = (TipoPerfil) object;
        if ((this.idTipoPerfil == null && other.idTipoPerfil != null) || (this.idTipoPerfil != null && !this.idTipoPerfil.equals(other.idTipoPerfil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.TipoPerfil[ idTipoPerfil=" + idTipoPerfil + " ]";
    }
    
}
