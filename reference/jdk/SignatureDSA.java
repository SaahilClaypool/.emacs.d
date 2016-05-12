_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    protected void engineInitSign(
        Key signingKey, AlgorithmParameterSpec algorithmParameterSpec
    ) throws XMLSignatureException {

    /**
     * Method engineInitSign
     *
     * @param signingKey
     * @param algorithmParameterSpec
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    protected void engineSetHMACOutputLength(int HMACOutputLength) throws XMLSignatureException {

    /**
     * Method engineSetHMACOutputLength
     *
     * @param HMACOutputLength
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    private static byte[] convertXMLDSIGtoASN1(byte xmldsigBytes[]) throws IOException {

    /**
     * Converts a XML Signature DSA Value to an ASN.1 DSA value.
     *
     * The JAVA JCE DSA Signature algorithm creates ASN.1 encoded (r,s) value
     * pairs; the XML Signature requires the core BigInteger values.
     *
     * @param xmldsigBytes
     * @return the encoded ASN.1 bytes
     *
     * @throws IOException
     * @see <A HREF="http://www.w3.org/TR/xmldsig-core/#dsa-sha1">6.4.1 DSA</A>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    private static byte[] convertASN1toXMLDSIG(byte asn1Bytes[]) throws IOException {

    /**
     * Converts an ASN.1 DSA value to a XML Signature DSA Value.
     *
     * The JAVA JCE DSA Signature algorithm creates ASN.1 encoded (r,s) value
     * pairs; the XML Signature requires the core BigInteger values.
     *
     * @param asn1Bytes
     * @return the decode bytes
     *
     * @throws IOException
     * @see <A HREF="http://www.w3.org/TR/xmldsig-core/#dsa-sha1">6.4.1 DSA</A>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    protected String engineGetJCEProviderName() {

    /**
     * Method engineGetJCEProviderName
     *
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    protected String engineGetJCEAlgorithmString() {

    /**
     * Method engineGetJCEAlgorithmString
     *
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    protected void engineUpdate(byte buf[], int offset, int len) throws XMLSignatureException {

    /**
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    protected void engineUpdate(byte input) throws XMLSignatureException {

    /**
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    protected void engineUpdate(byte[] input) throws XMLSignatureException {

    /**
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    protected void engineInitSign(Key privateKey) throws XMLSignatureException {

    /**
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    protected void engineInitSign(Key privateKey, SecureRandom secureRandom)

    /**
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    protected byte[] engineSign() throws XMLSignatureException {

    /**
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    protected void engineInitVerify(Key publicKey) throws XMLSignatureException {

    /**
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    protected boolean engineVerify(byte[] signature)

    /**
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    protected void engineSetParameter(AlgorithmParameterSpec params)

    /**
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    public SignatureDSA() throws XMLSignatureException {

    /**
     * Constructor SignatureDSA
     *
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    protected String engineGetURI() {

    /**
     * Method engineGetURI
     *
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    private java.security.Signature signatureAlgorithm = null;

    /** Field algorithm */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    public static final String URI = Constants.SignatureSpecNS + "dsa-sha1";

    /** Field URI */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
package com.sun.org.apache.xml.internal.security.algorithms.implementations;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    protected void engineInitSign(
        Key signingKey, AlgorithmParameterSpec algorithmParameterSpec
    ) throws XMLSignatureException {

    /**
     * Method engineInitSign
     *
     * @param signingKey
     * @param algorithmParameterSpec
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    protected void engineSetHMACOutputLength(int HMACOutputLength) throws XMLSignatureException {

    /**
     * Method engineSetHMACOutputLength
     *
     * @param HMACOutputLength
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    private static byte[] convertXMLDSIGtoASN1(byte xmldsigBytes[]) throws IOException {

    /**
     * Converts a XML Signature DSA Value to an ASN.1 DSA value.
     *
     * The JAVA JCE DSA Signature algorithm creates ASN.1 encoded (r,s) value
     * pairs; the XML Signature requires the core BigInteger values.
     *
     * @param xmldsigBytes
     * @return the encoded ASN.1 bytes
     *
     * @throws IOException
     * @see <A HREF="http://www.w3.org/TR/xmldsig-core/#dsa-sha1">6.4.1 DSA</A>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    private static byte[] convertASN1toXMLDSIG(byte asn1Bytes[]) throws IOException {

    /**
     * Converts an ASN.1 DSA value to a XML Signature DSA Value.
     *
     * The JAVA JCE DSA Signature algorithm creates ASN.1 encoded (r,s) value
     * pairs; the XML Signature requires the core BigInteger values.
     *
     * @param asn1Bytes
     * @return the decode bytes
     *
     * @throws IOException
     * @see <A HREF="http://www.w3.org/TR/xmldsig-core/#dsa-sha1">6.4.1 DSA</A>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    protected String engineGetJCEProviderName() {

    /**
     * Method engineGetJCEProviderName
     *
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    protected String engineGetJCEAlgorithmString() {

    /**
     * Method engineGetJCEAlgorithmString
     *
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    protected void engineUpdate(byte buf[], int offset, int len) throws XMLSignatureException {

    /**
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    protected void engineUpdate(byte input) throws XMLSignatureException {

    /**
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    protected void engineUpdate(byte[] input) throws XMLSignatureException {

    /**
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    protected void engineInitSign(Key privateKey) throws XMLSignatureException {

    /**
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    protected void engineInitSign(Key privateKey, SecureRandom secureRandom)

    /**
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    protected byte[] engineSign() throws XMLSignatureException {

    /**
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    protected void engineInitVerify(Key publicKey) throws XMLSignatureException {

    /**
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    protected boolean engineVerify(byte[] signature)

    /**
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    protected void engineSetParameter(AlgorithmParameterSpec params)

    /**
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    public SignatureDSA() throws XMLSignatureException {

    /**
     * Constructor SignatureDSA
     *
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    protected String engineGetURI() {

    /**
     * Method engineGetURI
     *
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    private java.security.Signature signatureAlgorithm = null;

    /** Field algorithm */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    public static final String URI = Constants.SignatureSpecNS + "dsa-sha1";

    /** Field URI */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/implementations/SignatureDSA.java
package com.sun.org.apache.xml.internal.security.algorithms.implementations;

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
