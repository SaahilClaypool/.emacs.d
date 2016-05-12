_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public String getBaseLocalName() {

    /**
     * Method getBaseLocalName
     *
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public int getSignedContentLength() {

    /**
     * Method getSignedContentLength
     *
     * @return The number of references contained in this reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public XMLSignatureInput getReferencedContentAfterTransformsItem(int i)

    /**
     * Method getReferencedContentAfterTransformsItem
     *
     * @param i
     * @return The contents after transformation of the reference i.
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public XMLSignatureInput getReferencedContentBeforeTransformsItem(int i)

    /**
     * Method getReferencedContentPriorTransformsItem
     *
     * @param i
     * @return The contents before transformation of the reference i.
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public byte[] getSignedContentItem(int i) throws XMLSignatureException {

    /**
     * Method getSignedContentItem
     *
     * @param i
     * @return The signed content of the i reference.
     *
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public String getResolverProperty(String key) {

    /**
     * Returns the value at specified key
     *
     * @param key the key
     * @return the value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public void setResolverProperty(String key, String value) {

    /**
     * Used to pass parameters like proxy servers etc to the ResourceResolver
     * implementation.
     *
     * @param key the key
     * @param value the value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public Map<String, String> getResolverProperties() {

    /**
     * Get the resolver property map
     * @return the resolver property map
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public List<ResourceResolver> getPerManifestResolvers() {

    /**
     * Get the Per-Manifest Resolver List
     * @return the per-manifest Resolver List
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public void addResourceResolver(ResourceResolverSpi resolverSpi) {

    /**
     * Adds Resource Resolver for retrieving resources at specified <code>URI</code> attribute
     * in <code>reference</code> element
     *
     * @param resolverSpi the implementation subclass of {@link ResourceResolverSpi} for
     * retrieving the resource.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public void addResourceResolver(ResourceResolver resolver) {

    /**
     * Adds Resource Resolver for retrieving resources at specified <code>URI</code> attribute
     * in <code>reference</code> element
     *
     * @param resolver {@link ResourceResolver} can provide the implemenatin subclass of
     * {@link ResourceResolverSpi} for retrieving resource.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public boolean getVerificationResult(int index) throws XMLSecurityException {

    /**
     * After verifying a {@link Manifest} or a {@link SignedInfo} using the
     * {@link Manifest#verifyReferences()} or {@link SignedInfo#verify()} methods,
     * the individual results can be retrieved with this method.
     *
     * @param index an index of into a {@link Manifest} or a {@link SignedInfo}
     * @return the results of reference validation at the specified index
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    private void setVerificationResult(int index, boolean verify) {

    /**
     * Method setVerificationResult
     *
     * @param index
     * @param verify
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public boolean verifyReferences(boolean followManifests)

    /**
     * Used to do a <A HREF="http://www.w3.org/TR/xmldsig-core/#def-ValidationReference">reference
     * validation</A> of all enclosed references using the {@link Reference#verify} method.
     *
     * <p>This step loops through all {@link Reference}s and does verify the hash
     * values. If one or more verifications fail, the method returns
     * <code>false</code>. If <i>all</i> verifications are successful,
     * it returns <code>true</code>. The results of the individual reference
     * validations are available by using the {@link #getVerificationResult(int)} method
     *
     * @param followManifests
     * @return true if all References verify, false if one or more do not verify.
     * @throws MissingResourceFailureException if a {@link Reference} does not verify
     * (throws a {@link com.sun.org.apache.xml.internal.security.signature.ReferenceNotInitializedException}
     * because of an uninitialized {@link XMLSignatureInput}
     * @see com.sun.org.apache.xml.internal.security.signature.Reference#verify
     * @see com.sun.org.apache.xml.internal.security.signature.SignedInfo#verify(boolean)
     * @see com.sun.org.apache.xml.internal.security.signature.MissingResourceFailureException
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public boolean verifyReferences()

    /**
     * Used to do a <A HREF="http://www.w3.org/TR/xmldsig-core/#def-ValidationReference">reference
     * validation</A> of all enclosed references using the {@link Reference#verify} method.
     *
     * <p>This step loops through all {@link Reference}s and does verify the hash
     * values. If one or more verifications fail, the method returns
     * <code>false</code>. If <i>all</i> verifications are successful,
     * it returns <code>true</code>. The results of the individual reference
     * validations are available by using the {@link #getVerificationResult(int)} method
     *
     * @return true if all References verify, false if one or more do not verify.
     * @throws MissingResourceFailureException if a {@link Reference} does not verify
     * (throws a {@link com.sun.org.apache.xml.internal.security.signature.ReferenceNotInitializedException}
     * because of an uninitialized {@link XMLSignatureInput}
     * @see com.sun.org.apache.xml.internal.security.signature.Reference#verify
     * @see com.sun.org.apache.xml.internal.security.signature.SignedInfo#verify()
     * @see com.sun.org.apache.xml.internal.security.signature.MissingResourceFailureException
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public String getId() {

    /**
     * Returns the <code>Id</code> attribute
     *
     * @return the <code>Id</code> attribute in <code>ds:Manifest</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public void setId(String Id) {

    /**
     * Sets the <code>Id</code> attribute
     *
     * @param Id the <code>Id</code> attribute in <code>ds:Manifest</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public Reference item(int i) throws XMLSecurityException {

    /**
     * Return the <it>i</it><sup>th</sup> reference. Valid <code>i</code>
     * values are 0 to <code>{link@ getSize}-1</code>.
     *
     * @param i Index of the requested {@link Reference}
     * @return the <it>i</it><sup>th</sup> reference
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public int getLength() {

    /**
     * Return the nonnegative number of added references.
     *
     * @return the number of references
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public void generateDigestValues()

    /**
     * The calculation of the DigestValues in the References must be after the
     * References are already added to the document and during the signing
     * process. This ensures that all necessary data is in place.
     *
     * @throws ReferenceNotInitializedException
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public void addDocument(
        String baseURI, String referenceURI, Transforms transforms,
        String digestURI, String referenceId, String referenceType
    ) throws XMLSignatureException {

    /**
     * This <code>addDocument</code> method is used to add a new resource to the
     * signed info. A {@link com.sun.org.apache.xml.internal.security.signature.Reference} is built
     * from the supplied values.
     *
     * @param baseURI the URI of the resource where the XML instance was stored
     * @param referenceURI <code>URI</code> attribute in <code>Reference</code> for specifying
     * where data is
     * @param transforms com.sun.org.apache.xml.internal.security.signature.Transforms object with an ordered
     * list of transformations to be performed.
     * @param digestURI The digest algorithm URI to be used.
     * @param referenceId
     * @param referenceType
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public Manifest(
        Element element, String baseURI, boolean secureValidation
    ) throws XMLSecurityException {

    /**
     * Constructor Manifest
     *
     * @param element
     * @param baseURI
     * @param secureValidation
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public Manifest(Element element, String baseURI) throws XMLSecurityException {

    /**
     * Constructor Manifest
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public Manifest(Document doc) {

    /**
     * Constructs {@link Manifest}
     *
     * @param doc the {@link Document} in which <code>XMLsignature</code> is placed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    private List<ResourceResolver> perManifestResolvers = null;

    /** Field perManifestResolvers */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    private Map<String, String> resolverProperties = null;

    /** Field resolverProperties */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    private boolean verificationResults[] = null;

    /** Field verificationResults[] */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    private List<Reference> references;

    /** Field references */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public static final int MAXIMUM_REFERENCE_COUNT = 30;

    /**
     * The maximum number of references per Manifest, if secure validation is enabled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
public class Manifest extends SignatureElementProxy {

/**
 * Handles <code>&lt;ds:Manifest&gt;</code> elements.
 * <p> This element holds the <code>Reference</code> elements</p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public String getBaseLocalName() {

    /**
     * Method getBaseLocalName
     *
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public int getSignedContentLength() {

    /**
     * Method getSignedContentLength
     *
     * @return The number of references contained in this reference.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public XMLSignatureInput getReferencedContentAfterTransformsItem(int i)

    /**
     * Method getReferencedContentAfterTransformsItem
     *
     * @param i
     * @return The contents after transformation of the reference i.
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public XMLSignatureInput getReferencedContentBeforeTransformsItem(int i)

    /**
     * Method getReferencedContentPriorTransformsItem
     *
     * @param i
     * @return The contents before transformation of the reference i.
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public byte[] getSignedContentItem(int i) throws XMLSignatureException {

    /**
     * Method getSignedContentItem
     *
     * @param i
     * @return The signed content of the i reference.
     *
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public String getResolverProperty(String key) {

    /**
     * Returns the value at specified key
     *
     * @param key the key
     * @return the value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public void setResolverProperty(String key, String value) {

    /**
     * Used to pass parameters like proxy servers etc to the ResourceResolver
     * implementation.
     *
     * @param key the key
     * @param value the value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public Map<String, String> getResolverProperties() {

    /**
     * Get the resolver property map
     * @return the resolver property map
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public List<ResourceResolver> getPerManifestResolvers() {

    /**
     * Get the Per-Manifest Resolver List
     * @return the per-manifest Resolver List
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public void addResourceResolver(ResourceResolverSpi resolverSpi) {

    /**
     * Adds Resource Resolver for retrieving resources at specified <code>URI</code> attribute
     * in <code>reference</code> element
     *
     * @param resolverSpi the implementation subclass of {@link ResourceResolverSpi} for
     * retrieving the resource.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public void addResourceResolver(ResourceResolver resolver) {

    /**
     * Adds Resource Resolver for retrieving resources at specified <code>URI</code> attribute
     * in <code>reference</code> element
     *
     * @param resolver {@link ResourceResolver} can provide the implemenatin subclass of
     * {@link ResourceResolverSpi} for retrieving resource.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public boolean getVerificationResult(int index) throws XMLSecurityException {

    /**
     * After verifying a {@link Manifest} or a {@link SignedInfo} using the
     * {@link Manifest#verifyReferences()} or {@link SignedInfo#verify()} methods,
     * the individual results can be retrieved with this method.
     *
     * @param index an index of into a {@link Manifest} or a {@link SignedInfo}
     * @return the results of reference validation at the specified index
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    private void setVerificationResult(int index, boolean verify) {

    /**
     * Method setVerificationResult
     *
     * @param index
     * @param verify
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public boolean verifyReferences(boolean followManifests)

    /**
     * Used to do a <A HREF="http://www.w3.org/TR/xmldsig-core/#def-ValidationReference">reference
     * validation</A> of all enclosed references using the {@link Reference#verify} method.
     *
     * <p>This step loops through all {@link Reference}s and does verify the hash
     * values. If one or more verifications fail, the method returns
     * <code>false</code>. If <i>all</i> verifications are successful,
     * it returns <code>true</code>. The results of the individual reference
     * validations are available by using the {@link #getVerificationResult(int)} method
     *
     * @param followManifests
     * @return true if all References verify, false if one or more do not verify.
     * @throws MissingResourceFailureException if a {@link Reference} does not verify
     * (throws a {@link com.sun.org.apache.xml.internal.security.signature.ReferenceNotInitializedException}
     * because of an uninitialized {@link XMLSignatureInput}
     * @see com.sun.org.apache.xml.internal.security.signature.Reference#verify
     * @see com.sun.org.apache.xml.internal.security.signature.SignedInfo#verify(boolean)
     * @see com.sun.org.apache.xml.internal.security.signature.MissingResourceFailureException
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public boolean verifyReferences()

    /**
     * Used to do a <A HREF="http://www.w3.org/TR/xmldsig-core/#def-ValidationReference">reference
     * validation</A> of all enclosed references using the {@link Reference#verify} method.
     *
     * <p>This step loops through all {@link Reference}s and does verify the hash
     * values. If one or more verifications fail, the method returns
     * <code>false</code>. If <i>all</i> verifications are successful,
     * it returns <code>true</code>. The results of the individual reference
     * validations are available by using the {@link #getVerificationResult(int)} method
     *
     * @return true if all References verify, false if one or more do not verify.
     * @throws MissingResourceFailureException if a {@link Reference} does not verify
     * (throws a {@link com.sun.org.apache.xml.internal.security.signature.ReferenceNotInitializedException}
     * because of an uninitialized {@link XMLSignatureInput}
     * @see com.sun.org.apache.xml.internal.security.signature.Reference#verify
     * @see com.sun.org.apache.xml.internal.security.signature.SignedInfo#verify()
     * @see com.sun.org.apache.xml.internal.security.signature.MissingResourceFailureException
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public String getId() {

    /**
     * Returns the <code>Id</code> attribute
     *
     * @return the <code>Id</code> attribute in <code>ds:Manifest</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public void setId(String Id) {

    /**
     * Sets the <code>Id</code> attribute
     *
     * @param Id the <code>Id</code> attribute in <code>ds:Manifest</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public Reference item(int i) throws XMLSecurityException {

    /**
     * Return the <it>i</it><sup>th</sup> reference. Valid <code>i</code>
     * values are 0 to <code>{link@ getSize}-1</code>.
     *
     * @param i Index of the requested {@link Reference}
     * @return the <it>i</it><sup>th</sup> reference
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public int getLength() {

    /**
     * Return the nonnegative number of added references.
     *
     * @return the number of references
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public void generateDigestValues()

    /**
     * The calculation of the DigestValues in the References must be after the
     * References are already added to the document and during the signing
     * process. This ensures that all necessary data is in place.
     *
     * @throws ReferenceNotInitializedException
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public void addDocument(
        String baseURI, String referenceURI, Transforms transforms,
        String digestURI, String referenceId, String referenceType
    ) throws XMLSignatureException {

    /**
     * This <code>addDocument</code> method is used to add a new resource to the
     * signed info. A {@link com.sun.org.apache.xml.internal.security.signature.Reference} is built
     * from the supplied values.
     *
     * @param baseURI the URI of the resource where the XML instance was stored
     * @param referenceURI <code>URI</code> attribute in <code>Reference</code> for specifying
     * where data is
     * @param transforms com.sun.org.apache.xml.internal.security.signature.Transforms object with an ordered
     * list of transformations to be performed.
     * @param digestURI The digest algorithm URI to be used.
     * @param referenceId
     * @param referenceType
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public Manifest(
        Element element, String baseURI, boolean secureValidation
    ) throws XMLSecurityException {

    /**
     * Constructor Manifest
     *
     * @param element
     * @param baseURI
     * @param secureValidation
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public Manifest(Element element, String baseURI) throws XMLSecurityException {

    /**
     * Constructor Manifest
     *
     * @param element
     * @param baseURI
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public Manifest(Document doc) {

    /**
     * Constructs {@link Manifest}
     *
     * @param doc the {@link Document} in which <code>XMLsignature</code> is placed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    private List<ResourceResolver> perManifestResolvers = null;

    /** Field perManifestResolvers */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    private Map<String, String> resolverProperties = null;

    /** Field resolverProperties */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    private boolean verificationResults[] = null;

    /** Field verificationResults[] */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    private List<Reference> references;

    /** Field references */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
    public static final int MAXIMUM_REFERENCE_COUNT = 30;

    /**
     * The maximum number of references per Manifest, if secure validation is enabled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
public class Manifest extends SignatureElementProxy {

/**
 * Handles <code>&lt;ds:Manifest&gt;</code> elements.
 * <p> This element holds the <code>Reference</code> elements</p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Manifest.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Manifest.java
    public Object clone() {

    /**
     * Returns a shallow copy of this Manifest.  The shallow copy is
     * implemented as follows:
     * <pre>
     *     public Object clone() { return new Manifest(this); }
     * </pre>
     * @return a shallow copy of this Manifest
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Manifest.java
    public int hashCode() {

    /**
     * Returns the hash code for this Manifest.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Manifest.java
    public boolean equals(Object o) {

    /**
     * Returns true if the specified Object is also a Manifest and has
     * the same main Attributes and entries.
     *
     * @param o the object to be compared
     * @return true if the specified Object is also a Manifest and has
     * the same main Attributes and entries
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Manifest.java
    public void read(InputStream is) throws IOException {

    /**
     * Reads the Manifest from the specified InputStream. The entry
     * names and attributes read will be merged in with the current
     * manifest entries.
     *
     * @param is the input stream
     * @exception IOException if an I/O error has occurred
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Manifest.java
    static void make72Safe(StringBuffer line) {

    /**
     * Adds line breaks to enforce a maximum 72 bytes per line.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Manifest.java
    public void write(OutputStream out) throws IOException {

    /**
     * Writes the Manifest to the specified OutputStream.
     * Attributes.Name.MANIFEST_VERSION must be set in
     * MainAttributes prior to invoking this method.
     *
     * @param out the output stream
     * @exception IOException if an I/O error has occurred
     * @see #getMainAttributes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Manifest.java
    public void clear() {

    /**
     * Clears the main Attributes as well as the entries in this Manifest.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Manifest.java
    public Attributes getAttributes(String name) {

    /**
     * Returns the Attributes for the specified entry name.
     * This method is defined as:
     * <pre>
     *      return (Attributes)getEntries().get(name)
     * </pre>
     * Though {@code null} is a valid {@code name}, when
     * {@code getAttributes(null)} is invoked on a {@code Manifest}
     * obtained from a jar file, {@code null} will be returned.  While jar
     * files themselves do not allow {@code null}-named attributes, it is
     * possible to invoke {@link #getEntries} on a {@code Manifest}, and
     * on that result, invoke {@code put} with a null key and an
     * arbitrary value.  Subsequent invocations of
     * {@code getAttributes(null)} will return the just-{@code put}
     * value.
     * <p>
     * Note that this method does not return the manifest's main attributes;
     * see {@link #getMainAttributes}.
     *
     * @param name entry name
     * @return the Attributes for the specified entry name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Manifest.java
    public Map<String,Attributes> getEntries() {

    /**
     * Returns a Map of the entries contained in this Manifest. Each entry
     * is represented by a String name (key) and associated Attributes (value).
     * The Map permits the {@code null} key, but no entry with a null key is
     * created by {@link #read}, nor is such an entry written by using {@link
     * #write}.
     *
     * @return a Map of the entries contained in this Manifest
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Manifest.java
    public Attributes getMainAttributes() {

    /**
     * Returns the main Attributes for the Manifest.
     * @return the main Attributes for the Manifest
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Manifest.java
    public Manifest(Manifest man) {

    /**
     * Constructs a new Manifest that is a copy of the specified Manifest.
     *
     * @param man the Manifest to copy
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Manifest.java
    public Manifest(InputStream is) throws IOException {

    /**
     * Constructs a new Manifest from the specified input stream.
     *
     * @param is the input stream containing manifest data
     * @throws IOException if an I/O error has occurred
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Manifest.java
    public Manifest() {

    /**
     * Constructs a new, empty Manifest.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/jar/Manifest.java
public class Manifest implements Cloneable {

/**
 * The Manifest class is used to maintain Manifest entry names and their
 * associated Attributes. There are main Manifest Attributes as well as
 * per-entry Attributes. For information on the Manifest format, please
 * see the
 * <a href="../../../../technotes/guides/jar/jar.html">
 * Manifest format specification</a>.
 *
 * @author  David Connelly
 * @see     Attributes
 * @since   1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/Manifest.java
    @SuppressWarnings("rawtypes")

    /**
     * Returns an {@link java.util.Collections#unmodifiableList unmodifiable
     * list} of one or more {@link Reference}s that are contained in this
     * <code>Manifest</code>.
     *
     * @return an unmodifiable list of one or more <code>Reference</code>s
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/Manifest.java
    String getId();

    /**
     * Returns the Id of this <code>Manifest</code>.
     *
     * @return the Id  of this <code>Manifest</code> (or <code>null</code>
     *    if not specified)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/Manifest.java
    final static String TYPE = "http://www.w3.org/2000/09/xmldsig#Manifest";

    /**
     * URI that identifies the <code>Manifest</code> element (this can be
     * specified as the value of the <code>type</code> parameter of the
     * {@link Reference} class to identify the referent's type).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/Manifest.java
public interface Manifest extends XMLStructure {

/**
 * A representation of the XML <code>Manifest</code> element as defined in
 * the <a href="http://www.w3.org/TR/xmldsig-core/">
 * W3C Recommendation for XML-Signature Syntax and Processing</a>.
 * The XML Schema Definition is defined as:
 * <pre>{@code
 * <element name="Manifest" type="ds:ManifestType"/>
 *   <complexType name="ManifestType">
 *     <sequence>
 *       <element ref="ds:Reference" maxOccurs="unbounded"/>
 *     </sequence>
 *     <attribute name="Id" type="ID" use="optional"/>
 *   </complexType>
 * }</pre>
 *
 * A <code>Manifest</code> instance may be created by invoking
 * one of the {@link XMLSignatureFactory#newManifest newManifest}
 * methods of the {@link XMLSignatureFactory} class; for example:
 *
 * <pre>
 *   XMLSignatureFactory factory = XMLSignatureFactory.getInstance("DOM");
 *   List references = Collections.singletonList(factory.newReference
 *       ("#reference-1", DigestMethod.SHA1));
 *   Manifest manifest = factory.newManifest(references, "manifest-1");
 * </pre>
 *
 * @author Sean Mullan
 * @author JSR 105 Expert Group
 * @since 1.6
 * @see XMLSignatureFactory#newManifest(List)
 * @see XMLSignatureFactory#newManifest(List, String)
 */
