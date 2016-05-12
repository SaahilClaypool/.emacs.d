_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/util/Base64.java
    protected static int removeWhiteSpace(char[] data) {

    /**
     * remove WhiteSpace from MIME containing encoded Base64 data.
     *
     * @param data  the byte array of base64 data (with WS)
     * @return      the new length
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/util/Base64.java
    public static byte[] decode(String encoded) {

    /**
     * Decodes Base64 data into octects
     *
     * @param encoded string containing Base64 data
     * @return Array containind decoded data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/util/Base64.java
    public static String encode(byte[] binaryData) {

    /**
     * Encodes hex octects into Base64
     *
     * @param binaryData Array containing binaryData
     * @return Encoded Base64 array
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/util/Base64.java
public final class  Base64 {

/**
 * This class provides encode/decode for RFC 2045 Base64 as
 * defined by RFC 2045, N. Freed and N. Borenstein.
 * RFC 2045: Multipurpose Internet Mail Extensions (MIME)
 * Part One: Format of Internet Message Bodies. Reference
 * 1996 Available at: http://www.ietf.org/rfc/rfc2045.txt
 * This class is used by XML Schema binary format validation
 *
 * This implementation does not encode/decode streaming
 * data. You need the data that you will encode/decode
 * already on a byte arrray.
 *
 * @xerces.internal
 *
 * @author Jeffrey Rodriguez
 * @author Sandy Gao
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    protected static final int removeWhiteSpace(byte[] data) {

    /**
     * remove WhiteSpace from MIME containing encoded Base64 data.
     *
     * @param data  the byte array of base64 data (with WS)
     * @return      the new length
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final void decode(InputStream is, OutputStream os)

    /**
     * Decodes Base64 data into  outputstream
     *
     * @param is containing Base64 data
     * @param os the outputstream
     * @throws IOException
     * @throws Base64DecodingException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final void decode(byte[] base64Data, OutputStream os)

    /**
     * Decodes Base64 data into outputstream
     *
     * @param base64Data Byte array containing Base64 data
     * @param os the outputstream
     * @throws IOException
     * @throws Base64DecodingException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final void decode(String base64Data, OutputStream os)

    /**
     * Decodes Base64 data into outputstream
     *
     * @param base64Data String containing Base64 data
     * @param os the outputstream
     * @throws IOException
     * @throws Base64DecodingException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final byte[] decode(String encoded) throws Base64DecodingException {

    /**
     * Decodes Base64 data into octets
     *
     * @param encoded String containing base64 encoded data
     * @return byte array containing the decoded data
     * @throws Base64DecodingException if there is a problem decoding the data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    /**

    /**
     * Encodes hex octets into Base64
     *
     * @param binaryData Array containing binaryData
     * @return Encoded Base64 array
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final byte[] decode(BufferedReader reader)

    /**
     * Base64 decode the lines from the reader and return an InputStream
     * with the bytes.
     *
     * @param reader
     * @return InputStream with the decoded bytes
     * @exception IOException passes what the reader throws
     * @throws IOException
     * @throws Base64DecodingException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final String encode(byte[] binaryData) {

    /**
     * Encode a byte array and fold lines at the standard 76th character unless
     * ignore line breaks property is set.
     *
     * @param binaryData <code>byte[]<code> to be base64 encoded
     * @return the <code>String<code> with encoded data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final byte[] decode(byte[] base64) throws Base64DecodingException  {

    /**
     * Method decode
     *
     * @param base64
     * @return the UTF bytes of the base64
     * @throws Base64DecodingException
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final Element encodeToElement(Document doc, String localName, byte[] bytes) {

    /**
     * Method encodeToElement
     *
     * @param doc
     * @param localName
     * @param bytes
     * @return an Element with the base64 encoded in the text.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final byte[] decode(Element element) throws Base64DecodingException {

    /**
     * Method decode
     *
     * Takes the <CODE>Text</CODE> children of the Element and interprets
     * them as input for the <CODE>Base64.decode()</CODE> function.
     *
     * @param element
     * @return the byte obtained of the decoding the element
     * $todo$ not tested yet
     * @throws Base64DecodingException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final void fillElementWithBigInteger(Element element, BigInteger biginteger) {

    /**
     * This method takes an (empty) Element and a BigInteger and adds the
     * base64 encoded BigInteger to the Element.
     *
     * @param element
     * @param biginteger
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final BigInteger decodeBigIntegerFromText(Text text)

    /**
     * Method decodeBigIntegerFromText
     *
     * @param text
     * @return the biginter obtained from the text node
     * @throws Base64DecodingException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final BigInteger decodeBigIntegerFromElement(Element element)

    /**
     * Method decodeBigIntegerFromElement
     *
     * @param element
     * @return the biginteger obtained from the node
     * @throws Base64DecodingException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final  byte[] encode(BigInteger big, int bitlen) {

    /**
     * Returns a byte-array representation of a <code>{@link BigInteger}<code>.
     * No sign-bit is output.
     *
     * <b>N.B.:</B> <code>{@link BigInteger}<code>'s toByteArray
     * returns eventually longer arrays because of the leading sign-bit.
     *
     * @param big <code>BigInteger<code> to be converted
     * @param bitlen <code>int<code> the desired length in bits of the representation
     * @return a byte array with <code>bitlen</code> bits of <code>big</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final String encode(BigInteger big) {

    /**
     * Encode in Base64 the given <code>{@link BigInteger}<code>.
     *
     * @param big
     * @return String with Base64 encoding
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    static final byte[] getBytes(BigInteger big, int bitlen) {

    /**
     * Returns a byte-array representation of a <code>{@link BigInteger}<code>.
     * No sign-bit is output.
     *
     * <b>N.B.:</B> <code>{@link BigInteger}<code>'s toByteArray
     * returns eventually longer arrays because of the leading sign-bit.
     *
     * @param big <code>BigInteger<code> to be converted
     * @param bitlen <code>int<code> the desired length in bits of the representation
     * @return a byte array with <code>bitlen</code> bits of <code>big</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final int BASE64DEFAULTLENGTH = 76;

    /** Field BASE64DEFAULTLENGTH */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
public class Base64 {

/**
 * Implementation of MIME's Base64 encoding and decoding conversions.
 * Optimized code. (raw version taken from oreilly.jonathan.util,
 * and currently org.apache.xerces.ds.util.Base64)
 *
 * @author Raul Benito(Of the xerces copy, and little adaptations).
 * @author Anli Shundi
 * @author Christian Geuer-Pollmann
 * @see <A HREF="ftp://ftp.isi.edu/in-notes/rfc2045.txt">RFC 2045</A>
 * @see com.sun.org.apache.xml.internal.security.transforms.implementations.TransformBase64Decode
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
package com.sun.org.apache.xml.internal.security.utils;

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/util/Base64.java
    protected static int removeWhiteSpace(char[] data) {

    /**
     * remove WhiteSpace from MIME containing encoded Base64 data.
     *
     * @param data  the byte array of base64 data (with WS)
     * @return      the new length
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/util/Base64.java
    public static byte[] decode(String encoded) {

    /**
     * Decodes Base64 data into octects
     *
     * @param encoded string containing Base64 data
     * @return Array containind decoded data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/util/Base64.java
    public static String encode(byte[] binaryData) {

    /**
     * Encodes hex octects into Base64
     *
     * @param binaryData Array containing binaryData
     * @return Encoded Base64 array
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/util/Base64.java
public final class  Base64 {

/**
 * This class provides encode/decode for RFC 2045 Base64 as
 * defined by RFC 2045, N. Freed and N. Borenstein.
 * RFC 2045: Multipurpose Internet Mail Extensions (MIME)
 * Part One: Format of Internet Message Bodies. Reference
 * 1996 Available at: http://www.ietf.org/rfc/rfc2045.txt
 * This class is used by XML Schema binary format validation
 *
 * This implementation does not encode/decode streaming
 * data. You need the data that you will encode/decode
 * already on a byte arrray.
 *
 * @xerces.internal
 *
 * @author Jeffrey Rodriguez
 * @author Sandy Gao
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    protected static final int removeWhiteSpace(byte[] data) {

    /**
     * remove WhiteSpace from MIME containing encoded Base64 data.
     *
     * @param data  the byte array of base64 data (with WS)
     * @return      the new length
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final void decode(InputStream is, OutputStream os)

    /**
     * Decodes Base64 data into  outputstream
     *
     * @param is containing Base64 data
     * @param os the outputstream
     * @throws IOException
     * @throws Base64DecodingException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final void decode(byte[] base64Data, OutputStream os)

    /**
     * Decodes Base64 data into outputstream
     *
     * @param base64Data Byte array containing Base64 data
     * @param os the outputstream
     * @throws IOException
     * @throws Base64DecodingException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final void decode(String base64Data, OutputStream os)

    /**
     * Decodes Base64 data into outputstream
     *
     * @param base64Data String containing Base64 data
     * @param os the outputstream
     * @throws IOException
     * @throws Base64DecodingException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final byte[] decode(String encoded) throws Base64DecodingException {

    /**
     * Decodes Base64 data into octets
     *
     * @param encoded String containing base64 encoded data
     * @return byte array containing the decoded data
     * @throws Base64DecodingException if there is a problem decoding the data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    /**

    /**
     * Encodes hex octets into Base64
     *
     * @param binaryData Array containing binaryData
     * @return Encoded Base64 array
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final byte[] decode(BufferedReader reader)

    /**
     * Base64 decode the lines from the reader and return an InputStream
     * with the bytes.
     *
     * @param reader
     * @return InputStream with the decoded bytes
     * @exception IOException passes what the reader throws
     * @throws IOException
     * @throws Base64DecodingException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final String encode(byte[] binaryData) {

    /**
     * Encode a byte array and fold lines at the standard 76th character unless
     * ignore line breaks property is set.
     *
     * @param binaryData <code>byte[]<code> to be base64 encoded
     * @return the <code>String<code> with encoded data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final byte[] decode(byte[] base64) throws Base64DecodingException  {

    /**
     * Method decode
     *
     * @param base64
     * @return the UTF bytes of the base64
     * @throws Base64DecodingException
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final Element encodeToElement(Document doc, String localName, byte[] bytes) {

    /**
     * Method encodeToElement
     *
     * @param doc
     * @param localName
     * @param bytes
     * @return an Element with the base64 encoded in the text.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final byte[] decode(Element element) throws Base64DecodingException {

    /**
     * Method decode
     *
     * Takes the <CODE>Text</CODE> children of the Element and interprets
     * them as input for the <CODE>Base64.decode()</CODE> function.
     *
     * @param element
     * @return the byte obtained of the decoding the element
     * $todo$ not tested yet
     * @throws Base64DecodingException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final void fillElementWithBigInteger(Element element, BigInteger biginteger) {

    /**
     * This method takes an (empty) Element and a BigInteger and adds the
     * base64 encoded BigInteger to the Element.
     *
     * @param element
     * @param biginteger
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final BigInteger decodeBigIntegerFromText(Text text)

    /**
     * Method decodeBigIntegerFromText
     *
     * @param text
     * @return the biginter obtained from the text node
     * @throws Base64DecodingException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final BigInteger decodeBigIntegerFromElement(Element element)

    /**
     * Method decodeBigIntegerFromElement
     *
     * @param element
     * @return the biginteger obtained from the node
     * @throws Base64DecodingException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final  byte[] encode(BigInteger big, int bitlen) {

    /**
     * Returns a byte-array representation of a <code>{@link BigInteger}<code>.
     * No sign-bit is output.
     *
     * <b>N.B.:</B> <code>{@link BigInteger}<code>'s toByteArray
     * returns eventually longer arrays because of the leading sign-bit.
     *
     * @param big <code>BigInteger<code> to be converted
     * @param bitlen <code>int<code> the desired length in bits of the representation
     * @return a byte array with <code>bitlen</code> bits of <code>big</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final String encode(BigInteger big) {

    /**
     * Encode in Base64 the given <code>{@link BigInteger}<code>.
     *
     * @param big
     * @return String with Base64 encoding
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    static final byte[] getBytes(BigInteger big, int bitlen) {

    /**
     * Returns a byte-array representation of a <code>{@link BigInteger}<code>.
     * No sign-bit is output.
     *
     * <b>N.B.:</B> <code>{@link BigInteger}<code>'s toByteArray
     * returns eventually longer arrays because of the leading sign-bit.
     *
     * @param big <code>BigInteger<code> to be converted
     * @param bitlen <code>int<code> the desired length in bits of the representation
     * @return a byte array with <code>bitlen</code> bits of <code>big</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
    public static final int BASE64DEFAULTLENGTH = 76;

    /** Field BASE64DEFAULTLENGTH */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
public class Base64 {

/**
 * Implementation of MIME's Base64 encoding and decoding conversions.
 * Optimized code. (raw version taken from oreilly.jonathan.util,
 * and currently org.apache.xerces.ds.util.Base64)
 *
 * @author Raul Benito(Of the xerces copy, and little adaptations).
 * @author Anli Shundi
 * @author Christian Geuer-Pollmann
 * @see <A HREF="ftp://ftp.isi.edu/in-notes/rfc2045.txt">RFC 2045</A>
 * @see com.sun.org.apache.xml.internal.security.transforms.implementations.TransformBase64Decode
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/security/utils/Base64.java
package com.sun.org.apache.xml.internal.security.utils;

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
c:/Users/saahil claypool/Documents/JDKSource//java/util/Base64.java
        public InputStream wrap(InputStream is) {

        /**
         * Returns an input stream for decoding {@link Base64} encoded byte stream.
         *
         * <p> The {@code read}  methods of the returned {@code InputStream} will
         * throw {@code IOException} when reading bytes that cannot be decoded.
         *
         * <p> Closing the returned input stream will close the underlying
         * input stream.
         *
         * @param   is
         *          the input stream
         *
         * @return  the input stream for decoding the specified Base64 encoded
         *          byte stream
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Base64.java
        public ByteBuffer decode(ByteBuffer buffer) {

        /**
         * Decodes all bytes from the input byte buffer using the {@link Base64}
         * encoding scheme, writing the results into a newly-allocated ByteBuffer.
         *
         * <p> Upon return, the source buffer's position will be updated to
         * its limit; its limit will not have been changed. The returned
         * output buffer's position will be zero and its limit will be the
         * number of resulting decoded bytes
         *
         * <p> {@code IllegalArgumentException} is thrown if the input buffer
         * is not in valid Base64 encoding scheme. The position of the input
         * buffer will not be advanced in this case.
         *
         * @param   buffer
         *          the ByteBuffer to decode
         *
         * @return  A newly-allocated byte buffer containing the decoded bytes
         *
         * @throws  IllegalArgumentException
         *          if {@code src} is not in valid Base64 scheme.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Base64.java
        public int decode(byte[] src, byte[] dst) {

        /**
         * Decodes all bytes from the input byte array using the {@link Base64}
         * encoding scheme, writing the results into the given output byte array,
         * starting at offset 0.
         *
         * <p> It is the responsibility of the invoker of this method to make
         * sure the output byte array {@code dst} has enough space for decoding
         * all bytes from the input byte array. No bytes will be be written to
         * the output byte array if the output byte array is not big enough.
         *
         * <p> If the input byte array is not in valid Base64 encoding scheme
         * then some bytes may have been written to the output byte array before
         * IllegalargumentException is thrown.
         *
         * @param   src
         *          the byte array to decode
         * @param   dst
         *          the output byte array
         *
         * @return  The number of bytes written to the output byte array
         *
         * @throws  IllegalArgumentException
         *          if {@code src} is not in valid Base64 scheme, or {@code dst}
         *          does not have enough space for decoding all input bytes.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Base64.java
        public byte[] decode(String src) {

        /**
         * Decodes a Base64 encoded String into a newly-allocated byte array
         * using the {@link Base64} encoding scheme.
         *
         * <p> An invocation of this method has exactly the same effect as invoking
         * {@code decode(src.getBytes(StandardCharsets.ISO_8859_1))}
         *
         * @param   src
         *          the string to decode
         *
         * @return  A newly-allocated byte array containing the decoded bytes.
         *
         * @throws  IllegalArgumentException
         *          if {@code src} is not in valid Base64 scheme
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Base64.java
        public byte[] decode(byte[] src) {

        /**
         * Decodes all bytes from the input byte array using the {@link Base64}
         * encoding scheme, writing the results into a newly-allocated output
         * byte array. The returned byte array is of the length of the resulting
         * bytes.
         *
         * @param   src
         *          the byte array to decode
         *
         * @return  A newly-allocated byte array containing the decoded bytes.
         *
         * @throws  IllegalArgumentException
         *          if {@code src} is not in valid Base64 scheme
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Base64.java
        private static final int[] fromBase64URL = new int[256];

        /**
         * Lookup table for decoding "URL and Filename safe Base64 Alphabet"
         * as specified in Table2 of the RFC 4648.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Base64.java
        private static final int[] fromBase64 = new int[256];

        /**
         * Lookup table for decoding unicode characters drawn from the
         * "Base64 Alphabet" (as specified in Table 1 of RFC 2045) into
         * their 6-bit positive integer equivalents.  Characters that
         * are not in the Base64 alphabet but fall within the bounds of
         * the array are encoded to -1.
         *
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Base64.java
    public static class Decoder {

    /**
     * This class implements a decoder for decoding byte data using the
     * Base64 encoding scheme as specified in RFC 4648 and RFC 2045.
     *
     * <p> The Base64 padding character {@code '='} is accepted and
     * interpreted as the end of the encoded byte data, but is not
     * required. So if the final unit of the encoded byte data only has
     * two or three Base64 characters (without the corresponding padding
     * character(s) padded), they are decoded as if followed by padding
     * character(s). If there is a padding character present in the
     * final unit, the correct number of padding character(s) must be
     * present, otherwise {@code IllegalArgumentException} (
     * {@code IOException} when reading from a Base64 stream) is thrown
     * during decoding.
     *
     * <p> Instances of {@link Decoder} class are safe for use by
     * multiple concurrent threads.
     *
     * <p> Unless otherwise noted, passing a {@code null} argument to
     * a method of this class will cause a
     * {@link java.lang.NullPointerException NullPointerException} to
     * be thrown.
     *
     * @see     Encoder
     * @since   1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Base64.java
        public Encoder withoutPadding() {

        /**
         * Returns an encoder instance that encodes equivalently to this one,
         * but without adding any padding character at the end of the encoded
         * byte data.
         *
         * <p> The encoding scheme of this encoder instance is unaffected by
         * this invocation. The returned encoder instance should be used for
         * non-padding encoding operation.
         *
         * @return an equivalent encoder that encodes without adding any
         *         padding character at the end
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Base64.java
        public OutputStream wrap(OutputStream os) {

        /**
         * Wraps an output stream for encoding byte data using the {@link Base64}
         * encoding scheme.
         *
         * <p> It is recommended to promptly close the returned output stream after
         * use, during which it will flush all possible leftover bytes to the underlying
         * output stream. Closing the returned output stream will close the underlying
         * output stream.
         *
         * @param   os
         *          the output stream.
         * @return  the output stream for encoding the byte data into the
         *          specified Base64 encoded format
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Base64.java
        public ByteBuffer encode(ByteBuffer buffer) {

        /**
         * Encodes all remaining bytes from the specified byte buffer into
         * a newly-allocated ByteBuffer using the {@link Base64} encoding
         * scheme.
         *
         * Upon return, the source buffer's position will be updated to
         * its limit; its limit will not have been changed. The returned
         * output buffer's position will be zero and its limit will be the
         * number of resulting encoded bytes.
         *
         * @param   buffer
         *          the source ByteBuffer to encode
         * @return  A newly-allocated byte buffer containing the encoded bytes.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Base64.java
        @SuppressWarnings("deprecation")

        /**
         * Encodes the specified byte array into a String using the {@link Base64}
         * encoding scheme.
         *
         * <p> This method first encodes all input bytes into a base64 encoded
         * byte array and then constructs a new String by using the encoded byte
         * array and the {@link java.nio.charset.StandardCharsets#ISO_8859_1
         * ISO-8859-1} charset.
         *
         * <p> In other words, an invocation of this method has exactly the same
         * effect as invoking
         * {@code new String(encode(src), StandardCharsets.ISO_8859_1)}.
         *
         * @param   src
         *          the byte array to encode
         * @return  A String containing the resulting Base64 encoded characters
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Base64.java
        public int encode(byte[] src, byte[] dst) {

        /**
         * Encodes all bytes from the specified byte array using the
         * {@link Base64} encoding scheme, writing the resulting bytes to the
         * given output byte array, starting at offset 0.
         *
         * <p> It is the responsibility of the invoker of this method to make
         * sure the output byte array {@code dst} has enough space for encoding
         * all bytes from the input byte array. No bytes will be written to the
         * output byte array if the output byte array is not big enough.
         *
         * @param   src
         *          the byte array to encode
         * @param   dst
         *          the output byte array
         * @return  The number of bytes written to the output byte array
         *
         * @throws  IllegalArgumentException if {@code dst} does not have enough
         *          space for encoding all input bytes.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Base64.java
        public byte[] encode(byte[] src) {

        /**
         * Encodes all bytes from the specified byte array into a newly-allocated
         * byte array using the {@link Base64} encoding scheme. The returned byte
         * array is of the length of the resulting bytes.
         *
         * @param   src
         *          the byte array to encode
         * @return  A newly-allocated byte array containing the resulting
         *          encoded bytes.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Base64.java
        private static final char[] toBase64URL = {

        /**
         * It's the lookup table for "URL and Filename safe Base64" as specified
         * in Table 2 of the RFC 4648, with the '+' and '/' changed to '-' and
         * '_'. This table is used when BASE64_URL is specified.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Base64.java
        private static final char[] toBase64 = {

        /**
         * This array is a lookup table that translates 6-bit positive integer
         * index values into their "Base64 Alphabet" equivalents as specified
         * in "Table 1: The Base64 Alphabet" of RFC 2045 (and RFC 4648).
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Base64.java
    public static class Encoder {

    /**
     * This class implements an encoder for encoding byte data using
     * the Base64 encoding scheme as specified in RFC 4648 and RFC 2045.
     *
     * <p> Instances of {@link Encoder} class are safe for use by
     * multiple concurrent threads.
     *
     * <p> Unless otherwise noted, passing a {@code null} argument to
     * a method of this class will cause a
     * {@link java.lang.NullPointerException NullPointerException} to
     * be thrown.
     *
     * @see     Decoder
     * @since   1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Base64.java
    public static Decoder getMimeDecoder() {

    /**
     * Returns a {@link Decoder} that decodes using the
     * <a href="#mime">MIME</a> type base64 decoding scheme.
     *
     * @return  A Base64 decoder.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Base64.java
    public static Decoder getUrlDecoder() {

    /**
     * Returns a {@link Decoder} that decodes using the
     * <a href="#url">URL and Filename safe</a> type base64
     * encoding scheme.
     *
     * @return  A Base64 decoder.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Base64.java
    public static Decoder getDecoder() {

    /**
     * Returns a {@link Decoder} that decodes using the
     * <a href="#basic">Basic</a> type base64 encoding scheme.
     *
     * @return  A Base64 decoder.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Base64.java
    public static Encoder getMimeEncoder(int lineLength, byte[] lineSeparator) {

    /**
     * Returns a {@link Encoder} that encodes using the
     * <a href="#mime">MIME</a> type base64 encoding scheme
     * with specified line length and line separators.
     *
     * @param   lineLength
     *          the length of each output line (rounded down to nearest multiple
     *          of 4). If {@code lineLength <= 0} the output will not be separated
     *          in lines
     * @param   lineSeparator
     *          the line separator for each output line
     *
     * @return  A Base64 encoder.
     *
     * @throws  IllegalArgumentException if {@code lineSeparator} includes any
     *          character of "The Base64 Alphabet" as specified in Table 1 of
     *          RFC 2045.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Base64.java
    public static Encoder getMimeEncoder() {

    /**
     * Returns a {@link Encoder} that encodes using the
     * <a href="#mime">MIME</a> type base64 encoding scheme.
     *
     * @return  A Base64 encoder.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Base64.java
    public static Encoder getUrlEncoder() {

    /**
     * Returns a {@link Encoder} that encodes using the
     * <a href="#url">URL and Filename safe</a> type base64
     * encoding scheme.
     *
     * @return  A Base64 encoder.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Base64.java
    public static Encoder getEncoder() {

    /**
     * Returns a {@link Encoder} that encodes using the
     * <a href="#basic">Basic</a> type base64 encoding scheme.
     *
     * @return  A Base64 encoder.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Base64.java
public class Base64 {

/**
 * This class consists exclusively of static methods for obtaining
 * encoders and decoders for the Base64 encoding scheme. The
 * implementation of this class supports the following types of Base64
 * as specified in
 * <a href="http://www.ietf.org/rfc/rfc4648.txt">RFC 4648</a> and
 * <a href="http://www.ietf.org/rfc/rfc2045.txt">RFC 2045</a>.
 *
 * <ul>
 * <li><a name="basic"><b>Basic</b></a>
 * <p> Uses "The Base64 Alphabet" as specified in Table 1 of
 *     RFC 4648 and RFC 2045 for encoding and decoding operation.
 *     The encoder does not add any line feed (line separator)
 *     character. The decoder rejects data that contains characters
 *     outside the base64 alphabet.</p></li>
 *
 * <li><a name="url"><b>URL and Filename safe</b></a>
 * <p> Uses the "URL and Filename safe Base64 Alphabet" as specified
 *     in Table 2 of RFC 4648 for encoding and decoding. The
 *     encoder does not add any line feed (line separator) character.
 *     The decoder rejects data that contains characters outside the
 *     base64 alphabet.</p></li>
 *
 * <li><a name="mime"><b>MIME</b></a>
 * <p> Uses the "The Base64 Alphabet" as specified in Table 1 of
 *     RFC 2045 for encoding and decoding operation. The encoded output
 *     must be represented in lines of no more than 76 characters each
 *     and uses a carriage return {@code '\r'} followed immediately by
 *     a linefeed {@code '\n'} as the line separator. No line separator
 *     is added to the end of the encoded output. All line separators
 *     or other characters not found in the base64 alphabet table are
 *     ignored in decoding operation.</p></li>
 * </ul>
 *
 * <p> Unless otherwise noted, passing a {@code null} argument to a
 * method of this class will cause a {@link java.lang.NullPointerException
 * NullPointerException} to be thrown.
 *
 * @author  Xueming Shen
 * @since   1.8
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/prefs/Base64.java
    private static final byte altBase64ToInt[] = {

    /**
     * This array is the analogue of base64ToInt, but for the nonstandard
     * variant that avoids the use of uppercase alphabetic characters.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/prefs/Base64.java
    private static final byte base64ToInt[] = {

    /**
     * This array is a lookup table that translates unicode characters
     * drawn from the "Base64 Alphabet" (as specified in Table 1 of RFC 2045)
     * into their 6-bit positive integer equivalents.  Characters that
     * are not in the Base64 alphabet but fall within the bounds of the
     * array are translated to -1.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/prefs/Base64.java
    private static int base64toInt(char c, byte[] alphaToInt) {

    /**
     * Translates the specified character, which is assumed to be in the
     * "Base 64 Alphabet" into its equivalent 6-bit positive integer.
     *
     * @throw IllegalArgumentException or ArrayOutOfBoundsException if
     *        c is not in the Base64 Alphabet.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/prefs/Base64.java
    static byte[] altBase64ToByteArray(String s) {

    /**
     * Translates the specified "alternate representation" Base64 string
     * into a byte array.
     *
     * @throw IllegalArgumentException or ArrayOutOfBoundsException
     *        if <tt>s</tt> is not a valid alternate representation
     *        Base64 string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/prefs/Base64.java
    static byte[] base64ToByteArray(String s) {

    /**
     * Translates the specified Base64 string (as per Preferences.get(byte[]))
     * into a byte array.
     *
     * @throw IllegalArgumentException if <tt>s</tt> is not a valid Base64
     *        string.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/prefs/Base64.java
    private static final char intToAltBase64[] = {

    /**
     * This array is a lookup table that translates 6-bit positive integer
     * index values into their "Alternate Base64 Alphabet" equivalents.
     * This is NOT the real Base64 Alphabet as per in Table 1 of RFC 2045.
     * This alternate alphabet does not use the capital letters.  It is
     * designed for use in environments where "case folding" occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/prefs/Base64.java
    private static final char intToBase64[] = {

    /**
     * This array is a lookup table that translates 6-bit positive integer
     * index values into their "Base64 Alphabet" equivalents as specified
     * in Table 1 of RFC 2045.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/prefs/Base64.java
    static String byteArrayToAltBase64(byte[] a) {

    /**
     * Translates the specified byte array into an "alternate representation"
     * Base64 string.  This non-standard variant uses an alphabet that does
     * not contain the uppercase alphabetic characters, which makes it
     * suitable for use in situations where case-folding occurs.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/prefs/Base64.java
class Base64 {

/**
 * Static methods for translating Base64 encoded strings to byte arrays
 * and vice-versa.
 *
 * @author  Josh Bloch
 * @see     Preferences
 * @since   1.4
 */
