_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public void notReset() {

    /**
     * Set the canonicalizer behaviour to not reset.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public String getImplementingCanonicalizerClass() {

    /**
     * Returns the name of the implementing {@link CanonicalizerSpi} class
     *
     * @return the name of the implementing {@link CanonicalizerSpi} class
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public void setWriter(OutputStream os) {

    /**
     * Sets the writer where the canonicalization ends.  ByteArrayOutputStream
     * if none is set.
     * @param os
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public byte[] canonicalizeXPathNodeSet(
        Set<Node> xpathNodeSet, String inclusiveNamespaces
    ) throws CanonicalizationException {

    /**
     * Canonicalizes an XPath node set.
     *
     * @param xpathNodeSet
     * @param inclusiveNamespaces
     * @return the result of the c14n.
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public byte[] canonicalizeXPathNodeSet(Set<Node> xpathNodeSet)

    /**
     * Canonicalizes an XPath node set.
     *
     * @param xpathNodeSet
     * @return the result of the c14n.
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public byte[] canonicalizeXPathNodeSet(
        NodeList xpathNodeSet, String inclusiveNamespaces
    ) throws CanonicalizationException {

    /**
     * Canonicalizes an XPath node set. The <CODE>xpathNodeSet</CODE> is treated
     * as a list of XPath nodes, not as a list of subtrees.
     *
     * @param xpathNodeSet
     * @param inclusiveNamespaces
     * @return the result of the c14n.
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public byte[] canonicalizeXPathNodeSet(NodeList xpathNodeSet)

    /**
     * Canonicalizes an XPath node set. The <CODE>xpathNodeSet</CODE> is treated
     * as a list of XPath nodes, not as a list of subtrees.
     *
     * @param xpathNodeSet
     * @return the result of the c14n.
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public byte[] canonicalizeSubtree(Node node, String inclusiveNamespaces)

    /**
     * Canonicalizes the subtree rooted by <CODE>node</CODE>.
     *
     * @param node
     * @param inclusiveNamespaces
     * @return the result of the c14n.
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public byte[] canonicalizeSubtree(Node node) throws CanonicalizationException {

    /**
     * Canonicalizes the subtree rooted by <CODE>node</CODE>.
     *
     * @param node The node to canonicalize
     * @return the result of the c14n.
     *
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public byte[] canonicalize(byte[] inputBytes)

    /**
     * This method tries to canonicalize the given bytes. It's possible to even
     * canonicalize non-wellformed sequences if they are well-formed after being
     * wrapped with a <CODE>&gt;a&lt;...&gt;/a&lt;</CODE>.
     *
     * @param inputBytes
     * @return the result of the canonicalization.
     * @throws CanonicalizationException
     * @throws java.io.IOException
     * @throws javax.xml.parsers.ParserConfigurationException
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public boolean getIncludeComments() {

    /**
     * Method getIncludeComments
     *
     * @return true if the c14n respect the comments.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public final String getURI() {

    /**
     * Method getURI
     *
     * @return the URI defined for this c14n instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public static void registerDefaultAlgorithms() {

    /**
     * This method registers the default algorithms.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public static void register(String algorithmURI, Class<? extends CanonicalizerSpi> implementingClass)

    /**
     * Method register
     *
     * @param algorithmURI
     * @param implementingClass
     * @throws AlgorithmAlreadyRegisteredException
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the canonicalizer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    @SuppressWarnings("unchecked")

    /**
     * Method register
     *
     * @param algorithmURI
     * @param implementingClass
     * @throws AlgorithmAlreadyRegisteredException
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the canonicalizer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public static final Canonicalizer getInstance(String algorithmURI)

    /**
     * Method getInstance
     *
     * @param algorithmURI
     * @return a Canonicalizer instance ready for the job
     * @throws InvalidCanonicalizerException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    private Canonicalizer(String algorithmURI) throws InvalidCanonicalizerException {

    /**
     * Constructor Canonicalizer
     *
     * @param algorithmURI
     * @throws InvalidCanonicalizerException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public static final String ALGO_ID_C14N_PHYSICAL =

    /**
     * Non-standard algorithm to serialize the physical representation for XML Encryption
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public static final String ALGO_ID_C14N11_WITH_COMMENTS =

    /**
     * The URI for inclusive c14n 1.1 <b>with</b> comments.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public static final String ALGO_ID_C14N11_OMIT_COMMENTS =

    /**
     * The URI for inclusive c14n 1.1 <b>without</b> comments.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public static final String ALGO_ID_C14N_EXCL_WITH_COMMENTS =

    /**
     * The URL defined in XML-SEC Rec for exclusive c14n <b>with</b> comments.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public static final String ALGO_ID_C14N_EXCL_OMIT_COMMENTS =

    /**
     * The URL defined in XML-SEC Rec for exclusive c14n <b>without</b> comments.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public static final String ALGO_ID_C14N_WITH_COMMENTS =

    /**
     * The URL defined in XML-SEC Rec for inclusive c14n <b>with</b> comments.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public static final String ALGO_ID_C14N_OMIT_COMMENTS =

    /**
     * The URL defined in XML-SEC Rec for inclusive c14n <b>without</b> comments.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public static final String XPATH_C14N_WITH_COMMENTS_SINGLE_NODE =

    /**
     * XPath Expression for selecting every node and continuous comments joined
     * in only one node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public static final String ENCODING = "UTF8";

    /** The output encoding of canonicalized data */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
public class Canonicalizer {

/**
 *
 * @author Christian Geuer-Pollmann
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
package com.sun.org.apache.xml.internal.security.c14n;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public void notReset() {

    /**
     * Set the canonicalizer behaviour to not reset.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public String getImplementingCanonicalizerClass() {

    /**
     * Returns the name of the implementing {@link CanonicalizerSpi} class
     *
     * @return the name of the implementing {@link CanonicalizerSpi} class
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public void setWriter(OutputStream os) {

    /**
     * Sets the writer where the canonicalization ends.  ByteArrayOutputStream
     * if none is set.
     * @param os
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public byte[] canonicalizeXPathNodeSet(
        Set<Node> xpathNodeSet, String inclusiveNamespaces
    ) throws CanonicalizationException {

    /**
     * Canonicalizes an XPath node set.
     *
     * @param xpathNodeSet
     * @param inclusiveNamespaces
     * @return the result of the c14n.
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public byte[] canonicalizeXPathNodeSet(Set<Node> xpathNodeSet)

    /**
     * Canonicalizes an XPath node set.
     *
     * @param xpathNodeSet
     * @return the result of the c14n.
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public byte[] canonicalizeXPathNodeSet(
        NodeList xpathNodeSet, String inclusiveNamespaces
    ) throws CanonicalizationException {

    /**
     * Canonicalizes an XPath node set. The <CODE>xpathNodeSet</CODE> is treated
     * as a list of XPath nodes, not as a list of subtrees.
     *
     * @param xpathNodeSet
     * @param inclusiveNamespaces
     * @return the result of the c14n.
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public byte[] canonicalizeXPathNodeSet(NodeList xpathNodeSet)

    /**
     * Canonicalizes an XPath node set. The <CODE>xpathNodeSet</CODE> is treated
     * as a list of XPath nodes, not as a list of subtrees.
     *
     * @param xpathNodeSet
     * @return the result of the c14n.
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public byte[] canonicalizeSubtree(Node node, String inclusiveNamespaces)

    /**
     * Canonicalizes the subtree rooted by <CODE>node</CODE>.
     *
     * @param node
     * @param inclusiveNamespaces
     * @return the result of the c14n.
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public byte[] canonicalizeSubtree(Node node) throws CanonicalizationException {

    /**
     * Canonicalizes the subtree rooted by <CODE>node</CODE>.
     *
     * @param node The node to canonicalize
     * @return the result of the c14n.
     *
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public byte[] canonicalize(byte[] inputBytes)

    /**
     * This method tries to canonicalize the given bytes. It's possible to even
     * canonicalize non-wellformed sequences if they are well-formed after being
     * wrapped with a <CODE>&gt;a&lt;...&gt;/a&lt;</CODE>.
     *
     * @param inputBytes
     * @return the result of the canonicalization.
     * @throws CanonicalizationException
     * @throws java.io.IOException
     * @throws javax.xml.parsers.ParserConfigurationException
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public boolean getIncludeComments() {

    /**
     * Method getIncludeComments
     *
     * @return true if the c14n respect the comments.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public final String getURI() {

    /**
     * Method getURI
     *
     * @return the URI defined for this c14n instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public static void registerDefaultAlgorithms() {

    /**
     * This method registers the default algorithms.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public static void register(String algorithmURI, Class<? extends CanonicalizerSpi> implementingClass)

    /**
     * Method register
     *
     * @param algorithmURI
     * @param implementingClass
     * @throws AlgorithmAlreadyRegisteredException
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the canonicalizer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    @SuppressWarnings("unchecked")

    /**
     * Method register
     *
     * @param algorithmURI
     * @param implementingClass
     * @throws AlgorithmAlreadyRegisteredException
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the canonicalizer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public static final Canonicalizer getInstance(String algorithmURI)

    /**
     * Method getInstance
     *
     * @param algorithmURI
     * @return a Canonicalizer instance ready for the job
     * @throws InvalidCanonicalizerException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    private Canonicalizer(String algorithmURI) throws InvalidCanonicalizerException {

    /**
     * Constructor Canonicalizer
     *
     * @param algorithmURI
     * @throws InvalidCanonicalizerException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public static final String ALGO_ID_C14N_PHYSICAL =

    /**
     * Non-standard algorithm to serialize the physical representation for XML Encryption
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public static final String ALGO_ID_C14N11_WITH_COMMENTS =

    /**
     * The URI for inclusive c14n 1.1 <b>with</b> comments.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public static final String ALGO_ID_C14N11_OMIT_COMMENTS =

    /**
     * The URI for inclusive c14n 1.1 <b>without</b> comments.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public static final String ALGO_ID_C14N_EXCL_WITH_COMMENTS =

    /**
     * The URL defined in XML-SEC Rec for exclusive c14n <b>with</b> comments.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public static final String ALGO_ID_C14N_EXCL_OMIT_COMMENTS =

    /**
     * The URL defined in XML-SEC Rec for exclusive c14n <b>without</b> comments.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public static final String ALGO_ID_C14N_WITH_COMMENTS =

    /**
     * The URL defined in XML-SEC Rec for inclusive c14n <b>with</b> comments.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public static final String ALGO_ID_C14N_OMIT_COMMENTS =

    /**
     * The URL defined in XML-SEC Rec for inclusive c14n <b>without</b> comments.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public static final String XPATH_C14N_WITH_COMMENTS_SINGLE_NODE =

    /**
     * XPath Expression for selecting every node and continuous comments joined
     * in only one node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
    public static final String ENCODING = "UTF8";

    /** The output encoding of canonicalized data */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
public class Canonicalizer {

/**
 *
 * @author Christian Geuer-Pollmann
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/Canonicalizer.java
package com.sun.org.apache.xml.internal.security.c14n;

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
