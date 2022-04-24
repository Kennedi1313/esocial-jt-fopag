package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.dominio.cessao.FimCessao;
import br.jus.tst.esocial.dominio.cessao.IdeVinculo;
import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.dominio.enums.SimNao;
import br.jus.tst.esocial.esquemas.eventos.cessao.ESocial.EvtCessao;
import br.jus.tst.esocial.esquemas.eventos.cessao.ESocial.EvtCessao.InfoCessao;
import br.jus.tst.esocial.esquemas.eventos.cessao.ESocial.EvtCessao.InfoCessao.IniCessao;
import br.jus.tst.esocial.esquemas.eventos.cessao.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.cessao.TIdeEmpregadorCnpj;
import br.jus.tst.esocial.esquemas.eventos.cessao.TIdeVinculo;
import br.jus.tst.esocial.esquemas.eventos.cessao.TSSimNao;
import br.jus.tst.esocial.ocorrencia.dados.Cessao;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-23T22:04:15-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class CessaoMapperImpl extends CessaoMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();
    private final XMLGregorianCalendarMapper xMLGregorianCalendarMapper = new XMLGregorianCalendarMapper();

    @Override
    public EvtCessao comoEvtCessao(Cessao cessao) {
        if ( cessao == null ) {
            return null;
        }

        EvtCessao evtCessao = objectFactory.createESocialEvtCessao();

        evtCessao.setIdeEmpregador( ideEmpregadorToTIdeEmpregadorCnpj( cessao.getIdeEmpregador() ) );
        evtCessao.setIdeVinculo( ideVinculoToTIdeVinculo( cessao.getIdeVinculo() ) );
        evtCessao.setInfoCessao( infoCessaoToInfoCessao( cessao.getInfoCessao() ) );

        return evtCessao;
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

    protected TIdeVinculo ideVinculoToTIdeVinculo(IdeVinculo ideVinculo) {
        if ( ideVinculo == null ) {
            return null;
        }

        TIdeVinculo tIdeVinculo = objectFactory.createTIdeVinculo();

        tIdeVinculo.setCpfTrab( ideVinculo.getCpfTrab() );
        tIdeVinculo.setMatricula( ideVinculo.getMatricula() );

        return tIdeVinculo;
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

    protected IniCessao iniCessaoToIniCessao(br.jus.tst.esocial.dominio.cessao.IniCessao iniCessao) {
        if ( iniCessao == null ) {
            return null;
        }

        IniCessao iniCessao1 = objectFactory.createESocialEvtCessaoInfoCessaoIniCessao();

        iniCessao1.setDtIniCessao( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( iniCessao.getDtIniCessao() ) );
        iniCessao1.setCnpjCess( iniCessao.getCnpjCess() );
        iniCessao1.setRespRemun( simNaoToTSSimNao( iniCessao.getRespRemun() ) );

        return iniCessao1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.cessao.ESocial.EvtCessao.InfoCessao.FimCessao fimCessaoToFimCessao(FimCessao fimCessao) {
        if ( fimCessao == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.cessao.ESocial.EvtCessao.InfoCessao.FimCessao fimCessao1 = objectFactory.createESocialEvtCessaoInfoCessaoFimCessao();

        fimCessao1.setDtTermCessao( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( fimCessao.getDtTermCessao() ) );

        return fimCessao1;
    }

    protected InfoCessao infoCessaoToInfoCessao(br.jus.tst.esocial.dominio.cessao.InfoCessao infoCessao) {
        if ( infoCessao == null ) {
            return null;
        }

        InfoCessao infoCessao1 = objectFactory.createESocialEvtCessaoInfoCessao();

        infoCessao1.setIniCessao( iniCessaoToIniCessao( infoCessao.getIniCessao() ) );
        infoCessao1.setFimCessao( fimCessaoToFimCessao( infoCessao.getFimCessao() ) );

        return infoCessao1;
    }
}
