/*
* The MIT License
* 
* Copyright: Copyright (C) 2014 JUMBO SISTEMAS
* 
* Permission is hereby granted, free of charge, to any person obtaining a copy
* of this software and associated documentation files (the "Software"), to deal
* in the Software without restriction, including without limitation the rights
* to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
* copies of the Software, and to permit persons to whom the Software is
* furnished to do so, subject to the following conditions:
* 
* The above copyright notice and this permission notice shall be included in
* all copies or substantial portions of the Software.
* 
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
* FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
* AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
* LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
* OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
* THE SOFTWARE.
* 
* The author may be contacted at: jumbosistemas@gmail.com
*
* @author Joao Paulo Gomes (jumbo.com)
* @version 2.0
*/
package adm.com.jumbo.cadastros.java;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.openswing.swing.message.receive.java.ValueObjectImpl;


@Entity
@Table(name = "MUNICIPIO")
public class MunicipioVO extends ValueObjectImpl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "CODIGO_IBGE")
    private Integer codigoIbge;
    @Column(name = "CODIGO_RECEITA_FEDERAL")
    private Integer codigoReceitaFederal;
    @Column(name = "CODIGO_ESTADUAL")
    private Integer codigoEstadual;
    @Column(name = "UF_SIGLA")
    private String ufSigla;
    @JoinColumn(name = "ID_UF", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private UfVO uf;

    public MunicipioVO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(Integer codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    public Integer getCodigoReceitaFederal() {
        return codigoReceitaFederal;
    }

    public void setCodigoReceitaFederal(Integer codigoReceitaFederal) {
        this.codigoReceitaFederal = codigoReceitaFederal;
    }

    public Integer getCodigoEstadual() {
        return codigoEstadual;
    }

    public void setCodigoEstadual(Integer codigoEstadual) {
        this.codigoEstadual = codigoEstadual;
    }

    public String getUfSigla() {
        return ufSigla;
    }

    public void setUfSigla(String ufSigla) {
        this.ufSigla = ufSigla;
    }

    public UfVO getUf() {
        return uf;
    }

    public void setUf(UfVO uf) {
        this.uf = uf;
    }


    @Override
    public String toString() {
        return "adm.com.jumbo.cadastros.java.MunicipioVO[id=" + id + "]";
    }

}
