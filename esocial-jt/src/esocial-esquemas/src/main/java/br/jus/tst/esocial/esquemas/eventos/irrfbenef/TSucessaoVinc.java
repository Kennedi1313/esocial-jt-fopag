//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.15 at 02:18:43 PM BRT 
//


package br.jus.tst.esocial.esquemas.eventos.irrfbenef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for T_sucessaoVinc complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="T_sucessaoVinc">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpInsc" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_tpInsc_1_2"/>
 *         &lt;element name="nrInsc" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_nrInsc_11_14"/>
 *         &lt;element name="matricAnt" type="{http://www.esocial.gov.br/schema/evt/evtIrrfBenef/v_S_01_00_00}TS_codigo_esocial" minOccurs="0"/>
 *         &lt;element name="dtAdm" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "T_sucessaoVinc", propOrder = {
    "tpInsc",
    "nrInsc",
    "matricAnt",
    "dtAdm"
})
public class TSucessaoVinc {

    protected byte tpInsc;
    @XmlElement(required = true)
    protected String nrInsc;
    protected String matricAnt;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtAdm;

    /**
     * Gets the value of the tpInsc property.
     * 
     */
    public byte getTpInsc() {
        return tpInsc;
    }

    /**
     * Sets the value of the tpInsc property.
     * 
     */
    public void setTpInsc(byte value) {
        this.tpInsc = value;
    }

    /**
     * Gets the value of the nrInsc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrInsc() {
        return nrInsc;
    }

    /**
     * Sets the value of the nrInsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrInsc(String value) {
        this.nrInsc = value;
    }

    /**
     * Gets the value of the matricAnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatricAnt() {
        return matricAnt;
    }

    /**
     * Sets the value of the matricAnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatricAnt(String value) {
        this.matricAnt = value;
    }

    /**
     * Gets the value of the dtAdm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtAdm() {
        return dtAdm;
    }

    /**
     * Sets the value of the dtAdm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtAdm(XMLGregorianCalendar value) {
        this.dtAdm = value;
    }

}