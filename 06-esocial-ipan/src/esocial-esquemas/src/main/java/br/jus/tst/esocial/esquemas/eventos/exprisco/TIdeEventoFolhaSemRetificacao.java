//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:21:12 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.exprisco;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * CHAVE_GRUPO: {indApuracao}, {perApur}, {indGuia}
 * 
 * <p>Classe Java de T_ideEvento_folha_sem_retificacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="T_ideEvento_folha_sem_retificacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indApuracao" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_indApuracao"/>
 *         &lt;element name="perApur" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_perApur"/>
 *         &lt;element name="indGuia" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_indGuia" minOccurs="0"/>
 *         &lt;element name="tpAmb" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_tpAmb"/>
 *         &lt;element name="procEmi" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_procEmi"/>
 *         &lt;element name="verProc" type="{http://www.esocial.gov.br/schema/evt/evtExpRisco/v_S_01_00_00}TS_verProc"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_ideEvento_folha_sem_retificacao", propOrder = {
    "indApuracao",
    "perApur",
    "indGuia",
    "tpAmb",
    "procEmi",
    "verProc"
})
public class TIdeEventoFolhaSemRetificacao {

    protected byte indApuracao;
    @XmlElement(required = true)
    protected String perApur;
    protected Byte indGuia;
    protected byte tpAmb;
    protected byte procEmi;
    @XmlElement(required = true)
    protected String verProc;

    /**
     * Obtém o valor da propriedade indApuracao.
     * 
     */
    public byte getIndApuracao() {
        return indApuracao;
    }

    /**
     * Define o valor da propriedade indApuracao.
     * 
     */
    public void setIndApuracao(byte value) {
        this.indApuracao = value;
    }

    /**
     * Obtém o valor da propriedade perApur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPerApur() {
        return perApur;
    }

    /**
     * Define o valor da propriedade perApur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPerApur(String value) {
        this.perApur = value;
    }

    /**
     * Obtém o valor da propriedade indGuia.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getIndGuia() {
        return indGuia;
    }

    /**
     * Define o valor da propriedade indGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setIndGuia(Byte value) {
        this.indGuia = value;
    }

    /**
     * Obtém o valor da propriedade tpAmb.
     * 
     */
    public byte getTpAmb() {
        return tpAmb;
    }

    /**
     * Define o valor da propriedade tpAmb.
     * 
     */
    public void setTpAmb(byte value) {
        this.tpAmb = value;
    }

    /**
     * Obtém o valor da propriedade procEmi.
     * 
     */
    public byte getProcEmi() {
        return procEmi;
    }

    /**
     * Define o valor da propriedade procEmi.
     * 
     */
    public void setProcEmi(byte value) {
        this.procEmi = value;
    }

    /**
     * Obtém o valor da propriedade verProc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerProc() {
        return verProc;
    }

    /**
     * Define o valor da propriedade verProc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerProc(String value) {
        this.verProc = value;
    }

}
