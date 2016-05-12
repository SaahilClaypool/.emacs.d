_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static boolean protectAgainstWrappingAttack(
        Node startNode, Element knownElement, String value
    ) {

    /**
     * This method is a tree-search to help prevent against wrapping attacks. It checks that no other
     * Element than the given "knownElement" argument has an ID attribute that matches the "value"
     * argument, which is the ID value of "knownElement". If this is the case then "false" is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static boolean protectAgainstWrappingAttack(Node startNode, String value) {

    /**
     * This method is a tree-search to help prevent against wrapping attacks. It checks that no
     * two Elements have ID Attributes that match the "value" argument, if this is the case then
     * "false" is returned. Note that a return value of "true" does not necessarily mean that
     * a matching Element has been found, just that no wrapping attack has been detected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static String getAttributeValue(Element elem, String name) {

    /**
     * Returns the attribute value for the attribute with the specified name.
     * Returns null if there is no such attribute, or
     * the empty string if the attribute value is empty.
     *
     * <p>This works around a limitation of the DOM
     * <code>Element.getAttributeNode</code> method, which does not distinguish
     * between an unspecified attribute and an attribute with a value of
     * "" (it returns "" for both cases).
     *
     * @param elem the element containing the attribute
     * @param name the name of the attribute
     * @return the attribute value (may be null if unspecified)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static boolean isDescendantOrSelf(Node ctx, Node descendantOrSelf) {

    /**
     * Returns true if the descendantOrSelf is on the descendant-or-self axis
     * of the context node.
     *
     * @param ctx
     * @param descendantOrSelf
     * @return true if the node is descendant
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static String getStrFromNode(Node xpathnode) {

    /**
     * Method getStrFromNode
     *
     * @param xpathnode
     * @return the string for the node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Set<Node> excludeNodeFromSet(Node signatureElement, Set<Node> inputSet) {

    /**
     * @param signatureElement
     * @param inputSet
     * @return nodes with the constrain
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Element[] selectNodes(Node sibling, String uri, String nodeName) {

    /**
     * @param sibling
     * @param uri
     * @param nodeName
     * @return nodes with the constraint
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Element[] selectDs11Nodes(Node sibling, String nodeName) {

    /**
     * @param sibling
     * @param nodeName
     * @return nodes with the constrain
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Element[] selectDsNodes(Node sibling, String nodeName) {

    /**
     * @param sibling
     * @param nodeName
     * @return nodes with the constrain
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Element selectNode(Node sibling, String uri, String nodeName, int number) {

    /**
     * @param sibling
     * @param uri
     * @param nodeName
     * @param number
     * @return nodes with the constrain
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Text selectNodeText(Node sibling, String uri, String nodeName, int number) {

    /**
     * @param sibling
     * @param uri
     * @param nodeName
     * @param number
     * @return nodes with the constrain
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Text selectDs11NodeText(Node sibling, String nodeName, int number) {

    /**
     * @param sibling
     * @param nodeName
     * @param number
     * @return nodes with the constrain
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Text selectDsNodeText(Node sibling, String nodeName, int number) {

    /**
     * @param sibling
     * @param nodeName
     * @param number
     * @return nodes with the constrain
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Element selectXencNode(Node sibling, String nodeName, int number) {

    /**
     * @param sibling
     * @param nodeName
     * @param number
     * @return nodes with the constrain
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Element selectDs11Node(Node sibling, String nodeName, int number) {

    /**
     * @param sibling
     * @param nodeName
     * @param number
     * @return nodes with the constraint
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Element selectDsNode(Node sibling, String nodeName, int number) {

    /**
     * @param sibling
     * @param nodeName
     * @param number
     * @return nodes with the constraint
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    @SuppressWarnings("fallthrough")

    /**
     * This is the work horse for {@link #circumventBug2650}.
     *
     * @param node
     * @see <A HREF="http://nagoya.apache.org/bugzilla/show_bug.cgi?id=2650">
     * Namespace axis resolution is not XPath compliant </A>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static void circumventBug2650(Document doc) {

    /**
     * This method spreads all namespace attributes in a DOM document to their
     * children. This is needed because the XML Signature XPath transform
     * must evaluate the XPath against all nodes in the input, even against
     * XPath namespace nodes. Through a bug in XalanJ2, the namespace nodes are
     * not fully visible in the Xalan XPath model, so we have to do this by
     * hand in DOM spaces so that the nodes become visible in XPath space.
     *
     * @param doc
     * @see <A HREF="http://nagoya.apache.org/bugzilla/show_bug.cgi?id=2650">
     * Namespace axis resolution is not XPath compliant </A>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Set<Node> convertNodelistToSet(NodeList xpathNodeSet) {

    /**
     * Method convertNodelistToSet
     *
     * @param xpathNodeSet
     * @return the set with the nodelist
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static void addReturnToElement(Element e) {

    /**
     * Method addReturnToElement
     *
     * @param e
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Element createDSctx(Document doc, String prefix, String namespace) {

    /**
     * Method createDSctx
     *
     * @param doc
     * @param prefix
     * @param namespace
     * @return the element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Document getOwnerDocument(Set<Node> xpathNodeSet) {

    /**
     * This method returns the first non-null owner document of the Nodes in this Set.
     * This method is necessary because it <I>always</I> returns a
     * {@link Document}. {@link Node#getOwnerDocument} returns <CODE>null</CODE>
     * if the {@link Node} is a {@link Document}.
     *
     * @param xpathNodeSet
     * @return the owner document
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Document getOwnerDocument(Node node) {

    /**
     * This method returns the owner document of a particular node.
     * This method is necessary because it <I>always</I> returns a
     * {@link Document}. {@link Node#getOwnerDocument} returns <CODE>null</CODE>
     * if the {@link Node} is a {@link Document}.
     *
     * @param node
     * @return the owner document of the node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static boolean elementIsInEncryption11Space(Element element, String localName) {

    /**
     * Returns true if the element is in XML Encryption 1.1 namespace and the local
     * name equals the supplied one.
     *
     * @param element
     * @param localName
     * @return true if the element is in XML Encryption 1.1 namespace and the local name
     * equals the supplied one
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static boolean elementIsInEncryptionSpace(Element element, String localName) {

    /**
     * Returns true if the element is in XML Encryption namespace and the local
     * name equals the supplied one.
     *
     * @param element
     * @param localName
     * @return true if the element is in XML Encryption namespace and the local name
     * equals the supplied one
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static boolean elementIsInSignature11Space(Element element, String localName) {

    /**
     * Returns true if the element is in XML Signature 1.1 namespace and the local
     * name equals the supplied one.
     *
     * @param element
     * @param localName
     * @return true if the element is in XML Signature namespace and the local name equals
     * the supplied one
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static boolean elementIsInSignatureSpace(Element element, String localName) {

    /**
     * Returns true if the element is in XML Signature namespace and the local
     * name equals the supplied one.
     *
     * @param element
     * @param localName
     * @return true if the element is in XML Signature namespace and the local name equals
     * the supplied one
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Element createElementInEncryption11Space(Document doc, String elementName) {

    /**
     * Creates an Element in the XML Encryption 1.1 specification namespace.
     *
     * @param doc the factory Document
     * @param elementName the local name of the Element
     * @return the Element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Element createElementInEncryptionSpace(Document doc, String elementName) {

    /**
     * Creates an Element in the XML Encryption specification namespace.
     *
     * @param doc the factory Document
     * @param elementName the local name of the Element
     * @return the Element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Element createElementInSignature11Space(Document doc, String elementName) {

    /**
     * Creates an Element in the XML Signature 1.1 specification namespace.
     *
     * @param doc the factory Document
     * @param elementName the local name of the Element
     * @return the Element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Element createElementInSignatureSpace(Document doc, String elementName) {

    /**
     * Creates an Element in the XML Signature specification namespace.
     *
     * @param doc the factory Document
     * @param elementName the local name of the Element
     * @return the Element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static String getFullTextChildrenFromElement(Element element) {

    /**
     * Method getFullTextChildrenFromElement
     *
     * @param element
     * @return the string of children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static void outputDOMc14nWithComments(Node contextNode, OutputStream os) {

    /**
     * Serializes the <CODE>contextNode</CODE> into the OutputStream, <I>but
     * suppresses all Exceptions</I>.
     * <BR />
     * NOTE: <I>This should only be used for debugging purposes,
     * NOT in a production environment; this method ignores all exceptions,
     * so you won't notice if something goes wrong. If you're asking what is to
     * be used in a production environment, simply use the code inside the
     * <code>try{}</code> statement, but handle the Exceptions appropriately.</I>
     *
     * @param contextNode
     * @param os
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static void outputDOM(Node contextNode, OutputStream os, boolean addPreamble) {

    /**
     * Outputs a DOM tree to an {@link OutputStream}. <I>If an Exception is
     * thrown during execution, it's StackTrace is output to System.out, but the
     * Exception is not re-thrown.</I>
     *
     * @param contextNode root node of the DOM tree
     * @param os the {@link OutputStream}
     * @param addPreamble
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static void outputDOM(Node contextNode, OutputStream os) {

    /**
     * Outputs a DOM tree to an {@link OutputStream}.
     *
     * @param contextNode root node of the DOM tree
     * @param os the {@link OutputStream}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static void getSet(Node rootNode, Set<Node> result, Node exclude, boolean com) {

    /**
     * @param rootNode
     * @param result
     * @param exclude
     * @param com whether comments or not
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static void setXenc11Prefix(String prefix) {

    /**
     * Set the prefix for the encryption namespace 1.1
     * @param prefix the new prefix for the encryption namespace 1.1
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to set the prefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static void setXencPrefix(String prefix) {

    /**
     * Set the prefix for the encryption namespace
     * @param prefix the new prefix for the encryption namespace
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to set the prefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static void setDs11Prefix(String prefix) {

    /**
     * Set the prefix for the digital signature 1.1 namespace
     * @param prefix the new prefix for the digital signature 1.1 namespace
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to set the prefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static void setDsPrefix(String prefix) {

    /**
     * Set the prefix for the digital signature namespace
     * @param prefix the new prefix for the digital signature namespace
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to set the prefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    private XMLUtils() {

    /**
     * Constructor XMLUtils
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    private static final java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
public class XMLUtils {

/**
 * DOM and XML accessibility and comfort functions.
 *
 * @author Christian Geuer-Pollmann
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static boolean protectAgainstWrappingAttack(
        Node startNode, Element knownElement, String value
    ) {

    /**
     * This method is a tree-search to help prevent against wrapping attacks. It checks that no other
     * Element than the given "knownElement" argument has an ID attribute that matches the "value"
     * argument, which is the ID value of "knownElement". If this is the case then "false" is returned.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static boolean protectAgainstWrappingAttack(Node startNode, String value) {

    /**
     * This method is a tree-search to help prevent against wrapping attacks. It checks that no
     * two Elements have ID Attributes that match the "value" argument, if this is the case then
     * "false" is returned. Note that a return value of "true" does not necessarily mean that
     * a matching Element has been found, just that no wrapping attack has been detected.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static String getAttributeValue(Element elem, String name) {

    /**
     * Returns the attribute value for the attribute with the specified name.
     * Returns null if there is no such attribute, or
     * the empty string if the attribute value is empty.
     *
     * <p>This works around a limitation of the DOM
     * <code>Element.getAttributeNode</code> method, which does not distinguish
     * between an unspecified attribute and an attribute with a value of
     * "" (it returns "" for both cases).
     *
     * @param elem the element containing the attribute
     * @param name the name of the attribute
     * @return the attribute value (may be null if unspecified)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static boolean isDescendantOrSelf(Node ctx, Node descendantOrSelf) {

    /**
     * Returns true if the descendantOrSelf is on the descendant-or-self axis
     * of the context node.
     *
     * @param ctx
     * @param descendantOrSelf
     * @return true if the node is descendant
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static String getStrFromNode(Node xpathnode) {

    /**
     * Method getStrFromNode
     *
     * @param xpathnode
     * @return the string for the node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Set<Node> excludeNodeFromSet(Node signatureElement, Set<Node> inputSet) {

    /**
     * @param signatureElement
     * @param inputSet
     * @return nodes with the constrain
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Element[] selectNodes(Node sibling, String uri, String nodeName) {

    /**
     * @param sibling
     * @param uri
     * @param nodeName
     * @return nodes with the constraint
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Element[] selectDs11Nodes(Node sibling, String nodeName) {

    /**
     * @param sibling
     * @param nodeName
     * @return nodes with the constrain
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Element[] selectDsNodes(Node sibling, String nodeName) {

    /**
     * @param sibling
     * @param nodeName
     * @return nodes with the constrain
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Element selectNode(Node sibling, String uri, String nodeName, int number) {

    /**
     * @param sibling
     * @param uri
     * @param nodeName
     * @param number
     * @return nodes with the constrain
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Text selectNodeText(Node sibling, String uri, String nodeName, int number) {

    /**
     * @param sibling
     * @param uri
     * @param nodeName
     * @param number
     * @return nodes with the constrain
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Text selectDs11NodeText(Node sibling, String nodeName, int number) {

    /**
     * @param sibling
     * @param nodeName
     * @param number
     * @return nodes with the constrain
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Text selectDsNodeText(Node sibling, String nodeName, int number) {

    /**
     * @param sibling
     * @param nodeName
     * @param number
     * @return nodes with the constrain
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Element selectXencNode(Node sibling, String nodeName, int number) {

    /**
     * @param sibling
     * @param nodeName
     * @param number
     * @return nodes with the constrain
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Element selectDs11Node(Node sibling, String nodeName, int number) {

    /**
     * @param sibling
     * @param nodeName
     * @param number
     * @return nodes with the constraint
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Element selectDsNode(Node sibling, String nodeName, int number) {

    /**
     * @param sibling
     * @param nodeName
     * @param number
     * @return nodes with the constraint
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    @SuppressWarnings("fallthrough")

    /**
     * This is the work horse for {@link #circumventBug2650}.
     *
     * @param node
     * @see <A HREF="http://nagoya.apache.org/bugzilla/show_bug.cgi?id=2650">
     * Namespace axis resolution is not XPath compliant </A>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static void circumventBug2650(Document doc) {

    /**
     * This method spreads all namespace attributes in a DOM document to their
     * children. This is needed because the XML Signature XPath transform
     * must evaluate the XPath against all nodes in the input, even against
     * XPath namespace nodes. Through a bug in XalanJ2, the namespace nodes are
     * not fully visible in the Xalan XPath model, so we have to do this by
     * hand in DOM spaces so that the nodes become visible in XPath space.
     *
     * @param doc
     * @see <A HREF="http://nagoya.apache.org/bugzilla/show_bug.cgi?id=2650">
     * Namespace axis resolution is not XPath compliant </A>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Set<Node> convertNodelistToSet(NodeList xpathNodeSet) {

    /**
     * Method convertNodelistToSet
     *
     * @param xpathNodeSet
     * @return the set with the nodelist
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static void addReturnToElement(Element e) {

    /**
     * Method addReturnToElement
     *
     * @param e
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Element createDSctx(Document doc, String prefix, String namespace) {

    /**
     * Method createDSctx
     *
     * @param doc
     * @param prefix
     * @param namespace
     * @return the element.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Document getOwnerDocument(Set<Node> xpathNodeSet) {

    /**
     * This method returns the first non-null owner document of the Nodes in this Set.
     * This method is necessary because it <I>always</I> returns a
     * {@link Document}. {@link Node#getOwnerDocument} returns <CODE>null</CODE>
     * if the {@link Node} is a {@link Document}.
     *
     * @param xpathNodeSet
     * @return the owner document
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Document getOwnerDocument(Node node) {

    /**
     * This method returns the owner document of a particular node.
     * This method is necessary because it <I>always</I> returns a
     * {@link Document}. {@link Node#getOwnerDocument} returns <CODE>null</CODE>
     * if the {@link Node} is a {@link Document}.
     *
     * @param node
     * @return the owner document of the node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static boolean elementIsInEncryption11Space(Element element, String localName) {

    /**
     * Returns true if the element is in XML Encryption 1.1 namespace and the local
     * name equals the supplied one.
     *
     * @param element
     * @param localName
     * @return true if the element is in XML Encryption 1.1 namespace and the local name
     * equals the supplied one
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static boolean elementIsInEncryptionSpace(Element element, String localName) {

    /**
     * Returns true if the element is in XML Encryption namespace and the local
     * name equals the supplied one.
     *
     * @param element
     * @param localName
     * @return true if the element is in XML Encryption namespace and the local name
     * equals the supplied one
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static boolean elementIsInSignature11Space(Element element, String localName) {

    /**
     * Returns true if the element is in XML Signature 1.1 namespace and the local
     * name equals the supplied one.
     *
     * @param element
     * @param localName
     * @return true if the element is in XML Signature namespace and the local name equals
     * the supplied one
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static boolean elementIsInSignatureSpace(Element element, String localName) {

    /**
     * Returns true if the element is in XML Signature namespace and the local
     * name equals the supplied one.
     *
     * @param element
     * @param localName
     * @return true if the element is in XML Signature namespace and the local name equals
     * the supplied one
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Element createElementInEncryption11Space(Document doc, String elementName) {

    /**
     * Creates an Element in the XML Encryption 1.1 specification namespace.
     *
     * @param doc the factory Document
     * @param elementName the local name of the Element
     * @return the Element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Element createElementInEncryptionSpace(Document doc, String elementName) {

    /**
     * Creates an Element in the XML Encryption specification namespace.
     *
     * @param doc the factory Document
     * @param elementName the local name of the Element
     * @return the Element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Element createElementInSignature11Space(Document doc, String elementName) {

    /**
     * Creates an Element in the XML Signature 1.1 specification namespace.
     *
     * @param doc the factory Document
     * @param elementName the local name of the Element
     * @return the Element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static Element createElementInSignatureSpace(Document doc, String elementName) {

    /**
     * Creates an Element in the XML Signature specification namespace.
     *
     * @param doc the factory Document
     * @param elementName the local name of the Element
     * @return the Element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static String getFullTextChildrenFromElement(Element element) {

    /**
     * Method getFullTextChildrenFromElement
     *
     * @param element
     * @return the string of children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static void outputDOMc14nWithComments(Node contextNode, OutputStream os) {

    /**
     * Serializes the <CODE>contextNode</CODE> into the OutputStream, <I>but
     * suppresses all Exceptions</I>.
     * <BR />
     * NOTE: <I>This should only be used for debugging purposes,
     * NOT in a production environment; this method ignores all exceptions,
     * so you won't notice if something goes wrong. If you're asking what is to
     * be used in a production environment, simply use the code inside the
     * <code>try{}</code> statement, but handle the Exceptions appropriately.</I>
     *
     * @param contextNode
     * @param os
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static void outputDOM(Node contextNode, OutputStream os, boolean addPreamble) {

    /**
     * Outputs a DOM tree to an {@link OutputStream}. <I>If an Exception is
     * thrown during execution, it's StackTrace is output to System.out, but the
     * Exception is not re-thrown.</I>
     *
     * @param contextNode root node of the DOM tree
     * @param os the {@link OutputStream}
     * @param addPreamble
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static void outputDOM(Node contextNode, OutputStream os) {

    /**
     * Outputs a DOM tree to an {@link OutputStream}.
     *
     * @param contextNode root node of the DOM tree
     * @param os the {@link OutputStream}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static void getSet(Node rootNode, Set<Node> result, Node exclude, boolean com) {

    /**
     * @param rootNode
     * @param result
     * @param exclude
     * @param com whether comments or not
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static void setXenc11Prefix(String prefix) {

    /**
     * Set the prefix for the encryption namespace 1.1
     * @param prefix the new prefix for the encryption namespace 1.1
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to set the prefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static void setXencPrefix(String prefix) {

    /**
     * Set the prefix for the encryption namespace
     * @param prefix the new prefix for the encryption namespace
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to set the prefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static void setDs11Prefix(String prefix) {

    /**
     * Set the prefix for the digital signature 1.1 namespace
     * @param prefix the new prefix for the digital signature 1.1 namespace
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to set the prefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    public static void setDsPrefix(String prefix) {

    /**
     * Set the prefix for the digital signature namespace
     * @param prefix the new prefix for the digital signature namespace
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to set the prefix
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    private XMLUtils() {

    /**
     * Constructor XMLUtils
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
    private static final java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
public class XMLUtils {

/**
 * DOM and XML accessibility and comfort functions.
 *
 * @author Christian Geuer-Pollmann
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XMLUtils.java
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
