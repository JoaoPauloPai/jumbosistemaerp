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

import adm.com.jumbo.cadastros.java.MoedaVO;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "TABELA_PRECO")
public class TabelaPrecoVO extends ValueObjectImpl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "COEFICIENTE")
    private BigDecimal coeficiente;
    @Column(name = "PRINCIPAL")
    private String principal;
    @Column(name = "BASE_CUSTO")
    private String baseCusto;
    @JoinColumn(name = "ID_MOEDA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private MoedaVO moeda;
    @JoinColumn(name = "ID_TABELA_MESTRE", referencedColumnName = "ID")
    @ManyToOne
    private TabelaPrecoVO tabelaPreco;

    public TabelaPrecoVO() {
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

    public BigDecimal getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(BigDecimal coeficiente) {
        this.coeficiente = coeficiente;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getBaseCusto() {
        return baseCusto;
    }

    public void setBaseCusto(String baseCusto) {
        this.baseCusto = baseCusto;
    }

    public MoedaVO getMoeda() {
        return moeda;
    }

    public void setMoeda(MoedaVO moeda) {
        this.moeda = moeda;
    }

    public TabelaPrecoVO getTabelaPreco() {
        return tabelaPreco;
    }

    public void setTabelaPreco(TabelaPrecoVO tabelaPreco) {
        this.tabelaPreco = tabelaPreco;
    }


    @Override
    public String toString() {
        return "adm.com.jumbo.cadastros.java.TabelaPrecoVO[id=" + id + "]";
    }

}
