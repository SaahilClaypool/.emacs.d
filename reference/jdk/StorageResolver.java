_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
        public void remove() {

        /**
         * Method remove
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
        public Certificate next() {

        /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
        public boolean hasNext() {

        /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
        public StorageResolverIterator(Iterator<StorageResolverSpi> resolvers) {

        /**
         * Constructor StorageResolverIterator
         *
         * @param resolvers
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
        Iterator<Certificate> currentResolver = null;

        /** Field currentResolver */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
        Iterator<StorageResolverSpi> resolvers = null;

        /** Field resolvers */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
    static class StorageResolverIterator implements Iterator<Certificate> {

    /**
     * Class StorageResolverIterator
     * This iterates over all the Certificates found in all the resolvers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
    public Iterator<Certificate> getIterator() {

    /**
     * Method getIterator
     * @return the iterator for the resolvers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
    public void add(X509Certificate x509certificate) {

    /**
     * Method addCertificate
     *
     * @param x509certificate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
    public StorageResolver(X509Certificate x509certificate) {

    /**
     * Constructor StorageResolver
     *
     * @param x509certificate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
    public void add(KeyStore keyStore) {

    /**
     * Method addKeyStore
     *
     * @param keyStore
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
    public StorageResolver(KeyStore keyStore) {

    /**
     * Constructor StorageResolver
     *
     * @param keyStore
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
    public void add(StorageResolverSpi resolver) {

    /**
     * Method addResolver
     *
     * @param resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
    public StorageResolver(StorageResolverSpi resolver) {

    /**
     * Constructor StorageResolver
     *
     * @param resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
    public StorageResolver() {}

    /**
     * Constructor StorageResolver
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
    private List<StorageResolverSpi> storageResolvers = null;

    /** Field storageResolvers */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
public class StorageResolver {

/**
 * This class collects customized resolvers for Certificates.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
package com.sun.org.apache.xml.internal.security.keys.storage;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
        public void remove() {

        /**
         * Method remove
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
        public Certificate next() {

        /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
        public boolean hasNext() {

        /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
        public StorageResolverIterator(Iterator<StorageResolverSpi> resolvers) {

        /**
         * Constructor StorageResolverIterator
         *
         * @param resolvers
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
        Iterator<Certificate> currentResolver = null;

        /** Field currentResolver */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
        Iterator<StorageResolverSpi> resolvers = null;

        /** Field resolvers */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
    static class StorageResolverIterator implements Iterator<Certificate> {

    /**
     * Class StorageResolverIterator
     * This iterates over all the Certificates found in all the resolvers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
    public Iterator<Certificate> getIterator() {

    /**
     * Method getIterator
     * @return the iterator for the resolvers.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
    public void add(X509Certificate x509certificate) {

    /**
     * Method addCertificate
     *
     * @param x509certificate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
    public StorageResolver(X509Certificate x509certificate) {

    /**
     * Constructor StorageResolver
     *
     * @param x509certificate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
    public void add(KeyStore keyStore) {

    /**
     * Method addKeyStore
     *
     * @param keyStore
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
    public StorageResolver(KeyStore keyStore) {

    /**
     * Constructor StorageResolver
     *
     * @param keyStore
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
    public void add(StorageResolverSpi resolver) {

    /**
     * Method addResolver
     *
     * @param resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
    public StorageResolver(StorageResolverSpi resolver) {

    /**
     * Constructor StorageResolver
     *
     * @param resolver
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
    public StorageResolver() {}

    /**
     * Constructor StorageResolver
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
    private List<StorageResolverSpi> storageResolvers = null;

    /** Field storageResolvers */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
public class StorageResolver {

/**
 * This class collects customized resolvers for Certificates.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/StorageResolver.java
package com.sun.org.apache.xml.internal.security.keys.storage;

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
