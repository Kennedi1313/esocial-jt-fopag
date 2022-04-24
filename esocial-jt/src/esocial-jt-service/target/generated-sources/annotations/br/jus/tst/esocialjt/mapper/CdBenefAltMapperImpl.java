package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.dominio.beneficiario.alteracao.Alteracao;
import br.jus.tst.esocial.dominio.beneficiario.alteracao.DadosBenef;
import br.jus.tst.esocial.dominio.beneficiario.alteracao.IdeBenef;
import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.dominio.endereco.EnderecoBrasil;
import br.jus.tst.esocial.dominio.endereco.EnderecoExterior;
import br.jus.tst.esocial.dominio.enums.Sexo;
import br.jus.tst.esocial.dominio.enums.SimNao;
import br.jus.tst.esocial.dominio.enums.UF;
import br.jus.tst.esocial.esquemas.eventos.cdbenefalt.ESocial.EvtCdBenefAlt;
import br.jus.tst.esocial.esquemas.eventos.cdbenefalt.ESocial.EvtCdBenefAlt.Alteracao.DadosBenef.Dependente;
import br.jus.tst.esocial.esquemas.eventos.cdbenefalt.ESocial.EvtCdBenefAlt.Alteracao.DadosBenef.Endereco;
import br.jus.tst.esocial.esquemas.eventos.cdbenefalt.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.cdbenefalt.TEnderecoBrasil;
import br.jus.tst.esocial.esquemas.eventos.cdbenefalt.TEnderecoExterior;
import br.jus.tst.esocial.esquemas.eventos.cdbenefalt.TIdeEmpregadorCnpj;
import br.jus.tst.esocial.esquemas.eventos.cdbenefalt.TSSexo;
import br.jus.tst.esocial.esquemas.eventos.cdbenefalt.TSSimNao;
import br.jus.tst.esocial.esquemas.eventos.cdbenefalt.TSUf;
import br.jus.tst.esocial.ocorrencia.dados.CdBenefAlt;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-23T22:04:12-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class CdBenefAltMapperImpl extends CdBenefAltMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();
    private final XMLGregorianCalendarMapper xMLGregorianCalendarMapper = new XMLGregorianCalendarMapper();

    @Override
    public EvtCdBenefAlt comoEvtCdBenefAlt(CdBenefAlt cdBenefAlt) {
        if ( cdBenefAlt == null ) {
            return null;
        }

        EvtCdBenefAlt evtCdBenefAlt = objectFactory.createESocialEvtCdBenefAlt();

        evtCdBenefAlt.setIdeEmpregador( ideEmpregadorToTIdeEmpregadorCnpj( cdBenefAlt.getIdeEmpregador() ) );
        evtCdBenefAlt.setIdeBenef( ideBenefToIdeBenef( cdBenefAlt.getIdeBenef() ) );
        evtCdBenefAlt.setAlteracao( alteracaoToAlteracao( cdBenefAlt.getAlteracao() ) );

        return evtCdBenefAlt;
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

    protected br.jus.tst.esocial.esquemas.eventos.cdbenefalt.ESocial.EvtCdBenefAlt.IdeBenef ideBenefToIdeBenef(IdeBenef ideBenef) {
        if ( ideBenef == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.cdbenefalt.ESocial.EvtCdBenefAlt.IdeBenef ideBenef1 = objectFactory.createESocialEvtCdBenefAltIdeBenef();

        ideBenef1.setCpfBenef( ideBenef.getCpfBenef() );

        return ideBenef1;
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

        Endereco endereco1 = objectFactory.createESocialEvtCdBenefAltAlteracaoDadosBenefEndereco();

        endereco1.setBrasil( enderecoBrasilToTEnderecoBrasil( endereco.getBrasil() ) );
        endereco1.setExterior( enderecoExteriorToTEnderecoExterior( endereco.getExterior() ) );

        return endereco1;
    }

    protected Dependente dependenteToDependente(br.jus.tst.esocial.dominio.beneficiario.inicio.Dependente dependente) {
        if ( dependente == null ) {
            return null;
        }

        Dependente dependente1 = objectFactory.createESocialEvtCdBenefAltAlteracaoDadosBenefDependente();

        dependente1.setTpDep( dependente.getTpDep() );
        dependente1.setNmDep( dependente.getNmDep() );
        dependente1.setDtNascto( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( dependente.getDtNascto() ) );
        dependente1.setCpfDep( dependente.getCpfDep() );
        dependente1.setSexoDep( sexoToTSSexo( dependente.getSexoDep() ) );
        dependente1.setDepIRRF( simNaoToTSSimNao( dependente.getDepIRRF() ) );
        dependente1.setIncFisMen( simNaoToTSSimNao( dependente.getIncFisMen() ) );

        return dependente1;
    }

    protected List<Dependente> dependenteListToDependenteList(List<br.jus.tst.esocial.dominio.beneficiario.inicio.Dependente> list) {
        if ( list == null ) {
            return null;
        }

        List<Dependente> list1 = new ArrayList<Dependente>( list.size() );
        for ( br.jus.tst.esocial.dominio.beneficiario.inicio.Dependente dependente : list ) {
            list1.add( dependenteToDependente( dependente ) );
        }

        return list1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.cdbenefalt.ESocial.EvtCdBenefAlt.Alteracao.DadosBenef dadosBenefToDadosBenef(DadosBenef dadosBenef) {
        if ( dadosBenef == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.cdbenefalt.ESocial.EvtCdBenefAlt.Alteracao.DadosBenef dadosBenef1 = objectFactory.createESocialEvtCdBenefAltAlteracaoDadosBenef();

        dadosBenef1.setNmBenefic( dadosBenef.getNmBenefic() );
        dadosBenef1.setSexo( sexoToTSSexo( dadosBenef.getSexo() ) );
        dadosBenef1.setRacaCor( dadosBenef.getRacaCor() );
        dadosBenef1.setEstCiv( dadosBenef.getEstCiv() );
        dadosBenef1.setIncFisMen( simNaoToTSSimNao( dadosBenef.getIncFisMen() ) );
        dadosBenef1.setEndereco( enderecoToEndereco( dadosBenef.getEndereco() ) );
        if ( dadosBenef1.getDependente() != null ) {
            List<Dependente> list = dependenteListToDependenteList( dadosBenef.getDependente() );
            if ( list != null ) {
                dadosBenef1.getDependente().addAll( list );
            }
        }

        return dadosBenef1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.cdbenefalt.ESocial.EvtCdBenefAlt.Alteracao alteracaoToAlteracao(Alteracao alteracao) {
        if ( alteracao == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.cdbenefalt.ESocial.EvtCdBenefAlt.Alteracao alteracao1 = objectFactory.createESocialEvtCdBenefAltAlteracao();

        alteracao1.setDtAlteracao( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( alteracao.getDtAlteracao() ) );
        alteracao1.setDadosBenef( dadosBenefToDadosBenef( alteracao.getDadosBenef() ) );

        return alteracao1;
    }
}
