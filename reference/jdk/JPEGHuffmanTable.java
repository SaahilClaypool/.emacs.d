_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
    public short[] getSymbols() {

    /**
         * Return an array containing the Huffman symbols arranged by
         * increasing length.  To make use of this array you must refer
         * the the lengths array.
         * @return A short array of Huffman symbols
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
    public short[] getLengths() {

        /**
         * Return a copy of the array containing the number of symbols
         * for each length in the Huffman table.
         * @return A short array where array[k] = # of symbols in the
         *         table of length k. array[0] is unused
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
        private void checkTable() {

        /**
         * This checks that the table they gave us isn't 'illegal' It
         * checks that the symbol length counts are possible, and that
         * they gave us at least enough symbols for the symbol length
         * counts. Eventually this might check that there aren't duplicate
         * symbols.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
    public JPEGHuffmanTable( short lengths[], short symbols[] ) {

    /**
     * Creates a Huffman Table and initializes it.
     * @param lengths lengths[k] = # of symbols with codes of length k
     * bits; lengths[0] is ignored
     * @param symbols symbols in order of increasing code length
     * @exception IllegalArgumentException if the length of
     * <code>lengths</code> is greater than 17
     * @exception IllegalArgumentException if the length of
     * <code>symbols</code> is greater than 256
     * @exception IllegalArgumentException if any of the values in
     * <code>lengths</code> or <code>symbols</code> is less than zero
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
    private JPEGHuffmanTable() {

        /**
         * Private constructor used to construct the Standard Huffman tables
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
        public static final JPEGHuffmanTable StdACChrominance =

    /** Standard Huffman table ( JPEG standard section K.3 ) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
        public static final JPEGHuffmanTable StdACLuminance =

        /** Standard Huffman table ( JPEG standard section K.3 ) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
        public static final JPEGHuffmanTable StdDCChrominance =

    /** Standard Huffman table ( JPEG standard section K.3 ) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
        public static final JPEGHuffmanTable StdDCLuminance =

    /** Standard Huffman table ( JPEG standard section K.3 ) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
    private short symbols[];

    /** Symbols in order of increasing length */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
    private short lengths[];

    /** bits[k] = number of symbols with length k bits  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
    private static final int HUFF_MAX_SYM=256;

    /** the maximum number of symbols */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
    private static final int HUFF_MAX_LEN=17;

        /**
         * The maximum number of symbol lengths
         * (max symbol length in bits = 16)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
public class JPEGHuffmanTable {

/** A class to encapsulate a JPEG Huffman table.
 * <p>
 * Note that the classes in the com.sun.image.codec.jpeg package are not
 * part of the core Java APIs.  They are a part of Sun's JDK and JRE
 * distributions.  Although other licensees may choose to distribute these
 * classes, developers cannot depend on their availability in non-Sun
 * implementations.  We expect that equivalent functionality will eventually
 * be available in a core API or standard extension.
 * <p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
package com.sun.image.codec.jpeg;

/**********************************************************************
 **********************************************************************
 **********************************************************************
 *** COPYRIGHT (c) 1997-1998 Eastman Kodak Company.                 ***
 *** As  an unpublished  work pursuant to Title 17 of the United    ***
 *** States Code.  All rights reserved.                             ***
 **********************************************************************
 **********************************************************************
 **********************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
    public short[] getSymbols() {

    /**
         * Return an array containing the Huffman symbols arranged by
         * increasing length.  To make use of this array you must refer
         * the the lengths array.
         * @return A short array of Huffman symbols
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
    public short[] getLengths() {

        /**
         * Return a copy of the array containing the number of symbols
         * for each length in the Huffman table.
         * @return A short array where array[k] = # of symbols in the
         *         table of length k. array[0] is unused
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
        private void checkTable() {

        /**
         * This checks that the table they gave us isn't 'illegal' It
         * checks that the symbol length counts are possible, and that
         * they gave us at least enough symbols for the symbol length
         * counts. Eventually this might check that there aren't duplicate
         * symbols.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
    public JPEGHuffmanTable( short lengths[], short symbols[] ) {

    /**
     * Creates a Huffman Table and initializes it.
     * @param lengths lengths[k] = # of symbols with codes of length k
     * bits; lengths[0] is ignored
     * @param symbols symbols in order of increasing code length
     * @exception IllegalArgumentException if the length of
     * <code>lengths</code> is greater than 17
     * @exception IllegalArgumentException if the length of
     * <code>symbols</code> is greater than 256
     * @exception IllegalArgumentException if any of the values in
     * <code>lengths</code> or <code>symbols</code> is less than zero
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
    private JPEGHuffmanTable() {

        /**
         * Private constructor used to construct the Standard Huffman tables
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
        public static final JPEGHuffmanTable StdACChrominance =

    /** Standard Huffman table ( JPEG standard section K.3 ) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
        public static final JPEGHuffmanTable StdACLuminance =

        /** Standard Huffman table ( JPEG standard section K.3 ) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
        public static final JPEGHuffmanTable StdDCChrominance =

    /** Standard Huffman table ( JPEG standard section K.3 ) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
        public static final JPEGHuffmanTable StdDCLuminance =

    /** Standard Huffman table ( JPEG standard section K.3 ) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
    private short symbols[];

    /** Symbols in order of increasing length */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
    private short lengths[];

    /** bits[k] = number of symbols with length k bits  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
    private static final int HUFF_MAX_SYM=256;

    /** the maximum number of symbols */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
    private static final int HUFF_MAX_LEN=17;

        /**
         * The maximum number of symbol lengths
         * (max symbol length in bits = 16)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
public class JPEGHuffmanTable {

/** A class to encapsulate a JPEG Huffman table.
 * <p>
 * Note that the classes in the com.sun.image.codec.jpeg package are not
 * part of the core Java APIs.  They are a part of Sun's JDK and JRE
 * distributions.  Although other licensees may choose to distribute these
 * classes, developers cannot depend on their availability in non-Sun
 * implementations.  We expect that equivalent functionality will eventually
 * be available in a core API or standard extension.
 * <p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
package com.sun.image.codec.jpeg;

/**********************************************************************
 **********************************************************************
 **********************************************************************
 *** COPYRIGHT (c) 1997-1998 Eastman Kodak Company.                 ***
 *** As  an unpublished  work pursuant to Title 17 of the United    ***
 *** States Code.  All rights reserved.                             ***
 **********************************************************************
 **********************************************************************
 **********************************************************************/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/plugins/jpeg/JPEGHuffmanTable.java
    public String toString() {

    /**
     * Returns a {@code String} representing this Huffman table.
     * @return a {@code String} representing this Huffman table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/plugins/jpeg/JPEGHuffmanTable.java
    public short[] getValues() {

    /**
     * Returns an array of <code>short</code>s containing the values arranged
     * by increasing length of their corresponding codes.
     * The interpretation of the array is dependent on the values returned
     * from <code>getLengths</code>. The returned array is a copy.
     *
     * @return a <code>short</code> array of values.
     * @see #getLengths
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/plugins/jpeg/JPEGHuffmanTable.java
    public short[] getLengths() {

    /**
     * Returns an array of <code>short</code>s containing the number of values
     * for each length in the Huffman table. The returned array is a copy.
     *
     * @return a <code>short</code> array where <code>array[k-1]</code>
     * is equal to the number of values in the table of length <code>k</code>.
     * @see #getValues
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/plugins/jpeg/JPEGHuffmanTable.java
    public JPEGHuffmanTable(short[] lengths, short[] values) {

    /**
     * Creates a Huffman table and initializes it. The input arrays are copied.
     * The arrays must describe a possible Huffman table.
     * For example, 3 codes cannot be expressed with a single bit.
     *
     * @param lengths an array of {@code short}s where <code>lengths[k]</code>
     * is equal to the number of values with corresponding codes of
     * length <code>k + 1</code> bits.
     * @param values an array of shorts containing the values in
     * order of increasing code length.
     * @throws IllegalArgumentException if <code>lengths</code> or
     * <code>values</code> are null, the length of <code>lengths</code> is
     * greater than 16, the length of <code>values</code> is greater than 256,
     * if any value in <code>lengths</code> or <code>values</code> is less
     * than zero, or if the arrays do not describe a valid Huffman table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/plugins/jpeg/JPEGHuffmanTable.java
    public static final JPEGHuffmanTable

    /**
     * The standard AC chrominance Huffman table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/plugins/jpeg/JPEGHuffmanTable.java
    public static final JPEGHuffmanTable

    /**
     * The standard AC luminance Huffman table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/plugins/jpeg/JPEGHuffmanTable.java
    public static final JPEGHuffmanTable

    /**
     * The standard DC chrominance Huffman table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/plugins/jpeg/JPEGHuffmanTable.java
    public static final JPEGHuffmanTable

    /**
     * The standard DC luminance Huffman table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/plugins/jpeg/JPEGHuffmanTable.java
public class JPEGHuffmanTable {

/**
 * A class encapsulating a single JPEG Huffman table.
 * Fields are provided for the "standard" tables taken
 * from Annex K of the JPEG specification.
 * These are the tables used as defaults.
 * <p>
 * For more information about the operation of the standard JPEG plug-in,
 * see the <A HREF="../../metadata/doc-files/jpeg_metadata.html">JPEG
 * metadata format specification and usage notes</A>
 */
