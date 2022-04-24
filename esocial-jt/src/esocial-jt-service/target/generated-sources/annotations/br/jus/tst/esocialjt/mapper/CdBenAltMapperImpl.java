package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.dominio.beneficio.IdeBeneficio;
import br.jus.tst.esocial.dominio.beneficio.alteracao.DadosBeneficio;
import br.jus.tst.esocial.dominio.beneficio.alteracao.InfoBenAlteracao;
import br.jus.tst.esocial.dominio.beneficio.alteracao.InfoPenMorte;
import br.jus.tst.esocial.dominio.beneficio.alteracao.Suspensao;
import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.dominio.enums.SimNao;
import br.jus.tst.esocial.esquemas.eventos.cdbenalt.ESocial.EvtCdBenAlt;
import br.jus.tst.esocial.esquemas.eventos.cdbenalt.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.cdbenalt.TIdeBeneficio;
import br.jus.tst.esocial.esquemas.eventos.cdbenalt.TIdeEmpregadorCnpj;
import br.jus.tst.esocial.esquemas.eventos.cdbenalt.TSSimNao;
import br.jus.tst.esocial.ocorrencia.dados.CdBenAlt;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-23T22:04:15-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class CdBenAltMapperImpl extends CdBenAltMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();
    private final XMLGregorianCalendarMapper xMLGregorianCalendarMapper = new XMLGregorianCalendarMapper();

    @Override
    public EvtCdBenAlt comoEvtCdBenAlt(CdBenAlt cdBenAlt) {
        if ( cdBenAlt == null ) {
            return null;
        }

        EvtCdBenAlt evtCdBenAlt = objectFactory.createESocialEvtCdBenAlt();

        evtCdBenAlt.setIdeEmpregador( ideEmpregadorToTIdeEmpregadorCnpj( cdBenAlt.getIdeEmpregador() ) );
        evtCdBenAlt.setIdeBeneficio( ideBeneficioToTIdeBeneficio( cdBenAlt.getIdeBeneficio() ) );
        evtCdBenAlt.setInfoBenAlteracao( infoBenAlteracaoToInfoBenAlteracao( cdBenAlt.getInfoBenAlteracao() ) );

        return evtCdBenAlt;
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

    protected br.jus.tst.esocial.esquemas.eventos.cdbenalt.ESocial.EvtCdBenAlt.InfoBenAlteracao.DadosBeneficio.InfoPenMorte infoPenMorteToInfoPenMorte(InfoPenMorte infoPenMorte) {
        if ( infoPenMorte == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.cdbenalt.ESocial.EvtCdBenAlt.InfoBenAlteracao.DadosBeneficio.InfoPenMorte infoPenMorte1 = objectFactory.createESocialEvtCdBenAltInfoBenAlteracaoDadosBeneficioInfoPenMorte();

        infoPenMorte1.setTpPenMorte( infoPenMorte.getTpPenMorte() );

        return infoPenMorte1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.cdbenalt.ESocial.EvtCdBenAlt.InfoBenAlteracao.DadosBeneficio.Suspensao suspensaoToSuspensao(Suspensao suspensao) {
        if ( suspensao == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.cdbenalt.ESocial.EvtCdBenAlt.InfoBenAlteracao.DadosBeneficio.Suspensao suspensao1 = objectFactory.createESocialEvtCdBenAltInfoBenAlteracaoDadosBeneficioSuspensao();

        suspensao1.setMtvSuspensao( suspensao.getMtvSuspensao() );
        suspensao1.setDscSuspensao( suspensao.getDscSuspensao() );

        return suspensao1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.cdbenalt.ESocial.EvtCdBenAlt.InfoBenAlteracao.DadosBeneficio dadosBeneficioToDadosBeneficio(DadosBeneficio dadosBeneficio) {
        if ( dadosBeneficio == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.cdbenalt.ESocial.EvtCdBenAlt.InfoBenAlteracao.DadosBeneficio dadosBeneficio1 = objectFactory.createESocialEvtCdBenAltInfoBenAlteracaoDadosBeneficio();

        dadosBeneficio1.setTpBeneficio( dadosBeneficio.getTpBeneficio() );
        dadosBeneficio1.setTpPlanRP( dadosBeneficio.getTpPlanRP() );
        dadosBeneficio1.setDsc( dadosBeneficio.getDsc() );
        dadosBeneficio1.setIndSuspensao( simNaoToTSSimNao( dadosBeneficio.getIndSuspensao() ) );
        dadosBeneficio1.setInfoPenMorte( infoPenMorteToInfoPenMorte( dadosBeneficio.getInfoPenMorte() ) );
        dadosBeneficio1.setSuspensao( suspensaoToSuspensao( dadosBeneficio.getSuspensao() ) );

        return dadosBeneficio1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.cdbenalt.ESocial.EvtCdBenAlt.InfoBenAlteracao infoBenAlteracaoToInfoBenAlteracao(InfoBenAlteracao infoBenAlteracao) {
        if ( infoBenAlteracao == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.cdbenalt.ESocial.EvtCdBenAlt.InfoBenAlteracao infoBenAlteracao1 = objectFactory.createESocialEvtCdBenAltInfoBenAlteracao();

        infoBenAlteracao1.setDtAltBeneficio( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( infoBenAlteracao.getDtAltBeneficio() ) );
        infoBenAlteracao1.setDadosBeneficio( dadosBeneficioToDadosBeneficio( infoBenAlteracao.getDadosBeneficio() ) );

        return infoBenAlteracao1;
    }
}
