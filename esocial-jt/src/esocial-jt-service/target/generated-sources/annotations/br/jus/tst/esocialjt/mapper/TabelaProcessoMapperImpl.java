package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.dominio.enums.SimNao;
import br.jus.tst.esocial.dominio.enums.UF;
import br.jus.tst.esocial.dominio.periodo.IdePeriodo;
import br.jus.tst.esocial.dominio.tabela.processo.DadosProc;
import br.jus.tst.esocial.dominio.tabela.processo.IdeProcesso;
import br.jus.tst.esocial.dominio.tabela.processo.InfoProcesso;
import br.jus.tst.esocial.esquemas.eventos.tabprocesso.ESocial.EvtTabProcesso;
import br.jus.tst.esocial.esquemas.eventos.tabprocesso.ESocial.EvtTabProcesso.InfoProcesso.Alteracao;
import br.jus.tst.esocial.esquemas.eventos.tabprocesso.ESocial.EvtTabProcesso.InfoProcesso.Exclusao;
import br.jus.tst.esocial.esquemas.eventos.tabprocesso.ESocial.EvtTabProcesso.InfoProcesso.Inclusao;
import br.jus.tst.esocial.esquemas.eventos.tabprocesso.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.tabprocesso.TDadosProc;
import br.jus.tst.esocial.esquemas.eventos.tabprocesso.TDadosProc.DadosProcJud;
import br.jus.tst.esocial.esquemas.eventos.tabprocesso.TDadosProc.InfoSusp;
import br.jus.tst.esocial.esquemas.eventos.tabprocesso.TIdeEmpregador;
import br.jus.tst.esocial.esquemas.eventos.tabprocesso.TIdeProcesso;
import br.jus.tst.esocial.esquemas.eventos.tabprocesso.TNovaValidade;
import br.jus.tst.esocial.esquemas.eventos.tabprocesso.TSSimNao;
import br.jus.tst.esocial.esquemas.eventos.tabprocesso.TSUf;
import br.jus.tst.esocial.ocorrencia.dados.TabelaProcesso;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-23T22:04:14-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class TabelaProcessoMapperImpl extends TabelaProcessoMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();
    private final XMLGregorianCalendarMapper xMLGregorianCalendarMapper = new XMLGregorianCalendarMapper();

    @Override
    public EvtTabProcesso comoEvtTabProcessoInclusao(TabelaProcesso tabelaProcesso) {
        if ( tabelaProcesso == null ) {
            return null;
        }

        EvtTabProcesso evtTabProcesso = objectFactory.createESocialEvtTabProcesso();

        evtTabProcesso.setInfoProcesso( tabelaProcessoToInfoProcesso( tabelaProcesso ) );
        evtTabProcesso.setIdeEmpregador( ideEmpregadorToTIdeEmpregador( tabelaProcesso.getIdeEmpregador() ) );

        limparNulos( tabelaProcesso, evtTabProcesso );

        return evtTabProcesso;
    }

    @Override
    public EvtTabProcesso comoEvtTabProcessoAlteracao(TabelaProcesso tabelaProcesso) {
        if ( tabelaProcesso == null ) {
            return null;
        }

        EvtTabProcesso evtTabProcesso = objectFactory.createESocialEvtTabProcesso();

        evtTabProcesso.setInfoProcesso( tabelaProcessoToInfoProcesso1( tabelaProcesso ) );
        evtTabProcesso.setIdeEmpregador( ideEmpregadorToTIdeEmpregador( tabelaProcesso.getIdeEmpregador() ) );

        limparNulos( tabelaProcesso, evtTabProcesso );

        return evtTabProcesso;
    }

    @Override
    public EvtTabProcesso comoEvtTabProcessoExclusao(TabelaProcesso tabelaProcesso) {
        if ( tabelaProcesso == null ) {
            return null;
        }

        EvtTabProcesso evtTabProcesso = objectFactory.createESocialEvtTabProcesso();

        evtTabProcesso.setInfoProcesso( tabelaProcessoToInfoProcesso2( tabelaProcesso ) );
        evtTabProcesso.setIdeEmpregador( ideEmpregadorToTIdeEmpregador( tabelaProcesso.getIdeEmpregador() ) );

        limparNulos( tabelaProcesso, evtTabProcesso );

        return evtTabProcesso;
    }

    protected TIdeProcesso ideProcessoToTIdeProcesso(IdeProcesso ideProcesso) {
        if ( ideProcesso == null ) {
            return null;
        }

        TIdeProcesso tIdeProcesso = objectFactory.createTIdeProcesso();

        tIdeProcesso.setTpProc( ideProcesso.getTpProc() );
        tIdeProcesso.setNrProc( ideProcesso.getNrProc() );
        tIdeProcesso.setIniValid( ideProcesso.getIniValid() );
        tIdeProcesso.setFimValid( ideProcesso.getFimValid() );

        return tIdeProcesso;
    }

    protected TSUf uFToTSUf(UF uF) {
        if ( uF == null ) {
            return null;
        }

        TSUf tSUf;

        switch ( uF ) {
            case AC: tSUf = TSUf.AC;
            break;
            case AL: tSUf = TSUf.AL;
            break;
            case AP: tSUf = TSUf.AP;
            break;
            case AM: tSUf = TSUf.AM;
            break;
            case BA: tSUf = TSUf.BA;
            break;
            case CE: tSUf = TSUf.CE;
            break;
            case DF: tSUf = TSUf.DF;
            break;
            case ES: tSUf = TSUf.ES;
            break;
            case GO: tSUf = TSUf.GO;
            break;
            case MA: tSUf = TSUf.MA;
            break;
            case MT: tSUf = TSUf.MT;
            break;
            case MS: tSUf = TSUf.MS;
            break;
            case MG: tSUf = TSUf.MG;
            break;
            case PA: tSUf = TSUf.PA;
            break;
            case PB: tSUf = TSUf.PB;
            break;
            case PR: tSUf = TSUf.PR;
            break;
            case PE: tSUf = TSUf.PE;
            break;
            case PI: tSUf = TSUf.PI;
            break;
            case RJ: tSUf = TSUf.RJ;
            break;
            case RN: tSUf = TSUf.RN;
            break;
            case RS: tSUf = TSUf.RS;
            break;
            case RO: tSUf = TSUf.RO;
            break;
            case RR: tSUf = TSUf.RR;
            break;
            case SC: tSUf = TSUf.SC;
            break;
            case SP: tSUf = TSUf.SP;
            break;
            case SE: tSUf = TSUf.SE;
            break;
            case TO: tSUf = TSUf.TO;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + uF );
        }

        return tSUf;
    }

    protected DadosProcJud dadosProcJudToDadosProcJud(br.jus.tst.esocial.dominio.tabela.processo.DadosProcJud dadosProcJud) {
        if ( dadosProcJud == null ) {
            return null;
        }

        DadosProcJud dadosProcJud1 = objectFactory.createTDadosProcDadosProcJud();

        dadosProcJud1.setUfVara( uFToTSUf( dadosProcJud.getUfVara() ) );
        dadosProcJud1.setCodMunic( dadosProcJud.getCodMunic() );
        dadosProcJud1.setIdVara( dadosProcJud.getIdVara() );

        return dadosProcJud1;
    }

    protected TSSimNao simNaoToTSSimNao(SimNao simNao) {
        if ( simNao == null ) {
            return null;
        }

        TSSimNao tSSimNao;

        switch ( simNao ) {
            case S: tSSimNao = TSSimNao.S;
            break;
            case N: tSSimNao = TSSimNao.N;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + simNao );
        }

        return tSSimNao;
    }

    protected InfoSusp infoSuspToInfoSusp(br.jus.tst.esocial.dominio.tabela.processo.InfoSusp infoSusp) {
        if ( infoSusp == null ) {
            return null;
        }

        InfoSusp infoSusp1 = objectFactory.createTDadosProcInfoSusp();

        infoSusp1.setCodSusp( infoSusp.getCodSusp() );
        infoSusp1.setIndSusp( infoSusp.getIndSusp() );
        infoSusp1.setDtDecisao( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( infoSusp.getDtDecisao() ) );
        infoSusp1.setIndDeposito( simNaoToTSSimNao( infoSusp.getIndDeposito() ) );

        return infoSusp1;
    }

    protected List<InfoSusp> infoSuspListToInfoSuspList(List<br.jus.tst.esocial.dominio.tabela.processo.InfoSusp> list) {
        if ( list == null ) {
            return null;
        }

        List<InfoSusp> list1 = new ArrayList<InfoSusp>( list.size() );
        for ( br.jus.tst.esocial.dominio.tabela.processo.InfoSusp infoSusp : list ) {
            list1.add( infoSuspToInfoSusp( infoSusp ) );
        }

        return list1;
    }

    protected TDadosProc dadosProcToTDadosProc(DadosProc dadosProc) {
        if ( dadosProc == null ) {
            return null;
        }

        TDadosProc tDadosProc = objectFactory.createTDadosProc();

        tDadosProc.setIndAutoria( dadosProc.getIndAutoria() );
        tDadosProc.setIndMatProc( dadosProc.getIndMatProc() );
        tDadosProc.setObservacao( dadosProc.getObservacao() );
        tDadosProc.setDadosProcJud( dadosProcJudToDadosProcJud( dadosProc.getDadosProcJud() ) );
        if ( tDadosProc.getInfoSusp() != null ) {
            List<InfoSusp> list = infoSuspListToInfoSuspList( dadosProc.getInfoSusp() );
            if ( list != null ) {
                tDadosProc.getInfoSusp().addAll( list );
            }
        }

        return tDadosProc;
    }

    protected Inclusao infoProcessoToInclusao(InfoProcesso infoProcesso) {
        if ( infoProcesso == null ) {
            return null;
        }

        Inclusao inclusao = objectFactory.createESocialEvtTabProcessoInfoProcessoInclusao();

        inclusao.setIdeProcesso( ideProcessoToTIdeProcesso( infoProcesso.getIdeProcesso() ) );
        inclusao.setDadosProc( dadosProcToTDadosProc( infoProcesso.getDadosProc() ) );

        return inclusao;
    }

    protected br.jus.tst.esocial.esquemas.eventos.tabprocesso.ESocial.EvtTabProcesso.InfoProcesso tabelaProcessoToInfoProcesso(TabelaProcesso tabelaProcesso) {
        if ( tabelaProcesso == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tabprocesso.ESocial.EvtTabProcesso.InfoProcesso infoProcesso = objectFactory.createESocialEvtTabProcessoInfoProcesso();

        infoProcesso.setInclusao( infoProcessoToInclusao( tabelaProcesso.getInfoProcesso() ) );

        return infoProcesso;
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

    protected Alteracao infoProcessoToAlteracao(InfoProcesso infoProcesso) {
        if ( infoProcesso == null ) {
            return null;
        }

        Alteracao alteracao = objectFactory.createESocialEvtTabProcessoInfoProcessoAlteracao();

        alteracao.setIdeProcesso( ideProcessoToTIdeProcesso( infoProcesso.getIdeProcesso() ) );
        alteracao.setDadosProc( dadosProcToTDadosProc( infoProcesso.getDadosProc() ) );
        alteracao.setNovaValidade( idePeriodoToTNovaValidade( infoProcesso.getNovaValidade() ) );

        return alteracao;
    }

    protected br.jus.tst.esocial.esquemas.eventos.tabprocesso.ESocial.EvtTabProcesso.InfoProcesso tabelaProcessoToInfoProcesso1(TabelaProcesso tabelaProcesso) {
        if ( tabelaProcesso == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tabprocesso.ESocial.EvtTabProcesso.InfoProcesso infoProcesso = objectFactory.createESocialEvtTabProcessoInfoProcesso();

        infoProcesso.setAlteracao( infoProcessoToAlteracao( tabelaProcesso.getInfoProcesso() ) );

        return infoProcesso;
    }

    protected Exclusao infoProcessoToExclusao(InfoProcesso infoProcesso) {
        if ( infoProcesso == null ) {
            return null;
        }

        Exclusao exclusao = objectFactory.createESocialEvtTabProcessoInfoProcessoExclusao();

        exclusao.setIdeProcesso( ideProcessoToTIdeProcesso( infoProcesso.getIdeProcesso() ) );

        return exclusao;
    }

    protected br.jus.tst.esocial.esquemas.eventos.tabprocesso.ESocial.EvtTabProcesso.InfoProcesso tabelaProcessoToInfoProcesso2(TabelaProcesso tabelaProcesso) {
        if ( tabelaProcesso == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tabprocesso.ESocial.EvtTabProcesso.InfoProcesso infoProcesso = objectFactory.createESocialEvtTabProcessoInfoProcesso();

        infoProcesso.setExclusao( infoProcessoToExclusao( tabelaProcesso.getInfoProcesso() ) );

        return infoProcesso;
    }
}
