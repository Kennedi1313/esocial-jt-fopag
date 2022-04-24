//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.15 at 02:18:46 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.pgtos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="evtPgtos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_00_00}T_ideEvento_folha_mensal"/>
 *                   &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_00_00}T_ideEmpregador"/>
 *                   &lt;element name="ideBenef">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_00_00}TS_cpf"/>
 *                             &lt;element name="infoPgto" maxOccurs="999">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dtPgto" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                       &lt;element name="tpPgto">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
 *                                             &lt;enumeration value="1"/>
 *                                             &lt;enumeration value="2"/>
 *                                             &lt;enumeration value="3"/>
 *                                             &lt;enumeration value="4"/>
 *                                             &lt;enumeration value="5"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_00_00}TS_perApur"/>
 *                                       &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_00_00}TS_codigo_esocial"/>
 *                                       &lt;element name="vrLiq" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_00_00}TS_valorMonetario"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_00_00}TS_Id" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "evtPgtos",
    "signature"
})
@XmlRootElement(name = "eSocial")
public class ESocial {

    @XmlElement(required = true)
    protected ESocial.EvtPgtos evtPgtos;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Gets the value of the evtPgtos property.
     * 
     * @return
     *     possible object is
     *     {@link ESocial.EvtPgtos }
     *     
     */
    public ESocial.EvtPgtos getEvtPgtos() {
        return evtPgtos;
    }

    /**
     * Sets the value of the evtPgtos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESocial.EvtPgtos }
     *     
     */
    public void setEvtPgtos(ESocial.EvtPgtos value) {
        this.evtPgtos = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ideEvento" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_00_00}T_ideEvento_folha_mensal"/>
     *         &lt;element name="ideEmpregador" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_00_00}T_ideEmpregador"/>
     *         &lt;element name="ideBenef">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_00_00}TS_cpf"/>
     *                   &lt;element name="infoPgto" maxOccurs="999">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dtPgto" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                             &lt;element name="tpPgto">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
     *                                   &lt;enumeration value="1"/>
     *                                   &lt;enumeration value="2"/>
     *                                   &lt;enumeration value="3"/>
     *                                   &lt;enumeration value="4"/>
     *                                   &lt;enumeration value="5"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_00_00}TS_perApur"/>
     *                             &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_00_00}TS_codigo_esocial"/>
     *                             &lt;element name="vrLiq" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_00_00}TS_valorMonetario"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_00_00}TS_Id" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ideEvento",
        "ideEmpregador",
        "ideBenef"
    })
    public static class EvtPgtos {

        @XmlElement(required = true)
        protected TIdeEventoFolhaMensal ideEvento;
        @XmlElement(required = true)
        protected TIdeEmpregador ideEmpregador;
        @XmlElement(required = true)
        protected ESocial.EvtPgtos.IdeBenef ideBenef;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Gets the value of the ideEvento property.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEventoFolhaMensal }
         *     
         */
        public TIdeEventoFolhaMensal getIdeEvento() {
            return ideEvento;
        }

        /**
         * Sets the value of the ideEvento property.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEventoFolhaMensal }
         *     
         */
        public void setIdeEvento(TIdeEventoFolhaMensal value) {
            this.ideEvento = value;
        }

        /**
         * Gets the value of the ideEmpregador property.
         * 
         * @return
         *     possible object is
         *     {@link TIdeEmpregador }
         *     
         */
        public TIdeEmpregador getIdeEmpregador() {
            return ideEmpregador;
        }

        /**
         * Sets the value of the ideEmpregador property.
         * 
         * @param value
         *     allowed object is
         *     {@link TIdeEmpregador }
         *     
         */
        public void setIdeEmpregador(TIdeEmpregador value) {
            this.ideEmpregador = value;
        }

        /**
         * Gets the value of the ideBenef property.
         * 
         * @return
         *     possible object is
         *     {@link ESocial.EvtPgtos.IdeBenef }
         *     
         */
        public ESocial.EvtPgtos.IdeBenef getIdeBenef() {
            return ideBenef;
        }

        /**
         * Sets the value of the ideBenef property.
         * 
         * @param value
         *     allowed object is
         *     {@link ESocial.EvtPgtos.IdeBenef }
         *     
         */
        public void setIdeBenef(ESocial.EvtPgtos.IdeBenef value) {
            this.ideBenef = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="cpfBenef" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_00_00}TS_cpf"/>
         *         &lt;element name="infoPgto" maxOccurs="999">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dtPgto" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                   &lt;element name="tpPgto">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
         *                         &lt;enumeration value="1"/>
         *                         &lt;enumeration value="2"/>
         *                         &lt;enumeration value="3"/>
         *                         &lt;enumeration value="4"/>
         *                         &lt;enumeration value="5"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_00_00}TS_perApur"/>
         *                   &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_00_00}TS_codigo_esocial"/>
         *                   &lt;element name="vrLiq" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_00_00}TS_valorMonetario"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cpfBenef",
            "infoPgto"
        })
        public static class IdeBenef {

            @XmlElement(required = true)
            protected String cpfBenef;
            @XmlElement(required = true)
            protected List<ESocial.EvtPgtos.IdeBenef.InfoPgto> infoPgto;

            /**
             * Gets the value of the cpfBenef property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCpfBenef() {
                return cpfBenef;
            }

            /**
             * Sets the value of the cpfBenef property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCpfBenef(String value) {
                this.cpfBenef = value;
            }

            /**
             * Gets the value of the infoPgto property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the infoPgto property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInfoPgto().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ESocial.EvtPgtos.IdeBenef.InfoPgto }
             * 
             * 
             */
            public List<ESocial.EvtPgtos.IdeBenef.InfoPgto> getInfoPgto() {
                if (infoPgto == null) {
                    infoPgto = new ArrayList<ESocial.EvtPgtos.IdeBenef.InfoPgto>();
                }
                return this.infoPgto;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="dtPgto" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *         &lt;element name="tpPgto">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte">
             *               &lt;enumeration value="1"/>
             *               &lt;enumeration value="2"/>
             *               &lt;enumeration value="3"/>
             *               &lt;enumeration value="4"/>
             *               &lt;enumeration value="5"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="perRef" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_00_00}TS_perApur"/>
             *         &lt;element name="ideDmDev" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_00_00}TS_codigo_esocial"/>
             *         &lt;element name="vrLiq" type="{http://www.esocial.gov.br/schema/evt/evtPgtos/v_S_01_00_00}TS_valorMonetario"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "dtPgto",
                "tpPgto",
                "perRef",
                "ideDmDev",
                "vrLiq"
            })
            public static class InfoPgto {

                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dtPgto;
                protected byte tpPgto;
                @XmlElement(required = true)
                protected String perRef;
                @XmlElement(required = true)
                protected String ideDmDev;
                @XmlElement(required = true)
                protected BigDecimal vrLiq;

                /**
                 * Gets the value of the dtPgto property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDtPgto() {
                    return dtPgto;
                }

                /**
                 * Sets the value of the dtPgto property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDtPgto(XMLGregorianCalendar value) {
                    this.dtPgto = value;
                }

                /**
                 * Gets the value of the tpPgto property.
                 * 
                 */
                public byte getTpPgto() {
                    return tpPgto;
                }

                /**
                 * Sets the value of the tpPgto property.
                 * 
                 */
                public void setTpPgto(byte value) {
                    this.tpPgto = value;
                }

                /**
                 * Gets the value of the perRef property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPerRef() {
                    return perRef;
                }

                /**
                 * Sets the value of the perRef property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPerRef(String value) {
                    this.perRef = value;
                }

                /**
                 * Gets the value of the ideDmDev property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIdeDmDev() {
                    return ideDmDev;
                }

                /**
                 * Sets the value of the ideDmDev property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIdeDmDev(String value) {
                    this.ideDmDev = value;
                }

                /**
                 * Gets the value of the vrLiq property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getVrLiq() {
                    return vrLiq;
                }

                /**
                 * Sets the value of the vrLiq property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setVrLiq(BigDecimal value) {
                    this.vrLiq = value;
                }

            }

        }

    }

}