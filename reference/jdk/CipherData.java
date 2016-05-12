_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/CipherData.java
    void setCipherReference(CipherReference reference) throws XMLEncryptionException;

    /**
     * Sets the <code>CipherData</code>'s reference.
     *
     * @param reference an external location containing the encrypted octet sequence.
     * @throws XMLEncryptionException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/CipherData.java
    CipherReference getCipherReference();

    /**
     * Returns a reference to an external location containing the encrypted
     * octet sequence (<code>byte</code> array).
     *
     * @return the reference to an external location containing the encrypted
     * octet sequence.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/CipherData.java
    void setCipherValue(CipherValue value) throws XMLEncryptionException;

    /**
     * Sets the <code>CipherData</code>'s value.
     *
     * @param value the value of the <code>CipherData</code>.
     * @throws XMLEncryptionException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/CipherData.java
    CipherValue getCipherValue();

    /**
     * Returns the cipher value as a base64 encoded <code>byte</code> array.
     *
     * @return the <code>CipherData</code>'s value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/CipherData.java
    int getDataType();

    /**
     * Returns the type of encrypted data contained in the
     * <code>CipherData</code>.
     *
     * @return <code>VALUE_TYPE</code> if the encrypted data is contained as
     *   <code>CipherValue</code> or <code>REFERENCE_TYPE</code> if the
     *   encrypted data is contained as <code>CipherReference</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/CipherData.java
    int REFERENCE_TYPE = 0x00000002;

    /** REFERENCE_TYPE ASN */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/CipherData.java
    int VALUE_TYPE = 0x00000001;

    /** VALUE_TYPE ASN */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/CipherData.java
public interface CipherData {

/**
 * <code>CipherData</code> provides encrypted data. It must either contain the
 * encrypted octet sequence as base64 encoded text of the
 * <code>CipherValue</code> element, or provide a reference to an external
 * location containing the encrypted octet sequence via the
 * <code>CipherReference</code> element.
 * <p>
 * The schema definition is as follows:
 * <xmp>
 * <element name='CipherData' type='xenc:CipherDataType'/>
 * <complexType name='CipherDataType'>
 *     <choice>
 *         <element name='CipherValue' type='base64Binary'/>
 *         <element ref='xenc:CipherReference'/>
 *     </choice>
 * </complexType>
 * </xmp>
 *
 * @author Axl Mattheus
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/CipherData.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/CipherData.java
    void setCipherReference(CipherReference reference) throws XMLEncryptionException;

    /**
     * Sets the <code>CipherData</code>'s reference.
     *
     * @param reference an external location containing the encrypted octet sequence.
     * @throws XMLEncryptionException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/CipherData.java
    CipherReference getCipherReference();

    /**
     * Returns a reference to an external location containing the encrypted
     * octet sequence (<code>byte</code> array).
     *
     * @return the reference to an external location containing the encrypted
     * octet sequence.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/CipherData.java
    void setCipherValue(CipherValue value) throws XMLEncryptionException;

    /**
     * Sets the <code>CipherData</code>'s value.
     *
     * @param value the value of the <code>CipherData</code>.
     * @throws XMLEncryptionException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/CipherData.java
    CipherValue getCipherValue();

    /**
     * Returns the cipher value as a base64 encoded <code>byte</code> array.
     *
     * @return the <code>CipherData</code>'s value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/CipherData.java
    int getDataType();

    /**
     * Returns the type of encrypted data contained in the
     * <code>CipherData</code>.
     *
     * @return <code>VALUE_TYPE</code> if the encrypted data is contained as
     *   <code>CipherValue</code> or <code>REFERENCE_TYPE</code> if the
     *   encrypted data is contained as <code>CipherReference</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/CipherData.java
    int REFERENCE_TYPE = 0x00000002;

    /** REFERENCE_TYPE ASN */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/CipherData.java
    int VALUE_TYPE = 0x00000001;

    /** VALUE_TYPE ASN */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/CipherData.java
public interface CipherData {

/**
 * <code>CipherData</code> provides encrypted data. It must either contain the
 * encrypted octet sequence as base64 encoded text of the
 * <code>CipherValue</code> element, or provide a reference to an external
 * location containing the encrypted octet sequence via the
 * <code>CipherReference</code> element.
 * <p>
 * The schema definition is as follows:
 * <xmp>
 * <element name='CipherData' type='xenc:CipherDataType'/>
 * <complexType name='CipherDataType'>
 *     <choice>
 *         <element name='CipherValue' type='base64Binary'/>
 *         <element ref='xenc:CipherReference'/>
 *     </choice>
 * </complexType>
 * </xmp>
 *
 * @author Axl Mattheus
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/CipherData.java
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
