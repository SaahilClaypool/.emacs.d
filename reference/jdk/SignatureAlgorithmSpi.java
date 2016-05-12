_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected abstract void engineSetHMACOutputLength(int HMACOutputLength)

    /**
     * Method engineSetHMACOutputLength
     *
     * @param HMACOutputLength
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected void engineGetContextFromElement(Element element) {

    /**
     * Method engineGetContextFromElement
     *
     * @param element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected abstract void engineSetParameter(AlgorithmParameterSpec params)

    /**
     * Proxy method for {@link java.security.Signature#setParameter(
     * java.security.spec.AlgorithmParameterSpec)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param params
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected abstract boolean engineVerify(byte[] signature) throws XMLSignatureException;

    /**
     * Proxy method for {@link java.security.Signature#verify(byte[])}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param signature
     * @return true if the signature is correct
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected abstract void engineInitVerify(Key verificationKey) throws XMLSignatureException;

    /**
     * Method engineInitVerify
     *
     * @param verificationKey
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected abstract byte[] engineSign() throws XMLSignatureException;

    /**
     * Proxy method for {@link java.security.Signature#sign()}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @return the result of the {@link java.security.Signature#sign()} method
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected abstract void engineInitSign(
        Key signingKey, AlgorithmParameterSpec algorithmParameterSpec
    ) throws XMLSignatureException;

    /**
     * Proxy method for {@link javax.crypto.Mac}
     * which is executed on the internal {@link javax.crypto.Mac#init(Key)} object.
     *
     * @param signingKey
     * @param algorithmParameterSpec
     * @throws XMLSignatureException if this method is called on a Signature
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected abstract void engineInitSign(Key signingKey, SecureRandom secureRandom)

    /**
     * Proxy method for {@link java.security.Signature#initSign(java.security.PrivateKey,
     * java.security.SecureRandom)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param signingKey
     * @param secureRandom
     * @throws XMLSignatureException if this method is called on a MAC
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected abstract void engineInitSign(Key signingKey) throws XMLSignatureException;

    /**
     * Proxy method for {@link java.security.Signature#initSign(java.security.PrivateKey)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param signingKey
     * @throws XMLSignatureException if this method is called on a MAC
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected abstract void engineUpdate(byte buf[], int offset, int len)

    /**
     * Proxy method for {@link java.security.Signature#update(byte[], int, int)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param buf
     * @param offset
     * @param len
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected abstract void engineUpdate(byte input) throws XMLSignatureException;

    /**
     * Proxy method for {@link java.security.Signature#update(byte[])}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param input
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected abstract void engineUpdate(byte[] input) throws XMLSignatureException;

    /**
     * Proxy method for {@link java.security.Signature#update(byte[])}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param input
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected abstract String engineGetJCEProviderName();

    /**
     * Method engineGetJCEProviderName
     *
     * @return the JCE ProviderName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected abstract String engineGetJCEAlgorithmString();

    /**
     * Proxy method for {@link java.security.Signature#getAlgorithm}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @return the result of the {@link java.security.Signature#getAlgorithm} method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected abstract String engineGetURI();

    /**
     * Returns the URI representation of <code>Transformation algorithm</code>
     *
     * @return the URI representation of <code>Transformation algorithm</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
package com.sun.org.apache.xml.internal.security.algorithms;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected abstract void engineSetHMACOutputLength(int HMACOutputLength)

    /**
     * Method engineSetHMACOutputLength
     *
     * @param HMACOutputLength
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected void engineGetContextFromElement(Element element) {

    /**
     * Method engineGetContextFromElement
     *
     * @param element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected abstract void engineSetParameter(AlgorithmParameterSpec params)

    /**
     * Proxy method for {@link java.security.Signature#setParameter(
     * java.security.spec.AlgorithmParameterSpec)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param params
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected abstract boolean engineVerify(byte[] signature) throws XMLSignatureException;

    /**
     * Proxy method for {@link java.security.Signature#verify(byte[])}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param signature
     * @return true if the signature is correct
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected abstract void engineInitVerify(Key verificationKey) throws XMLSignatureException;

    /**
     * Method engineInitVerify
     *
     * @param verificationKey
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected abstract byte[] engineSign() throws XMLSignatureException;

    /**
     * Proxy method for {@link java.security.Signature#sign()}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @return the result of the {@link java.security.Signature#sign()} method
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected abstract void engineInitSign(
        Key signingKey, AlgorithmParameterSpec algorithmParameterSpec
    ) throws XMLSignatureException;

    /**
     * Proxy method for {@link javax.crypto.Mac}
     * which is executed on the internal {@link javax.crypto.Mac#init(Key)} object.
     *
     * @param signingKey
     * @param algorithmParameterSpec
     * @throws XMLSignatureException if this method is called on a Signature
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected abstract void engineInitSign(Key signingKey, SecureRandom secureRandom)

    /**
     * Proxy method for {@link java.security.Signature#initSign(java.security.PrivateKey,
     * java.security.SecureRandom)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param signingKey
     * @param secureRandom
     * @throws XMLSignatureException if this method is called on a MAC
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected abstract void engineInitSign(Key signingKey) throws XMLSignatureException;

    /**
     * Proxy method for {@link java.security.Signature#initSign(java.security.PrivateKey)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param signingKey
     * @throws XMLSignatureException if this method is called on a MAC
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected abstract void engineUpdate(byte buf[], int offset, int len)

    /**
     * Proxy method for {@link java.security.Signature#update(byte[], int, int)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param buf
     * @param offset
     * @param len
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected abstract void engineUpdate(byte input) throws XMLSignatureException;

    /**
     * Proxy method for {@link java.security.Signature#update(byte[])}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param input
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected abstract void engineUpdate(byte[] input) throws XMLSignatureException;

    /**
     * Proxy method for {@link java.security.Signature#update(byte[])}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param input
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected abstract String engineGetJCEProviderName();

    /**
     * Method engineGetJCEProviderName
     *
     * @return the JCE ProviderName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected abstract String engineGetJCEAlgorithmString();

    /**
     * Proxy method for {@link java.security.Signature#getAlgorithm}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @return the result of the {@link java.security.Signature#getAlgorithm} method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
    protected abstract String engineGetURI();

    /**
     * Returns the URI representation of <code>Transformation algorithm</code>
     *
     * @return the URI representation of <code>Transformation algorithm</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithmSpi.java
package com.sun.org.apache.xml.internal.security.algorithms;

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
