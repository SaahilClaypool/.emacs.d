_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
    public static String fixURI(String str) {

    /**
     * Fixes a platform dependent filename to standard URI form.
     *
     * @param str The string to fix.
     *
     * @return Returns the fixed URI string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
    public boolean understandsProperty(String propertyToTest) {

    /**
     * Method understandsProperty
     *
     * @param propertyToTest
     * @return true if understands the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
    public String[] engineGetPropertyKeys() {

    /**
     * Method engineGetPropertyKeys
     *
     * @return the property keys
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
    public boolean engineCanResolveURI(ResourceResolverContext context) {

    /**
     * This method helps the {@link ResourceResolver} to decide whether a
     * {@link ResourceResolverSpi} is able to perform the requested action.
     *
     * <p>New clients should override this method, and not override {@link #engineCanResolve(Attr, String)}
     * </p>
     * @param context Context in which to do resolution.
     * @return true if the engine can resolve the uri
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
    @Deprecated

    /**
     * This method helps the {@link ResourceResolver} to decide whether a
     * {@link ResourceResolverSpi} is able to perform the requested action.
     *
     * @param uri
     * @param BaseURI
     * @return true if the engine can resolve the uri
     *
     * @deprecated See {@link #engineCanResolveURI(ResourceResolverContext)}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
    public boolean engineIsThreadSafe() {

    /**
     * Tells if the implementation does can be reused by several threads safely.
     * It normally means that the implementation does not have any member, or there is
     * member change between engineCanResolve & engineResolve invocations. Or it maintains all
     * member info in ThreadLocal methods.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
    public void engineAddProperies(Map<String, String> newProperties) {

    /**
     *
     * @param newProperties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
    public String engineGetProperty(String key) {

    /**
     * Method engineGetProperty
     *
     * @param key
     * @return the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
    public void engineSetProperty(String key, String value) {

    /**
     * Method engineSetProperty
     *
     * @param key
     * @param value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
    public XMLSignatureInput engineResolveURI(ResourceResolverContext context)

    /**
     * This is the workhorse method used to resolve resources.
     * @param context Context to use to resolve resources.
     *
     * @return the resource wrapped around a XMLSignatureInput
     *
     * @throws ResourceResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
    @Deprecated

    /**
     * This is the workhorse method used to resolve resources.
     *
     * @param uri
     * @param BaseURI
     * @return the resource wrapped around a XMLSignatureInput
     *
     * @throws ResourceResolverException
     *
     * @deprecated New clients should override {@link #engineResolveURI(ResourceResolverContext)}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
    @Deprecated

    /**
     * Deprecated - used to carry state about whether resolution was being done in a secure fashion,
     * but was not thread safe, so the resolution information is now passed as parameters to methods.
     *
     * @deprecated Secure validation flag is now passed to methods.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
    protected java.util.Map<String, String> properties = null;

    /** Field properties */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
public abstract class ResourceResolverSpi {

/**
 * During reference validation, we have to retrieve resources from somewhere.
 *
 * @author $Author: coheigea $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
    public static String fixURI(String str) {

    /**
     * Fixes a platform dependent filename to standard URI form.
     *
     * @param str The string to fix.
     *
     * @return Returns the fixed URI string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
    public boolean understandsProperty(String propertyToTest) {

    /**
     * Method understandsProperty
     *
     * @param propertyToTest
     * @return true if understands the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
    public String[] engineGetPropertyKeys() {

    /**
     * Method engineGetPropertyKeys
     *
     * @return the property keys
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
    public boolean engineCanResolveURI(ResourceResolverContext context) {

    /**
     * This method helps the {@link ResourceResolver} to decide whether a
     * {@link ResourceResolverSpi} is able to perform the requested action.
     *
     * <p>New clients should override this method, and not override {@link #engineCanResolve(Attr, String)}
     * </p>
     * @param context Context in which to do resolution.
     * @return true if the engine can resolve the uri
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
    @Deprecated

    /**
     * This method helps the {@link ResourceResolver} to decide whether a
     * {@link ResourceResolverSpi} is able to perform the requested action.
     *
     * @param uri
     * @param BaseURI
     * @return true if the engine can resolve the uri
     *
     * @deprecated See {@link #engineCanResolveURI(ResourceResolverContext)}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
    public boolean engineIsThreadSafe() {

    /**
     * Tells if the implementation does can be reused by several threads safely.
     * It normally means that the implementation does not have any member, or there is
     * member change between engineCanResolve & engineResolve invocations. Or it maintains all
     * member info in ThreadLocal methods.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
    public void engineAddProperies(Map<String, String> newProperties) {

    /**
     *
     * @param newProperties
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
    public String engineGetProperty(String key) {

    /**
     * Method engineGetProperty
     *
     * @param key
     * @return the value of the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
    public void engineSetProperty(String key, String value) {

    /**
     * Method engineSetProperty
     *
     * @param key
     * @param value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
    public XMLSignatureInput engineResolveURI(ResourceResolverContext context)

    /**
     * This is the workhorse method used to resolve resources.
     * @param context Context to use to resolve resources.
     *
     * @return the resource wrapped around a XMLSignatureInput
     *
     * @throws ResourceResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
    @Deprecated

    /**
     * This is the workhorse method used to resolve resources.
     *
     * @param uri
     * @param BaseURI
     * @return the resource wrapped around a XMLSignatureInput
     *
     * @throws ResourceResolverException
     *
     * @deprecated New clients should override {@link #engineResolveURI(ResourceResolverContext)}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
    @Deprecated

    /**
     * Deprecated - used to carry state about whether resolution was being done in a secure fashion,
     * but was not thread safe, so the resolution information is now passed as parameters to methods.
     *
     * @deprecated Secure validation flag is now passed to methods.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
    protected java.util.Map<String, String> properties = null;

    /** Field properties */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
public abstract class ResourceResolverSpi {

/**
 * During reference validation, we have to retrieve resources from somewhere.
 *
 * @author $Author: coheigea $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/ResourceResolverSpi.java
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
