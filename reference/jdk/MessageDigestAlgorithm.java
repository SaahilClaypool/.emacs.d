_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public String getBaseLocalName() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public String getBaseNamespace() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public void update(byte buf[], int offset, int len) {

    /**
     * Proxy method for {@link java.security.MessageDigest#update(byte[], int, int)}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @param buf
     * @param offset
     * @param len
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public void update(byte input) {

    /**
     * Proxy method for {@link java.security.MessageDigest#update(byte)}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @param input
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public void update(byte[] input) {

    /**
     * Proxy method for {@link java.security.MessageDigest#update(byte[])}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @param input
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public void reset() {

    /**
     * Proxy method for {@link java.security.MessageDigest#reset}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public int getDigestLength() {

    /**
     * Proxy method for {@link java.security.MessageDigest#getDigestLength}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @return the result of the {@link java.security.MessageDigest#getDigestLength} method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public java.security.Provider getJCEProvider() {

    /**
     * Proxy method for {@link java.security.MessageDigest#getProvider}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @return the result of the {@link java.security.MessageDigest#getProvider} method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public String getJCEAlgorithmString() {

    /**
     * Proxy method for {@link java.security.MessageDigest#getAlgorithm}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @return the result of the {@link java.security.MessageDigest#getAlgorithm} method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public int digest(byte buf[], int offset, int len) throws java.security.DigestException {

    /**
     * Proxy method for {@link java.security.MessageDigest#digest(byte[], int, int)}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @param buf
     * @param offset
     * @param len
     * @return the result of the {@link java.security.MessageDigest#digest(byte[], int, int)} method
     * @throws java.security.DigestException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public byte[] digest(byte input[]) {

    /**
     * Proxy method for {@link java.security.MessageDigest#digest(byte[])}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @param input
     * @return the result of the {@link java.security.MessageDigest#digest(byte[])} method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public byte[] digest() {

    /**
     * Proxy method for {@link java.security.MessageDigest#digest()}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @return the result of the {@link java.security.MessageDigest#digest()} method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public static boolean isEqual(byte[] digesta, byte[] digestb) {

    /**
     * Proxy method for {@link java.security.MessageDigest#isEqual}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @param digesta
     * @param digestb
     * @return the result of the {@link java.security.MessageDigest#isEqual} method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public java.security.MessageDigest getAlgorithm() {

    /**
     * Returns the actual {@link java.security.MessageDigest} algorithm object
     *
     * @return the actual {@link java.security.MessageDigest} algorithm object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public static MessageDigestAlgorithm getInstance(
        Document doc, String algorithmURI
    ) throws XMLSignatureException {

    /**
     * Factory method for constructing a message digest algorithm by name.
     *
     * @param doc
     * @param algorithmURI
     * @return The MessageDigestAlgorithm element to attach in document and to digest
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    private MessageDigestAlgorithm(Document doc, String algorithmURI)

    /**
     * Constructor for the brave who pass their own message digest algorithms and the
     * corresponding URI.
     * @param doc
     * @param algorithmURI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    private final MessageDigest algorithm;

    /** Field algorithm stores the actual {@link java.security.MessageDigest} */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public static final String ALGO_ID_DIGEST_RIPEMD160 =

    /** Message Digest - OPTIONAL RIPEMD-160*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public static final String ALGO_ID_DIGEST_SHA512 =

    /** Message Digest - OPTIONAL SHA512*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public static final String ALGO_ID_DIGEST_SHA384 =

    /** Message Digest - OPTIONAL SHA384*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public static final String ALGO_ID_DIGEST_SHA1 = Constants.SignatureSpecNS + "sha1";

    /** Digest - Required SHA1*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public static final String ALGO_ID_DIGEST_NOT_RECOMMENDED_MD5 =

    /** Message Digest - NOT RECOMMENDED MD5*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
public class MessageDigestAlgorithm extends Algorithm {

/**
 * Digest Message wrapper & selector class.
 *
 * <pre>
 * MessageDigestAlgorithm.getInstance()
 * </pre>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
package com.sun.org.apache.xml.internal.security.algorithms;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public String getBaseLocalName() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public String getBaseNamespace() {

    /** @inheritDoc */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public void update(byte buf[], int offset, int len) {

    /**
     * Proxy method for {@link java.security.MessageDigest#update(byte[], int, int)}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @param buf
     * @param offset
     * @param len
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public void update(byte input) {

    /**
     * Proxy method for {@link java.security.MessageDigest#update(byte)}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @param input
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public void update(byte[] input) {

    /**
     * Proxy method for {@link java.security.MessageDigest#update(byte[])}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @param input
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public void reset() {

    /**
     * Proxy method for {@link java.security.MessageDigest#reset}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public int getDigestLength() {

    /**
     * Proxy method for {@link java.security.MessageDigest#getDigestLength}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @return the result of the {@link java.security.MessageDigest#getDigestLength} method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public java.security.Provider getJCEProvider() {

    /**
     * Proxy method for {@link java.security.MessageDigest#getProvider}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @return the result of the {@link java.security.MessageDigest#getProvider} method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public String getJCEAlgorithmString() {

    /**
     * Proxy method for {@link java.security.MessageDigest#getAlgorithm}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @return the result of the {@link java.security.MessageDigest#getAlgorithm} method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public int digest(byte buf[], int offset, int len) throws java.security.DigestException {

    /**
     * Proxy method for {@link java.security.MessageDigest#digest(byte[], int, int)}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @param buf
     * @param offset
     * @param len
     * @return the result of the {@link java.security.MessageDigest#digest(byte[], int, int)} method
     * @throws java.security.DigestException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public byte[] digest(byte input[]) {

    /**
     * Proxy method for {@link java.security.MessageDigest#digest(byte[])}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @param input
     * @return the result of the {@link java.security.MessageDigest#digest(byte[])} method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public byte[] digest() {

    /**
     * Proxy method for {@link java.security.MessageDigest#digest()}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @return the result of the {@link java.security.MessageDigest#digest()} method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public static boolean isEqual(byte[] digesta, byte[] digestb) {

    /**
     * Proxy method for {@link java.security.MessageDigest#isEqual}
     * which is executed on the internal {@link java.security.MessageDigest} object.
     *
     * @param digesta
     * @param digestb
     * @return the result of the {@link java.security.MessageDigest#isEqual} method
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public java.security.MessageDigest getAlgorithm() {

    /**
     * Returns the actual {@link java.security.MessageDigest} algorithm object
     *
     * @return the actual {@link java.security.MessageDigest} algorithm object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public static MessageDigestAlgorithm getInstance(
        Document doc, String algorithmURI
    ) throws XMLSignatureException {

    /**
     * Factory method for constructing a message digest algorithm by name.
     *
     * @param doc
     * @param algorithmURI
     * @return The MessageDigestAlgorithm element to attach in document and to digest
     * @throws XMLSignatureException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    private MessageDigestAlgorithm(Document doc, String algorithmURI)

    /**
     * Constructor for the brave who pass their own message digest algorithms and the
     * corresponding URI.
     * @param doc
     * @param algorithmURI
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    private final MessageDigest algorithm;

    /** Field algorithm stores the actual {@link java.security.MessageDigest} */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public static final String ALGO_ID_DIGEST_RIPEMD160 =

    /** Message Digest - OPTIONAL RIPEMD-160*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public static final String ALGO_ID_DIGEST_SHA512 =

    /** Message Digest - OPTIONAL SHA512*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public static final String ALGO_ID_DIGEST_SHA384 =

    /** Message Digest - OPTIONAL SHA384*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public static final String ALGO_ID_DIGEST_SHA1 = Constants.SignatureSpecNS + "sha1";

    /** Digest - Required SHA1*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
    public static final String ALGO_ID_DIGEST_NOT_RECOMMENDED_MD5 =

    /** Message Digest - NOT RECOMMENDED MD5*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
public class MessageDigestAlgorithm extends Algorithm {

/**
 * Digest Message wrapper & selector class.
 *
 * <pre>
 * MessageDigestAlgorithm.getInstance()
 * </pre>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/algorithms/MessageDigestAlgorithm.java
package com.sun.org.apache.xml.internal.security.algorithms;

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
