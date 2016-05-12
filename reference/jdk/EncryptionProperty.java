_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperty.java
    void removeEncryptionInformation(Element information);

    /**
     * Removes encryption information.
     *
     * @param information the information to remove.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperty.java
    void addEncryptionInformation(Element information);

    /**
     * Adds encryption information.
     *
     * @param information the additional encryption information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperty.java
    Iterator<Element> getEncryptionInformation();

    /**
     * Returns the properties of the <CODE>EncryptionProperty</CODE>.
     *
     * @return an <code>Iterator</code> over all the additional encryption
     *   information contained in this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperty.java
    void setAttribute(String attribute, String value);

    /**
     * Set the attribute value.
     *
     * @param attribute the attribute's name.
     * @param value the attribute's value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperty.java
    String getAttribute(String attribute);

    /**
     * Returns the attribute's value in the <code>xml</code> namespace.
     *
     * @param attribute
     * @return the attribute's value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperty.java
    void setId(String id);

    /**
     * Sets the id.
     *
     * @param id
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperty.java
    String getId();

    /**
     * Returns the id of the <CODE>EncryptionProperty</CODE>.
     *
     * @return the id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperty.java
    void setTarget(String target);

    /**
     * Sets the target.
     *
     * @param target
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperty.java
    String getTarget();

    /**
     * Returns the <code>EncryptedType</code> being described.
     *
     * @return the <code>EncryptedType</code> being described by this
     *   <code>EncryptionProperty</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperty.java
public interface EncryptionProperty {

/**
 * Additional information items concerning the generation of the
 * <code>EncryptedData</code> or <code>EncryptedKey</code> can be placed in an
 * <code>EncryptionProperty</code> element (e.g., date/time stamp or the serial
 * number of cryptographic hardware used during encryption). The Target
 * attribute identifies the <code>EncryptedType</code> structure being
 * described. anyAttribute permits the inclusion of attributes from the XML
 * namespace to be included (i.e., <code>xml:space</code>,
 * <code>xml:lang</code>, and <code>xml:base</code>).
 * <p>
 * It is defined as follows:
 * <xmp>
 * <element name='EncryptionProperty' type='xenc:EncryptionPropertyType'/>
 * <complexType name='EncryptionPropertyType' mixed='true'>
 *     <choice maxOccurs='unbounded'>
 *         <any namespace='##other' processContents='lax'/>
 *     </choice>
 *     <attribute name='Target' type='anyURI' use='optional'/>
 *     <attribute name='Id' type='ID' use='optional'/>
 *     <anyAttribute namespace="http://www.w3.org/XML/1998/namespace"/>
 * </complexType>
 * </xmp>
 *
 * @author Axl Mattheus
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperty.java
package com.sun.org.apache.xml.internal.security.encryption;

/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperty.java
    void removeEncryptionInformation(Element information);

    /**
     * Removes encryption information.
     *
     * @param information the information to remove.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperty.java
    void addEncryptionInformation(Element information);

    /**
     * Adds encryption information.
     *
     * @param information the additional encryption information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperty.java
    Iterator<Element> getEncryptionInformation();

    /**
     * Returns the properties of the <CODE>EncryptionProperty</CODE>.
     *
     * @return an <code>Iterator</code> over all the additional encryption
     *   information contained in this class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperty.java
    void setAttribute(String attribute, String value);

    /**
     * Set the attribute value.
     *
     * @param attribute the attribute's name.
     * @param value the attribute's value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperty.java
    String getAttribute(String attribute);

    /**
     * Returns the attribute's value in the <code>xml</code> namespace.
     *
     * @param attribute
     * @return the attribute's value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperty.java
    void setId(String id);

    /**
     * Sets the id.
     *
     * @param id
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperty.java
    String getId();

    /**
     * Returns the id of the <CODE>EncryptionProperty</CODE>.
     *
     * @return the id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperty.java
    void setTarget(String target);

    /**
     * Sets the target.
     *
     * @param target
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperty.java
    String getTarget();

    /**
     * Returns the <code>EncryptedType</code> being described.
     *
     * @return the <code>EncryptedType</code> being described by this
     *   <code>EncryptionProperty</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperty.java
public interface EncryptionProperty {

/**
 * Additional information items concerning the generation of the
 * <code>EncryptedData</code> or <code>EncryptedKey</code> can be placed in an
 * <code>EncryptionProperty</code> element (e.g., date/time stamp or the serial
 * number of cryptographic hardware used during encryption). The Target
 * attribute identifies the <code>EncryptedType</code> structure being
 * described. anyAttribute permits the inclusion of attributes from the XML
 * namespace to be included (i.e., <code>xml:space</code>,
 * <code>xml:lang</code>, and <code>xml:base</code>).
 * <p>
 * It is defined as follows:
 * <xmp>
 * <element name='EncryptionProperty' type='xenc:EncryptionPropertyType'/>
 * <complexType name='EncryptionPropertyType' mixed='true'>
 *     <choice maxOccurs='unbounded'>
 *         <any namespace='##other' processContents='lax'/>
 *     </choice>
 *     <attribute name='Target' type='anyURI' use='optional'/>
 *     <attribute name='Id' type='ID' use='optional'/>
 *     <anyAttribute namespace="http://www.w3.org/XML/1998/namespace"/>
 * </complexType>
 * </xmp>
 *
 * @author Axl Mattheus
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperty.java
package com.sun.org.apache.xml.internal.security.encryption;

/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
