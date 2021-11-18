package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.dominio.enums.SimNao;
import br.jus.tst.esocial.dominio.enums.UF;
import br.jus.tst.esocial.dominio.semvinculo.InfoEstagiario;
import br.jus.tst.esocial.dominio.semvinculo.alteracaocontratual.IdeTrabSemVinculo;
import br.jus.tst.esocial.dominio.vinculo.Remuneracao;
import br.jus.tst.esocial.esquemas.eventos.tsvaltcontr.ESocial.EvtTSVAltContr;
import br.jus.tst.esocial.esquemas.eventos.tsvaltcontr.ESocial.EvtTSVAltContr.InfoTSVAlteracao;
import br.jus.tst.esocial.esquemas.eventos.tsvaltcontr.ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares;
import br.jus.tst.esocial.esquemas.eventos.tsvaltcontr.ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.CargoFuncao;
import br.jus.tst.esocial.esquemas.eventos.tsvaltcontr.ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoDirigenteSindical;
import br.jus.tst.esocial.esquemas.eventos.tsvaltcontr.ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoMandElet;
import br.jus.tst.esocial.esquemas.eventos.tsvaltcontr.ESocial.EvtTSVAltContr.InfoTSVAlteracao.InfoComplementares.InfoTrabCedido;
import br.jus.tst.esocial.esquemas.eventos.tsvaltcontr.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.tsvaltcontr.TIdeEmpregador;
import br.jus.tst.esocial.esquemas.eventos.tsvaltcontr.TIdeTrabSemVinculo;
import br.jus.tst.esocial.esquemas.eventos.tsvaltcontr.TInfoEstagiario;
import br.jus.tst.esocial.esquemas.eventos.tsvaltcontr.TInfoEstagiario.AgeIntegracao;
import br.jus.tst.esocial.esquemas.eventos.tsvaltcontr.TInfoEstagiario.InstEnsino;
import br.jus.tst.esocial.esquemas.eventos.tsvaltcontr.TInfoEstagiario.SupervisorEstagio;
import br.jus.tst.esocial.esquemas.eventos.tsvaltcontr.TRemuneracao;
import br.jus.tst.esocial.esquemas.eventos.tsvaltcontr.TSSimNao;
import br.jus.tst.esocial.esquemas.eventos.tsvaltcontr.TSUf;
import br.jus.tst.esocial.ocorrencia.dados.TSVAltContr;
import java.math.BigInteger;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-17T04:03:10-0200",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class TSVAltContrMapperImpl extends TSVAltContrMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();
    private final XMLGregorianCalendarMapper xMLGregorianCalendarMapper = new XMLGregorianCalendarMapper();

    @Override
    public EvtTSVAltContr comoEvtTSVAltContr(TSVAltContr tsvInicio) {
        if ( tsvInicio == null ) {
            return null;
        }

        EvtTSVAltContr evtTSVAltContr = objectFactory.createESocialEvtTSVAltContr();

        evtTSVAltContr.setIdeEmpregador( ideEmpregadorToTIdeEmpregador( tsvInicio.getIdeEmpregador() ) );
        evtTSVAltContr.setIdeTrabSemVinculo( ideTrabSemVinculoToTIdeTrabSemVinculo( tsvInicio.getIdeTrabSemVinculo() ) );
        evtTSVAltContr.setInfoTSVAlteracao( infoTSVAlteracaoToInfoTSVAlteracao( tsvInicio.getInfoTSVAlteracao() ) );

        limparNulos( tsvInicio, evtTSVAltContr );

        return evtTSVAltContr;
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

    protected CargoFuncao cargoFuncaoToCargoFuncao(br.jus.tst.esocial.dominio.semvinculo.CargoFuncao cargoFuncao) {
        if ( cargoFuncao == null ) {
            return null;
        }

        CargoFuncao cargoFuncao1 = objectFactory.createESocialEvtTSVAltContrInfoTSVAlteracaoInfoComplementaresCargoFuncao();

        cargoFuncao1.setNmCargo( cargoFuncao.getNmCargo() );
        cargoFuncao1.setCBOCargo( cargoFuncao.getCBOCargo() );
        cargoFuncao1.setNmFuncao( cargoFuncao.getNmFuncao() );
        cargoFuncao1.setCBOFuncao( cargoFuncao.getCBOFuncao() );

        return cargoFuncao1;
    }

    protected TRemuneracao remuneracaoToTRemuneracao(Remuneracao remuneracao) {
        if ( remuneracao == null ) {
            return null;
        }

        TRemuneracao tRemuneracao = objectFactory.createTRemuneracao();

        tRemuneracao.setVrSalFx( remuneracao.getVrSalFx() );
        tRemuneracao.setUndSalFixo( remuneracao.getUndSalFixo() );
        tRemuneracao.setDscSalVar( remuneracao.getDscSalVar() );

        return tRemuneracao;
    }

    protected InfoDirigenteSindical infoDirigenteSindicalToInfoDirigenteSindical(br.jus.tst.esocial.dominio.semvinculo.InfoDirigenteSindical infoDirigenteSindical) {
        if ( infoDirigenteSindical == null ) {
            return null;
        }

        InfoDirigenteSindical infoDirigenteSindical1 = objectFactory.createESocialEvtTSVAltContrInfoTSVAlteracaoInfoComplementaresInfoDirigenteSindical();

        infoDirigenteSindical1.setTpRegPrev( infoDirigenteSindical.getTpRegPrev() );

        return infoDirigenteSindical1;
    }

    protected InfoTrabCedido infoTrabCedidoToInfoTrabCedido(br.jus.tst.esocial.dominio.semvinculo.InfoTrabCedido infoTrabCedido) {
        if ( infoTrabCedido == null ) {
            return null;
        }

        InfoTrabCedido infoTrabCedido1 = objectFactory.createESocialEvtTSVAltContrInfoTSVAlteracaoInfoComplementaresInfoTrabCedido();

        infoTrabCedido1.setTpRegPrev( infoTrabCedido.getTpRegPrev() );

        return infoTrabCedido1;
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

    protected InfoMandElet infoMandEletToInfoMandElet(br.jus.tst.esocial.dominio.semvinculo.InfoMandElet infoMandElet) {
        if ( infoMandElet == null ) {
            return null;
        }

        InfoMandElet infoMandElet1 = objectFactory.createESocialEvtTSVAltContrInfoTSVAlteracaoInfoComplementaresInfoMandElet();

        infoMandElet1.setIndRemunCargo( simNaoToTSSimNao( infoMandElet.getIndRemunCargo() ) );
        infoMandElet1.setTpRegPrev( infoMandElet.getTpRegPrev() );

        return infoMandElet1;
    }

    protected TSUf uFToTSUf(UF uF) {
        if ( uF == null ) {
            return null;
        }

        TSUf tSUf;

        switch ( uF ) {
            case AC: tSUf = TSUf.AC;
            break;
            case AL: tSUf = TSUf.AL;
            break;
            case AP: tSUf = TSUf.AP;
            break;
            case AM: tSUf = TSUf.AM;
            break;
            case BA: tSUf = TSUf.BA;
            break;
            case CE: tSUf = TSUf.CE;
            break;
            case DF: tSUf = TSUf.DF;
            break;
            case ES: tSUf = TSUf.ES;
            break;
            case GO: tSUf = TSUf.GO;
            break;
            case MA: tSUf = TSUf.MA;
            break;
            case MT: tSUf = TSUf.MT;
            break;
            case MS: tSUf = TSUf.MS;
            break;
            case MG: tSUf = TSUf.MG;
            break;
            case PA: tSUf = TSUf.PA;
            break;
            case PB: tSUf = TSUf.PB;
            break;
            case PR: tSUf = TSUf.PR;
            break;
            case PE: tSUf = TSUf.PE;
            break;
            case PI: tSUf = TSUf.PI;
            break;
            case RJ: tSUf = TSUf.RJ;
            break;
            case RN: tSUf = TSUf.RN;
            break;
            case RS: tSUf = TSUf.RS;
            break;
            case RO: tSUf = TSUf.RO;
            break;
            case RR: tSUf = TSUf.RR;
            break;
            case SC: tSUf = TSUf.SC;
            break;
            case SP: tSUf = TSUf.SP;
            break;
            case SE: tSUf = TSUf.SE;
            break;
            case TO: tSUf = TSUf.TO;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + uF );
        }

        return tSUf;
    }

    protected InstEnsino instEnsinoToInstEnsino(br.jus.tst.esocial.dominio.semvinculo.InstEnsino instEnsino) {
        if ( instEnsino == null ) {
            return null;
        }

        InstEnsino instEnsino1 = objectFactory.createTInfoEstagiarioInstEnsino();

        instEnsino1.setCnpjInstEnsino( instEnsino.getCnpjInstEnsino() );
        instEnsino1.setNmRazao( instEnsino.getNmRazao() );
        instEnsino1.setDscLograd( instEnsino.getDscLograd() );
        instEnsino1.setNrLograd( instEnsino.getNrLograd() );
        instEnsino1.setBairro( instEnsino.getBairro() );
        instEnsino1.setCep( instEnsino.getCep() );
        if ( instEnsino.getCodMunic() != null ) {
            instEnsino1.setCodMunic( BigInteger.valueOf( instEnsino.getCodMunic() ) );
        }
        instEnsino1.setUf( uFToTSUf( instEnsino.getUf() ) );

        return instEnsino1;
    }

    protected AgeIntegracao ageIntegracaoToAgeIntegracao(br.jus.tst.esocial.dominio.semvinculo.AgeIntegracao ageIntegracao) {
        if ( ageIntegracao == null ) {
            return null;
        }

        AgeIntegracao ageIntegracao1 = objectFactory.createTInfoEstagiarioAgeIntegracao();

        ageIntegracao1.setCnpjAgntInteg( ageIntegracao.getCnpjAgntInteg() );

        return ageIntegracao1;
    }

    protected SupervisorEstagio supervisorEstagioToSupervisorEstagio(br.jus.tst.esocial.dominio.semvinculo.SupervisorEstagio supervisorEstagio) {
        if ( supervisorEstagio == null ) {
            return null;
        }

        SupervisorEstagio supervisorEstagio1 = objectFactory.createTInfoEstagiarioSupervisorEstagio();

        supervisorEstagio1.setCpfSupervisor( supervisorEstagio.getCpfSupervisor() );

        return supervisorEstagio1;
    }

    protected TInfoEstagiario infoEstagiarioToTInfoEstagiario(InfoEstagiario infoEstagiario) {
        if ( infoEstagiario == null ) {
            return null;
        }

        TInfoEstagiario tInfoEstagiario = objectFactory.createTInfoEstagiario();

        tInfoEstagiario.setNatEstagio( infoEstagiario.getNatEstagio() );
        tInfoEstagiario.setNivEstagio( infoEstagiario.getNivEstagio() );
        tInfoEstagiario.setAreaAtuacao( infoEstagiario.getAreaAtuacao() );
        tInfoEstagiario.setNrApol( infoEstagiario.getNrApol() );
        tInfoEstagiario.setDtPrevTerm( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( infoEstagiario.getDtPrevTerm() ) );
        tInfoEstagiario.setInstEnsino( instEnsinoToInstEnsino( infoEstagiario.getInstEnsino() ) );
        tInfoEstagiario.setAgeIntegracao( ageIntegracaoToAgeIntegracao( infoEstagiario.getAgeIntegracao() ) );
        tInfoEstagiario.setSupervisorEstagio( supervisorEstagioToSupervisorEstagio( infoEstagiario.getSupervisorEstagio() ) );

        return tInfoEstagiario;
    }

    protected InfoComplementares infoComplementaresToInfoComplementares(br.jus.tst.esocial.dominio.semvinculo.InfoComplementares infoComplementares) {
        if ( infoComplementares == null ) {
            return null;
        }

        InfoComplementares infoComplementares1 = objectFactory.createESocialEvtTSVAltContrInfoTSVAlteracaoInfoComplementares();

        infoComplementares1.setCargoFuncao( cargoFuncaoToCargoFuncao( infoComplementares.getCargoFuncao() ) );
        infoComplementares1.setRemuneracao( remuneracaoToTRemuneracao( infoComplementares.getRemuneracao() ) );
        infoComplementares1.setInfoDirigenteSindical( infoDirigenteSindicalToInfoDirigenteSindical( infoComplementares.getInfoDirigenteSindical() ) );
        infoComplementares1.setInfoTrabCedido( infoTrabCedidoToInfoTrabCedido( infoComplementares.getInfoTrabCedido() ) );
        infoComplementares1.setInfoMandElet( infoMandEletToInfoMandElet( infoComplementares.getInfoMandElet() ) );
        infoComplementares1.setInfoEstagiario( infoEstagiarioToTInfoEstagiario( infoComplementares.getInfoEstagiario() ) );

        return infoComplementares1;
    }

    protected InfoTSVAlteracao infoTSVAlteracaoToInfoTSVAlteracao(br.jus.tst.esocial.dominio.semvinculo.alteracaocontratual.InfoTSVAlteracao infoTSVAlteracao) {
        if ( infoTSVAlteracao == null ) {
            return null;
        }

        InfoTSVAlteracao infoTSVAlteracao1 = objectFactory.createESocialEvtTSVAltContrInfoTSVAlteracao();

        infoTSVAlteracao1.setDtAlteracao( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( infoTSVAlteracao.getDtAlteracao() ) );
        infoTSVAlteracao1.setNatAtividade( infoTSVAlteracao.getNatAtividade() );
        infoTSVAlteracao1.setInfoComplementares( infoComplementaresToInfoComplementares( infoTSVAlteracao.getInfoComplementares() ) );

        return infoTSVAlteracao1;
    }
}
