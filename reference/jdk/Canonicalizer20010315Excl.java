_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315Excl.java
    @Override

    /**
     * @inheritDoc
     * @param element
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315Excl.java
    public byte[] engineCanonicalizeXPathNodeSet(
        Set<Node> xpathNodeSet, String inclusiveNamespaces
    ) throws CanonicalizationException {

    /**
     * Method engineCanonicalizeXPathNodeSet
     * @inheritDoc
     * @param xpathNodeSet
     * @param inclusiveNamespaces
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315Excl.java
    public byte[] engineCanonicalize(
        XMLSignatureInput rootNode, String inclusiveNamespaces
    ) throws CanonicalizationException {

    /**
     *
     * @param rootNode
     * @param inclusiveNamespaces
     * @return the rootNode c14n.
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315Excl.java
    public byte[] engineCanonicalizeSubTree(
        Node rootNode, String inclusiveNamespaces, Node excl
    ) throws CanonicalizationException{

    /**
     * Method engineCanonicalizeSubTree
     * @param rootNode
     * @param inclusiveNamespaces
     * @param excl A element to exclude from the c14n process.
     * @return the rootNode c14n.
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315Excl.java
    public byte[] engineCanonicalizeSubTree(
        Node rootNode, String inclusiveNamespaces
    ) throws CanonicalizationException {

    /**
     * Method engineCanonicalizeSubTree
     *  @inheritDoc
     * @param rootNode
     * @param inclusiveNamespaces
     *
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315Excl.java
    public byte[] engineCanonicalizeSubTree(Node rootNode)

    /**
     * Method engineCanonicalizeSubTree
     * @inheritDoc
     * @param rootNode
     *
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315Excl.java
    public Canonicalizer20010315Excl(boolean includeComments) {

    /**
     * Constructor Canonicalizer20010315Excl
     *
     * @param includeComments
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315Excl.java
    private SortedSet<String> inclusiveNSSet;

    /**
      * This Set contains the names (Strings like "xmlns" or "xmlns:foo") of
      * the inclusive namespaces.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315Excl.java
public abstract class Canonicalizer20010315Excl extends CanonicalizerBase {

/**
 * Implements &quot; <A
 * HREF="http://www.w3.org/TR/2002/REC-xml-exc-c14n-20020718/">Exclusive XML
 * Canonicalization, Version 1.0 </A>&quot; <BR />
 * Credits: During restructuring of the Canonicalizer framework, Ren??
 * Kollmorgen from Software AG submitted an implementation of ExclC14n which
 * fitted into the old architecture and which based heavily on my old (and slow)
 * implementation of "Canonical XML". A big "thank you" to Ren?? for this.
 * <BR />
 * <i>THIS </i> implementation is a complete rewrite of the algorithm.
 *
 * @author Christian Geuer-Pollmann <geuerp@apache.org>
 * @version $Revision: 1147448 $
 * @see <a href="http://www.w3.org/TR/2002/REC-xml-exc-c14n-20020718/ Exclusive#">
 *          XML Canonicalization, Version 1.0</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315Excl.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315Excl.java
    @Override

    /**
     * @inheritDoc
     * @param element
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315Excl.java
    public byte[] engineCanonicalizeXPathNodeSet(
        Set<Node> xpathNodeSet, String inclusiveNamespaces
    ) throws CanonicalizationException {

    /**
     * Method engineCanonicalizeXPathNodeSet
     * @inheritDoc
     * @param xpathNodeSet
     * @param inclusiveNamespaces
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315Excl.java
    public byte[] engineCanonicalize(
        XMLSignatureInput rootNode, String inclusiveNamespaces
    ) throws CanonicalizationException {

    /**
     *
     * @param rootNode
     * @param inclusiveNamespaces
     * @return the rootNode c14n.
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315Excl.java
    public byte[] engineCanonicalizeSubTree(
        Node rootNode, String inclusiveNamespaces, Node excl
    ) throws CanonicalizationException{

    /**
     * Method engineCanonicalizeSubTree
     * @param rootNode
     * @param inclusiveNamespaces
     * @param excl A element to exclude from the c14n process.
     * @return the rootNode c14n.
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315Excl.java
    public byte[] engineCanonicalizeSubTree(
        Node rootNode, String inclusiveNamespaces
    ) throws CanonicalizationException {

    /**
     * Method engineCanonicalizeSubTree
     *  @inheritDoc
     * @param rootNode
     * @param inclusiveNamespaces
     *
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315Excl.java
    public byte[] engineCanonicalizeSubTree(Node rootNode)

    /**
     * Method engineCanonicalizeSubTree
     * @inheritDoc
     * @param rootNode
     *
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315Excl.java
    public Canonicalizer20010315Excl(boolean includeComments) {

    /**
     * Constructor Canonicalizer20010315Excl
     *
     * @param includeComments
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315Excl.java
    private SortedSet<String> inclusiveNSSet;

    /**
      * This Set contains the names (Strings like "xmlns" or "xmlns:foo") of
      * the inclusive namespaces.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315Excl.java
public abstract class Canonicalizer20010315Excl extends CanonicalizerBase {

/**
 * Implements &quot; <A
 * HREF="http://www.w3.org/TR/2002/REC-xml-exc-c14n-20020718/">Exclusive XML
 * Canonicalization, Version 1.0 </A>&quot; <BR />
 * Credits: During restructuring of the Canonicalizer framework, Ren??
 * Kollmorgen from Software AG submitted an implementation of ExclC14n which
 * fitted into the old architecture and which based heavily on my old (and slow)
 * implementation of "Canonical XML". A big "thank you" to Ren?? for this.
 * <BR />
 * <i>THIS </i> implementation is a complete rewrite of the algorithm.
 *
 * @author Christian Geuer-Pollmann <geuerp@apache.org>
 * @version $Revision: 1147448 $
 * @see <a href="http://www.w3.org/TR/2002/REC-xml-exc-c14n-20020718/ Exclusive#">
 *          XML Canonicalization, Version 1.0</a>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315Excl.java
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
