package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.dominio.enums.SimNao;
import br.jus.tst.esocial.dominio.ideEvento.IdeEventoFolhaSemRetificacao;
import br.jus.tst.esocial.esquemas.eventos.fechaevper.ESocial.EvtFechaEvPer;
import br.jus.tst.esocial.esquemas.eventos.fechaevper.ESocial.EvtFechaEvPer.InfoFech;
import br.jus.tst.esocial.esquemas.eventos.fechaevper.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.fechaevper.TIdeEmpregador;
import br.jus.tst.esocial.esquemas.eventos.fechaevper.TIdeEventoFolhaSemRetificacao;
import br.jus.tst.esocial.esquemas.eventos.fechaevper.TSSimNao;
import br.jus.tst.esocial.ocorrencia.dados.FechaEvPer;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-17T04:03:14-0200",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class FechaEvPerMapperImpl extends FechaEvPerMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();
    private final IdeEventoMapper ideEventoMapper = new IdeEventoMapper();

    @Override
    public EvtFechaEvPer comoEvtFechaEvPer(FechaEvPer fechaEvPer) {
        if ( fechaEvPer == null ) {
            return null;
        }

        EvtFechaEvPer evtFechaEvPer = objectFactory.createESocialEvtFechaEvPer();

        evtFechaEvPer.setIdeEvento( ideEventoFolhaSemRetificacaoToTIdeEventoFolhaSemRetificacao( fechaEvPer.getIdeEvento() ) );
        evtFechaEvPer.setIdeEmpregador( ideEmpregadorToTIdeEmpregador( fechaEvPer.getIdeEmpregador() ) );
        evtFechaEvPer.setInfoFech( infoFechToInfoFech( fechaEvPer.getInfoFech() ) );

        limparNulos( evtFechaEvPer );

        return evtFechaEvPer;
    }

    protected TIdeEventoFolhaSemRetificacao ideEventoFolhaSemRetificacaoToTIdeEventoFolhaSemRetificacao(IdeEventoFolhaSemRetificacao ideEventoFolhaSemRetificacao) {
        if ( ideEventoFolhaSemRetificacao == null ) {
            return null;
        }

        TIdeEventoFolhaSemRetificacao tIdeEventoFolhaSemRetificacao = objectFactory.createTIdeEventoFolhaSemRetificacao();

        tIdeEventoFolhaSemRetificacao.setIndApuracao( ideEventoFolhaSemRetificacao.getIndApuracao() );
        tIdeEventoFolhaSemRetificacao.setPerApur( ideEventoFolhaSemRetificacao.getPerApur() );
        tIdeEventoFolhaSemRetificacao.setIndGuia( ideEventoFolhaSemRetificacao.getIndGuia() );

        return tIdeEventoFolhaSemRetificacao;
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

    protected InfoFech infoFechToInfoFech(br.jus.tst.esocial.dominio.pagamento.InfoFech infoFech) {
        if ( infoFech == null ) {
            return null;
        }

        InfoFech infoFech1 = objectFactory.createESocialEvtFechaEvPerInfoFech();

        infoFech1.setEvtRemun( simNaoToTSSimNao( infoFech.getEvtRemun() ) );
        infoFech1.setEvtComProd( simNaoToTSSimNao( infoFech.getEvtComProd() ) );
        infoFech1.setEvtContratAvNP( simNaoToTSSimNao( infoFech.getEvtContratAvNP() ) );
        infoFech1.setEvtInfoComplPer( simNaoToTSSimNao( infoFech.getEvtInfoComplPer() ) );
        infoFech1.setIndExcApur1250( infoFech.getIndExcApur1250() );

        return infoFech1;
    }
}
