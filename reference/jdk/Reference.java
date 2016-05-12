_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Reference.java
    void removeElementRetrievalInformation(Element info);

    /**
     * Removes the specified retrieval information.
     *
     * @param info
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Reference.java
    void addElementRetrievalInformation(Element info);

    /**
     * Adds retrieval information.
     *
     * @param info
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Reference.java
    Iterator<Element> getElementRetrievalInformation();

    /**
     * Returns an <code>Iterator</code> over all the child elements contained in
     * this <code>Reference</code> that will aid the recipient in retrieving the
     * <code>EncryptedKey</code> and/or <code>EncryptedData</code> elements.
     * These could include information such as XPath transforms, decompression
     * transforms, or information on how to retrieve the elements from a
     * document storage facility.
     *
     * @return child elements.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Reference.java
    void setURI(String uri);

    /**
     * Sets a <code>URI</code> that points to an <code>Element</code> that
     * were encrypted using the key defined in the enclosing
     * <code>EncryptedKey</code> element.
     *
     * @param uri the Uniform Resource Identifier that qualifies an
     *   <code>EncryptedType</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Reference.java
    String getURI();

    /**
     * Returns a <code>URI</code> that points to an <code>Element</code> that
     * were encrypted using the key defined in the enclosing
     * <code>EncryptedKey</code> element.
     *
     * @return an Uniform Resource Identifier that qualifies an
     *   <code>EncryptedType</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Reference.java
public interface Reference {

/**
 * A wrapper for a pointer from a key value of an <code>EncryptedKey</code> to
 * items encrypted by that key value (<code>EncryptedData</code> or
 * <code>EncryptedKey</code> elements).
 * <p>
 * It is defined as follows:
 * <xmp>
 * <complexType name='ReferenceType'>
 *     <sequence>
 *         <any namespace='##other' minOccurs='0' maxOccurs='unbounded'/>
 *     </sequence>
 *     <attribute name='URI' type='anyURI' use='required'/>
 * </complexType>
 * </xmp>
 *
 * @author Axl Mattheus
 * @see ReferenceList
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Reference.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public String getBaseLocalName() {

    /**
     * Method getBaseLocalName
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public boolean verify()

    /**
     * Tests reference validation is success or false
     *
     * @return true if reference validation is success, otherwise false
     * @throws ReferenceNotInitializedException
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public byte[] getDigestValue() throws Base64DecodingException, XMLSecurityException {

    /**
     * Returns the digest value.
     *
     * @return the digest value.
     * @throws Base64DecodingException if Reference contains no proper base64 encoded data.
     * @throws XMLSecurityException if the Reference does not contain a DigestValue element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    private byte[] calculateDigest(boolean validating)

    /**
     * Method calculateDigest
     *
     * @param validating true if validating the reference
     * @return reference Calculate the digest of this reference.
     * @throws ReferenceNotInitializedException
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public byte[] getReferencedBytes()

    /**
     * Method getReferencedBytes
     *
     * @return the bytes that will be used to generated digest.
     * @throws ReferenceNotInitializedException
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public Transforms getTransforms()

    /**
     * Method getTransforms
     *
     * @return The transforms that applied this reference.
     * @throws InvalidTransformException
     * @throws TransformationException
     * @throws XMLSecurityException
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    private void cacheDereferencedElement(XMLSignatureInput input) {

    /**
     * Store the dereferenced Element(s) so that it/they can be retrieved later.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    protected XMLSignatureInput dereferenceURIandPerformTransforms(OutputStream os)

    /**
     * This method returns the {@link XMLSignatureInput} which is referenced by the
     * <CODE>URI</CODE> Attribute.
     * @param os where to write the transformation can be null.
     * @return the element to digest
     *
     * @throws XMLSignatureException
     * @see Manifest#verifyReferences()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public ReferenceData getReferenceData() {

    /**
     * Get the ReferenceData that corresponds to the cached representation of the dereferenced
     * object before transformation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public XMLSignatureInput getTransformsOutput() {

    /**
     * This method only works works after a call to verify.
     * @return the transformed output(i.e. what is going to be digested).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public String getHTMLRepresentation() throws XMLSignatureException {

    /**
     * Method getHTMLRepresentation
     * @return The HTML of the transformation
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public XMLSignatureInput getNodesetBeforeFirstCanonicalization()

    /**
     * This method returns the XMLSignatureInput which represents the node set before
     * some kind of canonicalization is applied for the first time.
     * @return Gets a the node doing everything till the first c14n is needed
     *
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public XMLSignatureInput getContentsAfterTransformation()

    /**
     * Returns the XMLSignatureInput which is the result of the Transforms.
     * @return a XMLSignatureInput with all transformations applied.
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public XMLSignatureInput getContentsBeforeTransformation()

    /**
     * Returns the XMLSignatureInput which is created by de-referencing the URI attribute.
     * @return the XMLSignatureInput of the source of this reference
     * @throws ReferenceNotInitializedException If the resolver found any
     * problem resolving the reference
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public void generateDigestValue()

    /**
     * Method generateDigestValue
     *
     * @throws ReferenceNotInitializedException
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    private void setDigestValueElement(byte[] digestValue) {

    /**
     * Method setDigestValueElement
     *
     * @param digestValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public boolean typeIsReferenceToManifest() {

    /**
     * Method isReferenceToManifest
     *
     * This returns true if the <CODE>Type</CODE> attribute of the
     * <CODE>Reference</CODE> element points to a <CODE>#Manifest</CODE> element
     *
     * @return true if the Reference type indicates that this Reference points to a
     * {@link Manifest}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public boolean typeIsReferenceToObject() {

    /**
     * Method isReferenceToObject
     *
     * This returns true if the <CODE>Type</CODE> attribute of the
     * <CODE>Reference</CODE> element points to a <CODE>#Object</CODE> element
     *
     * @return true if the Reference type indicates that this Reference points to an
     * <code>Object</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public String getType() {

    /**
     * Return the <code>type</code> atttibute of the Reference indicate whether an
     * <code>ds:Object</code>, <code>ds:SignatureProperty</code>, or <code>ds:Manifest</code>
     * element
     *
     * @return the <code>type</code> attribute of the Reference
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public void setType(String type) {

    /**
     * Sets the <code>type</code> atttibute of the Reference indicate whether an
     * <code>ds:Object</code>, <code>ds:SignatureProperty</code>, or <code>ds:Manifest</code>
     * element.
     *
     * @param type the <code>type</code> attribute of the Reference
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public String getId() {

    /**
     * Returns the <code>Id</code> attribute of this <code>Reference</code> element
     *
     * @return Id the <code>Id</code> attribute of this <code>Reference</code> element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public void setId(String id) {

    /**
     * Sets the <code>Id</code> attribute of this <code>Reference</code> element
     *
     * @param id the <code>Id</code> attribute of this <code>Reference</code> element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public String getURI() {

    /**
     * Returns the <code>URI</code> of this <code>Reference</code> element
     *
     * @return URI the <code>URI</code> of this <code>Reference</code> element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public void setURI(String uri) {

    /**
     * Sets the <code>URI</code> of this <code>Reference</code> element
     *
     * @param uri the <code>URI</code> of this <code>Reference</code> element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public MessageDigestAlgorithm getMessageDigestAlgorithm() throws XMLSignatureException {

    /**
     * Returns {@link MessageDigestAlgorithm}
     *
     *
     * @return {@link MessageDigestAlgorithm}
     *
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    protected Reference(Element element, String baseURI, Manifest manifest, boolean secureValidation)

    /**
     * Build a {@link Reference} from an {@link Element}
     *
     * @param element <code>Reference</code> element
     * @param baseURI the URI of the resource where the XML instance was stored
     * @param manifest is the {@link Manifest} of {@link SignedInfo} in which the Reference occurs.
     * @param secureValidation whether secure validation is enabled or not
     * We need this because the Manifest has the individual {@link ResourceResolver}s which have
     * been set by the user
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    protected Reference(Element element, String baseURI, Manifest manifest) throws XMLSecurityException {

    /**
     * Build a {@link Reference} from an {@link Element}
     *
     * @param element <code>Reference</code> element
     * @param baseURI the URI of the resource where the XML instance was stored
     * @param manifest is the {@link Manifest} of {@link SignedInfo} in which the Reference occurs.
     * We need this because the Manifest has the individual {@link ResourceResolver}s which have
     * been set by the user
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    protected Reference(
        Document doc, String baseURI, String referenceURI, Manifest manifest,
        Transforms transforms, String messageDigestAlgorithm
    ) throws XMLSignatureException {

    /**
     * Constructor Reference
     *
     * @param doc the {@link Document} in which <code>XMLsignature</code> is placed
     * @param baseURI the URI of the resource where the XML instance will be stored
     * @param referenceURI URI indicate where is data which will digested
     * @param manifest
     * @param transforms {@link Transforms} applied to data
     * @param messageDigestAlgorithm {@link MessageDigestAlgorithm Digest algorithm} which is
     * applied to the data
     * TODO should we throw XMLSignatureException if MessageDigestAlgoURI is wrong?
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    private static final java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    private static boolean useC14N11 = (
        AccessController.doPrivileged(new PrivilegedAction<Boolean>() {

    /**
     * Look up useC14N11 system property. If true, an explicit C14N11 transform
     * will be added if necessary when generating the signature. See section
     * 3.1.1 of http://www.w3.org/2007/xmlsec/Drafts/xmldsig-core/ for more info.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public static final int MAXIMUM_TRANSFORM_COUNT = 5;

    /**
     * The maximum number of transforms per reference, if secure validation is enabled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public static final String MANIFEST_URI = Constants.SignatureSpecNS + Constants._TAG_MANIFEST;

    /** Field MANIFEST_URI */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public static final String OBJECT_URI = Constants.SignatureSpecNS + Constants._TAG_OBJECT;

    /** Field OBJECT_URI */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
public class Reference extends SignatureElementProxy {

/**
 * Handles <code>&lt;ds:Reference&gt;</code> elements.
 *
 * This includes:
 *
 * Constructs a <CODE>ds:Reference</CODE> from an {@link org.w3c.dom.Element}.
 *
 * <p>Create a new reference</p>
 * <pre>
 * Document doc;
 * MessageDigestAlgorithm sha1 = MessageDigestAlgorithm.getInstance("http://#sha1");
 * Reference ref = new Reference(new XMLSignatureInput(new FileInputStream("1.gif"),
 *                               "http://localhost/1.gif",
 *                               (Transforms) null, sha1);
 * Element refElem = ref.toElement(doc);
 * </pre>
 *
 * <p>Verify a reference</p>
 * <pre>
 * Element refElem = doc.getElement("Reference"); // PSEUDO
 * Reference ref = new Reference(refElem);
 * String url = ref.getURI();
 * ref.setData(new XMLSignatureInput(new FileInputStream(url)));
 * if (ref.verify()) {
 *    System.out.println("verified");
 * }
 * </pre>
 *
 * <pre>
 * &lt;element name="Reference" type="ds:ReferenceType"/&gt;
 *  &lt;complexType name="ReferenceType"&gt;
 *    &lt;sequence&gt;
 *      &lt;element ref="ds:Transforms" minOccurs="0"/&gt;
 *      &lt;element ref="ds:DigestMethod"/&gt;
 *      &lt;element ref="ds:DigestValue"/&gt;
 *    &lt;/sequence&gt;
 *    &lt;attribute name="Id" type="ID" use="optional"/&gt;
 *    &lt;attribute name="URI" type="anyURI" use="optional"/&gt;
 *    &lt;attribute name="Type" type="anyURI" use="optional"/&gt;
 *  &lt;/complexType&gt;
 * </pre>
 *
 * @author Christian Geuer-Pollmann
 * @see ObjectContainer
 * @see Manifest
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Reference.java
    void removeElementRetrievalInformation(Element info);

    /**
     * Removes the specified retrieval information.
     *
     * @param info
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Reference.java
    void addElementRetrievalInformation(Element info);

    /**
     * Adds retrieval information.
     *
     * @param info
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Reference.java
    Iterator<Element> getElementRetrievalInformation();

    /**
     * Returns an <code>Iterator</code> over all the child elements contained in
     * this <code>Reference</code> that will aid the recipient in retrieving the
     * <code>EncryptedKey</code> and/or <code>EncryptedData</code> elements.
     * These could include information such as XPath transforms, decompression
     * transforms, or information on how to retrieve the elements from a
     * document storage facility.
     *
     * @return child elements.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Reference.java
    void setURI(String uri);

    /**
     * Sets a <code>URI</code> that points to an <code>Element</code> that
     * were encrypted using the key defined in the enclosing
     * <code>EncryptedKey</code> element.
     *
     * @param uri the Uniform Resource Identifier that qualifies an
     *   <code>EncryptedType</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Reference.java
    String getURI();

    /**
     * Returns a <code>URI</code> that points to an <code>Element</code> that
     * were encrypted using the key defined in the enclosing
     * <code>EncryptedKey</code> element.
     *
     * @return an Uniform Resource Identifier that qualifies an
     *   <code>EncryptedType</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Reference.java
public interface Reference {

/**
 * A wrapper for a pointer from a key value of an <code>EncryptedKey</code> to
 * items encrypted by that key value (<code>EncryptedData</code> or
 * <code>EncryptedKey</code> elements).
 * <p>
 * It is defined as follows:
 * <xmp>
 * <complexType name='ReferenceType'>
 *     <sequence>
 *         <any namespace='##other' minOccurs='0' maxOccurs='unbounded'/>
 *     </sequence>
 *     <attribute name='URI' type='anyURI' use='required'/>
 * </complexType>
 * </xmp>
 *
 * @author Axl Mattheus
 * @see ReferenceList
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/Reference.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public String getBaseLocalName() {

    /**
     * Method getBaseLocalName
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public boolean verify()

    /**
     * Tests reference validation is success or false
     *
     * @return true if reference validation is success, otherwise false
     * @throws ReferenceNotInitializedException
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public byte[] getDigestValue() throws Base64DecodingException, XMLSecurityException {

    /**
     * Returns the digest value.
     *
     * @return the digest value.
     * @throws Base64DecodingException if Reference contains no proper base64 encoded data.
     * @throws XMLSecurityException if the Reference does not contain a DigestValue element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    private byte[] calculateDigest(boolean validating)

    /**
     * Method calculateDigest
     *
     * @param validating true if validating the reference
     * @return reference Calculate the digest of this reference.
     * @throws ReferenceNotInitializedException
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public byte[] getReferencedBytes()

    /**
     * Method getReferencedBytes
     *
     * @return the bytes that will be used to generated digest.
     * @throws ReferenceNotInitializedException
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public Transforms getTransforms()

    /**
     * Method getTransforms
     *
     * @return The transforms that applied this reference.
     * @throws InvalidTransformException
     * @throws TransformationException
     * @throws XMLSecurityException
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    private void cacheDereferencedElement(XMLSignatureInput input) {

    /**
     * Store the dereferenced Element(s) so that it/they can be retrieved later.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    protected XMLSignatureInput dereferenceURIandPerformTransforms(OutputStream os)

    /**
     * This method returns the {@link XMLSignatureInput} which is referenced by the
     * <CODE>URI</CODE> Attribute.
     * @param os where to write the transformation can be null.
     * @return the element to digest
     *
     * @throws XMLSignatureException
     * @see Manifest#verifyReferences()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public ReferenceData getReferenceData() {

    /**
     * Get the ReferenceData that corresponds to the cached representation of the dereferenced
     * object before transformation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public XMLSignatureInput getTransformsOutput() {

    /**
     * This method only works works after a call to verify.
     * @return the transformed output(i.e. what is going to be digested).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public String getHTMLRepresentation() throws XMLSignatureException {

    /**
     * Method getHTMLRepresentation
     * @return The HTML of the transformation
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public XMLSignatureInput getNodesetBeforeFirstCanonicalization()

    /**
     * This method returns the XMLSignatureInput which represents the node set before
     * some kind of canonicalization is applied for the first time.
     * @return Gets a the node doing everything till the first c14n is needed
     *
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public XMLSignatureInput getContentsAfterTransformation()

    /**
     * Returns the XMLSignatureInput which is the result of the Transforms.
     * @return a XMLSignatureInput with all transformations applied.
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public XMLSignatureInput getContentsBeforeTransformation()

    /**
     * Returns the XMLSignatureInput which is created by de-referencing the URI attribute.
     * @return the XMLSignatureInput of the source of this reference
     * @throws ReferenceNotInitializedException If the resolver found any
     * problem resolving the reference
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public void generateDigestValue()

    /**
     * Method generateDigestValue
     *
     * @throws ReferenceNotInitializedException
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    private void setDigestValueElement(byte[] digestValue) {

    /**
     * Method setDigestValueElement
     *
     * @param digestValue
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public boolean typeIsReferenceToManifest() {

    /**
     * Method isReferenceToManifest
     *
     * This returns true if the <CODE>Type</CODE> attribute of the
     * <CODE>Reference</CODE> element points to a <CODE>#Manifest</CODE> element
     *
     * @return true if the Reference type indicates that this Reference points to a
     * {@link Manifest}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public boolean typeIsReferenceToObject() {

    /**
     * Method isReferenceToObject
     *
     * This returns true if the <CODE>Type</CODE> attribute of the
     * <CODE>Reference</CODE> element points to a <CODE>#Object</CODE> element
     *
     * @return true if the Reference type indicates that this Reference points to an
     * <code>Object</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public String getType() {

    /**
     * Return the <code>type</code> atttibute of the Reference indicate whether an
     * <code>ds:Object</code>, <code>ds:SignatureProperty</code>, or <code>ds:Manifest</code>
     * element
     *
     * @return the <code>type</code> attribute of the Reference
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public void setType(String type) {

    /**
     * Sets the <code>type</code> atttibute of the Reference indicate whether an
     * <code>ds:Object</code>, <code>ds:SignatureProperty</code>, or <code>ds:Manifest</code>
     * element.
     *
     * @param type the <code>type</code> attribute of the Reference
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public String getId() {

    /**
     * Returns the <code>Id</code> attribute of this <code>Reference</code> element
     *
     * @return Id the <code>Id</code> attribute of this <code>Reference</code> element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public void setId(String id) {

    /**
     * Sets the <code>Id</code> attribute of this <code>Reference</code> element
     *
     * @param id the <code>Id</code> attribute of this <code>Reference</code> element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public String getURI() {

    /**
     * Returns the <code>URI</code> of this <code>Reference</code> element
     *
     * @return URI the <code>URI</code> of this <code>Reference</code> element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public void setURI(String uri) {

    /**
     * Sets the <code>URI</code> of this <code>Reference</code> element
     *
     * @param uri the <code>URI</code> of this <code>Reference</code> element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public MessageDigestAlgorithm getMessageDigestAlgorithm() throws XMLSignatureException {

    /**
     * Returns {@link MessageDigestAlgorithm}
     *
     *
     * @return {@link MessageDigestAlgorithm}
     *
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    protected Reference(Element element, String baseURI, Manifest manifest, boolean secureValidation)

    /**
     * Build a {@link Reference} from an {@link Element}
     *
     * @param element <code>Reference</code> element
     * @param baseURI the URI of the resource where the XML instance was stored
     * @param manifest is the {@link Manifest} of {@link SignedInfo} in which the Reference occurs.
     * @param secureValidation whether secure validation is enabled or not
     * We need this because the Manifest has the individual {@link ResourceResolver}s which have
     * been set by the user
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    protected Reference(Element element, String baseURI, Manifest manifest) throws XMLSecurityException {

    /**
     * Build a {@link Reference} from an {@link Element}
     *
     * @param element <code>Reference</code> element
     * @param baseURI the URI of the resource where the XML instance was stored
     * @param manifest is the {@link Manifest} of {@link SignedInfo} in which the Reference occurs.
     * We need this because the Manifest has the individual {@link ResourceResolver}s which have
     * been set by the user
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    protected Reference(
        Document doc, String baseURI, String referenceURI, Manifest manifest,
        Transforms transforms, String messageDigestAlgorithm
    ) throws XMLSignatureException {

    /**
     * Constructor Reference
     *
     * @param doc the {@link Document} in which <code>XMLsignature</code> is placed
     * @param baseURI the URI of the resource where the XML instance will be stored
     * @param referenceURI URI indicate where is data which will digested
     * @param manifest
     * @param transforms {@link Transforms} applied to data
     * @param messageDigestAlgorithm {@link MessageDigestAlgorithm Digest algorithm} which is
     * applied to the data
     * TODO should we throw XMLSignatureException if MessageDigestAlgoURI is wrong?
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    private static final java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    private static boolean useC14N11 = (
        AccessController.doPrivileged(new PrivilegedAction<Boolean>() {

    /**
     * Look up useC14N11 system property. If true, an explicit C14N11 transform
     * will be added if necessary when generating the signature. See section
     * 3.1.1 of http://www.w3.org/2007/xmlsec/Drafts/xmldsig-core/ for more info.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public static final int MAXIMUM_TRANSFORM_COUNT = 5;

    /**
     * The maximum number of transforms per reference, if secure validation is enabled.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public static final String MANIFEST_URI = Constants.SignatureSpecNS + Constants._TAG_MANIFEST;

    /** Field MANIFEST_URI */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
    public static final String OBJECT_URI = Constants.SignatureSpecNS + Constants._TAG_OBJECT;

    /** Field OBJECT_URI */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
public class Reference extends SignatureElementProxy {

/**
 * Handles <code>&lt;ds:Reference&gt;</code> elements.
 *
 * This includes:
 *
 * Constructs a <CODE>ds:Reference</CODE> from an {@link org.w3c.dom.Element}.
 *
 * <p>Create a new reference</p>
 * <pre>
 * Document doc;
 * MessageDigestAlgorithm sha1 = MessageDigestAlgorithm.getInstance("http://#sha1");
 * Reference ref = new Reference(new XMLSignatureInput(new FileInputStream("1.gif"),
 *                               "http://localhost/1.gif",
 *                               (Transforms) null, sha1);
 * Element refElem = ref.toElement(doc);
 * </pre>
 *
 * <p>Verify a reference</p>
 * <pre>
 * Element refElem = doc.getElement("Reference"); // PSEUDO
 * Reference ref = new Reference(refElem);
 * String url = ref.getURI();
 * ref.setData(new XMLSignatureInput(new FileInputStream(url)));
 * if (ref.verify()) {
 *    System.out.println("verified");
 * }
 * </pre>
 *
 * <pre>
 * &lt;element name="Reference" type="ds:ReferenceType"/&gt;
 *  &lt;complexType name="ReferenceType"&gt;
 *    &lt;sequence&gt;
 *      &lt;element ref="ds:Transforms" minOccurs="0"/&gt;
 *      &lt;element ref="ds:DigestMethod"/&gt;
 *      &lt;element ref="ds:DigestValue"/&gt;
 *    &lt;/sequence&gt;
 *    &lt;attribute name="Id" type="ID" use="optional"/&gt;
 *    &lt;attribute name="URI" type="anyURI" use="optional"/&gt;
 *    &lt;attribute name="Type" type="anyURI" use="optional"/&gt;
 *  &lt;/complexType&gt;
 * </pre>
 *
 * @author Christian Geuer-Pollmann
 * @see ObjectContainer
 * @see Manifest
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/Reference.java
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
c:/Users/saahil claypool/Documents/JDKSource//java/lang/ref/Reference.java
    public boolean enqueue() {

    /**
     * Adds this reference object to the queue with which it is registered,
     * if any.
     *
     * <p> This method is invoked only by Java code; when the garbage collector
     * enqueues references it does so directly, without invoking this method.
     *
     * @return   <code>true</code> if this reference object was successfully
     *           enqueued; <code>false</code> if it was already enqueued or if
     *           it was not registered with a queue when it was created
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/ref/Reference.java
    public boolean isEnqueued() {

    /**
     * Tells whether or not this reference object has been enqueued, either by
     * the program or by the garbage collector.  If this reference object was
     * not registered with a queue when it was created, then this method will
     * always return <code>false</code>.
     *
     * @return   <code>true</code> if and only if this reference object has
     *           been enqueued
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/ref/Reference.java
    public void clear() {

    /**
     * Clears this reference object.  Invoking this method will not cause this
     * object to be enqueued.
     *
     * <p> This method is invoked only by Java code; when the garbage collector
     * clears references it does so directly, without invoking this method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/ref/Reference.java
    public T get() {

    /**
     * Returns this reference object's referent.  If this reference object has
     * been cleared, either by the program or by the garbage collector, then
     * this method returns <code>null</code>.
     *
     * @return   The object to which this reference refers, or
     *           <code>null</code> if this reference object has been cleared
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/lang/ref/Reference.java
public abstract class Reference<T> {

/**
 * Abstract base class for reference objects.  This class defines the
 * operations common to all reference objects.  Because reference objects are
 * implemented in close cooperation with the garbage collector, this class may
 * not be subclassed directly.
 *
 * @author   Mark Reinhold
 * @since    1.2
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Reference.java
    private static final long serialVersionUID = -1673475790065791735L;

    /**
     * Use serialVersionUID from JNDI 1.1.1 for interoperability
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Reference.java
    public Object clone() {

    /**
     * Makes a copy of this reference using its class name
     * list of addresses, class factory name and class factory location.
     * Changes to the newly created copy does not affect this Reference
     * and vice versa.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Reference.java
    public String toString() {

    /**
      * Generates the string representation of this reference.
      * The string consists of the class name to which this reference refers,
      * and the string representation of each of its addresses.
      * This representation is intended for display only and not to be parsed.
      *
      * @return The non-null string representation of this reference.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Reference.java
    public int hashCode() {

    /**
      * Computes the hash code of this reference.
      * The hash code is the sum of the hash code of its addresses.
      *
      * @return A hash code of this reference as an int.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Reference.java
    public boolean equals(Object obj) {

    /**
      * Determines whether obj is a reference with the same addresses
      * (in same order) as this reference.
      * The addresses are checked using RefAddr.equals().
      * In addition to having the same addresses, the Reference also needs to
      * have the same class name as this reference.
      * The class factory and class factory location are not checked.
      * If obj is null or not an instance of Reference, null is returned.
      *
      * @param obj The possibly null object to check.
      * @return true if obj is equal to this reference; false otherwise.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Reference.java
    public void clear() {

    /**
      * Deletes all addresses from this reference.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Reference.java
    public Object remove(int posn) {

    /**
      * Deletes the address at index posn from the list of addresses.
      * All addresses at index greater than posn are shifted down
      * the list by one (towards index 0).
      *
      * @param posn The 0-based index of in address to delete.
      * @return The address removed.
      * @exception ArrayIndexOutOfBoundsException If posn not in the specified
      *         range.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Reference.java
    public void add(int posn, RefAddr addr) {

    /**
      * Adds an address to the list of addresses at index posn.
      * All addresses at index posn or greater are shifted up
      * the list by one (away from index 0).
      *
      * @param posn The 0-based index of the list to insert addr.
      * @param addr The non-null address to add.
      * @exception ArrayIndexOutOfBoundsException If posn not in the specified
      *         range.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Reference.java
    public void add(RefAddr addr) {

    /**
      * Adds an address to the end of the list of addresses.
      *
      * @param addr The non-null address to add.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Reference.java
    public int size() {

    /**
      * Retrieves the number of addresses in this reference.
      *
      * @return The nonnegative number of addresses in this reference.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Reference.java
    public Enumeration<RefAddr> getAll() {

    /**
      * Retrieves an enumeration of the addresses in this reference.
      * When addresses are added, changed or removed from this reference,
      * its effects on this enumeration are undefined.
      *
      * @return An non-null enumeration of the addresses
      *         (<tt>RefAddr</tt>) in this reference.
      *         If this reference has zero addresses, an enumeration with
      *         zero elements is returned.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Reference.java
    public RefAddr get(int posn) {

    /**
      * Retrieves the address at index posn.
      * @param posn The index of the address to retrieve.
      * @return The address at the 0-based index posn. It must be in the
      *         range [0,getAddressCount()).
      * @exception ArrayIndexOutOfBoundsException If posn not in the specified
      *         range.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Reference.java
    public RefAddr get(String addrType) {

    /**
      * Retrieves the first address that has the address type 'addrType'.
      * String.compareTo() is used to test the equality of the address types.
      *
      * @param addrType The non-null address type for which to find the address.
      * @return The address in this reference with address type 'addrType;
      *         null if no such address exist.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Reference.java
    public String getFactoryClassLocation() {

    /**
      * Retrieves the location of the factory of the object
      * to which this reference refers.
      * If it is a codebase, then it is an ordered list of URLs,
      * separated by spaces, listing locations from where the factory
      * class definition should be loaded.
      *
      * @return The possibly null string containing the
      *                 location for loading in the factory's class.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Reference.java
    public String getFactoryClassName() {

    /**
      * Retrieves the class name of the factory of the object
      * to which this reference refers.
      *
      * @return The possibly null fully-qualified class name of the factory.
      *         (e.g. "java.lang.String")
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Reference.java
    public String getClassName() {

    /**
      * Retrieves the class name of the object to which this reference refers.
      *
      * @return The non-null fully-qualified class name of the object.
      *         (e.g. "java.lang.String")
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Reference.java
    public Reference(String className, RefAddr addr,
                     String factory, String factoryLocation) {

    /**
      * Constructs a new reference for an object with class name 'className',
      * the class name and location of the object's factory, and the address for
      * the object.
      *
      * @param className The non-null class name of the object to
      *         which this reference refers.
      * @param factory  The possibly null class name of the object's factory.
      * @param factoryLocation  The possibly null location from which
      *                         to load the factory (e.g. URL)
      * @param addr     The non-null address of the object.
      * @see javax.naming.spi.ObjectFactory
      * @see javax.naming.spi.NamingManager#getObjectInstance
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Reference.java
    public Reference(String className, String factory, String factoryLocation) {

    /**
      * Constructs a new reference for an object with class name 'className',
      * and the class name and location of the object's factory.
      *
      * @param className The non-null class name of the object to which
      *                         this reference refers.
      * @param factory  The possibly null class name of the object's factory.
      * @param factoryLocation
      *         The possibly null location from which to load
      *         the factory (e.g. URL)
      * @see javax.naming.spi.ObjectFactory
      * @see javax.naming.spi.NamingManager#getObjectInstance
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Reference.java
    public Reference(String className, RefAddr addr) {

    /**
      * Constructs a new reference for an object with class name 'className' and
      * an address.
      * Class factory and class factory location are set to null.
      *
      * @param className The non-null class name of the object to
      * which this reference refers.
      * @param addr The non-null address of the object.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Reference.java
    public Reference(String className) {

    /**
      * Constructs a new reference for an object with class name 'className'.
      * Class factory and class factory location are set to null.
      * The newly created reference contains zero addresses.
      *
      * @param className The non-null class name of the object to which
      * this reference refers.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Reference.java
    protected String classFactoryLocation = null;

    /**
     * Contains the location of the factory class.
     * Initialized to null.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Reference.java
    protected String classFactory = null;

    /**
     * Contains the name of the factory class for creating
     * an instance of the object to which this Reference refers.
     * Initialized to null.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Reference.java
    protected String className;

    /**
     * Contains the fully-qualified name of the class of the object to which
     * this Reference refers.
     * @serial
     * @see java.lang.Class#getName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/Reference.java
  /*<p>

/**
  * This class represents a reference to an object that is found outside of
  * the naming/directory system.
  *<p>
  * Reference provides a way of recording address information about
  * objects which themselves are not directly bound to the naming/directory system.
  *<p>
  * A Reference consists of an ordered list of addresses and class information
  * about the object being referenced.
  * Each address in the list identifies a communications endpoint
  * for the same conceptual object.  The "communications endpoint"
  * is information that indicates how to contact the object. It could
  * be, for example, a network address, a location in memory on the
  * local machine, another process on the same machine, etc.
  * The order of the addresses in the list may be of significance
  * to object factories that interpret the reference.
  *<p>
  * Multiple addresses may arise for
  * various reasons, such as replication or the object offering interfaces
  * over more than one communication mechanism.  The addresses are indexed
  * starting with zero.
  *<p>
  * A Reference also contains information to assist in creating an instance
  * of the object to which this Reference refers.  It contains the class name
  * of that object, and the class name and location of the factory to be used
  * to create the object.
  * The class factory location is a space-separated list of URLs representing
  * the class path used to load the factory.  When the factory class (or
  * any class or resource upon which it depends) needs to be loaded,
  * each URL is used (in order) to attempt to load the class.
  *<p>
  * A Reference instance is not synchronized against concurrent access by multiple
  * threads. Threads that need to access a single Reference concurrently should
  * synchronize amongst themselves and provide the necessary locking.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  *
  * @see RefAddr
  * @see StringRefAddr
  * @see BinaryRefAddr
  * @since 1.3
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/Reference.java
    InputStream getDigestInputStream();

    /**
     * Returns the pre-digested input stream, if
     * <a href="XMLSignContext.html#Supported Properties">reference caching</a>
     * is enabled. This is the input to the digest operation during a
     * validation or signing operation.
     *
     * @return an input stream containing the pre-digested input, or
     *    <code>null</code> if reference caching is not enabled or this
     *    reference has not been generated or validated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/Reference.java
    Data getDereferencedData();

    /**
     * Returns the dereferenced data, if
     * <a href="XMLSignContext.html#Supported Properties">reference caching</a>
     * is enabled. This is the result of dereferencing the URI of this
     * reference during a validation or generation operation.
     *
     * @return the dereferenced data, or <code>null</code> if reference
     *    caching is not enabled or this reference has not been generated or
     *    validated
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/Reference.java
    boolean validate(XMLValidateContext validateContext)

    /**
     * Validates this reference. This method verifies the digest of this
     * reference.
     *
     * <p>This method only validates the reference the first time it is
     * invoked. On subsequent invocations, it returns a cached result.
     *
     * @return <code>true</code> if this reference was validated successfully;
     *    <code>false</code> otherwise
     * @param validateContext the validating context
     * @throws NullPointerException if <code>validateContext</code> is
     *    <code>null</code>
     * @throws XMLSignatureException if an unexpected exception occurs while
     *    validating the reference
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/Reference.java
    byte[] getCalculatedDigestValue();

    /**
     * Returns the calculated digest value of this <code>Reference</code>
     * after a validation operation. This method is useful for debugging if
     * the reference fails to validate.
     *
     * @return the calculated digest value, or <code>null</code> if this
     *    reference has not been validated yet. Each invocation of this method
     *    returns a new clone to protect against subsequent modification.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/Reference.java
    byte[] getDigestValue();

    /**
     * Returns the digest value of this <code>Reference</code>.
     *
     * @return the raw digest value, or <code>null</code> if this reference has
     *    not been digested yet. Each invocation of this method returns a new
     *    clone to protect against subsequent modification.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/Reference.java
    String getId();

    /**
     * Returns the optional <code>Id</code> attribute of this
     * <code>Reference</code>, which permits this reference to be
     * referenced from elsewhere.
     *
     * @return the <code>Id</code> attribute (may be <code>null</code> if not
     *    specified)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/Reference.java
    DigestMethod getDigestMethod();

    /**
     * Returns the digest method of this <code>Reference</code>.
     *
     * @return the digest method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/Reference.java
    @SuppressWarnings("rawtypes")

    /**
     * Returns an {@link java.util.Collections#unmodifiableList unmodifiable
     * list} of {@link Transform}s that are contained in this
     * <code>Reference</code>.
     *
     * @return an unmodifiable list of <code>Transform</code>s
     *    (may be empty but never <code>null</code>)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/Reference.java
public interface Reference extends URIReference, XMLStructure {

/**
 * A representation of the <code>Reference</code> element as defined in the
 * <a href="http://www.w3.org/TR/xmldsig-core/">
 * W3C Recommendation for XML-Signature Syntax and Processing</a>.
 * The XML schema is defined as:
 * <code><pre>
 * &lt;element name="Reference" type="ds:ReferenceType"/&gt;
 * &lt;complexType name="ReferenceType"&gt;
 *   &lt;sequence&gt;
 *     &lt;element ref="ds:Transforms" minOccurs="0"/&gt;
 *     &lt;element ref="ds:DigestMethod"/&gt;
 *     &lt;element ref="ds:DigestValue"/&gt;
 *   &lt;/sequence&gt;
 *   &lt;attribute name="Id" type="ID" use="optional"/&gt;
 *   &lt;attribute name="URI" type="anyURI" use="optional"/&gt;
 *   &lt;attribute name="Type" type="anyURI" use="optional"/&gt;
 * &lt;/complexType&gt;
 *
 * &lt;element name="DigestValue" type="ds:DigestValueType"/&gt;
 * &lt;simpleType name="DigestValueType"&gt;
 *   &lt;restriction base="base64Binary"/&gt;
 * &lt;/simpleType&gt;
 * </pre></code>
 *
 * <p>A <code>Reference</code> instance may be created by invoking one of the
 * {@link XMLSignatureFactory#newReference newReference} methods of the
 * {@link XMLSignatureFactory} class; for example:
 *
 * <pre>
 *   XMLSignatureFactory factory = XMLSignatureFactory.getInstance("DOM");
 *   Reference ref = factory.newReference
 *     ("http://www.ietf.org/rfc/rfc3275.txt",
 *      factory.newDigestMethod(DigestMethod.SHA1, null));
 * </pre>
 *
 * @author Sean Mullan
 * @author Erwin van der Koogh
 * @author JSR 105 Expert Group
 * @since 1.6
 * @see XMLSignatureFactory#newReference(String, DigestMethod)
 * @see XMLSignatureFactory#newReference(String, DigestMethod, List, String, String)
 */
