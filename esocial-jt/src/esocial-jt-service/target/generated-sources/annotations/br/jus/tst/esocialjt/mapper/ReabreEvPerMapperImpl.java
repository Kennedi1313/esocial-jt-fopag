package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.dominio.ideEvento.IdeEventoFolhaSemRetificacao;
import br.jus.tst.esocial.esquemas.eventos.reabreevper.ESocial.EvtReabreEvPer;
import br.jus.tst.esocial.esquemas.eventos.reabreevper.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.reabreevper.TIdeEmpregador;
import br.jus.tst.esocial.esquemas.eventos.reabreevper.TIdeEventoFolhaSemRetificacao;
import br.jus.tst.esocial.ocorrencia.dados.ReabreEvPer;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-23T22:04:13-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class ReabreEvPerMapperImpl extends ReabreEvPerMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();

    @Override
    public EvtReabreEvPer comoEvtReabreEvPer(ReabreEvPer reabreEvPer) {
        if ( reabreEvPer == null ) {
            return null;
        }

        EvtReabreEvPer evtReabreEvPer = objectFactory.createESocialEvtReabreEvPer();

        evtReabreEvPer.setIdeEvento( ideEventoFolhaSemRetificacaoToTIdeEventoFolhaSemRetificacao( reabreEvPer.getIdeEvento() ) );
        evtReabreEvPer.setIdeEmpregador( ideEmpregadorToTIdeEmpregador( reabreEvPer.getIdeEmpregador() ) );

        limparNulos( evtReabreEvPer );

        return evtReabreEvPer;
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
}
