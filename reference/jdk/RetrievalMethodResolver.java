_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/RetrievalMethodResolver.java
    public javax.crypto.SecretKey engineLookupAndResolveSecretKey(
        Element element, String baseURI, StorageResolver storage
    ) {

    /**
     * Method engineResolveSecretKey
     * @inheritDoc
     * @param element
     * @param baseURI
     * @param storage
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/RetrievalMethodResolver.java
    private static Element getDocFromBytes(byte[] bytes) throws KeyResolverException {

    /**
     * Parses a byte array and returns the parsed Element.
     *
     * @param bytes
     * @return the Document Element after parsing bytes
     * @throws KeyResolverException if something goes wrong
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/RetrievalMethodResolver.java
    private static XMLSignatureInput resolveInput(
        RetrievalMethod rm, String baseURI, boolean secureValidation
    ) throws XMLSecurityException {

    /**
     * Resolves the input from the given retrieval method
     * @return
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/RetrievalMethodResolver.java
    private static PublicKey resolveKey(
        Element e, String baseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Retrieves a PublicKey from the given information
     * @param e
     * @param baseURI
     * @param storage
     * @return
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/RetrievalMethodResolver.java
    private static X509Certificate resolveCertificate(
        Element e, String baseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Retrieves a x509Certificate from the given information
     * @param e
     * @param baseURI
     * @param storage
     * @return
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/RetrievalMethodResolver.java
    public X509Certificate engineLookupResolveX509Certificate(
        Element element, String baseURI, StorageResolver storage) {

    /**
     * Method engineResolveX509Certificate
     * @inheritDoc
     * @param element
     * @param baseURI
     * @param storage
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/RetrievalMethodResolver.java
    public PublicKey engineLookupAndResolvePublicKey(
           Element element, String baseURI, StorageResolver storage
    ) {

    /**
     * Method engineResolvePublicKey
     * @inheritDoc
     * @param element
     * @param baseURI
     * @param storage
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/RetrievalMethodResolver.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/RetrievalMethodResolver.java
public class RetrievalMethodResolver extends KeyResolverSpi {

/**
 * The RetrievalMethodResolver can retrieve public keys and certificates from
 * other locations. The location is specified using the ds:RetrievalMethod
 * element which points to the location. This includes the handling of raw
 * (binary) X.509 certificate which are not encapsulated in an XML structure.
 * If the retrieval process encounters an element which the
 * RetrievalMethodResolver cannot handle itself, resolving of the extracted
 * element is delegated back to the KeyResolver mechanism.
 *
 * @author $Author: raul $ modified by Dave Garcia
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/RetrievalMethodResolver.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/RetrievalMethodResolver.java
    public javax.crypto.SecretKey engineLookupAndResolveSecretKey(
        Element element, String baseURI, StorageResolver storage
    ) {

    /**
     * Method engineResolveSecretKey
     * @inheritDoc
     * @param element
     * @param baseURI
     * @param storage
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/RetrievalMethodResolver.java
    private static Element getDocFromBytes(byte[] bytes) throws KeyResolverException {

    /**
     * Parses a byte array and returns the parsed Element.
     *
     * @param bytes
     * @return the Document Element after parsing bytes
     * @throws KeyResolverException if something goes wrong
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/RetrievalMethodResolver.java
    private static XMLSignatureInput resolveInput(
        RetrievalMethod rm, String baseURI, boolean secureValidation
    ) throws XMLSecurityException {

    /**
     * Resolves the input from the given retrieval method
     * @return
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/RetrievalMethodResolver.java
    private static PublicKey resolveKey(
        Element e, String baseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Retrieves a PublicKey from the given information
     * @param e
     * @param baseURI
     * @param storage
     * @return
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/RetrievalMethodResolver.java
    private static X509Certificate resolveCertificate(
        Element e, String baseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Retrieves a x509Certificate from the given information
     * @param e
     * @param baseURI
     * @param storage
     * @return
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/RetrievalMethodResolver.java
    public X509Certificate engineLookupResolveX509Certificate(
        Element element, String baseURI, StorageResolver storage) {

    /**
     * Method engineResolveX509Certificate
     * @inheritDoc
     * @param element
     * @param baseURI
     * @param storage
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/RetrievalMethodResolver.java
    public PublicKey engineLookupAndResolvePublicKey(
           Element element, String baseURI, StorageResolver storage
    ) {

    /**
     * Method engineResolvePublicKey
     * @inheritDoc
     * @param element
     * @param baseURI
     * @param storage
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/RetrievalMethodResolver.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/RetrievalMethodResolver.java
public class RetrievalMethodResolver extends KeyResolverSpi {

/**
 * The RetrievalMethodResolver can retrieve public keys and certificates from
 * other locations. The location is specified using the ds:RetrievalMethod
 * element which points to the location. This includes the handling of raw
 * (binary) X.509 certificate which are not encapsulated in an XML structure.
 * If the retrieval process encounters an element which the
 * RetrievalMethodResolver cannot handle itself, resolving of the extracted
 * element is delegated back to the KeyResolver mechanism.
 *
 * @author $Author: raul $ modified by Dave Garcia
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/implementations/RetrievalMethodResolver.java
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
