_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public String getBaseLocalName() {

    /**
     * Method getBaseLocalName
     * @inheritDoc
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public SecretKey createSecretKey(byte[] secretKeyBytes) {

    /**
     * Creates a SecretKey for the appropriate Mac algorithm based on a
     * byte[] array password.
     *
     * @param secretKeyBytes
     * @return the secret key for the SignedInfo element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public Element getSignatureMethodElement() {

    /**
     * Method getSignatureMethodElement
     * @return returns the SignatureMethod Element
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public String getSignatureMethodURI() {

    /**
     * Returns the Signature method URI
     *
     * @return the Signature method URI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public String getCanonicalizationMethodURI() {

    /**
     * Returns the Canonicalization method URI
     *
     * @return the Canonicalization method URI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public void signInOctetStream(OutputStream os)

    /**
     * Output the C14n stream to the given OutputStream.
     * @param os
     * @throws CanonicalizationException
     * @throws InvalidCanonicalizerException
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public byte[] getCanonicalizedOctetStream()

    /**
     * Returns getCanonicalizedOctetStream
     *
     * @return the canonicalization result octet stream of <code>SignedInfo</code> element
     * @throws CanonicalizationException
     * @throws InvalidCanonicalizerException
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public boolean verify(boolean followManifests)

    /**
     * Tests core validation process
     *
     * @param followManifests defines whether the verification process has to verify referenced <CODE>ds:Manifest</CODE>s, too
     * @return true if verification was successful
     * @throws MissingResourceFailureException
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public boolean verify()

    /**
     * Tests core validation process
     *
     * @return true if verification was successful
     * @throws MissingResourceFailureException
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public SignedInfo(
        Element element, String baseURI, boolean secureValidation
    ) throws XMLSecurityException {

    /**
     * Build a {@link SignedInfo} from an {@link Element}
     *
     * @param element <code>SignedInfo</code>
     * @param baseURI the URI of the resource where the XML instance was stored
     * @param secureValidation whether secure validation is enabled or not
     * @throws XMLSecurityException
     * @see <A HREF="http://lists.w3.org/Archives/Public/w3c-ietf-xmldsig/2001OctDec/0033.html">
     * Question</A>
     * @see <A HREF="http://lists.w3.org/Archives/Public/w3c-ietf-xmldsig/2001OctDec/0054.html">
     * Answer</A>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public SignedInfo(Element element, String baseURI) throws XMLSecurityException {

    /**
     * Build a {@link SignedInfo} from an {@link Element}
     *
     * @param element <code>SignedInfo</code>
     * @param baseURI the URI of the resource where the XML instance was stored
     * @throws XMLSecurityException
     * @see <A HREF="http://lists.w3.org/Archives/Public/w3c-ietf-xmldsig/2001OctDec/0033.html">
     * Question</A>
     * @see <A HREF="http://lists.w3.org/Archives/Public/w3c-ietf-xmldsig/2001OctDec/0054.html">
     * Answer</A>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public SignedInfo(
        Document doc, Element signatureMethodElem, Element canonicalizationMethodElem
    ) throws XMLSecurityException {

    /**
     * @param doc
     * @param signatureMethodElem
     * @param canonicalizationMethodElem
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public SignedInfo(
        Document doc, String signatureMethodURI,
        int hMACOutputLength, String canonicalizationMethodURI
    ) throws XMLSecurityException {

    /**
     * Constructor SignedInfo
     *
     * @param doc <code>SignedInfo</code> is placed in this document
     * @param signatureMethodURI URI representation of the Digest and
     *    Signature algorithm
     * @param hMACOutputLength
     * @param canonicalizationMethodURI URI representation of the
     *    Canonicalization method
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public SignedInfo(
        Document doc, String signatureMethodURI, String canonicalizationMethodURI
    ) throws XMLSecurityException {

    /**
     * Constructs {@link SignedInfo} using given Canonicalization algorithm and
     * Signature algorithm.
     *
     * @param doc <code>SignedInfo</code> is placed in this document
     * @param signatureMethodURI URI representation of the Digest and
     *    Signature algorithm
     * @param canonicalizationMethodURI URI representation of the
     *    Canonicalization method
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public SignedInfo(Document doc) throws XMLSecurityException {

    /**
     * Overwrites {@link Manifest#addDocument} because it creates another
     * Element.
     *
     * @param doc the {@link Document} in which <code>XMLsignature</code> will
     *    be placed
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    private byte[] c14nizedBytes = null;

    /** Field c14nizedBytes           */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    private SignatureAlgorithm signatureAlgorithm = null;

    /** Field signatureAlgorithm */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
public class SignedInfo extends Manifest {

/**
 * Handles <code>&lt;ds:SignedInfo&gt;</code> elements
 * This <code>SignedInfo<code> element includes the canonicalization algorithm,
 * a signature algorithm, and one or more references.
 *
 * @author Christian Geuer-Pollmann
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
package com.sun.org.apache.xml.internal.security.signature;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public String getBaseLocalName() {

    /**
     * Method getBaseLocalName
     * @inheritDoc
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public SecretKey createSecretKey(byte[] secretKeyBytes) {

    /**
     * Creates a SecretKey for the appropriate Mac algorithm based on a
     * byte[] array password.
     *
     * @param secretKeyBytes
     * @return the secret key for the SignedInfo element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public Element getSignatureMethodElement() {

    /**
     * Method getSignatureMethodElement
     * @return returns the SignatureMethod Element
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public String getSignatureMethodURI() {

    /**
     * Returns the Signature method URI
     *
     * @return the Signature method URI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public String getCanonicalizationMethodURI() {

    /**
     * Returns the Canonicalization method URI
     *
     * @return the Canonicalization method URI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public void signInOctetStream(OutputStream os)

    /**
     * Output the C14n stream to the given OutputStream.
     * @param os
     * @throws CanonicalizationException
     * @throws InvalidCanonicalizerException
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public byte[] getCanonicalizedOctetStream()

    /**
     * Returns getCanonicalizedOctetStream
     *
     * @return the canonicalization result octet stream of <code>SignedInfo</code> element
     * @throws CanonicalizationException
     * @throws InvalidCanonicalizerException
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public boolean verify(boolean followManifests)

    /**
     * Tests core validation process
     *
     * @param followManifests defines whether the verification process has to verify referenced <CODE>ds:Manifest</CODE>s, too
     * @return true if verification was successful
     * @throws MissingResourceFailureException
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public boolean verify()

    /**
     * Tests core validation process
     *
     * @return true if verification was successful
     * @throws MissingResourceFailureException
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public SignedInfo(
        Element element, String baseURI, boolean secureValidation
    ) throws XMLSecurityException {

    /**
     * Build a {@link SignedInfo} from an {@link Element}
     *
     * @param element <code>SignedInfo</code>
     * @param baseURI the URI of the resource where the XML instance was stored
     * @param secureValidation whether secure validation is enabled or not
     * @throws XMLSecurityException
     * @see <A HREF="http://lists.w3.org/Archives/Public/w3c-ietf-xmldsig/2001OctDec/0033.html">
     * Question</A>
     * @see <A HREF="http://lists.w3.org/Archives/Public/w3c-ietf-xmldsig/2001OctDec/0054.html">
     * Answer</A>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public SignedInfo(Element element, String baseURI) throws XMLSecurityException {

    /**
     * Build a {@link SignedInfo} from an {@link Element}
     *
     * @param element <code>SignedInfo</code>
     * @param baseURI the URI of the resource where the XML instance was stored
     * @throws XMLSecurityException
     * @see <A HREF="http://lists.w3.org/Archives/Public/w3c-ietf-xmldsig/2001OctDec/0033.html">
     * Question</A>
     * @see <A HREF="http://lists.w3.org/Archives/Public/w3c-ietf-xmldsig/2001OctDec/0054.html">
     * Answer</A>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public SignedInfo(
        Document doc, Element signatureMethodElem, Element canonicalizationMethodElem
    ) throws XMLSecurityException {

    /**
     * @param doc
     * @param signatureMethodElem
     * @param canonicalizationMethodElem
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public SignedInfo(
        Document doc, String signatureMethodURI,
        int hMACOutputLength, String canonicalizationMethodURI
    ) throws XMLSecurityException {

    /**
     * Constructor SignedInfo
     *
     * @param doc <code>SignedInfo</code> is placed in this document
     * @param signatureMethodURI URI representation of the Digest and
     *    Signature algorithm
     * @param hMACOutputLength
     * @param canonicalizationMethodURI URI representation of the
     *    Canonicalization method
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public SignedInfo(
        Document doc, String signatureMethodURI, String canonicalizationMethodURI
    ) throws XMLSecurityException {

    /**
     * Constructs {@link SignedInfo} using given Canonicalization algorithm and
     * Signature algorithm.
     *
     * @param doc <code>SignedInfo</code> is placed in this document
     * @param signatureMethodURI URI representation of the Digest and
     *    Signature algorithm
     * @param canonicalizationMethodURI URI representation of the
     *    Canonicalization method
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    public SignedInfo(Document doc) throws XMLSecurityException {

    /**
     * Overwrites {@link Manifest#addDocument} because it creates another
     * Element.
     *
     * @param doc the {@link Document} in which <code>XMLsignature</code> will
     *    be placed
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    private byte[] c14nizedBytes = null;

    /** Field c14nizedBytes           */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
    private SignatureAlgorithm signatureAlgorithm = null;

    /** Field signatureAlgorithm */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
public class SignedInfo extends Manifest {

/**
 * Handles <code>&lt;ds:SignedInfo&gt;</code> elements
 * This <code>SignedInfo<code> element includes the canonicalization algorithm,
 * a signature algorithm, and one or more references.
 *
 * @author Christian Geuer-Pollmann
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignedInfo.java
package com.sun.org.apache.xml.internal.security.signature;

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
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/SignedInfo.java
    InputStream getCanonicalizedData();

    /**
     * Returns the canonicalized signed info bytes after a signing or
     * validation operation. This method is useful for debugging.
     *
     * @return an <code>InputStream</code> containing the canonicalized bytes,
     *    or <code>null</code> if this <code>SignedInfo</code> has not been
     *    signed or validated yet
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/SignedInfo.java
    String getId();

    /**
     * Returns the optional <code>Id</code> attribute of this
     * <code>SignedInfo</code>.
     *
     * @return the id (may be <code>null</code> if not specified)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/SignedInfo.java
    @SuppressWarnings("rawtypes")

    /**
     * Returns an {@link java.util.Collections#unmodifiableList
     * unmodifiable list} of one or more {@link Reference}s.
     *
     * @return an unmodifiable list of one or more {@link Reference}s
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/SignedInfo.java
    SignatureMethod getSignatureMethod();

    /**
     * Returns the signature method of this <code>SignedInfo</code>.
     *
     * @return the signature method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/SignedInfo.java
    CanonicalizationMethod getCanonicalizationMethod();

    /**
     * Returns the canonicalization method of this <code>SignedInfo</code>.
     *
     * @return the canonicalization method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/SignedInfo.java
public interface SignedInfo extends XMLStructure {

/**
 * An representation of the XML <code>SignedInfo</code> element as
 * defined in the <a href="http://www.w3.org/TR/xmldsig-core/">
 * W3C Recommendation for XML-Signature Syntax and Processing</a>.
 * The XML Schema Definition is defined as:
 * <pre><code>
 * &lt;element name="SignedInfo" type="ds:SignedInfoType"/&gt;
 * &lt;complexType name="SignedInfoType"&gt;
 *   &lt;sequence&gt;
 *     &lt;element ref="ds:CanonicalizationMethod"/&gt;
 *     &lt;element ref="ds:SignatureMethod"/&gt;
 *     &lt;element ref="ds:Reference" maxOccurs="unbounded"/&gt;
 *   &lt;/sequence&gt;
 *   &lt;attribute name="Id" type="ID" use="optional"/&gt;
 * &lt;/complexType&gt;
 * </code></pre>
 *
 * A <code>SignedInfo</code> instance may be created by invoking one of the
 * {@link XMLSignatureFactory#newSignedInfo newSignedInfo} methods of the
 * {@link XMLSignatureFactory} class.
 *
 * @author Sean Mullan
 * @author JSR 105 Expert Group
 * @since 1.6
 * @see XMLSignatureFactory#newSignedInfo(CanonicalizationMethod, SignatureMethod, List)
 * @see XMLSignatureFactory#newSignedInfo(CanonicalizationMethod, SignatureMethod, List, String)
 */
