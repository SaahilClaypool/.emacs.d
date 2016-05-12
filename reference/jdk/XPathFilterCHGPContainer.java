_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public final String getBaseNamespace() {

    /**
     * Method getBaseNamespace
     *
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public final String getBaseLocalName() {

    /**
     * Method getBaseLocalName
     *
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public Node getHereContextNodeExclude() {

    /**
     * Method getHereContextNodeExclude
     *
     * @return the string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public Node getHereContextNodeExcludeButSearch() {

    /**
     * Method getHereContextNodeExcludeButSearch
     *
     * @return the string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public Node getHereContextNodeIncludeButSearch() {

    /**
     * Method getHereContextNodeIncludeButSearch
     *
     * @return the string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    private Node getHereContextNode(String type) {

    /**
     * Returns the first Text node which contains information from the XPath
     * Filter String. We must use this stupid hook to enable the here() function
     * to work.
     *
     * $todo$ I dunno whether this crashes: <XPath> he<!-- comment -->re()/ds:Signature[1]</XPath>
     * @param type
     * @return the first Text node which contains information from the XPath 2 Filter String
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public boolean getIncludeSlashPolicy() {

    /**
     * Method getIncludeSlashPolicy
     *
     * @return the string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public String getExclude() {

    /**
     * Method getExclude
     *
     * @return the string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public String getExcludeButSearch() {

    /**
     * Method getExcludeButSearch
     *
     * @return the string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public String getIncludeButSearch() {

    /**
     * Method getIncludeButSearch
     *
     * @return the string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    private String getXStr(String type) {

    /**
     * Method getXStr
     *
     * @param type
     * @return The Xstr
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public static XPathFilterCHGPContainer getInstance(
        Element element, String BaseURI
    ) throws XMLSecurityException {

    /**
     * Creates a XPathFilterCHGPContainer from an existing Element; needed for verification.
     *
     * @param element
     * @param BaseURI
     *
     * @throws XMLSecurityException
     * @return the created object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public static XPathFilterCHGPContainer getInstance(
        Document doc, boolean includeSlashPolicy, String includeButSearch,
        String excludeButSearch, String exclude
    ) {

    /**
     * Creates a new XPathFilterCHGPContainer; needed for generation.
     *
     * @param doc
     * @param includeSlashPolicy
     * @param includeButSearch
     * @param excludeButSearch
     * @param exclude
     * @return the created object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    private XPathFilterCHGPContainer(Element element, String BaseURI)

    /**
     * Constructor XPathFilterCHGPContainer
     *
     * @param element
     * @param BaseURI
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    static String indentXPathText(String xp) {

    /**
     * Method indentXPathText
     *
     * @param xp
     * @return the string with enters
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    private XPathFilterCHGPContainer(
        Document doc, boolean includeSlashPolicy, String includeButSearch,
        String excludeButSearch, String exclude
    ) {

    /**
     * Constructor XPathFilterCHGPContainer
     *
     * @param doc
     * @param includeSlashPolicy
     * @param includeButSearch
     * @param excludeButSearch
     * @param exclude
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    private XPathFilterCHGPContainer() {

    /**
     * Constructor XPathFilterCHGPContainer
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public static final boolean ExcludeSlash = false;

    /** Field ExcludeSlash           */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public static final boolean IncludeSlash = true;

    /** Field IncludeSlash           */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public static final String _ATT_INCLUDESLASH = "IncludeSlashPolicy";

    /** Field _ATT_INCLUDESLASH */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public static final String _TAG_XPATHCHGP = "XPathAlternative";

    /** Field _TAG_XPATHCHGP */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    private static final String _TAG_EXCLUDE = "Exclude";

    /** Field _ATT_FILTER_VALUE_UNION */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    private static final String _TAG_EXCLUDE_BUT_SEARCH = "ExcludeButSearch";

    /** Field _ATT_FILTER_VALUE_SUBTRACT */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    private static final String _TAG_INCLUDE_BUT_SEARCH = "IncludeButSearch";

    /** Field _ATT_FILTER_VALUE_INTERSECT */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
public class XPathFilterCHGPContainer extends ElementProxy implements TransformParam {

/**
 * Implements the parameters for a custom Transform which has a better performance
 * than the xfilter2.
 *
 * @author $Author: coheigea $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public final String getBaseNamespace() {

    /**
     * Method getBaseNamespace
     *
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public final String getBaseLocalName() {

    /**
     * Method getBaseLocalName
     *
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public Node getHereContextNodeExclude() {

    /**
     * Method getHereContextNodeExclude
     *
     * @return the string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public Node getHereContextNodeExcludeButSearch() {

    /**
     * Method getHereContextNodeExcludeButSearch
     *
     * @return the string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public Node getHereContextNodeIncludeButSearch() {

    /**
     * Method getHereContextNodeIncludeButSearch
     *
     * @return the string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    private Node getHereContextNode(String type) {

    /**
     * Returns the first Text node which contains information from the XPath
     * Filter String. We must use this stupid hook to enable the here() function
     * to work.
     *
     * $todo$ I dunno whether this crashes: <XPath> he<!-- comment -->re()/ds:Signature[1]</XPath>
     * @param type
     * @return the first Text node which contains information from the XPath 2 Filter String
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public boolean getIncludeSlashPolicy() {

    /**
     * Method getIncludeSlashPolicy
     *
     * @return the string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public String getExclude() {

    /**
     * Method getExclude
     *
     * @return the string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public String getExcludeButSearch() {

    /**
     * Method getExcludeButSearch
     *
     * @return the string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public String getIncludeButSearch() {

    /**
     * Method getIncludeButSearch
     *
     * @return the string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    private String getXStr(String type) {

    /**
     * Method getXStr
     *
     * @param type
     * @return The Xstr
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public static XPathFilterCHGPContainer getInstance(
        Element element, String BaseURI
    ) throws XMLSecurityException {

    /**
     * Creates a XPathFilterCHGPContainer from an existing Element; needed for verification.
     *
     * @param element
     * @param BaseURI
     *
     * @throws XMLSecurityException
     * @return the created object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public static XPathFilterCHGPContainer getInstance(
        Document doc, boolean includeSlashPolicy, String includeButSearch,
        String excludeButSearch, String exclude
    ) {

    /**
     * Creates a new XPathFilterCHGPContainer; needed for generation.
     *
     * @param doc
     * @param includeSlashPolicy
     * @param includeButSearch
     * @param excludeButSearch
     * @param exclude
     * @return the created object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    private XPathFilterCHGPContainer(Element element, String BaseURI)

    /**
     * Constructor XPathFilterCHGPContainer
     *
     * @param element
     * @param BaseURI
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    static String indentXPathText(String xp) {

    /**
     * Method indentXPathText
     *
     * @param xp
     * @return the string with enters
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    private XPathFilterCHGPContainer(
        Document doc, boolean includeSlashPolicy, String includeButSearch,
        String excludeButSearch, String exclude
    ) {

    /**
     * Constructor XPathFilterCHGPContainer
     *
     * @param doc
     * @param includeSlashPolicy
     * @param includeButSearch
     * @param excludeButSearch
     * @param exclude
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    private XPathFilterCHGPContainer() {

    /**
     * Constructor XPathFilterCHGPContainer
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public static final boolean ExcludeSlash = false;

    /** Field ExcludeSlash           */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public static final boolean IncludeSlash = true;

    /** Field IncludeSlash           */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public static final String _ATT_INCLUDESLASH = "IncludeSlashPolicy";

    /** Field _ATT_INCLUDESLASH */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    public static final String _TAG_XPATHCHGP = "XPathAlternative";

    /** Field _TAG_XPATHCHGP */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    private static final String _TAG_EXCLUDE = "Exclude";

    /** Field _ATT_FILTER_VALUE_UNION */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    private static final String _TAG_EXCLUDE_BUT_SEARCH = "ExcludeButSearch";

    /** Field _ATT_FILTER_VALUE_SUBTRACT */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
    private static final String _TAG_INCLUDE_BUT_SEARCH = "IncludeButSearch";

    /** Field _ATT_FILTER_VALUE_INTERSECT */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
public class XPathFilterCHGPContainer extends ElementProxy implements TransformParam {

/**
 * Implements the parameters for a custom Transform which has a better performance
 * than the xfilter2.
 *
 * @author $Author: coheigea $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/transforms/params/XPathFilterCHGPContainer.java
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
