_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    private boolean canResolve(ResourceResolverContext context) {

    /**
     * Method canResolve
     *
     * @param uri
     * @param baseURI
     * @return true if it can resolve the uri
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    public boolean understandsProperty(String propertyToTest) {

    /**
     * Method understandsProperty
     *
     * @param propertyToTest
     * @return true if the resolver understands the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    public String[] getPropertyKeys() {

    /**
     * Method getPropertyKeys
     *
     * @return all property keys.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    public void addProperties(Map<String, String> properties) {

    /**
     * Method addProperties
     *
     * @param properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    public String getProperty(String key) {

    /**
     * Method getProperty
     *
     * @param key
     * @return the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    public void setProperty(String key, String value) {

    /**
     * Method setProperty
     *
     * @param key
     * @param value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    public XMLSignatureInput resolve(Attr uri, String baseURI, boolean secureValidation)

    /**
     * Method resolve
     *
     * @param uri
     * @param baseURI
     * @return the resource
     *
     * @throws ResourceResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    @Deprecated

    /**
     * @deprecated New clients should use {@link #resolve(Attr, String, boolean)}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    public static void registerDefaultResolvers() {

    /**
     * This method registers the default resolvers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    public static void register(ResourceResolverSpi resourceResolverSpi, boolean start) {

    /**
     * Registers a ResourceResolverSpi instance. This method logs a warning if the class
     * cannot be registered.
     * @param resourceResolverSpi
     * @param start
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register a resource resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    public static void register(Class<? extends ResourceResolverSpi> className, boolean start) {

    /**
     * Registers a ResourceResolverSpi class. This method logs a warning if the class
     * cannot be registered.
     * @param className
     * @param start
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register a resource resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    @SuppressWarnings("unchecked")

    /**
     * Registers a ResourceResolverSpi class at the beginning of the provider
     * list. This method logs a warning if the class cannot be registered.
     *
     * @param className the name of the ResourceResolverSpi class to be registered
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register a resource resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    @SuppressWarnings("unchecked")

    /**
     * Registers a ResourceResolverSpi class. This method logs a warning if
     * the class cannot be registered.
     *
     * @param className the name of the ResourceResolverSpi class to be registered
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register a resource resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    public static ResourceResolver getInstance(
        Attr uri, String baseURI, List<ResourceResolver> individualResolvers, boolean secureValidation
    ) throws ResourceResolverException {

    /**
     * Method getInstance
     *
     * @param uri
     * @param baseURI
     * @param individualResolvers
     * @param secureValidation
     * @return the instance
     *
     * @throws ResourceResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    public static ResourceResolver getInstance(
        Attr uri, String baseURI, List<ResourceResolver> individualResolvers
    ) throws ResourceResolverException {

    /**
     * Method getInstance
     *
     * @param uri
     * @param baseURI
     * @param individualResolvers
     * @return the instance
     *
     * @throws ResourceResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    public static final ResourceResolver getInstance(
        Attr uriAttr, String baseURI, boolean secureValidation
    ) throws ResourceResolverException {

    /**
     * Method getInstance
     *
     * @param uri
     * @param baseURI
     * @param secureValidation
     * @return the instance
     *
     * @throws ResourceResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    public static final ResourceResolver getInstance(Attr uri, String baseURI)

    /**
     * Method getInstance
     *
     * @param uri
     * @param baseURI
     * @return the instance
     *
     * @throws ResourceResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    public ResourceResolver(ResourceResolverSpi resourceResolver) {

    /**
     * Constructor ResourceResolver
     *
     * @param resourceResolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    private final ResourceResolverSpi resolverSpi;

    /** Field resolverSpi */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    private static List<ResourceResolver> resolverList = new ArrayList<ResourceResolver>();

    /** these are the system-wide resolvers */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
public class ResourceResolver {

/**
 * During reference validation, we have to retrieve resources from somewhere.
 * This is done by retrieving a Resolver. The resolver needs two arguments: The
 * URI in which the link to the new resource is defined and the baseURI of the
 * file/entity in which the URI occurs (the baseURI is the same as the SystemId).
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
package com.sun.org.apache.xml.internal.security.utils.resolver;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    private boolean canResolve(ResourceResolverContext context) {

    /**
     * Method canResolve
     *
     * @param uri
     * @param baseURI
     * @return true if it can resolve the uri
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    public boolean understandsProperty(String propertyToTest) {

    /**
     * Method understandsProperty
     *
     * @param propertyToTest
     * @return true if the resolver understands the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    public String[] getPropertyKeys() {

    /**
     * Method getPropertyKeys
     *
     * @return all property keys.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    public void addProperties(Map<String, String> properties) {

    /**
     * Method addProperties
     *
     * @param properties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    public String getProperty(String key) {

    /**
     * Method getProperty
     *
     * @param key
     * @return the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    public void setProperty(String key, String value) {

    /**
     * Method setProperty
     *
     * @param key
     * @param value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    public XMLSignatureInput resolve(Attr uri, String baseURI, boolean secureValidation)

    /**
     * Method resolve
     *
     * @param uri
     * @param baseURI
     * @return the resource
     *
     * @throws ResourceResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    @Deprecated

    /**
     * @deprecated New clients should use {@link #resolve(Attr, String, boolean)}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    public static void registerDefaultResolvers() {

    /**
     * This method registers the default resolvers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    public static void register(ResourceResolverSpi resourceResolverSpi, boolean start) {

    /**
     * Registers a ResourceResolverSpi instance. This method logs a warning if the class
     * cannot be registered.
     * @param resourceResolverSpi
     * @param start
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register a resource resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    public static void register(Class<? extends ResourceResolverSpi> className, boolean start) {

    /**
     * Registers a ResourceResolverSpi class. This method logs a warning if the class
     * cannot be registered.
     * @param className
     * @param start
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register a resource resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    @SuppressWarnings("unchecked")

    /**
     * Registers a ResourceResolverSpi class at the beginning of the provider
     * list. This method logs a warning if the class cannot be registered.
     *
     * @param className the name of the ResourceResolverSpi class to be registered
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register a resource resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    @SuppressWarnings("unchecked")

    /**
     * Registers a ResourceResolverSpi class. This method logs a warning if
     * the class cannot be registered.
     *
     * @param className the name of the ResourceResolverSpi class to be registered
     * @throws SecurityException if a security manager is installed and the
     *    caller does not have permission to register a resource resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    public static ResourceResolver getInstance(
        Attr uri, String baseURI, List<ResourceResolver> individualResolvers, boolean secureValidation
    ) throws ResourceResolverException {

    /**
     * Method getInstance
     *
     * @param uri
     * @param baseURI
     * @param individualResolvers
     * @param secureValidation
     * @return the instance
     *
     * @throws ResourceResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    public static ResourceResolver getInstance(
        Attr uri, String baseURI, List<ResourceResolver> individualResolvers
    ) throws ResourceResolverException {

    /**
     * Method getInstance
     *
     * @param uri
     * @param baseURI
     * @param individualResolvers
     * @return the instance
     *
     * @throws ResourceResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    public static final ResourceResolver getInstance(
        Attr uriAttr, String baseURI, boolean secureValidation
    ) throws ResourceResolverException {

    /**
     * Method getInstance
     *
     * @param uri
     * @param baseURI
     * @param secureValidation
     * @return the instance
     *
     * @throws ResourceResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    public static final ResourceResolver getInstance(Attr uri, String baseURI)

    /**
     * Method getInstance
     *
     * @param uri
     * @param baseURI
     * @return the instance
     *
     * @throws ResourceResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    public ResourceResolver(ResourceResolverSpi resourceResolver) {

    /**
     * Constructor ResourceResolver
     *
     * @param resourceResolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    private final ResourceResolverSpi resolverSpi;

    /** Field resolverSpi */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    private static List<ResourceResolver> resolverList = new ArrayList<ResourceResolver>();

    /** these are the system-wide resolvers */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
public class ResourceResolver {

/**
 * During reference validation, we have to retrieve resources from somewhere.
 * This is done by retrieving a Resolver. The resolver needs two arguments: The
 * URI in which the link to the new resource is defined and the baseURI of the
 * file/entity in which the URI occurs (the baseURI is the same as the SystemId).
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolver.java
package com.sun.org.apache.xml.internal.security.utils.resolver;

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
