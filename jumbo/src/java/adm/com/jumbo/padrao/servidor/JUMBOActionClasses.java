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
package adm.com.jumbo.padrao.servidor;

import adm.com.jumbo.cadastros.servidor.AgenciaBancoDetalheAction;
import adm.com.jumbo.cadastros.servidor.AgenciaBancoGridAction;
import adm.com.jumbo.cadastros.servidor.AlmoxarifadoDetalheAction;
import adm.com.jumbo.cadastros.servidor.AlmoxarifadoGridAction;
import adm.com.jumbo.cadastros.servidor.AtividadeForCliDetalheAction;
import adm.com.jumbo.cadastros.servidor.AtividadeForCliGridAction;
import adm.com.jumbo.cadastros.servidor.BancoDetalheAction;
import adm.com.jumbo.cadastros.servidor.BancoGridAction;
import adm.com.jumbo.cadastros.servidor.CargoDetalheAction;
import adm.com.jumbo.cadastros.servidor.CargoGridAction;
import adm.com.jumbo.cadastros.servidor.CepDetalheAction;
import adm.com.jumbo.cadastros.servidor.CepGridAction;
import adm.com.jumbo.cadastros.servidor.CfopDetalheAction;
import adm.com.jumbo.cadastros.servidor.CfopGridAction;
import adm.com.jumbo.cadastros.servidor.ChequeDetalheAction;
import adm.com.jumbo.cadastros.servidor.ChequeGridAction;
import adm.com.jumbo.cadastros.servidor.ClienteDetalheAction;
import adm.com.jumbo.cadastros.servidor.ClienteGridAction;
import adm.com.jumbo.cadastros.servidor.ColaboradorDetalheAction;
import adm.com.jumbo.cadastros.servidor.ColaboradorGridAction;
import adm.com.jumbo.cadastros.servidor.ContaCaixaDetalheAction;
import adm.com.jumbo.cadastros.servidor.ContaCaixaGridAction;
import adm.com.jumbo.cadastros.servidor.ContadorDetalheAction;
import adm.com.jumbo.cadastros.servidor.ContadorGridAction;
import adm.com.jumbo.cadastros.servidor.ConvenioDetalheAction;
import adm.com.jumbo.cadastros.servidor.ConvenioGridAction;
import adm.com.jumbo.cadastros.servidor.EstadoCivilDetalheAction;
import adm.com.jumbo.cadastros.servidor.EstadoCivilGridAction;
import adm.com.jumbo.cadastros.servidor.FeriadosDetalheAction;
import adm.com.jumbo.cadastros.servidor.FeriadosGridAction;
import adm.com.jumbo.cadastros.servidor.FornecedorDetalheAction;
import adm.com.jumbo.cadastros.servidor.FornecedorGridAction;
import adm.com.jumbo.cadastros.servidor.MunicipioDetalheAction;
import adm.com.jumbo.cadastros.servidor.MunicipioGridAction;
import adm.com.jumbo.cadastros.servidor.NcmGridAction;
import adm.com.jumbo.cadastros.servidor.NivelFormacaoDetalheAction;
import adm.com.jumbo.cadastros.servidor.NivelFormacaoGridAction;
import adm.com.jumbo.cadastros.servidor.OperadoraCartaoDetalheAction;
import adm.com.jumbo.cadastros.servidor.OperadoraCartaoGridAction;
import adm.com.jumbo.cadastros.servidor.OperadoraPlanoSaudeDetalheAction;
import adm.com.jumbo.cadastros.servidor.OperadoraPlanoSaudeGridAction;
import adm.com.jumbo.cadastros.servidor.PaisDetalheAction;
import adm.com.jumbo.cadastros.servidor.PaisGridAction;
import adm.com.jumbo.cadastros.servidor.PapelDetalheAction;
import adm.com.jumbo.cadastros.servidor.PapelFuncaoGridAction;
import adm.com.jumbo.cadastros.servidor.PapelGridAction;
import adm.com.jumbo.cadastros.servidor.PessoaContatoGridAction;
import adm.com.jumbo.cadastros.servidor.PessoaDetalheAction;
import adm.com.jumbo.cadastros.servidor.PessoaEnderecoGridAction;
import adm.com.jumbo.cadastros.servidor.PessoaFisicaDetalheAction;
import adm.com.jumbo.cadastros.servidor.PessoaGridAction;
import adm.com.jumbo.cadastros.servidor.PessoaJuridicaDetalheAction;
import adm.com.jumbo.cadastros.servidor.ProdutoDetalheAction;
import adm.com.jumbo.cadastros.servidor.ProdutoGridAction;
import adm.com.jumbo.cadastros.servidor.ProdutoGrupoDetalheAction;
import adm.com.jumbo.cadastros.servidor.ProdutoGrupoGridAction;
import adm.com.jumbo.cadastros.servidor.ProdutoMarcaDetalheAction;
import adm.com.jumbo.cadastros.servidor.ProdutoMarcaGridAction;
import adm.com.jumbo.cadastros.servidor.ProdutoSubGrupoDetalheAction;
import adm.com.jumbo.cadastros.servidor.ProdutoSubGrupoGridAction;
import adm.com.jumbo.cadastros.servidor.SetorDetalheAction;
import adm.com.jumbo.cadastros.servidor.SetorGridAction;
import adm.com.jumbo.cadastros.servidor.SindicatoDetalheAction;
import adm.com.jumbo.cadastros.servidor.SindicatoGridAction;
import adm.com.jumbo.cadastros.servidor.SituacaoColaboradorDetalheAction;
import adm.com.jumbo.cadastros.servidor.SituacaoColaboradorGridAction;
import adm.com.jumbo.cadastros.servidor.SituacaoForCliDetalheAction;
import adm.com.jumbo.cadastros.servidor.SituacaoForCliGridAction;
import adm.com.jumbo.cadastros.servidor.TalonarioChequeDetalheAction;
import adm.com.jumbo.cadastros.servidor.TalonarioChequeGridAction;
import adm.com.jumbo.cadastros.servidor.TipoAdmissaoDetalheAction;
import adm.com.jumbo.cadastros.servidor.TipoAdmissaoGridAction;
import adm.com.jumbo.cadastros.servidor.TipoColaboradorDetalheAction;
import adm.com.jumbo.cadastros.servidor.TipoColaboradorGridAction;
import adm.com.jumbo.cadastros.servidor.TipoDesligamentoDetalheAction;
import adm.com.jumbo.cadastros.servidor.TipoDesligamentoGridAction;
import adm.com.jumbo.cadastros.servidor.TipoRelacionamentoDetalheAction;
import adm.com.jumbo.cadastros.servidor.TipoRelacionamentoGridAction;
import adm.com.jumbo.cadastros.servidor.TransportadoraDetalheAction;
import adm.com.jumbo.cadastros.servidor.TransportadoraGridAction;
import adm.com.jumbo.cadastros.servidor.UfDetalheAction;
import adm.com.jumbo.cadastros.servidor.UfGridAction;
import adm.com.jumbo.cadastros.servidor.UnidadeProdutoDetalheAction;
import adm.com.jumbo.cadastros.servidor.UnidadeProdutoGridAction;
import adm.com.jumbo.cadastros.servidor.UsuarioDetalheAction;
import adm.com.jumbo.cadastros.servidor.UsuarioGridAction;
import cof.com.jumbo.sintegra.servidor.GeraSintegraAction;
import cof.com.jumbo.sped.servidor.GeraSpedContribuicoesAction;
import cof.com.jumbo.sped.servidor.GeraSpedFiscalAction;
import com.com.jumbo.nfe.servidor.NfeDetalheAction;
import com.com.jumbo.nfe.servidor.NfeGridAction;
import com.com.jumbo.nfe.servidor.NfeStatusServicoAction;
import com.com.jumbo.nfe.servidor.NfeTributAction;
import org.openswing.swing.server.ActionsCollection;
import org.openswing.swing.server.Action;

public class JUMBOActionClasses extends ActionsCollection {

    public JUMBOActionClasses() {
        Action a = null;

        //infra
        a = new JUMBOButtonAuthorizationsAction(); put(a.getRequestName(), a);
        a = new JUMBOFunctionAuthorizationsAction(); put(a.getRequestName(), a);
        a = new UserLoginAction(); put(a.getRequestName(), a);
        a = new JUMBOContainerAction(); put(a.getRequestName(), a);

        /*actions do módulo */
        //Administrativo
        
        //Cadastros
        //PESSOA
        a = new EstadoCivilGridAction(); put(a.getRequestName(), a);
        a = new EstadoCivilDetalheAction(); put(a.getRequestName(), a);
        a = new PessoaGridAction(); put(a.getRequestName(), a);
        a = new PessoaDetalheAction(); put(a.getRequestName(), a);
        a = new PessoaContatoGridAction(); put(a.getRequestName(), a);
        a = new PessoaEnderecoGridAction(); put(a.getRequestName(), a);
        a = new PessoaFisicaDetalheAction(); put(a.getRequestName(), a);
        a = new PessoaJuridicaDetalheAction(); put(a.getRequestName(), a);

        //CLIENTE - FORNECEDOR - TRANSPORTADORA
        a = new AtividadeForCliGridAction(); put(a.getRequestName(), a);
        a = new AtividadeForCliDetalheAction(); put(a.getRequestName(), a);
        a = new SituacaoForCliGridAction(); put(a.getRequestName(), a);
        a = new SituacaoForCliDetalheAction(); put(a.getRequestName(), a);
        a = new ClienteGridAction(); put(a.getRequestName(), a);
        a = new ClienteDetalheAction(); put(a.getRequestName(), a);
        a = new FornecedorGridAction(); put(a.getRequestName(), a);
        a = new FornecedorDetalheAction(); put(a.getRequestName(), a);
        a = new TransportadoraGridAction(); put(a.getRequestName(), a);
        a = new TransportadoraDetalheAction(); put(a.getRequestName(), a);
        
        //Colaborador
        a = new TipoAdmissaoGridAction(); put(a.getRequestName(), a);
        a = new TipoAdmissaoDetalheAction(); put(a.getRequestName(), a);
        a = new TipoRelacionamentoGridAction(); put(a.getRequestName(), a);
        a = new TipoRelacionamentoDetalheAction(); put(a.getRequestName(), a);
        a = new SituacaoColaboradorGridAction(); put(a.getRequestName(), a);
        a = new SituacaoColaboradorDetalheAction(); put(a.getRequestName(), a);
        a = new TipoDesligamentoGridAction(); put(a.getRequestName(), a);
        a = new TipoDesligamentoDetalheAction(); put(a.getRequestName(), a);
        a = new TipoColaboradorGridAction(); put(a.getRequestName(), a);
        a = new TipoColaboradorDetalheAction(); put(a.getRequestName(), a);
        a = new CargoGridAction(); put(a.getRequestName(), a);
        a = new CargoDetalheAction(); put(a.getRequestName(), a);
        a = new NivelFormacaoGridAction(); put(a.getRequestName(), a);
        a = new NivelFormacaoDetalheAction(); put(a.getRequestName(), a);
        a = new ColaboradorGridAction(); put(a.getRequestName(), a);
        a = new ColaboradorDetalheAction(); put(a.getRequestName(), a);
        
        //Usuarios
        a = new UsuarioGridAction(); put(a.getRequestName(), a);
        a = new UsuarioDetalheAction(); put(a.getRequestName(), a);
        
        //Papel
        a = new PapelGridAction(); put(a.getRequestName(), a);
        a = new PapelDetalheAction(); put(a.getRequestName(), a);
        a = new PapelFuncaoGridAction(); put(a.getRequestName(), a);
        
        //CONTADOR - SINDICATO - CONVENIO
        a = new ContadorGridAction(); put(a.getRequestName(), a);
        a = new ContadorDetalheAction(); put(a.getRequestName(), a);
        a = new SindicatoGridAction(); put(a.getRequestName(), a);
        a = new SindicatoDetalheAction(); put(a.getRequestName(), a);
        a = new ConvenioGridAction(); put(a.getRequestName(), a);
        a = new ConvenioDetalheAction(); put(a.getRequestName(), a);

        //DIVERSOS
        a = new SetorGridAction(); put(a.getRequestName(), a);
        a = new SetorDetalheAction(); put(a.getRequestName(), a);
        a = new AlmoxarifadoGridAction(); put(a.getRequestName(), a);
        a = new AlmoxarifadoDetalheAction(); put(a.getRequestName(), a);
        a = new OperadoraPlanoSaudeGridAction(); put(a.getRequestName(), a);
        a = new OperadoraPlanoSaudeDetalheAction(); put(a.getRequestName(), a);
        a = new OperadoraCartaoGridAction(); put(a.getRequestName(), a);
        a = new OperadoraCartaoDetalheAction(); put(a.getRequestName(), a);
        
        //ENDERECO
        a = new PaisGridAction(); put(a.getRequestName(), a);
        a = new PaisDetalheAction(); put(a.getRequestName(), a);
        a = new UfGridAction(); put(a.getRequestName(), a);
        a = new UfDetalheAction(); put(a.getRequestName(), a);
        a = new MunicipioGridAction(); put(a.getRequestName(), a);
        a = new MunicipioDetalheAction(); put(a.getRequestName(), a);
        a = new CepGridAction(); put(a.getRequestName(), a);
        a = new CepDetalheAction(); put(a.getRequestName(), a);
        
        //Produto
        a = new ProdutoMarcaGridAction(); put(a.getRequestName(), a);
        a = new ProdutoMarcaDetalheAction(); put(a.getRequestName(), a);
        a = new NcmGridAction(); put(a.getRequestName(), a);
        a = new UnidadeProdutoGridAction(); put(a.getRequestName(), a);
        a = new UnidadeProdutoDetalheAction(); put(a.getRequestName(), a);
        a = new ProdutoGrupoGridAction(); put(a.getRequestName(), a);
        a = new ProdutoGrupoDetalheAction(); put(a.getRequestName(), a);
        a = new ProdutoSubGrupoGridAction(); put(a.getRequestName(), a);
        a = new ProdutoSubGrupoDetalheAction(); put(a.getRequestName(), a);
        a = new ProdutoGridAction(); put(a.getRequestName(), a);
        a = new ProdutoDetalheAction(); put(a.getRequestName(), a);
        
        //FINANCEIRO
        a = new BancoGridAction(); put(a.getRequestName(), a);
        a = new BancoDetalheAction(); put(a.getRequestName(), a);
        a = new AgenciaBancoGridAction(); put(a.getRequestName(), a);
        a = new AgenciaBancoDetalheAction(); put(a.getRequestName(), a);
        a = new ContaCaixaGridAction(); put(a.getRequestName(), a);
        a = new ContaCaixaDetalheAction(); put(a.getRequestName(), a);
        a = new TalonarioChequeGridAction(); put(a.getRequestName(), a);
        a = new TalonarioChequeDetalheAction(); put(a.getRequestName(), a);
        a = new ChequeGridAction(); put(a.getRequestName(), a);
        a = new ChequeDetalheAction(); put(a.getRequestName(), a);

        //TABELAS
        a = new CfopGridAction(); put(a.getRequestName(), a);
        a = new CfopDetalheAction(); put(a.getRequestName(), a);
        a = new FeriadosGridAction(); put(a.getRequestName(), a);
        a = new FeriadosDetalheAction(); put(a.getRequestName(), a);
        
         /*actions do módulo */
         //Contabil e Fisscal
         
         //Sintegra
        a = new GeraSintegraAction(); put(a.getRequestName(), a);
        
        //Contabil e Fiscal
        a = new GeraSpedFiscalAction(); put(a.getRequestName(), a);
        a = new GeraSpedContribuicoesAction(); put(a.getRequestName(), a);

         //Módulo Comercial
        a = new NfeGridAction(); put(a.getRequestName(), a);
        a = new NfeDetalheAction(); put(a.getRequestName(), a);
        a = new NfeStatusServicoAction(); put(a.getRequestName(), a);
        a = new NfeTributAction(); put(a.getRequestName(), a);
        
        
        /*validacoes e importacoes*/
        a = new ImportaDadosAction(); put(a.getRequestName(), a);
        a = new ValidaDadosAction(); put(a.getRequestName(), a);
    }
}
