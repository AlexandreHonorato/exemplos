
package br.com.ws.service.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for person complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="person">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="anoNascimento" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="cidadeNascimento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "person", propOrder = {
    "anoNascimento",
    "cidadeNascimento",
    "id",
    "nome"
})
public class Person {

    protected int anoNascimento;
    protected String cidadeNascimento;
    protected long id;
    protected String nome;

    /**
     * Gets the value of the anoNascimento property.
     * 
     */
    public int getAnoNascimento() {
        return anoNascimento;
    }

    /**
     * Sets the value of the anoNascimento property.
     * 
     */
    public void setAnoNascimento(int value) {
        this.anoNascimento = value;
    }

    /**
     * Gets the value of the cidadeNascimento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidadeNascimento() {
        return cidadeNascimento;
    }

    /**
     * Sets the value of the cidadeNascimento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidadeNascimento(String value) {
        this.cidadeNascimento = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

	@Override
	public String toString() {
		return "Person [SERVICE] [anoNascimento=" + anoNascimento + ", cidadeNascimento="
				+ cidadeNascimento + ", id=" + id + ", nome=" + nome + "]";
	}

}
