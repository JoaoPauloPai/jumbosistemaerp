/*
 * The MIT License
 * 
 * Copyright: Copyright (C) 2014 T2Ti.COM
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
 * The author may be contacted at: t2ti.com@gmail.com
 *
 * @author Claudio de Barros (T2Ti.com)
 * @version 2.0
 */
package adm.com.jumbo.padrao.cliente;

import adm.com.jumbo.cadastros.cliente.AgenciaBancoGridController;
import adm.com.jumbo.cadastros.cliente.AlmoxarifadoGridController;
import adm.com.jumbo.cadastros.cliente.AtividadeForCliGridController;
import adm.com.jumbo.cadastros.cliente.BancoGridController;
import adm.com.jumbo.cadastros.cliente.CargoGridController;
import adm.com.jumbo.cadastros.cliente.CepGridController;
import adm.com.jumbo.cadastros.cliente.CfopGridController;
import adm.com.jumbo.cadastros.cliente.ChequeGridController;
import adm.com.jumbo.cadastros.cliente.ClienteGridController;
import adm.com.jumbo.cadastros.cliente.ColaboradorGridController;
import adm.com.jumbo.cadastros.cliente.ContaCaixaGridController;
import adm.com.jumbo.cadastros.cliente.ContadorGridController;
import adm.com.jumbo.cadastros.cliente.ConvenioGridController;
import adm.com.jumbo.cadastros.cliente.EstadoCivilGridController;
import adm.com.jumbo.cadastros.cliente.FeriadosGridController;
import adm.com.jumbo.cadastros.cliente.FornecedorGridController;
import adm.com.jumbo.cadastros.cliente.MunicipioGridController;
import adm.com.jumbo.cadastros.cliente.NcmGridController;
import adm.com.jumbo.cadastros.cliente.NivelFormacaoGridController;
import adm.com.jumbo.cadastros.cliente.OperadoraCartaoGridController;
import adm.com.jumbo.cadastros.cliente.OperadoraPlanoSaudeGridController;
import adm.com.jumbo.cadastros.cliente.PaisGridController;
import adm.com.jumbo.cadastros.cliente.PapelGridController;
import adm.com.jumbo.cadastros.cliente.PessoaGridController;
import adm.com.jumbo.cadastros.cliente.ProdutoGridController;
import adm.com.jumbo.cadastros.cliente.ProdutoGrupoGridController;
import adm.com.jumbo.cadastros.cliente.ProdutoMarcaGridController;
import adm.com.jumbo.cadastros.cliente.ProdutoSubGrupoGridController;
import adm.com.jumbo.cadastros.cliente.SetorGridController;
import adm.com.jumbo.cadastros.cliente.SindicatoGridController;
import adm.com.jumbo.cadastros.cliente.SituacaoColaboradorGridController;
import adm.com.jumbo.cadastros.cliente.SituacaoForCliGridController;
import adm.com.jumbo.cadastros.cliente.TalonarioChequeGridController;
import adm.com.jumbo.cadastros.cliente.TipoAdmissaoGridController;
import adm.com.jumbo.cadastros.cliente.TipoColaboradorGridController;
import adm.com.jumbo.cadastros.cliente.TipoDesligamentoGridController;
import adm.com.jumbo.cadastros.cliente.TipoRelacionamentoGridController;
import adm.com.jumbo.cadastros.cliente.TransportadoraGridController;
import adm.com.jumbo.cadastros.cliente.UfGridController;
import adm.com.jumbo.cadastros.cliente.UnidadeProdutoGridController;
import adm.com.jumbo.cadastros.cliente.UsuarioGridController;
import cof.com.jumbo.sintegra.cliente.SintegraController;
import cof.com.jumbo.sped.cliente.SpedContribuicoesGridController;
import cof.com.jumbo.sped.cliente.SpedFiscalGridController;
import com.com.jumbo.nfe.cliente.NfeGridController;
import com.com.jumbo.nfe.cliente.NfeStatusServicoController;
import javax.swing.JOptionPane;
import org.openswing.swing.mdi.client.*;

public class Fachada implements ClientFacade {

    public Fachada() {
    }
     //Bloco Administrativo
    //Cadastro Base
    //PESSOA
    public void getEstadoCivil() {
        new EstadoCivilGridController();
    }

    public void getPessoa() {
        new PessoaGridController();
    }
    
    //CLIENTE - FORNECEDOR - TRANSPORTADORA
    public void getAtividadeForCli() {
        new AtividadeForCliGridController();
    }

    public void getSituacaoForCli() {
        new SituacaoForCliGridController();
    }

    public void getCliente() {
        new ClienteGridController();
    }

    public void getFornecedor() {
        new FornecedorGridController();
    }

    public void getTransportadora() {
        new TransportadoraGridController();
    }

    //COLABORADOR
    public void getTipoAdmissao() {
        new TipoAdmissaoGridController();
    }

    public void getTipoRelacionamento() {
        new TipoRelacionamentoGridController();
    }

    public void getSituacaoColaborador() {
        new SituacaoColaboradorGridController();
    }

    public void getTipoDesligamento() {
        new TipoDesligamentoGridController();
    }

    public void getTipoColaborador() {
        new TipoColaboradorGridController();
    }

    public void getCargo() {
        new CargoGridController();
    }

    public void getNivelFormacao() {
        new NivelFormacaoGridController();
    }

    public void getColaborador() {
        new ColaboradorGridController();
    }
    
    //Pessoal - Outros
    public void getContador() {
        new ContadorGridController();
    }

    public void getSindicato() {
        new SindicatoGridController();
    }

    public void getConvenio() {
        new ConvenioGridController();
    }
    
    //Diversos
    public void getSetor() {
        new SetorGridController();
    }

    public void getAlmoxarifado() {
        new AlmoxarifadoGridController();
    }

    public void getOperadoraPlanoSaude() {
        new OperadoraPlanoSaudeGridController();
    }

    public void getOperadoraCartao() {
        new OperadoraCartaoGridController();
    }
    
    //Endereco
    public void getPais() {
        new PaisGridController();
    }

    public void getUf() {
        new UfGridController();
    }

    public void getMunicipio() {
        new MunicipioGridController();
    }

    public void getCep() {
        new CepGridController();
    }
    
    //Produto
    public void getProdutoMarca() {
        new ProdutoMarcaGridController();
    }

    public void getNcm() {
        new NcmGridController();
    }

    public void getUnidadeProduto() {
        new UnidadeProdutoGridController();
    }

    public void getProdutoGrupo() {
        new ProdutoGrupoGridController();
    }

    public void getProdutoSubGrupo() {
        new ProdutoSubGrupoGridController();
    }

    public void getProduto() {
        new ProdutoGridController();
    }
    
    //Financeiro
    public void getBanco() {
        new BancoGridController();
    }

    public void getAgenciaBanco() {
        new AgenciaBancoGridController();
    }

    public void getContaCaixa() {
        new ContaCaixaGridController();
    }

    public void getTalonarioCheque() {
        new TalonarioChequeGridController();
    }

    public void getCheque() {
        new ChequeGridController();
    }
    
    //Tabelas
    public void getCfop() {
        new CfopGridController();
    }

    public void getFeriados() {
        new FeriadosGridController();
    }
    
    //Usuarios
      public void getUsuario() {
        new UsuarioGridController();
    }
      
      //Papel
        public void getPapel() {
        new PapelGridController();
    }
    
    
    //Bloco Comercial
    
    //Nfe
       public void getNfe() {
        new NfeGridController();
    }

    public void getStatusServico() {
        new NfeStatusServicoController();
    }
    
    
    //Bloco Contabil e Fiscal
    //Sintegra
      public void getSintegra() {
        new SintegraController();
    }
      
          public void getSpedFiscal() {
        new SpedFiscalGridController();
    }
      
          
    public void getSpedContribuicoes() {
        new SpedContribuicoesGridController();
    }

    public void getFuncaoPadrao() {
        JOptionPane.showMessageDialog(null, "Acesso não autorizado!", "Informação do Sistema", JOptionPane.INFORMATION_MESSAGE);
    }

}
