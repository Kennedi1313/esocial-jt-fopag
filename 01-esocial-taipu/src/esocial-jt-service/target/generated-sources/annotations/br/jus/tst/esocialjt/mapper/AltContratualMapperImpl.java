package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.dominio.endereco.EnderecoBrasil;
import br.jus.tst.esocial.dominio.enums.SimNao;
import br.jus.tst.esocial.dominio.enums.UF;
import br.jus.tst.esocial.dominio.vinculo.AlvaraJudicial;
import br.jus.tst.esocial.dominio.vinculo.HorContratual;
import br.jus.tst.esocial.dominio.vinculo.LocalTrabGeral;
import br.jus.tst.esocial.dominio.vinculo.Remuneracao;
import br.jus.tst.esocial.dominio.vinculo.TreiCap;
import br.jus.tst.esocial.dominio.vinculo.alteracaocontratual.Aprend;
import br.jus.tst.esocial.dominio.vinculo.alteracaocontratual.IdeVinculo;
import br.jus.tst.esocial.esquemas.eventos.altcontratual.ESocial.EvtAltContratual;
import br.jus.tst.esocial.esquemas.eventos.altcontratual.ESocial.EvtAltContratual.AltContratual.Vinculo;
import br.jus.tst.esocial.esquemas.eventos.altcontratual.ESocial.EvtAltContratual.AltContratual.Vinculo.InfoContrato;
import br.jus.tst.esocial.esquemas.eventos.altcontratual.ESocial.EvtAltContratual.AltContratual.Vinculo.InfoContrato.Duracao;
import br.jus.tst.esocial.esquemas.eventos.altcontratual.ESocial.EvtAltContratual.AltContratual.Vinculo.InfoContrato.LocalTrabalho;
import br.jus.tst.esocial.esquemas.eventos.altcontratual.ESocial.EvtAltContratual.AltContratual.Vinculo.InfoContrato.Observacoes;
import br.jus.tst.esocial.esquemas.eventos.altcontratual.ESocial.EvtAltContratual.AltContratual.Vinculo.InfoRegimeTrab;
import br.jus.tst.esocial.esquemas.eventos.altcontratual.ESocial.EvtAltContratual.AltContratual.Vinculo.InfoRegimeTrab.InfoCeletista;
import br.jus.tst.esocial.esquemas.eventos.altcontratual.ESocial.EvtAltContratual.AltContratual.Vinculo.InfoRegimeTrab.InfoCeletista.TrabTemporario;
import br.jus.tst.esocial.esquemas.eventos.altcontratual.ESocial.EvtAltContratual.AltContratual.Vinculo.InfoRegimeTrab.InfoEstatutario;
import br.jus.tst.esocial.esquemas.eventos.altcontratual.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.altcontratual.TAlvaraJudicial;
import br.jus.tst.esocial.esquemas.eventos.altcontratual.TAprend;
import br.jus.tst.esocial.esquemas.eventos.altcontratual.TEnderecoBrasil;
import br.jus.tst.esocial.esquemas.eventos.altcontratual.THorContratual;
import br.jus.tst.esocial.esquemas.eventos.altcontratual.TIdeEmpregador;
import br.jus.tst.esocial.esquemas.eventos.altcontratual.TIdeVinculo;
import br.jus.tst.esocial.esquemas.eventos.altcontratual.TLocalTrabGeral;
import br.jus.tst.esocial.esquemas.eventos.altcontratual.TRemuneracao;
import br.jus.tst.esocial.esquemas.eventos.altcontratual.TSSimNao;
import br.jus.tst.esocial.esquemas.eventos.altcontratual.TSUf;
import br.jus.tst.esocial.esquemas.eventos.altcontratual.TTreiCap;
import br.jus.tst.esocial.ocorrencia.dados.AltContratual;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-17T04:03:13-0200",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class AltContratualMapperImpl extends AltContratualMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();
    private final XMLGregorianCalendarMapper xMLGregorianCalendarMapper = new XMLGregorianCalendarMapper();

    @Override
    public EvtAltContratual comoEvtAltContratual(AltContratual altContratual) {
        if ( altContratual == null ) {
            return null;
        }

        EvtAltContratual evtAltContratual = objectFactory.createESocialEvtAltContratual();

        evtAltContratual.setIdeEmpregador( ideEmpregadorToTIdeEmpregador( altContratual.getIdeEmpregador() ) );
        evtAltContratual.setIdeVinculo( ideVinculoToTIdeVinculo( altContratual.getIdeVinculo() ) );
        evtAltContratual.setAltContratual( altContratualToAltContratual( altContratual.getAltContratual() ) );

        limparNulos( altContratual, evtAltContratual );

        return evtAltContratual;
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

    protected TIdeVinculo ideVinculoToTIdeVinculo(IdeVinculo ideVinculo) {
        if ( ideVinculo == null ) {
            return null;
        }

        TIdeVinculo tIdeVinculo = objectFactory.createTIdeVinculo();

        tIdeVinculo.setCpfTrab( ideVinculo.getCpfTrab() );
        tIdeVinculo.setMatricula( ideVinculo.getMatricula() );

        return tIdeVinculo;
    }

    protected TrabTemporario trabTemporarioToTrabTemporario(br.jus.tst.esocial.dominio.vinculo.alteracaocontratual.TrabTemporario trabTemporario) {
        if ( trabTemporario == null ) {
            return null;
        }

        TrabTemporario trabTemporario1 = objectFactory.createESocialEvtAltContratualAltContratualVinculoInfoRegimeTrabInfoCeletistaTrabTemporario();

        trabTemporario1.setJustProrr( trabTemporario.getJustProrr() );

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

    protected InfoCeletista infoCeletistaToInfoCeletista(br.jus.tst.esocial.dominio.vinculo.alteracaocontratual.InfoCeletista infoCeletista) {
        if ( infoCeletista == null ) {
            return null;
        }

        InfoCeletista infoCeletista1 = objectFactory.createESocialEvtAltContratualAltContratualVinculoInfoRegimeTrabInfoCeletista();

        infoCeletista1.setTpRegJor( infoCeletista.getTpRegJor() );
        infoCeletista1.setNatAtividade( infoCeletista.getNatAtividade() );
        infoCeletista1.setDtBase( infoCeletista.getDtBase() );
        infoCeletista1.setCnpjSindCategProf( infoCeletista.getCnpjSindCategProf() );
        infoCeletista1.setTrabTemporario( trabTemporarioToTrabTemporario( infoCeletista.getTrabTemporario() ) );
        infoCeletista1.setAprend( aprendToTAprend( infoCeletista.getAprend() ) );

        return infoCeletista1;
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

    protected InfoEstatutario infoEstatutarioToInfoEstatutario(br.jus.tst.esocial.dominio.vinculo.alteracaocontratual.InfoEstatutario infoEstatutario) {
        if ( infoEstatutario == null ) {
            return null;
        }

        InfoEstatutario infoEstatutario1 = objectFactory.createESocialEvtAltContratualAltContratualVinculoInfoRegimeTrabInfoEstatutario();

        if ( infoEstatutario.getTpPlanRP() != null ) {
            infoEstatutario1.setTpPlanRP( infoEstatutario.getTpPlanRP() );
        }
        infoEstatutario1.setIndTetoRGPS( simNaoToTSSimNao( infoEstatutario.getIndTetoRGPS() ) );
        infoEstatutario1.setIndAbonoPerm( simNaoToTSSimNao( infoEstatutario.getIndAbonoPerm() ) );

        return infoEstatutario1;
    }

    protected InfoRegimeTrab infoRegimeTrabToInfoRegimeTrab(br.jus.tst.esocial.dominio.vinculo.alteracaocontratual.InfoRegimeTrab infoRegimeTrab) {
        if ( infoRegimeTrab == null ) {
            return null;
        }

        InfoRegimeTrab infoRegimeTrab1 = objectFactory.createESocialEvtAltContratualAltContratualVinculoInfoRegimeTrab();

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

        Duracao duracao1 = objectFactory.createESocialEvtAltContratualAltContratualVinculoInfoContratoDuracao();

        duracao1.setTpContr( duracao.getTpContr() );
        duracao1.setDtTerm( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( duracao.getDtTerm() ) );
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

    protected LocalTrabalho localTrabalhoToLocalTrabalho(br.jus.tst.esocial.dominio.vinculo.LocalTrabalho localTrabalho) {
        if ( localTrabalho == null ) {
            return null;
        }

        LocalTrabalho localTrabalho1 = objectFactory.createESocialEvtAltContratualAltContratualVinculoInfoContratoLocalTrabalho();

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

        Observacoes observacoes1 = objectFactory.createESocialEvtAltContratualAltContratualVinculoInfoContratoObservacoes();

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

        InfoContrato infoContrato1 = objectFactory.createESocialEvtAltContratualAltContratualVinculoInfoContrato();

        infoContrato1.setNmCargo( infoContrato.getNmCargo() );
        infoContrato1.setCBOCargo( infoContrato.getCBOCargo() );
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

    protected Vinculo vinculoToVinculo(br.jus.tst.esocial.dominio.vinculo.alteracaocontratual.Vinculo vinculo) {
        if ( vinculo == null ) {
            return null;
        }

        Vinculo vinculo1 = objectFactory.createESocialEvtAltContratualAltContratualVinculo();

        vinculo1.setTpRegPrev( vinculo.getTpRegPrev() );
        vinculo1.setInfoRegimeTrab( infoRegimeTrabToInfoRegimeTrab( vinculo.getInfoRegimeTrab() ) );
        vinculo1.setInfoContrato( infoContratoToInfoContrato( vinculo.getInfoContrato() ) );

        return vinculo1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.altcontratual.ESocial.EvtAltContratual.AltContratual altContratualToAltContratual(br.jus.tst.esocial.dominio.vinculo.alteracaocontratual.AltContratual altContratual) {
        if ( altContratual == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.altcontratual.ESocial.EvtAltContratual.AltContratual altContratual1 = objectFactory.createESocialEvtAltContratualAltContratual();

        altContratual1.setDtAlteracao( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( altContratual.getDtAlteracao() ) );
        altContratual1.setDtEf( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( altContratual.getDtEf() ) );
        altContratual1.setDscAlt( altContratual.getDscAlt() );
        altContratual1.setVinculo( vinculoToVinculo( altContratual.getVinculo() ) );

        return altContratual1;
    }
}
