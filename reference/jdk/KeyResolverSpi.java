_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
    public boolean understandsProperty(String propertyToTest) {

    /**
     * Method understandsProperty
     *
     * @param propertyToTest
     * @return true if understood the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
    public String engineGetProperty(String key) {

    /**
     * Method engineGetProperty
     *
     * @param key
     * @return obtain the property appointed by key
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
    public void engineSetProperty(String key, String value) {

    /**
     * Method engineSetProperty
     *
     * @param key
     * @param value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
    public PrivateKey engineLookupAndResolvePrivateKey(
        Element element, String baseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Method engineLookupAndResolvePrivateKey
     *
     * @param element
     * @param baseURI
     * @param storage
     * @return resolved PrivateKey key from the registered from the elements
     *
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
    public SecretKey engineLookupAndResolveSecretKey(
        Element element, String baseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Method engineLookupAndResolveSecretKey
     *
     * @param element
     * @param baseURI
     * @param storage
     * @return resolved SecretKey key from the registered from the elements
     *
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
    public SecretKey engineResolveSecretKey(
        Element element, String baseURI, StorageResolver storage
    ) throws KeyResolverException{

    /**
     * Method engineResolveSecretKey
     *
     * @param element
     * @param baseURI
     * @param storage
     * @return resolved SecretKey key from the registered from the elements
     *
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
    public X509Certificate engineLookupResolveX509Certificate(
        Element element, String baseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Method engineLookupResolveX509Certificate
     *
     * @param element
     * @param baseURI
     * @param storage
     * @return resolved X509Certificate key from the registered from the elements
     *
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
    public X509Certificate engineResolveX509Certificate(
        Element element, String baseURI, StorageResolver storage
    ) throws KeyResolverException{

    /**
     * Method engineResolveCertificate
     *
     * @param element
     * @param baseURI
     * @param storage
     * @return resolved X509Certificate key from the registered from the elements
     *
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
    public PublicKey engineLookupAndResolvePublicKey(
        Element element, String baseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Method engineLookupAndResolvePublicKey
     *
     * @param element
     * @param baseURI
     * @param storage
     * @return resolved public key from the registered from the element.
     *
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
    public PublicKey engineResolvePublicKey(
        Element element, String baseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Method engineResolvePublicKey
     *
     * @param element
     * @param baseURI
     * @param storage
     * @return resolved public key from the registered from the element.
     *
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
    public boolean engineCanResolve(Element element, String baseURI, StorageResolver storage) {

    /**
     * This method returns whether the KeyResolverSpi is able to perform the requested action.
     *
     * @param element
     * @param baseURI
     * @param storage
     * @return whether the KeyResolverSpi is able to perform the requested action.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
    public void setSecureValidation(boolean secureValidation) {

    /**
     * Set whether secure validation is enabled or not. The default is false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
    protected java.util.Map<String, String> properties = null;

    /** Field properties */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
public abstract class KeyResolverSpi {

/**
 * This class is an abstract class for a child KeyInfo Element.
 *
 * If you want the your KeyResolver, at firstly you must extend this class, and register
 * as following in config.xml
 * <PRE>
 *  &lt;KeyResolver URI="http://www.w3.org/2000/09/xmldsig#KeyValue"
 *   JAVACLASS="MyPackage.MyKeyValueImpl"//gt;
 * </PRE>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
    public boolean understandsProperty(String propertyToTest) {

    /**
     * Method understandsProperty
     *
     * @param propertyToTest
     * @return true if understood the property
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
    public String engineGetProperty(String key) {

    /**
     * Method engineGetProperty
     *
     * @param key
     * @return obtain the property appointed by key
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
    public void engineSetProperty(String key, String value) {

    /**
     * Method engineSetProperty
     *
     * @param key
     * @param value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
    public PrivateKey engineLookupAndResolvePrivateKey(
        Element element, String baseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Method engineLookupAndResolvePrivateKey
     *
     * @param element
     * @param baseURI
     * @param storage
     * @return resolved PrivateKey key from the registered from the elements
     *
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
    public SecretKey engineLookupAndResolveSecretKey(
        Element element, String baseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Method engineLookupAndResolveSecretKey
     *
     * @param element
     * @param baseURI
     * @param storage
     * @return resolved SecretKey key from the registered from the elements
     *
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
    public SecretKey engineResolveSecretKey(
        Element element, String baseURI, StorageResolver storage
    ) throws KeyResolverException{

    /**
     * Method engineResolveSecretKey
     *
     * @param element
     * @param baseURI
     * @param storage
     * @return resolved SecretKey key from the registered from the elements
     *
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
    public X509Certificate engineLookupResolveX509Certificate(
        Element element, String baseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Method engineLookupResolveX509Certificate
     *
     * @param element
     * @param baseURI
     * @param storage
     * @return resolved X509Certificate key from the registered from the elements
     *
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
    public X509Certificate engineResolveX509Certificate(
        Element element, String baseURI, StorageResolver storage
    ) throws KeyResolverException{

    /**
     * Method engineResolveCertificate
     *
     * @param element
     * @param baseURI
     * @param storage
     * @return resolved X509Certificate key from the registered from the elements
     *
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
    public PublicKey engineLookupAndResolvePublicKey(
        Element element, String baseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Method engineLookupAndResolvePublicKey
     *
     * @param element
     * @param baseURI
     * @param storage
     * @return resolved public key from the registered from the element.
     *
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
    public PublicKey engineResolvePublicKey(
        Element element, String baseURI, StorageResolver storage
    ) throws KeyResolverException {

    /**
     * Method engineResolvePublicKey
     *
     * @param element
     * @param baseURI
     * @param storage
     * @return resolved public key from the registered from the element.
     *
     * @throws KeyResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
    public boolean engineCanResolve(Element element, String baseURI, StorageResolver storage) {

    /**
     * This method returns whether the KeyResolverSpi is able to perform the requested action.
     *
     * @param element
     * @param baseURI
     * @param storage
     * @return whether the KeyResolverSpi is able to perform the requested action.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
    public void setSecureValidation(boolean secureValidation) {

    /**
     * Set whether secure validation is enabled or not. The default is false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
    protected java.util.Map<String, String> properties = null;

    /** Field properties */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
public abstract class KeyResolverSpi {

/**
 * This class is an abstract class for a child KeyInfo Element.
 *
 * If you want the your KeyResolver, at firstly you must extend this class, and register
 * as following in config.xml
 * <PRE>
 *  &lt;KeyResolver URI="http://www.w3.org/2000/09/xmldsig#KeyValue"
 *   JAVACLASS="MyPackage.MyKeyValueImpl"//gt;
 * </PRE>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/keyresolver/KeyResolverSpi.java
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
