_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/KeyName.java
    public String getBaseLocalName() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/KeyName.java
    public String getKeyName() {

    /**
     * Method getKeyName
     *
     * @return key name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/KeyName.java
    public KeyName(Document doc, String keyName) {

    /**
     * Constructor KeyName
     *
     * @param doc
     * @param keyName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/KeyName.java
    public KeyName(Element element, String BaseURI) throws XMLSecurityException {

    /**
     * Constructor KeyName
     *
     * @param element
     * @param BaseURI
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/KeyName.java
public class KeyName extends SignatureElementProxy implements KeyInfoContent {

/**
 * @author $Author: coheigea $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/KeyName.java
package com.sun.org.apache.xml.internal.security.keys.content;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/KeyName.java
    public String getBaseLocalName() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/KeyName.java
    public String getKeyName() {

    /**
     * Method getKeyName
     *
     * @return key name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/KeyName.java
    public KeyName(Document doc, String keyName) {

    /**
     * Constructor KeyName
     *
     * @param doc
     * @param keyName
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/KeyName.java
    public KeyName(Element element, String BaseURI) throws XMLSecurityException {

    /**
     * Constructor KeyName
     *
     * @param element
     * @param BaseURI
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/KeyName.java
public class KeyName extends SignatureElementProxy implements KeyInfoContent {

/**
 * @author $Author: coheigea $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/KeyName.java
package com.sun.org.apache.xml.internal.security.keys.content;

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
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/keyinfo/KeyName.java
    String getName();

    /**
     * Returns the name of this <code>KeyName</code>.
     *
     * @return the name of this <code>KeyName</code> (never
     *    <code>null</code>)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/crypto/dsig/keyinfo/KeyName.java
public interface KeyName extends XMLStructure {

/**
 * A representation of the XML <code>KeyName</code> element as
 * defined in the <a href="http://www.w3.org/TR/xmldsig-core/">
 * W3C Recommendation for XML-Signature Syntax and Processing</a>.
 * A <code>KeyName</code> object contains a string value which may be used
 * by the signer to communicate a key identifier to the recipient. The
 * XML Schema Definition is defined as:
 *
 * <pre>
 * &lt;element name="KeyName" type="string"/&gt;
 * </pre>
 *
 * A <code>KeyName</code> instance may be created by invoking the
 * {@link KeyInfoFactory#newKeyName newKeyName} method of the
 * {@link KeyInfoFactory} class, and passing it a <code>String</code>
 * representing the name of the key; for example:
 * <pre>
 * KeyInfoFactory factory = KeyInfoFactory.getInstance("DOM");
 * KeyName keyName = factory.newKeyName("Alice");
 * </pre>
 *
 * @author Sean Mullan
 * @author JSR 105 Expert Group
 * @since 1.6
 * @see KeyInfoFactory#newKeyName(String)
 */
