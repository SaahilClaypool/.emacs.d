_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/NodeFilter.java
    int isNodeIncludeDO(Node n, int level);

    /**
     * Tells if a node must be output in a c14n.
     * The caller must assured that this method is always call
     * in document order. The implementations can use this
     * restriction to optimize the transformation.
     * @param n
     * @param level the relative level in the tree
     * @return 1 if the node should be output.
     *         0 if node must not be output,
     *         -1 if the node and all it's child must not be output.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/NodeFilter.java
    int isNodeInclude(Node n);

    /**
     * Tells if a node must be output in c14n.
     * @param n
     * @return 1 if the node should be output.
     *         0 if node must not be output,
     *         -1 if the node and all it's child must not be output.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/NodeFilter.java
public interface NodeFilter {

/**
 * An interface to tell to the c14n if a node is included or not in the output
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/NodeFilter.java
package com.sun.org.apache.xml.internal.security.signature;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/NodeFilter.java
    int isNodeIncludeDO(Node n, int level);

    /**
     * Tells if a node must be output in a c14n.
     * The caller must assured that this method is always call
     * in document order. The implementations can use this
     * restriction to optimize the transformation.
     * @param n
     * @param level the relative level in the tree
     * @return 1 if the node should be output.
     *         0 if node must not be output,
     *         -1 if the node and all it's child must not be output.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/NodeFilter.java
    int isNodeInclude(Node n);

    /**
     * Tells if a node must be output in c14n.
     * @param n
     * @return 1 if the node should be output.
     *         0 if node must not be output,
     *         -1 if the node and all it's child must not be output.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/NodeFilter.java
public interface NodeFilter {

/**
 * An interface to tell to the c14n if a node is included or not in the output
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/NodeFilter.java
package com.sun.org.apache.xml.internal.security.signature;

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
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/NodeFilter.java
    public short acceptNode(Node n);

    /**
     * Test whether a specified node is visible in the logical view of a
     * <code>TreeWalker</code> or <code>NodeIterator</code>. This function
     * will be called by the implementation of <code>TreeWalker</code> and
     * <code>NodeIterator</code>; it is not normally called directly from
     * user code. (Though you could do so if you wanted to use the same
     * filter to guide your own application logic.)
     * @param n The node to check to see if it passes the filter or not.
     * @return A constant to determine whether the node is accepted,
     *   rejected, or skipped, as defined above.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/NodeFilter.java
    public static final int SHOW_NOTATION             = 0x00000800;

    /**
     * Show <code>Notation</code> nodes. This is meaningful only when creating
     * an <code>NodeIterator</code> or <code>TreeWalker</code> with a
     * <code>Notation</code> node as its <code>root</code>; in this case, it
     * means that the <code>Notation</code> node will appear in the first
     * position of the traversal. Since notations are not part of the
     * document tree, they do not appear when traversing over the document
     * tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/NodeFilter.java
    public static final int SHOW_DOCUMENT_TYPE        = 0x00000200;

    /**
     * Show <code>DocumentType</code> nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/NodeFilter.java
    public static final int SHOW_COMMENT              = 0x00000080;

    /**
     * Show <code>Comment</code> nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/NodeFilter.java
    public static final int SHOW_ENTITY               = 0x00000020;

    /**
     * Show <code>Entity</code> nodes. This is meaningful only when creating
     * an <code>NodeIterator</code> or <code>TreeWalker</code> with an
     * <code>Entity</code> node as its <code>root</code>; in this case, it
     * means that the <code>Entity</code> node will appear in the first
     * position of the traversal. Since entities are not part of the
     * document tree, they do not appear when traversing over the document
     * tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/NodeFilter.java
    public static final int SHOW_CDATA_SECTION        = 0x00000008;

    /**
     * Show <code>CDATASection</code> nodes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/NodeFilter.java
    public static final int SHOW_ATTRIBUTE            = 0x00000002;

    /**
     * Show <code>Attr</code> nodes. This is meaningful only when creating an
     * <code>NodeIterator</code> or <code>TreeWalker</code> with an
     * attribute node as its <code>root</code>; in this case, it means that
     * the attribute node will appear in the first position of the iteration
     * or traversal. Since attributes are never children of other nodes,
     * they do not appear when traversing over the document tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/NodeFilter.java
    public static final int SHOW_ALL                  = 0xFFFFFFFF;

    /**
     * Show all <code>Nodes</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/NodeFilter.java
    public static final short FILTER_SKIP               = 3;

    /**
     * Skip this single node. Navigation methods defined for
     * <code>NodeIterator</code> or <code>TreeWalker</code> will not return
     * this node. For both <code>NodeIterator</code> and
     * <code>TreeWalker</code>, the children of this node will still be
     * considered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/NodeFilter.java
    public static final short FILTER_ACCEPT             = 1;

    /**
     * Accept the node. Navigation methods defined for
     * <code>NodeIterator</code> or <code>TreeWalker</code> will return this
     * node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/traversal/NodeFilter.java
public interface NodeFilter {

/**
 * Filters are objects that know how to "filter out" nodes. If a
 * <code>NodeIterator</code> or <code>TreeWalker</code> is given a
 * <code>NodeFilter</code>, it applies the filter before it returns the next
 * node. If the filter says to accept the node, the traversal logic returns
 * it; otherwise, traversal looks for the next node and pretends that the
 * node that was rejected was not there.
 * <p>The DOM does not provide any filters. <code>NodeFilter</code> is just an
 * interface that users can implement to provide their own filters.
 * <p><code>NodeFilters</code> do not need to know how to traverse from node
 * to node, nor do they need to know anything about the data structure that
 * is being traversed. This makes it very easy to write filters, since the
 * only thing they have to know how to do is evaluate a single node. One
 * filter may be used with a number of different kinds of traversals,
 * encouraging code reuse.
 * <p>See also the <a href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Traversal-Range-20001113'>Document Object Model (DOM) Level 2 Traversal and Range Specification</a>.
 * @since DOM Level 2
 */
