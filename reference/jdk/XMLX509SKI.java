_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/x509/XMLX509SKI.java
    public String getBaseLocalName() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/x509/XMLX509SKI.java
    public boolean equals(Object obj) {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/x509/XMLX509SKI.java
        byte skidValue[] = new byte[extensionValue.length - 4];

        /**
         * Strip away first four bytes from the extensionValue
         * The first two bytes are the tag and length of the extensionValue
         * OCTET STRING, and the next two bytes are the tag and length of
         * the ski OCTET STRING.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/x509/XMLX509SKI.java
    public static byte[] getSKIBytesFromCert(X509Certificate cert)

    /**
     * Method getSKIBytesFromCert
     *
     * @param cert
     * @return ski bytes from the given certificate
     *
     * @throws XMLSecurityException
     * @see java.security.cert.X509Extension#getExtensionValue(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/x509/XMLX509SKI.java
    public byte[] getSKIBytes() throws XMLSecurityException {

    /**
     * Method getSKIBytes
     *
     * @return the skibytes
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/x509/XMLX509SKI.java
    public XMLX509SKI(Element element, String BaseURI) throws XMLSecurityException {

    /**
     * Constructor XMLX509SKI
     *
     * @param element
     * @param BaseURI
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/x509/XMLX509SKI.java
    public XMLX509SKI(Document doc, X509Certificate x509certificate)

    /**
     * Constructor XMLX509SKI
     *
     * @param doc
     * @param x509certificate
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/x509/XMLX509SKI.java
    public XMLX509SKI(Document doc, byte[] skiBytes) {

    /**
     * Constructor X509SKI
     *
     * @param doc
     * @param skiBytes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/x509/XMLX509SKI.java
    public static final String SKI_OID = "2.5.29.14";

    /**
     * <CODE>SubjectKeyIdentifier (id-ce-subjectKeyIdentifier) (2.5.29.14)</CODE>:
     * This extension identifies the public key being certified. It enables
     * distinct keys used by the same subject to be differentiated
     * (e.g., as key updating occurs).
     * <BR />
     * A key identifier shall be unique with respect to all key identifiers
     * for the subject with which it is used. This extension is always non-critical.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/x509/XMLX509SKI.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/x509/XMLX509SKI.java
public class XMLX509SKI extends SignatureElementProxy implements XMLX509DataContent {

/**
 * Handles SubjectKeyIdentifier (SKI) for X.509v3.
 *
 * @see <A HREF="https://docs.oracle.com/javase/1.5.0/docs/api/java/security/cert/X509Extension.html">
 * Interface X509Extension</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/x509/XMLX509SKI.java
package com.sun.org.apache.xml.internal.security.keys.content.x509;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/x509/XMLX509SKI.java
    public String getBaseLocalName() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/x509/XMLX509SKI.java
    public boolean equals(Object obj) {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/x509/XMLX509SKI.java
        byte skidValue[] = new byte[extensionValue.length - 4];

        /**
         * Strip away first four bytes from the extensionValue
         * The first two bytes are the tag and length of the extensionValue
         * OCTET STRING, and the next two bytes are the tag and length of
         * the ski OCTET STRING.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/x509/XMLX509SKI.java
    public static byte[] getSKIBytesFromCert(X509Certificate cert)

    /**
     * Method getSKIBytesFromCert
     *
     * @param cert
     * @return ski bytes from the given certificate
     *
     * @throws XMLSecurityException
     * @see java.security.cert.X509Extension#getExtensionValue(java.lang.String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/x509/XMLX509SKI.java
    public byte[] getSKIBytes() throws XMLSecurityException {

    /**
     * Method getSKIBytes
     *
     * @return the skibytes
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/x509/XMLX509SKI.java
    public XMLX509SKI(Element element, String BaseURI) throws XMLSecurityException {

    /**
     * Constructor XMLX509SKI
     *
     * @param element
     * @param BaseURI
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/x509/XMLX509SKI.java
    public XMLX509SKI(Document doc, X509Certificate x509certificate)

    /**
     * Constructor XMLX509SKI
     *
     * @param doc
     * @param x509certificate
     * @throws XMLSecurityException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/x509/XMLX509SKI.java
    public XMLX509SKI(Document doc, byte[] skiBytes) {

    /**
     * Constructor X509SKI
     *
     * @param doc
     * @param skiBytes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/x509/XMLX509SKI.java
    public static final String SKI_OID = "2.5.29.14";

    /**
     * <CODE>SubjectKeyIdentifier (id-ce-subjectKeyIdentifier) (2.5.29.14)</CODE>:
     * This extension identifies the public key being certified. It enables
     * distinct keys used by the same subject to be differentiated
     * (e.g., as key updating occurs).
     * <BR />
     * A key identifier shall be unique with respect to all key identifiers
     * for the subject with which it is used. This extension is always non-critical.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/x509/XMLX509SKI.java
    private static java.util.logging.Logger log =

    /** {@link org.apache.commons.logging} logging facility */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/x509/XMLX509SKI.java
public class XMLX509SKI extends SignatureElementProxy implements XMLX509DataContent {

/**
 * Handles SubjectKeyIdentifier (SKI) for X.509v3.
 *
 * @see <A HREF="https://docs.oracle.com/javase/1.5.0/docs/api/java/security/cert/X509Extension.html">
 * Interface X509Extension</A>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/keys/content/x509/XMLX509SKI.java
package com.sun.org.apache.xml.internal.security.keys.content.x509;

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
