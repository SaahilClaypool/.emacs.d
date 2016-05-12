_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/ObjectContainer.java
    public String getBaseLocalName() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/ObjectContainer.java
    public Node appendChild(Node node) {

    /**
     * Adds child Node
     *
     * @param node child Node
     * @return the new node in the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/ObjectContainer.java
    public String getEncoding() {

    /**
     * Returns the <code>Encoding</code> attribute
     *
     * @return the <code>Encoding</code> attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/ObjectContainer.java
    public void setEncoding(String Encoding) {

    /**
     * Sets the <code>Encoding</code> attribute
     *
     * @param Encoding the <code>Encoding</code> attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/ObjectContainer.java
    public String getMimeType() {

    /**
     * Returns the <code>MimeType</code> attribute
     *
     * @return the <code>MimeType</code> attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/ObjectContainer.java
    public void setMimeType(String MimeType) {

    /**
     * Sets the <code>MimeType</code> attribute
     *
     * @param MimeType the <code>MimeType</code> attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/ObjectContainer.java
    public String getId() {

    /**
     * Returns the <code>Id</code> attribute
     *
     * @return the <code>Id</code> attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/ObjectContainer.java
    public void setId(String Id) {

    /**
     * Sets the <code>Id</code> attribute
     *
     * @param Id <code>Id</code> attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/ObjectContainer.java
    public ObjectContainer(Element element, String baseURI) throws XMLSecurityException {

    /**
     * Constructs {@link ObjectContainer} from {@link Element}
     *
     * @param element is <code>Object</code> element
     * @param baseURI the URI of the resource where the XML instance was stored
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/ObjectContainer.java
    public ObjectContainer(Document doc) {

    /**
     * Constructs {@link ObjectContainer}
     *
     * @param doc the {@link Document} in which <code>Object</code> element is placed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/ObjectContainer.java
public class ObjectContainer extends SignatureElementProxy {

/**
 * Handles <code>&lt;ds:Object&gt;</code> elements
 * <code>Object<code> {@link Element} supply facility which can contain any kind data
 *
 * @author Christian Geuer-Pollmann
 * $todo$ if we remove childen, the boolean values are not updated
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/ObjectContainer.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/ObjectContainer.java
    public String getBaseLocalName() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/ObjectContainer.java
    public Node appendChild(Node node) {

    /**
     * Adds child Node
     *
     * @param node child Node
     * @return the new node in the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/ObjectContainer.java
    public String getEncoding() {

    /**
     * Returns the <code>Encoding</code> attribute
     *
     * @return the <code>Encoding</code> attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/ObjectContainer.java
    public void setEncoding(String Encoding) {

    /**
     * Sets the <code>Encoding</code> attribute
     *
     * @param Encoding the <code>Encoding</code> attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/ObjectContainer.java
    public String getMimeType() {

    /**
     * Returns the <code>MimeType</code> attribute
     *
     * @return the <code>MimeType</code> attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/ObjectContainer.java
    public void setMimeType(String MimeType) {

    /**
     * Sets the <code>MimeType</code> attribute
     *
     * @param MimeType the <code>MimeType</code> attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/ObjectContainer.java
    public String getId() {

    /**
     * Returns the <code>Id</code> attribute
     *
     * @return the <code>Id</code> attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/ObjectContainer.java
    public void setId(String Id) {

    /**
     * Sets the <code>Id</code> attribute
     *
     * @param Id <code>Id</code> attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/ObjectContainer.java
    public ObjectContainer(Element element, String baseURI) throws XMLSecurityException {

    /**
     * Constructs {@link ObjectContainer} from {@link Element}
     *
     * @param element is <code>Object</code> element
     * @param baseURI the URI of the resource where the XML instance was stored
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/ObjectContainer.java
    public ObjectContainer(Document doc) {

    /**
     * Constructs {@link ObjectContainer}
     *
     * @param doc the {@link Document} in which <code>Object</code> element is placed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/ObjectContainer.java
public class ObjectContainer extends SignatureElementProxy {

/**
 * Handles <code>&lt;ds:Object&gt;</code> elements
 * <code>Object<code> {@link Element} supply facility which can contain any kind data
 *
 * @author Christian Geuer-Pollmann
 * $todo$ if we remove childen, the boolean values are not updated
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/signature/ObjectContainer.java
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
