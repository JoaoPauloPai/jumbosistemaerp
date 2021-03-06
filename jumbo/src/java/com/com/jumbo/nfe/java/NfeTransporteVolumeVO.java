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
package com.com.jumbo.nfe.java;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.openswing.swing.message.receive.java.ValueObjectImpl;


@Entity
@Table(name = "NFE_TRANSPORTE_VOLUME")
public class NfeTransporteVolumeVO extends ValueObjectImpl implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "QUANTIDADE")
    private Integer quantidade;
    @Column(name = "ESPECIE")
    private String especie;
    @Column(name = "MARCA")
    private String marca;
    @Column(name = "NUMERACAO")
    private String numeracao;
    @Column(name = "PESO_LIQUIDO")
    private BigDecimal pesoLiquido;
    @Column(name = "PESO_BRUTO")
    private BigDecimal pesoBruto;
    @JoinColumn(name = "ID_NFE_TRANSPORTE", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private NfeTransporteVO nfeTransporte;
    @OneToMany(mappedBy = "nfeTransporteVolume")
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<NfeTransporteVolumeLacreVO> listaTransporteVolumeLacre;

    public NfeTransporteVolumeVO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(String numeracao) {
        this.numeracao = numeracao;
    }

    public BigDecimal getPesoLiquido() {
        return pesoLiquido;
    }

    public void setPesoLiquido(BigDecimal pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }

    public BigDecimal getPesoBruto() {
        return pesoBruto;
    }

    public void setPesoBruto(BigDecimal pesoBruto) {
        this.pesoBruto = pesoBruto;
    }

    public NfeTransporteVO getNfeTransporte() {
        return nfeTransporte;
    }

    public void setNfeTransporte(NfeTransporteVO nfeTransporte) {
        this.nfeTransporte = nfeTransporte;
    }

    public List<NfeTransporteVolumeLacreVO> getListaTransporteVolumeLacre() {
        return listaTransporteVolumeLacre;
    }

    public void setListaTransporteVolumeLacre(List<NfeTransporteVolumeLacreVO> listaTransporteVolumeLacre) {
        this.listaTransporteVolumeLacre = listaTransporteVolumeLacre;
    }

    @Override
    public String toString() {
        return "com.com.jumbo.nfe.java.NfeTransporteVolumeVO[id=" + id + "]";
    }

}
