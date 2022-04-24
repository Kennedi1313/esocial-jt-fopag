package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.dominio.afasttemp.IdeVinculo;
import br.jus.tst.esocial.dominio.afasttemp.InfoAfastamento;
import br.jus.tst.esocial.dominio.afasttemp.InfoCessao;
import br.jus.tst.esocial.dominio.afasttemp.InfoMandElet;
import br.jus.tst.esocial.dominio.afasttemp.PerAquis;
import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.dominio.enums.SimNao;
import br.jus.tst.esocial.esquemas.eventos.afasttemp.ESocial.EvtAfastTemp;
import br.jus.tst.esocial.esquemas.eventos.afasttemp.ESocial.EvtAfastTemp.InfoAfastamento.FimAfastamento;
import br.jus.tst.esocial.esquemas.eventos.afasttemp.ESocial.EvtAfastTemp.InfoAfastamento.InfoRetif;
import br.jus.tst.esocial.esquemas.eventos.afasttemp.ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento;
import br.jus.tst.esocial.esquemas.eventos.afasttemp.ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoMandSind;
import br.jus.tst.esocial.esquemas.eventos.afasttemp.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.afasttemp.TIdeEmpregador;
import br.jus.tst.esocial.esquemas.eventos.afasttemp.TSSimNao;
import br.jus.tst.esocial.ocorrencia.dados.AfastTemp;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-23T22:04:13-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class AfastTempMapperImpl extends AfastTempMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();
    private final XMLGregorianCalendarMapper xMLGregorianCalendarMapper = new XMLGregorianCalendarMapper();

    @Override
    public EvtAfastTemp comoEvtAfastTemp(AfastTemp afastTemp) {
        if ( afastTemp == null ) {
            return null;
        }

        EvtAfastTemp evtAfastTemp = objectFactory.createESocialEvtAfastTemp();

        evtAfastTemp.setIdeEmpregador( ideEmpregadorToTIdeEmpregador( afastTemp.getIdeEmpregador() ) );
        evtAfastTemp.setIdeVinculo( ideVinculoToIdeVinculo( afastTemp.getIdeVinculo() ) );
        evtAfastTemp.setInfoAfastamento( infoAfastamentoToInfoAfastamento( afastTemp.getInfoAfastamento() ) );

        limparNulos( evtAfastTemp );

        return evtAfastTemp;
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

    protected br.jus.tst.esocial.esquemas.eventos.afasttemp.ESocial.EvtAfastTemp.IdeVinculo ideVinculoToIdeVinculo(IdeVinculo ideVinculo) {
        if ( ideVinculo == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.afasttemp.ESocial.EvtAfastTemp.IdeVinculo ideVinculo1 = objectFactory.createESocialEvtAfastTempIdeVinculo();

        ideVinculo1.setCpfTrab( ideVinculo.getCpfTrab() );
        ideVinculo1.setMatricula( ideVinculo.getMatricula() );
        ideVinculo1.setCodCateg( ideVinculo.getCodCateg() );

        return ideVinculo1;
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

    protected br.jus.tst.esocial.esquemas.eventos.afasttemp.ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.PerAquis perAquisToPerAquis(PerAquis perAquis) {
        if ( perAquis == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.afasttemp.ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.PerAquis perAquis1 = objectFactory.createESocialEvtAfastTempInfoAfastamentoIniAfastamentoPerAquis();

        perAquis1.setDtInicio( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( perAquis.getDtInicio() ) );
        perAquis1.setDtFim( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( perAquis.getDtFim() ) );

        return perAquis1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.afasttemp.ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoCessao infoCessaoToInfoCessao(InfoCessao infoCessao) {
        if ( infoCessao == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.afasttemp.ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoCessao infoCessao1 = objectFactory.createESocialEvtAfastTempInfoAfastamentoIniAfastamentoInfoCessao();

        infoCessao1.setCnpjCess( infoCessao.getCnpjCess() );
        infoCessao1.setInfOnus( infoCessao.getInfOnus() );

        return infoCessao1;
    }

    protected InfoMandSind infoMandSindToInfoMandSind(br.jus.tst.esocial.dominio.afasttemp.InfoMandSind infoMandSind) {
        if ( infoMandSind == null ) {
            return null;
        }

        InfoMandSind infoMandSind1 = objectFactory.createESocialEvtAfastTempInfoAfastamentoIniAfastamentoInfoMandSind();

        infoMandSind1.setCnpjSind( infoMandSind.getCnpjSind() );
        infoMandSind1.setInfOnusRemun( infoMandSind.getInfOnusRemun() );

        return infoMandSind1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.afasttemp.ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoMandElet infoMandEletToInfoMandElet(InfoMandElet infoMandElet) {
        if ( infoMandElet == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.afasttemp.ESocial.EvtAfastTemp.InfoAfastamento.IniAfastamento.InfoMandElet infoMandElet1 = objectFactory.createESocialEvtAfastTempInfoAfastamentoIniAfastamentoInfoMandElet();

        infoMandElet1.setCnpjMandElet( infoMandElet.getCnpjMandElet() );
        infoMandElet1.setIndRemunCargo( simNaoToTSSimNao( infoMandElet.getIndRemunCargo() ) );

        return infoMandElet1;
    }

    protected IniAfastamento iniAfastamentoToIniAfastamento(br.jus.tst.esocial.dominio.afasttemp.IniAfastamento iniAfastamento) {
        if ( iniAfastamento == null ) {
            return null;
        }

        IniAfastamento iniAfastamento1 = objectFactory.createESocialEvtAfastTempInfoAfastamentoIniAfastamento();

        iniAfastamento1.setDtIniAfast( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( iniAfastamento.getDtIniAfast() ) );
        iniAfastamento1.setCodMotAfast( iniAfastamento.getCodMotAfast() );
        iniAfastamento1.setInfoMesmoMtv( simNaoToTSSimNao( iniAfastamento.getInfoMesmoMtv() ) );
        iniAfastamento1.setTpAcidTransito( iniAfastamento.getTpAcidTransito() );
        iniAfastamento1.setObservacao( iniAfastamento.getObservacao() );
        iniAfastamento1.setPerAquis( perAquisToPerAquis( iniAfastamento.getPerAquis() ) );
        iniAfastamento1.setInfoCessao( infoCessaoToInfoCessao( iniAfastamento.getInfoCessao() ) );
        iniAfastamento1.setInfoMandSind( infoMandSindToInfoMandSind( iniAfastamento.getInfoMandSind() ) );
        iniAfastamento1.setInfoMandElet( infoMandEletToInfoMandElet( iniAfastamento.getInfoMandElet() ) );

        return iniAfastamento1;
    }

    protected InfoRetif infoRetifToInfoRetif(br.jus.tst.esocial.dominio.afasttemp.InfoRetif infoRetif) {
        if ( infoRetif == null ) {
            return null;
        }

        InfoRetif infoRetif1 = objectFactory.createESocialEvtAfastTempInfoAfastamentoInfoRetif();

        infoRetif1.setOrigRetif( infoRetif.getOrigRetif() );
        infoRetif1.setTpProc( infoRetif.getTpProc() );
        infoRetif1.setNrProc( infoRetif.getNrProc() );

        return infoRetif1;
    }

    protected FimAfastamento fimAfastamentoToFimAfastamento(br.jus.tst.esocial.dominio.afasttemp.FimAfastamento fimAfastamento) {
        if ( fimAfastamento == null ) {
            return null;
        }

        FimAfastamento fimAfastamento1 = objectFactory.createESocialEvtAfastTempInfoAfastamentoFimAfastamento();

        fimAfastamento1.setDtTermAfast( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( fimAfastamento.getDtTermAfast() ) );

        return fimAfastamento1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.afasttemp.ESocial.EvtAfastTemp.InfoAfastamento infoAfastamentoToInfoAfastamento(InfoAfastamento infoAfastamento) {
        if ( infoAfastamento == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.afasttemp.ESocial.EvtAfastTemp.InfoAfastamento infoAfastamento1 = objectFactory.createESocialEvtAfastTempInfoAfastamento();

        infoAfastamento1.setIniAfastamento( iniAfastamentoToIniAfastamento( infoAfastamento.getIniAfastamento() ) );
        infoAfastamento1.setInfoRetif( infoRetifToInfoRetif( infoAfastamento.getInfoRetif() ) );
        infoAfastamento1.setFimAfastamento( fimAfastamentoToFimAfastamento( infoAfastamento.getFimAfastamento() ) );

        return infoAfastamento1;
    }
}
