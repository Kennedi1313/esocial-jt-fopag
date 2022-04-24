package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.dominio.exclusao.InfoExclusao;
import br.jus.tst.esocial.esquemas.eventos.exclusao.ESocial.EvtExclusao;
import br.jus.tst.esocial.esquemas.eventos.exclusao.ESocial.EvtExclusao.InfoExclusao.IdeFolhaPagto;
import br.jus.tst.esocial.esquemas.eventos.exclusao.ESocial.EvtExclusao.InfoExclusao.IdeTrabalhador;
import br.jus.tst.esocial.esquemas.eventos.exclusao.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.exclusao.TIdeEmpregadorExclusao;
import br.jus.tst.esocial.ocorrencia.dados.Exclusao;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-23T22:04:13-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class ExclusaoMapperImpl extends ExclusaoMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();

    @Override
    public EvtExclusao comoEvtExclusao(Exclusao exclusao) {
        if ( exclusao == null ) {
            return null;
        }

        EvtExclusao evtExclusao = objectFactory.createESocialEvtExclusao();

        evtExclusao.setIdeEmpregador( ideEmpregadorToTIdeEmpregadorExclusao( exclusao.getIdeEmpregador() ) );
        evtExclusao.setInfoExclusao( infoExclusaoToInfoExclusao( exclusao.getInfoExclusao() ) );

        limparNulos( evtExclusao );

        return evtExclusao;
    }

    protected TIdeEmpregadorExclusao ideEmpregadorToTIdeEmpregadorExclusao(IdeEmpregador ideEmpregador) {
        if ( ideEmpregador == null ) {
            return null;
        }

        TIdeEmpregadorExclusao tIdeEmpregadorExclusao = objectFactory.createTIdeEmpregadorExclusao();

        tIdeEmpregadorExclusao.setTpInsc( ideEmpregador.getTpInsc() );
        tIdeEmpregadorExclusao.setNrInsc( ideEmpregador.getNrInsc() );

        return tIdeEmpregadorExclusao;
    }

    protected IdeTrabalhador ideTrabalhadorToIdeTrabalhador(br.jus.tst.esocial.dominio.trabalhador.identificacaobasica.IdeTrabalhador ideTrabalhador) {
        if ( ideTrabalhador == null ) {
            return null;
        }

        IdeTrabalhador ideTrabalhador1 = objectFactory.createESocialEvtExclusaoInfoExclusaoIdeTrabalhador();

        ideTrabalhador1.setCpfTrab( ideTrabalhador.getCpfTrab() );

        return ideTrabalhador1;
    }

    protected IdeFolhaPagto ideFolhaPagtoToIdeFolhaPagto(br.jus.tst.esocial.dominio.exclusao.IdeFolhaPagto ideFolhaPagto) {
        if ( ideFolhaPagto == null ) {
            return null;
        }

        IdeFolhaPagto ideFolhaPagto1 = objectFactory.createESocialEvtExclusaoInfoExclusaoIdeFolhaPagto();

        ideFolhaPagto1.setIndApuracao( ideFolhaPagto.getIndApuracao() );
        ideFolhaPagto1.setPerApur( ideFolhaPagto.getPerApur() );

        return ideFolhaPagto1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.exclusao.ESocial.EvtExclusao.InfoExclusao infoExclusaoToInfoExclusao(InfoExclusao infoExclusao) {
        if ( infoExclusao == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.exclusao.ESocial.EvtExclusao.InfoExclusao infoExclusao1 = objectFactory.createESocialEvtExclusaoInfoExclusao();

        infoExclusao1.setTpEvento( infoExclusao.getTpEvento() );
        infoExclusao1.setNrRecEvt( infoExclusao.getNrRecEvt() );
        infoExclusao1.setIdeTrabalhador( ideTrabalhadorToIdeTrabalhador( infoExclusao.getIdeTrabalhador() ) );
        infoExclusao1.setIdeFolhaPagto( ideFolhaPagtoToIdeFolhaPagto( infoExclusao.getIdeFolhaPagto() ) );

        return infoExclusao1;
    }
}
