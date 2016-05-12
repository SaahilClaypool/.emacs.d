_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignatureProperty.java
    public String getBaseLocalName() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignatureProperty.java
    public Node appendChild(Node node) {

    /**
     * Method appendChild
     *
     * @param node
     * @return the node in this element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignatureProperty.java
    public String getTarget() {

    /**
     * Returns the <code>target</code> attribute
     *
     * @return the <code>target</code> attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignatureProperty.java
    public void setTarget(String target) {

    /**
     * Sets the <code>target</code> attribute
     *
     * @param target the <code>target</code> attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignatureProperty.java
    public String getId() {

    /**
     * Returns the <code>id</code> attribute
     *
     * @return the <code>id</code> attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignatureProperty.java
    public void setId(String id) {

    /**
     *   Sets the <code>id</code> attribute
     *
     *   @param id the <code>id</code> attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignatureProperty.java
    public SignatureProperty(Element element, String BaseURI) throws XMLSecurityException {

    /**
     * Constructs a {@link SignatureProperty} from an {@link Element}
     * @param element <code>SignatureProperty</code> element
     * @param BaseURI the URI of the resource where the XML instance was stored
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignatureProperty.java
    public SignatureProperty(Document doc, String target, String id) {

    /**
     * Constructs {@link SignatureProperty} using sepcified <code>target</code> attribute and
     * <code>id</code> attribute
     *
     * @param doc the {@link Document} in which <code>XMLsignature</code> is placed
     * @param target the <code>target</code> attribute references the <code>Signature</code>
     *  element to which the property applies
     * @param id the <code>id</code> will be specified by {@link Reference#getURI} in validation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignatureProperty.java
    public SignatureProperty(Document doc, String target) {

    /**
     * Constructs{@link SignatureProperty} using specified <code>target</code> attribute
     *
     * @param doc the {@link Document} in which <code>XMLsignature</code> is placed
     * @param target the <code>target</code> attribute references the <code>Signature</code>
     * element to which the property applies SignatureProperty
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignatureProperty.java
public class SignatureProperty extends SignatureElementProxy {

/**
 * Handles <code>&lt;ds:SignatureProperty&gt;</code> elements
 * Additional information item concerning the generation of the signature(s) can
 * be placed in this Element
 *
 * @author Christian Geuer-Pollmann
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignatureProperty.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignatureProperty.java
    public String getBaseLocalName() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignatureProperty.java
    public Node appendChild(Node node) {

    /**
     * Method appendChild
     *
     * @param node
     * @return the node in this element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignatureProperty.java
    public String getTarget() {

    /**
     * Returns the <code>target</code> attribute
     *
     * @return the <code>target</code> attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignatureProperty.java
    public void setTarget(String target) {

    /**
     * Sets the <code>target</code> attribute
     *
     * @param target the <code>target</code> attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignatureProperty.java
    public String getId() {

    /**
     * Returns the <code>id</code> attribute
     *
     * @return the <code>id</code> attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignatureProperty.java
    public void setId(String id) {

    /**
     *   Sets the <code>id</code> attribute
     *
     *   @param id the <code>id</code> attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignatureProperty.java
    public SignatureProperty(Element element, String BaseURI) throws XMLSecurityException {

    /**
     * Constructs a {@link SignatureProperty} from an {@link Element}
     * @param element <code>SignatureProperty</code> element
     * @param BaseURI the URI of the resource where the XML instance was stored
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignatureProperty.java
    public SignatureProperty(Document doc, String target, String id) {

    /**
     * Constructs {@link SignatureProperty} using sepcified <code>target</code> attribute and
     * <code>id</code> attribute
     *
     * @param doc the {@link Document} in which <code>XMLsignature</code> is placed
     * @param target the <code>target</code> attribute references the <code>Signature</code>
     *  element to which the property applies
     * @param id the <code>id</code> will be specified by {@link Reference#getURI} in validation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignatureProperty.java
    public SignatureProperty(Document doc, String target) {

    /**
     * Constructs{@link SignatureProperty} using specified <code>target</code> attribute
     *
     * @param doc the {@link Document} in which <code>XMLsignature</code> is placed
     * @param target the <code>target</code> attribute references the <code>Signature</code>
     * element to which the property applies SignatureProperty
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignatureProperty.java
public class SignatureProperty extends SignatureElementProxy {

/**
 * Handles <code>&lt;ds:SignatureProperty&gt;</code> elements
 * Additional information item concerning the generation of the signature(s) can
 * be placed in this Element
 *
 * @author Christian Geuer-Pollmann
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/SignatureProperty.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/SignatureProperty.java
    @SuppressWarnings("rawtypes")

    /**
     * Returns an {@link java.util.Collections#unmodifiableList unmodifiable
     * list} of one or more {@link XMLStructure}s that are contained in
     * this <code>SignatureProperty</code>. These represent additional
     * information items concerning the generation of the {@link XMLSignature}
     * (i.e. date/time stamp or serial numbers of cryptographic hardware used
     * in signature generation).
     *
     * @return an unmodifiable list of one or more <code>XMLStructure</code>s
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/SignatureProperty.java
    String getId();

    /**
     * Returns the Id of this <code>SignatureProperty</code>.
     *
     * @return the Id of this <code>SignatureProperty</code> (or
     *    <code>null</code> if not specified)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/SignatureProperty.java
    String getTarget();

    /**
     * Returns the target URI of this <code>SignatureProperty</code>.
     *
     * @return the target URI of this <code>SignatureProperty</code> (never
     *    <code>null</code>)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/SignatureProperty.java
public interface SignatureProperty extends XMLStructure {

/**
 * A representation of the XML <code>SignatureProperty</code> element as
 * defined in the <a href="http://www.w3.org/TR/xmldsig-core/">
 * W3C Recommendation for XML-Signature Syntax and Processing</a>.
 * The XML Schema Definition is defined as:
 * <pre><code>
 *&lt;element name="SignatureProperty" type="ds:SignaturePropertyType"/&gt;
 *   &lt;complexType name="SignaturePropertyType" mixed="true"&gt;
 *     &lt;choice maxOccurs="unbounded"&gt;
 *       &lt;any namespace="##other" processContents="lax"/&gt;
 *       &lt;!-- (1,1) elements from (1, unbounded) namespaces --&gt;
 *     &lt;/choice&gt;
 *     &lt;attribute name="Target" type="anyURI" use="required"/&gt;
 *     &lt;attribute name="Id" type="ID" use="optional"/&gt;
 *   &lt;/complexType&gt;
 * </code></pre>
 *
 * A <code>SignatureProperty</code> instance may be created by invoking the
 * {@link XMLSignatureFactory#newSignatureProperty newSignatureProperty}
 * method of the {@link XMLSignatureFactory} class; for example:
 *
 * <pre>
 *   XMLSignatureFactory factory = XMLSignatureFactory.getInstance("DOM");
 *   SignatureProperty property = factory.newSignatureProperty
 *      (Collections.singletonList(content), "#Signature-1", "TimeStamp");
 * </pre>
 *
 * @author Sean Mullan
 * @author JSR 105 Expert Group
 * @since 1.6
 * @see XMLSignatureFactory#newSignatureProperty(List, String, String)
 * @see SignatureProperties
 */
