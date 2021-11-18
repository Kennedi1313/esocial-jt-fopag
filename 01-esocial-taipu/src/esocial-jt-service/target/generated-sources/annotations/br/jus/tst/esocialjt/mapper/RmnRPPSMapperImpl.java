package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.dominio.enums.SimNao;
import br.jus.tst.esocial.dominio.estabelecimentolotacao.ItemRemuneracao;
import br.jus.tst.esocial.dominio.estabelecimentolotacao.RemunPerAnt;
import br.jus.tst.esocial.dominio.estabelecimentolotacao.RemunPerApur;
import br.jus.tst.esocial.esquemas.eventos.rmnrpps.ESocial.EvtRmnRPPS;
import br.jus.tst.esocial.esquemas.eventos.rmnrpps.ESocial.EvtRmnRPPS.DmDev;
import br.jus.tst.esocial.esquemas.eventos.rmnrpps.ESocial.EvtRmnRPPS.DmDev.InfoPerAnt;
import br.jus.tst.esocial.esquemas.eventos.rmnrpps.ESocial.EvtRmnRPPS.DmDev.InfoPerAnt.IdePeriodo;
import br.jus.tst.esocial.esquemas.eventos.rmnrpps.ESocial.EvtRmnRPPS.DmDev.InfoPerAnt.IdePeriodo.IdeEstab;
import br.jus.tst.esocial.esquemas.eventos.rmnrpps.ESocial.EvtRmnRPPS.DmDev.InfoPerApur;
import br.jus.tst.esocial.esquemas.eventos.rmnrpps.ESocial.EvtRmnRPPS.IdeTrabalhador;
import br.jus.tst.esocial.esquemas.eventos.rmnrpps.ESocial.EvtRmnRPPS.IdeTrabalhador.InfoComplem;
import br.jus.tst.esocial.esquemas.eventos.rmnrpps.ESocial.EvtRmnRPPS.IdeTrabalhador.InfoComplem.SucessaoVinc;
import br.jus.tst.esocial.esquemas.eventos.rmnrpps.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.rmnrpps.TIdeEmpregadorCnpj;
import br.jus.tst.esocial.esquemas.eventos.rmnrpps.TIdeEventoFolhaOpp;
import br.jus.tst.esocial.esquemas.eventos.rmnrpps.TItensRemunRpps;
import br.jus.tst.esocial.esquemas.eventos.rmnrpps.TRemunPer;
import br.jus.tst.esocial.esquemas.eventos.rmnrpps.TSSimNao;
import br.jus.tst.esocial.ocorrencia.dados.RmnRPPS;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-17T04:03:19-0200",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class RmnRPPSMapperImpl extends RmnRPPSMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();
    private final XMLGregorianCalendarMapper xMLGregorianCalendarMapper = new XMLGregorianCalendarMapper();
    private final IdeEventoMapper ideEventoMapper = new IdeEventoMapper();

    @Override
    public EvtRmnRPPS comoEvtRmnRPPS(RmnRPPS rmnRPPS) {
        if ( rmnRPPS == null ) {
            return null;
        }

        EvtRmnRPPS evtRmnRPPS = objectFactory.createESocialEvtRmnRPPS();

        evtRmnRPPS.setIdeEvento( ideEventoMapper.mapearIdeEventoPagto( rmnRPPS.getIdeEvento(), TIdeEventoFolhaOpp.class ) );
        evtRmnRPPS.setIdeEmpregador( ideEmpregadorToTIdeEmpregadorCnpj( rmnRPPS.getIdeEmpregador() ) );
        evtRmnRPPS.setIdeTrabalhador( ideTrabalhadorToIdeTrabalhador( rmnRPPS.getIdeTrabalhador() ) );
        if ( evtRmnRPPS.getDmDev() != null ) {
            List<DmDev> list = dmDevListToDmDevList( rmnRPPS.getDmDev() );
            if ( list != null ) {
                evtRmnRPPS.getDmDev().addAll( list );
            }
        }

        limparNulos( evtRmnRPPS );

        return evtRmnRPPS;
    }

    protected TIdeEmpregadorCnpj ideEmpregadorToTIdeEmpregadorCnpj(IdeEmpregador ideEmpregador) {
        if ( ideEmpregador == null ) {
            return null;
        }

        TIdeEmpregadorCnpj tIdeEmpregadorCnpj = objectFactory.createTIdeEmpregadorCnpj();

        tIdeEmpregadorCnpj.setTpInsc( ideEmpregador.getTpInsc() );
        tIdeEmpregadorCnpj.setNrInsc( ideEmpregador.getNrInsc() );

        return tIdeEmpregadorCnpj;
    }

    protected SucessaoVinc sucessaoVincToSucessaoVinc(br.jus.tst.esocial.dominio.vinculo.SucessaoVinc sucessaoVinc) {
        if ( sucessaoVinc == null ) {
            return null;
        }

        SucessaoVinc sucessaoVinc1 = objectFactory.createESocialEvtRmnRPPSIdeTrabalhadorInfoComplemSucessaoVinc();

        sucessaoVinc1.setCnpjOrgaoAnt( sucessaoVinc.getCnpjOrgaoAnt() );
        sucessaoVinc1.setMatricAnt( sucessaoVinc.getMatricAnt() );
        sucessaoVinc1.setDtExercicio( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( sucessaoVinc.getDtExercicio() ) );
        sucessaoVinc1.setObservacao( sucessaoVinc.getObservacao() );

        return sucessaoVinc1;
    }

    protected InfoComplem infoComplemToInfoComplem(br.jus.tst.esocial.dominio.trabalhador.identificacaobasica.InfoComplem infoComplem) {
        if ( infoComplem == null ) {
            return null;
        }

        InfoComplem infoComplem1 = objectFactory.createESocialEvtRmnRPPSIdeTrabalhadorInfoComplem();

        infoComplem1.setNmTrab( infoComplem.getNmTrab() );
        infoComplem1.setDtNascto( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( infoComplem.getDtNascto() ) );
        infoComplem1.setSucessaoVinc( sucessaoVincToSucessaoVinc( infoComplem.getSucessaoVinc() ) );

        return infoComplem1;
    }

    protected IdeTrabalhador ideTrabalhadorToIdeTrabalhador(br.jus.tst.esocial.dominio.trabalhador.identificacaobasica.IdeTrabalhador ideTrabalhador) {
        if ( ideTrabalhador == null ) {
            return null;
        }

        IdeTrabalhador ideTrabalhador1 = objectFactory.createESocialEvtRmnRPPSIdeTrabalhador();

        ideTrabalhador1.setCpfTrab( ideTrabalhador.getCpfTrab() );
        ideTrabalhador1.setInfoComplem( infoComplemToInfoComplem( ideTrabalhador.getInfoComplem() ) );

        return ideTrabalhador1;
    }

    protected TItensRemunRpps itemRemuneracaoToTItensRemunRpps(ItemRemuneracao itemRemuneracao) {
        if ( itemRemuneracao == null ) {
            return null;
        }

        TItensRemunRpps tItensRemunRpps = objectFactory.createTItensRemunRpps();

        tItensRemunRpps.setCodRubr( itemRemuneracao.getCodRubr() );
        tItensRemunRpps.setIdeTabRubr( itemRemuneracao.getIdeTabRubr() );
        tItensRemunRpps.setQtdRubr( itemRemuneracao.getQtdRubr() );
        tItensRemunRpps.setFatorRubr( itemRemuneracao.getFatorRubr() );
        tItensRemunRpps.setVrRubr( itemRemuneracao.getVrRubr() );
        if ( itemRemuneracao.getIndApurIR() != null ) {
            tItensRemunRpps.setIndApurIR( itemRemuneracao.getIndApurIR() );
        }

        return tItensRemunRpps;
    }

    protected List<TItensRemunRpps> itemRemuneracaoListToTItensRemunRppsList(List<ItemRemuneracao> list) {
        if ( list == null ) {
            return null;
        }

        List<TItensRemunRpps> list1 = new ArrayList<TItensRemunRpps>( list.size() );
        for ( ItemRemuneracao itemRemuneracao : list ) {
            list1.add( itemRemuneracaoToTItensRemunRpps( itemRemuneracao ) );
        }

        return list1;
    }

    protected TRemunPer remunPerApurToTRemunPer(RemunPerApur remunPerApur) {
        if ( remunPerApur == null ) {
            return null;
        }

        TRemunPer tRemunPer = objectFactory.createTRemunPer();

        tRemunPer.setMatricula( remunPerApur.getMatricula() );
        if ( tRemunPer.getItensRemun() != null ) {
            List<TItensRemunRpps> list = itemRemuneracaoListToTItensRemunRppsList( remunPerApur.getItensRemun() );
            if ( list != null ) {
                tRemunPer.getItensRemun().addAll( list );
            }
        }

        return tRemunPer;
    }

    protected List<TRemunPer> remunPerApurListToTRemunPerList(List<RemunPerApur> list) {
        if ( list == null ) {
            return null;
        }

        List<TRemunPer> list1 = new ArrayList<TRemunPer>( list.size() );
        for ( RemunPerApur remunPerApur : list ) {
            list1.add( remunPerApurToTRemunPer( remunPerApur ) );
        }

        return list1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.rmnrpps.ESocial.EvtRmnRPPS.DmDev.InfoPerApur.IdeEstab ideEstabToIdeEstab(br.jus.tst.esocial.dominio.estabelecimento.IdeEstab ideEstab) {
        if ( ideEstab == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.rmnrpps.ESocial.EvtRmnRPPS.DmDev.InfoPerApur.IdeEstab ideEstab1 = objectFactory.createESocialEvtRmnRPPSDmDevInfoPerApurIdeEstab();

        ideEstab1.setTpInsc( ideEstab.getTpInsc() );
        ideEstab1.setNrInsc( ideEstab.getNrInsc() );
        if ( ideEstab1.getRemunPerApur() != null ) {
            List<TRemunPer> list = remunPerApurListToTRemunPerList( ideEstab.getRemunPerApur() );
            if ( list != null ) {
                ideEstab1.getRemunPerApur().addAll( list );
            }
        }

        return ideEstab1;
    }

    protected List<br.jus.tst.esocial.esquemas.eventos.rmnrpps.ESocial.EvtRmnRPPS.DmDev.InfoPerApur.IdeEstab> ideEstabListToIdeEstabList(List<br.jus.tst.esocial.dominio.estabelecimento.IdeEstab> list) {
        if ( list == null ) {
            return null;
        }

        List<br.jus.tst.esocial.esquemas.eventos.rmnrpps.ESocial.EvtRmnRPPS.DmDev.InfoPerApur.IdeEstab> list1 = new ArrayList<br.jus.tst.esocial.esquemas.eventos.rmnrpps.ESocial.EvtRmnRPPS.DmDev.InfoPerApur.IdeEstab>( list.size() );
        for ( br.jus.tst.esocial.dominio.estabelecimento.IdeEstab ideEstab : list ) {
            list1.add( ideEstabToIdeEstab( ideEstab ) );
        }

        return list1;
    }

    protected InfoPerApur infoPerApurToInfoPerApur(br.jus.tst.esocial.dominio.demonstrativovalores.InfoPerApur infoPerApur) {
        if ( infoPerApur == null ) {
            return null;
        }

        InfoPerApur infoPerApur1 = objectFactory.createESocialEvtRmnRPPSDmDevInfoPerApur();

        if ( infoPerApur1.getIdeEstab() != null ) {
            List<br.jus.tst.esocial.esquemas.eventos.rmnrpps.ESocial.EvtRmnRPPS.DmDev.InfoPerApur.IdeEstab> list = ideEstabListToIdeEstabList( infoPerApur.getIdeEstab() );
            if ( list != null ) {
                infoPerApur1.getIdeEstab().addAll( list );
            }
        }

        return infoPerApur1;
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

    protected TRemunPer remunPerAntToTRemunPer(RemunPerAnt remunPerAnt) {
        if ( remunPerAnt == null ) {
            return null;
        }

        TRemunPer tRemunPer = objectFactory.createTRemunPer();

        tRemunPer.setMatricula( remunPerAnt.getMatricula() );
        if ( tRemunPer.getItensRemun() != null ) {
            List<TItensRemunRpps> list = itemRemuneracaoListToTItensRemunRppsList( remunPerAnt.getItensRemun() );
            if ( list != null ) {
                tRemunPer.getItensRemun().addAll( list );
            }
        }

        return tRemunPer;
    }

    protected List<TRemunPer> remunPerAntListToTRemunPerList(List<RemunPerAnt> list) {
        if ( list == null ) {
            return null;
        }

        List<TRemunPer> list1 = new ArrayList<TRemunPer>( list.size() );
        for ( RemunPerAnt remunPerAnt : list ) {
            list1.add( remunPerAntToTRemunPer( remunPerAnt ) );
        }

        return list1;
    }

    protected IdeEstab ideEstabToIdeEstab1(br.jus.tst.esocial.dominio.beneficio.demonstrativovalores.IdeEstab ideEstab) {
        if ( ideEstab == null ) {
            return null;
        }

        IdeEstab ideEstab1 = objectFactory.createESocialEvtRmnRPPSDmDevInfoPerAntIdePeriodoIdeEstab();

        ideEstab1.setTpInsc( ideEstab.getTpInsc() );
        ideEstab1.setNrInsc( ideEstab.getNrInsc() );
        if ( ideEstab1.getRemunPerAnt() != null ) {
            List<TRemunPer> list = remunPerAntListToTRemunPerList( ideEstab.getRemunPerAnt() );
            if ( list != null ) {
                ideEstab1.getRemunPerAnt().addAll( list );
            }
        }

        return ideEstab1;
    }

    protected List<IdeEstab> ideEstabListToIdeEstabList1(List<br.jus.tst.esocial.dominio.beneficio.demonstrativovalores.IdeEstab> list) {
        if ( list == null ) {
            return null;
        }

        List<IdeEstab> list1 = new ArrayList<IdeEstab>( list.size() );
        for ( br.jus.tst.esocial.dominio.beneficio.demonstrativovalores.IdeEstab ideEstab : list ) {
            list1.add( ideEstabToIdeEstab1( ideEstab ) );
        }

        return list1;
    }

    protected IdePeriodo idePeriodoToIdePeriodo(br.jus.tst.esocial.dominio.beneficio.demonstrativovalores.IdePeriodo idePeriodo) {
        if ( idePeriodo == null ) {
            return null;
        }

        IdePeriodo idePeriodo1 = objectFactory.createESocialEvtRmnRPPSDmDevInfoPerAntIdePeriodo();

        idePeriodo1.setPerRef( idePeriodo.getPerRef() );
        if ( idePeriodo1.getIdeEstab() != null ) {
            List<IdeEstab> list = ideEstabListToIdeEstabList1( idePeriodo.getIdeEstab() );
            if ( list != null ) {
                idePeriodo1.getIdeEstab().addAll( list );
            }
        }

        return idePeriodo1;
    }

    protected List<IdePeriodo> idePeriodoListToIdePeriodoList(List<br.jus.tst.esocial.dominio.beneficio.demonstrativovalores.IdePeriodo> list) {
        if ( list == null ) {
            return null;
        }

        List<IdePeriodo> list1 = new ArrayList<IdePeriodo>( list.size() );
        for ( br.jus.tst.esocial.dominio.beneficio.demonstrativovalores.IdePeriodo idePeriodo : list ) {
            list1.add( idePeriodoToIdePeriodo( idePeriodo ) );
        }

        return list1;
    }

    protected InfoPerAnt infoPerAntToInfoPerAnt(br.jus.tst.esocial.dominio.demonstrativovalores.InfoPerAnt infoPerAnt) {
        if ( infoPerAnt == null ) {
            return null;
        }

        InfoPerAnt infoPerAnt1 = objectFactory.createESocialEvtRmnRPPSDmDevInfoPerAnt();

        infoPerAnt1.setRemunOrgSuc( simNaoToTSSimNao( infoPerAnt.getRemunOrgSuc() ) );
        if ( infoPerAnt1.getIdePeriodo() != null ) {
            List<IdePeriodo> list = idePeriodoListToIdePeriodoList( infoPerAnt.getIdePeriodo() );
            if ( list != null ) {
                infoPerAnt1.getIdePeriodo().addAll( list );
            }
        }

        return infoPerAnt1;
    }

    protected DmDev dmDevToDmDev(br.jus.tst.esocial.dominio.demonstrativovalores.DmDev dmDev) {
        if ( dmDev == null ) {
            return null;
        }

        DmDev dmDev1 = objectFactory.createESocialEvtRmnRPPSDmDev();

        dmDev1.setIdeDmDev( dmDev.getIdeDmDev() );
        dmDev1.setCodCateg( dmDev.getCodCateg() );
        dmDev1.setInfoPerApur( infoPerApurToInfoPerApur( dmDev.getInfoPerApur() ) );
        dmDev1.setInfoPerAnt( infoPerAntToInfoPerAnt( dmDev.getInfoPerAnt() ) );

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
