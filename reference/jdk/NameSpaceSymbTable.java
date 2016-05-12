_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    protected void rehash(int newCapacity) {

    /**
     * rehashes the map to the new capacity.
     *
     * @param newCapacity an <code>int</code> value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    public Object clone() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    Attr n;

    /**The attribute to include.*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    boolean rendered = false;

    /**This prefix-URI has been already render or not.*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    String lastrendered = null;

    /**The last output in the URI for this prefix (This for speed reason).*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    String uri;

    /**The URI that the prefix defines */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
class NameSpaceSymbEntry implements Cloneable {

/**
 * The internal structure of NameSpaceSymbTable.
 **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    public Node addMappingAndRender(String prefix, String uri, Attr n) {

    /**
     * Adds a definition and mark it as render.
     * For inclusive c14n.
     * @param prefix the prefix of definition
     * @param uri the Uri of the definition
     * @param n the attribute that have the definition
     * @return the attr to render, null if there is no need to render
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    public boolean addMapping(String prefix, String uri, Attr n) {

    /**
     * Adds the mapping for a prefix.
     * @param prefix the prefix of definition
     * @param uri the Uri of the definition
     * @param n the attribute that have the definition
     * @return true if there is already defined.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    public Attr getMappingWithoutRendered(String prefix) {

    /**
     * Gets a definition without mark it as render.
     * For render in exclusive c14n the namespaces in the include prefixes.
     * @param prefix The prefix whose definition is neaded.
     * @return the attr to render, null if there is no need to render
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    public Attr getMapping(String prefix) {

    /**
     * Gets the attribute node that defines the binding for the prefix.
     * @param prefix the prefix to obtain the attribute.
     * @return null if there is no need to render the prefix. Otherwise the node of
     * definition.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    public void pop() {

    /**
     * Pop a frame.
     * Inclusive or Exclusive.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    public void push() {

    /**
     * Push a frame for a node.
     * Inclusive or Exclusive.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    public void outputNodePop() {

    /**
     * Pop a frame for visible namespace.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    public void outputNodePush() {

    /**
     * Push a frame for visible namespace.
     * For Inclusive rendering.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    public void getUnrenderedNodes(Collection<Attr> result) {

    /**
     * Get all the unrendered nodes in the name space.
     * For Inclusive rendering
     * @param result the list where to fill the unrendered xmlns definitions.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    public NameSpaceSymbTable() {

    /**
     * Default constractor
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    private List<SymbMap> level;

    /**The stacks for removing the definitions when doing pop.*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    private SymbMap symb;

    /**The map betwen prefix-> entry table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
public class NameSpaceSymbTable {

/**
 * A stack based Symbol Table.
 *<br>For speed reasons all the symbols are introduced in the same map,
 * and at the same time in a list so it can be removed when the frame is pop back.
 * @author Raul Benito
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    protected void rehash(int newCapacity) {

    /**
     * rehashes the map to the new capacity.
     *
     * @param newCapacity an <code>int</code> value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    public Object clone() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    Attr n;

    /**The attribute to include.*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    boolean rendered = false;

    /**This prefix-URI has been already render or not.*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    String lastrendered = null;

    /**The last output in the URI for this prefix (This for speed reason).*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    String uri;

    /**The URI that the prefix defines */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
class NameSpaceSymbEntry implements Cloneable {

/**
 * The internal structure of NameSpaceSymbTable.
 **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    public Node addMappingAndRender(String prefix, String uri, Attr n) {

    /**
     * Adds a definition and mark it as render.
     * For inclusive c14n.
     * @param prefix the prefix of definition
     * @param uri the Uri of the definition
     * @param n the attribute that have the definition
     * @return the attr to render, null if there is no need to render
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    public boolean addMapping(String prefix, String uri, Attr n) {

    /**
     * Adds the mapping for a prefix.
     * @param prefix the prefix of definition
     * @param uri the Uri of the definition
     * @param n the attribute that have the definition
     * @return true if there is already defined.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    public Attr getMappingWithoutRendered(String prefix) {

    /**
     * Gets a definition without mark it as render.
     * For render in exclusive c14n the namespaces in the include prefixes.
     * @param prefix The prefix whose definition is neaded.
     * @return the attr to render, null if there is no need to render
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    public Attr getMapping(String prefix) {

    /**
     * Gets the attribute node that defines the binding for the prefix.
     * @param prefix the prefix to obtain the attribute.
     * @return null if there is no need to render the prefix. Otherwise the node of
     * definition.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    public void pop() {

    /**
     * Pop a frame.
     * Inclusive or Exclusive.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    public void push() {

    /**
     * Push a frame for a node.
     * Inclusive or Exclusive.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    public void outputNodePop() {

    /**
     * Pop a frame for visible namespace.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    public void outputNodePush() {

    /**
     * Push a frame for visible namespace.
     * For Inclusive rendering.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    public void getUnrenderedNodes(Collection<Attr> result) {

    /**
     * Get all the unrendered nodes in the name space.
     * For Inclusive rendering
     * @param result the list where to fill the unrendered xmlns definitions.
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    public NameSpaceSymbTable() {

    /**
     * Default constractor
     **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    private List<SymbMap> level;

    /**The stacks for removing the definitions when doing pop.*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
    private SymbMap symb;

    /**The map betwen prefix-> entry table. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
public class NameSpaceSymbTable {

/**
 * A stack based Symbol Table.
 *<br>For speed reasons all the symbols are introduced in the same map,
 * and at the same time in a list so it can be removed when the frame is pop back.
 * @author Raul Benito
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/c14n/implementations/NameSpaceSymbTable.java
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
