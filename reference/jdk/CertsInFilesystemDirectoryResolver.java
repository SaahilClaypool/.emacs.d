_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
    public static void main(String unused[]) throws Exception {

    /**
     * Method main
     *
     * @param unused
     * @throws Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
        public void remove() {

        /**
         * Method remove
         *
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
        public Certificate next() {

        /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
        public boolean hasNext() {

        /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
        public FilesystemIterator(List<X509Certificate> certs) {

        /**
         * Constructor FilesystemIterator
         *
         * @param certs
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
        int i;

        /** Field i */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
        List<X509Certificate> certs = null;

        /** Field certs */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
    private static class FilesystemIterator implements Iterator<Certificate> {

    /**
     * Class FilesystemIterator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
    public Iterator<Certificate> getIterator() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
    private void readCertsFromHarddrive() throws StorageResolverException {

    /**
     * Method readCertsFromHarddrive
     *
     * @throws StorageResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
    public CertsInFilesystemDirectoryResolver(String directoryName)

    /**
     * @param directoryName
     * @throws StorageResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
    private List<X509Certificate> certs = new ArrayList<X509Certificate>();

    /** Field certs */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
    private String merlinsCertificatesDir = null;

    /** Field merlinsCertificatesDir */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
public class CertsInFilesystemDirectoryResolver extends StorageResolverSpi {

/**
 * This {@link StorageResolverSpi} makes all raw (binary) {@link X509Certificate}s
 * which reside as files in a single directory available to the
 * {@link com.sun.org.apache.xml.internal.security.keys.storage.StorageResolver}.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
package com.sun.org.apache.xml.internal.security.keys.storage.implementations;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
    public static void main(String unused[]) throws Exception {

    /**
     * Method main
     *
     * @param unused
     * @throws Exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
        public void remove() {

        /**
         * Method remove
         *
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
        public Certificate next() {

        /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
        public boolean hasNext() {

        /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
        public FilesystemIterator(List<X509Certificate> certs) {

        /**
         * Constructor FilesystemIterator
         *
         * @param certs
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
        int i;

        /** Field i */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
        List<X509Certificate> certs = null;

        /** Field certs */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
    private static class FilesystemIterator implements Iterator<Certificate> {

    /**
     * Class FilesystemIterator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
    public Iterator<Certificate> getIterator() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
    private void readCertsFromHarddrive() throws StorageResolverException {

    /**
     * Method readCertsFromHarddrive
     *
     * @throws StorageResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
    public CertsInFilesystemDirectoryResolver(String directoryName)

    /**
     * @param directoryName
     * @throws StorageResolverException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
    private List<X509Certificate> certs = new ArrayList<X509Certificate>();

    /** Field certs */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
    private String merlinsCertificatesDir = null;

    /** Field merlinsCertificatesDir */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
public class CertsInFilesystemDirectoryResolver extends StorageResolverSpi {

/**
 * This {@link StorageResolverSpi} makes all raw (binary) {@link X509Certificate}s
 * which reside as files in a single directory available to the
 * {@link com.sun.org.apache.xml.internal.security.keys.storage.StorageResolver}.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/storage/implementations/CertsInFilesystemDirectoryResolver.java
package com.sun.org.apache.xml.internal.security.keys.storage.implementations;

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
