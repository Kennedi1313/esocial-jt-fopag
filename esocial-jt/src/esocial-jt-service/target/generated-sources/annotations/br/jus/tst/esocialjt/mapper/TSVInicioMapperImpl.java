package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.dominio.endereco.Endereco;
import br.jus.tst.esocial.dominio.endereco.EnderecoBrasil;
import br.jus.tst.esocial.dominio.endereco.EnderecoExterior;
import br.jus.tst.esocial.dominio.enums.Sexo;
import br.jus.tst.esocial.dominio.enums.SimNao;
import br.jus.tst.esocial.dominio.enums.UF;
import br.jus.tst.esocial.dominio.nascimento.Nascimento;
import br.jus.tst.esocial.dominio.semvinculo.AgeIntegracao;
import br.jus.tst.esocial.dominio.semvinculo.FGTS;
import br.jus.tst.esocial.dominio.semvinculo.InfoEstagiario;
import br.jus.tst.esocial.dominio.semvinculo.InfoMandElet;
import br.jus.tst.esocial.dominio.semvinculo.InfoTSVInicio;
import br.jus.tst.esocial.dominio.semvinculo.InstEnsino;
import br.jus.tst.esocial.dominio.semvinculo.MudancaCPF;
import br.jus.tst.esocial.dominio.semvinculo.Termino;
import br.jus.tst.esocial.dominio.trabalhador.Contato;
import br.jus.tst.esocial.dominio.trabalhador.Dependente;
import br.jus.tst.esocial.dominio.trabalhador.InfoDeficiencia;
import br.jus.tst.esocial.dominio.trabalhador.TrabImig;
import br.jus.tst.esocial.dominio.trabalhador.Trabalhador;
import br.jus.tst.esocial.dominio.vinculo.Afastamento;
import br.jus.tst.esocial.dominio.vinculo.Remuneracao;
import br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio;
import br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares;
import br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.CargoFuncao;
import br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoDirigenteSindical;
import br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoTrabCedido;
import br.jus.tst.esocial.esquemas.eventos.tsvinicio.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.tsvinicio.TContato;
import br.jus.tst.esocial.esquemas.eventos.tsvinicio.TEnderecoBrasil;
import br.jus.tst.esocial.esquemas.eventos.tsvinicio.TEnderecoExterior;
import br.jus.tst.esocial.esquemas.eventos.tsvinicio.TIdeEmpregador;
import br.jus.tst.esocial.esquemas.eventos.tsvinicio.TInfoEstagiario;
import br.jus.tst.esocial.esquemas.eventos.tsvinicio.TInfoEstagiario.SupervisorEstagio;
import br.jus.tst.esocial.esquemas.eventos.tsvinicio.TNascimento;
import br.jus.tst.esocial.esquemas.eventos.tsvinicio.TRemuneracao;
import br.jus.tst.esocial.esquemas.eventos.tsvinicio.TSSexo;
import br.jus.tst.esocial.esquemas.eventos.tsvinicio.TSSimNao;
import br.jus.tst.esocial.esquemas.eventos.tsvinicio.TSUf;
import br.jus.tst.esocial.ocorrencia.dados.TSVInicio;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-23T22:04:14-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class TSVInicioMapperImpl extends TSVInicioMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();
    private final XMLGregorianCalendarMapper xMLGregorianCalendarMapper = new XMLGregorianCalendarMapper();

    @Override
    public EvtTSVInicio comoEvtTSVInicio(TSVInicio tsvInicio) {
        if ( tsvInicio == null ) {
            return null;
        }

        EvtTSVInicio evtTSVInicio = objectFactory.createESocialEvtTSVInicio();

        evtTSVInicio.setIdeEmpregador( ideEmpregadorToTIdeEmpregador( tsvInicio.getIdeEmpregador() ) );
        evtTSVInicio.setTrabalhador( trabalhadorToTrabalhador( tsvInicio.getTrabalhador() ) );
        evtTSVInicio.setInfoTSVInicio( infoTSVInicioToInfoTSVInicio( tsvInicio.getInfoTSVInicio() ) );

        limparNulos( tsvInicio, evtTSVInicio );

        return evtTSVInicio;
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

    protected TSSexo sexoToTSSexo(Sexo sexo) {
        if ( sexo == null ) {
            return null;
        }

        TSSexo tSSexo;

        switch ( sexo ) {
            case M: tSSexo = TSSexo.M;
            break;
            case F: tSSexo = TSSexo.F;
            break;
            default: throw new IllegalArgumentException( "Unexpected enum constant: " + sexo );
        }

        return tSSexo;
    }

    protected TNascimento nascimentoToTNascimento(Nascimento nascimento) {
        if ( nascimento == null ) {
            return null;
        }

        TNascimento tNascimento = objectFactory.createTNascimento();

        tNascimento.setDtNascto( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( nascimento.getDtNascto() ) );
        tNascimento.setPaisNascto( nascimento.getPaisNascto() );
        tNascimento.setPaisNac( nascimento.getPaisNac() );

        return tNascimento;
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

    protected TEnderecoBrasil enderecoBrasilToTEnderecoBrasil(EnderecoBrasil enderecoBrasil) {
        if ( enderecoBrasil == null ) {
            return null;
        }

        TEnderecoBrasil tEnderecoBrasil = objectFactory.createTEnderecoBrasil();

        tEnderecoBrasil.setTpLograd( enderecoBrasil.getTpLograd() );
        tEnderecoBrasil.setDscLograd( enderecoBrasil.getDscLograd() );
        tEnderecoBrasil.setNrLograd( enderecoBrasil.getNrLograd() );
        tEnderecoBrasil.setComplemento( enderecoBrasil.getComplemento() );
        tEnderecoBrasil.setBairro( enderecoBrasil.getBairro() );
        tEnderecoBrasil.setCep( enderecoBrasil.getCep() );
        if ( enderecoBrasil.getCodMunic() != null ) {
            tEnderecoBrasil.setCodMunic( BigInteger.valueOf( enderecoBrasil.getCodMunic() ) );
        }
        tEnderecoBrasil.setUf( uFToTSUf( enderecoBrasil.getUf() ) );

        return tEnderecoBrasil;
    }

    protected TEnderecoExterior enderecoExteriorToTEnderecoExterior(EnderecoExterior enderecoExterior) {
        if ( enderecoExterior == null ) {
            return null;
        }

        TEnderecoExterior tEnderecoExterior = objectFactory.createTEnderecoExterior();

        tEnderecoExterior.setPaisResid( enderecoExterior.getPaisResid() );
        tEnderecoExterior.setDscLograd( enderecoExterior.getDscLograd() );
        tEnderecoExterior.setNrLograd( enderecoExterior.getNrLograd() );
        tEnderecoExterior.setComplemento( enderecoExterior.getComplemento() );
        tEnderecoExterior.setBairro( enderecoExterior.getBairro() );
        tEnderecoExterior.setNmCid( enderecoExterior.getNmCid() );
        tEnderecoExterior.setCodPostal( enderecoExterior.getCodPostal() );

        return tEnderecoExterior;
    }

    protected br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.Trabalhador.Endereco enderecoToEndereco(Endereco endereco) {
        if ( endereco == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.Trabalhador.Endereco endereco1 = objectFactory.createESocialEvtTSVInicioTrabalhadorEndereco();

        endereco1.setBrasil( enderecoBrasilToTEnderecoBrasil( endereco.getBrasil() ) );
        endereco1.setExterior( enderecoExteriorToTEnderecoExterior( endereco.getExterior() ) );

        return endereco1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.Trabalhador.TrabImig trabImigToTrabImig(TrabImig trabImig) {
        if ( trabImig == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.Trabalhador.TrabImig trabImig1 = objectFactory.createESocialEvtTSVInicioTrabalhadorTrabImig();

        trabImig1.setTmpResid( trabImig.getTmpResid() );
        trabImig1.setCondIng( trabImig.getCondIng() );

        return trabImig1;
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

    protected br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.Trabalhador.InfoDeficiencia infoDeficienciaToInfoDeficiencia(InfoDeficiencia infoDeficiencia) {
        if ( infoDeficiencia == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.Trabalhador.InfoDeficiencia infoDeficiencia1 = objectFactory.createESocialEvtTSVInicioTrabalhadorInfoDeficiencia();

        infoDeficiencia1.setDefFisica( simNaoToTSSimNao( infoDeficiencia.getDefFisica() ) );
        infoDeficiencia1.setDefVisual( simNaoToTSSimNao( infoDeficiencia.getDefVisual() ) );
        infoDeficiencia1.setDefAuditiva( simNaoToTSSimNao( infoDeficiencia.getDefAuditiva() ) );
        infoDeficiencia1.setDefMental( simNaoToTSSimNao( infoDeficiencia.getDefMental() ) );
        infoDeficiencia1.setDefIntelectual( simNaoToTSSimNao( infoDeficiencia.getDefIntelectual() ) );
        infoDeficiencia1.setReabReadap( simNaoToTSSimNao( infoDeficiencia.getReabReadap() ) );
        infoDeficiencia1.setObservacao( infoDeficiencia.getObservacao() );

        return infoDeficiencia1;
    }

    protected TContato contatoToTContato(Contato contato) {
        if ( contato == null ) {
            return null;
        }

        TContato tContato = objectFactory.createTContato();

        tContato.setFonePrinc( contato.getFonePrinc() );
        tContato.setEmailPrinc( contato.getEmailPrinc() );

        return tContato;
    }

    protected br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.Trabalhador.Dependente dependenteToDependente(Dependente dependente) {
        if ( dependente == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.Trabalhador.Dependente dependente1 = objectFactory.createESocialEvtTSVInicioTrabalhadorDependente();

        dependente1.setTpDep( dependente.getTpDep() );
        dependente1.setNmDep( dependente.getNmDep() );
        dependente1.setDtNascto( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( dependente.getDtNascto() ) );
        dependente1.setCpfDep( dependente.getCpfDep() );
        dependente1.setDepIRRF( simNaoToTSSimNao( dependente.getDepIRRF() ) );
        dependente1.setDepSF( simNaoToTSSimNao( dependente.getDepSF() ) );
        dependente1.setIncTrab( simNaoToTSSimNao( dependente.getIncTrab() ) );

        return dependente1;
    }

    protected List<br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.Trabalhador.Dependente> dependenteListToDependenteList(List<Dependente> list) {
        if ( list == null ) {
            return null;
        }

        List<br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.Trabalhador.Dependente> list1 = new ArrayList<br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.Trabalhador.Dependente>( list.size() );
        for ( Dependente dependente : list ) {
            list1.add( dependenteToDependente( dependente ) );
        }

        return list1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.Trabalhador trabalhadorToTrabalhador(Trabalhador trabalhador) {
        if ( trabalhador == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.Trabalhador trabalhador1 = objectFactory.createESocialEvtTSVInicioTrabalhador();

        trabalhador1.setCpfTrab( trabalhador.getCpfTrab() );
        trabalhador1.setNmTrab( trabalhador.getNmTrab() );
        trabalhador1.setSexo( sexoToTSSexo( trabalhador.getSexo() ) );
        trabalhador1.setRacaCor( trabalhador.getRacaCor() );
        trabalhador1.setEstCiv( trabalhador.getEstCiv() );
        trabalhador1.setGrauInstr( trabalhador.getGrauInstr() );
        trabalhador1.setNmSoc( trabalhador.getNmSoc() );
        trabalhador1.setNascimento( nascimentoToTNascimento( trabalhador.getNascimento() ) );
        trabalhador1.setEndereco( enderecoToEndereco( trabalhador.getEndereco() ) );
        trabalhador1.setTrabImig( trabImigToTrabImig( trabalhador.getTrabImig() ) );
        trabalhador1.setInfoDeficiencia( infoDeficienciaToInfoDeficiencia( trabalhador.getInfoDeficiencia() ) );
        trabalhador1.setContato( contatoToTContato( trabalhador.getContato() ) );
        if ( trabalhador1.getDependente() != null ) {
            List<br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.Trabalhador.Dependente> list = dependenteListToDependenteList( trabalhador.getDependente() );
            if ( list != null ) {
                trabalhador1.getDependente().addAll( list );
            }
        }

        return trabalhador1;
    }

    protected CargoFuncao cargoFuncaoToCargoFuncao(br.jus.tst.esocial.dominio.semvinculo.CargoFuncao cargoFuncao) {
        if ( cargoFuncao == null ) {
            return null;
        }

        CargoFuncao cargoFuncao1 = objectFactory.createESocialEvtTSVInicioInfoTSVInicioInfoComplementaresCargoFuncao();

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

    protected br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.FGTS fGTSToFGTS(FGTS fGTS) {
        if ( fGTS == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.FGTS fGTS1 = objectFactory.createESocialEvtTSVInicioInfoTSVInicioInfoComplementaresFGTS();

        fGTS1.setDtOpcFGTS( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( fGTS.getDtOpcFGTS() ) );

        return fGTS1;
    }

    protected InfoDirigenteSindical infoDirigenteSindicalToInfoDirigenteSindical(br.jus.tst.esocial.dominio.semvinculo.InfoDirigenteSindical infoDirigenteSindical) {
        if ( infoDirigenteSindical == null ) {
            return null;
        }

        InfoDirigenteSindical infoDirigenteSindical1 = objectFactory.createESocialEvtTSVInicioInfoTSVInicioInfoComplementaresInfoDirigenteSindical();

        infoDirigenteSindical1.setCategOrig( infoDirigenteSindical.getCategOrig() );
        infoDirigenteSindical1.setTpInsc( infoDirigenteSindical.getTpInsc() );
        infoDirigenteSindical1.setNrInsc( infoDirigenteSindical.getNrInsc() );
        infoDirigenteSindical1.setDtAdmOrig( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( infoDirigenteSindical.getDtAdmOrig() ) );
        infoDirigenteSindical1.setMatricOrig( infoDirigenteSindical.getMatricOrig() );
        infoDirigenteSindical1.setTpRegTrab( infoDirigenteSindical.getTpRegTrab() );
        infoDirigenteSindical1.setTpRegPrev( infoDirigenteSindical.getTpRegPrev() );

        return infoDirigenteSindical1;
    }

    protected InfoTrabCedido infoTrabCedidoToInfoTrabCedido(br.jus.tst.esocial.dominio.semvinculo.InfoTrabCedido infoTrabCedido) {
        if ( infoTrabCedido == null ) {
            return null;
        }

        InfoTrabCedido infoTrabCedido1 = objectFactory.createESocialEvtTSVInicioInfoTSVInicioInfoComplementaresInfoTrabCedido();

        if ( infoTrabCedido.getCategOrig() != null ) {
            infoTrabCedido1.setCategOrig( BigInteger.valueOf( infoTrabCedido.getCategOrig() ) );
        }
        infoTrabCedido1.setCnpjCednt( infoTrabCedido.getCnpjCednt() );
        infoTrabCedido1.setMatricCed( infoTrabCedido.getMatricCed() );
        infoTrabCedido1.setDtAdmCed( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( infoTrabCedido.getDtAdmCed() ) );
        infoTrabCedido1.setTpRegTrab( infoTrabCedido.getTpRegTrab() );
        infoTrabCedido1.setTpRegPrev( infoTrabCedido.getTpRegPrev() );

        return infoTrabCedido1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoMandElet infoMandEletToInfoMandElet(InfoMandElet infoMandElet) {
        if ( infoMandElet == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.InfoTSVInicio.InfoComplementares.InfoMandElet infoMandElet1 = objectFactory.createESocialEvtTSVInicioInfoTSVInicioInfoComplementaresInfoMandElet();

        infoMandElet1.setIndRemunCargo( simNaoToTSSimNao( infoMandElet.getIndRemunCargo() ) );
        infoMandElet1.setTpRegTrab( infoMandElet.getTpRegTrab() );
        infoMandElet1.setTpRegPrev( infoMandElet.getTpRegPrev() );

        return infoMandElet1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.tsvinicio.TInfoEstagiario.InstEnsino instEnsinoToInstEnsino(InstEnsino instEnsino) {
        if ( instEnsino == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tsvinicio.TInfoEstagiario.InstEnsino instEnsino1 = objectFactory.createTInfoEstagiarioInstEnsino();

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

    protected br.jus.tst.esocial.esquemas.eventos.tsvinicio.TInfoEstagiario.AgeIntegracao ageIntegracaoToAgeIntegracao(AgeIntegracao ageIntegracao) {
        if ( ageIntegracao == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tsvinicio.TInfoEstagiario.AgeIntegracao ageIntegracao1 = objectFactory.createTInfoEstagiarioAgeIntegracao();

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

        InfoComplementares infoComplementares1 = objectFactory.createESocialEvtTSVInicioInfoTSVInicioInfoComplementares();

        infoComplementares1.setCargoFuncao( cargoFuncaoToCargoFuncao( infoComplementares.getCargoFuncao() ) );
        infoComplementares1.setRemuneracao( remuneracaoToTRemuneracao( infoComplementares.getRemuneracao() ) );
        infoComplementares1.setFGTS( fGTSToFGTS( infoComplementares.getFGTS() ) );
        infoComplementares1.setInfoDirigenteSindical( infoDirigenteSindicalToInfoDirigenteSindical( infoComplementares.getInfoDirigenteSindical() ) );
        infoComplementares1.setInfoTrabCedido( infoTrabCedidoToInfoTrabCedido( infoComplementares.getInfoTrabCedido() ) );
        infoComplementares1.setInfoMandElet( infoMandEletToInfoMandElet( infoComplementares.getInfoMandElet() ) );
        infoComplementares1.setInfoEstagiario( infoEstagiarioToTInfoEstagiario( infoComplementares.getInfoEstagiario() ) );

        return infoComplementares1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.InfoTSVInicio.MudancaCPF mudancaCPFToMudancaCPF(MudancaCPF mudancaCPF) {
        if ( mudancaCPF == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.InfoTSVInicio.MudancaCPF mudancaCPF1 = objectFactory.createESocialEvtTSVInicioInfoTSVInicioMudancaCPF();

        mudancaCPF1.setCpfAnt( mudancaCPF.getCpfAnt() );
        mudancaCPF1.setMatricAnt( mudancaCPF.getMatricAnt() );
        mudancaCPF1.setDtAltCPF( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( mudancaCPF.getDtAltCPF() ) );
        mudancaCPF1.setObservacao( mudancaCPF.getObservacao() );

        return mudancaCPF1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.InfoTSVInicio.Afastamento afastamentoToAfastamento(Afastamento afastamento) {
        if ( afastamento == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.InfoTSVInicio.Afastamento afastamento1 = objectFactory.createESocialEvtTSVInicioInfoTSVInicioAfastamento();

        afastamento1.setDtIniAfast( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( afastamento.getDtIniAfast() ) );
        afastamento1.setCodMotAfast( afastamento.getCodMotAfast() );

        return afastamento1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.InfoTSVInicio.Termino terminoToTermino(Termino termino) {
        if ( termino == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.InfoTSVInicio.Termino termino1 = objectFactory.createESocialEvtTSVInicioInfoTSVInicioTermino();

        termino1.setDtTerm( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( termino.getDtTerm() ) );

        return termino1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.InfoTSVInicio infoTSVInicioToInfoTSVInicio(InfoTSVInicio infoTSVInicio) {
        if ( infoTSVInicio == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tsvinicio.ESocial.EvtTSVInicio.InfoTSVInicio infoTSVInicio1 = objectFactory.createESocialEvtTSVInicioInfoTSVInicio();

        infoTSVInicio1.setCadIni( infoTSVInicio.getCadIni() );
        infoTSVInicio1.setMatricula( infoTSVInicio.getMatricula() );
        if ( infoTSVInicio.getCodCateg() != null ) {
            infoTSVInicio1.setCodCateg( BigInteger.valueOf( infoTSVInicio.getCodCateg() ) );
        }
        infoTSVInicio1.setDtInicio( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( infoTSVInicio.getDtInicio() ) );
        infoTSVInicio1.setNrProcTrab( infoTSVInicio.getNrProcTrab() );
        infoTSVInicio1.setNatAtividade( infoTSVInicio.getNatAtividade() );
        infoTSVInicio1.setInfoComplementares( infoComplementaresToInfoComplementares( infoTSVInicio.getInfoComplementares() ) );
        infoTSVInicio1.setMudancaCPF( mudancaCPFToMudancaCPF( infoTSVInicio.getMudancaCPF() ) );
        infoTSVInicio1.setAfastamento( afastamentoToAfastamento( infoTSVInicio.getAfastamento() ) );
        infoTSVInicio1.setTermino( terminoToTermino( infoTSVInicio.getTermino() ) );

        return infoTSVInicio1;
    }
}
