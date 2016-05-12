_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerPhysical.java
    public final boolean engineGetIncludeComments() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerPhysical.java
    public final String engineGetURI() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerPhysical.java
        throw new CanonicalizationException("c14n.Canonicalizer.UnsupportedOperation");

        /** $todo$ well, should we throw UnsupportedOperationException ? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerPhysical.java
    @Override

    /**
     * Returns the Attr[]s to be output for the given element.
     *
     * @param element
     * @param ns
     * @return the Attr[]s to be output
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerPhysical.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerPhysical.java
        throw new CanonicalizationException("c14n.Canonicalizer.UnsupportedOperation");

        /** $todo$ well, should we throw UnsupportedOperationException ? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerPhysical.java
    public byte[] engineCanonicalizeSubTree(Node rootNode, String inclusiveNamespaces)

    /**
     * Always throws a CanonicalizationException.
     *
     * @param rootNode
     * @param inclusiveNamespaces
     * @return none it always fails
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerPhysical.java
        throw new CanonicalizationException("c14n.Canonicalizer.UnsupportedOperation");

        /** $todo$ well, should we throw UnsupportedOperationException ? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerPhysical.java
    public byte[] engineCanonicalizeXPathNodeSet(Set<Node> xpathNodeSet, String inclusiveNamespaces)

    /**
     * Always throws a CanonicalizationException.
     *
     * @param xpathNodeSet
     * @param inclusiveNamespaces
     * @return none it always fails
     * @throws CanonicalizationException always
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerPhysical.java
    public CanonicalizerPhysical() {

    /**
     * Constructor Canonicalizer20010315
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerPhysical.java
public class CanonicalizerPhysical extends CanonicalizerBase {

/**
 * Serializes the physical representation of the subtree. All the attributes
 * present in the subtree are emitted. The attributes are sorted within an element,
 * with the namespace declarations appearing before the regular attributes.
 * This algorithm is not a true canonicalization since equivalent subtrees
 * may produce different output. It is therefore unsuitable for digital signatures.
 * This same property makes it ideal for XML Encryption Syntax and Processing,
 * because the decrypted XML content will share the same physical representation
 * as the original XML content that was encrypted.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerPhysical.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerPhysical.java
    public final boolean engineGetIncludeComments() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerPhysical.java
    public final String engineGetURI() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerPhysical.java
        throw new CanonicalizationException("c14n.Canonicalizer.UnsupportedOperation");

        /** $todo$ well, should we throw UnsupportedOperationException ? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerPhysical.java
    @Override

    /**
     * Returns the Attr[]s to be output for the given element.
     *
     * @param element
     * @param ns
     * @return the Attr[]s to be output
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerPhysical.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerPhysical.java
        throw new CanonicalizationException("c14n.Canonicalizer.UnsupportedOperation");

        /** $todo$ well, should we throw UnsupportedOperationException ? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerPhysical.java
    public byte[] engineCanonicalizeSubTree(Node rootNode, String inclusiveNamespaces)

    /**
     * Always throws a CanonicalizationException.
     *
     * @param rootNode
     * @param inclusiveNamespaces
     * @return none it always fails
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerPhysical.java
        throw new CanonicalizationException("c14n.Canonicalizer.UnsupportedOperation");

        /** $todo$ well, should we throw UnsupportedOperationException ? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerPhysical.java
    public byte[] engineCanonicalizeXPathNodeSet(Set<Node> xpathNodeSet, String inclusiveNamespaces)

    /**
     * Always throws a CanonicalizationException.
     *
     * @param xpathNodeSet
     * @param inclusiveNamespaces
     * @return none it always fails
     * @throws CanonicalizationException always
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerPhysical.java
    public CanonicalizerPhysical() {

    /**
     * Constructor Canonicalizer20010315
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerPhysical.java
public class CanonicalizerPhysical extends CanonicalizerBase {

/**
 * Serializes the physical representation of the subtree. All the attributes
 * present in the subtree are emitted. The attributes are sorted within an element,
 * with the namespace declarations appearing before the regular attributes.
 * This algorithm is not a true canonicalization since equivalent subtrees
 * may produce different output. It is therefore unsuitable for digital signatures.
 * This same property makes it ideal for XML Encryption Syntax and Processing,
 * because the decrypted XML content will share the same physical representation
 * as the original XML content that was encrypted.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/CanonicalizerPhysical.java
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
