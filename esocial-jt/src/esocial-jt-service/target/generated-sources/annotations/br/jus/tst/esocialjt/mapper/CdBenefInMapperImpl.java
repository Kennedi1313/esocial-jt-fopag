package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.dominio.endereco.Endereco;
import br.jus.tst.esocial.dominio.endereco.EnderecoBrasil;
import br.jus.tst.esocial.dominio.endereco.EnderecoExterior;
import br.jus.tst.esocial.dominio.enums.Sexo;
import br.jus.tst.esocial.dominio.enums.SimNao;
import br.jus.tst.esocial.dominio.enums.UF;
import br.jus.tst.esocial.esquemas.eventos.cdbenefin.ESocial.EvtCdBenefIn;
import br.jus.tst.esocial.esquemas.eventos.cdbenefin.ESocial.EvtCdBenefIn.Beneficiario;
import br.jus.tst.esocial.esquemas.eventos.cdbenefin.ESocial.EvtCdBenefIn.Beneficiario.Dependente;
import br.jus.tst.esocial.esquemas.eventos.cdbenefin.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.cdbenefin.TEnderecoBrasil;
import br.jus.tst.esocial.esquemas.eventos.cdbenefin.TEnderecoExterior;
import br.jus.tst.esocial.esquemas.eventos.cdbenefin.TSSexo;
import br.jus.tst.esocial.esquemas.eventos.cdbenefin.TSSimNao;
import br.jus.tst.esocial.esquemas.eventos.cdbenefin.TSUf;
import br.jus.tst.esocial.ocorrencia.dados.CdBenefIn;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-23T22:04:14-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class CdBenefInMapperImpl extends CdBenefInMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();
    private final XMLGregorianCalendarMapper xMLGregorianCalendarMapper = new XMLGregorianCalendarMapper();

    @Override
    public EvtCdBenefIn comoEvtCdBenefIn(CdBenefIn cdBenefIn) {
        if ( cdBenefIn == null ) {
            return null;
        }

        EvtCdBenefIn evtCdBenefIn = objectFactory.createESocialEvtCdBenefIn();

        evtCdBenefIn.setIdeEmpregador( ideEmpregadorToIdeEmpregador( cdBenefIn.getIdeEmpregador() ) );
        evtCdBenefIn.setBeneficiario( beneficiarioToBeneficiario( cdBenefIn.getBeneficiario() ) );

        return evtCdBenefIn;
    }

    protected br.jus.tst.esocial.esquemas.eventos.cdbenefin.ESocial.EvtCdBenefIn.IdeEmpregador ideEmpregadorToIdeEmpregador(IdeEmpregador ideEmpregador) {
        if ( ideEmpregador == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.cdbenefin.ESocial.EvtCdBenefIn.IdeEmpregador ideEmpregador1 = objectFactory.createESocialEvtCdBenefInIdeEmpregador();

        ideEmpregador1.setTpInsc( ideEmpregador.getTpInsc() );
        ideEmpregador1.setNrInsc( ideEmpregador.getNrInsc() );

        return ideEmpregador1;
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

    protected br.jus.tst.esocial.esquemas.eventos.cdbenefin.ESocial.EvtCdBenefIn.Beneficiario.Endereco enderecoToEndereco(Endereco endereco) {
        if ( endereco == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.cdbenefin.ESocial.EvtCdBenefIn.Beneficiario.Endereco endereco1 = objectFactory.createESocialEvtCdBenefInBeneficiarioEndereco();

        endereco1.setBrasil( enderecoBrasilToTEnderecoBrasil( endereco.getBrasil() ) );
        endereco1.setExterior( enderecoExteriorToTEnderecoExterior( endereco.getExterior() ) );

        return endereco1;
    }

    protected Dependente dependenteToDependente(br.jus.tst.esocial.dominio.beneficiario.inicio.Dependente dependente) {
        if ( dependente == null ) {
            return null;
        }

        Dependente dependente1 = objectFactory.createESocialEvtCdBenefInBeneficiarioDependente();

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

    protected Beneficiario beneficiarioToBeneficiario(br.jus.tst.esocial.dominio.beneficiario.inicio.Beneficiario beneficiario) {
        if ( beneficiario == null ) {
            return null;
        }

        Beneficiario beneficiario1 = objectFactory.createESocialEvtCdBenefInBeneficiario();

        beneficiario1.setCpfBenef( beneficiario.getCpfBenef() );
        beneficiario1.setNmBenefic( beneficiario.getNmBenefic() );
        beneficiario1.setDtNascto( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( beneficiario.getDtNascto() ) );
        beneficiario1.setDtInicio( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( beneficiario.getDtInicio() ) );
        beneficiario1.setSexo( sexoToTSSexo( beneficiario.getSexo() ) );
        beneficiario1.setRacaCor( beneficiario.getRacaCor() );
        beneficiario1.setEstCiv( beneficiario.getEstCiv() );
        beneficiario1.setIncFisMen( simNaoToTSSimNao( beneficiario.getIncFisMen() ) );
        beneficiario1.setDtIncFisMen( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( beneficiario.getDtIncFisMen() ) );
        beneficiario1.setEndereco( enderecoToEndereco( beneficiario.getEndereco() ) );
        if ( beneficiario1.getDependente() != null ) {
            List<Dependente> list = dependenteListToDependenteList( beneficiario.getDependente() );
            if ( list != null ) {
                beneficiario1.getDependente().addAll( list );
            }
        }

        return beneficiario1;
    }
}
