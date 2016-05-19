_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
class ImageTypeProducer {

/**
 * An internal helper class that provides means for deferred creation
 * of ImageTypeSpecifier instance required to describe available
 * destination types.
 *
 * This implementation only supports standard
 * jpeg color spaces (defined by corresponding JCS color space code).
 *
 * To support other color spaces one can override produce() method to
 * return custom instance of ImageTypeSpecifier.
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
class ImageTypeIterator implements Iterator<ImageTypeSpecifier> {

/**
 * An internal helper class that wraps producer's iterator
 * and extracts specifier instances on demand.
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private native void resetLibraryState(long structPointer);

    /** Resets library state when an exception occurred during a read. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private native void abortRead(long structPointer);

    /** Set the C level abort flag. Keep it atomic for thread safety. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
            super.abort();

            /**
             * NB: we do not check the call back lock here,
             * we allow to abort the reader any time.
             */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private native boolean readImage(long structPointer,
                                     byte [] buffer,
                                     int numRasterBands,
                                     int [] srcBands,
                                     int [] bandSizes,
                                     int sourceXOffset, int sourceYOffset,
                                     int sourceWidth, int sourceHeight,
                                     int periodX, int periodY,
                                     JPEGQTable [] abbrevQTables,
                                     JPEGHuffmanTable [] abbrevDCHuffmanTables,
                                     JPEGHuffmanTable [] abbrevACHuffmanTables,
                                     int minProgressivePass,
                                     int maxProgressivePass,
                                     boolean wantUpdates);

    /**
     * Returns <code>true</code> if the read was aborted.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private void acceptPixels(int y, boolean progressive) {

    /**
     * This method is called back from C when the intermediate Raster
     * is full.  The parameter indicates the scanline in the target
     * Raster to which the intermediate Raster should be copied.
     * After the copy, we notify update listeners.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    public ImageReadParam getDefaultReadParam() {

    /////// End of Color Conversion & Image Types
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private native void setOutColorSpace(long structPointer, int id);

    /**
     * Set the IJG output space to the given value.  The library will
     * perform the appropriate colorspace conversions.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private void checkColorConversion(BufferedImage image,
                                      ImageReadParam param)

    /**
     * Checks the implied color conversion between the stream and
     * the target image, altering the IJG output color space if necessary.
     * If a java color conversion is required, then this sets up
     * <code>convert</code>.
     * If bands are being rearranged at all (either source or destination
     * bands are specified in the param), then the default color
     * conversions are assumed to be correct.
     * Throws an IIOException if there is no conversion available.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    /**

    /////////// Color Conversion and Image Types
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private native boolean readImageHeader(long structPointer,
                                           boolean clearBuffer,
                                           boolean reset)

    /**
     * Read in the header information starting from the current
     * stream position, returning <code>true</code> if the
     * header was a tables-only image.  After this call, the
     * native IJG decompression struct will contain the image
     * information required by most query calls below
     * (e.g. getWidth, getHeight, etc.), if the header was not
     * a tables-only image.
     * If reset is <code>true</code>, the state of the IJG
     * object is reset so that it can read a header again.
     * This happens automatically if the header was a tables-only
     * image.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private void readHeader(int imageIndex, boolean reset)

    /**
     * Reads header information for the given image, if possible.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private void pushBack(int num) throws IOException {

    /**
     * Push back the given number of bytes to the input stream.
     * Called by the native code at the end of each image so
     * that the next one can be identified from Java.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private boolean hasNextImage() throws IOException {

    /**
     * Returns <code>true</code> if there is an image beyond
     * the current stream position.  Does not disturb the
     * stream position.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private void skipImage() throws IOException {

    /**
     * Skip over a complete image in the stream, leaving the stream
     * positioned such that the next byte to be read is the first
     * byte of the next image.  For JPEG, this means that we read
     * until we encounter an EOI marker or until the end of the stream.
     * If the stream ends before an EOI marker is encountered, an
     * IndexOutOfBoundsException is thrown.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private void gotoImage(int imageIndex) throws IOException {

    /**
     * Sets the input stream to the start of the requested image.
     * <pre>
     * @exception IllegalStateException if the input source has not been
     * set.
     * @exception IndexOutOfBoundsException if the supplied index is
     * out of bounds.
     * </pre>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private long skipInputBytes(long n) throws IOException {

    /**
     * This method is called from the native code in order to
     * skip requested number of bytes in the input stream.
     *
     * @param n
     * @return
     * @throws IOException
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private int readInputData(byte[] buf, int off, int len) throws IOException {

    /**
     * This method is called from native code in order to fill
     * native input buffer.
     *
     * We block any attempt to change the reading state during this
     * method, in order to prevent a corruption of the native decoder
     * state.
     *
     * @return number of bytes read from the stream.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    protected void warningWithMessage(String msg) {

    /**
     * The library has it's own error facility that emits warning messages.
     * This routine is called by the native code when it has already
     * formatted a string for output.
     * XXX  For truly complete localization of all warning messages,
     * the sun_jpeg_output_message routine in the native code should
     * send only the codes and parameters to a method here in Java,
     * which will then format and send the warnings, using localized
     * strings.  This method will have to deal with all the parameters
     * and formats (%u with possibly large numbers, %02d, %02x, etc.)
     * that actually occur in the JPEG library.  For now, this prevents
     * library warnings from being printed to stderr.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    protected void warningOccurred(int code) {

    /**
     * Called by the native code or other classes to signal a warning.
     * The code is used to lookup a localized message to be used when
     * sending warnings to listeners.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private native long initJPEGImageReader();

    /** Sets up per-reader C structure and returns a pointer to it. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private static native void initReaderIDs(Class iisClass,
                                             Class qTableClass,
                                             Class huffClass);

    /** Sets up static C structures. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private DisposerRecord disposerRecord;

    /** The DisposerRecord that handles the actual disposal of this reader. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private Object disposerReferent = new Object();

    /** The referent to be registered with the Disposer. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private boolean tablesOnlyChecked = false;

    /**
     * Set to true once stream has been checked for stream metadata
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private static final int UNKNOWN = -1;  // Number of passes

    /**
     * Variables used by progress monitoring.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private JPEGQTable [] abbrevQTables = null;

    /**
     * Tables that have been read from a tables-only image at the
     * beginning of a stream.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private boolean haveSeeked = false;

    /**
     * Set to true every time we seek in the stream; used to
     * invalidate the native buffer contents in C.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private JPEGMetadata imageMetadata = null;

    /** Image metadata, valid for the imageMetadataIndex only. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private JPEGMetadata streamMetadata = null;

    /** Stream metadata, cached, even when the stream is changed. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private int [] destinationBands = null;

    /** The list of destination bands, if any */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private Rectangle destROI = null;

    /** The region in the destination where we will write pixels */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private DataBufferByte buffer = null;

    /** The databuffer for the above Raster */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private WritableRaster target = null;

    /** A view of our target Raster that we can setRect to */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private WritableRaster raster = null;

    /** An intermediate Raster to hold decoded data */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private BufferedImage image = null;

    /** The image we are going to fill */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private ColorConvertOp convert = null;

    /** If we need to post-convert in Java, convert with this op */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private ColorSpace iccCS = null;

    /** Set by setImageData native code callback */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private int numComponents;

    /** Set by setImageData native code callback */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private int outColorSpaceCode;

    /**
     * Set by setImageData native code callback.  A modified
     * IJG+NIFTY colorspace code.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private int colorSpaceCode;

    /**
     * Set by setImageData native code callback.  A modified
     * IJG+NIFTY colorspace code.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private int height;

    /** Set by setImageData native code callback */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private int width;

    /** Set by setImageData native code callback */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private int currentImage = -1;

    /**
     * Image index of image for which header information
     * is available.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    protected static final int WARNING_IGNORE_INVALID_ICC = 2;

    /**
     * Warning code to be passed to warningOccurred to indicate
     * that embedded ICC profile is invalid and will be ignored.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    protected static final int WARNING_NO_JFIF_IN_THUMB = 1;

    /**
     * Warning code to be passed to warningOccurred to indicate
     * that a JFIF segment was encountered inside a JFXX JPEG
     * thumbnail and is being ignored.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    protected static final int WARNING_NO_EOI = 0;

    /**
     * Warning code to be passed to warningOccurred to indicate
     * that the EOI marker is missing from the end of the stream.
     * This usually signals that the stream is corrupted, but
     * everything up to the last MCU should be usable.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private int numImages = 0;

    /**
     * The number of images in the stream, or 0.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private List imagePositions = null;

    /**
     * List of stream positions for images, reinitialized every time
     * a new input source is set.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private ImageInputStream iis = null;

    /** The input stream we read from */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageReader.java
    private long structPointer = 0;

    /**
     * The following variable contains a pointer to the IJG library
     * structure for this reader.  It is assigned in the constructor
     * and then is passed in to every native call.  It is set to 0
     * by dispose to avoid disposing twice.
     */
