package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.dominio.beneficio.IdeBeneficio;
import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.esquemas.eventos.cdbenterm.ESocial.EvtCdBenTerm;
import br.jus.tst.esocial.esquemas.eventos.cdbenterm.ESocial.EvtCdBenTerm.InfoBenTermino;
import br.jus.tst.esocial.esquemas.eventos.cdbenterm.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.cdbenterm.TIdeBeneficio;
import br.jus.tst.esocial.esquemas.eventos.cdbenterm.TIdeEmpregadorCnpj;
import br.jus.tst.esocial.ocorrencia.dados.CdBenTerm;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-23T22:04:15-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class CdBenTermMapperImpl extends CdBenTermMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();
    private final XMLGregorianCalendarMapper xMLGregorianCalendarMapper = new XMLGregorianCalendarMapper();

    @Override
    public EvtCdBenTerm comoEvtCdBenTerm(CdBenTerm cdBenTerm) {
        if ( cdBenTerm == null ) {
            return null;
        }

        EvtCdBenTerm evtCdBenTerm = objectFactory.createESocialEvtCdBenTerm();

        evtCdBenTerm.setIdeEmpregador( ideEmpregadorToTIdeEmpregadorCnpj( cdBenTerm.getIdeEmpregador() ) );
        evtCdBenTerm.setIdeBeneficio( ideBeneficioToTIdeBeneficio( cdBenTerm.getIdeBeneficio() ) );
        evtCdBenTerm.setInfoBenTermino( infoBenTerminoToInfoBenTermino( cdBenTerm.getInfoBenTermino() ) );

        return evtCdBenTerm;
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

    protected InfoBenTermino infoBenTerminoToInfoBenTermino(br.jus.tst.esocial.dominio.beneficio.termino.InfoBenTermino infoBenTermino) {
        if ( infoBenTermino == null ) {
            return null;
        }

        InfoBenTermino infoBenTermino1 = objectFactory.createESocialEvtCdBenTermInfoBenTermino();

        infoBenTermino1.setDtTermBeneficio( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( infoBenTermino.getDtTermBeneficio() ) );
        infoBenTermino1.setMtvTermino( infoBenTermino.getMtvTermino() );
        infoBenTermino1.setCnpjOrgaoSuc( infoBenTermino.getCnpjOrgaoSuc() );
        infoBenTermino1.setNovoCPF( infoBenTermino.getNovoCPF() );

        return infoBenTermino1;
    }
}
