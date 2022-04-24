package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.dominio.endereco.Endereco;
import br.jus.tst.esocial.dominio.endereco.EnderecoBrasil;
import br.jus.tst.esocial.dominio.endereco.EnderecoExterior;
import br.jus.tst.esocial.dominio.enums.Sexo;
import br.jus.tst.esocial.dominio.enums.SimNao;
import br.jus.tst.esocial.dominio.enums.UF;
import br.jus.tst.esocial.dominio.trabalhador.Contato;
import br.jus.tst.esocial.dominio.trabalhador.Dependente;
import br.jus.tst.esocial.dominio.trabalhador.InfoDeficiencia;
import br.jus.tst.esocial.dominio.trabalhador.TrabImig;
import br.jus.tst.esocial.dominio.trabalhador.alteracaocadastral.Alteracao;
import br.jus.tst.esocial.dominio.trabalhador.alteracaocadastral.DadosTrabalhador;
import br.jus.tst.esocial.esquemas.eventos.altcadastral.ESocial.EvtAltCadastral;
import br.jus.tst.esocial.esquemas.eventos.altcadastral.ESocial.EvtAltCadastral.IdeTrabalhador;
import br.jus.tst.esocial.esquemas.eventos.altcadastral.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.altcadastral.TContato;
import br.jus.tst.esocial.esquemas.eventos.altcadastral.TEnderecoBrasil;
import br.jus.tst.esocial.esquemas.eventos.altcadastral.TEnderecoExterior;
import br.jus.tst.esocial.esquemas.eventos.altcadastral.TIdeEmpregador;
import br.jus.tst.esocial.esquemas.eventos.altcadastral.TSSexo;
import br.jus.tst.esocial.esquemas.eventos.altcadastral.TSSimNao;
import br.jus.tst.esocial.esquemas.eventos.altcadastral.TSUf;
import br.jus.tst.esocial.ocorrencia.dados.AltCadastral;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-23T22:04:12-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class AltCadastralMapperImpl extends AltCadastralMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();
    private final XMLGregorianCalendarMapper xMLGregorianCalendarMapper = new XMLGregorianCalendarMapper();

    @Override
    public EvtAltCadastral comoEvtAltCadastral(AltCadastral altCadastral) {
        if ( altCadastral == null ) {
            return null;
        }

        EvtAltCadastral evtAltCadastral = objectFactory.createESocialEvtAltCadastral();

        evtAltCadastral.setIdeEmpregador( ideEmpregadorToTIdeEmpregador( altCadastral.getIdeEmpregador() ) );
        evtAltCadastral.setIdeTrabalhador( ideTrabalhadorToIdeTrabalhador( altCadastral.getIdeTrabalhador() ) );
        evtAltCadastral.setAlteracao( alteracaoToAlteracao( altCadastral.getAlteracao() ) );

        limparNulos( altCadastral, evtAltCadastral );

        return evtAltCadastral;
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

    protected IdeTrabalhador ideTrabalhadorToIdeTrabalhador(br.jus.tst.esocial.dominio.trabalhador.alteracaocadastral.IdeTrabalhador ideTrabalhador) {
        if ( ideTrabalhador == null ) {
            return null;
        }

        IdeTrabalhador ideTrabalhador1 = objectFactory.createESocialEvtAltCadastralIdeTrabalhador();

        ideTrabalhador1.setCpfTrab( ideTrabalhador.getCpfTrab() );

        return ideTrabalhador1;
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

    protected br.jus.tst.esocial.esquemas.eventos.altcadastral.ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Endereco enderecoToEndereco(Endereco endereco) {
        if ( endereco == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.altcadastral.ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Endereco endereco1 = objectFactory.createESocialEvtAltCadastralAlteracaoDadosTrabalhadorEndereco();

        endereco1.setBrasil( enderecoBrasilToTEnderecoBrasil( endereco.getBrasil() ) );
        endereco1.setExterior( enderecoExteriorToTEnderecoExterior( endereco.getExterior() ) );

        return endereco1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.altcadastral.ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.TrabImig trabImigToTrabImig(TrabImig trabImig) {
        if ( trabImig == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.altcadastral.ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.TrabImig trabImig1 = objectFactory.createESocialEvtAltCadastralAlteracaoDadosTrabalhadorTrabImig();

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

    protected br.jus.tst.esocial.esquemas.eventos.altcadastral.ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.InfoDeficiencia infoDeficienciaToInfoDeficiencia(InfoDeficiencia infoDeficiencia) {
        if ( infoDeficiencia == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.altcadastral.ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.InfoDeficiencia infoDeficiencia1 = objectFactory.createESocialEvtAltCadastralAlteracaoDadosTrabalhadorInfoDeficiencia();

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

    protected br.jus.tst.esocial.esquemas.eventos.altcadastral.ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Dependente dependenteToDependente(Dependente dependente) {
        if ( dependente == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.altcadastral.ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Dependente dependente1 = objectFactory.createESocialEvtAltCadastralAlteracaoDadosTrabalhadorDependente();

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

    protected List<br.jus.tst.esocial.esquemas.eventos.altcadastral.ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Dependente> dependenteListToDependenteList(List<Dependente> list) {
        if ( list == null ) {
            return null;
        }

        List<br.jus.tst.esocial.esquemas.eventos.altcadastral.ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Dependente> list1 = new ArrayList<br.jus.tst.esocial.esquemas.eventos.altcadastral.ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Dependente>( list.size() );
        for ( Dependente dependente : list ) {
            list1.add( dependenteToDependente( dependente ) );
        }

        return list1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.altcadastral.ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador dadosTrabalhadorToDadosTrabalhador(DadosTrabalhador dadosTrabalhador) {
        if ( dadosTrabalhador == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.altcadastral.ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador dadosTrabalhador1 = objectFactory.createESocialEvtAltCadastralAlteracaoDadosTrabalhador();

        dadosTrabalhador1.setNmTrab( dadosTrabalhador.getNmTrab() );
        dadosTrabalhador1.setSexo( sexoToTSSexo( dadosTrabalhador.getSexo() ) );
        dadosTrabalhador1.setRacaCor( dadosTrabalhador.getRacaCor() );
        dadosTrabalhador1.setEstCiv( dadosTrabalhador.getEstCiv() );
        dadosTrabalhador1.setGrauInstr( dadosTrabalhador.getGrauInstr() );
        dadosTrabalhador1.setNmSoc( dadosTrabalhador.getNmSoc() );
        dadosTrabalhador1.setPaisNac( dadosTrabalhador.getPaisNac() );
        dadosTrabalhador1.setEndereco( enderecoToEndereco( dadosTrabalhador.getEndereco() ) );
        dadosTrabalhador1.setTrabImig( trabImigToTrabImig( dadosTrabalhador.getTrabImig() ) );
        dadosTrabalhador1.setInfoDeficiencia( infoDeficienciaToInfoDeficiencia( dadosTrabalhador.getInfoDeficiencia() ) );
        dadosTrabalhador1.setContato( contatoToTContato( dadosTrabalhador.getContato() ) );
        if ( dadosTrabalhador1.getDependente() != null ) {
            List<br.jus.tst.esocial.esquemas.eventos.altcadastral.ESocial.EvtAltCadastral.Alteracao.DadosTrabalhador.Dependente> list = dependenteListToDependenteList( dadosTrabalhador.getDependente() );
            if ( list != null ) {
                dadosTrabalhador1.getDependente().addAll( list );
            }
        }

        return dadosTrabalhador1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.altcadastral.ESocial.EvtAltCadastral.Alteracao alteracaoToAlteracao(Alteracao alteracao) {
        if ( alteracao == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.altcadastral.ESocial.EvtAltCadastral.Alteracao alteracao1 = objectFactory.createESocialEvtAltCadastralAlteracao();

        alteracao1.setDtAlteracao( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( alteracao.getDtAlteracao() ) );
        alteracao1.setDadosTrabalhador( dadosTrabalhadorToDadosTrabalhador( alteracao.getDadosTrabalhador() ) );

        return alteracao1;
    }
}
