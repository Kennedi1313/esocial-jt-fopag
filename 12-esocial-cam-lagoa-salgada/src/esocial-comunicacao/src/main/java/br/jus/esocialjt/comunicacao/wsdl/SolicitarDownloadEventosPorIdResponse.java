//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2021.03.05 às 03:20:20 PM BRT 
//


package br.jus.esocialjt.comunicacao.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SolicitarDownloadEventosPorIdResult" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "solicitarDownloadEventosPorIdResult"
})
@XmlRootElement(name = "SolicitarDownloadEventosPorIdResponse", namespace = "http://www.esocial.gov.br/servicos/empregador/download/solicitacao/v1_0_0")
public class SolicitarDownloadEventosPorIdResponse {

    @XmlElement(name = "SolicitarDownloadEventosPorIdResult", namespace = "http://www.esocial.gov.br/servicos/empregador/download/solicitacao/v1_0_0")
    protected SolicitarDownloadEventosPorIdResponse.SolicitarDownloadEventosPorIdResult solicitarDownloadEventosPorIdResult;

    /**
     * Obtém o valor da propriedade solicitarDownloadEventosPorIdResult.
     * 
     * @return
     *     possible object is
     *     {@link SolicitarDownloadEventosPorIdResponse.SolicitarDownloadEventosPorIdResult }
     *     
     */
    public SolicitarDownloadEventosPorIdResponse.SolicitarDownloadEventosPorIdResult getSolicitarDownloadEventosPorIdResult() {
        return solicitarDownloadEventosPorIdResult;
    }

    /**
     * Define o valor da propriedade solicitarDownloadEventosPorIdResult.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitarDownloadEventosPorIdResponse.SolicitarDownloadEventosPorIdResult }
     *     
     */
    public void setSolicitarDownloadEventosPorIdResult(SolicitarDownloadEventosPorIdResponse.SolicitarDownloadEventosPorIdResult value) {
        this.solicitarDownloadEventosPorIdResult = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;any/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class SolicitarDownloadEventosPorIdResult {

        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Obtém o valor da propriedade any.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Define o valor da propriedade any.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
