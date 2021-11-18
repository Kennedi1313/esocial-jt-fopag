package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.esquemas.eventos.pgtos.ESocial.EvtPgtos;
import br.jus.tst.esocial.esquemas.eventos.pgtos.ESocial.EvtPgtos.IdeBenef;
import br.jus.tst.esocial.esquemas.eventos.pgtos.ESocial.EvtPgtos.IdeBenef.InfoPgto;
import br.jus.tst.esocial.esquemas.eventos.pgtos.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.pgtos.TIdeEmpregador;
import br.jus.tst.esocial.esquemas.eventos.pgtos.TIdeEventoFolhaMensal;
import br.jus.tst.esocial.ocorrencia.dados.Pgtos;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-17T04:03:14-0200",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class PgtosMapperImpl extends PgtosMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();
    private final XMLGregorianCalendarMapper xMLGregorianCalendarMapper = new XMLGregorianCalendarMapper();
    private final IdeEventoMapper ideEventoMapper = new IdeEventoMapper();

    @Override
    public EvtPgtos comoEvtPgtos(Pgtos pgtos) {
        if ( pgtos == null ) {
            return null;
        }

        EvtPgtos evtPgtos = objectFactory.createESocialEvtPgtos();

        evtPgtos.setIdeEvento( ideEventoMapper.mapearIdeEventoPagto( pgtos.getIdeEvento(), TIdeEventoFolhaMensal.class ) );
        evtPgtos.setIdeEmpregador( ideEmpregadorToTIdeEmpregador( pgtos.getIdeEmpregador() ) );
        evtPgtos.setIdeBenef( ideBenefToIdeBenef( pgtos.getIdeBenef() ) );

        limparNulos( evtPgtos );

        return evtPgtos;
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

    protected InfoPgto infoPgtoToInfoPgto(br.jus.tst.esocial.dominio.pagamento.InfoPgto infoPgto) {
        if ( infoPgto == null ) {
            return null;
        }

        InfoPgto infoPgto1 = objectFactory.createESocialEvtPgtosIdeBenefInfoPgto();

        infoPgto1.setDtPgto( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( infoPgto.getDtPgto() ) );
        if ( infoPgto.getTpPgto() != null ) {
            infoPgto1.setTpPgto( infoPgto.getTpPgto() );
        }
        infoPgto1.setPerRef( infoPgto.getPerRef() );
        infoPgto1.setIdeDmDev( infoPgto.getIdeDmDev() );
        infoPgto1.setVrLiq( infoPgto.getVrLiq() );

        return infoPgto1;
    }

    protected List<InfoPgto> infoPgtoListToInfoPgtoList(List<br.jus.tst.esocial.dominio.pagamento.InfoPgto> list) {
        if ( list == null ) {
            return null;
        }

        List<InfoPgto> list1 = new ArrayList<InfoPgto>( list.size() );
        for ( br.jus.tst.esocial.dominio.pagamento.InfoPgto infoPgto : list ) {
            list1.add( infoPgtoToInfoPgto( infoPgto ) );
        }

        return list1;
    }

    protected IdeBenef ideBenefToIdeBenef(br.jus.tst.esocial.dominio.pagamento.IdeBenef ideBenef) {
        if ( ideBenef == null ) {
            return null;
        }

        IdeBenef ideBenef1 = objectFactory.createESocialEvtPgtosIdeBenef();

        ideBenef1.setCpfBenef( ideBenef.getCpfBenef() );
        if ( ideBenef1.getInfoPgto() != null ) {
            List<InfoPgto> list = infoPgtoListToInfoPgtoList( ideBenef.getInfoPgto() );
            if ( list != null ) {
                ideBenef1.getInfoPgto().addAll( list );
            }
        }

        return ideBenef1;
    }
}
