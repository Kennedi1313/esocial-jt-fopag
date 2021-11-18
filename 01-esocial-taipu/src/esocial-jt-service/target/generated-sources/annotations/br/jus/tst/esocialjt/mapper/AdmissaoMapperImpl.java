package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.dominio.endereco.EnderecoBrasil;
import br.jus.tst.esocial.dominio.endereco.EnderecoExterior;
import br.jus.tst.esocial.dominio.enums.Sexo;
import br.jus.tst.esocial.dominio.enums.SimNao;
import br.jus.tst.esocial.dominio.enums.UF;
import br.jus.tst.esocial.dominio.nascimento.Nascimento;
import br.jus.tst.esocial.dominio.trabalhador.Contato;
import br.jus.tst.esocial.dominio.vinculo.AlvaraJudicial;
import br.jus.tst.esocial.dominio.vinculo.Aprend;
import br.jus.tst.esocial.dominio.vinculo.HorContratual;
import br.jus.tst.esocial.dominio.vinculo.LocalTrabGeral;
import br.jus.tst.esocial.dominio.vinculo.Remuneracao;
import br.jus.tst.esocial.dominio.vinculo.TreiCap;
import br.jus.tst.esocial.esquemas.eventos.admissao.ESocial.EvtAdmissao;
import br.jus.tst.esocial.esquemas.eventos.admissao.ESocial.EvtAdmissao.Trabalhador;
import br.jus.tst.esocial.esquemas.eventos.admissao.ESocial.EvtAdmissao.Trabalhador.Dependente;
import br.jus.tst.esocial.esquemas.eventos.admissao.ESocial.EvtAdmissao.Trabalhador.Endereco;
import br.jus.tst.esocial.esquemas.eventos.admissao.ESocial.EvtAdmissao.Trabalhador.InfoDeficiencia;
import br.jus.tst.esocial.esquemas.eventos.admissao.ESocial.EvtAdmissao.Trabalhador.TrabImig;
import br.jus.tst.esocial.esquemas.eventos.admissao.ESocial.EvtAdmissao.Vinculo;
import br.jus.tst.esocial.esquemas.eventos.admissao.ESocial.EvtAdmissao.Vinculo.Afastamento;
import br.jus.tst.esocial.esquemas.eventos.admissao.ESocial.EvtAdmissao.Vinculo.Cessao;
import br.jus.tst.esocial.esquemas.eventos.admissao.ESocial.EvtAdmissao.Vinculo.Desligamento;
import br.jus.tst.esocial.esquemas.eventos.admissao.ESocial.EvtAdmissao.Vinculo.InfoContrato;
import br.jus.tst.esocial.esquemas.eventos.admissao.ESocial.EvtAdmissao.Vinculo.InfoContrato.Duracao;
import br.jus.tst.esocial.esquemas.eventos.admissao.ESocial.EvtAdmissao.Vinculo.InfoContrato.LocalTrabalho;
import br.jus.tst.esocial.esquemas.eventos.admissao.ESocial.EvtAdmissao.Vinculo.InfoContrato.Observacoes;
import br.jus.tst.esocial.esquemas.eventos.admissao.ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab;
import br.jus.tst.esocial.esquemas.eventos.admissao.ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista;
import br.jus.tst.esocial.esquemas.eventos.admissao.ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.FGTS;
import br.jus.tst.esocial.esquemas.eventos.admissao.ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario;
import br.jus.tst.esocial.esquemas.eventos.admissao.ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario.IdeEstabVinc;
import br.jus.tst.esocial.esquemas.eventos.admissao.ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario.IdeTrabSubstituido;
import br.jus.tst.esocial.esquemas.eventos.admissao.ESocial.EvtAdmissao.Vinculo.InfoRegimeTrab.InfoEstatutario;
import br.jus.tst.esocial.esquemas.eventos.admissao.ESocial.EvtAdmissao.Vinculo.MudancaCPF;
import br.jus.tst.esocial.esquemas.eventos.admissao.ESocial.EvtAdmissao.Vinculo.SucessaoVinc;
import br.jus.tst.esocial.esquemas.eventos.admissao.ESocial.EvtAdmissao.Vinculo.TransfDom;
import br.jus.tst.esocial.esquemas.eventos.admissao.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.admissao.TAlvaraJudicial;
import br.jus.tst.esocial.esquemas.eventos.admissao.TAprend;
import br.jus.tst.esocial.esquemas.eventos.admissao.TContato;
import br.jus.tst.esocial.esquemas.eventos.admissao.TEnderecoBrasil;
import br.jus.tst.esocial.esquemas.eventos.admissao.TEnderecoExterior;
import br.jus.tst.esocial.esquemas.eventos.admissao.THorContratual;
import br.jus.tst.esocial.esquemas.eventos.admissao.TIdeEmpregador;
import br.jus.tst.esocial.esquemas.eventos.admissao.TLocalTrabGeral;
import br.jus.tst.esocial.esquemas.eventos.admissao.TNascimento;
import br.jus.tst.esocial.esquemas.eventos.admissao.TRemuneracao;
import br.jus.tst.esocial.esquemas.eventos.admissao.TSSexo;
import br.jus.tst.esocial.esquemas.eventos.admissao.TSSimNao;
import br.jus.tst.esocial.esquemas.eventos.admissao.TSUf;
import br.jus.tst.esocial.esquemas.eventos.admissao.TTreiCap;
import br.jus.tst.esocial.ocorrencia.dados.Admissao;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-17T04:03:17-0200",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class AdmissaoMapperImpl extends AdmissaoMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();
    private final XMLGregorianCalendarMapper xMLGregorianCalendarMapper = new XMLGregorianCalendarMapper();

    @Override
    public EvtAdmissao comoEvtAdmissao(Admissao admissao) {
        if ( admissao == null ) {
            return null;
        }

        EvtAdmissao evtAdmissao = objectFactory.createESocialEvtAdmissao();

        evtAdmissao.setIdeEmpregador( ideEmpregadorToTIdeEmpregador( admissao.getIdeEmpregador() ) );
        evtAdmissao.setTrabalhador( trabalhadorToTrabalhador( admissao.getTrabalhador() ) );
        evtAdmissao.setVinculo( vinculoToVinculo( admissao.getVinculo() ) );

        limparNulos( admissao, evtAdmissao );

        return evtAdmissao;
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

    protected Endereco enderecoToEndereco(br.jus.tst.esocial.dominio.endereco.Endereco endereco) {
        if ( endereco == null ) {
            return null;
        }

        Endereco endereco1 = objectFactory.createESocialEvtAdmissaoTrabalhadorEndereco();

        endereco1.setBrasil( enderecoBrasilToTEnderecoBrasil( endereco.getBrasil() ) );
        endereco1.setExterior( enderecoExteriorToTEnderecoExterior( endereco.getExterior() ) );

        return endereco1;
    }

    protected TrabImig trabImigToTrabImig(br.jus.tst.esocial.dominio.trabalhador.TrabImig trabImig) {
        if ( trabImig == null ) {
            return null;
        }

        TrabImig trabImig1 = objectFactory.createESocialEvtAdmissaoTrabalhadorTrabImig();

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

    protected InfoDeficiencia infoDeficienciaToInfoDeficiencia(br.jus.tst.esocial.dominio.trabalhador.InfoDeficiencia infoDeficiencia) {
        if ( infoDeficiencia == null ) {
            return null;
        }

        InfoDeficiencia infoDeficiencia1 = objectFactory.createESocialEvtAdmissaoTrabalhadorInfoDeficiencia();

        infoDeficiencia1.setDefFisica( simNaoToTSSimNao( infoDeficiencia.getDefFisica() ) );
        infoDeficiencia1.setDefVisual( simNaoToTSSimNao( infoDeficiencia.getDefVisual() ) );
        infoDeficiencia1.setDefAuditiva( simNaoToTSSimNao( infoDeficiencia.getDefAuditiva() ) );
        infoDeficiencia1.setDefMental( simNaoToTSSimNao( infoDeficiencia.getDefMental() ) );
        infoDeficiencia1.setDefIntelectual( simNaoToTSSimNao( infoDeficiencia.getDefIntelectual() ) );
        infoDeficiencia1.setReabReadap( simNaoToTSSimNao( infoDeficiencia.getReabReadap() ) );
        infoDeficiencia1.setInfoCota( simNaoToTSSimNao( infoDeficiencia.getInfoCota() ) );
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

    protected Dependente dependenteToDependente(br.jus.tst.esocial.dominio.trabalhador.Dependente dependente) {
        if ( dependente == null ) {
            return null;
        }

        Dependente dependente1 = objectFactory.createESocialEvtAdmissaoTrabalhadorDependente();

        dependente1.setTpDep( dependente.getTpDep() );
        dependente1.setNmDep( dependente.getNmDep() );
        dependente1.setDtNascto( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( dependente.getDtNascto() ) );
        dependente1.setCpfDep( dependente.getCpfDep() );
        dependente1.setSexoDep( sexoToTSSexo( dependente.getSexoDep() ) );
        dependente1.setDepIRRF( simNaoToTSSimNao( dependente.getDepIRRF() ) );
        dependente1.setDepSF( simNaoToTSSimNao( dependente.getDepSF() ) );
        dependente1.setIncTrab( simNaoToTSSimNao( dependente.getIncTrab() ) );

        return dependente1;
    }

    protected List<Dependente> dependenteListToDependenteList(List<br.jus.tst.esocial.dominio.trabalhador.Dependente> list) {
        if ( list == null ) {
            return null;
        }

        List<Dependente> list1 = new ArrayList<Dependente>( list.size() );
        for ( br.jus.tst.esocial.dominio.trabalhador.Dependente dependente : list ) {
            list1.add( dependenteToDependente( dependente ) );
        }

        return list1;
    }

    protected Trabalhador trabalhadorToTrabalhador(br.jus.tst.esocial.dominio.trabalhador.Trabalhador trabalhador) {
        if ( trabalhador == null ) {
            return null;
        }

        Trabalhador trabalhador1 = objectFactory.createESocialEvtAdmissaoTrabalhador();

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
            List<Dependente> list = dependenteListToDependenteList( trabalhador.getDependente() );
            if ( list != null ) {
                trabalhador1.getDependente().addAll( list );
            }
        }

        return trabalhador1;
    }

    protected FGTS fGTSToFGTS(br.jus.tst.esocial.dominio.vinculo.FGTS fGTS) {
        if ( fGTS == null ) {
            return null;
        }

        FGTS fGTS1 = objectFactory.createESocialEvtAdmissaoVinculoInfoRegimeTrabInfoCeletistaFGTS();

        fGTS1.setDtOpcFGTS( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( fGTS.getDtOpcFGTS() ) );

        return fGTS1;
    }

    protected IdeEstabVinc ideEstabVincToIdeEstabVinc(br.jus.tst.esocial.dominio.vinculo.IdeEstabVinc ideEstabVinc) {
        if ( ideEstabVinc == null ) {
            return null;
        }

        IdeEstabVinc ideEstabVinc1 = objectFactory.createESocialEvtAdmissaoVinculoInfoRegimeTrabInfoCeletistaTrabTemporarioIdeEstabVinc();

        ideEstabVinc1.setTpInsc( ideEstabVinc.getTpInsc() );
        ideEstabVinc1.setNrInsc( ideEstabVinc.getNrInsc() );

        return ideEstabVinc1;
    }

    protected IdeTrabSubstituido ideTrabSubstituidoToIdeTrabSubstituido(br.jus.tst.esocial.dominio.vinculo.IdeTrabSubstituido ideTrabSubstituido) {
        if ( ideTrabSubstituido == null ) {
            return null;
        }

        IdeTrabSubstituido ideTrabSubstituido1 = objectFactory.createESocialEvtAdmissaoVinculoInfoRegimeTrabInfoCeletistaTrabTemporarioIdeTrabSubstituido();

        ideTrabSubstituido1.setCpfTrabSubst( ideTrabSubstituido.getCpfTrabSubst() );

        return ideTrabSubstituido1;
    }

    protected List<IdeTrabSubstituido> ideTrabSubstituidoListToIdeTrabSubstituidoList(List<br.jus.tst.esocial.dominio.vinculo.IdeTrabSubstituido> list) {
        if ( list == null ) {
            return null;
        }

        List<IdeTrabSubstituido> list1 = new ArrayList<IdeTrabSubstituido>( list.size() );
        for ( br.jus.tst.esocial.dominio.vinculo.IdeTrabSubstituido ideTrabSubstituido : list ) {
            list1.add( ideTrabSubstituidoToIdeTrabSubstituido( ideTrabSubstituido ) );
        }

        return list1;
    }

    protected TrabTemporario trabTemporarioToTrabTemporario(br.jus.tst.esocial.dominio.vinculo.TrabTemporario trabTemporario) {
        if ( trabTemporario == null ) {
            return null;
        }

        TrabTemporario trabTemporario1 = objectFactory.createESocialEvtAdmissaoVinculoInfoRegimeTrabInfoCeletistaTrabTemporario();

        trabTemporario1.setHipLeg( trabTemporario.getHipLeg() );
        trabTemporario1.setJustContr( trabTemporario.getJustContr() );
        trabTemporario1.setIdeEstabVinc( ideEstabVincToIdeEstabVinc( trabTemporario.getIdeEstabVinc() ) );
        if ( trabTemporario1.getIdeTrabSubstituido() != null ) {
            List<IdeTrabSubstituido> list = ideTrabSubstituidoListToIdeTrabSubstituidoList( trabTemporario.getIdeTrabSubstituido() );
            if ( list != null ) {
                trabTemporario1.getIdeTrabSubstituido().addAll( list );
            }
        }

        return trabTemporario1;
    }

    protected TAprend aprendToTAprend(Aprend aprend) {
        if ( aprend == null ) {
            return null;
        }

        TAprend tAprend = objectFactory.createTAprend();

        tAprend.setTpInsc( aprend.getTpInsc() );
        tAprend.setNrInsc( aprend.getNrInsc() );

        return tAprend;
    }

    protected InfoCeletista infoCeletistaToInfoCeletista(br.jus.tst.esocial.dominio.vinculo.InfoCeletista infoCeletista) {
        if ( infoCeletista == null ) {
            return null;
        }

        InfoCeletista infoCeletista1 = objectFactory.createESocialEvtAdmissaoVinculoInfoRegimeTrabInfoCeletista();

        infoCeletista1.setDtAdm( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( infoCeletista.getDtAdm() ) );
        infoCeletista1.setTpAdmissao( infoCeletista.getTpAdmissao() );
        infoCeletista1.setIndAdmissao( infoCeletista.getIndAdmissao() );
        infoCeletista1.setNrProcTrab( infoCeletista.getNrProcTrab() );
        infoCeletista1.setTpRegJor( infoCeletista.getTpRegJor() );
        infoCeletista1.setNatAtividade( infoCeletista.getNatAtividade() );
        infoCeletista1.setDtBase( infoCeletista.getDtBase() );
        infoCeletista1.setCnpjSindCategProf( infoCeletista.getCnpjSindCategProf() );
        infoCeletista1.setFGTS( fGTSToFGTS( infoCeletista.getFGTS() ) );
        infoCeletista1.setTrabTemporario( trabTemporarioToTrabTemporario( infoCeletista.getTrabTemporario() ) );
        infoCeletista1.setAprend( aprendToTAprend( infoCeletista.getAprend() ) );

        return infoCeletista1;
    }

    protected InfoEstatutario infoEstatutarioToInfoEstatutario(br.jus.tst.esocial.dominio.vinculo.InfoEstatutario infoEstatutario) {
        if ( infoEstatutario == null ) {
            return null;
        }

        InfoEstatutario infoEstatutario1 = objectFactory.createESocialEvtAdmissaoVinculoInfoRegimeTrabInfoEstatutario();

        infoEstatutario1.setTpProv( infoEstatutario.getTpProv() );
        infoEstatutario1.setDtExercicio( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( infoEstatutario.getDtExercicio() ) );
        infoEstatutario1.setTpPlanRP( infoEstatutario.getTpPlanRP() );
        infoEstatutario1.setIndTetoRGPS( simNaoToTSSimNao( infoEstatutario.getIndTetoRGPS() ) );
        infoEstatutario1.setIndAbonoPerm( simNaoToTSSimNao( infoEstatutario.getIndAbonoPerm() ) );
        infoEstatutario1.setDtIniAbono( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( infoEstatutario.getDtIniAbono() ) );

        return infoEstatutario1;
    }

    protected InfoRegimeTrab infoRegimeTrabToInfoRegimeTrab(br.jus.tst.esocial.dominio.vinculo.InfoRegimeTrab infoRegimeTrab) {
        if ( infoRegimeTrab == null ) {
            return null;
        }

        InfoRegimeTrab infoRegimeTrab1 = objectFactory.createESocialEvtAdmissaoVinculoInfoRegimeTrab();

        infoRegimeTrab1.setInfoCeletista( infoCeletistaToInfoCeletista( infoRegimeTrab.getInfoCeletista() ) );
        infoRegimeTrab1.setInfoEstatutario( infoEstatutarioToInfoEstatutario( infoRegimeTrab.getInfoEstatutario() ) );

        return infoRegimeTrab1;
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

    protected Duracao duracaoToDuracao(br.jus.tst.esocial.dominio.vinculo.alteracaocontratual.Duracao duracao) {
        if ( duracao == null ) {
            return null;
        }

        Duracao duracao1 = objectFactory.createESocialEvtAdmissaoVinculoInfoContratoDuracao();

        duracao1.setTpContr( duracao.getTpContr() );
        duracao1.setDtTerm( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( duracao.getDtTerm() ) );
        duracao1.setClauAssec( simNaoToTSSimNao( duracao.getClauAssec() ) );
        duracao1.setObjDet( duracao.getObjDet() );

        return duracao1;
    }

    protected TLocalTrabGeral localTrabGeralToTLocalTrabGeral(LocalTrabGeral localTrabGeral) {
        if ( localTrabGeral == null ) {
            return null;
        }

        TLocalTrabGeral tLocalTrabGeral = objectFactory.createTLocalTrabGeral();

        tLocalTrabGeral.setTpInsc( localTrabGeral.getTpInsc() );
        tLocalTrabGeral.setNrInsc( localTrabGeral.getNrInsc() );
        tLocalTrabGeral.setDescComp( localTrabGeral.getDescComp() );

        return tLocalTrabGeral;
    }

    protected LocalTrabalho localTrabalhoToLocalTrabalho(br.jus.tst.esocial.dominio.vinculo.LocalTrabalho localTrabalho) {
        if ( localTrabalho == null ) {
            return null;
        }

        LocalTrabalho localTrabalho1 = objectFactory.createESocialEvtAdmissaoVinculoInfoContratoLocalTrabalho();

        localTrabalho1.setLocalTrabGeral( localTrabGeralToTLocalTrabGeral( localTrabalho.getLocalTrabGeral() ) );
        localTrabalho1.setLocalTempDom( enderecoBrasilToTEnderecoBrasil( localTrabalho.getLocalTempDom() ) );

        return localTrabalho1;
    }

    protected THorContratual horContratualToTHorContratual(HorContratual horContratual) {
        if ( horContratual == null ) {
            return null;
        }

        THorContratual tHorContratual = objectFactory.createTHorContratual();

        tHorContratual.setQtdHrsSem( horContratual.getQtdHrsSem() );
        tHorContratual.setTpJornada( horContratual.getTpJornada() );
        tHorContratual.setTmpParc( horContratual.getTmpParc() );
        tHorContratual.setHorNoturno( simNaoToTSSimNao( horContratual.getHorNoturno() ) );
        tHorContratual.setDscJorn( horContratual.getDscJorn() );

        return tHorContratual;
    }

    protected TAlvaraJudicial alvaraJudicialToTAlvaraJudicial(AlvaraJudicial alvaraJudicial) {
        if ( alvaraJudicial == null ) {
            return null;
        }

        TAlvaraJudicial tAlvaraJudicial = objectFactory.createTAlvaraJudicial();

        tAlvaraJudicial.setNrProcJud( alvaraJudicial.getNrProcJud() );

        return tAlvaraJudicial;
    }

    protected Observacoes observacoesToObservacoes(br.jus.tst.esocial.dominio.vinculo.Observacoes observacoes) {
        if ( observacoes == null ) {
            return null;
        }

        Observacoes observacoes1 = objectFactory.createESocialEvtAdmissaoVinculoInfoContratoObservacoes();

        observacoes1.setObservacao( observacoes.getObservacao() );

        return observacoes1;
    }

    protected List<Observacoes> observacoesListToObservacoesList(List<br.jus.tst.esocial.dominio.vinculo.Observacoes> list) {
        if ( list == null ) {
            return null;
        }

        List<Observacoes> list1 = new ArrayList<Observacoes>( list.size() );
        for ( br.jus.tst.esocial.dominio.vinculo.Observacoes observacoes : list ) {
            list1.add( observacoesToObservacoes( observacoes ) );
        }

        return list1;
    }

    protected TTreiCap treiCapToTTreiCap(TreiCap treiCap) {
        if ( treiCap == null ) {
            return null;
        }

        TTreiCap tTreiCap = objectFactory.createTTreiCap();

        tTreiCap.setCodTreiCap( treiCap.getCodTreiCap() );

        return tTreiCap;
    }

    protected List<TTreiCap> treiCapListToTTreiCapList(List<TreiCap> list) {
        if ( list == null ) {
            return null;
        }

        List<TTreiCap> list1 = new ArrayList<TTreiCap>( list.size() );
        for ( TreiCap treiCap : list ) {
            list1.add( treiCapToTTreiCap( treiCap ) );
        }

        return list1;
    }

    protected InfoContrato infoContratoToInfoContrato(br.jus.tst.esocial.dominio.vinculo.InfoContrato infoContrato) {
        if ( infoContrato == null ) {
            return null;
        }

        InfoContrato infoContrato1 = objectFactory.createESocialEvtAdmissaoVinculoInfoContrato();

        infoContrato1.setNmCargo( infoContrato.getNmCargo() );
        infoContrato1.setCBOCargo( infoContrato.getCBOCargo() );
        infoContrato1.setDtIngrCargo( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( infoContrato.getDtIngrCargo() ) );
        infoContrato1.setNmFuncao( infoContrato.getNmFuncao() );
        infoContrato1.setCBOFuncao( infoContrato.getCBOFuncao() );
        infoContrato1.setAcumCargo( simNaoToTSSimNao( infoContrato.getAcumCargo() ) );
        infoContrato1.setCodCateg( infoContrato.getCodCateg() );
        infoContrato1.setRemuneracao( remuneracaoToTRemuneracao( infoContrato.getRemuneracao() ) );
        infoContrato1.setDuracao( duracaoToDuracao( infoContrato.getDuracao() ) );
        infoContrato1.setLocalTrabalho( localTrabalhoToLocalTrabalho( infoContrato.getLocalTrabalho() ) );
        infoContrato1.setHorContratual( horContratualToTHorContratual( infoContrato.getHorContratual() ) );
        infoContrato1.setAlvaraJudicial( alvaraJudicialToTAlvaraJudicial( infoContrato.getAlvaraJudicial() ) );
        if ( infoContrato1.getObservacoes() != null ) {
            List<Observacoes> list = observacoesListToObservacoesList( infoContrato.getObservacoes() );
            if ( list != null ) {
                infoContrato1.getObservacoes().addAll( list );
            }
        }
        if ( infoContrato1.getTreiCap() != null ) {
            List<TTreiCap> list1 = treiCapListToTTreiCapList( infoContrato.getTreiCap() );
            if ( list1 != null ) {
                infoContrato1.getTreiCap().addAll( list1 );
            }
        }

        return infoContrato1;
    }

    protected SucessaoVinc sucessaoVincToSucessaoVinc(br.jus.tst.esocial.dominio.vinculo.SucessaoVinc sucessaoVinc) {
        if ( sucessaoVinc == null ) {
            return null;
        }

        SucessaoVinc sucessaoVinc1 = objectFactory.createESocialEvtAdmissaoVinculoSucessaoVinc();

        sucessaoVinc1.setTpInsc( sucessaoVinc.getTpInsc() );
        sucessaoVinc1.setNrInsc( sucessaoVinc.getNrInsc() );
        sucessaoVinc1.setMatricAnt( sucessaoVinc.getMatricAnt() );
        sucessaoVinc1.setDtTransf( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( sucessaoVinc.getDtTransf() ) );
        sucessaoVinc1.setObservacao( sucessaoVinc.getObservacao() );

        return sucessaoVinc1;
    }

    protected TransfDom transfDomToTransfDom(br.jus.tst.esocial.dominio.vinculo.TransfDom transfDom) {
        if ( transfDom == null ) {
            return null;
        }

        TransfDom transfDom1 = objectFactory.createESocialEvtAdmissaoVinculoTransfDom();

        transfDom1.setCpfSubstituido( transfDom.getCpfSubstituido() );
        transfDom1.setMatricAnt( transfDom.getMatricAnt() );
        transfDom1.setDtTransf( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( transfDom.getDtTransf() ) );

        return transfDom1;
    }

    protected MudancaCPF mudancaCPFToMudancaCPF(br.jus.tst.esocial.dominio.vinculo.MudancaCPF mudancaCPF) {
        if ( mudancaCPF == null ) {
            return null;
        }

        MudancaCPF mudancaCPF1 = objectFactory.createESocialEvtAdmissaoVinculoMudancaCPF();

        mudancaCPF1.setCpfAnt( mudancaCPF.getCpfAnt() );
        mudancaCPF1.setMatricAnt( mudancaCPF.getMatricAnt() );
        mudancaCPF1.setDtAltCPF( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( mudancaCPF.getDtAltCPF() ) );
        mudancaCPF1.setObservacao( mudancaCPF.getObservacao() );

        return mudancaCPF1;
    }

    protected Afastamento afastamentoToAfastamento(br.jus.tst.esocial.dominio.vinculo.Afastamento afastamento) {
        if ( afastamento == null ) {
            return null;
        }

        Afastamento afastamento1 = objectFactory.createESocialEvtAdmissaoVinculoAfastamento();

        afastamento1.setDtIniAfast( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( afastamento.getDtIniAfast() ) );
        afastamento1.setCodMotAfast( afastamento.getCodMotAfast() );

        return afastamento1;
    }

    protected Desligamento desligamentoToDesligamento(br.jus.tst.esocial.dominio.vinculo.Desligamento desligamento) {
        if ( desligamento == null ) {
            return null;
        }

        Desligamento desligamento1 = objectFactory.createESocialEvtAdmissaoVinculoDesligamento();

        desligamento1.setDtDeslig( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( desligamento.getDtDeslig() ) );

        return desligamento1;
    }

    protected Cessao cessaoToCessao(br.jus.tst.esocial.dominio.vinculo.Cessao cessao) {
        if ( cessao == null ) {
            return null;
        }

        Cessao cessao1 = objectFactory.createESocialEvtAdmissaoVinculoCessao();

        cessao1.setDtIniCessao( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( cessao.getDtIniCessao() ) );

        return cessao1;
    }

    protected Vinculo vinculoToVinculo(br.jus.tst.esocial.dominio.vinculo.Vinculo vinculo) {
        if ( vinculo == null ) {
            return null;
        }

        Vinculo vinculo1 = objectFactory.createESocialEvtAdmissaoVinculo();

        vinculo1.setMatricula( vinculo.getMatricula() );
        vinculo1.setTpRegTrab( vinculo.getTpRegTrab() );
        vinculo1.setTpRegPrev( vinculo.getTpRegPrev() );
        vinculo1.setCadIni( vinculo.getCadIni() );
        vinculo1.setInfoRegimeTrab( infoRegimeTrabToInfoRegimeTrab( vinculo.getInfoRegimeTrab() ) );
        vinculo1.setInfoContrato( infoContratoToInfoContrato( vinculo.getInfoContrato() ) );
        vinculo1.setSucessaoVinc( sucessaoVincToSucessaoVinc( vinculo.getSucessaoVinc() ) );
        vinculo1.setTransfDom( transfDomToTransfDom( vinculo.getTransfDom() ) );
        vinculo1.setMudancaCPF( mudancaCPFToMudancaCPF( vinculo.getMudancaCPF() ) );
        vinculo1.setAfastamento( afastamentoToAfastamento( vinculo.getAfastamento() ) );
        vinculo1.setDesligamento( desligamentoToDesligamento( vinculo.getDesligamento() ) );
        vinculo1.setCessao( cessaoToCessao( vinculo.getCessao() ) );

        return vinculo1;
    }
}
