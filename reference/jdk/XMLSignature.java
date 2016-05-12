_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public String getBaseLocalName() {

    /**
     * Get the local name of this element
     *
     * @return Constants._TAG_SIGNATURE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public void setFollowNestedManifests(boolean followManifests) {

    /**
     * Signal whether Manifest should be automatically validated.
     * Checking the digests in References in a Signature are mandatory, but for
     * References inside a Manifest it is application specific. This boolean is
     * to indicate that the References inside Manifests should be validated.
     *
     * @param followManifests
     * @see <a href="http://www.w3.org/TR/xmldsig-core/#sec-CoreValidation">
     * Core validation section in the XML Signature Rec.</a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public SecretKey createSecretKey(byte[] secretKeyBytes) {

    /**
     * Proxy method for {@link SignedInfo#createSecretKey(byte[])}. If you want
     * to create a MAC, this method helps you to obtain the
     * {@link javax.crypto.SecretKey} from octets.
     *
     * @param secretKeyBytes
     * @return the secret key created.
     * @see SignedInfo#createSecretKey(byte[])
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public void addKeyInfo(PublicKey pk) {

    /**
     * Add this public key to the KeyInfo. This will include the complete key in
     * the KeyInfo structure.
     *
     * @param pk
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public void addKeyInfo(X509Certificate cert) throws XMLSecurityException {

    /**
     * Add an X509 Certificate to the KeyInfo. This will include the whole cert
     * inside X509Data/X509Certificate tags.
     *
     * @param cert Certificate to be included. This should be the certificate of
     * the key that was used to sign.
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public void addDocument(String referenceURI) throws XMLSignatureException {

    /**
     * Add a Reference with just this URI. It uses SHA1 by default as the digest
     * algorithm
     *
     * @param referenceURI URI according to the XML Signature specification.
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public void addDocument(String referenceURI, Transforms trans)

    /**
     * Adds a Reference with just the URI and the transforms. This used the
     * SHA1 algorithm as a default digest algorithm.
     *
     * @param referenceURI URI according to the XML Signature specification.
     * @param trans List of transformations to be applied.
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public void addDocument(
        String referenceURI,
        Transforms trans,
        String digestURI
    ) throws XMLSignatureException {

    /**
     * This method is a proxy method for the {@link Manifest#addDocument} method.
     *
     * @param referenceURI URI according to the XML Signature specification.
     * @param trans List of transformations to be applied.
     * @param digestURI URI of the digest algorithm to be used.
     * @see Manifest#addDocument
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public void addDocument(
        String referenceURI,
        Transforms trans,
        String digestURI,
        String referenceId,
        String referenceType
    ) throws XMLSignatureException {

    /**
     * Add a Reference with full parameters to this Signature
     *
     * @param referenceURI URI of the resource to be signed. Can be null in
     * which case the dereferencing is application specific. Can be "" in which
     * it's the parent node (or parent document?). There can only be one "" in
     * each signature.
     * @param trans Optional list of transformations to be done before digesting
     * @param digestURI Mandatory URI of the digesting algorithm to use.
     * @param referenceId Optional id attribute for this Reference
     * @param referenceType Optional mimetype for the URI
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public boolean checkSignatureValue(Key pk) throws XMLSignatureException {

    /**
     * Verifies if the signature is valid by redigesting all References,
     * comparing those against the stored DigestValues and then checking to see
     * if the Signatures match on the SignedInfo.
     *
     * @param pk {@link java.security.PublicKey} part of the keypair or
     * {@link javax.crypto.SecretKey} that was used to sign
     * @return true if the signature is valid, false otherwise
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public boolean checkSignatureValue(X509Certificate cert)

    /**
     * Extracts the public key from the certificate and verifies if the signature
     * is valid by re-digesting all References, comparing those against the
     * stored DigestValues and then checking to see if the Signatures match on
     * the SignedInfo.
     *
     * @param cert Certificate that contains the public key part of the keypair
     * that was used to sign.
     * @return true if the signature is valid, false otherwise
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public void addResourceResolver(ResourceResolverSpi resolver) {

    /**
     * Adds a {@link ResourceResolverSpi} to enable the retrieval of resources.
     *
     * @param resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public void addResourceResolver(ResourceResolver resolver) {

    /**
     * Adds a {@link ResourceResolver} to enable the retrieval of resources.
     *
     * @param resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public void sign(Key signingKey) throws XMLSignatureException {

    /**
     * Digests all References in the SignedInfo, calculates the signature value
     * and sets it in the SignatureValue Element.
     *
     * @param signingKey the {@link java.security.PrivateKey} or
     * {@link javax.crypto.SecretKey} that is used to sign.
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public int getObjectLength() {

    /**
     * Returns the number of all <code>ds:Object</code> elements.
     *
     * @return the number of all <code>ds:Object</code> elements.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public ObjectContainer getObjectItem(int i) {

    /**
     * Returns the <code>i<code>th <code>ds:Object</code> child of the signature
     * or null if no such <code>ds:Object</code> element exists.
     *
     * @param i
     * @return the <code>i<code>th <code>ds:Object</code> child of the signature
     * or null if no such <code>ds:Object</code> element exists.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public void appendObject(ObjectContainer object) throws XMLSignatureException {

    /**
     * Appends an Object (not a <code>java.lang.Object</code> but an Object
     * element) to the Signature. Please note that this is only possible
     * when signing.
     *
     * @param object ds:Object to be appended.
     * @throws XMLSignatureException When this object is used to verify.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public KeyInfo getKeyInfo() {

    /**
     * Returns the KeyInfo child. If we are in signing mode and the KeyInfo
     * does not exist yet, it is created on demand and added to the Signature.
     * <br>
     * This allows to add arbitrary content to the KeyInfo during signing.
     *
     * @return the KeyInfo object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    private void setSignatureValueElement(byte[] bytes) {

    /**
     * Base64 encodes and sets the bytes as the content of the SignatureValue
     * Node.
     *
     * @param bytes bytes to be used by SignatureValue before Base64 encoding
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public byte[] getSignatureValue() throws XMLSignatureException {

    /**
     * Returns the octet value of the SignatureValue element.
     * Throws an XMLSignatureException if it has no or wrong content.
     *
     * @return the value of the SignatureValue element.
     * @throws XMLSignatureException If there is no content
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public SignedInfo getSignedInfo() {

    /**
     * Returns the completely parsed <code>SignedInfo</code> object.
     *
     * @return the completely parsed <code>SignedInfo</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public String getId() {

    /**
     * Returns the <code>Id</code> attribute
     *
     * @return the <code>Id</code> attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public void setId(String id) {

    /**
     * Sets the <code>Id</code> attribute
     *
     * @param id Id value for the id attribute on the Signature Element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public XMLSignature(Element element, String baseURI, boolean secureValidation)

    /**
     * This will parse the element and construct the Java Objects.
     * That will allow a user to validate the signature.
     *
     * @param element ds:Signature element that contains the whole signature
     * @param baseURI URI to be prepended to all relative URIs
     * @param secureValidation whether secure secureValidation is enabled or not
     * @throws XMLSecurityException
     * @throws XMLSignatureException if the signature is badly formatted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public XMLSignature(Element element, String baseURI)

    /**
     * This will parse the element and construct the Java Objects.
     * That will allow a user to validate the signature.
     *
     * @param element ds:Signature element that contains the whole signature
     * @param baseURI URI to be prepended to all relative URIs
     * @throws XMLSecurityException
     * @throws XMLSignatureException if the signature is badly formatted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public XMLSignature(
        Document doc,
        String baseURI,
        Element SignatureMethodElem,
        Element CanonicalizationMethodElem
    ) throws XMLSecurityException {

    /**
     *  Creates a XMLSignature in a Document
     * @param doc
     * @param baseURI
     * @param SignatureMethodElem
     * @param CanonicalizationMethodElem
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public XMLSignature(
        Document doc,
        String baseURI,
        String signatureMethodURI,
        int hmacOutputLength,
        String canonicalizationMethodURI
    ) throws XMLSecurityException {

    /**
     * Constructor XMLSignature
     *
     * @param doc
     * @param baseURI
     * @param signatureMethodURI
     * @param hmacOutputLength
     * @param canonicalizationMethodURI
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public XMLSignature(
        Document doc,
        String baseURI,
        String signatureMethodURI,
        String canonicalizationMethodURI
    ) throws XMLSecurityException {

    /**
     * Constructor XMLSignature
     *
     * @param doc
     * @param baseURI
     * @param signatureMethodURI the Signature method to be used.
     * @param canonicalizationMethodURI the canonicalization algorithm to be
     * used to c14nize the SignedInfo element.
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public XMLSignature(Document doc, String baseURI, String signatureMethodURI,
                        int hmacOutputLength) throws XMLSecurityException {

    /**
     * Constructor XMLSignature
     *
     * @param doc
     * @param baseURI
     * @param signatureMethodURI the Signature method to be used.
     * @param hmacOutputLength
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public XMLSignature(Document doc, String baseURI, String signatureMethodURI)

    /**
     * This creates a new <CODE>ds:Signature</CODE> Element and adds an empty
     * <CODE>ds:SignedInfo</CODE>.
     * The <code>ds:SignedInfo</code> is initialized with the specified Signature
     * algorithm and Canonicalizer.ALGO_ID_C14N_OMIT_COMMENTS which is REQUIRED
     * by the spec. This method's main use is for creating a new signature.
     *
     * @param doc Document in which the signature will be appended after creation.
     * @param baseURI URI to be used as context for all relative URIs.
     * @param signatureMethodURI signature algorithm to use.
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    private boolean followManifestsDuringValidation = false;

    /**
     * Checking the digests in References in a Signature are mandatory, but for
     * References inside a Manifest it is application specific. This boolean is
     * to indicate that the References inside Manifests should be validated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    private KeyInfo keyInfo;

    /** ds:Signature.ds:KeyInfo */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    private SignedInfo signedInfo;

    /** ds:Signature.ds:SignedInfo element */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_SIGNATURE_ECDSA_SHA512 =

    /**Signature - Optional ECDSAwithSHA512 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_SIGNATURE_ECDSA_SHA384 =

    /**Signature - Optional ECDSAwithSHA384 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_SIGNATURE_ECDSA_SHA256 =

    /**Signature - Optional ECDSAwithSHA256 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_SIGNATURE_ECDSA_SHA1 =

    /**Signature - Optional ECDSAwithSHA1 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_MAC_HMAC_SHA512 =

    /** HMAC - Optional HMAC-SHA512 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_MAC_HMAC_SHA384 =

    /** HMAC - Optional HMAC-SHA284 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_MAC_HMAC_SHA256 =

    /** HMAC - Optional HMAC-SHA256 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_MAC_HMAC_RIPEMD160 =

    /** HMAC - Optional HMAC-RIPEMD160 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_MAC_HMAC_NOT_RECOMMENDED_MD5 =

    /** HMAC - NOT Recommended HMAC-MD5 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_SIGNATURE_RSA_SHA512 =

    /** Signature - Optional RSAwithSHA512 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_SIGNATURE_RSA_SHA384 =

    /** Signature - Optional RSAwithSHA384 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_SIGNATURE_RSA_SHA256 =

    /** Signature - Optional RSAwithSHA256 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_SIGNATURE_RSA_RIPEMD160 =

    /** Signature - Optional RSAwithRIPEMD160 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_SIGNATURE_NOT_RECOMMENDED_RSA_MD5 =

    /** Signature - NOT Recommended RSAwithMD5 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_SIGNATURE_RSA_SHA1 =

    /** Signature - Recommended RSAwithSHA1 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_SIGNATURE_RSA =

    /** Signature - Recommended RSAwithSHA1 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_SIGNATURE_DSA =

    /** Signature - Required DSAwithSHA1 (DSS) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_MAC_HMAC_SHA1 =

    /** MAC - Required HMAC-SHA1 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
public final class XMLSignature extends SignatureElementProxy {

/**
 * Handles <code>&lt;ds:Signature&gt;</code> elements.
 * This is the main class that deals with creating and verifying signatures.
 *
 * <p>There are 2 types of constructors for this class. The ones that take a
 * document, baseURI and 1 or more Java Objects. This is mostly used for
 * signing purposes.
 * The other constructor is the one that takes a DOM Element and a baseURI.
 * This is used mostly with for verifying, when you have a SignatureElement.
 *
 * There are a few different types of methods:
 * <ul><li>The addDocument* methods are used to add References with optional
 * transforms during signing. </li>
 * <li>addKeyInfo* methods are to add Certificates and Keys to the
 * KeyInfo tags during signing. </li>
 * <li>appendObject allows a user to add any XML Structure as an
 * ObjectContainer during signing.</li>
 * <li>sign and checkSignatureValue methods are used to sign and validate the
 * signature. </li></ul>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public String getBaseLocalName() {

    /**
     * Get the local name of this element
     *
     * @return Constants._TAG_SIGNATURE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public void setFollowNestedManifests(boolean followManifests) {

    /**
     * Signal whether Manifest should be automatically validated.
     * Checking the digests in References in a Signature are mandatory, but for
     * References inside a Manifest it is application specific. This boolean is
     * to indicate that the References inside Manifests should be validated.
     *
     * @param followManifests
     * @see <a href="http://www.w3.org/TR/xmldsig-core/#sec-CoreValidation">
     * Core validation section in the XML Signature Rec.</a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public SecretKey createSecretKey(byte[] secretKeyBytes) {

    /**
     * Proxy method for {@link SignedInfo#createSecretKey(byte[])}. If you want
     * to create a MAC, this method helps you to obtain the
     * {@link javax.crypto.SecretKey} from octets.
     *
     * @param secretKeyBytes
     * @return the secret key created.
     * @see SignedInfo#createSecretKey(byte[])
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public void addKeyInfo(PublicKey pk) {

    /**
     * Add this public key to the KeyInfo. This will include the complete key in
     * the KeyInfo structure.
     *
     * @param pk
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public void addKeyInfo(X509Certificate cert) throws XMLSecurityException {

    /**
     * Add an X509 Certificate to the KeyInfo. This will include the whole cert
     * inside X509Data/X509Certificate tags.
     *
     * @param cert Certificate to be included. This should be the certificate of
     * the key that was used to sign.
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public void addDocument(String referenceURI) throws XMLSignatureException {

    /**
     * Add a Reference with just this URI. It uses SHA1 by default as the digest
     * algorithm
     *
     * @param referenceURI URI according to the XML Signature specification.
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public void addDocument(String referenceURI, Transforms trans)

    /**
     * Adds a Reference with just the URI and the transforms. This used the
     * SHA1 algorithm as a default digest algorithm.
     *
     * @param referenceURI URI according to the XML Signature specification.
     * @param trans List of transformations to be applied.
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public void addDocument(
        String referenceURI,
        Transforms trans,
        String digestURI
    ) throws XMLSignatureException {

    /**
     * This method is a proxy method for the {@link Manifest#addDocument} method.
     *
     * @param referenceURI URI according to the XML Signature specification.
     * @param trans List of transformations to be applied.
     * @param digestURI URI of the digest algorithm to be used.
     * @see Manifest#addDocument
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public void addDocument(
        String referenceURI,
        Transforms trans,
        String digestURI,
        String referenceId,
        String referenceType
    ) throws XMLSignatureException {

    /**
     * Add a Reference with full parameters to this Signature
     *
     * @param referenceURI URI of the resource to be signed. Can be null in
     * which case the dereferencing is application specific. Can be "" in which
     * it's the parent node (or parent document?). There can only be one "" in
     * each signature.
     * @param trans Optional list of transformations to be done before digesting
     * @param digestURI Mandatory URI of the digesting algorithm to use.
     * @param referenceId Optional id attribute for this Reference
     * @param referenceType Optional mimetype for the URI
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public boolean checkSignatureValue(Key pk) throws XMLSignatureException {

    /**
     * Verifies if the signature is valid by redigesting all References,
     * comparing those against the stored DigestValues and then checking to see
     * if the Signatures match on the SignedInfo.
     *
     * @param pk {@link java.security.PublicKey} part of the keypair or
     * {@link javax.crypto.SecretKey} that was used to sign
     * @return true if the signature is valid, false otherwise
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public boolean checkSignatureValue(X509Certificate cert)

    /**
     * Extracts the public key from the certificate and verifies if the signature
     * is valid by re-digesting all References, comparing those against the
     * stored DigestValues and then checking to see if the Signatures match on
     * the SignedInfo.
     *
     * @param cert Certificate that contains the public key part of the keypair
     * that was used to sign.
     * @return true if the signature is valid, false otherwise
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public void addResourceResolver(ResourceResolverSpi resolver) {

    /**
     * Adds a {@link ResourceResolverSpi} to enable the retrieval of resources.
     *
     * @param resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public void addResourceResolver(ResourceResolver resolver) {

    /**
     * Adds a {@link ResourceResolver} to enable the retrieval of resources.
     *
     * @param resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public void sign(Key signingKey) throws XMLSignatureException {

    /**
     * Digests all References in the SignedInfo, calculates the signature value
     * and sets it in the SignatureValue Element.
     *
     * @param signingKey the {@link java.security.PrivateKey} or
     * {@link javax.crypto.SecretKey} that is used to sign.
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public int getObjectLength() {

    /**
     * Returns the number of all <code>ds:Object</code> elements.
     *
     * @return the number of all <code>ds:Object</code> elements.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public ObjectContainer getObjectItem(int i) {

    /**
     * Returns the <code>i<code>th <code>ds:Object</code> child of the signature
     * or null if no such <code>ds:Object</code> element exists.
     *
     * @param i
     * @return the <code>i<code>th <code>ds:Object</code> child of the signature
     * or null if no such <code>ds:Object</code> element exists.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public void appendObject(ObjectContainer object) throws XMLSignatureException {

    /**
     * Appends an Object (not a <code>java.lang.Object</code> but an Object
     * element) to the Signature. Please note that this is only possible
     * when signing.
     *
     * @param object ds:Object to be appended.
     * @throws XMLSignatureException When this object is used to verify.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public KeyInfo getKeyInfo() {

    /**
     * Returns the KeyInfo child. If we are in signing mode and the KeyInfo
     * does not exist yet, it is created on demand and added to the Signature.
     * <br>
     * This allows to add arbitrary content to the KeyInfo during signing.
     *
     * @return the KeyInfo object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    private void setSignatureValueElement(byte[] bytes) {

    /**
     * Base64 encodes and sets the bytes as the content of the SignatureValue
     * Node.
     *
     * @param bytes bytes to be used by SignatureValue before Base64 encoding
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public byte[] getSignatureValue() throws XMLSignatureException {

    /**
     * Returns the octet value of the SignatureValue element.
     * Throws an XMLSignatureException if it has no or wrong content.
     *
     * @return the value of the SignatureValue element.
     * @throws XMLSignatureException If there is no content
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public SignedInfo getSignedInfo() {

    /**
     * Returns the completely parsed <code>SignedInfo</code> object.
     *
     * @return the completely parsed <code>SignedInfo</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public String getId() {

    /**
     * Returns the <code>Id</code> attribute
     *
     * @return the <code>Id</code> attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public void setId(String id) {

    /**
     * Sets the <code>Id</code> attribute
     *
     * @param id Id value for the id attribute on the Signature Element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public XMLSignature(Element element, String baseURI, boolean secureValidation)

    /**
     * This will parse the element and construct the Java Objects.
     * That will allow a user to validate the signature.
     *
     * @param element ds:Signature element that contains the whole signature
     * @param baseURI URI to be prepended to all relative URIs
     * @param secureValidation whether secure secureValidation is enabled or not
     * @throws XMLSecurityException
     * @throws XMLSignatureException if the signature is badly formatted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public XMLSignature(Element element, String baseURI)

    /**
     * This will parse the element and construct the Java Objects.
     * That will allow a user to validate the signature.
     *
     * @param element ds:Signature element that contains the whole signature
     * @param baseURI URI to be prepended to all relative URIs
     * @throws XMLSecurityException
     * @throws XMLSignatureException if the signature is badly formatted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public XMLSignature(
        Document doc,
        String baseURI,
        Element SignatureMethodElem,
        Element CanonicalizationMethodElem
    ) throws XMLSecurityException {

    /**
     *  Creates a XMLSignature in a Document
     * @param doc
     * @param baseURI
     * @param SignatureMethodElem
     * @param CanonicalizationMethodElem
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public XMLSignature(
        Document doc,
        String baseURI,
        String signatureMethodURI,
        int hmacOutputLength,
        String canonicalizationMethodURI
    ) throws XMLSecurityException {

    /**
     * Constructor XMLSignature
     *
     * @param doc
     * @param baseURI
     * @param signatureMethodURI
     * @param hmacOutputLength
     * @param canonicalizationMethodURI
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public XMLSignature(
        Document doc,
        String baseURI,
        String signatureMethodURI,
        String canonicalizationMethodURI
    ) throws XMLSecurityException {

    /**
     * Constructor XMLSignature
     *
     * @param doc
     * @param baseURI
     * @param signatureMethodURI the Signature method to be used.
     * @param canonicalizationMethodURI the canonicalization algorithm to be
     * used to c14nize the SignedInfo element.
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public XMLSignature(Document doc, String baseURI, String signatureMethodURI,
                        int hmacOutputLength) throws XMLSecurityException {

    /**
     * Constructor XMLSignature
     *
     * @param doc
     * @param baseURI
     * @param signatureMethodURI the Signature method to be used.
     * @param hmacOutputLength
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public XMLSignature(Document doc, String baseURI, String signatureMethodURI)

    /**
     * This creates a new <CODE>ds:Signature</CODE> Element and adds an empty
     * <CODE>ds:SignedInfo</CODE>.
     * The <code>ds:SignedInfo</code> is initialized with the specified Signature
     * algorithm and Canonicalizer.ALGO_ID_C14N_OMIT_COMMENTS which is REQUIRED
     * by the spec. This method's main use is for creating a new signature.
     *
     * @param doc Document in which the signature will be appended after creation.
     * @param baseURI URI to be used as context for all relative URIs.
     * @param signatureMethodURI signature algorithm to use.
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    private boolean followManifestsDuringValidation = false;

    /**
     * Checking the digests in References in a Signature are mandatory, but for
     * References inside a Manifest it is application specific. This boolean is
     * to indicate that the References inside Manifests should be validated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    private KeyInfo keyInfo;

    /** ds:Signature.ds:KeyInfo */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    private SignedInfo signedInfo;

    /** ds:Signature.ds:SignedInfo element */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_SIGNATURE_ECDSA_SHA512 =

    /**Signature - Optional ECDSAwithSHA512 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_SIGNATURE_ECDSA_SHA384 =

    /**Signature - Optional ECDSAwithSHA384 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_SIGNATURE_ECDSA_SHA256 =

    /**Signature - Optional ECDSAwithSHA256 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_SIGNATURE_ECDSA_SHA1 =

    /**Signature - Optional ECDSAwithSHA1 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_MAC_HMAC_SHA512 =

    /** HMAC - Optional HMAC-SHA512 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_MAC_HMAC_SHA384 =

    /** HMAC - Optional HMAC-SHA284 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_MAC_HMAC_SHA256 =

    /** HMAC - Optional HMAC-SHA256 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_MAC_HMAC_RIPEMD160 =

    /** HMAC - Optional HMAC-RIPEMD160 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_MAC_HMAC_NOT_RECOMMENDED_MD5 =

    /** HMAC - NOT Recommended HMAC-MD5 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_SIGNATURE_RSA_SHA512 =

    /** Signature - Optional RSAwithSHA512 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_SIGNATURE_RSA_SHA384 =

    /** Signature - Optional RSAwithSHA384 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_SIGNATURE_RSA_SHA256 =

    /** Signature - Optional RSAwithSHA256 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_SIGNATURE_RSA_RIPEMD160 =

    /** Signature - Optional RSAwithRIPEMD160 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_SIGNATURE_NOT_RECOMMENDED_RSA_MD5 =

    /** Signature - NOT Recommended RSAwithMD5 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_SIGNATURE_RSA_SHA1 =

    /** Signature - Recommended RSAwithSHA1 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_SIGNATURE_RSA =

    /** Signature - Recommended RSAwithSHA1 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_SIGNATURE_DSA =

    /** Signature - Required DSAwithSHA1 (DSS) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
    public static final String ALGO_ID_MAC_HMAC_SHA1 =

    /** MAC - Required HMAC-SHA1 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
public final class XMLSignature extends SignatureElementProxy {

/**
 * Handles <code>&lt;ds:Signature&gt;</code> elements.
 * This is the main class that deals with creating and verifying signatures.
 *
 * <p>There are 2 types of constructors for this class. The ones that take a
 * document, baseURI and 1 or more Java Objects. This is mostly used for
 * signing purposes.
 * The other constructor is the one that takes a DOM Element and a baseURI.
 * This is used mostly with for verifying, when you have a SignatureElement.
 *
 * There are a few different types of methods:
 * <ul><li>The addDocument* methods are used to add References with optional
 * transforms during signing. </li>
 * <li>addKeyInfo* methods are to add Certificates and Keys to the
 * KeyInfo tags during signing. </li>
 * <li>appendObject allows a user to add any XML Structure as an
 * ObjectContainer during signing.</li>
 * <li>sign and checkSignatureValue methods are used to sign and validate the
 * signature. </li></ul>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignature.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/XMLSignature.java
        boolean validate(XMLValidateContext validateContext)

        /**
         * Validates the signature value. This method performs a
         * cryptographic validation of the signature calculated over the
         * <code>SignedInfo</code> of the <code>XMLSignature</code>.
         *
         * <p>This method only validates the signature the first
         * time it is invoked. On subsequent invocations, it returns a cached
         * result.
         *
         * @return <code>true</code> if the signature was
         *    validated successfully; <code>false</code> otherwise
         * @param validateContext the validating context
         * @throws NullPointerException if <code>validateContext</code> is
         *    <code>null</code>
         * @throws XMLSignatureException if an unexpected exception occurs while
         *    validating the signature
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/XMLSignature.java
        byte[] getValue();

        /**
         * Returns the signature value of this <code>SignatureValue</code>.
         *
         * @return the signature value (may be <code>null</code> if the
         *    <code>XMLSignature</code> has not been signed yet). Each
         *    invocation of this method returns a new clone of the array to
         *    prevent subsequent modification.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/XMLSignature.java
    public interface SignatureValue extends XMLStructure {

    /**
     * A representation of the XML <code>SignatureValue</code> element as
     * defined in the <a href="http://www.w3.org/TR/xmldsig-core/">
     * W3C Recommendation for XML-Signature Syntax and Processing</a>.
     * The XML Schema Definition is defined as:
     * <p>
     * <pre>
     *   &lt;element name="SignatureValue" type="ds:SignatureValueType"/&gt;
     *     &lt;complexType name="SignatureValueType"&gt;
     *       &lt;simpleContent&gt;
     *         &lt;extension base="base64Binary"&gt;
     *           &lt;attribute name="Id" type="ID" use="optional"/&gt;
     *         &lt;/extension&gt;
     *       &lt;/simpleContent&gt;
     *     &lt;/complexType&gt;
     * </pre>
     *
     * @author Sean Mullan
     * @author JSR 105 Expert Group
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/XMLSignature.java
    KeySelectorResult getKeySelectorResult();

    /**
     * Returns the result of the {@link KeySelector}, if specified, after
     * this <code>XMLSignature</code> has been signed or validated.
     *
     * @return the key selector result, or <code>null</code> if a key
     *    selector has not been specified or this <code>XMLSignature</code>
     *    has not been signed or validated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/XMLSignature.java
    void sign(XMLSignContext signContext) throws MarshalException,

    /**
     * Signs this <code>XMLSignature</code>.
     *
     * <p>If this method throws an exception, this <code>XMLSignature</code> and
     * the <code>signContext</code> parameter will be left in the state that
     * it was in prior to the invocation.
     *
     * @param signContext the signing context
     * @throws ClassCastException if the type of <code>signContext</code> is
     *    not compatible with this <code>XMLSignature</code>
     * @throws NullPointerException if <code>signContext</code> is
     *    <code>null</code>
     * @throws MarshalException if an exception occurs while marshalling
     * @throws XMLSignatureException if an unexpected exception occurs while
     *    generating the signature
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/XMLSignature.java
    SignatureValue getSignatureValue();

    /**
     * Returns the signature value of this <code>XMLSignature</code>.
     *
     * @return the signature value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/XMLSignature.java
    String getId();

    /**
     * Returns the optional Id of this <code>XMLSignature</code>.
     *
     * @return the Id (may be <code>null</code> if not specified)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/XMLSignature.java
    @SuppressWarnings("rawtypes")

    /**
     * Returns an {@link java.util.Collections#unmodifiableList unmodifiable
     * list} of {@link XMLObject}s contained in this <code>XMLSignature</code>.
     *
     * @return an unmodifiable list of <code>XMLObject</code>s (may be empty
     *    but never <code>null</code>)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/XMLSignature.java
    SignedInfo getSignedInfo();

    /**
     * Returns the signed info of this <code>XMLSignature</code>.
     *
     * @return the signed info (never <code>null</code>)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/XMLSignature.java
    KeyInfo getKeyInfo();

    /**
     * Returns the key info of this <code>XMLSignature</code>.
     *
     * @return the key info (may be <code>null</code> if not specified)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/XMLSignature.java
    boolean validate(XMLValidateContext validateContext)

    /**
     * Validates the signature according to the
     * <a href="http://www.w3.org/TR/xmldsig-core/#sec-CoreValidation">
     * core validation processing rules</a>. This method validates the
     * signature using the existing state, it does not unmarshal and
     * reinitialize the contents of the <code>XMLSignature</code> using the
     * location information specified in the context.
     *
     * <p>This method only validates the signature the first time it is
     * invoked. On subsequent invocations, it returns a cached result.
     *
     * @param validateContext the validating context
     * @return <code>true</code> if the signature passed core validation,
     *    otherwise <code>false</code>
     * @throws ClassCastException if the type of <code>validateContext</code>
     *    is not compatible with this <code>XMLSignature</code>
     * @throws NullPointerException if <code>validateContext</code> is
     *    <code>null</code>
     * @throws XMLSignatureException if an unexpected error occurs during
     *    validation that prevented the validation operation from completing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/XMLSignature.java
    final static String XMLNS = "http://www.w3.org/2000/09/xmldsig#";

    /**
     * The XML Namespace URI of the W3C Recommendation for XML-Signature
     * Syntax and Processing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/XMLSignature.java
public interface XMLSignature extends XMLStructure {

/**
 * A representation of the XML <code>Signature</code> element as
 * defined in the <a href="http://www.w3.org/TR/xmldsig-core/">
 * W3C Recommendation for XML-Signature Syntax and Processing</a>.
 * This class contains methods for signing and validating XML signatures
 * with behavior as defined by the W3C specification. The XML Schema Definition
 * is defined as:
 * <pre><code>
 * &lt;element name="Signature" type="ds:SignatureType"/&gt;
 * &lt;complexType name="SignatureType"&gt;
 *    &lt;sequence&gt;
 *      &lt;element ref="ds:SignedInfo"/&gt;
 *      &lt;element ref="ds:SignatureValue"/&gt;
 *      &lt;element ref="ds:KeyInfo" minOccurs="0"/&gt;
 *      &lt;element ref="ds:Object" minOccurs="0" maxOccurs="unbounded"/&gt;
 *    &lt;/sequence&gt;
 *    &lt;attribute name="Id" type="ID" use="optional"/&gt;
 * &lt;/complexType&gt;
 * </code></pre>
 * <p>
 * An <code>XMLSignature</code> instance may be created by invoking one of the
 * {@link XMLSignatureFactory#newXMLSignature newXMLSignature} methods of the
 * {@link XMLSignatureFactory} class.
 *
 * <p>If the contents of the underlying document containing the
 * <code>XMLSignature</code> are subsequently modified, the behavior is
 * undefined.
 *
 * <p>Note that this class is named <code>XMLSignature</code> rather than
 * <code>Signature</code> to avoid naming clashes with the existing
 * {@link Signature java.security.Signature} class.
 *
 * @see XMLSignatureFactory#newXMLSignature(SignedInfo, KeyInfo)
 * @see XMLSignatureFactory#newXMLSignature(SignedInfo, KeyInfo, List, String, String)
 * @author Joyce L. Leung
 * @author Sean Mullan
 * @author Erwin van der Koogh
 * @author JSR 105 Expert Group
 * @since 1.6
 */
