_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/XMLCipherInput.java
    private byte[] getDecryptBytes() throws XMLEncryptionException {

    /**
     * Internal method to get bytes in decryption mode
     * @return the decrypted bytes
     * @throws XMLEncryptionException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/XMLCipherInput.java
    public byte[] getBytes() throws XMLEncryptionException {

    /**
     * Dereferences the input and returns it as a single byte array.
     *
     * @throws XMLEncryptionException
     * @return The decripted bytes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/XMLCipherInput.java
    public void setSecureValidation(boolean secureValidation) {

    /**
     * Set whether secure validation is enabled or not. The default is false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/XMLCipherInput.java
    public XMLCipherInput(EncryptedType input) throws XMLEncryptionException {

    /**
     * Constructor for processing encrypted octets
     *
     * @param input The <code>EncryptedType</code> object to read
     * the bytes from.
     * @throws XMLEncryptionException {@link XMLEncryptionException}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/XMLCipherInput.java
    public XMLCipherInput(CipherData data) throws XMLEncryptionException {

    /**
     * Constructor for processing encrypted octets
     *
     * @param data The <code>CipherData</code> object to read the bytes from
     * @throws XMLEncryptionException {@link XMLEncryptionException}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/XMLCipherInput.java
    private int mode;

    /** MODES */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/XMLCipherInput.java
    private CipherData cipherData;

    /** The data we are working with */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/XMLCipherInput.java
public class XMLCipherInput {

/**
 * <code>XMLCipherInput</code> is used to wrap input passed into the
 * XMLCipher encryption operations.
 *
 * In decryption mode, it takes a <code>CipherData</code> object and allows
 * callers to dereference the CipherData into the encrypted bytes that it
 * actually represents.  This takes care of all base64 encoding etc.
 *
 * While primarily an internal class, this can be used by applications to
 * quickly and easily retrieve the encrypted bytes from an EncryptedType
 * object
 *
 * @author Berin Lautenbach
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/XMLCipherInput.java
package com.sun.org.apache.xml.internal.security.encryption;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/XMLCipherInput.java
    private byte[] getDecryptBytes() throws XMLEncryptionException {

    /**
     * Internal method to get bytes in decryption mode
     * @return the decrypted bytes
     * @throws XMLEncryptionException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/XMLCipherInput.java
    public byte[] getBytes() throws XMLEncryptionException {

    /**
     * Dereferences the input and returns it as a single byte array.
     *
     * @throws XMLEncryptionException
     * @return The decripted bytes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/XMLCipherInput.java
    public void setSecureValidation(boolean secureValidation) {

    /**
     * Set whether secure validation is enabled or not. The default is false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/XMLCipherInput.java
    public XMLCipherInput(EncryptedType input) throws XMLEncryptionException {

    /**
     * Constructor for processing encrypted octets
     *
     * @param input The <code>EncryptedType</code> object to read
     * the bytes from.
     * @throws XMLEncryptionException {@link XMLEncryptionException}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/XMLCipherInput.java
    public XMLCipherInput(CipherData data) throws XMLEncryptionException {

    /**
     * Constructor for processing encrypted octets
     *
     * @param data The <code>CipherData</code> object to read the bytes from
     * @throws XMLEncryptionException {@link XMLEncryptionException}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/XMLCipherInput.java
    private int mode;

    /** MODES */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/XMLCipherInput.java
    private CipherData cipherData;

    /** The data we are working with */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/XMLCipherInput.java
public class XMLCipherInput {

/**
 * <code>XMLCipherInput</code> is used to wrap input passed into the
 * XMLCipher encryption operations.
 *
 * In decryption mode, it takes a <code>CipherData</code> object and allows
 * callers to dereference the CipherData into the encrypted bytes that it
 * actually represents.  This takes care of all base64 encoding etc.
 *
 * While primarily an internal class, this can be used by applications to
 * quickly and easily retrieve the encrypted bytes from an EncryptedType
 * object
 *
 * @author Berin Lautenbach
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/encryption/XMLCipherInput.java
package com.sun.org.apache.xml.internal.security.encryption;

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
