_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XPathAPI.java
    void clear();

    /**
     * Clear any context information from this object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XPathAPI.java
    boolean evaluate(Node contextNode, Node xpathnode, String str, Node namespaceNode)

    /**
     * Evaluate an XPath string and return true if the output is to be included or not.
     *  @param contextNode The node to start searching from.
     *  @param xpathnode The XPath node
     *  @param str The XPath expression
     *  @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XPathAPI.java
    NodeList selectNodeList(
        Node contextNode, Node xpathnode, String str, Node namespaceNode
    ) throws TransformerException;

    /**
     *  Use an XPath string to select a nodelist.
     *  XPath namespace prefixes are resolved from the namespaceNode.
     *
     *  @param contextNode The node to start searching from.
     *  @param xpathnode
     *  @param str
     *  @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces.
     *  @return A NodeIterator, should never be null.
     *
     * @throws TransformerException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XPathAPI.java
public interface XPathAPI {

/**
 * An interface to abstract XPath evaluation
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XPathAPI.java
package com.sun.org.apache.xml.internal.security.utils;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathAPI.java
  public static XObject eval(
          Node contextNode, String str, PrefixResolver prefixResolver)

  /**
   *   Evaluate XPath string to an XObject.
   *   XPath namespace prefixes are resolved from the namespaceNode.
   *   The implementation of this is a little slow, since it creates
   *   a number of objects each time it is called.  This could be optimized
   *   to keep the same objects around, but then thread-safety issues would arise.
   *
   *   @param contextNode The node to start searching from.
   *   @param str A valid XPath string.
   *   @param prefixResolver Will be called if the parser encounters namespace
   *                         prefixes, to resolve the prefixes to URLs.
   *   @return An XObject, which can be used to obtain a string, number, nodelist, etc, should never be null.
   *   @see com.sun.org.apache.xpath.internal.objects.XObject
   *   @see com.sun.org.apache.xpath.internal.objects.XNull
   *   @see com.sun.org.apache.xpath.internal.objects.XBoolean
   *   @see com.sun.org.apache.xpath.internal.objects.XNumber
   *   @see com.sun.org.apache.xpath.internal.objects.XString
   *   @see com.sun.org.apache.xpath.internal.objects.XRTreeFrag
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathAPI.java
  public static XObject eval(Node contextNode, String str, Node namespaceNode)

  /**
   *  Evaluate XPath string to an XObject.
   *  XPath namespace prefixes are resolved from the namespaceNode.
   *  The implementation of this is a little slow, since it creates
   *  a number of objects each time it is called.  This could be optimized
   *  to keep the same objects around, but then thread-safety issues would arise.
   *
   *  @param contextNode The node to start searching from.
   *  @param str A valid XPath string.
   *  @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces.
   *  @return An XObject, which can be used to obtain a string, number, nodelist, etc, should never be null.
   *  @see com.sun.org.apache.xpath.internal.objects.XObject
   *  @see com.sun.org.apache.xpath.internal.objects.XNull
   *  @see com.sun.org.apache.xpath.internal.objects.XBoolean
   *  @see com.sun.org.apache.xpath.internal.objects.XNumber
   *  @see com.sun.org.apache.xpath.internal.objects.XString
   *  @see com.sun.org.apache.xpath.internal.objects.XRTreeFrag
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathAPI.java
  public static XObject eval(Node contextNode, String str)

  /**
   *  Evaluate XPath string to an XObject.  Using this method,
   *  XPath namespace prefixes will be resolved from the namespaceNode.
   *  @param contextNode The node to start searching from.
   *  @param str A valid XPath string.
   *  @return An XObject, which can be used to obtain a string, number, nodelist, etc, should never be null.
   *  @see com.sun.org.apache.xpath.internal.objects.XObject
   *  @see com.sun.org.apache.xpath.internal.objects.XNull
   *  @see com.sun.org.apache.xpath.internal.objects.XBoolean
   *  @see com.sun.org.apache.xpath.internal.objects.XNumber
   *  @see com.sun.org.apache.xpath.internal.objects.XString
   *  @see com.sun.org.apache.xpath.internal.objects.XRTreeFrag
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathAPI.java
  public static NodeList selectNodeList(
          Node contextNode, String str, Node namespaceNode)

  /**
   *  Use an XPath string to select a nodelist.
   *  XPath namespace prefixes are resolved from the namespaceNode.
   *
   *  @param contextNode The node to start searching from.
   *  @param str A valid XPath string.
   *  @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces.
   *  @return A NodeIterator, should never be null.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathAPI.java
  public static NodeList selectNodeList(Node contextNode, String str)

  /**
   *  Use an XPath string to select a nodelist.
   *  XPath namespace prefixes are resolved from the contextNode.
   *
   *  @param contextNode The node to start searching from.
   *  @param str A valid XPath string.
   *  @return A NodeIterator, should never be null.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathAPI.java
  public static NodeIterator selectNodeIterator(
          Node contextNode, String str, Node namespaceNode)

  /**
   *  Use an XPath string to select a nodelist.
   *  XPath namespace prefixes are resolved from the namespaceNode.
   *
   *  @param contextNode The node to start searching from.
   *  @param str A valid XPath string.
   *  @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces.
   *  @return A NodeIterator, should never be null.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathAPI.java
  public static NodeIterator selectNodeIterator(Node contextNode, String str)

  /**
   *  Use an XPath string to select a nodelist.
   *  XPath namespace prefixes are resolved from the contextNode.
   *
   *  @param contextNode The node to start searching from.
   *  @param str A valid XPath string.
   *  @return A NodeIterator, should never be null.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathAPI.java
  public static Node selectSingleNode(
          Node contextNode, String str, Node namespaceNode)

  /**
   * Use an XPath string to select a single node.
   * XPath namespace prefixes are resolved from the namespaceNode.
   *
   * @param contextNode The node to start searching from.
   * @param str A valid XPath string.
   * @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces.
   * @return The first node found that matches the XPath, or null.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathAPI.java
  public static Node selectSingleNode(Node contextNode, String str)

  /**
   * Use an XPath string to select a single node. XPath namespace
   * prefixes are resolved from the context node, which may not
   * be what you want (see the next method).
   *
   * @param contextNode The node to start searching from.
   * @param str A valid XPath string.
   * @return The first node found that matches the XPath, or null.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathAPI.java
public class XPathAPI

/**
 * The methods in this class are convenience methods into the
 * low-level XPath API.
 * These functions tend to be a little slow, since a number of objects must be
 * created for each evaluation.  A faster way is to precompile the
 * XPaths using the low-level API, and then just use the XPaths
 * over and over.
 *
 * NOTE: In particular, each call to this method will create a new
 * XPathContext, a new DTMManager... and thus a new DTM. That's very
 * safe, since it guarantees that you're always processing against a
 * fully up-to-date view of your document. But it's also portentially
 * very expensive, since you're rebuilding the DTM every time. You should
 * consider using an instance of CachedXPathAPI rather than these static
 * methods.
 *
 * @see <a href="http://www.w3.org/TR/xpath">XPath Specification</a>
 * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XPathAPI.java
    void clear();

    /**
     * Clear any context information from this object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XPathAPI.java
    boolean evaluate(Node contextNode, Node xpathnode, String str, Node namespaceNode)

    /**
     * Evaluate an XPath string and return true if the output is to be included or not.
     *  @param contextNode The node to start searching from.
     *  @param xpathnode The XPath node
     *  @param str The XPath expression
     *  @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XPathAPI.java
    NodeList selectNodeList(
        Node contextNode, Node xpathnode, String str, Node namespaceNode
    ) throws TransformerException;

    /**
     *  Use an XPath string to select a nodelist.
     *  XPath namespace prefixes are resolved from the namespaceNode.
     *
     *  @param contextNode The node to start searching from.
     *  @param xpathnode
     *  @param str
     *  @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces.
     *  @return A NodeIterator, should never be null.
     *
     * @throws TransformerException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XPathAPI.java
public interface XPathAPI {

/**
 * An interface to abstract XPath evaluation
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/XPathAPI.java
package com.sun.org.apache.xml.internal.security.utils;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathAPI.java
  public static XObject eval(
          Node contextNode, String str, PrefixResolver prefixResolver)

  /**
   *   Evaluate XPath string to an XObject.
   *   XPath namespace prefixes are resolved from the namespaceNode.
   *   The implementation of this is a little slow, since it creates
   *   a number of objects each time it is called.  This could be optimized
   *   to keep the same objects around, but then thread-safety issues would arise.
   *
   *   @param contextNode The node to start searching from.
   *   @param str A valid XPath string.
   *   @param prefixResolver Will be called if the parser encounters namespace
   *                         prefixes, to resolve the prefixes to URLs.
   *   @return An XObject, which can be used to obtain a string, number, nodelist, etc, should never be null.
   *   @see com.sun.org.apache.xpath.internal.objects.XObject
   *   @see com.sun.org.apache.xpath.internal.objects.XNull
   *   @see com.sun.org.apache.xpath.internal.objects.XBoolean
   *   @see com.sun.org.apache.xpath.internal.objects.XNumber
   *   @see com.sun.org.apache.xpath.internal.objects.XString
   *   @see com.sun.org.apache.xpath.internal.objects.XRTreeFrag
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathAPI.java
  public static XObject eval(Node contextNode, String str, Node namespaceNode)

  /**
   *  Evaluate XPath string to an XObject.
   *  XPath namespace prefixes are resolved from the namespaceNode.
   *  The implementation of this is a little slow, since it creates
   *  a number of objects each time it is called.  This could be optimized
   *  to keep the same objects around, but then thread-safety issues would arise.
   *
   *  @param contextNode The node to start searching from.
   *  @param str A valid XPath string.
   *  @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces.
   *  @return An XObject, which can be used to obtain a string, number, nodelist, etc, should never be null.
   *  @see com.sun.org.apache.xpath.internal.objects.XObject
   *  @see com.sun.org.apache.xpath.internal.objects.XNull
   *  @see com.sun.org.apache.xpath.internal.objects.XBoolean
   *  @see com.sun.org.apache.xpath.internal.objects.XNumber
   *  @see com.sun.org.apache.xpath.internal.objects.XString
   *  @see com.sun.org.apache.xpath.internal.objects.XRTreeFrag
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathAPI.java
  public static XObject eval(Node contextNode, String str)

  /**
   *  Evaluate XPath string to an XObject.  Using this method,
   *  XPath namespace prefixes will be resolved from the namespaceNode.
   *  @param contextNode The node to start searching from.
   *  @param str A valid XPath string.
   *  @return An XObject, which can be used to obtain a string, number, nodelist, etc, should never be null.
   *  @see com.sun.org.apache.xpath.internal.objects.XObject
   *  @see com.sun.org.apache.xpath.internal.objects.XNull
   *  @see com.sun.org.apache.xpath.internal.objects.XBoolean
   *  @see com.sun.org.apache.xpath.internal.objects.XNumber
   *  @see com.sun.org.apache.xpath.internal.objects.XString
   *  @see com.sun.org.apache.xpath.internal.objects.XRTreeFrag
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathAPI.java
  public static NodeList selectNodeList(
          Node contextNode, String str, Node namespaceNode)

  /**
   *  Use an XPath string to select a nodelist.
   *  XPath namespace prefixes are resolved from the namespaceNode.
   *
   *  @param contextNode The node to start searching from.
   *  @param str A valid XPath string.
   *  @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces.
   *  @return A NodeIterator, should never be null.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathAPI.java
  public static NodeList selectNodeList(Node contextNode, String str)

  /**
   *  Use an XPath string to select a nodelist.
   *  XPath namespace prefixes are resolved from the contextNode.
   *
   *  @param contextNode The node to start searching from.
   *  @param str A valid XPath string.
   *  @return A NodeIterator, should never be null.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathAPI.java
  public static NodeIterator selectNodeIterator(
          Node contextNode, String str, Node namespaceNode)

  /**
   *  Use an XPath string to select a nodelist.
   *  XPath namespace prefixes are resolved from the namespaceNode.
   *
   *  @param contextNode The node to start searching from.
   *  @param str A valid XPath string.
   *  @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces.
   *  @return A NodeIterator, should never be null.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathAPI.java
  public static NodeIterator selectNodeIterator(Node contextNode, String str)

  /**
   *  Use an XPath string to select a nodelist.
   *  XPath namespace prefixes are resolved from the contextNode.
   *
   *  @param contextNode The node to start searching from.
   *  @param str A valid XPath string.
   *  @return A NodeIterator, should never be null.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathAPI.java
  public static Node selectSingleNode(
          Node contextNode, String str, Node namespaceNode)

  /**
   * Use an XPath string to select a single node.
   * XPath namespace prefixes are resolved from the namespaceNode.
   *
   * @param contextNode The node to start searching from.
   * @param str A valid XPath string.
   * @param namespaceNode The node from which prefixes in the XPath will be resolved to namespaces.
   * @return The first node found that matches the XPath, or null.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathAPI.java
  public static Node selectSingleNode(Node contextNode, String str)

  /**
   * Use an XPath string to select a single node. XPath namespace
   * prefixes are resolved from the context node, which may not
   * be what you want (see the next method).
   *
   * @param contextNode The node to start searching from.
   * @param str A valid XPath string.
   * @return The first node found that matches the XPath, or null.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathAPI.java
public class XPathAPI

/**
 * The methods in this class are convenience methods into the
 * low-level XPath API.
 * These functions tend to be a little slow, since a number of objects must be
 * created for each evaluation.  A faster way is to precompile the
 * XPaths using the low-level API, and then just use the XPaths
 * over and over.
 *
 * NOTE: In particular, each call to this method will create a new
 * XPathContext, a new DTMManager... and thus a new DTM. That's very
 * safe, since it guarantees that you're always processing against a
 * fully up-to-date view of your document. But it's also portentially
 * very expensive, since you're rebuilding the DTM every time. You should
 * consider using an instance of CachedXPathAPI rather than these static
 * methods.
 *
 * @see <a href="http://www.w3.org/TR/xpath">XPath Specification</a>
 * */
