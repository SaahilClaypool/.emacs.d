_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverDirectHTTP.java
    public String[] engineGetPropertyKeys() {

    /**
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverDirectHTTP.java
    public boolean engineCanResolveURI(ResourceResolverContext context) {

    /**
     * We resolve http URIs <I>without</I> fragment...
     *
     * @param uri
     * @param baseURI
     * @return true if can be resolved
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverDirectHTTP.java
    @Override

    /**
     * Method resolve
     *
     * @param uri
     * @param baseURI
     *
     * @throws ResourceResolverException
     * @return
     * $todo$ calculate the correct URI from the attribute and the baseURI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverDirectHTTP.java
    private static final int HttpBasicPass = 5;

    /** Field HttpProxyPass */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverDirectHTTP.java
    private static final int HttpBasicUser = 4;

    /** Field HttpProxyUser */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverDirectHTTP.java
    private static final int HttpProxyPass = 3;

    /** Field HttpProxyPass */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverDirectHTTP.java
    private static final int HttpProxyUser = 2;

    /** Field HttpProxyUser */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverDirectHTTP.java
    private static final int HttpProxyPort = 1;

    /** Field HttpProxyPort */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverDirectHTTP.java
    private static final int HttpProxyHost = 0;

    /** Field HttpProxyHost */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverDirectHTTP.java
    private static final String properties[] = {

    /** Field properties[] */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverDirectHTTP.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverDirectHTTP.java
public class ResolverDirectHTTP extends ResourceResolverSpi {

/**
 * A simple ResourceResolver for HTTP requests. This class handles only 'pure'
 * HTTP URIs which means without a fragment. The Fragment handling is done by the
 * {@link ResolverFragment} class.
 * <BR>
 * If the user has a corporate HTTP proxy which is to be used, the usage can be
 * switched on by setting properties for the resolver:
 * <PRE>
 * resourceResolver.setProperty("http.proxy.host", "proxy.company.com");
 * resourceResolver.setProperty("http.proxy.port", "8080");
 *
 * // if we need a password for the proxy
 * resourceResolver.setProperty("http.proxy.username", "proxyuser3");
 * resourceResolver.setProperty("http.proxy.password", "secretca");
 * </PRE>
 *
 * @see <A HREF="http://www.javaworld.com/javaworld/javatips/jw-javatip42_p.html">Java Tip 42: Write Java apps that work with proxy-based firewalls</A>
 * @see <A HREF="https://docs.oracle.com/javase/1.4.2/docs/guide/net/properties.html">SUN J2SE docs for network properties</A>
 * @see <A HREF="http://metalab.unc.edu/javafaq/javafaq.html#proxy">The JAVA FAQ Question 9.5: How do I make Java work with a proxy server?</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverDirectHTTP.java
package com.sun.org.apache.xml.internal.security.utils.resolver.implementations;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverDirectHTTP.java
    public String[] engineGetPropertyKeys() {

    /**
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverDirectHTTP.java
    public boolean engineCanResolveURI(ResourceResolverContext context) {

    /**
     * We resolve http URIs <I>without</I> fragment...
     *
     * @param uri
     * @param baseURI
     * @return true if can be resolved
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverDirectHTTP.java
    @Override

    /**
     * Method resolve
     *
     * @param uri
     * @param baseURI
     *
     * @throws ResourceResolverException
     * @return
     * $todo$ calculate the correct URI from the attribute and the baseURI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverDirectHTTP.java
    private static final int HttpBasicPass = 5;

    /** Field HttpProxyPass */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverDirectHTTP.java
    private static final int HttpBasicUser = 4;

    /** Field HttpProxyUser */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverDirectHTTP.java
    private static final int HttpProxyPass = 3;

    /** Field HttpProxyPass */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverDirectHTTP.java
    private static final int HttpProxyUser = 2;

    /** Field HttpProxyUser */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverDirectHTTP.java
    private static final int HttpProxyPort = 1;

    /** Field HttpProxyPort */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverDirectHTTP.java
    private static final int HttpProxyHost = 0;

    /** Field HttpProxyHost */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverDirectHTTP.java
    private static final String properties[] = {

    /** Field properties[] */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverDirectHTTP.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverDirectHTTP.java
public class ResolverDirectHTTP extends ResourceResolverSpi {

/**
 * A simple ResourceResolver for HTTP requests. This class handles only 'pure'
 * HTTP URIs which means without a fragment. The Fragment handling is done by the
 * {@link ResolverFragment} class.
 * <BR>
 * If the user has a corporate HTTP proxy which is to be used, the usage can be
 * switched on by setting properties for the resolver:
 * <PRE>
 * resourceResolver.setProperty("http.proxy.host", "proxy.company.com");
 * resourceResolver.setProperty("http.proxy.port", "8080");
 *
 * // if we need a password for the proxy
 * resourceResolver.setProperty("http.proxy.username", "proxyuser3");
 * resourceResolver.setProperty("http.proxy.password", "secretca");
 * </PRE>
 *
 * @see <A HREF="http://www.javaworld.com/javaworld/javatips/jw-javatip42_p.html">Java Tip 42: Write Java apps that work with proxy-based firewalls</A>
 * @see <A HREF="https://docs.oracle.com/javase/1.4.2/docs/guide/net/properties.html">SUN J2SE docs for network properties</A>
 * @see <A HREF="http://metalab.unc.edu/javafaq/javafaq.html#proxy">The JAVA FAQ Question 9.5: How do I make Java work with a proxy server?</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverDirectHTTP.java
package com.sun.org.apache.xml.internal.security.utils.resolver.implementations;

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
