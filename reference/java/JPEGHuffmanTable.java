_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
    public short[] getSymbols() {

    /**
         * Return an array containing the Huffman symbols arranged by
         * increasing length.  To make use of this array you must refer
         * the the lengths array.
         * @return A short array of Huffman symbols
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
    public short[] getLengths() {

        /**
         * Return a copy of the array containing the number of symbols
         * for each length in the Huffman table.
         * @return A short array where array[k] = # of symbols in the
         *         table of length k. array[0] is unused
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
        private void checkTable() {

        /**
         * This checks that the table they gave us isn't 'illegal' It
         * checks that the symbol length counts are possible, and that
         * they gave us at least enough symbols for the symbol length
         * counts. Eventually this might check that there aren't duplicate
         * symbols.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
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
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
    private JPEGHuffmanTable() {

        /**
         * Private constructor used to construct the Standard Huffman tables
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
        public static final JPEGHuffmanTable StdACChrominance =

    /** Standard Huffman table ( JPEG standard section K.3 ) */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
        public static final JPEGHuffmanTable StdACLuminance =

        /** Standard Huffman table ( JPEG standard section K.3 ) */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
        public static final JPEGHuffmanTable StdDCChrominance =

    /** Standard Huffman table ( JPEG standard section K.3 ) */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
        public static final JPEGHuffmanTable StdDCLuminance =

    /** Standard Huffman table ( JPEG standard section K.3 ) */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
    private short symbols[];

    /** Symbols in order of increasing length */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
    private short lengths[];

    /** bits[k] = number of symbols with length k bits  */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
    private static final int HUFF_MAX_SYM=256;

    /** the maximum number of symbols */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
    private static final int HUFF_MAX_LEN=17;

        /**
         * The maximum number of symbol lengths
         * (max symbol length in bits = 16)
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
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
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGHuffmanTable.java
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
