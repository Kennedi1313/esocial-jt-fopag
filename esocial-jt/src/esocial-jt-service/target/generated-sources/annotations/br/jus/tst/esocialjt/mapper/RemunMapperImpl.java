package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.dominio.demonstrativovalores.IdeADC;
import br.jus.tst.esocial.dominio.demonstrativovalores.InfoPerAnt;
import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.dominio.enums.SimNao;
import br.jus.tst.esocial.dominio.enums.TpAcConv;
import br.jus.tst.esocial.dominio.estabelecimentolotacao.InfoAgNocivo;
import br.jus.tst.esocial.dominio.estabelecimentolotacao.ItemRemuneracao;
import br.jus.tst.esocial.dominio.estabelecimentolotacao.RemunPerAnt;
import br.jus.tst.esocial.dominio.estabelecimentolotacao.RemunPerApur;
import br.jus.tst.esocial.dominio.trabalhador.identificacaobasica.IdeTrabalhador;
import br.jus.tst.esocial.dominio.trabalhador.identificacaobasica.InfoComplem;
import br.jus.tst.esocial.dominio.trabalhador.identificacaobasica.InfoInterm;
import br.jus.tst.esocial.dominio.trabalhador.identificacaobasica.InfoMV;
import br.jus.tst.esocial.dominio.trabalhador.identificacaobasica.ProcJudTrab;
import br.jus.tst.esocial.dominio.trabalhador.identificacaobasica.RemunOutrEmpr;
import br.jus.tst.esocial.dominio.vinculo.SucessaoVinc;
import br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun;
import br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev;
import br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoComplCont;
import br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo;
import br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoPerApur;
import br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot;
import br.jus.tst.esocial.esquemas.eventos.remun.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.remun.TIdeEmpregador;
import br.jus.tst.esocial.esquemas.eventos.remun.TIdeEventoFolha;
import br.jus.tst.esocial.esquemas.eventos.remun.TInfoAgNocivo;
import br.jus.tst.esocial.esquemas.eventos.remun.TInfoInterm;
import br.jus.tst.esocial.esquemas.eventos.remun.TItensRemun;
import br.jus.tst.esocial.esquemas.eventos.remun.TProcJudTrab;
import br.jus.tst.esocial.esquemas.eventos.remun.TSSimNao;
import br.jus.tst.esocial.esquemas.eventos.remun.TSTpAcConv;
import br.jus.tst.esocial.ocorrencia.dados.Remun;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-23T22:04:13-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class RemunMapperImpl extends RemunMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();
    private final XMLGregorianCalendarMapper xMLGregorianCalendarMapper = new XMLGregorianCalendarMapper();
    private final IdeEventoMapper ideEventoMapper = new IdeEventoMapper();

    @Override
    public EvtRemun comoEvtRemun(Remun remun) {
        if ( remun == null ) {
            return null;
        }

        EvtRemun evtRemun = objectFactory.createESocialEvtRemun();

        evtRemun.setIdeEvento( ideEventoMapper.mapearIdeEventoPagto( remun.getIdeEvento(), TIdeEventoFolha.class ) );
        evtRemun.setIdeEmpregador( ideEmpregadorToTIdeEmpregador( remun.getIdeEmpregador() ) );
        evtRemun.setIdeTrabalhador( ideTrabalhadorToIdeTrabalhador( remun.getIdeTrabalhador() ) );
        if ( evtRemun.getDmDev() != null ) {
            List<DmDev> list = dmDevListToDmDevList( remun.getDmDev() );
            if ( list != null ) {
                evtRemun.getDmDev().addAll( list );
            }
        }

        limparNulos( evtRemun );

        return evtRemun;
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

    protected br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.IdeTrabalhador.InfoMV.RemunOutrEmpr remunOutrEmprToRemunOutrEmpr(RemunOutrEmpr remunOutrEmpr) {
        if ( remunOutrEmpr == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.IdeTrabalhador.InfoMV.RemunOutrEmpr remunOutrEmpr1 = objectFactory.createESocialEvtRemunIdeTrabalhadorInfoMVRemunOutrEmpr();

        remunOutrEmpr1.setTpInsc( remunOutrEmpr.getTpInsc() );
        remunOutrEmpr1.setNrInsc( remunOutrEmpr.getNrInsc() );
        remunOutrEmpr1.setCodCateg( remunOutrEmpr.getCodCateg() );
        remunOutrEmpr1.setVlrRemunOE( remunOutrEmpr.getVlrRemunOE() );

        return remunOutrEmpr1;
    }

    protected List<br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.IdeTrabalhador.InfoMV.RemunOutrEmpr> remunOutrEmprListToRemunOutrEmprList(List<RemunOutrEmpr> list) {
        if ( list == null ) {
            return null;
        }

        List<br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.IdeTrabalhador.InfoMV.RemunOutrEmpr> list1 = new ArrayList<br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.IdeTrabalhador.InfoMV.RemunOutrEmpr>( list.size() );
        for ( RemunOutrEmpr remunOutrEmpr : list ) {
            list1.add( remunOutrEmprToRemunOutrEmpr( remunOutrEmpr ) );
        }

        return list1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.IdeTrabalhador.InfoMV infoMVToInfoMV(InfoMV infoMV) {
        if ( infoMV == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.IdeTrabalhador.InfoMV infoMV1 = objectFactory.createESocialEvtRemunIdeTrabalhadorInfoMV();

        infoMV1.setIndMV( infoMV.getIndMV() );
        if ( infoMV1.getRemunOutrEmpr() != null ) {
            List<br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.IdeTrabalhador.InfoMV.RemunOutrEmpr> list = remunOutrEmprListToRemunOutrEmprList( infoMV.getRemunOutrEmpr() );
            if ( list != null ) {
                infoMV1.getRemunOutrEmpr().addAll( list );
            }
        }

        return infoMV1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.IdeTrabalhador.InfoComplem.SucessaoVinc sucessaoVincToSucessaoVinc(SucessaoVinc sucessaoVinc) {
        if ( sucessaoVinc == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.IdeTrabalhador.InfoComplem.SucessaoVinc sucessaoVinc1 = objectFactory.createESocialEvtRemunIdeTrabalhadorInfoComplemSucessaoVinc();

        sucessaoVinc1.setTpInsc( sucessaoVinc.getTpInsc() );
        sucessaoVinc1.setNrInsc( sucessaoVinc.getNrInsc() );
        sucessaoVinc1.setMatricAnt( sucessaoVinc.getMatricAnt() );
        sucessaoVinc1.setDtAdm( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( sucessaoVinc.getDtAdm() ) );
        sucessaoVinc1.setObservacao( sucessaoVinc.getObservacao() );

        return sucessaoVinc1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.IdeTrabalhador.InfoComplem infoComplemToInfoComplem(InfoComplem infoComplem) {
        if ( infoComplem == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.IdeTrabalhador.InfoComplem infoComplem1 = objectFactory.createESocialEvtRemunIdeTrabalhadorInfoComplem();

        infoComplem1.setNmTrab( infoComplem.getNmTrab() );
        infoComplem1.setDtNascto( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( infoComplem.getDtNascto() ) );
        infoComplem1.setSucessaoVinc( sucessaoVincToSucessaoVinc( infoComplem.getSucessaoVinc() ) );

        return infoComplem1;
    }

    protected TProcJudTrab procJudTrabToTProcJudTrab(ProcJudTrab procJudTrab) {
        if ( procJudTrab == null ) {
            return null;
        }

        TProcJudTrab tProcJudTrab = objectFactory.createTProcJudTrab();

        tProcJudTrab.setTpTrib( procJudTrab.getTpTrib() );
        tProcJudTrab.setNrProcJud( procJudTrab.getNrProcJud() );
        tProcJudTrab.setCodSusp( procJudTrab.getCodSusp() );

        return tProcJudTrab;
    }

    protected List<TProcJudTrab> procJudTrabListToTProcJudTrabList(List<ProcJudTrab> list) {
        if ( list == null ) {
            return null;
        }

        List<TProcJudTrab> list1 = new ArrayList<TProcJudTrab>( list.size() );
        for ( ProcJudTrab procJudTrab : list ) {
            list1.add( procJudTrabToTProcJudTrab( procJudTrab ) );
        }

        return list1;
    }

    protected TInfoInterm infoIntermToTInfoInterm(InfoInterm infoInterm) {
        if ( infoInterm == null ) {
            return null;
        }

        TInfoInterm tInfoInterm = objectFactory.createTInfoInterm();

        if ( infoInterm.getDia() != null ) {
            tInfoInterm.setDia( infoInterm.getDia() );
        }

        return tInfoInterm;
    }

    protected List<TInfoInterm> infoIntermListToTInfoIntermList(List<InfoInterm> list) {
        if ( list == null ) {
            return null;
        }

        List<TInfoInterm> list1 = new ArrayList<TInfoInterm>( list.size() );
        for ( InfoInterm infoInterm : list ) {
            list1.add( infoIntermToTInfoInterm( infoInterm ) );
        }

        return list1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.IdeTrabalhador ideTrabalhadorToIdeTrabalhador(IdeTrabalhador ideTrabalhador) {
        if ( ideTrabalhador == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.IdeTrabalhador ideTrabalhador1 = objectFactory.createESocialEvtRemunIdeTrabalhador();

        ideTrabalhador1.setCpfTrab( ideTrabalhador.getCpfTrab() );
        ideTrabalhador1.setInfoMV( infoMVToInfoMV( ideTrabalhador.getInfoMV() ) );
        ideTrabalhador1.setInfoComplem( infoComplemToInfoComplem( ideTrabalhador.getInfoComplem() ) );
        if ( ideTrabalhador1.getProcJudTrab() != null ) {
            List<TProcJudTrab> list = procJudTrabListToTProcJudTrabList( ideTrabalhador.getProcJudTrab() );
            if ( list != null ) {
                ideTrabalhador1.getProcJudTrab().addAll( list );
            }
        }
        if ( ideTrabalhador1.getInfoInterm() != null ) {
            List<TInfoInterm> list1 = infoIntermListToTInfoIntermList( ideTrabalhador.getInfoInterm() );
            if ( list1 != null ) {
                ideTrabalhador1.getInfoInterm().addAll( list1 );
            }
        }

        return ideTrabalhador1;
    }

    protected TInfoAgNocivo infoAgNocivoToTInfoAgNocivo(InfoAgNocivo infoAgNocivo) {
        if ( infoAgNocivo == null ) {
            return null;
        }

        TInfoAgNocivo tInfoAgNocivo = objectFactory.createTInfoAgNocivo();

        tInfoAgNocivo.setGrauExp( infoAgNocivo.getGrauExp() );

        return tInfoAgNocivo;
    }

    protected TItensRemun itemRemuneracaoToTItensRemun(ItemRemuneracao itemRemuneracao) {
        if ( itemRemuneracao == null ) {
            return null;
        }

        TItensRemun tItensRemun = objectFactory.createTItensRemun();

        tItensRemun.setCodRubr( itemRemuneracao.getCodRubr() );
        tItensRemun.setIdeTabRubr( itemRemuneracao.getIdeTabRubr() );
        tItensRemun.setQtdRubr( itemRemuneracao.getQtdRubr() );
        tItensRemun.setFatorRubr( itemRemuneracao.getFatorRubr() );
        tItensRemun.setVrRubr( itemRemuneracao.getVrRubr() );
        tItensRemun.setIndApurIR( itemRemuneracao.getIndApurIR() );

        return tItensRemun;
    }

    protected List<TItensRemun> itemRemuneracaoListToTItensRemunList(List<ItemRemuneracao> list) {
        if ( list == null ) {
            return null;
        }

        List<TItensRemun> list1 = new ArrayList<TItensRemun>( list.size() );
        for ( ItemRemuneracao itemRemuneracao : list ) {
            list1.add( itemRemuneracaoToTItensRemun( itemRemuneracao ) );
        }

        return list1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot.RemunPerApur remunPerApurToRemunPerApur(RemunPerApur remunPerApur) {
        if ( remunPerApur == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot.RemunPerApur remunPerApur1 = objectFactory.createESocialEvtRemunDmDevInfoPerApurIdeEstabLotRemunPerApur();

        remunPerApur1.setMatricula( remunPerApur.getMatricula() );
        remunPerApur1.setIndSimples( remunPerApur.getIndSimples() );
        remunPerApur1.setInfoAgNocivo( infoAgNocivoToTInfoAgNocivo( remunPerApur.getInfoAgNocivo() ) );
        if ( remunPerApur1.getItensRemun() != null ) {
            List<TItensRemun> list = itemRemuneracaoListToTItensRemunList( remunPerApur.getItensRemun() );
            if ( list != null ) {
                remunPerApur1.getItensRemun().addAll( list );
            }
        }

        return remunPerApur1;
    }

    protected List<br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot.RemunPerApur> remunPerApurListToRemunPerApurList(List<RemunPerApur> list) {
        if ( list == null ) {
            return null;
        }

        List<br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot.RemunPerApur> list1 = new ArrayList<br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot.RemunPerApur>( list.size() );
        for ( RemunPerApur remunPerApur : list ) {
            list1.add( remunPerApurToRemunPerApur( remunPerApur ) );
        }

        return list1;
    }

    protected IdeEstabLot ideEstabLotToIdeEstabLot(br.jus.tst.esocial.dominio.estabelecimentolotacao.IdeEstabLot ideEstabLot) {
        if ( ideEstabLot == null ) {
            return null;
        }

        IdeEstabLot ideEstabLot1 = objectFactory.createESocialEvtRemunDmDevInfoPerApurIdeEstabLot();

        ideEstabLot1.setTpInsc( ideEstabLot.getTpInsc() );
        ideEstabLot1.setNrInsc( ideEstabLot.getNrInsc() );
        ideEstabLot1.setCodLotacao( ideEstabLot.getCodLotacao() );
        ideEstabLot1.setQtdDiasAv( ideEstabLot.getQtdDiasAv() );
        if ( ideEstabLot1.getRemunPerApur() != null ) {
            List<br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoPerApur.IdeEstabLot.RemunPerApur> list = remunPerApurListToRemunPerApurList( ideEstabLot.getRemunPerApur() );
            if ( list != null ) {
                ideEstabLot1.getRemunPerApur().addAll( list );
            }
        }

        return ideEstabLot1;
    }

    protected List<IdeEstabLot> ideEstabLotListToIdeEstabLotList(List<br.jus.tst.esocial.dominio.estabelecimentolotacao.IdeEstabLot> list) {
        if ( list == null ) {
            return null;
        }

        List<IdeEstabLot> list1 = new ArrayList<IdeEstabLot>( list.size() );
        for ( br.jus.tst.esocial.dominio.estabelecimentolotacao.IdeEstabLot ideEstabLot : list ) {
            list1.add( ideEstabLotToIdeEstabLot( ideEstabLot ) );
        }

        return list1;
    }

    protected InfoPerApur infoPerApurToInfoPerApur(br.jus.tst.esocial.dominio.demonstrativovalores.InfoPerApur infoPerApur) {
        if ( infoPerApur == null ) {
            return null;
        }

        InfoPerApur infoPerApur1 = objectFactory.createESocialEvtRemunDmDevInfoPerApur();

        if ( infoPerApur1.getIdeEstabLot() != null ) {
            List<IdeEstabLot> list = ideEstabLotListToIdeEstabLotList( infoPerApur.getIdeEstabLot() );
            if ( list != null ) {
                infoPerApur1.getIdeEstabLot().addAll( list );
            }
        }

        return infoPerApur1;
    }

    protected TSTpAcConv tpAcConvToTSTpAcConv(TpAcConv tpAcConv) {
        if ( tpAcConv == null ) {
            return null;
        }

        TSTpAcConv tSTpAcConv;

        switch ( tpAcConv ) {
            case A: tSTpAcConv = TSTpAcConv.A;
            break;
            case B: tSTpAcConv = TSTpAcConv.B;
            break;
            case C: tSTpAcConv = TSTpAcConv.C;
            break;
            case D: tSTpAcConv = TSTpAcConv.D;
            break;
            case E: tSTpAcConv = TSTpAcConv.E;
            break;
            case F: tSTpAcConv = TSTpAcConv.F;
            break;
            case G: tSTpAcConv = TSTpAcConv.G;
            break;
            case H: tSTpAcConv = TSTpAcConv.H;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + tpAcConv );
        }

        return tSTpAcConv;
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

    protected br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.RemunPerAnt remunPerAntToRemunPerAnt(RemunPerAnt remunPerAnt) {
        if ( remunPerAnt == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.RemunPerAnt remunPerAnt1 = objectFactory.createESocialEvtRemunDmDevInfoPerAntIdeADCIdePeriodoIdeEstabLotRemunPerAnt();

        remunPerAnt1.setMatricula( remunPerAnt.getMatricula() );
        remunPerAnt1.setIndSimples( remunPerAnt.getIndSimples() );
        remunPerAnt1.setInfoAgNocivo( infoAgNocivoToTInfoAgNocivo( remunPerAnt.getInfoAgNocivo() ) );
        if ( remunPerAnt1.getItensRemun() != null ) {
            List<TItensRemun> list = itemRemuneracaoListToTItensRemunList( remunPerAnt.getItensRemun() );
            if ( list != null ) {
                remunPerAnt1.getItensRemun().addAll( list );
            }
        }

        return remunPerAnt1;
    }

    protected List<br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.RemunPerAnt> remunPerAntListToRemunPerAntList(List<RemunPerAnt> list) {
        if ( list == null ) {
            return null;
        }

        List<br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.RemunPerAnt> list1 = new ArrayList<br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.RemunPerAnt>( list.size() );
        for ( RemunPerAnt remunPerAnt : list ) {
            list1.add( remunPerAntToRemunPerAnt( remunPerAnt ) );
        }

        return list1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot ideEstabLotToIdeEstabLot1(br.jus.tst.esocial.dominio.estabelecimentolotacao.IdeEstabLot ideEstabLot) {
        if ( ideEstabLot == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot ideEstabLot1 = objectFactory.createESocialEvtRemunDmDevInfoPerAntIdeADCIdePeriodoIdeEstabLot();

        ideEstabLot1.setTpInsc( ideEstabLot.getTpInsc() );
        ideEstabLot1.setNrInsc( ideEstabLot.getNrInsc() );
        ideEstabLot1.setCodLotacao( ideEstabLot.getCodLotacao() );
        if ( ideEstabLot1.getRemunPerAnt() != null ) {
            List<br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot.RemunPerAnt> list = remunPerAntListToRemunPerAntList( ideEstabLot.getRemunPerAnt() );
            if ( list != null ) {
                ideEstabLot1.getRemunPerAnt().addAll( list );
            }
        }

        return ideEstabLot1;
    }

    protected List<br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot> ideEstabLotListToIdeEstabLotList1(List<br.jus.tst.esocial.dominio.estabelecimentolotacao.IdeEstabLot> list) {
        if ( list == null ) {
            return null;
        }

        List<br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot> list1 = new ArrayList<br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot>( list.size() );
        for ( br.jus.tst.esocial.dominio.estabelecimentolotacao.IdeEstabLot ideEstabLot : list ) {
            list1.add( ideEstabLotToIdeEstabLot1( ideEstabLot ) );
        }

        return list1;
    }

    protected IdePeriodo idePeriodoToIdePeriodo(br.jus.tst.esocial.dominio.demonstrativovalores.IdePeriodo idePeriodo) {
        if ( idePeriodo == null ) {
            return null;
        }

        IdePeriodo idePeriodo1 = objectFactory.createESocialEvtRemunDmDevInfoPerAntIdeADCIdePeriodo();

        idePeriodo1.setPerRef( idePeriodo.getPerRef() );
        if ( idePeriodo1.getIdeEstabLot() != null ) {
            List<br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC.IdePeriodo.IdeEstabLot> list = ideEstabLotListToIdeEstabLotList1( idePeriodo.getIdeEstabLot() );
            if ( list != null ) {
                idePeriodo1.getIdeEstabLot().addAll( list );
            }
        }

        return idePeriodo1;
    }

    protected List<IdePeriodo> idePeriodoListToIdePeriodoList(List<br.jus.tst.esocial.dominio.demonstrativovalores.IdePeriodo> list) {
        if ( list == null ) {
            return null;
        }

        List<IdePeriodo> list1 = new ArrayList<IdePeriodo>( list.size() );
        for ( br.jus.tst.esocial.dominio.demonstrativovalores.IdePeriodo idePeriodo : list ) {
            list1.add( idePeriodoToIdePeriodo( idePeriodo ) );
        }

        return list1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC ideADCToIdeADC(IdeADC ideADC) {
        if ( ideADC == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC ideADC1 = objectFactory.createESocialEvtRemunDmDevInfoPerAntIdeADC();

        ideADC1.setDtAcConv( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( ideADC.getDtAcConv() ) );
        ideADC1.setTpAcConv( tpAcConvToTSTpAcConv( ideADC.getTpAcConv() ) );
        ideADC1.setDsc( ideADC.getDsc() );
        ideADC1.setRemunSuc( simNaoToTSSimNao( ideADC.getRemunSuc() ) );
        if ( ideADC1.getIdePeriodo() != null ) {
            List<IdePeriodo> list = idePeriodoListToIdePeriodoList( ideADC.getIdePeriodo() );
            if ( list != null ) {
                ideADC1.getIdePeriodo().addAll( list );
            }
        }

        return ideADC1;
    }

    protected List<br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC> ideADCListToIdeADCList(List<IdeADC> list) {
        if ( list == null ) {
            return null;
        }

        List<br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC> list1 = new ArrayList<br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC>( list.size() );
        for ( IdeADC ideADC : list ) {
            list1.add( ideADCToIdeADC( ideADC ) );
        }

        return list1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoPerAnt infoPerAntToInfoPerAnt(InfoPerAnt infoPerAnt) {
        if ( infoPerAnt == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoPerAnt infoPerAnt1 = objectFactory.createESocialEvtRemunDmDevInfoPerAnt();

        if ( infoPerAnt1.getIdeADC() != null ) {
            List<br.jus.tst.esocial.esquemas.eventos.remun.ESocial.EvtRemun.DmDev.InfoPerAnt.IdeADC> list = ideADCListToIdeADCList( infoPerAnt.getIdeADC() );
            if ( list != null ) {
                infoPerAnt1.getIdeADC().addAll( list );
            }
        }

        return infoPerAnt1;
    }

    protected InfoComplCont infoComplContToInfoComplCont(br.jus.tst.esocial.dominio.demonstrativovalores.InfoComplCont infoComplCont) {
        if ( infoComplCont == null ) {
            return null;
        }

        InfoComplCont infoComplCont1 = objectFactory.createESocialEvtRemunDmDevInfoComplCont();

        infoComplCont1.setCodCBO( infoComplCont.getCodCBO() );
        infoComplCont1.setNatAtividade( infoComplCont.getNatAtividade() );
        infoComplCont1.setQtdDiasTrab( infoComplCont.getQtdDiasTrab() );

        return infoComplCont1;
    }

    protected DmDev dmDevToDmDev(br.jus.tst.esocial.dominio.demonstrativovalores.DmDev dmDev) {
        if ( dmDev == null ) {
            return null;
        }

        DmDev dmDev1 = objectFactory.createESocialEvtRemunDmDev();

        dmDev1.setIdeDmDev( dmDev.getIdeDmDev() );
        dmDev1.setCodCateg( dmDev.getCodCateg() );
        dmDev1.setInfoPerApur( infoPerApurToInfoPerApur( dmDev.getInfoPerApur() ) );
        dmDev1.setInfoPerAnt( infoPerAntToInfoPerAnt( dmDev.getInfoPerAnt() ) );
        dmDev1.setInfoComplCont( infoComplContToInfoComplCont( dmDev.getInfoComplCont() ) );

        return dmDev1;
    }

    protected List<DmDev> dmDevListToDmDevList(List<br.jus.tst.esocial.dominio.demonstrativovalores.DmDev> list) {
        if ( list == null ) {
            return null;
        }

        List<DmDev> list1 = new ArrayList<DmDev>( list.size() );
        for ( br.jus.tst.esocial.dominio.demonstrativovalores.DmDev dmDev : list ) {
            list1.add( dmDevToDmDev( dmDev ) );
        }

        return list1;
    }
}
