package br.jus.tst.esocialjt.mapper;

import br.jus.tst.esocial.dominio.empregador.DadosIsencao;
import br.jus.tst.esocial.dominio.empregador.IdeEmpregador;
import br.jus.tst.esocial.dominio.empregador.InfoCadastro;
import br.jus.tst.esocial.dominio.empregador.InfoEmpregador;
import br.jus.tst.esocial.dominio.periodo.IdePeriodo;
import br.jus.tst.esocial.esquemas.eventos.infoempregador.ESocial.EvtInfoEmpregador;
import br.jus.tst.esocial.esquemas.eventos.infoempregador.ESocial.EvtInfoEmpregador.InfoEmpregador.Alteracao;
import br.jus.tst.esocial.esquemas.eventos.infoempregador.ESocial.EvtInfoEmpregador.InfoEmpregador.Exclusao;
import br.jus.tst.esocial.esquemas.eventos.infoempregador.ESocial.EvtInfoEmpregador.InfoEmpregador.Inclusao;
import br.jus.tst.esocial.esquemas.eventos.infoempregador.ObjectFactory;
import br.jus.tst.esocial.esquemas.eventos.infoempregador.TIdePeriodo;
import br.jus.tst.esocial.esquemas.eventos.infoempregador.TInfoCadastro;
import br.jus.tst.esocial.esquemas.eventos.infoempregador.TInfoCadastro.InfoOrgInternacional;
import br.jus.tst.esocial.ocorrencia.dados.InformacoesEmpregador;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-23T22:04:14-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_202 (Oracle Corporation)"
)
public class EmpregadorMapperImpl extends EmpregadorMapper {

    private final ObjectFactory objectFactory = new ObjectFactory();
    private final XMLGregorianCalendarMapper xMLGregorianCalendarMapper = new XMLGregorianCalendarMapper();

    @Override
    public EvtInfoEmpregador comoEvtInfoEmpregadorInclusao(InformacoesEmpregador informacaoEmpregador) {
        if ( informacaoEmpregador == null ) {
            return null;
        }

        EvtInfoEmpregador evtInfoEmpregador = objectFactory.createESocialEvtInfoEmpregador();

        evtInfoEmpregador.setInfoEmpregador( informacoesEmpregadorToInfoEmpregador( informacaoEmpregador ) );
        evtInfoEmpregador.setIdeEmpregador( ideEmpregadorToIdeEmpregador( informacaoEmpregador.getIdeEmpregador() ) );

        limparNulos( informacaoEmpregador, evtInfoEmpregador );

        return evtInfoEmpregador;
    }

    @Override
    public EvtInfoEmpregador comoEvtInfoEmpregadorAlteracao(InformacoesEmpregador informacaoEmpregador) {
        if ( informacaoEmpregador == null ) {
            return null;
        }

        EvtInfoEmpregador evtInfoEmpregador = objectFactory.createESocialEvtInfoEmpregador();

        evtInfoEmpregador.setInfoEmpregador( informacoesEmpregadorToInfoEmpregador1( informacaoEmpregador ) );
        evtInfoEmpregador.setIdeEmpregador( ideEmpregadorToIdeEmpregador( informacaoEmpregador.getIdeEmpregador() ) );

        limparNulos( informacaoEmpregador, evtInfoEmpregador );

        return evtInfoEmpregador;
    }

    @Override
    public EvtInfoEmpregador comoEvtInfoEmpregadorExclusao(InformacoesEmpregador informacaoEmpregador) {
        if ( informacaoEmpregador == null ) {
            return null;
        }

        EvtInfoEmpregador evtInfoEmpregador = objectFactory.createESocialEvtInfoEmpregador();

        evtInfoEmpregador.setInfoEmpregador( informacoesEmpregadorToInfoEmpregador2( informacaoEmpregador ) );
        evtInfoEmpregador.setIdeEmpregador( ideEmpregadorToIdeEmpregador( informacaoEmpregador.getIdeEmpregador() ) );

        limparNulos( informacaoEmpregador, evtInfoEmpregador );

        return evtInfoEmpregador;
    }

    protected TIdePeriodo idePeriodoToTIdePeriodo(IdePeriodo idePeriodo) {
        if ( idePeriodo == null ) {
            return null;
        }

        TIdePeriodo tIdePeriodo = objectFactory.createTIdePeriodo();

        tIdePeriodo.setIniValid( idePeriodo.getIniValid() );
        tIdePeriodo.setFimValid( idePeriodo.getFimValid() );

        return tIdePeriodo;
    }

    protected br.jus.tst.esocial.esquemas.eventos.infoempregador.TInfoCadastro.DadosIsencao dadosIsencaoToDadosIsencao(DadosIsencao dadosIsencao) {
        if ( dadosIsencao == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.infoempregador.TInfoCadastro.DadosIsencao dadosIsencao1 = objectFactory.createTInfoCadastroDadosIsencao();

        dadosIsencao1.setIdeMinLei( dadosIsencao.getIdeMinLei() );
        dadosIsencao1.setNrCertif( dadosIsencao.getNrCertif() );
        dadosIsencao1.setDtEmisCertif( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( dadosIsencao.getDtEmisCertif() ) );
        dadosIsencao1.setDtVencCertif( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( dadosIsencao.getDtVencCertif() ) );
        dadosIsencao1.setNrProtRenov( dadosIsencao.getNrProtRenov() );
        dadosIsencao1.setDtProtRenov( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( dadosIsencao.getDtProtRenov() ) );
        dadosIsencao1.setDtDou( xMLGregorianCalendarMapper.paraXMLGregorianCalendar( dadosIsencao.getDtDou() ) );
        dadosIsencao1.setPagDou( dadosIsencao.getPagDou() );

        return dadosIsencao1;
    }

    protected InfoOrgInternacional infoOrgInternacionalToInfoOrgInternacional(br.jus.tst.esocial.dominio.empregador.orgaointernacional.InfoOrgInternacional infoOrgInternacional) {
        if ( infoOrgInternacional == null ) {
            return null;
        }

        InfoOrgInternacional infoOrgInternacional1 = objectFactory.createTInfoCadastroInfoOrgInternacional();

        if ( infoOrgInternacional.getIndAcordoIsenMulta() != null ) {
            infoOrgInternacional1.setIndAcordoIsenMulta( infoOrgInternacional.getIndAcordoIsenMulta() );
        }

        return infoOrgInternacional1;
    }

    protected TInfoCadastro infoCadastroToTInfoCadastro(InfoCadastro infoCadastro) {
        if ( infoCadastro == null ) {
            return null;
        }

        TInfoCadastro tInfoCadastro = objectFactory.createTInfoCadastro();

        tInfoCadastro.setClassTrib( infoCadastro.getClassTrib() );
        tInfoCadastro.setIndCoop( infoCadastro.getIndCoop() );
        tInfoCadastro.setIndConstr( infoCadastro.getIndConstr() );
        if ( infoCadastro.getIndDesFolha() != null ) {
            tInfoCadastro.setIndDesFolha( infoCadastro.getIndDesFolha() );
        }
        tInfoCadastro.setIndOpcCP( infoCadastro.getIndOpcCP() );
        tInfoCadastro.setIndPorte( infoCadastro.getIndPorte() );
        if ( infoCadastro.getIndOptRegEletron() != null ) {
            tInfoCadastro.setIndOptRegEletron( infoCadastro.getIndOptRegEletron() );
        }
        tInfoCadastro.setCnpjEFR( infoCadastro.getCnpjEFR() );
        tInfoCadastro.setDadosIsencao( dadosIsencaoToDadosIsencao( infoCadastro.getDadosIsencao() ) );
        tInfoCadastro.setInfoOrgInternacional( infoOrgInternacionalToInfoOrgInternacional( infoCadastro.getInfoOrgInternacional() ) );

        return tInfoCadastro;
    }

    protected Inclusao infoEmpregadorToInclusao(InfoEmpregador infoEmpregador) {
        if ( infoEmpregador == null ) {
            return null;
        }

        Inclusao inclusao = objectFactory.createESocialEvtInfoEmpregadorInfoEmpregadorInclusao();

        inclusao.setIdePeriodo( idePeriodoToTIdePeriodo( infoEmpregador.getIdePeriodo() ) );
        inclusao.setInfoCadastro( infoCadastroToTInfoCadastro( infoEmpregador.getInfoCadastro() ) );

        return inclusao;
    }

    protected br.jus.tst.esocial.esquemas.eventos.infoempregador.ESocial.EvtInfoEmpregador.InfoEmpregador informacoesEmpregadorToInfoEmpregador(InformacoesEmpregador informacoesEmpregador) {
        if ( informacoesEmpregador == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.infoempregador.ESocial.EvtInfoEmpregador.InfoEmpregador infoEmpregador = objectFactory.createESocialEvtInfoEmpregadorInfoEmpregador();

        infoEmpregador.setInclusao( infoEmpregadorToInclusao( informacoesEmpregador.getInfoEmpregador() ) );

        return infoEmpregador;
    }

    protected br.jus.tst.esocial.esquemas.eventos.infoempregador.ESocial.EvtInfoEmpregador.IdeEmpregador ideEmpregadorToIdeEmpregador(IdeEmpregador ideEmpregador) {
        if ( ideEmpregador == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.infoempregador.ESocial.EvtInfoEmpregador.IdeEmpregador ideEmpregador1 = objectFactory.createESocialEvtInfoEmpregadorIdeEmpregador();

        ideEmpregador1.setTpInsc( ideEmpregador.getTpInsc() );
        ideEmpregador1.setNrInsc( ideEmpregador.getNrInsc() );

        return ideEmpregador1;
    }

    protected Alteracao infoEmpregadorToAlteracao(InfoEmpregador infoEmpregador) {
        if ( infoEmpregador == null ) {
            return null;
        }

        Alteracao alteracao = objectFactory.createESocialEvtInfoEmpregadorInfoEmpregadorAlteracao();

        alteracao.setIdePeriodo( idePeriodoToTIdePeriodo( infoEmpregador.getIdePeriodo() ) );
        alteracao.setInfoCadastro( infoCadastroToTInfoCadastro( infoEmpregador.getInfoCadastro() ) );
        alteracao.setNovaValidade( idePeriodoToTIdePeriodo( infoEmpregador.getNovaValidade() ) );

        return alteracao;
    }

    protected br.jus.tst.esocial.esquemas.eventos.infoempregador.ESocial.EvtInfoEmpregador.InfoEmpregador informacoesEmpregadorToInfoEmpregador1(InformacoesEmpregador informacoesEmpregador) {
        if ( informacoesEmpregador == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.infoempregador.ESocial.EvtInfoEmpregador.InfoEmpregador infoEmpregador = objectFactory.createESocialEvtInfoEmpregadorInfoEmpregador();

        infoEmpregador.setAlteracao( infoEmpregadorToAlteracao( informacoesEmpregador.getInfoEmpregador() ) );

        return infoEmpregador;
    }

    protected Exclusao infoEmpregadorToExclusao(InfoEmpregador infoEmpregador) {
        if ( infoEmpregador == null ) {
            return null;
        }

        Exclusao exclusao = objectFactory.createESocialEvtInfoEmpregadorInfoEmpregadorExclusao();

        exclusao.setIdePeriodo( idePeriodoToTIdePeriodo( infoEmpregador.getIdePeriodo() ) );

        return exclusao;
    }

    protected br.jus.tst.esocial.esquemas.eventos.infoempregador.ESocial.EvtInfoEmpregador.InfoEmpregador informacoesEmpregadorToInfoEmpregador2(InformacoesEmpregador informacoesEmpregador) {
        if ( informacoesEmpregador == null ) {
            return null;
        }

        br.jus.tst.esocial.esquemas.eventos.infoempregador.ESocial.EvtInfoEmpregador.InfoEmpregador infoEmpregador = objectFactory.createESocialEvtInfoEmpregadorInfoEmpregador();

        infoEmpregador.setExclusao( infoEmpregadorToExclusao( informacoesEmpregador.getInfoEmpregador() ) );

        return infoEmpregador;
    }
}
