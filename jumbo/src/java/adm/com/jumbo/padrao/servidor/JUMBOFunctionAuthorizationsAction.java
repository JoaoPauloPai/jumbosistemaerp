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
package adm.com.jumbo.padrao.servidor;

import adm.com.jumbo.cadastros.java.PapelFuncaoVO;
import adm.com.jumbo.cadastros.java.UsuarioVO;
import java.util.ArrayList;
import java.util.List;
import org.openswing.swing.server.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.openswing.swing.message.receive.java.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.openswing.swing.mdi.java.ApplicationFunction;
import org.openswing.swing.internationalization.java.ResourcesFactory;
import org.openswing.swing.tree.java.OpenSwingTreeNode;

public class JUMBOFunctionAuthorizationsAction implements Action {

    public JUMBOFunctionAuthorizationsAction() {
    }

    /**
     * @return request name
     */
    public final String getRequestName() {
        return "getFunctionAuthorizations";
    }

    /**
     * Business logic to execute.
     */
    public final Response executeCommand(Object inputPar, UserSessionParameters userSessionPars, HttpServletRequest request, HttpServletResponse response, HttpSession userSession, ServletContext context) {
        //recupera as definições de internacionalização (objeto Resources)...
        ResourcesFactory factory = (ResourcesFactory) context.getAttribute(Controller.RESOURCES_FACTORY);
        String langId = userSessionPars.getLanguageId();

        /**
         * deve ser gerado de forma automática de acordo com as definições do
         * banco de dados.
         */
        DefaultMutableTreeNode root = new OpenSwingTreeNode();
        root.setUserObject("JUMBO");
        DefaultTreeModel model = new DefaultTreeModel(root);

        // Bloco Administrativo
        ApplicationFunction n1 = new ApplicationFunction(factory.getResources(langId).getResource("Administrativo"),"administrativo.png");

        ApplicationFunction n10 = new ApplicationFunction(factory.getResources(langId).getResource("Cadastros"), null);
        ApplicationFunction n11 = new ApplicationFunction(factory.getResources(langId).getResource("GED Gestao eletronica de documentos"), null);
        ApplicationFunction n12 = new ApplicationFunction(factory.getResources(langId).getResource("Gerador de Etiquetas"), null);
        ApplicationFunction n13 = new ApplicationFunction(factory.getResources(langId).getResource("Agenda Corporativa"), null);
        ApplicationFunction n14 = new ApplicationFunction(factory.getResources(langId).getResource("BI - Bussiness Inteligence"), null);

        ApplicationFunction n110 = new ApplicationFunction(factory.getResources(langId).getResource("Pessoal"), null);
        ApplicationFunction n1111 = new ApplicationFunction(factory.getResources(langId).getResource("Estado Civil"), "estadoCivil", null, "getEstadoCivil");
        ApplicationFunction n1112 = new ApplicationFunction(factory.getResources(langId).getResource("Pessoa"), "pessoa", null, "getPessoa");

        ApplicationFunction n111 = new ApplicationFunction(factory.getResources(langId).getResource("Cliente | Fornecedor | Transportadora"), null);
        ApplicationFunction n1113 = new ApplicationFunction(factory.getResources(langId).getResource("Atividade"), "atividadeForCli", null, "getAtividadeForCli");
        ApplicationFunction n1114 = new ApplicationFunction(factory.getResources(langId).getResource("Situação"), "situacaoForCli", null, "getSituacaoForCli");
        ApplicationFunction n1115 = new ApplicationFunction(factory.getResources(langId).getResource("Cliente"), "cliente", null, "getCliente");
        ApplicationFunction n1116 = new ApplicationFunction(factory.getResources(langId).getResource("Fornecedor"), "fornecedor", null, "getFornecedor");
        ApplicationFunction n1117 = new ApplicationFunction(factory.getResources(langId).getResource("Transportadora"), "transportadora", null, "getTransportadora");

        ApplicationFunction n112 = new ApplicationFunction(factory.getResources(langId).getResource("Colaborador"), null);
        ApplicationFunction n1118 = new ApplicationFunction(factory.getResources(langId).getResource("Tipo Admissão"), "tipoAdmissao", null, "getTipoAdmissao");
        ApplicationFunction n1119 = new ApplicationFunction(factory.getResources(langId).getResource("Tipo Relacionamento"), "tipoRelacionamento", null, "getTipoRelacionamento");
        ApplicationFunction n1120 = new ApplicationFunction(factory.getResources(langId).getResource("Situação"), "situacaoColaborador", null, "getSituacaoColaborador");
        ApplicationFunction n1121 = new ApplicationFunction(factory.getResources(langId).getResource("Tipo Desligamento"), "tipoDesligamento", null, "getTipoDesligamento");
        ApplicationFunction n1122 = new ApplicationFunction(factory.getResources(langId).getResource("Tipo"), "tipoColaborador", null, "getTipoColaborador");
        ApplicationFunction n1123 = new ApplicationFunction(factory.getResources(langId).getResource("Cargo"), "tipoCargo", null, "getCargo");
        ApplicationFunction n1124 = new ApplicationFunction(factory.getResources(langId).getResource("Nível Formação"), "nivelFormacao", null, "getNivelFormacao");
        ApplicationFunction n1125 = new ApplicationFunction(factory.getResources(langId).getResource("Colaborador"), "colaborador", null, "getColaborador");
        ApplicationFunction n1155 = new ApplicationFunction(factory.getResources(langId).getResource("Usuários"), "usuario","usuario.png", "getUsuario");
         ApplicationFunction n1156 = new ApplicationFunction(factory.getResources(langId).getResource("Papéis"), "papel", null, "getPapel");
        
        ApplicationFunction n113 = new ApplicationFunction(factory.getResources(langId).getResource("Outros"), null);
        ApplicationFunction n1126 = new ApplicationFunction(factory.getResources(langId).getResource("Contador"), "contador", null, "getContador");
        ApplicationFunction n1127 = new ApplicationFunction(factory.getResources(langId).getResource("Sindicato"), "sindicato", null, "getSindicato");
        ApplicationFunction n1128 = new ApplicationFunction(factory.getResources(langId).getResource("Convênio"), "convenio", null, "getConvenio");

        ApplicationFunction n114 = new ApplicationFunction(factory.getResources(langId).getResource("Diversos"), null);
        ApplicationFunction n1129 = new ApplicationFunction(factory.getResources(langId).getResource("Setor"), "setor", null, "getSetor");
        ApplicationFunction n1130 = new ApplicationFunction(factory.getResources(langId).getResource("Almoxarifado"), "almoxarifado", null, "getAlmoxarifado");
        ApplicationFunction n1131 = new ApplicationFunction(factory.getResources(langId).getResource("Operadora Plano Saúde"), "operadoraPlanoSaude", null, "getOperadoraPlanoSaude");
        ApplicationFunction n1132 = new ApplicationFunction(factory.getResources(langId).getResource("Operadora Cartão"), "operadoraCartao", null, "getOperadoraCartao");

        ApplicationFunction n115 = new ApplicationFunction(factory.getResources(langId).getResource("Endereço"), null);
        ApplicationFunction n1133 = new ApplicationFunction(factory.getResources(langId).getResource("País"), "pais", null, "getPais");
        ApplicationFunction n1134 = new ApplicationFunction(factory.getResources(langId).getResource("Estado"), "uf", null, "getUf");
        ApplicationFunction n1135 = new ApplicationFunction(factory.getResources(langId).getResource("Município"), "municipio", null, "getMunicipio");
        ApplicationFunction n1136 = new ApplicationFunction(factory.getResources(langId).getResource("CEP"), "cep", null, "getCep");

        ApplicationFunction n116 = new ApplicationFunction(factory.getResources(langId).getResource("Produto"), null);
        ApplicationFunction n1137 = new ApplicationFunction(factory.getResources(langId).getResource("Marca"), "produtoMarca", null, "getProdutoMarca");
        ApplicationFunction n1138 = new ApplicationFunction(factory.getResources(langId).getResource("NCM"), "ncm", null, "getNcm");
        ApplicationFunction n1139 = new ApplicationFunction(factory.getResources(langId).getResource("Unidade"), "unidadeProduto", null, "getUnidadeProduto");
        ApplicationFunction n1140 = new ApplicationFunction(factory.getResources(langId).getResource("Grupo"), "produtoGrupo", null, "getProdutoGrupo");
        ApplicationFunction n1141 = new ApplicationFunction(factory.getResources(langId).getResource("Sub Grupo"), "produtoSubGrupo", null, "getProdutoSubGrupo");
        ApplicationFunction n1142 = new ApplicationFunction(factory.getResources(langId).getResource("Produto"), "produto", null, "getProduto");

        ApplicationFunction n117 = new ApplicationFunction(factory.getResources(langId).getResource("Financeiro"), null);
        ApplicationFunction n1143 = new ApplicationFunction(factory.getResources(langId).getResource("Banco"), "banco", null, "getBanco");
        ApplicationFunction n1144 = new ApplicationFunction(factory.getResources(langId).getResource("Agência"), "agenciaBanco", null, "getAgenciaBanco");
        ApplicationFunction n1145 = new ApplicationFunction(factory.getResources(langId).getResource("Conta Caixa"), "contaCaixa", null, "getContaCaixa");
        ApplicationFunction n1146 = new ApplicationFunction(factory.getResources(langId).getResource("Talonário Cheque"), "talonarioCheque", null, "getTalonarioCheque");
        ApplicationFunction n1147 = new ApplicationFunction(factory.getResources(langId).getResource("Cheque"), "cheque", null, "getCheque");

        ApplicationFunction n118 = new ApplicationFunction(factory.getResources(langId).getResource("Tabelas"), null);
        ApplicationFunction n1148 = new ApplicationFunction(factory.getResources(langId).getResource("CFOP"), "cfop", null, "getCfop");
        ApplicationFunction n1149 = new ApplicationFunction(factory.getResources(langId).getResource("Feriados"), "feriados", null, "getFeriados");

        //Bloco Comercial
        ApplicationFunction n2 = new ApplicationFunction(factory.getResources(langId).getResource("Comercial"), null);
        ApplicationFunction n15 = new ApplicationFunction(factory.getResources(langId).getResource("Frente de Caixa"),"Frnte de Caixa", null,"getFuncaoPadrao");
        ApplicationFunction n16 = new ApplicationFunction(factory.getResources(langId).getResource("Vendas"), null,"getFuncaoPadrao");
        ApplicationFunction n17 = new ApplicationFunction(factory.getResources(langId).getResource("Loja Virtual B2C"), null,"getFuncaoPadrao");
        ApplicationFunction n18 = new ApplicationFunction(factory.getResources(langId).getResource("NFe Nacional"), null);
        
       // ApplicationFunction n181 = new ApplicationFunction(factory.getResources(langId).getResource("Nota Fiscal Eletrônica"), null);
        ApplicationFunction n1153 = new ApplicationFunction(factory.getResources(langId).getResource("Emissão NF-e"), "NFe", null, "getNfe");
        ApplicationFunction n1154 = new ApplicationFunction(factory.getResources(langId).getResource("Status do Serviço"), "statusServico", null, "getStatusServico");

        ApplicationFunction n19 = new ApplicationFunction(factory.getResources(langId).getResource("NFSe Nota Fiscal de Serviço"), null,"getFuncaoPadrao");
        ApplicationFunction n20 = new ApplicationFunction(factory.getResources(langId).getResource("Cte Nacional"), null,"getFuncaoPadrao");
        ApplicationFunction n21 = new ApplicationFunction(factory.getResources(langId).getResource("CRM"), null,"getFuncaoPadrao");
        ApplicationFunction n22 = new ApplicationFunction(factory.getResources(langId).getResource("Gestao de comissoes"), null,"getFuncaoPadrao");
        ApplicationFunction n23 = new ApplicationFunction(factory.getResources(langId).getResource("AFV Automaçao de Forças de Vendas"), null,"getFuncaoPadrao");
        ApplicationFunction n24 = new ApplicationFunction(factory.getResources(langId).getResource("Ordem de Serviço"), null,"getFuncaoPadrao");

        //Bloco Financeiro
        ApplicationFunction n3 = new ApplicationFunction(factory.getResources(langId).getResource("Financeiro"),"currency_dollar_16_h" );
        ApplicationFunction n25 = new ApplicationFunction(factory.getResources(langId).getResource("Contas a Pagar"), null);
        ApplicationFunction n26 = new ApplicationFunction(factory.getResources(langId).getResource("Contas a Receber"), null);
        ApplicationFunction n27 = new ApplicationFunction(factory.getResources(langId).getResource("Controle de Caixas e Bancos"), null);
        ApplicationFunction n28 = new ApplicationFunction(factory.getResources(langId).getResource("Tesouraria"), null);
        ApplicationFunction n29 = new ApplicationFunction(factory.getResources(langId).getResource("Fluxo de Caixa"), null);
        ApplicationFunction n30 = new ApplicationFunction(factory.getResources(langId).getResource("Conciliaçao Bancaria"), null);
        ApplicationFunction n31 = new ApplicationFunction(factory.getResources(langId).getResource("EDI Bancario"), null);

        //Bloco Contabil e Fiscal
        ApplicationFunction n4 = new ApplicationFunction(factory.getResources(langId).getResource("Contabil e Fiscal"), null);
        ApplicationFunction n32 = new ApplicationFunction(factory.getResources(langId).getResource("Contabilidade e Conciliacao Contabil"), null);
        ApplicationFunction n33 = new ApplicationFunction(factory.getResources(langId).getResource("Escrita Fiscal"), null);
        ApplicationFunction n34 = new ApplicationFunction(factory.getResources(langId).getResource("SPED Contabil e Fiscal"), null);

        ApplicationFunction n1151 = new ApplicationFunction(factory.getResources(langId).getResource("Sped Fiscal"), "spedFiscal", null, "getSpedFiscal");
        ApplicationFunction n1152 = new ApplicationFunction(factory.getResources(langId).getResource("Sped Contribuições"), "spedContribuicoes", null, "getSpedContribuicoes");

        ApplicationFunction n35 = new ApplicationFunction(factory.getResources(langId).getResource("Controle Patrimonial"), null);
        ApplicationFunction n36 = new ApplicationFunction(factory.getResources(langId).getResource("Controle de Orçamentos"), null);
        ApplicationFunction n37 = new ApplicationFunction(factory.getResources(langId).getResource("EFD Contribuiçoes"), null);
        ApplicationFunction n38 = new ApplicationFunction(factory.getResources(langId).getResource("Tributaçao"), null);
        ApplicationFunction n39 = new ApplicationFunction(factory.getResources(langId).getResource("Sintegra"), null);
        ApplicationFunction n1150 = new ApplicationFunction(factory.getResources(langId).getResource("Emissão do Sintegra"), "sintegra", null, "getSintegra");
     
        
        
        //Bloco Recursos Humanos
        ApplicationFunction n5 = new ApplicationFunction(factory.getResources(langId).getResource("Recursos Humanos"), null);
        ApplicationFunction n40 = new ApplicationFunction(factory.getResources(langId).getResource("Folha de Pagamento"), null);
        ApplicationFunction n41 = new ApplicationFunction(factory.getResources(langId).getResource("Ponto Eletronico"), null);
        ApplicationFunction n42 = new ApplicationFunction(factory.getResources(langId).getResource("eSocial"), null);

        //Bloco Suprimentos
        ApplicationFunction n6 = new ApplicationFunction(factory.getResources(langId).getResource("Suprimentos"), null);
        ApplicationFunction n43 = new ApplicationFunction(factory.getResources(langId).getResource("Gestao de Compras"), null);
        ApplicationFunction n44 = new ApplicationFunction(factory.getResources(langId).getResource("Controle de Estoque"), null);
        ApplicationFunction n45 = new ApplicationFunction(factory.getResources(langId).getResource("Gestao de Contratos"), null);
        ApplicationFunction n46 = new ApplicationFunction(factory.getResources(langId).getResource("Inventario"), null);
        ApplicationFunction n47 = new ApplicationFunction(factory.getResources(langId).getResource("PCP Controle de Produçao"), null);
        ApplicationFunction n48 = new ApplicationFunction(factory.getResources(langId).getResource("WMS Gerenciamento de Armazem"), null);

        n1.add(n10);
        n1.add(n11);
        n1.add(n12);
        n1.add(n13);
        n1.add(n14);

        n10.add(n110);
        n110.add(n1111);
        n110.add(n1112);

        n10.add(n111);
        n111.add(n1113);
        n111.add(n1114);
        n111.add(n1115);
        n111.add(n1116);
        n111.add(n1117);

        n10.add(n112);
        n112.add(n1118);
        n112.add(n1119);
        n112.add(n1120);
        n112.add(n1121);
        n112.add(n1122);
        n112.add(n1123);
        n112.add(n1124);
        n112.add(n1125);
        n112.add(n1155);
        n112.add(n1156);
        
        n10.add(n113);
        n113.add(n1126);
        n113.add(n1127);
        n113.add(n1128);

        n10.add(n114);
        n114.add(n1129);
        n114.add(n1130);
        n114.add(n1131);
        n114.add(n1132);

        n10.add(n115);
        n115.add(n1133);
        n115.add(n1134);
        n115.add(n1135);
        n115.add(n1136);

        n10.add(n116);
        n116.add(n1137);
        n116.add(n1138);
        n116.add(n1139);
        n116.add(n1140);
        n116.add(n1141);
        n116.add(n1142);

        n10.add(n117);
        n117.add(n1143);
        n117.add(n1144);
        n117.add(n1145);
        n117.add(n1146);
        n117.add(n1147);

        n10.add(n118);
        n118.add(n1148);
        n118.add(n1149);

        n2.add(n15);
        n2.add(n16);
        n2.add(n17);
        n2.add(n18);
       // n18.add(n181);
        n18.add(n1153);
        n18.add(n1154);
        
        n2.add(n19);
        n2.add(n20);
        n2.add(n21);
        n2.add(n22);
        n2.add(n23);
        n2.add(n24);

        n2.add(n25);
        n3.add(n26);
        n3.add(n27);
        n3.add(n28);
        n3.add(n29);
        n3.add(n30);
        n3.add(n31);

        n4.add(n32);
        n4.add(n33);
        n4.add(n34);
        n34.add(n1151);
        n34.add(n1152);
        
        n4.add(n35);
        n4.add(n36);
        n4.add(n37);
        n4.add(n38);
        n4.add(n39);
        n39.add(n1150);
       

        n5.add(n40);
        n5.add(n41);
        n5.add(n42);

        n6.add(n43);
        n6.add(n44);
        n6.add(n45);
        n6.add(n46);
        n6.add(n47);
        n6.add(n48);

        root.add(n1);
        root.add(n2);
        root.add(n3);
        root.add(n4);
        root.add(n5);
        root.add(n6);

        UsuarioVO usuario = (UsuarioVO) inputPar;

        if (!usuario.getPapel().getAcessoCompleto().equals("S")) {
            for (int i = 0; i < root.getChildCount(); i++) {
                autorizaFuncoes((DefaultMutableTreeNode) root.getChildAt(i), buscaPapelFuncao(usuario));
            }
        }

        return new VOResponse(model);
    }

    private List<String> buscaPapelFuncao(UsuarioVO usuario) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(PapelFuncaoVO.class);
            criteria.add(Restrictions.eq("papel", usuario.getPapel()));

            List<PapelFuncaoVO> listaPapelFuncao = criteria.list();
            List<String> funcoes = new ArrayList<String>();
            for (int i = 0; i < listaPapelFuncao.size(); i++) {
                if (listaPapelFuncao.get(i).getPodeAlterar().equals("S")
                        || listaPapelFuncao.get(i).getPodeInserir().equals("S")
                        || listaPapelFuncao.get(i).getPodeExcluir().equals("S")) {
                    funcoes.add(listaPapelFuncao.get(i).getFuncao().getNome());
                } else if (listaPapelFuncao.get(i).getPodeConsultar().equals("S")) {
                    funcoes.add(listaPapelFuncao.get(i).getFuncao().getNome());
                }
            }
            return funcoes;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                session.close();
            } catch (Exception ex1) {
            }
        }
    }

    private void autorizaFuncoes(DefaultMutableTreeNode pasta, List<String> funcoes) {
        ApplicationFunction funcao;
        for (int i = 0; i < pasta.getChildCount(); i++) {
            funcao = (ApplicationFunction) pasta.getChildAt(i);
            if (funcao.isFolder()) {
                for (int j = 0; j < funcao.getChildCount(); j++) {
                    autorizaFuncoes(funcao, funcoes);
                }
            } else if (!funcoes.contains(funcao.getFunctionId())) {
                pasta.remove(i);
                ApplicationFunction appFunction = new ApplicationFunction(funcao.getDescription() + "*", "funcaoPadrao", null, "getFuncaoPadrao");
                pasta.insert(appFunction, i);
            }
        }
    }
}
