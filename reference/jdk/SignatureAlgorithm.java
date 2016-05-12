_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public String getBaseLocalName() {

    /**
     * Method getBaseLocalName
     *
     * @return Local name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public String getBaseNamespace() {

    /**
     * Method getBaseNamespace
     *
     * @return URI of this element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public static void registerDefaultAlgorithms() {

    /**
     * This method registers the default algorithms.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public static void register(String algorithmURI, Class<? extends SignatureAlgorithmSpi> implementingClass)

    /**
     * Registers implementing class of the Transform algorithm with algorithmURI
     *
     * @param algorithmURI algorithmURI URI representation of <code>SignatureAlgorithm</code>.
     * @param implementingClass <code>implementingClass</code> the implementing class of
     * {@link SignatureAlgorithmSpi}
     * @throws AlgorithmAlreadyRegisteredException if specified algorithmURI is already registered
     * @throws XMLSignatureException
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the signature algorithm
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    @SuppressWarnings("unchecked")

    /**
     * Registers implementing class of the SignatureAlgorithm with algorithmURI
     *
     * @param algorithmURI algorithmURI URI representation of <code>SignatureAlgorithm</code>.
     * @param implementingClass <code>implementingClass</code> the implementing class of
     * {@link SignatureAlgorithmSpi}
     * @throws AlgorithmAlreadyRegisteredException if specified algorithmURI is already registered
     * @throws XMLSignatureException
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the signature algorithm
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public final String getURI() {

    /**
     * Returns the URI representation of Transformation algorithm
     *
     * @return the URI representation of Transformation algorithm
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public boolean verify(byte[] signature) throws XMLSignatureException {

    /**
     * Proxy method for {@link java.security.Signature#verify(byte[])}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param signature
     * @return true if if the signature is valid.
     *
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public void initVerify(Key verificationKey) throws XMLSignatureException {

    /**
     * Proxy method for {@link java.security.Signature#initVerify(java.security.PublicKey)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param verificationKey
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public void setParameter(AlgorithmParameterSpec params) throws XMLSignatureException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public void initSign(
        Key signingKey, AlgorithmParameterSpec algorithmParameterSpec
    ) throws XMLSignatureException {

    /**
     * Proxy method for {@link java.security.Signature#initSign(java.security.PrivateKey)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param signingKey
     * @param algorithmParameterSpec
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public void initSign(Key signingKey, SecureRandom secureRandom) throws XMLSignatureException {

    /**
     * Proxy method for {@link java.security.Signature#initSign(java.security.PrivateKey,
     * java.security.SecureRandom)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param signingKey
     * @param secureRandom
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public void initSign(Key signingKey) throws XMLSignatureException {

    /**
     * Proxy method for {@link java.security.Signature#initSign(java.security.PrivateKey)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param signingKey
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public void update(byte buf[], int offset, int len) throws XMLSignatureException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public void update(byte input) throws XMLSignatureException {

    /**
     * Proxy method for {@link java.security.Signature#update(byte)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param input
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public void update(byte[] input) throws XMLSignatureException {

    /**
     * Proxy method for {@link java.security.Signature#update(byte[])}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param input
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public String getJCEProviderName() {

    /**
     * Method getJCEProviderName
     *
     * @return The Provider of this Signature Algorithm
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public String getJCEAlgorithmString() {

    /**
     * Proxy method for {@link java.security.Signature#getAlgorithm}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @return the result of the {@link java.security.Signature#getAlgorithm} method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public byte[] sign() throws XMLSignatureException {

    /**
     * Proxy method for {@link java.security.Signature#sign()}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @return the result of the {@link java.security.Signature#sign()} method
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    private static SignatureAlgorithmSpi getSignatureAlgorithmSpi(String algorithmURI)

    /**
     * Get a SignatureAlgorithmSpi object corresponding to the algorithmURI argument
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public SignatureAlgorithm(
        Element element, String baseURI, boolean secureValidation
    ) throws XMLSecurityException {

    /**
     * Constructor SignatureAlgorithm
     *
     * @param element
     * @param baseURI
     * @param secureValidation
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public SignatureAlgorithm(Element element, String baseURI) throws XMLSecurityException {

    /**
     * Constructor SignatureAlgorithm
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public SignatureAlgorithm(
        Document doc, String algorithmURI, int hmacOutputLength
    ) throws XMLSecurityException {

    /**
     * Constructor SignatureAlgorithm
     *
     * @param doc
     * @param algorithmURI
     * @param hmacOutputLength
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public SignatureAlgorithm(Document doc, String algorithmURI) throws XMLSecurityException {

    /**
     * Constructor SignatureAlgorithm
     *
     * @param doc
     * @param algorithmURI
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    private final SignatureAlgorithmSpi signatureAlgorithm;

    /** Field signatureAlgorithm */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    private static Map<String, Class<? extends SignatureAlgorithmSpi>> algorithmHash =

    /** All available algorithm classes are registered here */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
public class SignatureAlgorithm extends Algorithm {

/**
 * Allows selection of digital signature's algorithm, private keys, other
 * security parameters, and algorithm's ID.
 *
 * @author Christian Geuer-Pollmann
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public String getBaseLocalName() {

    /**
     * Method getBaseLocalName
     *
     * @return Local name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public String getBaseNamespace() {

    /**
     * Method getBaseNamespace
     *
     * @return URI of this element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public static void registerDefaultAlgorithms() {

    /**
     * This method registers the default algorithms.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public static void register(String algorithmURI, Class<? extends SignatureAlgorithmSpi> implementingClass)

    /**
     * Registers implementing class of the Transform algorithm with algorithmURI
     *
     * @param algorithmURI algorithmURI URI representation of <code>SignatureAlgorithm</code>.
     * @param implementingClass <code>implementingClass</code> the implementing class of
     * {@link SignatureAlgorithmSpi}
     * @throws AlgorithmAlreadyRegisteredException if specified algorithmURI is already registered
     * @throws XMLSignatureException
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the signature algorithm
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    @SuppressWarnings("unchecked")

    /**
     * Registers implementing class of the SignatureAlgorithm with algorithmURI
     *
     * @param algorithmURI algorithmURI URI representation of <code>SignatureAlgorithm</code>.
     * @param implementingClass <code>implementingClass</code> the implementing class of
     * {@link SignatureAlgorithmSpi}
     * @throws AlgorithmAlreadyRegisteredException if specified algorithmURI is already registered
     * @throws XMLSignatureException
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the signature algorithm
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public final String getURI() {

    /**
     * Returns the URI representation of Transformation algorithm
     *
     * @return the URI representation of Transformation algorithm
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public boolean verify(byte[] signature) throws XMLSignatureException {

    /**
     * Proxy method for {@link java.security.Signature#verify(byte[])}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param signature
     * @return true if if the signature is valid.
     *
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public void initVerify(Key verificationKey) throws XMLSignatureException {

    /**
     * Proxy method for {@link java.security.Signature#initVerify(java.security.PublicKey)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param verificationKey
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public void setParameter(AlgorithmParameterSpec params) throws XMLSignatureException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public void initSign(
        Key signingKey, AlgorithmParameterSpec algorithmParameterSpec
    ) throws XMLSignatureException {

    /**
     * Proxy method for {@link java.security.Signature#initSign(java.security.PrivateKey)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param signingKey
     * @param algorithmParameterSpec
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public void initSign(Key signingKey, SecureRandom secureRandom) throws XMLSignatureException {

    /**
     * Proxy method for {@link java.security.Signature#initSign(java.security.PrivateKey,
     * java.security.SecureRandom)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param signingKey
     * @param secureRandom
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public void initSign(Key signingKey) throws XMLSignatureException {

    /**
     * Proxy method for {@link java.security.Signature#initSign(java.security.PrivateKey)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param signingKey
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public void update(byte buf[], int offset, int len) throws XMLSignatureException {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public void update(byte input) throws XMLSignatureException {

    /**
     * Proxy method for {@link java.security.Signature#update(byte)}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param input
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public void update(byte[] input) throws XMLSignatureException {

    /**
     * Proxy method for {@link java.security.Signature#update(byte[])}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @param input
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public String getJCEProviderName() {

    /**
     * Method getJCEProviderName
     *
     * @return The Provider of this Signature Algorithm
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public String getJCEAlgorithmString() {

    /**
     * Proxy method for {@link java.security.Signature#getAlgorithm}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @return the result of the {@link java.security.Signature#getAlgorithm} method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public byte[] sign() throws XMLSignatureException {

    /**
     * Proxy method for {@link java.security.Signature#sign()}
     * which is executed on the internal {@link java.security.Signature} object.
     *
     * @return the result of the {@link java.security.Signature#sign()} method
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    private static SignatureAlgorithmSpi getSignatureAlgorithmSpi(String algorithmURI)

    /**
     * Get a SignatureAlgorithmSpi object corresponding to the algorithmURI argument
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public SignatureAlgorithm(
        Element element, String baseURI, boolean secureValidation
    ) throws XMLSecurityException {

    /**
     * Constructor SignatureAlgorithm
     *
     * @param element
     * @param baseURI
     * @param secureValidation
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public SignatureAlgorithm(Element element, String baseURI) throws XMLSecurityException {

    /**
     * Constructor SignatureAlgorithm
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public SignatureAlgorithm(
        Document doc, String algorithmURI, int hmacOutputLength
    ) throws XMLSecurityException {

    /**
     * Constructor SignatureAlgorithm
     *
     * @param doc
     * @param algorithmURI
     * @param hmacOutputLength
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    public SignatureAlgorithm(Document doc, String algorithmURI) throws XMLSecurityException {

    /**
     * Constructor SignatureAlgorithm
     *
     * @param doc
     * @param algorithmURI
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    private final SignatureAlgorithmSpi signatureAlgorithm;

    /** Field signatureAlgorithm */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    private static Map<String, Class<? extends SignatureAlgorithmSpi>> algorithmHash =

    /** All available algorithm classes are registered here */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
public class SignatureAlgorithm extends Algorithm {

/**
 * Allows selection of digital signature's algorithm, private keys, other
 * security parameters, and algorithm's ID.
 *
 * @author Christian Geuer-Pollmann
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/SignatureAlgorithm.java
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
