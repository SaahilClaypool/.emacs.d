_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperties.java
    void removeEncryptionProperty(EncryptionProperty property);

    /**
     * Removes the specified <code>EncryptionProperty</code>.
     *
     * @param property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperties.java
    void addEncryptionProperty(EncryptionProperty property);

    /**
     * Adds an <code>EncryptionProperty</code>.
     *
     * @param property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperties.java
    Iterator<EncryptionProperty> getEncryptionProperties();

    /**
     * Returns an <code>Iterator</code> over all the
     * <code>EncryptionPropterty</code> elements contained in this
     * <code>EncryptionProperties</code>.
     *
     * @return an <code>Iterator</code> over all the encryption properties.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperties.java
    void setId(String id);

    /**
     * Sets the id.
     *
     * @param id the id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperties.java
    String getId();

    /**
     * Returns the <code>EncryptionProperties</code>' id.
     *
     * @return the id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperties.java
public interface EncryptionProperties {

/**
 * <code>EncryptionProperties</code> can hold additional information concerning
 * the generation of the <code>EncryptedData</code> or
 * <code>EncryptedKey</code>. This information is wraped int an
 * <code>EncryptionProperty</code> element. Examples of additional information
 * is e.g., a date/time stamp or the serial number of cryptographic hardware
 * used during encryption).
 * <p>
 * It is defined as follows:
 * <xmp>
 * <element name='EncryptionProperties' type='xenc:EncryptionPropertiesType'/>
 * <complexType name='EncryptionPropertiesType'>
 *     <sequence>
 *         <element ref='xenc:EncryptionProperty' maxOccurs='unbounded'/>
 *     </sequence>
 *     <attribute name='Id' type='ID' use='optional'/>
 * </complexType>
 * </xmp>
 *
 * @author Axl Mattheus
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperties.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperties.java
    void removeEncryptionProperty(EncryptionProperty property);

    /**
     * Removes the specified <code>EncryptionProperty</code>.
     *
     * @param property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperties.java
    void addEncryptionProperty(EncryptionProperty property);

    /**
     * Adds an <code>EncryptionProperty</code>.
     *
     * @param property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperties.java
    Iterator<EncryptionProperty> getEncryptionProperties();

    /**
     * Returns an <code>Iterator</code> over all the
     * <code>EncryptionPropterty</code> elements contained in this
     * <code>EncryptionProperties</code>.
     *
     * @return an <code>Iterator</code> over all the encryption properties.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperties.java
    void setId(String id);

    /**
     * Sets the id.
     *
     * @param id the id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperties.java
    String getId();

    /**
     * Returns the <code>EncryptionProperties</code>' id.
     *
     * @return the id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperties.java
public interface EncryptionProperties {

/**
 * <code>EncryptionProperties</code> can hold additional information concerning
 * the generation of the <code>EncryptedData</code> or
 * <code>EncryptedKey</code>. This information is wraped int an
 * <code>EncryptionProperty</code> element. Examples of additional information
 * is e.g., a date/time stamp or the serial number of cryptographic hardware
 * used during encryption).
 * <p>
 * It is defined as follows:
 * <xmp>
 * <element name='EncryptionProperties' type='xenc:EncryptionPropertiesType'/>
 * <complexType name='EncryptionPropertiesType'>
 *     <sequence>
 *         <element ref='xenc:EncryptionProperty' maxOccurs='unbounded'/>
 *     </sequence>
 *     <attribute name='Id' type='ID' use='optional'/>
 * </complexType>
 * </xmp>
 *
 * @author Axl Mattheus
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionProperties.java
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
