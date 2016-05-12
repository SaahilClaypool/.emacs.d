_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315.java
    @Override

    /**
     * Returns the Attr[]s to be output for the given element.
     * <br>
     * IMPORTANT: This method expects to work on a modified DOM tree, i.e. a DOM which has
     * been prepared using {@link com.sun.org.apache.xml.internal.security.utils.XMLUtils#circumventBug2650(
     * org.w3c.dom.Document)}.
     *
     * @param element
     * @param ns
     * @return the Attr[]s to be output
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315.java
    @Override

    /**
     * Returns the Attr[]s to be output for the given element.
     * <br>
     * The code of this method is a copy of {@link #handleAttributes(Element,
     * NameSpaceSymbTable)},
     * whereas it takes into account that subtree-c14n is -- well -- subtree-based.
     * So if the element in question isRoot of c14n, it's parent is not in the
     * node set, as well as all other ancestors.
     *
     * @param element
     * @param ns
     * @return the Attr[]s to be output
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315.java
        throw new CanonicalizationException("c14n.Canonicalizer.UnsupportedOperation");

        /** $todo$ well, should we throw UnsupportedOperationException ? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315.java
    public byte[] engineCanonicalizeSubTree(Node rootNode, String inclusiveNamespaces)

    /**
     * Always throws a CanonicalizationException because this is inclusive c14n.
     *
     * @param rootNode
     * @param inclusiveNamespaces
     * @return none it always fails
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315.java
        throw new CanonicalizationException("c14n.Canonicalizer.UnsupportedOperation");

        /** $todo$ well, should we throw UnsupportedOperationException ? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315.java
    public byte[] engineCanonicalizeXPathNodeSet(Set<Node> xpathNodeSet, String inclusiveNamespaces)

    /**
     * Always throws a CanonicalizationException because this is inclusive c14n.
     *
     * @param xpathNodeSet
     * @param inclusiveNamespaces
     * @return none it always fails
     * @throws CanonicalizationException always
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315.java
    public Canonicalizer20010315(boolean includeComments) {

    /**
     * Constructor Canonicalizer20010315
     *
     * @param includeComments
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315.java
public abstract class Canonicalizer20010315 extends CanonicalizerBase {

/**
 * Implements <A HREF="http://www.w3.org/TR/2001/REC-xml-c14n-20010315">Canonical
 * XML Version 1.0</A>, a W3C Recommendation from 15 March 2001.
 *
 * @author Christian Geuer-Pollmann <geuerp@apache.org>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315.java
    @Override

    /**
     * Returns the Attr[]s to be output for the given element.
     * <br>
     * IMPORTANT: This method expects to work on a modified DOM tree, i.e. a DOM which has
     * been prepared using {@link com.sun.org.apache.xml.internal.security.utils.XMLUtils#circumventBug2650(
     * org.w3c.dom.Document)}.
     *
     * @param element
     * @param ns
     * @return the Attr[]s to be output
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315.java
    @Override

    /**
     * Returns the Attr[]s to be output for the given element.
     * <br>
     * The code of this method is a copy of {@link #handleAttributes(Element,
     * NameSpaceSymbTable)},
     * whereas it takes into account that subtree-c14n is -- well -- subtree-based.
     * So if the element in question isRoot of c14n, it's parent is not in the
     * node set, as well as all other ancestors.
     *
     * @param element
     * @param ns
     * @return the Attr[]s to be output
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315.java
        throw new CanonicalizationException("c14n.Canonicalizer.UnsupportedOperation");

        /** $todo$ well, should we throw UnsupportedOperationException ? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315.java
    public byte[] engineCanonicalizeSubTree(Node rootNode, String inclusiveNamespaces)

    /**
     * Always throws a CanonicalizationException because this is inclusive c14n.
     *
     * @param rootNode
     * @param inclusiveNamespaces
     * @return none it always fails
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315.java
        throw new CanonicalizationException("c14n.Canonicalizer.UnsupportedOperation");

        /** $todo$ well, should we throw UnsupportedOperationException ? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315.java
    public byte[] engineCanonicalizeXPathNodeSet(Set<Node> xpathNodeSet, String inclusiveNamespaces)

    /**
     * Always throws a CanonicalizationException because this is inclusive c14n.
     *
     * @param xpathNodeSet
     * @param inclusiveNamespaces
     * @return none it always fails
     * @throws CanonicalizationException always
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315.java
    public Canonicalizer20010315(boolean includeComments) {

    /**
     * Constructor Canonicalizer20010315
     *
     * @param includeComments
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315.java
public abstract class Canonicalizer20010315 extends CanonicalizerBase {

/**
 * Implements <A HREF="http://www.w3.org/TR/2001/REC-xml-c14n-20010315">Canonical
 * XML Version 1.0</A>, a W3C Recommendation from 15 March 2001.
 *
 * @author Christian Geuer-Pollmann <geuerp@apache.org>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/Canonicalizer20010315.java
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
