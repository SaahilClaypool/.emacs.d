_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGQTable.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGQTable.java
        public int[] getTable() {

        /**
         * Returns the current quantization table as an array of ints in
         * zig zag order.
         *  @return A copy of the contained quantization table.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGQTable.java
        public JPEGQTable( int table[] ) {

        /**
         * Constructs an quantization table from the array that was
         * passed.  The coefficents must be in zig-zag order. The array
         * must be of length 64.
         *  @param table the quantization table (this is copied).
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGQTable.java
        private JPEGQTable() {

        /**
         * Constructs an empty quantization table. This is used to create
         * the Std Q-Tables.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGQTable.java
        public static final JPEGQTable StdChrominance = new JPEGQTable();

        /**
         * This is the sample luminance quantization table given in the
         * JPEG spec section K.1, expressed in zigzag order. The spec says
         * that the values given produce "good" quality, and when divided
         * by 2, "very good" quality.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGQTable.java
        public static final JPEGQTable StdLuminance = new JPEGQTable();

        /**
         * This is the sample luminance quantization table given in the
         * JPEG spec section K.1, expressed in zigzag order. The spec says
         * that the values given produce "good" quality, and when divided
         * by 2, "very good" quality.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGQTable.java
        private static final byte QTABLESIZE = 64;

        /** The number of coefficients in a DCT block */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGQTable.java
        private int quantval[];

        /** Quantization step for each coefficient in zig-zag order */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGQTable.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGQTable.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGQTable.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGQTable.java
        public int[] getTable() {

        /**
         * Returns the current quantization table as an array of ints in
         * zig zag order.
         *  @return A copy of the contained quantization table.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGQTable.java
        public JPEGQTable( int table[] ) {

        /**
         * Constructs an quantization table from the array that was
         * passed.  The coefficents must be in zig-zag order. The array
         * must be of length 64.
         *  @param table the quantization table (this is copied).
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGQTable.java
        private JPEGQTable() {

        /**
         * Constructs an empty quantization table. This is used to create
         * the Std Q-Tables.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGQTable.java
        public static final JPEGQTable StdChrominance = new JPEGQTable();

        /**
         * This is the sample luminance quantization table given in the
         * JPEG spec section K.1, expressed in zigzag order. The spec says
         * that the values given produce "good" quality, and when divided
         * by 2, "very good" quality.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGQTable.java
        public static final JPEGQTable StdLuminance = new JPEGQTable();

        /**
         * This is the sample luminance quantization table given in the
         * JPEG spec section K.1, expressed in zigzag order. The spec says
         * that the values given produce "good" quality, and when divided
         * by 2, "very good" quality.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGQTable.java
        private static final byte QTABLESIZE = 64;

        /** The number of coefficients in a DCT block */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGQTable.java
        private int quantval[];

        /** Quantization step for each coefficient in zig-zag order */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGQTable.java
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
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/image/codec/jpeg/JPEGQTable.java
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
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/plugins/jpeg/JPEGQTable.java
    public String toString() {

    /**
     * Returns a {@code String} representing this quantization table.
     * @return a {@code String} representing this quantization table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/plugins/jpeg/JPEGQTable.java
    public JPEGQTable getScaledInstance(float scaleFactor,
                                        boolean forceBaseline) {

    /**
     * Returns a new quantization table where the values are multiplied
     * by <code>scaleFactor</code> and then clamped to the range 1..32767
     * (or to 1..255 if <code>forceBaseline</code> is true).
     * <p>
     * Values of <code>scaleFactor</code> less than 1 tend to improve
     * the quality level of the table, and values greater than 1.0
     * degrade the quality level of the table.
     * @param scaleFactor multiplication factor for the table.
     * @param forceBaseline if <code>true</code>,
     * the values will be clamped to the range 1..255
     * @return a new quantization table that is a linear multiple
     * of the current table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/plugins/jpeg/JPEGQTable.java
    public int[] getTable() {

    /**
     * Returns a copy of the current quantization table as an array
     * of {@code int}s in natural (not zig-zag) order.
     * @return A copy of the current quantization table.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/plugins/jpeg/JPEGQTable.java
    public JPEGQTable(int[] table) {

    /**
     * Constructs a quantization table from the argument, which must
     * contain 64 elements in natural order (not zig-zag order).
     * A copy is made of the the input array.
     * @param table the quantization table, as an <code>int</code> array.
     * @throws IllegalArgumentException if <code>table</code> is
     * <code>null</code> or <code>table.length</code> is not equal to 64.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/plugins/jpeg/JPEGQTable.java
    public static final JPEGQTable K2Div2Chrominance =

    /**
     * The sample chrominance quantization table given in the JPEG
     * specification, table K.1, with all elements divided by 2.
     * According to the specification, these values produce "very good"
     * quality output. This is the table usually used for "visually lossless"
     * encoding, and is the default chrominance table used if the default
     * tables and quality settings are used.
     * @see #K2Chrominance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/plugins/jpeg/JPEGQTable.java
    public static final JPEGQTable K2Chrominance =

    /**
     * The sample chrominance quantization table given in the JPEG
     * specification, table K.2. According to the specification,
     * these values produce "good" quality output.
     * @see #K2Div2Chrominance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/plugins/jpeg/JPEGQTable.java
    public static final JPEGQTable

    /**
     * The sample luminance quantization table given in the JPEG
     * specification, table K.1, with all elements divided by 2.
     * According to the specification, these values produce "very good"
     * quality output. This is the table usually used for "visually lossless"
     * encoding, and is the default luminance table used if the default
     * tables and quality settings are used.
     * @see #K1Luminance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/plugins/jpeg/JPEGQTable.java
    public static final JPEGQTable

    /**
     * The sample luminance quantization table given in the JPEG
     * specification, table K.1. According to the specification,
     * these values produce "good" quality output.
     * @see #K1Div2Luminance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/plugins/jpeg/JPEGQTable.java
public class JPEGQTable {

/**
 * A class encapsulating a single JPEG quantization table.
 * The elements appear in natural order (as opposed to zig-zag order).
 * Static variables are provided for the "standard" tables taken from
 *  Annex K of the JPEG specification, as well as the default tables
 * conventionally used for visually lossless encoding.
 * <p>
 * For more information about the operation of the standard JPEG plug-in,
 * see the <A HREF="../../metadata/doc-files/jpeg_metadata.html">JPEG
 * metadata format specification and usage notes</A>
 */
