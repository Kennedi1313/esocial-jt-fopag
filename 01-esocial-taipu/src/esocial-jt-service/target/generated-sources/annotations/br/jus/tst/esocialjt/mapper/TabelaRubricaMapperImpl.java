package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.dominio.enums.SimNao;
import br.jus.tst.esocial.dominio.periodo.IdePeriodo;
import br.jus.tst.esocial.dominio.tabela.rubrica.DadosRubrica;
import br.jus.tst.esocial.dominio.tabela.rubrica.IdeRubrica;
import br.jus.tst.esocial.esquemas.eventos.tabrubrica.ESocial.EvtTabRubrica;
import br.jus.tst.esocial.esquemas.eventos.tabrubrica.ESocial.EvtTabRubrica.InfoRubrica;
import br.jus.tst.esocial.esquemas.eventos.tabrubrica.ESocial.EvtTabRubrica.InfoRubrica.Alteracao;
import br.jus.tst.esocial.esquemas.eventos.tabrubrica.ESocial.EvtTabRubrica.InfoRubrica.Exclusao;
import br.jus.tst.esocial.esquemas.eventos.tabrubrica.ESocial.EvtTabRubrica.InfoRubrica.Inclusao;
import br.jus.tst.esocial.esquemas.eventos.tabrubrica.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.tabrubrica.TDadosRubrica;
import br.jus.tst.esocial.esquemas.eventos.tabrubrica.TDadosRubrica.IdeProcessoCP;
import br.jus.tst.esocial.esquemas.eventos.tabrubrica.TDadosRubrica.IdeProcessoFGTS;
import br.jus.tst.esocial.esquemas.eventos.tabrubrica.TDadosRubrica.IdeProcessoIRRF;
import br.jus.tst.esocial.esquemas.eventos.tabrubrica.TIdeEmpregador;
import br.jus.tst.esocial.esquemas.eventos.tabrubrica.TIdeRubrica;
import br.jus.tst.esocial.esquemas.eventos.tabrubrica.TNovaValidade;
import br.jus.tst.esocial.esquemas.eventos.tabrubrica.TSSimNao;
import br.jus.tst.esocial.ocorrencia.dados.TabelaRubrica;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-17T04:03:15-0200",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class TabelaRubricaMapperImpl extends TabelaRubricaMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();

    @Override
    public EvtTabRubrica comoEvtTabRubricaInclusao(TabelaRubrica tabelaRubrica) {
        if ( tabelaRubrica == null ) {
            return null;
        }

        EvtTabRubrica evtTabRubrica = objectFactory.createESocialEvtTabRubrica();

        evtTabRubrica.setInfoRubrica( tabelaRubricaToInfoRubrica( tabelaRubrica ) );
        evtTabRubrica.setIdeEmpregador( ideEmpregadorToTIdeEmpregador( tabelaRubrica.getIdeEmpregador() ) );

        limparNulos( tabelaRubrica, evtTabRubrica );

        return evtTabRubrica;
    }

    @Override
    public EvtTabRubrica comoEvtTabRubricaAlteracao(TabelaRubrica tabelaRubrica) {
        if ( tabelaRubrica == null ) {
            return null;
        }

        EvtTabRubrica evtTabRubrica = objectFactory.createESocialEvtTabRubrica();

        evtTabRubrica.setInfoRubrica( tabelaRubricaToInfoRubrica1( tabelaRubrica ) );
        evtTabRubrica.setIdeEmpregador( ideEmpregadorToTIdeEmpregador( tabelaRubrica.getIdeEmpregador() ) );

        limparNulos( tabelaRubrica, evtTabRubrica );

        return evtTabRubrica;
    }

    @Override
    public EvtTabRubrica comoEvtTabRubricaExclusao(TabelaRubrica tabelaRubrica) {
        if ( tabelaRubrica == null ) {
            return null;
        }

        EvtTabRubrica evtTabRubrica = objectFactory.createESocialEvtTabRubrica();

        evtTabRubrica.setInfoRubrica( tabelaRubricaToInfoRubrica2( tabelaRubrica ) );
        evtTabRubrica.setIdeEmpregador( ideEmpregadorToTIdeEmpregador( tabelaRubrica.getIdeEmpregador() ) );

        limparNulos( tabelaRubrica, evtTabRubrica );

        return evtTabRubrica;
    }

    protected TIdeRubrica ideRubricaToTIdeRubrica(IdeRubrica ideRubrica) {
        if ( ideRubrica == null ) {
            return null;
        }

        TIdeRubrica tIdeRubrica = objectFactory.createTIdeRubrica();

        tIdeRubrica.setCodRubr( ideRubrica.getCodRubr() );
        tIdeRubrica.setIdeTabRubr( ideRubrica.getIdeTabRubr() );
        tIdeRubrica.setIniValid( ideRubrica.getIniValid() );
        tIdeRubrica.setFimValid( ideRubrica.getFimValid() );

        return tIdeRubrica;
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

    protected IdeProcessoCP ideProcessoCPToIdeProcessoCP(br.jus.tst.esocial.dominio.tabela.rubrica.IdeProcessoCP ideProcessoCP) {
        if ( ideProcessoCP == null ) {
            return null;
        }

        IdeProcessoCP ideProcessoCP1 = objectFactory.createTDadosRubricaIdeProcessoCP();

        ideProcessoCP1.setTpProc( ideProcessoCP.getTpProc() );
        ideProcessoCP1.setNrProc( ideProcessoCP.getNrProc() );
        ideProcessoCP1.setExtDecisao( ideProcessoCP.getExtDecisao() );
        ideProcessoCP1.setCodSusp( ideProcessoCP.getCodSusp() );

        return ideProcessoCP1;
    }

    protected List<IdeProcessoCP> ideProcessoCPListToIdeProcessoCPList(List<br.jus.tst.esocial.dominio.tabela.rubrica.IdeProcessoCP> list) {
        if ( list == null ) {
            return null;
        }

        List<IdeProcessoCP> list1 = new ArrayList<IdeProcessoCP>( list.size() );
        for ( br.jus.tst.esocial.dominio.tabela.rubrica.IdeProcessoCP ideProcessoCP : list ) {
            list1.add( ideProcessoCPToIdeProcessoCP( ideProcessoCP ) );
        }

        return list1;
    }

    protected IdeProcessoIRRF ideProcessoIRRFToIdeProcessoIRRF(br.jus.tst.esocial.dominio.tabela.rubrica.IdeProcessoIRRF ideProcessoIRRF) {
        if ( ideProcessoIRRF == null ) {
            return null;
        }

        IdeProcessoIRRF ideProcessoIRRF1 = objectFactory.createTDadosRubricaIdeProcessoIRRF();

        ideProcessoIRRF1.setNrProc( ideProcessoIRRF.getNrProc() );
        ideProcessoIRRF1.setCodSusp( ideProcessoIRRF.getCodSusp() );

        return ideProcessoIRRF1;
    }

    protected List<IdeProcessoIRRF> ideProcessoIRRFListToIdeProcessoIRRFList(List<br.jus.tst.esocial.dominio.tabela.rubrica.IdeProcessoIRRF> list) {
        if ( list == null ) {
            return null;
        }

        List<IdeProcessoIRRF> list1 = new ArrayList<IdeProcessoIRRF>( list.size() );
        for ( br.jus.tst.esocial.dominio.tabela.rubrica.IdeProcessoIRRF ideProcessoIRRF : list ) {
            list1.add( ideProcessoIRRFToIdeProcessoIRRF( ideProcessoIRRF ) );
        }

        return list1;
    }

    protected IdeProcessoFGTS ideProcessoFGTSToIdeProcessoFGTS(br.jus.tst.esocial.dominio.tabela.rubrica.IdeProcessoFGTS ideProcessoFGTS) {
        if ( ideProcessoFGTS == null ) {
            return null;
        }

        IdeProcessoFGTS ideProcessoFGTS1 = objectFactory.createTDadosRubricaIdeProcessoFGTS();

        ideProcessoFGTS1.setNrProc( ideProcessoFGTS.getNrProc() );

        return ideProcessoFGTS1;
    }

    protected List<IdeProcessoFGTS> ideProcessoFGTSListToIdeProcessoFGTSList(List<br.jus.tst.esocial.dominio.tabela.rubrica.IdeProcessoFGTS> list) {
        if ( list == null ) {
            return null;
        }

        List<IdeProcessoFGTS> list1 = new ArrayList<IdeProcessoFGTS>( list.size() );
        for ( br.jus.tst.esocial.dominio.tabela.rubrica.IdeProcessoFGTS ideProcessoFGTS : list ) {
            list1.add( ideProcessoFGTSToIdeProcessoFGTS( ideProcessoFGTS ) );
        }

        return list1;
    }

    protected TDadosRubrica dadosRubricaToTDadosRubrica(DadosRubrica dadosRubrica) {
        if ( dadosRubrica == null ) {
            return null;
        }

        TDadosRubrica tDadosRubrica = objectFactory.createTDadosRubrica();

        tDadosRubrica.setDscRubr( dadosRubrica.getDscRubr() );
        tDadosRubrica.setNatRubr( dadosRubrica.getNatRubr() );
        tDadosRubrica.setTpRubr( dadosRubrica.getTpRubr() );
        tDadosRubrica.setCodIncCP( dadosRubrica.getCodIncCP() );
        tDadosRubrica.setCodIncIRRF( dadosRubrica.getCodIncIRRF() );
        tDadosRubrica.setCodIncFGTS( dadosRubrica.getCodIncFGTS() );
        tDadosRubrica.setCodIncCPRP( dadosRubrica.getCodIncCPRP() );
        tDadosRubrica.setTetoRemun( simNaoToTSSimNao( dadosRubrica.getTetoRemun() ) );
        tDadosRubrica.setObservacao( dadosRubrica.getObservacao() );
        if ( tDadosRubrica.getIdeProcessoCP() != null ) {
            List<IdeProcessoCP> list = ideProcessoCPListToIdeProcessoCPList( dadosRubrica.getIdeProcessoCP() );
            if ( list != null ) {
                tDadosRubrica.getIdeProcessoCP().addAll( list );
            }
        }
        if ( tDadosRubrica.getIdeProcessoIRRF() != null ) {
            List<IdeProcessoIRRF> list1 = ideProcessoIRRFListToIdeProcessoIRRFList( dadosRubrica.getIdeProcessoIRRF() );
            if ( list1 != null ) {
                tDadosRubrica.getIdeProcessoIRRF().addAll( list1 );
            }
        }
        if ( tDadosRubrica.getIdeProcessoFGTS() != null ) {
            List<IdeProcessoFGTS> list2 = ideProcessoFGTSListToIdeProcessoFGTSList( dadosRubrica.getIdeProcessoFGTS() );
            if ( list2 != null ) {
                tDadosRubrica.getIdeProcessoFGTS().addAll( list2 );
            }
        }

        return tDadosRubrica;
    }

    protected Inclusao infoRubricaToInclusao(br.jus.tst.esocial.dominio.tabela.rubrica.InfoRubrica infoRubrica) {
        if ( infoRubrica == null ) {
            return null;
        }

        Inclusao inclusao = objectFactory.createESocialEvtTabRubricaInfoRubricaInclusao();

        inclusao.setIdeRubrica( ideRubricaToTIdeRubrica( infoRubrica.getIdeRubrica() ) );
        inclusao.setDadosRubrica( dadosRubricaToTDadosRubrica( infoRubrica.getDadosRubrica() ) );

        return inclusao;
    }

    protected InfoRubrica tabelaRubricaToInfoRubrica(TabelaRubrica tabelaRubrica) {
        if ( tabelaRubrica == null ) {
            return null;
        }

        InfoRubrica infoRubrica = objectFactory.createESocialEvtTabRubricaInfoRubrica();

        infoRubrica.setInclusao( infoRubricaToInclusao( tabelaRubrica.getInfoRubrica() ) );

        return infoRubrica;
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

    protected TNovaValidade idePeriodoToTNovaValidade(IdePeriodo idePeriodo) {
        if ( idePeriodo == null ) {
            return null;
        }

        TNovaValidade tNovaValidade = objectFactory.createTNovaValidade();

        tNovaValidade.setIniValid( idePeriodo.getIniValid() );
        tNovaValidade.setFimValid( idePeriodo.getFimValid() );

        return tNovaValidade;
    }

    protected Alteracao infoRubricaToAlteracao(br.jus.tst.esocial.dominio.tabela.rubrica.InfoRubrica infoRubrica) {
        if ( infoRubrica == null ) {
            return null;
        }

        Alteracao alteracao = objectFactory.createESocialEvtTabRubricaInfoRubricaAlteracao();

        alteracao.setIdeRubrica( ideRubricaToTIdeRubrica( infoRubrica.getIdeRubrica() ) );
        alteracao.setDadosRubrica( dadosRubricaToTDadosRubrica( infoRubrica.getDadosRubrica() ) );
        alteracao.setNovaValidade( idePeriodoToTNovaValidade( infoRubrica.getNovaValidade() ) );

        return alteracao;
    }

    protected InfoRubrica tabelaRubricaToInfoRubrica1(TabelaRubrica tabelaRubrica) {
        if ( tabelaRubrica == null ) {
            return null;
        }

        InfoRubrica infoRubrica = objectFactory.createESocialEvtTabRubricaInfoRubrica();

        infoRubrica.setAlteracao( infoRubricaToAlteracao( tabelaRubrica.getInfoRubrica() ) );

        return infoRubrica;
    }

    protected Exclusao infoRubricaToExclusao(br.jus.tst.esocial.dominio.tabela.rubrica.InfoRubrica infoRubrica) {
        if ( infoRubrica == null ) {
            return null;
        }

        Exclusao exclusao = objectFactory.createESocialEvtTabRubricaInfoRubricaExclusao();

        exclusao.setIdeRubrica( ideRubricaToTIdeRubrica( infoRubrica.getIdeRubrica() ) );

        return exclusao;
    }

    protected InfoRubrica tabelaRubricaToInfoRubrica2(TabelaRubrica tabelaRubrica) {
        if ( tabelaRubrica == null ) {
            return null;
        }

        InfoRubrica infoRubrica = objectFactory.createESocialEvtTabRubricaInfoRubrica();

        infoRubrica.setExclusao( infoRubricaToExclusao( tabelaRubrica.getInfoRubrica() ) );

        return infoRubrica;
    }
}
