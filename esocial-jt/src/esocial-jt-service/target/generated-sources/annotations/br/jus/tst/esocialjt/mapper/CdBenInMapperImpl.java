package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.dominio.beneficio.inicio.Beneficiario;
import br.jus.tst.esocial.dominio.beneficio.inicio.InstPenMorte;
import br.jus.tst.esocial.dominio.beneficio.inicio.MudancaCPF;
import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.dominio.enums.SimNao;
import br.jus.tst.esocial.esquemas.eventos.cdbenin.ESocial.EvtCdBenIn;
import br.jus.tst.esocial.esquemas.eventos.cdbenin.ESocial.EvtCdBenIn.InfoBenInicio;
import br.jus.tst.esocial.esquemas.eventos.cdbenin.ESocial.EvtCdBenIn.InfoBenInicio.DadosBeneficio;
import br.jus.tst.esocial.esquemas.eventos.cdbenin.ESocial.EvtCdBenIn.InfoBenInicio.DadosBeneficio.InfoPenMorte;
import br.jus.tst.esocial.esquemas.eventos.cdbenin.ESocial.EvtCdBenIn.InfoBenInicio.InfoBenTermino;
import br.jus.tst.esocial.esquemas.eventos.cdbenin.ESocial.EvtCdBenIn.InfoBenInicio.SucessaoBenef;
import br.jus.tst.esocial.esquemas.eventos.cdbenin.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.cdbenin.TIdeEmpregadorCnpj;
import br.jus.tst.esocial.esquemas.eventos.cdbenin.TSSimNao;
import br.jus.tst.esocial.ocorrencia.dados.CdBenIn;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-23T22:04:14-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class CdBenInMapperImpl extends CdBenInMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();
    private final XMLGregorianCalendarMapper xMLGregorianCalendarMapper = new XMLGregorianCalendarMapper();

    @Override
    public EvtCdBenIn comoEvtCdBenIn(CdBenIn cdBenIn) {
        if ( cdBenIn == null ) {
            return null;
        }

        EvtCdBenIn evtCdBenIn = objectFactory.createESocialEvtCdBenIn();

        evtCdBenIn.setIdeEmpregador( ideEmpregadorToTIdeEmpregadorCnpj( cdBenIn.getIdeEmpregador() ) );
        evtCdBenIn.setBeneficiario( beneficiarioToBeneficiario( cdBenIn.getBeneficiario() ) );
        evtCdBenIn.setInfoBenInicio( infoBenInicioToInfoBenInicio( cdBenIn.getInfoBenInicio() ) );

        return evtCdBenIn;
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

    protected br.jus.tst.esocial.esquemas.eventos.cdbenin.ESocial.EvtCdBenIn.Beneficiario beneficiarioToBeneficiario(Beneficiario beneficiario) {
        if ( beneficiario == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.cdbenin.ESocial.EvtCdBenIn.Beneficiario beneficiario1 = objectFactory.createESocialEvtCdBenInBeneficiario();

        beneficiario1.setCpfBenef( beneficiario.getCpfBenef() );
        beneficiario1.setMatricula( beneficiario.getMatricula() );
        beneficiario1.setCnpjOrigem( beneficiario.getCnpjOrigem() );

        return beneficiario1;
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

    protected br.jus.tst.esocial.esquemas.eventos.cdbenin.ESocial.EvtCdBenIn.InfoBenInicio.DadosBeneficio.InfoPenMorte.InstPenMorte instPenMorteToInstPenMorte(InstPenMorte instPenMorte) {
        if ( instPenMorte == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.cdbenin.ESocial.EvtCdBenIn.InfoBenInicio.DadosBeneficio.InfoPenMorte.InstPenMorte instPenMorte1 = objectFactory.createESocialEvtCdBenInInfoBenInicioDadosBeneficioInfoPenMorteInstPenMorte();

        instPenMorte1.setCpfInst( instPenMorte.getCpfInst() );
        instPenMorte1.setDtInst( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( instPenMorte.getDtInst() ) );

        return instPenMorte1;
    }

    protected InfoPenMorte infoPenMorteToInfoPenMorte(br.jus.tst.esocial.dominio.beneficio.inicio.InfoPenMorte infoPenMorte) {
        if ( infoPenMorte == null ) {
            return null;
        }

        InfoPenMorte infoPenMorte1 = objectFactory.createESocialEvtCdBenInInfoBenInicioDadosBeneficioInfoPenMorte();

        infoPenMorte1.setTpPenMorte( infoPenMorte.getTpPenMorte() );
        infoPenMorte1.setInstPenMorte( instPenMorteToInstPenMorte( infoPenMorte.getInstPenMorte() ) );

        return infoPenMorte1;
    }

    protected DadosBeneficio dadosBeneficioToDadosBeneficio(br.jus.tst.esocial.dominio.beneficio.inicio.DadosBeneficio dadosBeneficio) {
        if ( dadosBeneficio == null ) {
            return null;
        }

        DadosBeneficio dadosBeneficio1 = objectFactory.createESocialEvtCdBenInInfoBenInicioDadosBeneficio();

        dadosBeneficio1.setTpBeneficio( dadosBeneficio.getTpBeneficio() );
        dadosBeneficio1.setTpPlanRP( dadosBeneficio.getTpPlanRP() );
        dadosBeneficio1.setDsc( dadosBeneficio.getDsc() );
        dadosBeneficio1.setIndDecJud( simNaoToTSSimNao( dadosBeneficio.getIndDecJud() ) );
        dadosBeneficio1.setInfoPenMorte( infoPenMorteToInfoPenMorte( dadosBeneficio.getInfoPenMorte() ) );

        return dadosBeneficio1;
    }

    protected SucessaoBenef sucessaoBenefToSucessaoBenef(br.jus.tst.esocial.dominio.beneficio.inicio.SucessaoBenef sucessaoBenef) {
        if ( sucessaoBenef == null ) {
            return null;
        }

        SucessaoBenef sucessaoBenef1 = objectFactory.createESocialEvtCdBenInInfoBenInicioSucessaoBenef();

        sucessaoBenef1.setCnpjOrgaoAnt( sucessaoBenef.getCnpjOrgaoAnt() );
        sucessaoBenef1.setNrBeneficioAnt( sucessaoBenef.getNrBeneficioAnt() );
        sucessaoBenef1.setDtTransf( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( sucessaoBenef.getDtTransf() ) );
        sucessaoBenef1.setObservacao( sucessaoBenef.getObservacao() );

        return sucessaoBenef1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.cdbenin.ESocial.EvtCdBenIn.InfoBenInicio.MudancaCPF mudancaCPFToMudancaCPF(MudancaCPF mudancaCPF) {
        if ( mudancaCPF == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.cdbenin.ESocial.EvtCdBenIn.InfoBenInicio.MudancaCPF mudancaCPF1 = objectFactory.createESocialEvtCdBenInInfoBenInicioMudancaCPF();

        mudancaCPF1.setCpfAnt( mudancaCPF.getCpfAnt() );
        mudancaCPF1.setNrBeneficioAnt( mudancaCPF.getNrBeneficioAnt() );
        mudancaCPF1.setDtAltCPF( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( mudancaCPF.getDtAltCPF() ) );
        mudancaCPF1.setObservacao( mudancaCPF.getObservacao() );

        return mudancaCPF1;
    }

    protected InfoBenTermino infoBenTerminoToInfoBenTermino(br.jus.tst.esocial.dominio.beneficio.inicio.InfoBenTermino infoBenTermino) {
        if ( infoBenTermino == null ) {
            return null;
        }

        InfoBenTermino infoBenTermino1 = objectFactory.createESocialEvtCdBenInInfoBenInicioInfoBenTermino();

        infoBenTermino1.setDtTermBeneficio( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( infoBenTermino.getDtTermBeneficio() ) );
        infoBenTermino1.setMtvTermino( infoBenTermino.getMtvTermino() );

        return infoBenTermino1;
    }

    protected InfoBenInicio infoBenInicioToInfoBenInicio(br.jus.tst.esocial.dominio.beneficio.inicio.InfoBenInicio infoBenInicio) {
        if ( infoBenInicio == null ) {
            return null;
        }

        InfoBenInicio infoBenInicio1 = objectFactory.createESocialEvtCdBenInInfoBenInicio();

        infoBenInicio1.setCadIni( simNaoToTSSimNao( infoBenInicio.getCadIni() ) );
        infoBenInicio1.setIndSitBenef( infoBenInicio.getIndSitBenef() );
        infoBenInicio1.setNrBeneficio( infoBenInicio.getNrBeneficio() );
        infoBenInicio1.setDtIniBeneficio( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( infoBenInicio.getDtIniBeneficio() ) );
        infoBenInicio1.setDtPublic( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( infoBenInicio.getDtPublic() ) );
        infoBenInicio1.setDadosBeneficio( dadosBeneficioToDadosBeneficio( infoBenInicio.getDadosBeneficio() ) );
        infoBenInicio1.setSucessaoBenef( sucessaoBenefToSucessaoBenef( infoBenInicio.getSucessaoBenef() ) );
        infoBenInicio1.setMudancaCPF( mudancaCPFToMudancaCPF( infoBenInicio.getMudancaCPF() ) );
        infoBenInicio1.setInfoBenTermino( infoBenTerminoToInfoBenTermino( infoBenInicio.getInfoBenTermino() ) );

        return infoBenInicio1;
    }
}
