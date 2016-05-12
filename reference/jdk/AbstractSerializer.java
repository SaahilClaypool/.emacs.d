_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/AbstractSerializer.java
    public abstract Node deserialize(byte[] source, Node ctx) throws XMLEncryptionException;

    /**
     * @param source
     * @param ctx
     * @return the Node resulting from the parse of the source
     * @throws XMLEncryptionException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/AbstractSerializer.java
    public abstract Node deserialize(String source, Node ctx) throws XMLEncryptionException;

    /**
     * @param source
     * @param ctx
     * @return the Node resulting from the parse of the source
     * @throws XMLEncryptionException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/AbstractSerializer.java
    public byte[] canonSerializeToByteArray(Node node) throws Exception {

    /**
     * Use the Canonicalizer to serialize the node
     * @param node
     * @return the (byte[]) canonicalization of the node
     * @throws Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/AbstractSerializer.java
    public String canonSerialize(Node node) throws Exception {

    /**
     * Use the Canonicalizer to serialize the node
     * @param node
     * @return the canonicalization of the node
     * @throws Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/AbstractSerializer.java
    public byte[] serializeToByteArray(NodeList content) throws Exception {

    /**
     * Returns a <code>byte[]</code> representation of the specified
     * <code>NodeList</code>.
     *
     * @param content the <code>NodeList</code> to serialize.
     * @return the <code>byte[]</code> representation of the serialized
     *   <code>NodeList</code>.
     * @throws Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/AbstractSerializer.java
    public String serialize(NodeList content) throws Exception {

    /**
     * Returns a <code>String</code> representation of the specified
     * <code>NodeList</code>.
     * <p/>
     * This is a special case because the NodeList may represent a
     * <code>DocumentFragment</code>. A document fragment may be a
     * non-valid XML document (refer to appropriate description of
     * W3C) because it my start with a non-element node, e.g. a text
     * node.
     * <p/>
     * The methods first converts the node list into a document fragment.
     * Special care is taken to not destroy the current document, thus
     * the method clones the nodes (deep cloning) before it appends
     * them to the document fragment.
     * <p/>
     * Refer also to comments about setup of format.
     *
     * @param content the <code>NodeList</code> to serialize.
     * @return the <code>String</code> representation of the serialized
     *   <code>NodeList</code>.
     * @throws Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/AbstractSerializer.java
    public byte[] serializeToByteArray(Element element) throws Exception {

    /**
     * Returns a <code>byte[]</code> representation of the specified
     * <code>Element</code>.
     *
     * @param element the <code>Element</code> to serialize.
     * @return the <code>byte[]</code> representation of the serilaized
     *   <code>Element</code>.
     * @throws Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/AbstractSerializer.java
    public String serialize(Element element) throws Exception {

    /**
     * Returns a <code>String</code> representation of the specified
     * <code>Element</code>.
     * <p/>
     * Refer also to comments about setup of format.
     *
     * @param element the <code>Element</code> to serialize.
     * @return the <code>String</code> representation of the serilaized
     *   <code>Element</code>.
     * @throws Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/AbstractSerializer.java
public abstract class AbstractSerializer implements Serializer {

/**
 * Converts <code>String</code>s into <code>Node</code>s and visa versa.
 *
 * An abstract class for common Serializer functionality
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/AbstractSerializer.java
package com.sun.org.apache.xml.internal.security.encryption;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/AbstractSerializer.java
    public abstract Node deserialize(byte[] source, Node ctx) throws XMLEncryptionException;

    /**
     * @param source
     * @param ctx
     * @return the Node resulting from the parse of the source
     * @throws XMLEncryptionException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/AbstractSerializer.java
    public abstract Node deserialize(String source, Node ctx) throws XMLEncryptionException;

    /**
     * @param source
     * @param ctx
     * @return the Node resulting from the parse of the source
     * @throws XMLEncryptionException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/AbstractSerializer.java
    public byte[] canonSerializeToByteArray(Node node) throws Exception {

    /**
     * Use the Canonicalizer to serialize the node
     * @param node
     * @return the (byte[]) canonicalization of the node
     * @throws Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/AbstractSerializer.java
    public String canonSerialize(Node node) throws Exception {

    /**
     * Use the Canonicalizer to serialize the node
     * @param node
     * @return the canonicalization of the node
     * @throws Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/AbstractSerializer.java
    public byte[] serializeToByteArray(NodeList content) throws Exception {

    /**
     * Returns a <code>byte[]</code> representation of the specified
     * <code>NodeList</code>.
     *
     * @param content the <code>NodeList</code> to serialize.
     * @return the <code>byte[]</code> representation of the serialized
     *   <code>NodeList</code>.
     * @throws Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/AbstractSerializer.java
    public String serialize(NodeList content) throws Exception {

    /**
     * Returns a <code>String</code> representation of the specified
     * <code>NodeList</code>.
     * <p/>
     * This is a special case because the NodeList may represent a
     * <code>DocumentFragment</code>. A document fragment may be a
     * non-valid XML document (refer to appropriate description of
     * W3C) because it my start with a non-element node, e.g. a text
     * node.
     * <p/>
     * The methods first converts the node list into a document fragment.
     * Special care is taken to not destroy the current document, thus
     * the method clones the nodes (deep cloning) before it appends
     * them to the document fragment.
     * <p/>
     * Refer also to comments about setup of format.
     *
     * @param content the <code>NodeList</code> to serialize.
     * @return the <code>String</code> representation of the serialized
     *   <code>NodeList</code>.
     * @throws Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/AbstractSerializer.java
    public byte[] serializeToByteArray(Element element) throws Exception {

    /**
     * Returns a <code>byte[]</code> representation of the specified
     * <code>Element</code>.
     *
     * @param element the <code>Element</code> to serialize.
     * @return the <code>byte[]</code> representation of the serilaized
     *   <code>Element</code>.
     * @throws Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/AbstractSerializer.java
    public String serialize(Element element) throws Exception {

    /**
     * Returns a <code>String</code> representation of the specified
     * <code>Element</code>.
     * <p/>
     * Refer also to comments about setup of format.
     *
     * @param element the <code>Element</code> to serialize.
     * @return the <code>String</code> representation of the serilaized
     *   <code>Element</code>.
     * @throws Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/AbstractSerializer.java
public abstract class AbstractSerializer implements Serializer {

/**
 * Converts <code>String</code>s into <code>Node</code>s and visa versa.
 *
 * An abstract class for common Serializer functionality
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/AbstractSerializer.java
package com.sun.org.apache.xml.internal.security.encryption;

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
