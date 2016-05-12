_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    static class ResolverIterator implements Iterator<KeyResolverSpi> {

    /**
     * Iterate over the KeyResolverSpi instances
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public String resolverClassName() {

    /**
     * Method resolverClassName
     *
     * @return the name of the resolver.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public boolean understandsProperty(String propertyToTest) {

    /**
     * Method understandsProperty
     *
     * @param propertyToTest
     * @return true if the resolver understands property propertyToTest
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public String getProperty(String key) {

    /**
     * Method getProperty
     *
     * @param key
     * @return the property set for this resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public void setProperty(String key, String value) {

    /**
     * Method setProperty
     *
     * @param key
     * @param value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public SecretKey resolveSecretKey(
        Element element, String baseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * @param element
     * @param baseURI
     * @param storage
     * @return resolved SecretKey key from the registered from the elements
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public X509Certificate resolveX509Certificate(
        Element element, String baseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Method resolveX509Certificate
     *
     * @param element
     * @param baseURI
     * @param storage
     * @return resolved X509certificate key from the registered from the elements
     *
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public PublicKey resolvePublicKey(
        Element element, String baseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Method resolvePublicKey
     *
     * @param element
     * @param baseURI
     * @param storage
     * @return resolved public key from the registered from the elements
     *
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public static void registerDefaultResolvers() {

    /**
     * This method registers the default resolvers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public static void registerClassNames(List<String> classNames)

    /**
     * This method is used for registering {@link KeyResolverSpi}s which are
     * available to <I>all</I> {@link com.sun.org.apache.xml.internal.security.keys.KeyInfo} objects. This means that
     * personalized {@link KeyResolverSpi}s should only be registered directly
     * to the {@link com.sun.org.apache.xml.internal.security.keys.KeyInfo} using
     * {@link com.sun.org.apache.xml.internal.security.keys.KeyInfo#registerInternalKeyResolver}.
     * The KeyResolverSpi instances are not registered as a global resolver.
     *
     *
     * @param classNames
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the key resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public static void register(
        KeyResolverSpi keyResolverSpi,
        boolean start
    ) {

    /**
     * This method is used for registering {@link KeyResolverSpi}s which are
     * available to <I>all</I> {@link com.sun.org.apache.xml.internal.security.keys.KeyInfo} objects. This means that
     * personalized {@link KeyResolverSpi}s should only be registered directly
     * to the {@link com.sun.org.apache.xml.internal.security.keys.KeyInfo} using
     * {@link com.sun.org.apache.xml.internal.security.keys.KeyInfo#registerInternalKeyResolver}.
     * Please note that this method will create a new copy of the underlying array, as the
     * underlying collection is a CopyOnWriteArrayList.
     *
     * @param keyResolverSpi a KeyResolverSpi instance to register
     * @param start whether to register the KeyResolverSpi at the start of the list or not
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the key resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public static void registerAtStart(String className, boolean globalResolver) {

    /**
     * This method is used for registering {@link KeyResolverSpi}s which are
     * available to <I>all</I> {@link com.sun.org.apache.xml.internal.security.keys.KeyInfo} objects. This means that
     * personalized {@link KeyResolverSpi}s should only be registered directly
     * to the {@link com.sun.org.apache.xml.internal.security.keys.KeyInfo} using
     * {@link com.sun.org.apache.xml.internal.security.keys.KeyInfo#registerInternalKeyResolver}.
     * Please note that this method will create a new copy of the underlying array, as the
     * underlying collection is a CopyOnWriteArrayList.
     *
     * @param className
     * @param globalResolver Whether the KeyResolverSpi is a global resolver or not
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the key resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public static void register(String className, boolean globalResolver)

    /**
     * This method is used for registering {@link KeyResolverSpi}s which are
     * available to <I>all</I> {@link com.sun.org.apache.xml.internal.security.keys.KeyInfo} objects. This means that
     * personalized {@link KeyResolverSpi}s should only be registered directly
     * to the {@link com.sun.org.apache.xml.internal.security.keys.KeyInfo} using
     * {@link com.sun.org.apache.xml.internal.security.keys.KeyInfo#registerInternalKeyResolver}.
     * Please note that this method will create a new copy of the underlying array, as the
     * underlying collection is a CopyOnWriteArrayList.
     *
     * @param className
     * @param globalResolver Whether the KeyResolverSpi is a global resolver or not
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the key resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public static final PublicKey getPublicKey(
        Element element, String baseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Method getPublicKey
     *
     * @param element
     * @param baseURI
     * @param storage
     * @return the public key contained in the element
     *
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public static final X509Certificate getX509Certificate(
        Element element, String baseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Method getX509Certificate
     *
     * @param element
     * @param baseURI
     * @param storage
     * @return The certificate represented by the element.
     *
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public static int length() {

    /**
     * Method length
     *
     * @return the length of resolvers registered
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    private KeyResolver(KeyResolverSpi keyResolverSpi) {

    /**
     * Constructor.
     *
     * @param keyResolverSpi a KeyResolverSpi instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    private final KeyResolverSpi resolverSpi;

    /** Field resolverSpi */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    private static List<KeyResolver> resolverVector = new CopyOnWriteArrayList<KeyResolver>();

    /** Field resolverVector */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
public class KeyResolver {

/**
 * KeyResolver is factory class for subclass of KeyResolverSpi that
 * represent child element of KeyInfo.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
package com.sun.org.apache.xml.internal.security.keys.keyresolver;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    static class ResolverIterator implements Iterator<KeyResolverSpi> {

    /**
     * Iterate over the KeyResolverSpi instances
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public String resolverClassName() {

    /**
     * Method resolverClassName
     *
     * @return the name of the resolver.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public boolean understandsProperty(String propertyToTest) {

    /**
     * Method understandsProperty
     *
     * @param propertyToTest
     * @return true if the resolver understands property propertyToTest
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public String getProperty(String key) {

    /**
     * Method getProperty
     *
     * @param key
     * @return the property set for this resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public void setProperty(String key, String value) {

    /**
     * Method setProperty
     *
     * @param key
     * @param value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public SecretKey resolveSecretKey(
        Element element, String baseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * @param element
     * @param baseURI
     * @param storage
     * @return resolved SecretKey key from the registered from the elements
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public X509Certificate resolveX509Certificate(
        Element element, String baseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Method resolveX509Certificate
     *
     * @param element
     * @param baseURI
     * @param storage
     * @return resolved X509certificate key from the registered from the elements
     *
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public PublicKey resolvePublicKey(
        Element element, String baseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Method resolvePublicKey
     *
     * @param element
     * @param baseURI
     * @param storage
     * @return resolved public key from the registered from the elements
     *
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public static void registerDefaultResolvers() {

    /**
     * This method registers the default resolvers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public static void registerClassNames(List<String> classNames)

    /**
     * This method is used for registering {@link KeyResolverSpi}s which are
     * available to <I>all</I> {@link com.sun.org.apache.xml.internal.security.keys.KeyInfo} objects. This means that
     * personalized {@link KeyResolverSpi}s should only be registered directly
     * to the {@link com.sun.org.apache.xml.internal.security.keys.KeyInfo} using
     * {@link com.sun.org.apache.xml.internal.security.keys.KeyInfo#registerInternalKeyResolver}.
     * The KeyResolverSpi instances are not registered as a global resolver.
     *
     *
     * @param classNames
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the key resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public static void register(
        KeyResolverSpi keyResolverSpi,
        boolean start
    ) {

    /**
     * This method is used for registering {@link KeyResolverSpi}s which are
     * available to <I>all</I> {@link com.sun.org.apache.xml.internal.security.keys.KeyInfo} objects. This means that
     * personalized {@link KeyResolverSpi}s should only be registered directly
     * to the {@link com.sun.org.apache.xml.internal.security.keys.KeyInfo} using
     * {@link com.sun.org.apache.xml.internal.security.keys.KeyInfo#registerInternalKeyResolver}.
     * Please note that this method will create a new copy of the underlying array, as the
     * underlying collection is a CopyOnWriteArrayList.
     *
     * @param keyResolverSpi a KeyResolverSpi instance to register
     * @param start whether to register the KeyResolverSpi at the start of the list or not
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the key resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public static void registerAtStart(String className, boolean globalResolver) {

    /**
     * This method is used for registering {@link KeyResolverSpi}s which are
     * available to <I>all</I> {@link com.sun.org.apache.xml.internal.security.keys.KeyInfo} objects. This means that
     * personalized {@link KeyResolverSpi}s should only be registered directly
     * to the {@link com.sun.org.apache.xml.internal.security.keys.KeyInfo} using
     * {@link com.sun.org.apache.xml.internal.security.keys.KeyInfo#registerInternalKeyResolver}.
     * Please note that this method will create a new copy of the underlying array, as the
     * underlying collection is a CopyOnWriteArrayList.
     *
     * @param className
     * @param globalResolver Whether the KeyResolverSpi is a global resolver or not
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the key resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public static void register(String className, boolean globalResolver)

    /**
     * This method is used for registering {@link KeyResolverSpi}s which are
     * available to <I>all</I> {@link com.sun.org.apache.xml.internal.security.keys.KeyInfo} objects. This means that
     * personalized {@link KeyResolverSpi}s should only be registered directly
     * to the {@link com.sun.org.apache.xml.internal.security.keys.KeyInfo} using
     * {@link com.sun.org.apache.xml.internal.security.keys.KeyInfo#registerInternalKeyResolver}.
     * Please note that this method will create a new copy of the underlying array, as the
     * underlying collection is a CopyOnWriteArrayList.
     *
     * @param className
     * @param globalResolver Whether the KeyResolverSpi is a global resolver or not
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws ClassNotFoundException
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register the key resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public static final PublicKey getPublicKey(
        Element element, String baseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Method getPublicKey
     *
     * @param element
     * @param baseURI
     * @param storage
     * @return the public key contained in the element
     *
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public static final X509Certificate getX509Certificate(
        Element element, String baseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Method getX509Certificate
     *
     * @param element
     * @param baseURI
     * @param storage
     * @return The certificate represented by the element.
     *
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    public static int length() {

    /**
     * Method length
     *
     * @return the length of resolvers registered
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    private KeyResolver(KeyResolverSpi keyResolverSpi) {

    /**
     * Constructor.
     *
     * @param keyResolverSpi a KeyResolverSpi instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    private final KeyResolverSpi resolverSpi;

    /** Field resolverSpi */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    private static List<KeyResolver> resolverVector = new CopyOnWriteArrayList<KeyResolver>();

    /** Field resolverVector */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
public class KeyResolver {

/**
 * KeyResolver is factory class for subclass of KeyResolverSpi that
 * represent child element of KeyInfo.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolver.java
package com.sun.org.apache.xml.internal.security.keys.keyresolver;

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
