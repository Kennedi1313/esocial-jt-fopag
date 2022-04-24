package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.dominio.estabelecimentolotacao.DetVerbas;
import br.jus.tst.esocial.dominio.estabelecimentolotacao.InfoSimples;
import br.jus.tst.esocial.dominio.semvinculo.alteracaocontratual.IdeTrabSemVinculo;
import br.jus.tst.esocial.dominio.semvinculo.termino.VerbasResc;
import br.jus.tst.esocial.dominio.termino.Quarentena;
import br.jus.tst.esocial.dominio.trabalhador.identificacaobasica.InfoMV;
import br.jus.tst.esocial.dominio.trabalhador.identificacaobasica.ProcJudTrab;
import br.jus.tst.esocial.dominio.trabalhador.identificacaobasica.RemunOutrEmpr;
import br.jus.tst.esocial.esquemas.eventos.tsvtermino.ESocial.EvtTSVTermino;
import br.jus.tst.esocial.esquemas.eventos.tsvtermino.ESocial.EvtTSVTermino.InfoTSVTermino;
import br.jus.tst.esocial.esquemas.eventos.tsvtermino.ESocial.EvtTSVTermino.InfoTSVTermino.MudancaCPF;
import br.jus.tst.esocial.esquemas.eventos.tsvtermino.ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc.DmDev;
import br.jus.tst.esocial.esquemas.eventos.tsvtermino.ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc.DmDev.IdeEstabLot;
import br.jus.tst.esocial.esquemas.eventos.tsvtermino.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.tsvtermino.TIdeEmpregador;
import br.jus.tst.esocial.esquemas.eventos.tsvtermino.TIdeTrabSemVinculo;
import br.jus.tst.esocial.esquemas.eventos.tsvtermino.TInfoMV;
import br.jus.tst.esocial.esquemas.eventos.tsvtermino.TInfoSimples;
import br.jus.tst.esocial.esquemas.eventos.tsvtermino.TProcJudTrab;
import br.jus.tst.esocial.ocorrencia.dados.TSVTermino;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-23T22:04:13-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class TSVTerminoMapperImpl extends TSVTerminoMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();
    private final XMLGregorianCalendarMapper xMLGregorianCalendarMapper = new XMLGregorianCalendarMapper();

    @Override
    public EvtTSVTermino comoEvtTSVTermino(TSVTermino tsvTermino) {
        if ( tsvTermino == null ) {
            return null;
        }

        EvtTSVTermino evtTSVTermino = objectFactory.createESocialEvtTSVTermino();

        evtTSVTermino.setIdeEmpregador( ideEmpregadorToTIdeEmpregador( tsvTermino.getIdeEmpregador() ) );
        evtTSVTermino.setIdeTrabSemVinculo( ideTrabSemVinculoToTIdeTrabSemVinculo( tsvTermino.getIdeTrabSemVinculo() ) );
        evtTSVTermino.setInfoTSVTermino( infoTSVTerminoToInfoTSVTermino( tsvTermino.getInfoTSVTermino() ) );

        limparNulos( evtTSVTermino );

        return evtTSVTermino;
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

    protected TIdeTrabSemVinculo ideTrabSemVinculoToTIdeTrabSemVinculo(IdeTrabSemVinculo ideTrabSemVinculo) {
        if ( ideTrabSemVinculo == null ) {
            return null;
        }

        TIdeTrabSemVinculo tIdeTrabSemVinculo = objectFactory.createTIdeTrabSemVinculo();

        tIdeTrabSemVinculo.setCpfTrab( ideTrabSemVinculo.getCpfTrab() );
        tIdeTrabSemVinculo.setMatricula( ideTrabSemVinculo.getMatricula() );
        if ( ideTrabSemVinculo.getCodCateg() != null ) {
            tIdeTrabSemVinculo.setCodCateg( BigInteger.valueOf( ideTrabSemVinculo.getCodCateg() ) );
        }

        return tIdeTrabSemVinculo;
    }

    protected MudancaCPF mudancaCPFToMudancaCPF(br.jus.tst.esocial.dominio.vinculo.MudancaCPF mudancaCPF) {
        if ( mudancaCPF == null ) {
            return null;
        }

        MudancaCPF mudancaCPF1 = objectFactory.createESocialEvtTSVTerminoInfoTSVTerminoMudancaCPF();

        mudancaCPF1.setNovoCPF( mudancaCPF.getNovoCPF() );

        return mudancaCPF1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.tsvtermino.TInfoMV.RemunOutrEmpr remunOutrEmprToRemunOutrEmpr(RemunOutrEmpr remunOutrEmpr) {
        if ( remunOutrEmpr == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tsvtermino.TInfoMV.RemunOutrEmpr remunOutrEmpr1 = objectFactory.createTInfoMVRemunOutrEmpr();

        remunOutrEmpr1.setTpInsc( remunOutrEmpr.getTpInsc() );
        remunOutrEmpr1.setNrInsc( remunOutrEmpr.getNrInsc() );
        remunOutrEmpr1.setCodCateg( remunOutrEmpr.getCodCateg() );
        remunOutrEmpr1.setVlrRemunOE( remunOutrEmpr.getVlrRemunOE() );

        return remunOutrEmpr1;
    }

    protected List<br.jus.tst.esocial.esquemas.eventos.tsvtermino.TInfoMV.RemunOutrEmpr> remunOutrEmprListToRemunOutrEmprList(List<RemunOutrEmpr> list) {
        if ( list == null ) {
            return null;
        }

        List<br.jus.tst.esocial.esquemas.eventos.tsvtermino.TInfoMV.RemunOutrEmpr> list1 = new ArrayList<br.jus.tst.esocial.esquemas.eventos.tsvtermino.TInfoMV.RemunOutrEmpr>( list.size() );
        for ( RemunOutrEmpr remunOutrEmpr : list ) {
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
            List<br.jus.tst.esocial.esquemas.eventos.tsvtermino.TInfoMV.RemunOutrEmpr> list = remunOutrEmprListToRemunOutrEmprList( infoMV.getRemunOutrEmpr() );
            if ( list != null ) {
                tInfoMV.getRemunOutrEmpr().addAll( list );
            }
        }

        return tInfoMV;
    }

    protected TInfoSimples infoSimplesToTInfoSimples(InfoSimples infoSimples) {
        if ( infoSimples == null ) {
            return null;
        }

        TInfoSimples tInfoSimples = objectFactory.createTInfoSimples();

        tInfoSimples.setIndSimples( infoSimples.getIndSimples() );

        return tInfoSimples;
    }

    protected br.jus.tst.esocial.esquemas.eventos.tsvtermino.ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc.DmDev.IdeEstabLot.DetVerbas detVerbasToDetVerbas(DetVerbas detVerbas) {
        if ( detVerbas == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tsvtermino.ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc.DmDev.IdeEstabLot.DetVerbas detVerbas1 = objectFactory.createESocialEvtTSVTerminoInfoTSVTerminoVerbasRescDmDevIdeEstabLotDetVerbas();

        detVerbas1.setCodRubr( detVerbas.getCodRubr() );
        detVerbas1.setIdeTabRubr( detVerbas.getIdeTabRubr() );
        detVerbas1.setQtdRubr( detVerbas.getQtdRubr() );
        detVerbas1.setFatorRubr( detVerbas.getFatorRubr() );
        detVerbas1.setVrRubr( detVerbas.getVrRubr() );
        detVerbas1.setIndApurIR( detVerbas.getIndApurIR() );

        return detVerbas1;
    }

    protected List<br.jus.tst.esocial.esquemas.eventos.tsvtermino.ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc.DmDev.IdeEstabLot.DetVerbas> detVerbasListToDetVerbasList(List<DetVerbas> list) {
        if ( list == null ) {
            return null;
        }

        List<br.jus.tst.esocial.esquemas.eventos.tsvtermino.ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc.DmDev.IdeEstabLot.DetVerbas> list1 = new ArrayList<br.jus.tst.esocial.esquemas.eventos.tsvtermino.ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc.DmDev.IdeEstabLot.DetVerbas>( list.size() );
        for ( DetVerbas detVerbas : list ) {
            list1.add( detVerbasToDetVerbas( detVerbas ) );
        }

        return list1;
    }

    protected IdeEstabLot ideEstabLotToIdeEstabLot(br.jus.tst.esocial.dominio.estabelecimentolotacao.IdeEstabLot ideEstabLot) {
        if ( ideEstabLot == null ) {
            return null;
        }

        IdeEstabLot ideEstabLot1 = objectFactory.createESocialEvtTSVTerminoInfoTSVTerminoVerbasRescDmDevIdeEstabLot();

        ideEstabLot1.setTpInsc( ideEstabLot.getTpInsc() );
        ideEstabLot1.setNrInsc( ideEstabLot.getNrInsc() );
        ideEstabLot1.setCodLotacao( ideEstabLot.getCodLotacao() );
        ideEstabLot1.setInfoSimples( infoSimplesToTInfoSimples( ideEstabLot.getInfoSimples() ) );
        if ( ideEstabLot1.getDetVerbas() != null ) {
            List<br.jus.tst.esocial.esquemas.eventos.tsvtermino.ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc.DmDev.IdeEstabLot.DetVerbas> list = detVerbasListToDetVerbasList( ideEstabLot.getDetVerbas() );
            if ( list != null ) {
                ideEstabLot1.getDetVerbas().addAll( list );
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

    protected DmDev dmDevToDmDev(br.jus.tst.esocial.dominio.demonstrativovalores.DmDev dmDev) {
        if ( dmDev == null ) {
            return null;
        }

        DmDev dmDev1 = objectFactory.createESocialEvtTSVTerminoInfoTSVTerminoVerbasRescDmDev();

        dmDev1.setIdeDmDev( dmDev.getIdeDmDev() );
        if ( dmDev1.getIdeEstabLot() != null ) {
            List<IdeEstabLot> list = ideEstabLotListToIdeEstabLotList( dmDev.getIdeEstabLot() );
            if ( list != null ) {
                dmDev1.getIdeEstabLot().addAll( list );
            }
        }

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

    protected br.jus.tst.esocial.esquemas.eventos.tsvtermino.ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc verbasRescToVerbasResc(VerbasResc verbasResc) {
        if ( verbasResc == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tsvtermino.ESocial.EvtTSVTermino.InfoTSVTermino.VerbasResc verbasResc1 = objectFactory.createESocialEvtTSVTerminoInfoTSVTerminoVerbasResc();

        verbasResc1.setInfoMV( infoMVToTInfoMV( verbasResc.getInfoMV() ) );
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

    protected br.jus.tst.esocial.esquemas.eventos.tsvtermino.ESocial.EvtTSVTermino.InfoTSVTermino.Quarentena quarentenaToQuarentena(Quarentena quarentena) {
        if ( quarentena == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tsvtermino.ESocial.EvtTSVTermino.InfoTSVTermino.Quarentena quarentena1 = objectFactory.createESocialEvtTSVTerminoInfoTSVTerminoQuarentena();

        quarentena1.setDtFimQuar( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( quarentena.getDtFimQuar() ) );

        return quarentena1;
    }

    protected InfoTSVTermino infoTSVTerminoToInfoTSVTermino(br.jus.tst.esocial.dominio.semvinculo.termino.InfoTSVTermino infoTSVTermino) {
        if ( infoTSVTermino == null ) {
            return null;
        }

        InfoTSVTermino infoTSVTermino1 = objectFactory.createESocialEvtTSVTerminoInfoTSVTermino();

        infoTSVTermino1.setDtTerm( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( infoTSVTermino.getDtTerm() ) );
        infoTSVTermino1.setMtvDesligTSV( infoTSVTermino.getMtvDesligTSV() );
        infoTSVTermino1.setPensAlim( infoTSVTermino.getPensAlim() );
        infoTSVTermino1.setPercAliment( infoTSVTermino.getPercAliment() );
        infoTSVTermino1.setVrAlim( infoTSVTermino.getVrAlim() );
        infoTSVTermino1.setNrProcTrab( infoTSVTermino.getNrProcTrab() );
        infoTSVTermino1.setMudancaCPF( mudancaCPFToMudancaCPF( infoTSVTermino.getMudancaCPF() ) );
        infoTSVTermino1.setVerbasResc( verbasRescToVerbasResc( infoTSVTermino.getVerbasResc() ) );
        infoTSVTermino1.setQuarentena( quarentenaToQuarentena( infoTSVTermino.getQuarentena() ) );

        return infoTSVTermino1;
    }
}
