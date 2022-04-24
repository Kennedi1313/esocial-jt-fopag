package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.dominio.periodo.IdePeriodo;
import br.jus.tst.esocial.dominio.tabela.lotacao.DadosLotacao;
import br.jus.tst.esocial.dominio.tabela.lotacao.DadosOpPort;
import br.jus.tst.esocial.dominio.tabela.lotacao.FpasLotacao;
import br.jus.tst.esocial.dominio.tabela.lotacao.IdeLotacao;
import br.jus.tst.esocial.dominio.tabela.lotacao.InfoEmprParcial;
import br.jus.tst.esocial.dominio.tabela.lotacao.InfoLotacao;
import br.jus.tst.esocial.dominio.tabela.lotacao.InfoProcJudTerceiros;
import br.jus.tst.esocial.esquemas.eventos.tablotacao.ESocial.EvtTabLotacao;
import br.jus.tst.esocial.esquemas.eventos.tablotacao.ESocial.EvtTabLotacao.InfoLotacao.Alteracao;
import br.jus.tst.esocial.esquemas.eventos.tablotacao.ESocial.EvtTabLotacao.InfoLotacao.Exclusao;
import br.jus.tst.esocial.esquemas.eventos.tablotacao.ESocial.EvtTabLotacao.InfoLotacao.Inclusao;
import br.jus.tst.esocial.esquemas.eventos.tablotacao.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.tablotacao.TDadosLotacao;
import br.jus.tst.esocial.esquemas.eventos.tablotacao.TDadosLotacao.FpasLotacao.InfoProcJudTerceiros.ProcJudTerceiro;
import br.jus.tst.esocial.esquemas.eventos.tablotacao.TIdeEmpregador;
import br.jus.tst.esocial.esquemas.eventos.tablotacao.TIdeLotacao;
import br.jus.tst.esocial.esquemas.eventos.tablotacao.TNovaValidade;
import br.jus.tst.esocial.ocorrencia.dados.TabelaLotacao;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-23T22:04:16-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class TabelaLotacaoMapperImpl extends TabelaLotacaoMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();

    @Override
    public EvtTabLotacao comoEvtTabLotacaoInclusao(TabelaLotacao tabelaLotacao) {
        if ( tabelaLotacao == null ) {
            return null;
        }

        EvtTabLotacao evtTabLotacao = objectFactory.createESocialEvtTabLotacao();

        evtTabLotacao.setInfoLotacao( tabelaLotacaoToInfoLotacao( tabelaLotacao ) );
        evtTabLotacao.setIdeEmpregador( ideEmpregadorToTIdeEmpregador( tabelaLotacao.getIdeEmpregador() ) );

        limparNulos( tabelaLotacao, evtTabLotacao );

        return evtTabLotacao;
    }

    @Override
    public EvtTabLotacao comoEvtTabLotacaoAlteracao(TabelaLotacao tabelaLotacao) {
        if ( tabelaLotacao == null ) {
            return null;
        }

        EvtTabLotacao evtTabLotacao = objectFactory.createESocialEvtTabLotacao();

        evtTabLotacao.setInfoLotacao( tabelaLotacaoToInfoLotacao1( tabelaLotacao ) );
        evtTabLotacao.setIdeEmpregador( ideEmpregadorToTIdeEmpregador( tabelaLotacao.getIdeEmpregador() ) );

        limparNulos( tabelaLotacao, evtTabLotacao );

        return evtTabLotacao;
    }

    @Override
    public EvtTabLotacao comoEvtTabLotacaoExclusao(TabelaLotacao tabelaLotacao) {
        if ( tabelaLotacao == null ) {
            return null;
        }

        EvtTabLotacao evtTabLotacao = objectFactory.createESocialEvtTabLotacao();

        evtTabLotacao.setInfoLotacao( tabelaLotacaoToInfoLotacao2( tabelaLotacao ) );
        evtTabLotacao.setIdeEmpregador( ideEmpregadorToTIdeEmpregador( tabelaLotacao.getIdeEmpregador() ) );

        limparNulos( tabelaLotacao, evtTabLotacao );

        return evtTabLotacao;
    }

    protected TIdeLotacao ideLotacaoToTIdeLotacao(IdeLotacao ideLotacao) {
        if ( ideLotacao == null ) {
            return null;
        }

        TIdeLotacao tIdeLotacao = objectFactory.createTIdeLotacao();

        tIdeLotacao.setCodLotacao( ideLotacao.getCodLotacao() );
        tIdeLotacao.setIniValid( ideLotacao.getIniValid() );
        tIdeLotacao.setFimValid( ideLotacao.getFimValid() );

        return tIdeLotacao;
    }

    protected ProcJudTerceiro procJudTerceiroToProcJudTerceiro(br.jus.tst.esocial.dominio.tabela.lotacao.ProcJudTerceiro procJudTerceiro) {
        if ( procJudTerceiro == null ) {
            return null;
        }

        ProcJudTerceiro procJudTerceiro1 = objectFactory.createTDadosLotacaoFpasLotacaoInfoProcJudTerceirosProcJudTerceiro();

        procJudTerceiro1.setCodTerc( procJudTerceiro.getCodTerc() );
        procJudTerceiro1.setNrProcJud( procJudTerceiro.getNrProcJud() );
        procJudTerceiro1.setCodSusp( procJudTerceiro.getCodSusp() );

        return procJudTerceiro1;
    }

    protected List<ProcJudTerceiro> procJudTerceiroListToProcJudTerceiroList(List<br.jus.tst.esocial.dominio.tabela.lotacao.ProcJudTerceiro> list) {
        if ( list == null ) {
            return null;
        }

        List<ProcJudTerceiro> list1 = new ArrayList<ProcJudTerceiro>( list.size() );
        for ( br.jus.tst.esocial.dominio.tabela.lotacao.ProcJudTerceiro procJudTerceiro : list ) {
            list1.add( procJudTerceiroToProcJudTerceiro( procJudTerceiro ) );
        }

        return list1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.tablotacao.TDadosLotacao.FpasLotacao.InfoProcJudTerceiros infoProcJudTerceirosToInfoProcJudTerceiros(InfoProcJudTerceiros infoProcJudTerceiros) {
        if ( infoProcJudTerceiros == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tablotacao.TDadosLotacao.FpasLotacao.InfoProcJudTerceiros infoProcJudTerceiros1 = objectFactory.createTDadosLotacaoFpasLotacaoInfoProcJudTerceiros();

        if ( infoProcJudTerceiros1.getProcJudTerceiro() != null ) {
            List<ProcJudTerceiro> list = procJudTerceiroListToProcJudTerceiroList( infoProcJudTerceiros.getProcJudTerceiro() );
            if ( list != null ) {
                infoProcJudTerceiros1.getProcJudTerceiro().addAll( list );
            }
        }

        return infoProcJudTerceiros1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.tablotacao.TDadosLotacao.FpasLotacao fpasLotacaoToFpasLotacao(FpasLotacao fpasLotacao) {
        if ( fpasLotacao == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tablotacao.TDadosLotacao.FpasLotacao fpasLotacao1 = objectFactory.createTDadosLotacaoFpasLotacao();

        fpasLotacao1.setFpas( fpasLotacao.getFpas() );
        fpasLotacao1.setCodTercs( fpasLotacao.getCodTercs() );
        fpasLotacao1.setCodTercsSusp( fpasLotacao.getCodTercsSusp() );
        fpasLotacao1.setInfoProcJudTerceiros( infoProcJudTerceirosToInfoProcJudTerceiros( fpasLotacao.getInfoProcJudTerceiros() ) );

        return fpasLotacao1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.tablotacao.TDadosLotacao.InfoEmprParcial infoEmprParcialToInfoEmprParcial(InfoEmprParcial infoEmprParcial) {
        if ( infoEmprParcial == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tablotacao.TDadosLotacao.InfoEmprParcial infoEmprParcial1 = objectFactory.createTDadosLotacaoInfoEmprParcial();

        infoEmprParcial1.setTpInscContrat( infoEmprParcial.getTpInscContrat() );
        infoEmprParcial1.setNrInscContrat( infoEmprParcial.getNrInscContrat() );
        infoEmprParcial1.setTpInscProp( infoEmprParcial.getTpInscProp() );
        infoEmprParcial1.setNrInscProp( infoEmprParcial.getNrInscProp() );

        return infoEmprParcial1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.tablotacao.TDadosLotacao.DadosOpPort dadosOpPortToDadosOpPort(DadosOpPort dadosOpPort) {
        if ( dadosOpPort == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tablotacao.TDadosLotacao.DadosOpPort dadosOpPort1 = objectFactory.createTDadosLotacaoDadosOpPort();

        dadosOpPort1.setAliqRat( dadosOpPort.getAliqRat() );
        dadosOpPort1.setFap( dadosOpPort.getFap() );

        return dadosOpPort1;
    }

    protected TDadosLotacao dadosLotacaoToTDadosLotacao(DadosLotacao dadosLotacao) {
        if ( dadosLotacao == null ) {
            return null;
        }

        TDadosLotacao tDadosLotacao = objectFactory.createTDadosLotacao();

        tDadosLotacao.setTpLotacao( dadosLotacao.getTpLotacao() );
        tDadosLotacao.setTpInsc( dadosLotacao.getTpInsc() );
        tDadosLotacao.setNrInsc( dadosLotacao.getNrInsc() );
        tDadosLotacao.setFpasLotacao( fpasLotacaoToFpasLotacao( dadosLotacao.getFpasLotacao() ) );
        tDadosLotacao.setInfoEmprParcial( infoEmprParcialToInfoEmprParcial( dadosLotacao.getInfoEmprParcial() ) );
        tDadosLotacao.setDadosOpPort( dadosOpPortToDadosOpPort( dadosLotacao.getDadosOpPort() ) );

        return tDadosLotacao;
    }

    protected Inclusao infoLotacaoToInclusao(InfoLotacao infoLotacao) {
        if ( infoLotacao == null ) {
            return null;
        }

        Inclusao inclusao = objectFactory.createESocialEvtTabLotacaoInfoLotacaoInclusao();

        inclusao.setIdeLotacao( ideLotacaoToTIdeLotacao( infoLotacao.getIdeLotacao() ) );
        inclusao.setDadosLotacao( dadosLotacaoToTDadosLotacao( infoLotacao.getDadosLotacao() ) );

        return inclusao;
    }

    protected br.jus.tst.esocial.esquemas.eventos.tablotacao.ESocial.EvtTabLotacao.InfoLotacao tabelaLotacaoToInfoLotacao(TabelaLotacao tabelaLotacao) {
        if ( tabelaLotacao == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tablotacao.ESocial.EvtTabLotacao.InfoLotacao infoLotacao = objectFactory.createESocialEvtTabLotacaoInfoLotacao();

        infoLotacao.setInclusao( infoLotacaoToInclusao( tabelaLotacao.getInfoLotacao() ) );

        return infoLotacao;
    }

    protected TIdeEmpregador ideEmpregadorToTIdeEmpregador(IdeEmpregador ideEmpregador) {
        if ( ideEmpregador == null ) {
            return null;
        }

        TIdeEmpregador tIdeEmpregador = objectFactory.createTIdeEmpregador();

        tIdeEmpregador.setTpInsc( ideEmpregador.getTpInsc() );
        tIdeEmpregador.setNrInsc( ideEmpregador.getNrInsc() );

        return tIdeEmpregador;
    }

    protected TNovaValidade idePeriodoToTNovaValidade(IdePeriodo idePeriodo) {
        if ( idePeriodo == null ) {
            return null;
        }

        TNovaValidade tNovaValidade = objectFactory.createTNovaValidade();

        tNovaValidade.setIniValid( idePeriodo.getIniValid() );
        tNovaValidade.setFimValid( idePeriodo.getFimValid() );

        return tNovaValidade;
    }

    protected Alteracao infoLotacaoToAlteracao(InfoLotacao infoLotacao) {
        if ( infoLotacao == null ) {
            return null;
        }

        Alteracao alteracao = objectFactory.createESocialEvtTabLotacaoInfoLotacaoAlteracao();

        alteracao.setIdeLotacao( ideLotacaoToTIdeLotacao( infoLotacao.getIdeLotacao() ) );
        alteracao.setDadosLotacao( dadosLotacaoToTDadosLotacao( infoLotacao.getDadosLotacao() ) );
        alteracao.setNovaValidade( idePeriodoToTNovaValidade( infoLotacao.getNovaValidade() ) );

        return alteracao;
    }

    protected br.jus.tst.esocial.esquemas.eventos.tablotacao.ESocial.EvtTabLotacao.InfoLotacao tabelaLotacaoToInfoLotacao1(TabelaLotacao tabelaLotacao) {
        if ( tabelaLotacao == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tablotacao.ESocial.EvtTabLotacao.InfoLotacao infoLotacao = objectFactory.createESocialEvtTabLotacaoInfoLotacao();

        infoLotacao.setAlteracao( infoLotacaoToAlteracao( tabelaLotacao.getInfoLotacao() ) );

        return infoLotacao;
    }

    protected Exclusao infoLotacaoToExclusao(InfoLotacao infoLotacao) {
        if ( infoLotacao == null ) {
            return null;
        }

        Exclusao exclusao = objectFactory.createESocialEvtTabLotacaoInfoLotacaoExclusao();

        exclusao.setIdeLotacao( ideLotacaoToTIdeLotacao( infoLotacao.getIdeLotacao() ) );

        return exclusao;
    }

    protected br.jus.tst.esocial.esquemas.eventos.tablotacao.ESocial.EvtTabLotacao.InfoLotacao tabelaLotacaoToInfoLotacao2(TabelaLotacao tabelaLotacao) {
        if ( tabelaLotacao == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tablotacao.ESocial.EvtTabLotacao.InfoLotacao infoLotacao = objectFactory.createESocialEvtTabLotacaoInfoLotacao();

        infoLotacao.setExclusao( infoLotacaoToExclusao( tabelaLotacao.getInfoLotacao() ) );

        return infoLotacao;
    }
}
