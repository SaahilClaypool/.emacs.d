_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGQTable.java
        public JPEGQTable getScaledInstance(float scaleFactor,
                                                                                boolean forceBaseline ) {

        /**
         * Returns a new Quantization table where the values are
         * multiplied by scaleFactor and then clamped to the range
         * 1..32767 (or to 1..255 if forceBaseline is 'true'). <P>

         * Values less than one tend to improve the quality level of the
         * table, and values greater than one degrade the quality level of
         * the table.

         * @param scaleFactor the multiplication factor for the table
         * @param forceBaseline if true the values will be clamped
         * to the range  [1 .. 255]
         * @return A new Q-Table that is a linear multiple of this Q-Table
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGQTable.java
        public int[] getTable() {

        /**
         * Returns the current quantization table as an array of ints in
         * zig zag order.
         *  @return A copy of the contained quantization table.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGQTable.java
        public JPEGQTable( int table[] ) {

        /**
         * Constructs an quantization table from the array that was
         * passed.  The coefficents must be in zig-zag order. The array
         * must be of length 64.
         *  @param table the quantization table (this is copied).
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGQTable.java
        private JPEGQTable() {

        /**
         * Constructs an empty quantization table. This is used to create
         * the Std Q-Tables.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGQTable.java
        public static final JPEGQTable StdChrominance = new JPEGQTable();

        /**
         * This is the sample luminance quantization table given in the
         * JPEG spec section K.1, expressed in zigzag order. The spec says
         * that the values given produce "good" quality, and when divided
         * by 2, "very good" quality.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGQTable.java
        public static final JPEGQTable StdLuminance = new JPEGQTable();

        /**
         * This is the sample luminance quantization table given in the
         * JPEG spec section K.1, expressed in zigzag order. The spec says
         * that the values given produce "good" quality, and when divided
         * by 2, "very good" quality.
         */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGQTable.java
        private static final byte QTABLESIZE = 64;

        /** The number of coefficients in a DCT block */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGQTable.java
        private int quantval[];

        /** Quantization step for each coefficient in zig-zag order */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGQTable.java
public class JPEGQTable {

/** Class to encapsulate the JPEG quantization tables.
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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/image/codec/jpeg/JPEGQTable.java
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
