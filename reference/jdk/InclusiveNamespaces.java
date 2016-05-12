_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/InclusiveNamespaces.java
    public String getBaseLocalName() {

    /**
     * Method getBaseLocalName
     *
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/InclusiveNamespaces.java
    public String getBaseNamespace() {

    /**
     * Method getBaseNamespace
     *
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/InclusiveNamespaces.java
    public static SortedSet<String> prefixStr2Set(String inclusiveNamespaces) {

    /**
     * Decodes the <code>inclusiveNamespaces</code> String and returns all
     * selected namespace prefixes as a Set. The <code>#default</code>
     * namespace token is represented as an empty namespace prefix
     * (<code>"xmlns"</code>).
     * <BR/>
     * The String <code>inclusiveNamespaces=" xenc    ds #default"</code>
     * is returned as a Set containing the following Strings:
     * <UL>
     * <LI><code>xmlns</code></LI>
     * <LI><code>xenc</code></LI>
     * <LI><code>ds</code></LI>
     * </UL>
     *
     * @param inclusiveNamespaces
     * @return A set to string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/InclusiveNamespaces.java
    public String getInclusiveNamespaces() {

    /**
     * Method getInclusiveNamespaces
     *
     * @return The Inclusive Namespace string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/InclusiveNamespaces.java
    public InclusiveNamespaces(Element element, String BaseURI)

    /**
     * Constructor InclusiveNamespaces
     *
     * @param element
     * @param BaseURI
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/InclusiveNamespaces.java
    public InclusiveNamespaces(Document doc, Set<String> prefixes) {

    /**
     * Constructor InclusiveNamespaces
     *
     * @param doc
     * @param prefixes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/InclusiveNamespaces.java
    public InclusiveNamespaces(Document doc, String prefixList) {

    /**
     * Constructor XPathContainer
     *
     * @param doc
     * @param prefixList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/InclusiveNamespaces.java
    public static final String ExclusiveCanonicalizationNamespace =

    /** Field ExclusiveCanonicalizationNamespace */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/InclusiveNamespaces.java
    public static final String _ATT_EC_PREFIXLIST = "PrefixList";

    /** Field _ATT_EC_PREFIXLIST */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/InclusiveNamespaces.java
    public static final String _TAG_EC_INCLUSIVENAMESPACES =

    /** Field _TAG_EC_INCLUSIVENAMESPACES */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/InclusiveNamespaces.java
public class InclusiveNamespaces extends ElementProxy implements TransformParam {

/**
 * This Object serves as Content for the ds:Transforms for exclusive
 * Canonicalization.
 * <BR />
 * It implements the {@link Element} interface
 * and can be used directly in a DOM tree.
 *
 * @author Christian Geuer-Pollmann
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/InclusiveNamespaces.java
package com.sun.org.apache.xml.internal.security.transforms.params;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/InclusiveNamespaces.java
    public String getBaseLocalName() {

    /**
     * Method getBaseLocalName
     *
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/InclusiveNamespaces.java
    public String getBaseNamespace() {

    /**
     * Method getBaseNamespace
     *
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/InclusiveNamespaces.java
    public static SortedSet<String> prefixStr2Set(String inclusiveNamespaces) {

    /**
     * Decodes the <code>inclusiveNamespaces</code> String and returns all
     * selected namespace prefixes as a Set. The <code>#default</code>
     * namespace token is represented as an empty namespace prefix
     * (<code>"xmlns"</code>).
     * <BR/>
     * The String <code>inclusiveNamespaces=" xenc    ds #default"</code>
     * is returned as a Set containing the following Strings:
     * <UL>
     * <LI><code>xmlns</code></LI>
     * <LI><code>xenc</code></LI>
     * <LI><code>ds</code></LI>
     * </UL>
     *
     * @param inclusiveNamespaces
     * @return A set to string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/InclusiveNamespaces.java
    public String getInclusiveNamespaces() {

    /**
     * Method getInclusiveNamespaces
     *
     * @return The Inclusive Namespace string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/InclusiveNamespaces.java
    public InclusiveNamespaces(Element element, String BaseURI)

    /**
     * Constructor InclusiveNamespaces
     *
     * @param element
     * @param BaseURI
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/InclusiveNamespaces.java
    public InclusiveNamespaces(Document doc, Set<String> prefixes) {

    /**
     * Constructor InclusiveNamespaces
     *
     * @param doc
     * @param prefixes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/InclusiveNamespaces.java
    public InclusiveNamespaces(Document doc, String prefixList) {

    /**
     * Constructor XPathContainer
     *
     * @param doc
     * @param prefixList
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/InclusiveNamespaces.java
    public static final String ExclusiveCanonicalizationNamespace =

    /** Field ExclusiveCanonicalizationNamespace */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/InclusiveNamespaces.java
    public static final String _ATT_EC_PREFIXLIST = "PrefixList";

    /** Field _ATT_EC_PREFIXLIST */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/InclusiveNamespaces.java
    public static final String _TAG_EC_INCLUSIVENAMESPACES =

    /** Field _TAG_EC_INCLUSIVENAMESPACES */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/InclusiveNamespaces.java
public class InclusiveNamespaces extends ElementProxy implements TransformParam {

/**
 * This Object serves as Content for the ds:Transforms for exclusive
 * Canonicalization.
 * <BR />
 * It implements the {@link Element} interface
 * and can be used directly in a DOM tree.
 *
 * @author Christian Geuer-Pollmann
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/InclusiveNamespaces.java
package com.sun.org.apache.xml.internal.security.transforms.params;

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
