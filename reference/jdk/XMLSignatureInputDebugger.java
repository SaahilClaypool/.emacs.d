_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
    private void outputTextToWriter(String text) throws IOException {

    /**
     * Method outputTextToWriter
     *
     * @param text
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
    private void outputCommentToWriter(Comment currentComment) throws IOException {

    /**
     * Method outputCommentToWriter
     *
     * @param currentComment
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
    private void outputPItoWriter(ProcessingInstruction currentPI) throws IOException {

    /**
     * Normalizes a {@link org.w3c.dom.Comment} value
     *
     * @param currentPI
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
    private void outputAttrToWriter(String name, String value) throws IOException {

    /**
     * Normalizes an {@link Attr}ibute value
     *
     * The string value of the node is modified by replacing
     * <UL>
     * <LI>all ampersands (&) with <CODE>&amp;amp;</CODE></LI>
     * <LI>all open angle brackets (<) with <CODE>&amp;lt;</CODE></LI>
     * <LI>all quotation mark characters with <CODE>&amp;quot;</CODE></LI>
     * <LI>and the whitespace characters <CODE>#x9</CODE>, #xA, and #xD,
     * with character references. The character references are written in
     * uppercase hexadecimal with no leading zeroes (for example, <CODE>#xD</CODE>
     * is represented by the character reference <CODE>&amp;#xD;</CODE>)</LI>
     * </UL>
     *
     * @param name
     * @param value
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
    private int getPositionRelativeToDocumentElement(Node currentNode) {

    /**
     * Checks whether a Comment or ProcessingInstruction is before or after the
     * document element. This is needed for prepending or appending "\n"s.
     *
     * @param currentNode
     *            comment or pi to check
     * @return NODE_BEFORE_DOCUMENT_ELEMENT,
     *         NODE_NOT_BEFORE_OR_AFTER_DOCUMENT_ELEMENT or
     *         NODE_AFTER_DOCUMENT_ELEMENT
     * @see #NODE_BEFORE_DOCUMENT_ELEMENT
     * @see #NODE_NOT_BEFORE_OR_AFTER_DOCUMENT_ELEMENT
     * @see #NODE_AFTER_DOCUMENT_ELEMENT
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
    private void canonicalizeXPathNodeSet(Node currentNode)

    /**
     * Method canonicalizeXPathNodeSet
     *
     * @param currentNode
     * @throws XMLSignatureException
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
    public String getHTMLRepresentation() throws XMLSignatureException {

    /**
     * Method getHTMLRepresentation
     *
     * @return The HTML Representation.
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
    public XMLSignatureInputDebugger(
        XMLSignatureInput xmlSignatureInput,
        Set<String> inclusiveNamespace
    ) {

    /**
     * Constructor XMLSignatureInputDebugger
     *
     * @param xmlSignatureInput the signatur to pretty print
     * @param inclusiveNamespace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
    public XMLSignatureInputDebugger(XMLSignatureInput xmlSignatureInput) {

    /**
     * Constructor XMLSignatureInputDebugger
     *
     * @param xmlSignatureInput the signature to pretty print
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
    static final String HTMLSuffix = "</pre></body></html>";

    /** HTML Suffix * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
    static final String HTMLPrefix =

    /** The HTML Prefix* */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
    private Writer writer = null;

    /** Field writer */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
    private Document doc = null;

    /** Field doc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
    private Set<Node> xpathNodeSet;

    /** Field _xmlSignatureInput */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
public class XMLSignatureInputDebugger {

/**
 * Class XMLSignatureInputDebugger
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
    private void outputTextToWriter(String text) throws IOException {

    /**
     * Method outputTextToWriter
     *
     * @param text
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
    private void outputCommentToWriter(Comment currentComment) throws IOException {

    /**
     * Method outputCommentToWriter
     *
     * @param currentComment
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
    private void outputPItoWriter(ProcessingInstruction currentPI) throws IOException {

    /**
     * Normalizes a {@link org.w3c.dom.Comment} value
     *
     * @param currentPI
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
    private void outputAttrToWriter(String name, String value) throws IOException {

    /**
     * Normalizes an {@link Attr}ibute value
     *
     * The string value of the node is modified by replacing
     * <UL>
     * <LI>all ampersands (&) with <CODE>&amp;amp;</CODE></LI>
     * <LI>all open angle brackets (<) with <CODE>&amp;lt;</CODE></LI>
     * <LI>all quotation mark characters with <CODE>&amp;quot;</CODE></LI>
     * <LI>and the whitespace characters <CODE>#x9</CODE>, #xA, and #xD,
     * with character references. The character references are written in
     * uppercase hexadecimal with no leading zeroes (for example, <CODE>#xD</CODE>
     * is represented by the character reference <CODE>&amp;#xD;</CODE>)</LI>
     * </UL>
     *
     * @param name
     * @param value
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
    private int getPositionRelativeToDocumentElement(Node currentNode) {

    /**
     * Checks whether a Comment or ProcessingInstruction is before or after the
     * document element. This is needed for prepending or appending "\n"s.
     *
     * @param currentNode
     *            comment or pi to check
     * @return NODE_BEFORE_DOCUMENT_ELEMENT,
     *         NODE_NOT_BEFORE_OR_AFTER_DOCUMENT_ELEMENT or
     *         NODE_AFTER_DOCUMENT_ELEMENT
     * @see #NODE_BEFORE_DOCUMENT_ELEMENT
     * @see #NODE_NOT_BEFORE_OR_AFTER_DOCUMENT_ELEMENT
     * @see #NODE_AFTER_DOCUMENT_ELEMENT
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
    private void canonicalizeXPathNodeSet(Node currentNode)

    /**
     * Method canonicalizeXPathNodeSet
     *
     * @param currentNode
     * @throws XMLSignatureException
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
    public String getHTMLRepresentation() throws XMLSignatureException {

    /**
     * Method getHTMLRepresentation
     *
     * @return The HTML Representation.
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
    public XMLSignatureInputDebugger(
        XMLSignatureInput xmlSignatureInput,
        Set<String> inclusiveNamespace
    ) {

    /**
     * Constructor XMLSignatureInputDebugger
     *
     * @param xmlSignatureInput the signatur to pretty print
     * @param inclusiveNamespace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
    public XMLSignatureInputDebugger(XMLSignatureInput xmlSignatureInput) {

    /**
     * Constructor XMLSignatureInputDebugger
     *
     * @param xmlSignatureInput the signature to pretty print
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
    static final String HTMLSuffix = "</pre></body></html>";

    /** HTML Suffix * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
    static final String HTMLPrefix =

    /** The HTML Prefix* */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
    private Writer writer = null;

    /** Field writer */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
    private Document doc = null;

    /** Field doc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
    private Set<Node> xpathNodeSet;

    /** Field _xmlSignatureInput */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
public class XMLSignatureInputDebugger {

/**
 * Class XMLSignatureInputDebugger
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/XMLSignatureInputDebugger.java
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
