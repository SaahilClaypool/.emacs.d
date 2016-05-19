_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/common/ImageUtil.java
    public static final boolean imageIsContiguous(RenderedImage image) {

    /**
     * Returns whether the image has contiguous data across rows.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/common/ImageUtil.java
    public static final void canEncodeImage(ImageWriter writer,
                                            ColorModel colorModel,
                                            SampleModel sampleModel)

    /** Checks that the provided <code>ImageWriter</code> can encode
     * the provided <code>ColorModel</code> and <code>SampleModel</code>.
     * If not, an <code>IIOException</code> will be thrown.
     * @param writer The provided <code>ImageWriter</code>.
     * @param colorModel The provided <code>ColorModel</code>.
     * @param sampleModel The provided <code>SampleModel</code>.
     * @throws IIOException If the writer cannot encoded the provided image.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/common/ImageUtil.java
    public static final void canEncodeImage(ImageWriter writer,
                                            ImageTypeSpecifier type)

    /** Checks that the provided <code>ImageWriter</code> can encode
     * the provided <code>ImageTypeSpecifier</code> or not.  If not, an
     * <code>IIOException</code> will be thrown.
     * @param writer The provided <code>ImageWriter</code>.
     * @param type The image to be tested.
     * @throws IIOException If the writer cannot encoded the provided image.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/common/ImageUtil.java
    public static String convertObjectToString(Object obj) {

    /** Converts the provided object to <code>String</code> */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/common/ImageUtil.java
    public static boolean isIndicesForGrayscale(byte[] r, byte[] g, byte[] b) {

    /**
     * Tests whether the color indices represent a gray-scale image.
     *
     * @param r The red channel color indices.
     * @param g The green channel color indices.
     * @param b The blue channel color indices.
     * @return If all the indices have 256 entries, and are identical mappings,
     *         return <code>true</code>; otherwise, return <code>false</code>.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/common/ImageUtil.java
    public static void setUnpackedBinaryData(byte[] bdata,
                                             WritableRaster raster,
                                             Rectangle rect) {

    /**
     * Copies data into the packed array of the <code>Raster</code>
     * from an array of unpacked data of the form returned by
     * <code>getUnpackedBinaryData()</code>.
     *
     * <p> If the data are binary, then the target bit will be set if
     * and only if the corresponding byte is non-zero.
     *
     * @throws IllegalArgumentException if <code>isBinary()</code> returns
     * <code>false</code> with the <code>SampleModel</code> of the
     * supplied <code>Raster</code> as argument.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/common/ImageUtil.java
    public static void setPackedBinaryData(byte[] binaryDataArray,
                                           WritableRaster raster,
                                           Rectangle rect) {

    /**
     * Sets the supplied <code>Raster</code>'s data from an array
     * of packed binary data of the form returned by
     * <code>getPackedBinaryData()</code>.
     *
     * @throws IllegalArgumentException if <code>isBinary()</code> returns
     * <code>false</code> with the <code>SampleModel</code> of the
     * supplied <code>Raster</code> as argument.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/common/ImageUtil.java
    public static byte[] getUnpackedBinaryData(Raster raster,
                                               Rectangle rect) {

    /**
     * Returns the binary data unpacked into an array of bytes.
     * The line stride will be the width of the <code>Raster</code>.
     *
     * @throws IllegalArgumentException if <code>isBinary()</code> returns
     * <code>false</code> with the <code>SampleModel</code> of the
     * supplied <code>Raster</code> as argument.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/common/ImageUtil.java
    public static byte[] getPackedBinaryData(Raster raster,
                                             Rectangle rect) {

    /**
     * For the case of binary data (<code>isBinary()</code> returns
     * <code>true</code>), return the binary data as a packed byte array.
     * The data will be packed as eight bits per byte with no bit offset,
     * i.e., the first bit in each image line will be the left-most of the
     * first byte of the line.  The line stride in bytes will be
     * <code>(int)((getWidth()+7)/8)</code>.  The length of the returned
     * array will be the line stride multiplied by <code>getHeight()</code>
     *
     * @return the binary data as a packed array of bytes with zero offset
     * of <code>null</code> if the data are not binary.
     * @throws IllegalArgumentException if <code>isBinary()</code> returns
     * <code>false</code> with the <code>SampleModel</code> of the
     * supplied <code>Raster</code> as argument.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/common/ImageUtil.java
    public static final ColorModel createColorModel(SampleModel sampleModel) {

    /**
     * Creates a <code>ColorModel</code> that may be used with the
     * specified <code>SampleModel</code>.  If a suitable
     * <code>ColorModel</code> cannot be found, this method returns
     * <code>null</code>.
     *
     * <p> Suitable <code>ColorModel</code>s are guaranteed to exist
     * for all instances of <code>ComponentSampleModel</code>.
     * For 1- and 3- banded <code>SampleModel</code>s, the returned
     * <code>ColorModel</code> will be opaque.  For 2- and 4-banded
     * <code>SampleModel</code>s, the output will use alpha transparency
     * which is not premultiplied.  1- and 2-banded data will use a
     * grayscale <code>ColorSpace</code>, and 3- and 4-banded data a sRGB
     * <code>ColorSpace</code>. Data with 5 or more bands will have a
     * <code>BogusColorSpace</code>.</p>
     *
     * <p>An instance of <code>DirectColorModel</code> will be created for
     * instances of <code>SinglePixelPackedSampleModel</code> with no more
     * than 4 bands.</p>
     *
     * <p>An instance of <code>IndexColorModel</code> will be created for
     * instances of <code>MultiPixelPackedSampleModel</code>. The colormap
     * will be a grayscale ramp with <code>1&nbsp;<<&nbsp;numberOfBits</code>
     * entries ranging from zero to at most 255.</p>
     *
     * @return An instance of <code>ColorModel</code> that is suitable for
     *         the supplied <code>SampleModel</code>, or <code>null</code>.
     *
     * @throws IllegalArgumentException  If <code>sampleModel</code> is
     *         <code>null</code>.
     */
