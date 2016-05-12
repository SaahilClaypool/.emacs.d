_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public static String getDefaultPrefix(String namespace) {

    /**
     * Method getDefaultPrefix
     *
     * @param namespace
     * @return the default prefix bind to this element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public static void registerDefaultPrefixes() throws XMLSecurityException {

    /**
     * This method registers the default prefixes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public static void setDefaultPrefix(String namespace, String prefix)

    /**
     * Method setDefaultPrefix
     *
     * @param namespace
     * @param prefix
     * @throws XMLSecurityException
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to set the default prefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public void setXPathNamespaceContext(String prefix, String uri)

    /**
     * Adds an xmlns: definition to the Element. This can be called as follows:
     *
     * <PRE>
     * // set namespace with ds prefix
     * xpathContainer.setXPathNamespaceContext("ds", "http://www.w3.org/2000/09/xmldsig#");
     * xpathContainer.setXPathNamespaceContext("xmlns:ds", "http://www.w3.org/2000/09/xmldsig#");
     * </PRE>
     *
     * @param prefix
     * @param uri
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public int length(String namespace, String localname) {

    /**
     * Method length
     *
     * @param namespace
     * @param localname
     * @return the number of elements {namespace}:localname under this element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public String getTextFromTextChild() {

    /**
     * Method getTextFromTextChild
     *
     * @return the Text obtained by concatenating all the text nodes of this
     *    element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public byte[] getBytesFromTextChild() throws XMLSecurityException {

    /**
     * Method getBytesFromTextChild
     *
     * @return The base64 bytes from the text children of this element
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public String getTextFromChildElement(String localname, String namespace) {

    /**
     * Method getTextFromChildElement
     *
     * @param localname
     * @param namespace
     * @return the Text of the textNode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    @Deprecated

    /**
     * Method getBytesFromChildElement
     * @deprecated
     * @param localname
     * @param namespace
     * @return the bytes
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public BigInteger getBigIntegerFromChildElement(
        String localname, String namespace
    ) throws Base64DecodingException {

    /**
     * Method getVal
     *
     * @param localname
     * @param namespace
     * @return The biginteger contained in the given element
     * @throws Base64DecodingException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public void addText(String text) {

    /**
     * Method addText
     *
     * @param text
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public void addBase64Text(byte[] bytes) {

    /**
     * Method addBase64Text
     *
     * @param bytes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public void addTextElement(String text, String localname) {

    /**
     * Method addTextElement
     *
     * @param text
     * @param localname
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public void addBase64Element(byte[] bytes, String localname) {

    /**
     * Method addBase64Element
     *
     * @param bytes
     * @param localname
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public void addBigIntegerElement(BigInteger bi, String localname) {

    /**
     * Method addBigIntegerElement
     *
     * @param bi
     * @param localname
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    void guaranteeThatElementInCorrectSpace() throws XMLSecurityException {

    /**
     * Method guaranteeThatElementInCorrectSpace
     *
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public String getBaseURI() {

    /**
     * Method getBaseURI
     *
     * @return the base uri of the namespace of this element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public Document getDocument() {

    /**
     * Method getDocument
     *
     * @return the Document where this element is contained.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public final NodeList getElementPlusReturns() {

    /**
     * Returns the Element plus a leading and a trailing CarriageReturn Text node.
     *
     * @return the Element which was constructed by the Object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public final Element getElement() {

    /**
     * Returns the Element which was constructed by the Object.
     *
     * @return the Element which was constructed by the Object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public void setElement(Element element, String BaseURI) throws XMLSecurityException {

    /**
     * Method setElement
     *
     * @param element
     * @param BaseURI
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public static Element createElementForFamily(Document doc, String namespace, String localName) {

    /**
     * This method creates an Element in a given namespace with a given localname.
     * It uses the {@link ElementProxy#getDefaultPrefix} method to decide whether
     * a particular prefix is bound to that namespace.
     * <BR />
     * This method was refactored out of the constructor.
     *
     * @param doc
     * @param namespace
     * @param localName
     * @return The element created.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public abstract String getBaseLocalName();

    /**
     * Returns the localname of the Elements of the sub-class.
     *
     * @return the localname of the Elements of the sub-class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public abstract String getBaseNamespace();

    /**
     * Returns the namespace of the Elements of the sub-class.
     *
     * @return the namespace of the Elements of the sub-class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public ElementProxy(Element element, String BaseURI) throws XMLSecurityException {

    /**
     * Constructor ElementProxy
     *
     * @param element
     * @param BaseURI
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public ElementProxy(Document doc) {

    /**
     * Constructor ElementProxy
     *
     * @param doc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public ElementProxy() {

    /**
     * Constructor ElementProxy
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    private static Map<String, String> prefixMappings = new ConcurrentHashMap<String, String>();

    /** Field prefixMappings */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    protected Document doc = null;

    /** Field doc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    protected String baseURI = null;

    /** Field baseURI */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    protected Element constructionElement = null;

    /** Field constructionElement */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
public abstract class ElementProxy {

/**
 * This is the base class to all Objects which have a direct 1:1 mapping to an
 * Element in a particular namespace.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
package com.sun.org.apache.xml.internal.security.utils;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public static String getDefaultPrefix(String namespace) {

    /**
     * Method getDefaultPrefix
     *
     * @param namespace
     * @return the default prefix bind to this element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public static void registerDefaultPrefixes() throws XMLSecurityException {

    /**
     * This method registers the default prefixes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public static void setDefaultPrefix(String namespace, String prefix)

    /**
     * Method setDefaultPrefix
     *
     * @param namespace
     * @param prefix
     * @throws XMLSecurityException
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to set the default prefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public void setXPathNamespaceContext(String prefix, String uri)

    /**
     * Adds an xmlns: definition to the Element. This can be called as follows:
     *
     * <PRE>
     * // set namespace with ds prefix
     * xpathContainer.setXPathNamespaceContext("ds", "http://www.w3.org/2000/09/xmldsig#");
     * xpathContainer.setXPathNamespaceContext("xmlns:ds", "http://www.w3.org/2000/09/xmldsig#");
     * </PRE>
     *
     * @param prefix
     * @param uri
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public int length(String namespace, String localname) {

    /**
     * Method length
     *
     * @param namespace
     * @param localname
     * @return the number of elements {namespace}:localname under this element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public String getTextFromTextChild() {

    /**
     * Method getTextFromTextChild
     *
     * @return the Text obtained by concatenating all the text nodes of this
     *    element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public byte[] getBytesFromTextChild() throws XMLSecurityException {

    /**
     * Method getBytesFromTextChild
     *
     * @return The base64 bytes from the text children of this element
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public String getTextFromChildElement(String localname, String namespace) {

    /**
     * Method getTextFromChildElement
     *
     * @param localname
     * @param namespace
     * @return the Text of the textNode
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    @Deprecated

    /**
     * Method getBytesFromChildElement
     * @deprecated
     * @param localname
     * @param namespace
     * @return the bytes
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public BigInteger getBigIntegerFromChildElement(
        String localname, String namespace
    ) throws Base64DecodingException {

    /**
     * Method getVal
     *
     * @param localname
     * @param namespace
     * @return The biginteger contained in the given element
     * @throws Base64DecodingException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public void addText(String text) {

    /**
     * Method addText
     *
     * @param text
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public void addBase64Text(byte[] bytes) {

    /**
     * Method addBase64Text
     *
     * @param bytes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public void addTextElement(String text, String localname) {

    /**
     * Method addTextElement
     *
     * @param text
     * @param localname
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public void addBase64Element(byte[] bytes, String localname) {

    /**
     * Method addBase64Element
     *
     * @param bytes
     * @param localname
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public void addBigIntegerElement(BigInteger bi, String localname) {

    /**
     * Method addBigIntegerElement
     *
     * @param bi
     * @param localname
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    void guaranteeThatElementInCorrectSpace() throws XMLSecurityException {

    /**
     * Method guaranteeThatElementInCorrectSpace
     *
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public String getBaseURI() {

    /**
     * Method getBaseURI
     *
     * @return the base uri of the namespace of this element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public Document getDocument() {

    /**
     * Method getDocument
     *
     * @return the Document where this element is contained.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public final NodeList getElementPlusReturns() {

    /**
     * Returns the Element plus a leading and a trailing CarriageReturn Text node.
     *
     * @return the Element which was constructed by the Object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public final Element getElement() {

    /**
     * Returns the Element which was constructed by the Object.
     *
     * @return the Element which was constructed by the Object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public void setElement(Element element, String BaseURI) throws XMLSecurityException {

    /**
     * Method setElement
     *
     * @param element
     * @param BaseURI
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public static Element createElementForFamily(Document doc, String namespace, String localName) {

    /**
     * This method creates an Element in a given namespace with a given localname.
     * It uses the {@link ElementProxy#getDefaultPrefix} method to decide whether
     * a particular prefix is bound to that namespace.
     * <BR />
     * This method was refactored out of the constructor.
     *
     * @param doc
     * @param namespace
     * @param localName
     * @return The element created.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public abstract String getBaseLocalName();

    /**
     * Returns the localname of the Elements of the sub-class.
     *
     * @return the localname of the Elements of the sub-class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public abstract String getBaseNamespace();

    /**
     * Returns the namespace of the Elements of the sub-class.
     *
     * @return the namespace of the Elements of the sub-class.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public ElementProxy(Element element, String BaseURI) throws XMLSecurityException {

    /**
     * Constructor ElementProxy
     *
     * @param element
     * @param BaseURI
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public ElementProxy(Document doc) {

    /**
     * Constructor ElementProxy
     *
     * @param doc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    public ElementProxy() {

    /**
     * Constructor ElementProxy
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    private static Map<String, String> prefixMappings = new ConcurrentHashMap<String, String>();

    /** Field prefixMappings */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    protected Document doc = null;

    /** Field doc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    protected String baseURI = null;

    /** Field baseURI */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
    protected Element constructionElement = null;

    /** Field constructionElement */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
public abstract class ElementProxy {

/**
 * This is the base class to all Objects which have a direct 1:1 mapping to an
 * Element in a particular namespace.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/ElementProxy.java
package com.sun.org.apache.xml.internal.security.utils;

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
