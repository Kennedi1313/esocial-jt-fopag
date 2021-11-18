package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.esquemas.eventos.exclusao.ESocial.EvtExclusao;
import br.jus.tst.esocial.esquemas.eventos.exclusao.ESocial.EvtExclusao.InfoExclusao;
import br.jus.tst.esocial.esquemas.eventos.exclusao.ESocial.EvtExclusao.InfoExclusao.IdeFolhaPagto;
import br.jus.tst.esocial.esquemas.eventos.exclusao.ESocial.EvtExclusao.InfoExclusao.IdeTrabalhador;
import br.jus.tst.esocial.esquemas.eventos.exclusao.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.exclusao.TIdeEmpregador;
import br.jus.tst.esocial.ocorrencia.dados.Exclusao;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-11-17T04:03:14-0200",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class ExclusaoMapperImpl extends ExclusaoMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();

    @Override
    public EvtExclusao comoEvtExclusao(Exclusao exclusao) {
        if ( exclusao == null ) {
            return null;
        }

        EvtExclusao evtExclusao = objectFactory.createESocialEvtExclusao();

        evtExclusao.setIdeEmpregador( ideEmpregadorToTIdeEmpregador( exclusao.getIdeEmpregador() ) );
        evtExclusao.setInfoExclusao( infoExclusaoToInfoExclusao( exclusao.getInfoExclusao() ) );

        limparNulos( evtExclusao );

        return evtExclusao;
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

    protected InfoExclusao infoExclusaoToInfoExclusao(br.jus.tst.esocial.dominio.exclusao.InfoExclusao infoExclusao) {
        if ( infoExclusao == null ) {
            return null;
        }

        InfoExclusao infoExclusao1 = objectFactory.createESocialEvtExclusaoInfoExclusao();

        infoExclusao1.setTpEvento( infoExclusao.getTpEvento() );
        infoExclusao1.setNrRecEvt( infoExclusao.getNrRecEvt() );
        infoExclusao1.setIdeTrabalhador( ideTrabalhadorToIdeTrabalhador( infoExclusao.getIdeTrabalhador() ) );
        infoExclusao1.setIdeFolhaPagto( ideFolhaPagtoToIdeFolhaPagto( infoExclusao.getIdeFolhaPagto() ) );

        return infoExclusao1;
    }
}
