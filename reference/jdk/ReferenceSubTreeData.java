_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/reference/ReferenceSubTreeData.java
        @SuppressWarnings("fallthrough")

        /**
         * Recursively traverses the subtree, and returns an XPath-equivalent
         * node-set of all nodes traversed, excluding any comment nodes,
         * if specified.
         *
         * @param node the node to traverse
         * @param nodeSet the set of nodes traversed so far
         * @param the previous sibling node
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/reference/ReferenceSubTreeData.java
        private List<Node> dereferenceSameDocumentURI(Node node) {

        /**
         * Dereferences a same-document URI fragment.
         *
         * @param node the node (document or element) referenced by the
         *        URI fragment. If null, returns an empty set.
         * @return a set of nodes (minus any comment nodes)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/reference/ReferenceSubTreeData.java
    static class DelayedNodeIterator implements Iterator<Node> {

    /**
     * This is an Iterator that contains a backing node-set that is
     * not populated until the caller first attempts to advance the iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/reference/ReferenceSubTreeData.java
public class ReferenceSubTreeData implements ReferenceNodeSetData {

/**
 * A representation of a <code>ReferenceNodeSetData</code> type containing a node-set.
 * This is a subtype of NodeSetData that represents a dereferenced
 * same-document URI as the root of a subdocument. The main reason is
 * for efficiency and performance, as some transforms can operate
 * directly on the subdocument and there is no need to convert it
 * first to an XPath node-set.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/reference/ReferenceSubTreeData.java
/*

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/reference/ReferenceSubTreeData.java
        @SuppressWarnings("fallthrough")

        /**
         * Recursively traverses the subtree, and returns an XPath-equivalent
         * node-set of all nodes traversed, excluding any comment nodes,
         * if specified.
         *
         * @param node the node to traverse
         * @param nodeSet the set of nodes traversed so far
         * @param the previous sibling node
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/reference/ReferenceSubTreeData.java
        private List<Node> dereferenceSameDocumentURI(Node node) {

        /**
         * Dereferences a same-document URI fragment.
         *
         * @param node the node (document or element) referenced by the
         *        URI fragment. If null, returns an empty set.
         * @return a set of nodes (minus any comment nodes)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/reference/ReferenceSubTreeData.java
    static class DelayedNodeIterator implements Iterator<Node> {

    /**
     * This is an Iterator that contains a backing node-set that is
     * not populated until the caller first attempts to advance the iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/reference/ReferenceSubTreeData.java
public class ReferenceSubTreeData implements ReferenceNodeSetData {

/**
 * A representation of a <code>ReferenceNodeSetData</code> type containing a node-set.
 * This is a subtype of NodeSetData that represents a dereferenced
 * same-document URI as the root of a subdocument. The main reason is
 * for efficiency and performance, as some transforms can operate
 * directly on the subdocument and there is no need to convert it
 * first to an XPath node-set.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/reference/ReferenceSubTreeData.java
/*

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
