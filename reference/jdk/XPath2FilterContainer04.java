_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    public final String getBaseNamespace() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    public final String getBaseLocalName() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    public Node getXPathFilterTextNode() {

    /**
     * Returns the first Text node which contains information from the XPath 2
     * Filter String. We must use this stupid hook to enable the here() function
     * to work.
     *
     * $todo$ I dunno whether this crashes: <XPath> here()<!-- comment -->/ds:Signature[1]</XPath>
     * @return the first Text node which contains information from the XPath 2 Filter String
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    public String getXPathFilterStr() {

    /**
     * Returns the XPath 2 Filter String
     *
     * @return the XPath 2 Filter String
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    public boolean isUnion() {

    /**
     * Returns <code>true</code> if the <code>Filter</code> attribute has value "union".
     *
     * @return <code>true</code> if the <code>Filter</code> attribute has value "union".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    public boolean isSubtract() {

    /**
     * Returns <code>true</code> if the <code>Filter</code> attribute has value "subtract".
     *
     * @return <code>true</code> if the <code>Filter</code> attribute has value "subtract".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    public boolean isIntersect() {

    /**
     * Returns <code>true</code> if the <code>Filter</code> attribute has value "intersect".
     *
     * @return <code>true</code> if the <code>Filter</code> attribute has value "intersect".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    public static XPath2FilterContainer04 newInstance(
        Element element, String BaseURI
    ) throws XMLSecurityException {

    /**
     * Creates a XPath2FilterContainer04 from an existing Element; needed for verification.
     *
     * @param element
     * @param BaseURI
     * @return the instance
     *
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    public static XPath2FilterContainer04 newInstanceUnion(
        Document doc, String xpath2filter
    ) {

    /**
     * Creates a new XPath2FilterContainer04 with the filter type "union".
     *
     * @param doc
     * @param xpath2filter
     * @return the instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    public static XPath2FilterContainer04 newInstanceSubtract(
        Document doc, String xpath2filter
    ) {

    /**
     * Creates a new XPath2FilterContainer04 with the filter type "subtract".
     *
     * @param doc
     * @param xpath2filter
     * @return the instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    public static XPath2FilterContainer04 newInstanceIntersect(
        Document doc, String xpath2filter
    ) {

    /**
     * Creates a new XPath2FilterContainer04 with the filter type "intersect".
     *
     * @param doc
     * @param xpath2filter
     * @return the instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    private XPath2FilterContainer04(Element element, String BaseURI)

    /**
     * Constructor XPath2FilterContainer04
     *
     * @param element
     * @param BaseURI
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    private XPath2FilterContainer04(Document doc, String xpath2filter, String filterType) {

    /**
     * Constructor XPath2FilterContainer04
     *
     * @param doc
     * @param xpath2filter
     * @param filterType
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    private XPath2FilterContainer04() {

    /**
     * Constructor XPath2FilterContainer04
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    public static final String XPathFilter2NS =

    /** Field XPathFiler2NS */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    public static final String _TAG_XPATH2 = "XPath";

    /** Field _TAG_XPATH2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    private static final String _ATT_FILTER_VALUE_UNION = "union";

    /** Field _ATT_FILTER_VALUE_UNION */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    private static final String _ATT_FILTER_VALUE_SUBTRACT = "subtract";

    /** Field _ATT_FILTER_VALUE_SUBTRACT */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    private static final String _ATT_FILTER_VALUE_INTERSECT = "intersect";

    /** Field _ATT_FILTER_VALUE_INTERSECT */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    private static final String _ATT_FILTER = "Filter";

    /** Field _ATT_FILTER */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
public class XPath2FilterContainer04 extends ElementProxy implements TransformParam {

/**
 * Implements the parameters for the <A
 * HREF="http://www.w3.org/TR/xmldsig-filter2/">XPath Filter v2.0</A>.
 *
 * @author $Author: coheigea $
 * @see <A HREF="http://www.w3.org/TR/xmldsig-filter2/">XPath Filter v2.0 (TR)</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    public final String getBaseNamespace() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    public final String getBaseLocalName() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    public Node getXPathFilterTextNode() {

    /**
     * Returns the first Text node which contains information from the XPath 2
     * Filter String. We must use this stupid hook to enable the here() function
     * to work.
     *
     * $todo$ I dunno whether this crashes: <XPath> here()<!-- comment -->/ds:Signature[1]</XPath>
     * @return the first Text node which contains information from the XPath 2 Filter String
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    public String getXPathFilterStr() {

    /**
     * Returns the XPath 2 Filter String
     *
     * @return the XPath 2 Filter String
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    public boolean isUnion() {

    /**
     * Returns <code>true</code> if the <code>Filter</code> attribute has value "union".
     *
     * @return <code>true</code> if the <code>Filter</code> attribute has value "union".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    public boolean isSubtract() {

    /**
     * Returns <code>true</code> if the <code>Filter</code> attribute has value "subtract".
     *
     * @return <code>true</code> if the <code>Filter</code> attribute has value "subtract".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    public boolean isIntersect() {

    /**
     * Returns <code>true</code> if the <code>Filter</code> attribute has value "intersect".
     *
     * @return <code>true</code> if the <code>Filter</code> attribute has value "intersect".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    public static XPath2FilterContainer04 newInstance(
        Element element, String BaseURI
    ) throws XMLSecurityException {

    /**
     * Creates a XPath2FilterContainer04 from an existing Element; needed for verification.
     *
     * @param element
     * @param BaseURI
     * @return the instance
     *
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    public static XPath2FilterContainer04 newInstanceUnion(
        Document doc, String xpath2filter
    ) {

    /**
     * Creates a new XPath2FilterContainer04 with the filter type "union".
     *
     * @param doc
     * @param xpath2filter
     * @return the instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    public static XPath2FilterContainer04 newInstanceSubtract(
        Document doc, String xpath2filter
    ) {

    /**
     * Creates a new XPath2FilterContainer04 with the filter type "subtract".
     *
     * @param doc
     * @param xpath2filter
     * @return the instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    public static XPath2FilterContainer04 newInstanceIntersect(
        Document doc, String xpath2filter
    ) {

    /**
     * Creates a new XPath2FilterContainer04 with the filter type "intersect".
     *
     * @param doc
     * @param xpath2filter
     * @return the instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    private XPath2FilterContainer04(Element element, String BaseURI)

    /**
     * Constructor XPath2FilterContainer04
     *
     * @param element
     * @param BaseURI
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    private XPath2FilterContainer04(Document doc, String xpath2filter, String filterType) {

    /**
     * Constructor XPath2FilterContainer04
     *
     * @param doc
     * @param xpath2filter
     * @param filterType
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    private XPath2FilterContainer04() {

    /**
     * Constructor XPath2FilterContainer04
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    public static final String XPathFilter2NS =

    /** Field XPathFiler2NS */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    public static final String _TAG_XPATH2 = "XPath";

    /** Field _TAG_XPATH2 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    private static final String _ATT_FILTER_VALUE_UNION = "union";

    /** Field _ATT_FILTER_VALUE_UNION */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    private static final String _ATT_FILTER_VALUE_SUBTRACT = "subtract";

    /** Field _ATT_FILTER_VALUE_SUBTRACT */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    private static final String _ATT_FILTER_VALUE_INTERSECT = "intersect";

    /** Field _ATT_FILTER_VALUE_INTERSECT */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
    private static final String _ATT_FILTER = "Filter";

    /** Field _ATT_FILTER */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
public class XPath2FilterContainer04 extends ElementProxy implements TransformParam {

/**
 * Implements the parameters for the <A
 * HREF="http://www.w3.org/TR/xmldsig-filter2/">XPath Filter v2.0</A>.
 *
 * @author $Author: coheigea $
 * @see <A HREF="http://www.w3.org/TR/xmldsig-filter2/">XPath Filter v2.0 (TR)</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPath2FilterContainer04.java
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
