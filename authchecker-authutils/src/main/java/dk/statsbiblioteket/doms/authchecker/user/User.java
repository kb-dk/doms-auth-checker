//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2.1.1-4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.10.01 at 02:40:52 PM CEST 
//


package dk.statsbiblioteket.doms.authchecker.user;


import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * <p>Java class for user complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="user">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attributes" type="{}roles" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user", propOrder = {
        "username",
        "attributes",
        "password"

})
@XmlRootElement
public class User{

    @XmlElement(required = true)
    protected String username;
    @XmlElement()
    protected List<Roles> attributes;
    @XmlElement(required = true)
    protected String password;

    @XmlTransient
    protected String ID;




    public User() {

    }

    public User(String username,
                String password,
                String ID,
                List<Roles> attributes) {
        this();
        this.username = username;
        this.password = password;
        this.ID = ID;
        this.attributes = attributes;
    }

    public User(String username,
                String password,
                String ID,
                Roles attributes) {
        this();
        this.username = username;
        this.password = password;
        this.ID = ID;
        getAttributes().add(attributes);
    }

    /**
     * Gets the value of the username property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the attributes property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Roles }
     *
     *
     */
    public List<Roles> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<Roles>();
        }
        return this.attributes;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }


    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", attributes=" + attributes +
                ", password='" + password + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}
