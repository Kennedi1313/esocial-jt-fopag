package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.dominio.desligamento.IdeEstabLot;
import br.jus.tst.esocial.dominio.desligamento.InfoInterm;
import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.dominio.enums.SimNao;
import br.jus.tst.esocial.dominio.estabelecimentolotacao.InfoSimples;
import br.jus.tst.esocial.dominio.trabalhador.identificacaobasica.InfoMV;
import br.jus.tst.esocial.dominio.trabalhador.identificacaobasica.ProcJudTrab;
import br.jus.tst.esocial.dominio.vinculo.alteracaocontratual.IdeVinculo;
import br.jus.tst.esocial.esquemas.eventos.deslig.ESocial.EvtDeslig;
import br.jus.tst.esocial.esquemas.eventos.deslig.ESocial.EvtDeslig.InfoDeslig;
import br.jus.tst.esocial.esquemas.eventos.deslig.ESocial.EvtDeslig.InfoDeslig.ConsigFGTS;
import br.jus.tst.esocial.esquemas.eventos.deslig.ESocial.EvtDeslig.InfoDeslig.MudancaCPF;
import br.jus.tst.esocial.esquemas.eventos.deslig.ESocial.EvtDeslig.InfoDeslig.Observacoes;
import br.jus.tst.esocial.esquemas.eventos.deslig.ESocial.EvtDeslig.InfoDeslig.Quarentena;
import br.jus.tst.esocial.esquemas.eventos.deslig.ESocial.EvtDeslig.InfoDeslig.SucessaoVinc;
import br.jus.tst.esocial.esquemas.eventos.deslig.ESocial.EvtDeslig.InfoDeslig.TransfTit;
import br.jus.tst.esocial.esquemas.eventos.deslig.ESocial.EvtDeslig.InfoDeslig.VerbasResc;
import br.jus.tst.esocial.esquemas.eventos.deslig.ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev;
import br.jus.tst.esocial.esquemas.eventos.deslig.ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt;
import br.jus.tst.esocial.esquemas.eventos.deslig.ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC;
import br.jus.tst.esocial.esquemas.eventos.deslig.ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerAnt.IdeADC.IdePeriodo;
import br.jus.tst.esocial.esquemas.eventos.deslig.ESocial.EvtDeslig.InfoDeslig.VerbasResc.DmDev.InfoPerApur;
import br.jus.tst.esocial.esquemas.eventos.deslig.ESocial.EvtDeslig.InfoDeslig.VerbasResc.ProcCS;
import br.jus.tst.esocial.esquemas.eventos.deslig.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.deslig.TIdeEmpregador;
import br.jus.tst.esocial.esquemas.eventos.deslig.TIdeEstabLot;
import br.jus.tst.esocial.esquemas.eventos.deslig.TIdeEstabLot.DetVerbas;
import br.jus.tst.esocial.esquemas.eventos.deslig.TIdeEstabLot.InfoAgNocivo;
import br.jus.tst.esocial.esquemas.eventos.deslig.TIdeVinculo;
import br.jus.tst.esocial.esquemas.eventos.deslig.TInfoInterm;
import br.jus.tst.esocial.esquemas.eventos.deslig.TInfoMV;
import br.jus.tst.esocial.esquemas.eventos.deslig.TInfoMV.RemunOutrEmpr;
import br.jus.tst.esocial.esquemas.eventos.deslig.TInfoSimples;
import br.jus.tst.esocial.esquemas.eventos.deslig.TProcJudTrab;
import br.jus.tst.esocial.esquemas.eventos.deslig.TSSimNao;
import br.jus.tst.esocial.ocorrencia.dados.Deslig;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-17T04:03:15-0200",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class DesligMapperImpl extends DesligMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();
    private final XMLGregorianCalendarMapper xMLGregorianCalendarMapper = new XMLGregorianCalendarMapper();

    @Override
    public EvtDeslig comoEvtDeslig(Deslig deslig) {
        if ( deslig == null ) {
            return null;
        }

        EvtDeslig evtDeslig = objectFactory.createESocialEvtDeslig();

        evtDeslig.setIdeEmpregador( ideEmpregadorToTIdeEmpregador( deslig.getIdeEmpregador() ) );
        evtDeslig.setIdeVinculo( ideVinculoToTIdeVinculo( deslig.getIdeVinculo() ) );
        evtDeslig.setInfoDeslig( infoDesligToInfoDeslig( deslig.getInfoDeslig() ) );

        limparNulos( evtDeslig );

        return evtDeslig;
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

    protected TIdeVinculo ideVinculoToTIdeVinculo(IdeVinculo ideVinculo) {
        if ( ideVinculo == null ) {
            return null;
        }

        TIdeVinculo tIdeVinculo = objectFactory.createTIdeVinculo();

        tIdeVinculo.setCpfTrab( ideVinculo.getCpfTrab() );
        tIdeVinculo.setMatricula( ideVinculo.getMatricula() );

        return tIdeVinculo;
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

    protected SucessaoVinc sucessaoVincToSucessaoVinc(br.jus.tst.esocial.dominio.desligamento.SucessaoVinc sucessaoVinc) {
        if ( sucessaoVinc == null ) {
            return null;
        }

        SucessaoVinc sucessaoVinc1 = objectFactory.createESocialEvtDesligInfoDesligSucessaoVinc();

        sucessaoVinc1.setTpInsc( sucessaoVinc.getTpInsc() );
        sucessaoVinc1.setNrInsc( sucessaoVinc.getNrInsc() );

        return sucessaoVinc1;
    }

    protected TransfTit transfTitToTransfTit(br.jus.tst.esocial.dominio.desligamento.TransfTit transfTit) {
        if ( transfTit == null ) {
            return null;
        }

        TransfTit transfTit1 = objectFactory.createESocialEvtDesligInfoDesligTransfTit();

        transfTit1.setCpfSubstituto( transfTit.getCpfSubstituto() );
        transfTit1.setDtNascto( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( transfTit.getDtNascto() ) );

        return transfTit1;
    }

    protected MudancaCPF mudancaCPFToMudancaCPF(br.jus.tst.esocial.dominio.vinculo.MudancaCPF mudancaCPF) {
        if ( mudancaCPF == null ) {
            return null;
        }

        MudancaCPF mudancaCPF1 = objectFactory.createESocialEvtDesligInfoDesligMudancaCPF();

        mudancaCPF1.setNovoCPF( mudancaCPF.getNovoCPF() );

        return mudancaCPF1;
    }

    protected RemunOutrEmpr remunOutrEmprToRemunOutrEmpr(br.jus.tst.esocial.dominio.trabalhador.identificacaobasica.RemunOutrEmpr remunOutrEmpr) {
        if ( remunOutrEmpr == null ) {
            return null;
        }

        RemunOutrEmpr remunOutrEmpr1 = objectFactory.createTInfoMVRemunOutrEmpr();

        remunOutrEmpr1.setTpInsc( remunOutrEmpr.getTpInsc() );
        remunOutrEmpr1.setNrInsc( remunOutrEmpr.getNrInsc() );
        remunOutrEmpr1.setCodCateg( remunOutrEmpr.getCodCateg() );
        remunOutrEmpr1.setVlrRemunOE( remunOutrEmpr.getVlrRemunOE() );

        return remunOutrEmpr1;
    }

    protected List<RemunOutrEmpr> remunOutrEmprListToRemunOutrEmprList(List<br.jus.tst.esocial.dominio.trabalhador.identificacaobasica.RemunOutrEmpr> list) {
        if ( list == null ) {
            return null;
        }

        List<RemunOutrEmpr> list1 = new ArrayList<RemunOutrEmpr>( list.size() );
        for ( br.jus.tst.esocial.dominio.trabalhador.identificacaobasica.RemunOutrEmpr remunOutrEmpr : list ) {
            list1.add( remunOutrEmprToRemunOutrEmpr( remunOutrEmpr ) );
        }

        return list1;
    }

    protected TInfoMV infoMVToTInfoMV(InfoMV infoMV) {
        if ( infoMV == null ) {
            return null;
        }

        TInfoMV tInfoMV = objectFactory.createTInfoMV();

        tInfoMV.setIndMV( infoMV.getIndMV() );
        if ( tInfoMV.getRemunOutrEmpr() != null ) {
            List<RemunOutrEmpr> list = remunOutrEmprListToRemunOutrEmprList( infoMV.getRemunOutrEmpr() );
            if ( list != null ) {
                tInfoMV.getRemunOutrEmpr().addAll( list );
            }
        }

        return tInfoMV;
    }

    protected ProcCS procCSToProcCS(br.jus.tst.esocial.dominio.desligamento.ProcCS procCS) {
        if ( procCS == null ) {
            return null;
        }

        ProcCS procCS1 = objectFactory.createESocialEvtDesligInfoDesligVerbasRescProcCS();

        procCS1.setNrProcJud( procCS.getNrProcJud() );

        return procCS1;
    }

    protected InfoAgNocivo infoAgNocivoToInfoAgNocivo(br.jus.tst.esocial.dominio.estabelecimentolotacao.InfoAgNocivo infoAgNocivo) {
        if ( infoAgNocivo == null ) {
            return null;
        }

        InfoAgNocivo infoAgNocivo1 = objectFactory.createTIdeEstabLotInfoAgNocivo();

        infoAgNocivo1.setGrauExp( infoAgNocivo.getGrauExp() );

        return infoAgNocivo1;
    }

    protected TInfoSimples infoSimplesToTInfoSimples(InfoSimples infoSimples) {
        if ( infoSimples == null ) {
            return null;
        }

        TInfoSimples tInfoSimples = objectFactory.createTInfoSimples();

        tInfoSimples.setIndSimples( infoSimples.getIndSimples() );

        return tInfoSimples;
    }

    protected DetVerbas detVerbasToDetVerbas(br.jus.tst.esocial.dominio.estabelecimentolotacao.DetVerbas detVerbas) {
        if ( detVerbas == null ) {
            return null;
        }

        DetVerbas detVerbas1 = objectFactory.createTIdeEstabLotDetVerbas();

        detVerbas1.setCodRubr( detVerbas.getCodRubr() );
        detVerbas1.setIdeTabRubr( detVerbas.getIdeTabRubr() );
        detVerbas1.setQtdRubr( detVerbas.getQtdRubr() );
        detVerbas1.setFatorRubr( detVerbas.getFatorRubr() );
        detVerbas1.setVrRubr( detVerbas.getVrRubr() );
        detVerbas1.setIndApurIR( detVerbas.getIndApurIR() );

        return detVerbas1;
    }

    protected List<DetVerbas> detVerbasListToDetVerbasList(List<br.jus.tst.esocial.dominio.estabelecimentolotacao.DetVerbas> list) {
        if ( list == null ) {
            return null;
        }

        List<DetVerbas> list1 = new ArrayList<DetVerbas>( list.size() );
        for ( br.jus.tst.esocial.dominio.estabelecimentolotacao.DetVerbas detVerbas : list ) {
            list1.add( detVerbasToDetVerbas( detVerbas ) );
        }

        return list1;
    }

    protected TIdeEstabLot ideEstabLotToTIdeEstabLot(IdeEstabLot ideEstabLot) {
        if ( ideEstabLot == null ) {
            return null;
        }

        TIdeEstabLot tIdeEstabLot = objectFactory.createTIdeEstabLot();

        tIdeEstabLot.setTpInsc( ideEstabLot.getTpInsc() );
        tIdeEstabLot.setNrInsc( ideEstabLot.getNrInsc() );
        tIdeEstabLot.setCodLotacao( ideEstabLot.getCodLotacao() );
        tIdeEstabLot.setInfoAgNocivo( infoAgNocivoToInfoAgNocivo( ideEstabLot.getInfoAgNocivo() ) );
        tIdeEstabLot.setInfoSimples( infoSimplesToTInfoSimples( ideEstabLot.getInfoSimples() ) );
        if ( tIdeEstabLot.getDetVerbas() != null ) {
            List<DetVerbas> list = detVerbasListToDetVerbasList( ideEstabLot.getDetVerbas() );
            if ( list != null ) {
                tIdeEstabLot.getDetVerbas().addAll( list );
            }
        }

        return tIdeEstabLot;
    }

    protected List<TIdeEstabLot> ideEstabLotListToTIdeEstabLotList(List<IdeEstabLot> list) {
        if ( list == null ) {
            return null;
        }

        List<TIdeEstabLot> list1 = new ArrayList<TIdeEstabLot>( list.size() );
        for ( IdeEstabLot ideEstabLot : list ) {
            list1.add( ideEstabLotToTIdeEstabLot( ideEstabLot ) );
        }

        return list1;
    }

    protected InfoPerApur infoPerApurToInfoPerApur(br.jus.tst.esocial.dominio.desligamento.InfoPerApur infoPerApur) {
        if ( infoPerApur == null ) {
            return null;
        }

        InfoPerApur infoPerApur1 = objectFactory.createESocialEvtDesligInfoDesligVerbasRescDmDevInfoPerApur();

        if ( infoPerApur1.getIdeEstabLot() != null ) {
            List<TIdeEstabLot> list = ideEstabLotListToTIdeEstabLotList( infoPerApur.getIdeEstabLot() );
            if ( list != null ) {
                infoPerApur1.getIdeEstabLot().addAll( list );
            }
        }

        return infoPerApur1;
    }

    protected TIdeEstabLot ideEstabLotToTIdeEstabLot1(br.jus.tst.esocial.dominio.estabelecimentolotacao.IdeEstabLot ideEstabLot) {
        if ( ideEstabLot == null ) {
            return null;
        }

        TIdeEstabLot tIdeEstabLot = objectFactory.createTIdeEstabLot();

        tIdeEstabLot.setTpInsc( ideEstabLot.getTpInsc() );
        tIdeEstabLot.setNrInsc( ideEstabLot.getNrInsc() );
        tIdeEstabLot.setCodLotacao( ideEstabLot.getCodLotacao() );
        tIdeEstabLot.setInfoAgNocivo( infoAgNocivoToInfoAgNocivo( ideEstabLot.getInfoAgNocivo() ) );
        tIdeEstabLot.setInfoSimples( infoSimplesToTInfoSimples( ideEstabLot.getInfoSimples() ) );
        if ( tIdeEstabLot.getDetVerbas() != null ) {
            List<DetVerbas> list = detVerbasListToDetVerbasList( ideEstabLot.getDetVerbas() );
            if ( list != null ) {
                tIdeEstabLot.getDetVerbas().addAll( list );
            }
        }

        return tIdeEstabLot;
    }

    protected List<TIdeEstabLot> ideEstabLotListToTIdeEstabLotList1(List<br.jus.tst.esocial.dominio.estabelecimentolotacao.IdeEstabLot> list) {
        if ( list == null ) {
            return null;
        }

        List<TIdeEstabLot> list1 = new ArrayList<TIdeEstabLot>( list.size() );
        for ( br.jus.tst.esocial.dominio.estabelecimentolotacao.IdeEstabLot ideEstabLot : list ) {
            list1.add( ideEstabLotToTIdeEstabLot1( ideEstabLot ) );
        }

        return list1;
    }

    protected IdePeriodo idePeriodoToIdePeriodo(br.jus.tst.esocial.dominio.demonstrativovalores.IdePeriodo idePeriodo) {
        if ( idePeriodo == null ) {
            return null;
        }

        IdePeriodo idePeriodo1 = objectFactory.createESocialEvtDesligInfoDesligVerbasRescDmDevInfoPerAntIdeADCIdePeriodo();

        idePeriodo1.setPerRef( idePeriodo.getPerRef() );
        if ( idePeriodo1.getIdeEstabLot() != null ) {
            List<TIdeEstabLot> list = ideEstabLotListToTIdeEstabLotList1( idePeriodo.getIdeEstabLot() );
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

    protected IdeADC ideADCToIdeADC(br.jus.tst.esocial.dominio.desligamento.IdeADC ideADC) {
        if ( ideADC == null ) {
            return null;
        }

        IdeADC ideADC1 = objectFactory.createESocialEvtDesligInfoDesligVerbasRescDmDevInfoPerAntIdeADC();

        ideADC1.setDtAcConv( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( ideADC.getDtAcConv() ) );
        ideADC1.setTpAcConv( ideADC.getTpAcConv() );
        ideADC1.setDsc( ideADC.getDsc() );
        if ( ideADC1.getIdePeriodo() != null ) {
            List<IdePeriodo> list = idePeriodoListToIdePeriodoList( ideADC.getIdePeriodo() );
            if ( list != null ) {
                ideADC1.getIdePeriodo().addAll( list );
            }
        }

        return ideADC1;
    }

    protected List<IdeADC> ideADCListToIdeADCList(List<br.jus.tst.esocial.dominio.desligamento.IdeADC> list) {
        if ( list == null ) {
            return null;
        }

        List<IdeADC> list1 = new ArrayList<IdeADC>( list.size() );
        for ( br.jus.tst.esocial.dominio.desligamento.IdeADC ideADC : list ) {
            list1.add( ideADCToIdeADC( ideADC ) );
        }

        return list1;
    }

    protected InfoPerAnt infoPerAntToInfoPerAnt(br.jus.tst.esocial.dominio.desligamento.InfoPerAnt infoPerAnt) {
        if ( infoPerAnt == null ) {
            return null;
        }

        InfoPerAnt infoPerAnt1 = objectFactory.createESocialEvtDesligInfoDesligVerbasRescDmDevInfoPerAnt();

        if ( infoPerAnt1.getIdeADC() != null ) {
            List<IdeADC> list = ideADCListToIdeADCList( infoPerAnt.getIdeADC() );
            if ( list != null ) {
                infoPerAnt1.getIdeADC().addAll( list );
            }
        }

        return infoPerAnt1;
    }

    protected DmDev dmDevToDmDev(br.jus.tst.esocial.dominio.desligamento.DmDev dmDev) {
        if ( dmDev == null ) {
            return null;
        }

        DmDev dmDev1 = objectFactory.createESocialEvtDesligInfoDesligVerbasRescDmDev();

        dmDev1.setIdeDmDev( dmDev.getIdeDmDev() );
        dmDev1.setInfoPerApur( infoPerApurToInfoPerApur( dmDev.getInfoPerApur() ) );
        dmDev1.setInfoPerAnt( infoPerAntToInfoPerAnt( dmDev.getInfoPerAnt() ) );

        return dmDev1;
    }

    protected List<DmDev> dmDevListToDmDevList(List<br.jus.tst.esocial.dominio.desligamento.DmDev> list) {
        if ( list == null ) {
            return null;
        }

        List<DmDev> list1 = new ArrayList<DmDev>( list.size() );
        for ( br.jus.tst.esocial.dominio.desligamento.DmDev dmDev : list ) {
            list1.add( dmDevToDmDev( dmDev ) );
        }

        return list1;
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

    protected VerbasResc verbasRescToVerbasResc(br.jus.tst.esocial.dominio.desligamento.VerbasResc verbasResc) {
        if ( verbasResc == null ) {
            return null;
        }

        VerbasResc verbasResc1 = objectFactory.createESocialEvtDesligInfoDesligVerbasResc();

        verbasResc1.setInfoMV( infoMVToTInfoMV( verbasResc.getInfoMV() ) );
        verbasResc1.setProcCS( procCSToProcCS( verbasResc.getProcCS() ) );
        if ( verbasResc1.getDmDev() != null ) {
            List<DmDev> list = dmDevListToDmDevList( verbasResc.getDmDev() );
            if ( list != null ) {
                verbasResc1.getDmDev().addAll( list );
            }
        }
        if ( verbasResc1.getProcJudTrab() != null ) {
            List<TProcJudTrab> list1 = procJudTrabListToTProcJudTrabList( verbasResc.getProcJudTrab() );
            if ( list1 != null ) {
                verbasResc1.getProcJudTrab().addAll( list1 );
            }
        }

        return verbasResc1;
    }

    protected Quarentena quarentenaToQuarentena(br.jus.tst.esocial.dominio.termino.Quarentena quarentena) {
        if ( quarentena == null ) {
            return null;
        }

        Quarentena quarentena1 = objectFactory.createESocialEvtDesligInfoDesligQuarentena();

        quarentena1.setDtFimQuar( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( quarentena.getDtFimQuar() ) );

        return quarentena1;
    }

    protected TInfoInterm infoIntermToTInfoInterm(InfoInterm infoInterm) {
        if ( infoInterm == null ) {
            return null;
        }

        TInfoInterm tInfoInterm = objectFactory.createTInfoInterm();

        tInfoInterm.setDia( infoInterm.getDia() );

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

    protected Observacoes observacoesToObservacoes(br.jus.tst.esocial.dominio.desligamento.Observacoes observacoes) {
        if ( observacoes == null ) {
            return null;
        }

        Observacoes observacoes1 = objectFactory.createESocialEvtDesligInfoDesligObservacoes();

        observacoes1.setObservacao( observacoes.getObservacao() );

        return observacoes1;
    }

    protected List<Observacoes> observacoesListToObservacoesList(List<br.jus.tst.esocial.dominio.desligamento.Observacoes> list) {
        if ( list == null ) {
            return null;
        }

        List<Observacoes> list1 = new ArrayList<Observacoes>( list.size() );
        for ( br.jus.tst.esocial.dominio.desligamento.Observacoes observacoes : list ) {
            list1.add( observacoesToObservacoes( observacoes ) );
        }

        return list1;
    }

    protected ConsigFGTS consigFGTSToConsigFGTS(br.jus.tst.esocial.dominio.desligamento.ConsigFGTS consigFGTS) {
        if ( consigFGTS == null ) {
            return null;
        }

        ConsigFGTS consigFGTS1 = objectFactory.createESocialEvtDesligInfoDesligConsigFGTS();

        consigFGTS1.setInsConsig( consigFGTS.getInsConsig() );
        consigFGTS1.setNrContr( consigFGTS.getNrContr() );

        return consigFGTS1;
    }

    protected List<ConsigFGTS> consigFGTSListToConsigFGTSList(List<br.jus.tst.esocial.dominio.desligamento.ConsigFGTS> list) {
        if ( list == null ) {
            return null;
        }

        List<ConsigFGTS> list1 = new ArrayList<ConsigFGTS>( list.size() );
        for ( br.jus.tst.esocial.dominio.desligamento.ConsigFGTS consigFGTS : list ) {
            list1.add( consigFGTSToConsigFGTS( consigFGTS ) );
        }

        return list1;
    }

    protected InfoDeslig infoDesligToInfoDeslig(br.jus.tst.esocial.dominio.desligamento.InfoDeslig infoDeslig) {
        if ( infoDeslig == null ) {
            return null;
        }

        InfoDeslig infoDeslig1 = objectFactory.createESocialEvtDesligInfoDeslig();

        infoDeslig1.setMtvDeslig( infoDeslig.getMtvDeslig() );
        infoDeslig1.setDtDeslig( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( infoDeslig.getDtDeslig() ) );
        infoDeslig1.setDtAvPrv( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( infoDeslig.getDtAvPrv() ) );
        infoDeslig1.setIndPagtoAPI( simNaoToTSSimNao( infoDeslig.getIndPagtoAPI() ) );
        infoDeslig1.setDtProjFimAPI( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( infoDeslig.getDtProjFimAPI() ) );
        infoDeslig1.setPensAlim( infoDeslig.getPensAlim() );
        infoDeslig1.setPercAliment( infoDeslig.getPercAliment() );
        infoDeslig1.setVrAlim( infoDeslig.getVrAlim() );
        infoDeslig1.setNrProcTrab( infoDeslig.getNrProcTrab() );
        infoDeslig1.setSucessaoVinc( sucessaoVincToSucessaoVinc( infoDeslig.getSucessaoVinc() ) );
        infoDeslig1.setTransfTit( transfTitToTransfTit( infoDeslig.getTransfTit() ) );
        infoDeslig1.setMudancaCPF( mudancaCPFToMudancaCPF( infoDeslig.getMudancaCPF() ) );
        infoDeslig1.setVerbasResc( verbasRescToVerbasResc( infoDeslig.getVerbasResc() ) );
        infoDeslig1.setQuarentena( quarentenaToQuarentena( infoDeslig.getQuarentena() ) );
        if ( infoDeslig1.getInfoInterm() != null ) {
            List<TInfoInterm> list = infoIntermListToTInfoIntermList( infoDeslig.getInfoInterm() );
            if ( list != null ) {
                infoDeslig1.getInfoInterm().addAll( list );
            }
        }
        if ( infoDeslig1.getObservacoes() != null ) {
            List<Observacoes> list1 = observacoesListToObservacoesList( infoDeslig.getObservacoes() );
            if ( list1 != null ) {
                infoDeslig1.getObservacoes().addAll( list1 );
            }
        }
        if ( infoDeslig1.getConsigFGTS() != null ) {
            List<ConsigFGTS> list2 = consigFGTSListToConsigFGTSList( infoDeslig.getConsigFGTS() );
            if ( list2 != null ) {
                infoDeslig1.getConsigFGTS().addAll( list2 );
            }
        }

        return infoDeslig1;
    }
}
