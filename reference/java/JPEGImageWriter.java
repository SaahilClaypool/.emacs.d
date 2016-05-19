_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    private void writeOutputData(byte[] data, int offset, int len)

    /**
     * This method is called from native code in order to write encoder
     * output to the destination.
     *
     * We block any attempt to change the writer state during this
     * method, in order to prevent a corruption of the native encoder
     * state.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    private static native void disposeWriter(long structPointer);

    /** Releases native structures */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    private native void resetWriter(long structPointer);

    /** Resets native structures */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    private native void abortWrite(long structPointer);

    /** Aborts the current write in the native code */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    private void grabPixels(int y) {

    /**
     * Put the scanline y of the source ROI view Raster into the
     * 1-line Raster for writing.  This handles ROI and band
     * rearrangements, and expands indexed images.  Subsampling is
     * done in the native code.
     * This is called by the native code.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    private native void writeTables(long structPointer,
                                    JPEGQTable [] qtables,
                                    JPEGHuffmanTable[] DCHuffmanTables,
                                    JPEGHuffmanTable[] ACHuffmanTables);

    /**
     * Write out a tables-only image to the stream.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    private void writeMetadata() throws IOException {

    /**
     * Writes the metadata out when called by the native code,
     * which will have already written the header to the stream
     * and established the library state.  This is simpler than
     * breaking the write call in two.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    private native boolean writeImage(long structPointer,
                                      byte [] data,
                                      int inCsType, int outCsType,
                                      int numBands,
                                      int [] bandSizes,
                                      int srcWidth,
                                      int destWidth, int destHeight,
                                      int stepX, int stepY,
                                      JPEGQTable [] qtables,
                                      boolean writeDQT,
                                      JPEGHuffmanTable[] DCHuffmanTables,
                                      JPEGHuffmanTable[] ACHuffmanTables,
                                      boolean writeDHT,
                                      boolean optimizeHuffman,
                                      boolean progressive,
                                      int numScans,
                                      int [] scans,
                                      int [] componentIds,
                                      int [] HsamplingFactors,
                                      int [] VsamplingFactors,
                                      int [] QtableSelectors,
                                      boolean haveMetadata,
                                      int restartInterval);

    /**
     * Returns <code>true</code> if the write was aborted.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    private native void setDest(long structPointer);

    /** Sets up native structures for output stream */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    private native long initJPEGImageWriter();

    /** Sets up per-writer native structure and returns a pointer to it. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    private static native void initWriterIDs(Class qTableClass,
                                             Class huffClass);

    /** Sets up static native structures. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    ////////////// Native methods and callbacks

    ////////////// End of ColorSpace conversion
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    ////////////// ColorSpace conversion

    /////////// End of metadata handling
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    private JPEGHuffmanTable[] collectHTablesFromMetadata

    /**
     * Finds all DHT marker segments and returns all the q
     * tables as a single array of JPEGQTables.  The metadata
     * must not be for a progressive image, or an exception
     * will be thrown when two Huffman tables with the same
     * table id are encountered.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    private JPEGQTable [] collectQTablesFromMetadata

    /**
     * Finds all DQT marker segments and returns all the q
     * tables as a single array of JPEGQTables.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    private int [] collectScans(JPEGMetadata metadata,
                                SOFMarkerSegment sof) {

    /**
     * Collect all the scan info from the given metadata, and
     * organize it into the scan info array required by the
     * IJG libray.  It is much simpler to parse out this
     * data in Java and then just copy the data in C.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    private void checkSOFBands(SOFMarkerSegment sof, int numBandsUsed)

    ///////// Metadata handling
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    ///////// Private methods

    ///////// End of Package-access API
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    void warningWithMessage(String msg) {

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
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    void warningOccurred(int code) {

    /**
     * Called by the native code or other classes to signal a warning.
     * The code is used to lookup a localized message to be used when
     * sending warnings to listeners.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    ///////// Package-access API

    ////////// End of public API
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
            super.abort();

            /**
             * NB: we do not check the call back lock here, we allow to abort
             * the reader any time.
             */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    public JPEGImageWriter(ImageWriterSpi originator) {

    //////// Public API
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    ///////// static initializer

    ///////// End of Protected variables
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    ///////// Protected variables

    ///////// End of Private variables
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    private DisposerRecord disposerRecord;

    /** The DisposerRecord that handles the actual disposal of this writer. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    private Object disposerReferent = new Object();

    /** The referent to be registered with the Disposer. */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    private int currentImage = 0;

    /** Used when calling listeners */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    private ICC_Profile iccProfile = null;

    /**
     * If metadata should include an icc profile, store it here.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    private List thumbnails = null;

    /**
     * If there are thumbnails to be written, this is the list.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    private boolean indexed = false;

    /**
     * Set to true if we are writing an image with an
     * indexed ColorModel
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    private WritableRaster raster = null;

    /** An intermediate Raster holding compressor-friendly data */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    private Raster srcRas = null;

    /** The Raster we will write from */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    private ImageOutputStream ios = null;

    /** The output stream we write to */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    private long structPointer = 0;

    /**
     * The following variable contains a pointer to the IJG library
     * structure for this reader.  It is assigned in the constructor
     * and then is passed in to every native call.  It is set to 0
     * by dispose to avoid disposing twice.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/imageio/plugins/jpeg/JPEGImageWriter.java
    private boolean debug = false;

    ///////// Private variables
