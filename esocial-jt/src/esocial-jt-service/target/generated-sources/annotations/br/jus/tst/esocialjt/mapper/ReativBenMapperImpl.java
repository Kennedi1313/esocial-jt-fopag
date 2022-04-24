package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.dominio.beneficio.IdeBeneficio;
import br.jus.tst.esocial.dominio.beneficio.reativacao.InfoReativ;
import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.esquemas.eventos.reativben.ESocial.EvtReativBen;
import br.jus.tst.esocial.esquemas.eventos.reativben.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.reativben.TIdeBeneficio;
import br.jus.tst.esocial.esquemas.eventos.reativben.TIdeEmpregadorCnpj;
import br.jus.tst.esocial.ocorrencia.dados.ReativBen;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-23T22:04:14-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class ReativBenMapperImpl extends ReativBenMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();
    private final XMLGregorianCalendarMapper xMLGregorianCalendarMapper = new XMLGregorianCalendarMapper();

    @Override
    public EvtReativBen comoEvtReativBen(ReativBen reativBen) {
        if ( reativBen == null ) {
            return null;
        }

        EvtReativBen evtReativBen = objectFactory.createESocialEvtReativBen();

        evtReativBen.setIdeEmpregador( ideEmpregadorToTIdeEmpregadorCnpj( reativBen.getIdeEmpregador() ) );
        evtReativBen.setIdeBeneficio( ideBeneficioToTIdeBeneficio( reativBen.getIdeBeneficio() ) );
        evtReativBen.setInfoReativ( infoReativToInfoReativ( reativBen.getInfoReativ() ) );

        return evtReativBen;
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

    protected TIdeBeneficio ideBeneficioToTIdeBeneficio(IdeBeneficio ideBeneficio) {
        if ( ideBeneficio == null ) {
            return null;
        }

        TIdeBeneficio tIdeBeneficio = objectFactory.createTIdeBeneficio();

        tIdeBeneficio.setCpfBenef( ideBeneficio.getCpfBenef() );
        tIdeBeneficio.setNrBeneficio( ideBeneficio.getNrBeneficio() );

        return tIdeBeneficio;
    }

    protected br.jus.tst.esocial.esquemas.eventos.reativben.ESocial.EvtReativBen.InfoReativ infoReativToInfoReativ(InfoReativ infoReativ) {
        if ( infoReativ == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.reativben.ESocial.EvtReativBen.InfoReativ infoReativ1 = objectFactory.createESocialEvtReativBenInfoReativ();

        infoReativ1.setDtEfetReativ( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( infoReativ.getDtEfetReativ() ) );
        infoReativ1.setDtEfeito( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( infoReativ.getDtEfeito() ) );

        return infoReativ1;
    }
}
