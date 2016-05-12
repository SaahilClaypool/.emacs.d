_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverXPointer.java
    private static String getXPointerId(String uri) {

    /**
     * Method getXPointerId
     *
     * @param uri
     * @return xpointerId to search.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverXPointer.java
    private static boolean isXPointerId(String uri) {

    /**
     * Method isXPointerId
     *
     * @param uri
     * @return whether it has an xpointer id
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverXPointer.java
    private static boolean isXPointerSlash(String uri) {

    /**
     * Method isXPointerSlash
     *
     * @param uri
     * @return true if begins with xpointer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverXPointer.java
    public boolean engineCanResolveURI(ResourceResolverContext context) {

    /**
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverXPointer.java
    @Override

    /**
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverXPointer.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverXPointer.java
public class ResolverXPointer extends ResourceResolverSpi {

/**
 * Handles barename XPointer Reference URIs.
 * <BR />
 * To retain comments while selecting an element by an identifier ID,
 * use the following full XPointer: URI='#xpointer(id('ID'))'.
 * <BR />
 * To retain comments while selecting the entire document,
 * use the following full XPointer: URI='#xpointer(/)'.
 * This XPointer contains a simple XPath expression that includes
 * the root node, which the second to last step above replaces with all
 * nodes of the parse tree (all descendants, plus all attributes,
 * plus all namespaces nodes).
 *
 * @author $Author: coheigea $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverXPointer.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverXPointer.java
    private static String getXPointerId(String uri) {

    /**
     * Method getXPointerId
     *
     * @param uri
     * @return xpointerId to search.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverXPointer.java
    private static boolean isXPointerId(String uri) {

    /**
     * Method isXPointerId
     *
     * @param uri
     * @return whether it has an xpointer id
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverXPointer.java
    private static boolean isXPointerSlash(String uri) {

    /**
     * Method isXPointerSlash
     *
     * @param uri
     * @return true if begins with xpointer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverXPointer.java
    public boolean engineCanResolveURI(ResourceResolverContext context) {

    /**
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverXPointer.java
    @Override

    /**
     * @inheritDoc
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverXPointer.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverXPointer.java
public class ResolverXPointer extends ResourceResolverSpi {

/**
 * Handles barename XPointer Reference URIs.
 * <BR />
 * To retain comments while selecting an element by an identifier ID,
 * use the following full XPointer: URI='#xpointer(id('ID'))'.
 * <BR />
 * To retain comments while selecting the entire document,
 * use the following full XPointer: URI='#xpointer(/)'.
 * This XPointer contains a simple XPath expression that includes
 * the root node, which the second to last step above replaces with all
 * nodes of the parse tree (all descendants, plus all attributes,
 * plus all namespaces nodes).
 *
 * @author $Author: coheigea $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/resolver/implementations/ResolverXPointer.java
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
