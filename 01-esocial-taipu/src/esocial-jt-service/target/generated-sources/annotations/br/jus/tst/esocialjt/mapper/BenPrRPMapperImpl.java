package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.dominio.beneficio.demonstrativovalores.IdeEstab;
import br.jus.tst.esocial.dominio.beneficio.demonstrativovalores.ItemRemun;
import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.esquemas.eventos.benprrp.ESocial.EvtBenPrRP;
import br.jus.tst.esocial.esquemas.eventos.benprrp.ESocial.EvtBenPrRP.DmDev;
import br.jus.tst.esocial.esquemas.eventos.benprrp.ESocial.EvtBenPrRP.DmDev.InfoPerAnt;
import br.jus.tst.esocial.esquemas.eventos.benprrp.ESocial.EvtBenPrRP.DmDev.InfoPerAnt.IdePeriodo;
import br.jus.tst.esocial.esquemas.eventos.benprrp.ESocial.EvtBenPrRP.DmDev.InfoPerApur;
import br.jus.tst.esocial.esquemas.eventos.benprrp.ESocial.EvtBenPrRP.IdeBenef;
import br.jus.tst.esocial.esquemas.eventos.benprrp.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.benprrp.TIdeEmpregadorCnpj;
import br.jus.tst.esocial.esquemas.eventos.benprrp.TIdeEstab;
import br.jus.tst.esocial.esquemas.eventos.benprrp.TIdeEventoFolhaOpp;
import br.jus.tst.esocial.esquemas.eventos.benprrp.TItensRemunRpps;
import br.jus.tst.esocial.ocorrencia.dados.BenPrRP;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-17T04:03:12-0200",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class BenPrRPMapperImpl extends BenPrRPMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();
    private final IdeEventoMapper ideEventoMapper = new IdeEventoMapper();

    @Override
    public EvtBenPrRP comoEvtBenPrRP(BenPrRP benPrRP) {
        if ( benPrRP == null ) {
            return null;
        }

        EvtBenPrRP evtBenPrRP = objectFactory.createESocialEvtBenPrRP();

        evtBenPrRP.setIdeEvento( ideEventoMapper.mapearIdeEventoPagto( benPrRP.getIdeEvento(), TIdeEventoFolhaOpp.class ) );
        evtBenPrRP.setIdeEmpregador( ideEmpregadorToTIdeEmpregadorCnpj( benPrRP.getIdeEmpregador() ) );
        evtBenPrRP.setIdeBenef( ideBenefToIdeBenef( benPrRP.getIdeBenef() ) );
        if ( evtBenPrRP.getDmDev() != null ) {
            List<DmDev> list = dmDevListToDmDevList( benPrRP.getDmDev() );
            if ( list != null ) {
                evtBenPrRP.getDmDev().addAll( list );
            }
        }

        limparNulos( benPrRP, evtBenPrRP );

        return evtBenPrRP;
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

    protected IdeBenef ideBenefToIdeBenef(br.jus.tst.esocial.dominio.beneficiario.IdeBenef ideBenef) {
        if ( ideBenef == null ) {
            return null;
        }

        IdeBenef ideBenef1 = objectFactory.createESocialEvtBenPrRPIdeBenef();

        ideBenef1.setCpfBenef( ideBenef.getCpfBenef() );

        return ideBenef1;
    }

    protected TItensRemunRpps itemRemunToTItensRemunRpps(ItemRemun itemRemun) {
        if ( itemRemun == null ) {
            return null;
        }

        TItensRemunRpps tItensRemunRpps = objectFactory.createTItensRemunRpps();

        tItensRemunRpps.setCodRubr( itemRemun.getCodRubr() );
        tItensRemunRpps.setIdeTabRubr( itemRemun.getIdeTabRubr() );
        tItensRemunRpps.setQtdRubr( itemRemun.getQtdRubr() );
        tItensRemunRpps.setFatorRubr( itemRemun.getFatorRubr() );
        tItensRemunRpps.setVrRubr( itemRemun.getVrRubr() );
        tItensRemunRpps.setIndApurIR( itemRemun.getIndApurIR() );

        return tItensRemunRpps;
    }

    protected List<TItensRemunRpps> itemRemunListToTItensRemunRppsList(List<ItemRemun> list) {
        if ( list == null ) {
            return null;
        }

        List<TItensRemunRpps> list1 = new ArrayList<TItensRemunRpps>( list.size() );
        for ( ItemRemun itemRemun : list ) {
            list1.add( itemRemunToTItensRemunRpps( itemRemun ) );
        }

        return list1;
    }

    protected TIdeEstab ideEstabToTIdeEstab(IdeEstab ideEstab) {
        if ( ideEstab == null ) {
            return null;
        }

        TIdeEstab tIdeEstab = objectFactory.createTIdeEstab();

        tIdeEstab.setTpInsc( ideEstab.getTpInsc() );
        tIdeEstab.setNrInsc( ideEstab.getNrInsc() );
        if ( tIdeEstab.getItensRemun() != null ) {
            List<TItensRemunRpps> list = itemRemunListToTItensRemunRppsList( ideEstab.getItensRemun() );
            if ( list != null ) {
                tIdeEstab.getItensRemun().addAll( list );
            }
        }

        return tIdeEstab;
    }

    protected List<TIdeEstab> ideEstabListToTIdeEstabList(List<IdeEstab> list) {
        if ( list == null ) {
            return null;
        }

        List<TIdeEstab> list1 = new ArrayList<TIdeEstab>( list.size() );
        for ( IdeEstab ideEstab : list ) {
            list1.add( ideEstabToTIdeEstab( ideEstab ) );
        }

        return list1;
    }

    protected InfoPerApur infoPerApurToInfoPerApur(br.jus.tst.esocial.dominio.beneficio.demonstrativovalores.InfoPerApur infoPerApur) {
        if ( infoPerApur == null ) {
            return null;
        }

        InfoPerApur infoPerApur1 = objectFactory.createESocialEvtBenPrRPDmDevInfoPerApur();

        if ( infoPerApur1.getIdeEstab() != null ) {
            List<TIdeEstab> list = ideEstabListToTIdeEstabList( infoPerApur.getIdeEstab() );
            if ( list != null ) {
                infoPerApur1.getIdeEstab().addAll( list );
            }
        }

        return infoPerApur1;
    }

    protected IdePeriodo idePeriodoToIdePeriodo(br.jus.tst.esocial.dominio.beneficio.demonstrativovalores.IdePeriodo idePeriodo) {
        if ( idePeriodo == null ) {
            return null;
        }

        IdePeriodo idePeriodo1 = objectFactory.createESocialEvtBenPrRPDmDevInfoPerAntIdePeriodo();

        idePeriodo1.setPerRef( idePeriodo.getPerRef() );
        if ( idePeriodo1.getIdeEstab() != null ) {
            List<TIdeEstab> list = ideEstabListToTIdeEstabList( idePeriodo.getIdeEstab() );
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

    protected InfoPerAnt infoPerAntToInfoPerAnt(br.jus.tst.esocial.dominio.beneficio.demonstrativovalores.InfoPerAnt infoPerAnt) {
        if ( infoPerAnt == null ) {
            return null;
        }

        InfoPerAnt infoPerAnt1 = objectFactory.createESocialEvtBenPrRPDmDevInfoPerAnt();

        if ( infoPerAnt1.getIdePeriodo() != null ) {
            List<IdePeriodo> list = idePeriodoListToIdePeriodoList( infoPerAnt.getIdePeriodo() );
            if ( list != null ) {
                infoPerAnt1.getIdePeriodo().addAll( list );
            }
        }

        return infoPerAnt1;
    }

    protected DmDev dmDevToDmDev(br.jus.tst.esocial.dominio.beneficio.demonstrativovalores.DmDev dmDev) {
        if ( dmDev == null ) {
            return null;
        }

        DmDev dmDev1 = objectFactory.createESocialEvtBenPrRPDmDev();

        dmDev1.setIdeDmDev( dmDev.getIdeDmDev() );
        dmDev1.setNrBeneficio( dmDev.getNrBeneficio() );
        dmDev1.setInfoPerApur( infoPerApurToInfoPerApur( dmDev.getInfoPerApur() ) );
        dmDev1.setInfoPerAnt( infoPerAntToInfoPerAnt( dmDev.getInfoPerAnt() ) );

        return dmDev1;
    }

    protected List<DmDev> dmDevListToDmDevList(List<br.jus.tst.esocial.dominio.beneficio.demonstrativovalores.DmDev> list) {
        if ( list == null ) {
            return null;
        }

        List<DmDev> list1 = new ArrayList<DmDev>( list.size() );
        for ( br.jus.tst.esocial.dominio.beneficio.demonstrativovalores.DmDev dmDev : list ) {
            list1.add( dmDevToDmDev( dmDev ) );
        }

        return list1;
    }
}
