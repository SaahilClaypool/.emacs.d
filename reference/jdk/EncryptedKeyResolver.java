_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/EncryptedKeyResolver.java
    public javax.crypto.SecretKey engineLookupAndResolveSecretKey(
        Element element, String BaseURI, StorageResolver storage
    ) {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/EncryptedKeyResolver.java
    public X509Certificate engineLookupResolveX509Certificate(
        Element element, String BaseURI, StorageResolver storage
    ) {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/EncryptedKeyResolver.java
    public PublicKey engineLookupAndResolvePublicKey(
        Element element, String BaseURI, StorageResolver storage
    ) {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/EncryptedKeyResolver.java
    public void registerInternalKeyResolver(KeyResolverSpi realKeyResolver) {

    /**
     * This method is used to add a custom {@link KeyResolverSpi} to help
     * resolve the KEK.
     *
     * @param realKeyResolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/EncryptedKeyResolver.java
    public EncryptedKeyResolver(String algorithm, Key kek) {

    /**
     * Constructor used for when a KEK has been set
     * @param algorithm
     * @param kek
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/EncryptedKeyResolver.java
    public EncryptedKeyResolver(String algorithm) {

    /**
     * Constructor for use when a KEK needs to be derived from a KeyInfo
     * list
     * @param algorithm
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/EncryptedKeyResolver.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/EncryptedKeyResolver.java
public class EncryptedKeyResolver extends KeyResolverSpi {

/**
 * The <code>EncryptedKeyResolver</code> is not a generic resolver.  It can
 * only be for specific instantiations, as the key being unwrapped will
 * always be of a particular type and will always have been wrapped by
 * another key which needs to be recursively resolved.
 *
 * The <code>EncryptedKeyResolver</code> can therefore only be instantiated
 * with an algorithm.  It can also be instantiated with a key (the KEK) or
 * will search the static KeyResolvers to find the appropriate key.
 *
 * @author Berin Lautenbach
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/EncryptedKeyResolver.java
package com.sun.org.apache.xml.internal.security.keys.keyresolver.implementations;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/EncryptedKeyResolver.java
    public javax.crypto.SecretKey engineLookupAndResolveSecretKey(
        Element element, String BaseURI, StorageResolver storage
    ) {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/EncryptedKeyResolver.java
    public X509Certificate engineLookupResolveX509Certificate(
        Element element, String BaseURI, StorageResolver storage
    ) {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/EncryptedKeyResolver.java
    public PublicKey engineLookupAndResolvePublicKey(
        Element element, String BaseURI, StorageResolver storage
    ) {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/EncryptedKeyResolver.java
    public void registerInternalKeyResolver(KeyResolverSpi realKeyResolver) {

    /**
     * This method is used to add a custom {@link KeyResolverSpi} to help
     * resolve the KEK.
     *
     * @param realKeyResolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/EncryptedKeyResolver.java
    public EncryptedKeyResolver(String algorithm, Key kek) {

    /**
     * Constructor used for when a KEK has been set
     * @param algorithm
     * @param kek
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/EncryptedKeyResolver.java
    public EncryptedKeyResolver(String algorithm) {

    /**
     * Constructor for use when a KEK needs to be derived from a KeyInfo
     * list
     * @param algorithm
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/EncryptedKeyResolver.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/EncryptedKeyResolver.java
public class EncryptedKeyResolver extends KeyResolverSpi {

/**
 * The <code>EncryptedKeyResolver</code> is not a generic resolver.  It can
 * only be for specific instantiations, as the key being unwrapped will
 * always be of a particular type and will always have been wrapped by
 * another key which needs to be recursively resolved.
 *
 * The <code>EncryptedKeyResolver</code> can therefore only be instantiated
 * with an algorithm.  It can also be instantiated with a key (the KEK) or
 * will search the static KeyResolvers to find the appropriate key.
 *
 * @author Berin Lautenbach
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/EncryptedKeyResolver.java
package com.sun.org.apache.xml.internal.security.keys.keyresolver.implementations;

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
