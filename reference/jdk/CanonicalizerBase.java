_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    protected static final void outputTextToWriter(
        final String text, final OutputStream writer
    ) throws IOException {

    /**
     * Outputs a Text of CDATA section to the internal Writer.
     *
     * @param text
     * @param writer writer where to write the things
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    protected void outputCommentToWriter(
        Comment currentComment, OutputStream writer, int position
    ) throws IOException {

    /**
     * Method outputCommentToWriter
     *
     * @param currentComment
     * @param writer writer where to write the things
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    protected void outputPItoWriter(
        ProcessingInstruction currentPI, OutputStream writer, int position
    ) throws IOException {

    /**
     * Outputs a PI to the internal Writer.
     *
     * @param currentPI
     * @param writer where to write the things
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    protected static final void outputAttrToWriter(
        final String name, final String value,
        final OutputStream writer, final Map<String, byte[]> cache
    ) throws IOException {

    /**
     * Outputs an Attribute to the internal Writer.
     *
     * The string value of the node is modified by replacing
     * <UL>
     * <LI>all ampersands (&) with <CODE>&amp;amp;</CODE></LI>
     * <LI>all open angle brackets (<) with <CODE>&amp;lt;</CODE></LI>
     * <LI>all quotation mark characters with <CODE>&amp;quot;</CODE></LI>
     * <LI>and the whitespace characters <CODE>#x9</CODE>, #xA, and #xD, with character
     * references. The character references are written in uppercase
     * hexadecimal with no leading zeroes (for example, <CODE>#xD</CODE> is represented
     * by the character reference <CODE>&amp;#xD;</CODE>)</LI>
     * </UL>
     *
     * @param name
     * @param value
     * @param writer
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    abstract Iterator<Attr> handleAttributesSubtree(Element element, NameSpaceSymbTable ns)

    /**
     * Obtain the attributes to output for this node in a Subtree c14n.
     *
     * @param element
     * @param ns
     * @return the attributes nodes to output.
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    abstract Iterator<Attr> handleAttributes(Element element, NameSpaceSymbTable ns)

    /**
     * Obtain the attributes to output for this node in XPathNodeSet c14n.
     *
     * @param element
     * @param ns
     * @return the attributes nodes to output.
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    protected final void getParentNameSpaces(Element el, NameSpaceSymbTable ns)  {

    /**
     * Adds to ns the definitions from the parent elements of el
     * @param el
     * @param ns
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    protected final void canonicalizeXPathNodeSet(Node currentNode, Node endnode)

    /**
     * Canonicalizes all the nodes included in the currentNode and contained in the
     * xpathNodeSet field.
     *
     * @param currentNode
     * @param endnode
     * @throws CanonicalizationException
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    protected final void canonicalizeSubTree(
        Node currentNode, NameSpaceSymbTable ns, Node endnode, int documentLevel
    ) throws CanonicalizationException, IOException {

    /**
     * Method canonicalizeSubTree, this function is a recursive one.
     *
     * @param currentNode
     * @param ns
     * @param endnode
     * @throws CanonicalizationException
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    protected byte[] engineCanonicalizeSubTree(Node rootNode, Node excludeNode)

    /**
     * Canonicalizes a Subtree node.
     *
     * @param rootNode
     *            the root of the subtree to canonicalize
     * @param excludeNode
     *            a node to be excluded from the canonicalize operation
     * @return The canonicalize stream.
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    public void setWriter(OutputStream writer) {

    /**
     * @param writer The writer to set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    public byte[] engineCanonicalize(XMLSignatureInput input) throws CanonicalizationException {

    /**
     * Canonicalizes a Subtree node.
     * @param input the root of the subtree to canicalize
     * @return The canonicalize stream.
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    public byte[] engineCanonicalizeXPathNodeSet(Set<Node> xpathNodeSet)

    /**
     * Method engineCanonicalizeXPathNodeSet
     * @inheritDoc
     * @param xpathNodeSet
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    public byte[] engineCanonicalizeSubTree(Node rootNode)

    /**
     * Method engineCanonicalizeSubTree
     * @inheritDoc
     * @param rootNode
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    public CanonicalizerBase(boolean includeComments) {

    /**
     * Constructor CanonicalizerBase
     *
     * @param includeComments
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    private Attr nullNode;

    /**
     * The null xmlns definition.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    private Node excludeNode;

    /**
     * The node to be skipped/excluded from the DOM tree
     * in subtree canonicalizations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
public abstract class CanonicalizerBase extends CanonicalizerSpi {

/**
 * Abstract base class for canonicalization algorithms.
 *
 * @author Christian Geuer-Pollmann <geuerp@apache.org>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
package com.sun.org.apache.xml.internal.security.c14n.implementations;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    protected static final void outputTextToWriter(
        final String text, final OutputStream writer
    ) throws IOException {

    /**
     * Outputs a Text of CDATA section to the internal Writer.
     *
     * @param text
     * @param writer writer where to write the things
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    protected void outputCommentToWriter(
        Comment currentComment, OutputStream writer, int position
    ) throws IOException {

    /**
     * Method outputCommentToWriter
     *
     * @param currentComment
     * @param writer writer where to write the things
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    protected void outputPItoWriter(
        ProcessingInstruction currentPI, OutputStream writer, int position
    ) throws IOException {

    /**
     * Outputs a PI to the internal Writer.
     *
     * @param currentPI
     * @param writer where to write the things
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    protected static final void outputAttrToWriter(
        final String name, final String value,
        final OutputStream writer, final Map<String, byte[]> cache
    ) throws IOException {

    /**
     * Outputs an Attribute to the internal Writer.
     *
     * The string value of the node is modified by replacing
     * <UL>
     * <LI>all ampersands (&) with <CODE>&amp;amp;</CODE></LI>
     * <LI>all open angle brackets (<) with <CODE>&amp;lt;</CODE></LI>
     * <LI>all quotation mark characters with <CODE>&amp;quot;</CODE></LI>
     * <LI>and the whitespace characters <CODE>#x9</CODE>, #xA, and #xD, with character
     * references. The character references are written in uppercase
     * hexadecimal with no leading zeroes (for example, <CODE>#xD</CODE> is represented
     * by the character reference <CODE>&amp;#xD;</CODE>)</LI>
     * </UL>
     *
     * @param name
     * @param value
     * @param writer
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    abstract Iterator<Attr> handleAttributesSubtree(Element element, NameSpaceSymbTable ns)

    /**
     * Obtain the attributes to output for this node in a Subtree c14n.
     *
     * @param element
     * @param ns
     * @return the attributes nodes to output.
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    abstract Iterator<Attr> handleAttributes(Element element, NameSpaceSymbTable ns)

    /**
     * Obtain the attributes to output for this node in XPathNodeSet c14n.
     *
     * @param element
     * @param ns
     * @return the attributes nodes to output.
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    protected final void getParentNameSpaces(Element el, NameSpaceSymbTable ns)  {

    /**
     * Adds to ns the definitions from the parent elements of el
     * @param el
     * @param ns
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    protected final void canonicalizeXPathNodeSet(Node currentNode, Node endnode)

    /**
     * Canonicalizes all the nodes included in the currentNode and contained in the
     * xpathNodeSet field.
     *
     * @param currentNode
     * @param endnode
     * @throws CanonicalizationException
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    protected final void canonicalizeSubTree(
        Node currentNode, NameSpaceSymbTable ns, Node endnode, int documentLevel
    ) throws CanonicalizationException, IOException {

    /**
     * Method canonicalizeSubTree, this function is a recursive one.
     *
     * @param currentNode
     * @param ns
     * @param endnode
     * @throws CanonicalizationException
     * @throws IOException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    protected byte[] engineCanonicalizeSubTree(Node rootNode, Node excludeNode)

    /**
     * Canonicalizes a Subtree node.
     *
     * @param rootNode
     *            the root of the subtree to canonicalize
     * @param excludeNode
     *            a node to be excluded from the canonicalize operation
     * @return The canonicalize stream.
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    public void setWriter(OutputStream writer) {

    /**
     * @param writer The writer to set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    public byte[] engineCanonicalize(XMLSignatureInput input) throws CanonicalizationException {

    /**
     * Canonicalizes a Subtree node.
     * @param input the root of the subtree to canicalize
     * @return The canonicalize stream.
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    public byte[] engineCanonicalizeXPathNodeSet(Set<Node> xpathNodeSet)

    /**
     * Method engineCanonicalizeXPathNodeSet
     * @inheritDoc
     * @param xpathNodeSet
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    public byte[] engineCanonicalizeSubTree(Node rootNode)

    /**
     * Method engineCanonicalizeSubTree
     * @inheritDoc
     * @param rootNode
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    public CanonicalizerBase(boolean includeComments) {

    /**
     * Constructor CanonicalizerBase
     *
     * @param includeComments
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    private Attr nullNode;

    /**
     * The null xmlns definition.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
    private Node excludeNode;

    /**
     * The node to be skipped/excluded from the DOM tree
     * in subtree canonicalizations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
public abstract class CanonicalizerBase extends CanonicalizerSpi {

/**
 * Abstract base class for canonicalization algorithms.
 *
 * @author Christian Geuer-Pollmann <geuerp@apache.org>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerBase.java
package com.sun.org.apache.xml.internal.security.c14n.implementations;

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
