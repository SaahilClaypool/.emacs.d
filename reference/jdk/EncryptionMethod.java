_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionMethod.java
    void removeEncryptionMethodInformation(Element information);

    /**
     * Removes encryption method information.
     *
     * @param information the information to remove from the
     *   <code>EncryptionMethod</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionMethod.java
    void addEncryptionMethodInformation(Element information);

    /**
     * Adds encryption method information.
     *
     * @param information additional encryption method information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionMethod.java
    Iterator<Element> getEncryptionMethodInformation();

    /**
     * Returns an iterator over all the additional elements contained in the
     * <code>EncryptionMethod</code>.
     *
     * @return an <code>Iterator</code> over all the additional information
     *   about the <code>EncryptionMethod</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionMethod.java
    String getMGFAlgorithm();

    /**
     * Get the MGF Algorithm to use
     * @return the MGF Algorithm to use
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionMethod.java
    void setMGFAlgorithm(String mgfAlgorithm);

    /**
     * Set the MGF Algorithm to use
     * @param mgfAlgorithm the MGF Algorithm to use
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionMethod.java
    String getDigestAlgorithm();

    /**
     * Get the Digest Algorithm to use
     * @return the Digest Algorithm to use
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionMethod.java
    void setDigestAlgorithm(String digestAlgorithm);

    /**
     * Set the Digest Algorithm to use
     * @param digestAlgorithm the Digest Algorithm to use
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionMethod.java
    void setOAEPparams(byte[] parameters);

    /**
     * Sets the OAEP parameters.
     *
     * @param parameters the OAEP parameters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionMethod.java
    byte[] getOAEPparams();

    /**
     * Returns the OAEP parameters of the algorithm applied applied to the
     * cipher data.
     *
     * @return the OAEP parameters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionMethod.java
    void setKeySize(int size);

    /**
     * Sets the size of the key of the algorithm applied to the cipher data.
     *
     * @param size the key size.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionMethod.java
    int getKeySize();

    /**
     * Returns the key size of the key of the algorithm applied to the cipher
     * data.
     *
     * @return the key size.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionMethod.java
public interface EncryptionMethod {

/**
 * <code>EncryptionMethod</code> describes the encryption algorithm applied to
 * the cipher data. If the element is absent, the encryption algorithm must be
 * known by the recipient or the decryption will fail.
 * <p>
 * It is defined as follows:
 * <xmp>
 * <complexType name='EncryptionMethodType' mixed='true'>
 *     <sequence>
 *         <element name='KeySize' minOccurs='0' type='xenc:KeySizeType'/>
 *         <element name='OAEPparams' minOccurs='0' type='base64Binary'/>
 *         <any namespace='##other' minOccurs='0' maxOccurs='unbounded'/>
 *     </sequence>
 *     <attribute name='Algorithm' type='anyURI' use='required'/>
 * </complexType>
 * </xmp>
 *
 * @author Axl Mattheus
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionMethod.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionMethod.java
    void removeEncryptionMethodInformation(Element information);

    /**
     * Removes encryption method information.
     *
     * @param information the information to remove from the
     *   <code>EncryptionMethod</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionMethod.java
    void addEncryptionMethodInformation(Element information);

    /**
     * Adds encryption method information.
     *
     * @param information additional encryption method information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionMethod.java
    Iterator<Element> getEncryptionMethodInformation();

    /**
     * Returns an iterator over all the additional elements contained in the
     * <code>EncryptionMethod</code>.
     *
     * @return an <code>Iterator</code> over all the additional information
     *   about the <code>EncryptionMethod</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionMethod.java
    String getMGFAlgorithm();

    /**
     * Get the MGF Algorithm to use
     * @return the MGF Algorithm to use
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionMethod.java
    void setMGFAlgorithm(String mgfAlgorithm);

    /**
     * Set the MGF Algorithm to use
     * @param mgfAlgorithm the MGF Algorithm to use
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionMethod.java
    String getDigestAlgorithm();

    /**
     * Get the Digest Algorithm to use
     * @return the Digest Algorithm to use
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionMethod.java
    void setDigestAlgorithm(String digestAlgorithm);

    /**
     * Set the Digest Algorithm to use
     * @param digestAlgorithm the Digest Algorithm to use
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionMethod.java
    void setOAEPparams(byte[] parameters);

    /**
     * Sets the OAEP parameters.
     *
     * @param parameters the OAEP parameters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionMethod.java
    byte[] getOAEPparams();

    /**
     * Returns the OAEP parameters of the algorithm applied applied to the
     * cipher data.
     *
     * @return the OAEP parameters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionMethod.java
    void setKeySize(int size);

    /**
     * Sets the size of the key of the algorithm applied to the cipher data.
     *
     * @param size the key size.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionMethod.java
    int getKeySize();

    /**
     * Returns the key size of the key of the algorithm applied to the cipher
     * data.
     *
     * @return the key size.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionMethod.java
public interface EncryptionMethod {

/**
 * <code>EncryptionMethod</code> describes the encryption algorithm applied to
 * the cipher data. If the element is absent, the encryption algorithm must be
 * known by the recipient or the decryption will fail.
 * <p>
 * It is defined as follows:
 * <xmp>
 * <complexType name='EncryptionMethodType' mixed='true'>
 *     <sequence>
 *         <element name='KeySize' minOccurs='0' type='xenc:KeySizeType'/>
 *         <element name='OAEPparams' minOccurs='0' type='base64Binary'/>
 *         <any namespace='##other' minOccurs='0' maxOccurs='unbounded'/>
 *     </sequence>
 *     <attribute name='Algorithm' type='anyURI' use='required'/>
 * </complexType>
 * </xmp>
 *
 * @author Axl Mattheus
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/EncryptionMethod.java
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
