package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.dominio.periodo.IdePeriodo;
import br.jus.tst.esocial.dominio.tabela.estabelecimento.DadosEstab;
import br.jus.tst.esocial.dominio.tabela.estabelecimento.IdeEstab;
import br.jus.tst.esocial.dominio.tabela.estabelecimento.InfoEstab;
import br.jus.tst.esocial.dominio.tabela.estabelecimento.InfoTrab;
import br.jus.tst.esocial.dominio.tabela.estabelecimento.ProcAdmJudFap;
import br.jus.tst.esocial.esquemas.eventos.tabestab.ESocial.EvtTabEstab;
import br.jus.tst.esocial.esquemas.eventos.tabestab.ESocial.EvtTabEstab.InfoEstab.Alteracao;
import br.jus.tst.esocial.esquemas.eventos.tabestab.ESocial.EvtTabEstab.InfoEstab.Exclusao;
import br.jus.tst.esocial.esquemas.eventos.tabestab.ESocial.EvtTabEstab.InfoEstab.Inclusao;
import br.jus.tst.esocial.esquemas.eventos.tabestab.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.tabestab.TDadosEstab;
import br.jus.tst.esocial.esquemas.eventos.tabestab.TDadosEstab.AliqGilrat;
import br.jus.tst.esocial.esquemas.eventos.tabestab.TDadosEstab.AliqGilrat.ProcAdmJudRat;
import br.jus.tst.esocial.esquemas.eventos.tabestab.TDadosEstab.InfoCaepf;
import br.jus.tst.esocial.esquemas.eventos.tabestab.TDadosEstab.InfoObra;
import br.jus.tst.esocial.esquemas.eventos.tabestab.TDadosEstab.InfoTrab.InfoApr;
import br.jus.tst.esocial.esquemas.eventos.tabestab.TDadosEstab.InfoTrab.InfoApr.InfoEntEduc;
import br.jus.tst.esocial.esquemas.eventos.tabestab.TDadosEstab.InfoTrab.InfoPCD;
import br.jus.tst.esocial.esquemas.eventos.tabestab.TIdeEmpregador;
import br.jus.tst.esocial.esquemas.eventos.tabestab.TIdeEstab;
import br.jus.tst.esocial.esquemas.eventos.tabestab.TNovaValidade;
import br.jus.tst.esocial.ocorrencia.dados.TabelaEstabelecimento;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-23T22:04:12-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class TabelaEstabelecimentoMapperImpl extends TabelaEstabelecimentoMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();

    @Override
    public EvtTabEstab comoEvtTabEstabInclusao(TabelaEstabelecimento tabelaEstabelecimento) {
        if ( tabelaEstabelecimento == null ) {
            return null;
        }

        EvtTabEstab evtTabEstab = objectFactory.createESocialEvtTabEstab();

        evtTabEstab.setInfoEstab( tabelaEstabelecimentoToInfoEstab( tabelaEstabelecimento ) );
        evtTabEstab.setIdeEmpregador( ideEmpregadorToTIdeEmpregador( tabelaEstabelecimento.getIdeEmpregador() ) );

        limparNulos( tabelaEstabelecimento, evtTabEstab );

        return evtTabEstab;
    }

    @Override
    public EvtTabEstab comoEvtTabEstabAlteracao(TabelaEstabelecimento tabelaEstabelecimento) {
        if ( tabelaEstabelecimento == null ) {
            return null;
        }

        EvtTabEstab evtTabEstab = objectFactory.createESocialEvtTabEstab();

        evtTabEstab.setInfoEstab( tabelaEstabelecimentoToInfoEstab1( tabelaEstabelecimento ) );
        evtTabEstab.setIdeEmpregador( ideEmpregadorToTIdeEmpregador( tabelaEstabelecimento.getIdeEmpregador() ) );

        limparNulos( tabelaEstabelecimento, evtTabEstab );

        return evtTabEstab;
    }

    @Override
    public EvtTabEstab comoEvtTabEstabExclusao(TabelaEstabelecimento tabelaEstabelecimento) {
        if ( tabelaEstabelecimento == null ) {
            return null;
        }

        EvtTabEstab evtTabEstab = objectFactory.createESocialEvtTabEstab();

        evtTabEstab.setInfoEstab( tabelaEstabelecimentoToInfoEstab2( tabelaEstabelecimento ) );
        evtTabEstab.setIdeEmpregador( ideEmpregadorToTIdeEmpregador( tabelaEstabelecimento.getIdeEmpregador() ) );

        limparNulos( tabelaEstabelecimento, evtTabEstab );

        return evtTabEstab;
    }

    protected TIdeEstab ideEstabToTIdeEstab(IdeEstab ideEstab) {
        if ( ideEstab == null ) {
            return null;
        }

        TIdeEstab tIdeEstab = objectFactory.createTIdeEstab();

        tIdeEstab.setTpInsc( ideEstab.getTpInsc() );
        tIdeEstab.setNrInsc( ideEstab.getNrInsc() );
        tIdeEstab.setIniValid( ideEstab.getIniValid() );
        tIdeEstab.setFimValid( ideEstab.getFimValid() );

        return tIdeEstab;
    }

    protected ProcAdmJudRat procAdmJudRatToProcAdmJudRat(br.jus.tst.esocial.dominio.tabela.estabelecimento.ProcAdmJudRat procAdmJudRat) {
        if ( procAdmJudRat == null ) {
            return null;
        }

        ProcAdmJudRat procAdmJudRat1 = objectFactory.createTDadosEstabAliqGilratProcAdmJudRat();

        procAdmJudRat1.setTpProc( procAdmJudRat.getTpProc() );
        procAdmJudRat1.setNrProc( procAdmJudRat.getNrProc() );
        procAdmJudRat1.setCodSusp( procAdmJudRat.getCodSusp() );

        return procAdmJudRat1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.tabestab.TDadosEstab.AliqGilrat.ProcAdmJudFap procAdmJudFapToProcAdmJudFap(ProcAdmJudFap procAdmJudFap) {
        if ( procAdmJudFap == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tabestab.TDadosEstab.AliqGilrat.ProcAdmJudFap procAdmJudFap1 = objectFactory.createTDadosEstabAliqGilratProcAdmJudFap();

        procAdmJudFap1.setTpProc( procAdmJudFap.getTpProc() );
        procAdmJudFap1.setNrProc( procAdmJudFap.getNrProc() );
        procAdmJudFap1.setCodSusp( procAdmJudFap.getCodSusp() );

        return procAdmJudFap1;
    }

    protected AliqGilrat aliqGilratToAliqGilrat(br.jus.tst.esocial.dominio.tabela.estabelecimento.AliqGilrat aliqGilrat) {
        if ( aliqGilrat == null ) {
            return null;
        }

        AliqGilrat aliqGilrat1 = objectFactory.createTDadosEstabAliqGilrat();

        aliqGilrat1.setAliqRat( aliqGilrat.getAliqRat() );
        aliqGilrat1.setFap( aliqGilrat.getFap() );
        aliqGilrat1.setProcAdmJudRat( procAdmJudRatToProcAdmJudRat( aliqGilrat.getProcAdmJudRat() ) );
        aliqGilrat1.setProcAdmJudFap( procAdmJudFapToProcAdmJudFap( aliqGilrat.getProcAdmJudFap() ) );

        return aliqGilrat1;
    }

    protected InfoCaepf infoCaepfToInfoCaepf(br.jus.tst.esocial.dominio.tabela.estabelecimento.InfoCaepf infoCaepf) {
        if ( infoCaepf == null ) {
            return null;
        }

        InfoCaepf infoCaepf1 = objectFactory.createTDadosEstabInfoCaepf();

        infoCaepf1.setTpCaepf( infoCaepf.getTpCaepf() );

        return infoCaepf1;
    }

    protected InfoObra infoObraToInfoObra(br.jus.tst.esocial.dominio.tabela.estabelecimento.InfoObra infoObra) {
        if ( infoObra == null ) {
            return null;
        }

        InfoObra infoObra1 = objectFactory.createTDadosEstabInfoObra();

        infoObra1.setIndSubstPatrObra( infoObra.getIndSubstPatrObra() );

        return infoObra1;
    }

    protected InfoEntEduc infoEntEducToInfoEntEduc(br.jus.tst.esocial.dominio.tabela.estabelecimento.InfoEntEduc infoEntEduc) {
        if ( infoEntEduc == null ) {
            return null;
        }

        InfoEntEduc infoEntEduc1 = objectFactory.createTDadosEstabInfoTrabInfoAprInfoEntEduc();

        infoEntEduc1.setNrInsc( infoEntEduc.getNrInsc() );

        return infoEntEduc1;
    }

    protected List<InfoEntEduc> infoEntEducListToInfoEntEducList(List<br.jus.tst.esocial.dominio.tabela.estabelecimento.InfoEntEduc> list) {
        if ( list == null ) {
            return null;
        }

        List<InfoEntEduc> list1 = new ArrayList<InfoEntEduc>( list.size() );
        for ( br.jus.tst.esocial.dominio.tabela.estabelecimento.InfoEntEduc infoEntEduc : list ) {
            list1.add( infoEntEducToInfoEntEduc( infoEntEduc ) );
        }

        return list1;
    }

    protected InfoApr infoAprToInfoApr(br.jus.tst.esocial.dominio.tabela.estabelecimento.InfoApr infoApr) {
        if ( infoApr == null ) {
            return null;
        }

        InfoApr infoApr1 = objectFactory.createTDadosEstabInfoTrabInfoApr();

        infoApr1.setNrProcJud( infoApr.getNrProcJud() );
        if ( infoApr1.getInfoEntEduc() != null ) {
            List<InfoEntEduc> list = infoEntEducListToInfoEntEducList( infoApr.getInfoEntEduc() );
            if ( list != null ) {
                infoApr1.getInfoEntEduc().addAll( list );
            }
        }

        return infoApr1;
    }

    protected InfoPCD infoPCDToInfoPCD(br.jus.tst.esocial.dominio.tabela.estabelecimento.InfoPCD infoPCD) {
        if ( infoPCD == null ) {
            return null;
        }

        InfoPCD infoPCD1 = objectFactory.createTDadosEstabInfoTrabInfoPCD();

        infoPCD1.setNrProcJud( infoPCD.getNrProcJud() );

        return infoPCD1;
    }

    protected br.jus.tst.esocial.esquemas.eventos.tabestab.TDadosEstab.InfoTrab infoTrabToInfoTrab(InfoTrab infoTrab) {
        if ( infoTrab == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tabestab.TDadosEstab.InfoTrab infoTrab1 = objectFactory.createTDadosEstabInfoTrab();

        infoTrab1.setInfoApr( infoAprToInfoApr( infoTrab.getInfoApr() ) );
        infoTrab1.setInfoPCD( infoPCDToInfoPCD( infoTrab.getInfoPCD() ) );

        return infoTrab1;
    }

    protected TDadosEstab dadosEstabToTDadosEstab(DadosEstab dadosEstab) {
        if ( dadosEstab == null ) {
            return null;
        }

        TDadosEstab tDadosEstab = objectFactory.createTDadosEstab();

        tDadosEstab.setCnaePrep( dadosEstab.getCnaePrep() );
        tDadosEstab.setAliqGilrat( aliqGilratToAliqGilrat( dadosEstab.getAliqGilrat() ) );
        tDadosEstab.setInfoCaepf( infoCaepfToInfoCaepf( dadosEstab.getInfoCaepf() ) );
        tDadosEstab.setInfoObra( infoObraToInfoObra( dadosEstab.getInfoObra() ) );
        tDadosEstab.setInfoTrab( infoTrabToInfoTrab( dadosEstab.getInfoTrab() ) );

        return tDadosEstab;
    }

    protected Inclusao infoEstabToInclusao(InfoEstab infoEstab) {
        if ( infoEstab == null ) {
            return null;
        }

        Inclusao inclusao = objectFactory.createESocialEvtTabEstabInfoEstabInclusao();

        inclusao.setIdeEstab( ideEstabToTIdeEstab( infoEstab.getIdeEstab() ) );
        inclusao.setDadosEstab( dadosEstabToTDadosEstab( infoEstab.getDadosEstab() ) );

        return inclusao;
    }

    protected br.jus.tst.esocial.esquemas.eventos.tabestab.ESocial.EvtTabEstab.InfoEstab tabelaEstabelecimentoToInfoEstab(TabelaEstabelecimento tabelaEstabelecimento) {
        if ( tabelaEstabelecimento == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tabestab.ESocial.EvtTabEstab.InfoEstab infoEstab = objectFactory.createESocialEvtTabEstabInfoEstab();

        infoEstab.setInclusao( infoEstabToInclusao( tabelaEstabelecimento.getInfoEstab() ) );

        return infoEstab;
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

    protected Alteracao infoEstabToAlteracao(InfoEstab infoEstab) {
        if ( infoEstab == null ) {
            return null;
        }

        Alteracao alteracao = objectFactory.createESocialEvtTabEstabInfoEstabAlteracao();

        alteracao.setIdeEstab( ideEstabToTIdeEstab( infoEstab.getIdeEstab() ) );
        alteracao.setDadosEstab( dadosEstabToTDadosEstab( infoEstab.getDadosEstab() ) );
        alteracao.setNovaValidade( idePeriodoToTNovaValidade( infoEstab.getNovaValidade() ) );

        return alteracao;
    }

    protected br.jus.tst.esocial.esquemas.eventos.tabestab.ESocial.EvtTabEstab.InfoEstab tabelaEstabelecimentoToInfoEstab1(TabelaEstabelecimento tabelaEstabelecimento) {
        if ( tabelaEstabelecimento == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tabestab.ESocial.EvtTabEstab.InfoEstab infoEstab = objectFactory.createESocialEvtTabEstabInfoEstab();

        infoEstab.setAlteracao( infoEstabToAlteracao( tabelaEstabelecimento.getInfoEstab() ) );

        return infoEstab;
    }

    protected Exclusao infoEstabToExclusao(InfoEstab infoEstab) {
        if ( infoEstab == null ) {
            return null;
        }

        Exclusao exclusao = objectFactory.createESocialEvtTabEstabInfoEstabExclusao();

        exclusao.setIdeEstab( ideEstabToTIdeEstab( infoEstab.getIdeEstab() ) );

        return exclusao;
    }

    protected br.jus.tst.esocial.esquemas.eventos.tabestab.ESocial.EvtTabEstab.InfoEstab tabelaEstabelecimentoToInfoEstab2(TabelaEstabelecimento tabelaEstabelecimento) {
        if ( tabelaEstabelecimento == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.tabestab.ESocial.EvtTabEstab.InfoEstab infoEstab = objectFactory.createESocialEvtTabEstabInfoEstab();

        infoEstab.setExclusao( infoEstabToExclusao( tabelaEstabelecimento.getInfoEstab() ) );

        return infoEstab;
    }
}
