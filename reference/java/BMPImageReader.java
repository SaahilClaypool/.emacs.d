_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/bmp/BMPImageReader.java
    private static boolean isUncOrDevicePath(byte[] p) {

    /**
     * Verifies whether the byte array contans a unc path.
     * Non-UNC path examples:
     *  c:\path\to\file  - simple notation
     *  \\?\c:\path\to\file - long notation
     *
     * UNC path examples:
     *  \\server\share - a UNC path in simple notation
     *  \\?\UNC\server\share - a UNC path in long notation
     *  \\.\some\device - a path to device.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/bmp/BMPImageReader.java
    private BufferedImage readEmbedded(int type,
                              BufferedImage bi, ImageReadParam bmpParam)

    /** Decodes the jpeg/png image embedded in the bitmap using any jpeg
     *  ImageIO-style plugin.
     *
     * @param bi The destination <code>BufferedImage</code>.
     * @param bmpParam The <code>ImageReadParam</code> for decoding this
     *          BMP image.  The parameters for subregion, band selection and
     *          subsampling are used in decoding the jpeg image.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/bmp/BMPImageReader.java
    protected void readHeader() throws IOException, IllegalArgumentException {

    /**
     * Process the image header.
     *
     * @exception IllegalStateException if source stream is not set.
     *
     * @exception IOException if image stream is corrupted.
     *
     * @exception IllegalArgumentException if the image stream does not contain
     *             a BMP image, or if a sample model instance to describe the
     *             image can not be created.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/bmp/BMPImageReader.java
    public int getNumImages(boolean allowSearch) throws IOException {

    /** Overrides the method defined in the superclass. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/bmp/BMPImageReader.java
    public void setInput(Object input,
                         boolean seekForwardOnly,
                         boolean ignoreMetadata) {

    /** Overrides the method defined in the superclass. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/bmp/BMPImageReader.java
    public BMPImageReader(ImageReaderSpi originator) {

    /** Constructs <code>BMPImageReader</code> from the provided
     *  <code>ImageReaderSpi</code>.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/bmp/BMPImageReader.java
    private int[] sourceBands, destBands;

    /** source and destination bands. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/bmp/BMPImageReader.java
    private int scaleX, scaleY;

    /** The scaling factors. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/bmp/BMPImageReader.java
    private boolean seleBand = false;

    /** Indicates whether subband is selected. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/bmp/BMPImageReader.java
    private boolean noTransform = true;

    /** Indicates whether subsampled, subregion is required, and offset is
     *  defined
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/bmp/BMPImageReader.java
    private BufferedImage bi;

    /** The destination image. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/bmp/BMPImageReader.java
    private BMPMetadata metadata;

    /** The metadata from the stream. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/bmp/BMPImageReader.java
    private Rectangle sourceRegion;

    /** The source region. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/bmp/BMPImageReader.java
    private Rectangle destinationRegion;

    /** The destination region. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/bmp/BMPImageReader.java
    private int height;

    /** The original image height. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/bmp/BMPImageReader.java
    private int width;

    /** The original image width. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/bmp/BMPImageReader.java
    private boolean gotHeader = false;

    /** Indicates whether the header is read. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/bmp/BMPImageReader.java
    private ImageInputStream iis = null;

    /** The input stream where reads from */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/bmp/BMPImageReader.java
public class BMPImageReader extends ImageReader implements BMPConstants {

/** This class is the Java Image IO plugin reader for BMP images.
 *  It may subsample the image, clip the image, select sub-bands,
 *  and shift the decoded image origin if the proper decoding parameter
 *  are set in the provided <code>ImageReadParam</code>.
 *
 *  This class supports Microsoft Windows Bitmap Version 3-5,
 *  as well as OS/2 Bitmap Version 2.x (for single-image BMP file).
 */
