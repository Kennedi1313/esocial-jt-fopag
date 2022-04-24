package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.dominio.reintegracao.InfoReintegr;
import br.jus.tst.esocial.dominio.vinculo.alteracaocontratual.IdeVinculo;
import br.jus.tst.esocial.esquemas.eventos.reintegr.ESocial.EvtReintegr;
import br.jus.tst.esocial.esquemas.eventos.reintegr.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.reintegr.TIdeEmpregador;
import br.jus.tst.esocial.esquemas.eventos.reintegr.TIdeVinculo;
import br.jus.tst.esocial.ocorrencia.dados.Reintegr;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-23T22:04:15-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class ReintegrMapperImpl extends ReintegrMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();
    private final XMLGregorianCalendarMapper xMLGregorianCalendarMapper = new XMLGregorianCalendarMapper();

    @Override
    public EvtReintegr comoEvtReintegr(Reintegr reintegr) {
        if ( reintegr == null ) {
            return null;
        }

        EvtReintegr evtReintegr = objectFactory.createESocialEvtReintegr();

        evtReintegr.setIdeEmpregador( ideEmpregadorToTIdeEmpregador( reintegr.getIdeEmpregador() ) );
        evtReintegr.setIdeVinculo( ideVinculoToTIdeVinculo( reintegr.getIdeVinculo() ) );
        evtReintegr.setInfoReintegr( infoReintegrToInfoReintegr( reintegr.getInfoReintegr() ) );

        limparNulos( evtReintegr );

        return evtReintegr;
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

    protected br.jus.tst.esocial.esquemas.eventos.reintegr.ESocial.EvtReintegr.InfoReintegr infoReintegrToInfoReintegr(InfoReintegr infoReintegr) {
        if ( infoReintegr == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.reintegr.ESocial.EvtReintegr.InfoReintegr infoReintegr1 = objectFactory.createESocialEvtReintegrInfoReintegr();

        infoReintegr1.setTpReint( infoReintegr.getTpReint() );
        infoReintegr1.setNrProcJud( infoReintegr.getNrProcJud() );
        infoReintegr1.setNrLeiAnistia( infoReintegr.getNrLeiAnistia() );
        infoReintegr1.setDtEfetRetorno( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( infoReintegr.getDtEfetRetorno() ) );
        infoReintegr1.setDtEfeito( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( infoReintegr.getDtEfeito() ) );

        return infoReintegr1;
    }
}
