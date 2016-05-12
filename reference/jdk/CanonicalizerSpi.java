_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/CanonicalizerSpi.java
    public abstract void setWriter(OutputStream os);

    /**
     * Sets the writer where the canonicalization ends. ByteArrayOutputStream if
     * none is set.
     * @param os
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/CanonicalizerSpi.java
    public abstract byte[] engineCanonicalizeSubTree(Node rootNode, String inclusiveNamespaces)

    /**
     * C14n a node tree.
     *
     * @param rootNode
     * @param inclusiveNamespaces
     * @return the c14n bytes
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/CanonicalizerSpi.java
    public abstract byte[] engineCanonicalizeSubTree(Node rootNode)

    /**
     * C14n a node tree.
     *
     * @param rootNode
     * @return the c14n bytes
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/CanonicalizerSpi.java
    public abstract byte[] engineCanonicalizeXPathNodeSet(
        Set<Node> xpathNodeSet, String inclusiveNamespaces
    ) throws CanonicalizationException;

    /**
     * C14n a nodeset
     *
     * @param xpathNodeSet
     * @param inclusiveNamespaces
     * @return the c14n bytes
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/CanonicalizerSpi.java
    public abstract byte[] engineCanonicalizeXPathNodeSet(Set<Node> xpathNodeSet)

    /**
     * C14n a nodeset
     *
     * @param xpathNodeSet
     * @return the c14n bytes
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/CanonicalizerSpi.java
    public abstract boolean engineGetIncludeComments();

    /**
     * Returns true if comments are included
     * @return true if comments are included
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/CanonicalizerSpi.java
    public abstract String engineGetURI();

    /**
     * Returns the URI of this engine.
     * @return the URI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/CanonicalizerSpi.java
    public byte[] engineCanonicalizeXPathNodeSet(NodeList xpathNodeSet, String inclusiveNamespaces)

    /**
     * Method engineCanonicalizeXPathNodeSet
     *
     * @param xpathNodeSet
     * @param inclusiveNamespaces
     * @return the c14n bytes
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/CanonicalizerSpi.java
    public byte[] engineCanonicalizeXPathNodeSet(NodeList xpathNodeSet)

    /**
     * Method engineCanonicalizeXPathNodeSet
     *
     * @param xpathNodeSet
     * @return the c14n bytes
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/CanonicalizerSpi.java
    public byte[] engineCanonicalize(byte[] inputBytes)

    /**
     * Method canonicalize
     *
     * @param inputBytes
     * @return the c14n bytes.
     *
     * @throws CanonicalizationException
     * @throws java.io.IOException
     * @throws javax.xml.parsers.ParserConfigurationException
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/CanonicalizerSpi.java
    protected boolean reset = false;

    /** Reset the writer after a c14n */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/CanonicalizerSpi.java
public abstract class CanonicalizerSpi {

/**
 * Base class which all Canonicalization algorithms extend.
 *
 * @author Christian Geuer-Pollmann
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/CanonicalizerSpi.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/CanonicalizerSpi.java
    public abstract void setWriter(OutputStream os);

    /**
     * Sets the writer where the canonicalization ends. ByteArrayOutputStream if
     * none is set.
     * @param os
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/CanonicalizerSpi.java
    public abstract byte[] engineCanonicalizeSubTree(Node rootNode, String inclusiveNamespaces)

    /**
     * C14n a node tree.
     *
     * @param rootNode
     * @param inclusiveNamespaces
     * @return the c14n bytes
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/CanonicalizerSpi.java
    public abstract byte[] engineCanonicalizeSubTree(Node rootNode)

    /**
     * C14n a node tree.
     *
     * @param rootNode
     * @return the c14n bytes
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/CanonicalizerSpi.java
    public abstract byte[] engineCanonicalizeXPathNodeSet(
        Set<Node> xpathNodeSet, String inclusiveNamespaces
    ) throws CanonicalizationException;

    /**
     * C14n a nodeset
     *
     * @param xpathNodeSet
     * @param inclusiveNamespaces
     * @return the c14n bytes
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/CanonicalizerSpi.java
    public abstract byte[] engineCanonicalizeXPathNodeSet(Set<Node> xpathNodeSet)

    /**
     * C14n a nodeset
     *
     * @param xpathNodeSet
     * @return the c14n bytes
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/CanonicalizerSpi.java
    public abstract boolean engineGetIncludeComments();

    /**
     * Returns true if comments are included
     * @return true if comments are included
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/CanonicalizerSpi.java
    public abstract String engineGetURI();

    /**
     * Returns the URI of this engine.
     * @return the URI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/CanonicalizerSpi.java
    public byte[] engineCanonicalizeXPathNodeSet(NodeList xpathNodeSet, String inclusiveNamespaces)

    /**
     * Method engineCanonicalizeXPathNodeSet
     *
     * @param xpathNodeSet
     * @param inclusiveNamespaces
     * @return the c14n bytes
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/CanonicalizerSpi.java
    public byte[] engineCanonicalizeXPathNodeSet(NodeList xpathNodeSet)

    /**
     * Method engineCanonicalizeXPathNodeSet
     *
     * @param xpathNodeSet
     * @return the c14n bytes
     * @throws CanonicalizationException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/CanonicalizerSpi.java
    public byte[] engineCanonicalize(byte[] inputBytes)

    /**
     * Method canonicalize
     *
     * @param inputBytes
     * @return the c14n bytes.
     *
     * @throws CanonicalizationException
     * @throws java.io.IOException
     * @throws javax.xml.parsers.ParserConfigurationException
     * @throws org.xml.sax.SAXException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/CanonicalizerSpi.java
    protected boolean reset = false;

    /** Reset the writer after a c14n */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/CanonicalizerSpi.java
public abstract class CanonicalizerSpi {

/**
 * Base class which all Canonicalization algorithms extend.
 *
 * @author Christian Geuer-Pollmann
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/CanonicalizerSpi.java
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
