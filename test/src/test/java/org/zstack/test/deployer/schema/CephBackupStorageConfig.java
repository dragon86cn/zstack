//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.27 at 08:13:36 PM CST 
//


package org.zstack.test.deployer.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CephBackupStorageConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CephBackupStorageConfig">
 *   &lt;complexContent>
 *     &lt;extension base="{http://zstack.org/schema/zstack}BackupStorageConfigBase">
 *       &lt;attribute name="fsid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="monUrl" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CephBackupStorageConfig")
public class CephBackupStorageConfig
    extends BackupStorageConfigBase
{

    @XmlAttribute(name = "fsid")
    protected String fsid;
    @XmlAttribute(name = "monUrl")
    protected String monUrl;

    /**
     * Gets the value of the fsid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFsid() {
        return fsid;
    }

    /**
     * Sets the value of the fsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFsid(String value) {
        this.fsid = value;
    }

    /**
     * Gets the value of the monUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMonUrl() {
        return monUrl;
    }

    /**
     * Sets the value of the monUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMonUrl(String value) {
        this.monUrl = value;
    }

}
