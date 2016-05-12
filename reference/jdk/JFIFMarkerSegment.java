_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
        void write(ImageOutputStream ios) throws IOException {

        /**
         * No-op.  Profiles are never written from metadata.
         * They are written from the ColorSpace of the image.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    class ICCMarkerSegment extends MarkerSegment {

    /**
     * An APP2 marker segment containing an ICC profile.  In the stream
     * a profile larger than 64K is broken up into a series of chunks.
     * This inner class represents the complete profile as a single object,
     * combining chunks as necessary.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    static void writeICC(ICC_Profile profile, ImageOutputStream ios)

    /**
     * Write out the given profile to the stream, embedded in
     * the necessary number of APP2 segments, per the ICC spec.
     * This is the only mechanism for writing an ICC profile
     * to a stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    class JFIFThumbJPEG extends JFIFThumb {

    /**
     * A JFIF thumbnail stored as a JPEG stream.  No JFIF or
     * JFIF extension markers are permitted.  There is no need
     * to clip these, but the entire image must fit into a
     * single JFXX marker segment.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    class JFIFThumbPalette extends JFIFThumbUncompressed {

    /**
     * A JFIF thumbnail stored as an indexed palette image
     * using an RGB palette.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    class JFIFThumbRGB extends JFIFThumbUncompressed {

    /**
     * A JFIF thumbnail stored as RGB, one byte per channel,
     * interleaved.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    abstract class JFIFThumb implements Cloneable {

    /**
     * A superclass for the varieties of thumbnails that can
     * be stored in a JFIF extension marker segment.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    class JFIFExtensionMarkerSegment extends MarkerSegment {

    /**
     * A JFIF extension APP0 marker segment.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    void print() {

    /**
     * Prints out the contents of this object to System.out for debugging.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    static void writeDefaultJFIF(ImageOutputStream ios,
                                 List thumbnails,
                                 ICC_Profile iccProfile,
                                 JPEGImageWriter writer)

    /**
     * Writes out a default JFIF marker segment to the given
     * output stream.  If <code>thumbnails</code> is not <code>null</code>,
     * writes out the set of thumbnail images as JFXX marker segments, or
     * incorporated into the JFIF segment if appropriate.
     * If <code>iccProfile</code> is not <code>null</code>,
     * writes out the profile after the JFIF segment using as many APP2
     * marker segments as necessary.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    private static BufferedImage expandGrayThumb(BufferedImage thumb) {

    /**
     * Return an RGB image that is the expansion of the given grayscale
     * image.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    private void writeJFXXSegment(int index,
                                  BufferedImage thumbnail,
                                  ImageOutputStream ios,
                                  JPEGImageWriter writer) throws IOException {

    /**
     * Writes out a new JFXX extension segment, without saving it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    void writeWithThumbs(ImageOutputStream ios,
                         List thumbnails,
                         JPEGImageWriter writer) throws IOException {

    /**
     * Write out this JFIF Marker Segment, including a thumbnail or
     * appending a series of JFXX Marker Segments, as appropriate.
     * Warnings and progress reports are sent to the writer argument.
     * The list of thumbnails is matched to the list of JFXX extension
     * segments, if any, in order to determine how to encode the
     * thumbnails.  If there are more thumbnails than metadata segments,
     * default encoding is used for the extra thumbnails.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    void write(ImageOutputStream ios,
               BufferedImage thumb,
               JPEGImageWriter writer) throws IOException {

    /**
     * Writes the data for this segment to the stream in
     * valid JPEG format.  The length written takes the thumbnail
     * width and height into account.  If necessary, the thumbnail
     * is clipped to 255 x 255 and a warning is sent to the writer
     * argument.  Progress updates are sent to the writer argument.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    void write(ImageOutputStream ios,
               JPEGImageWriter writer) throws IOException {

    /**
     * Writes the data for this segment to the stream in
     * valid JPEG format.  Assumes that there will be no thumbnail.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    void updateFromNativeNode(Node node, boolean fromScratch)

    /**
     * Updates the data in this object from the given DOM Node tree.
     * If fromScratch is true, this object is being constructed.
     * Otherwise an existing object is being modified.
     * Throws an IIOInvalidTreeException if the tree is invalid in
     * any way.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    IIOMetadataNode getNativeNode() {

    /**
     * Returns a tree of DOM nodes representing this object and any
     * subordinate JFXX extension or ICC Profile segments.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    void addICC(ICC_ColorSpace cs) throws IOException {

    /**
     * Add an ICC Profile APP2 segment by constructing it from
     * the given ICC_ColorSpace object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    void addICC(JPEGBuffer buffer) throws IOException {

    /**
     * Adds an ICC Profile APP2 segment from the stream wrapped
     * in the JPEGBuffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    void addJFXX(JPEGBuffer buffer, JPEGImageReader reader)

    /**
     * Add an JFXX extension marker segment from the stream wrapped
     * in the JPEGBuffer to the list of extension segments.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    protected Object clone() {

    /**
     * Returns a deep-copy clone of this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    JFIFMarkerSegment(Node node) throws IIOInvalidTreeException {

    /**
     * Constructs a JFIF header from a DOM Node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    JFIFMarkerSegment(JPEGBuffer buffer) throws IOException {

    /**
     * Constructs a JFIF header by reading from a stream wrapped
     * in a JPEGBuffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    JFIFMarkerSegment() {

    /**
     * Default constructor.  Used to create a default JFIF header
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    private ICCMarkerSegment tempICCSegment = null;

    /**
     * A placeholder for an ICC profile marker segment under
     * construction.  The segment is not added to the list
     * until all chunks have been read.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    private boolean inICC = false;

    /**
     * Set to <code>true</code> when reading the chunks of an
     * ICC profile.  All chunks are consolidated to create a single
     * "segment" containing all the chunks.  This flag is a state
     * variable identifying whether to construct a new segment or
     * append to an old one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
class JFIFMarkerSegment extends MarkerSegment {

/**
 * A JFIF (JPEG File Interchange Format) APP0 (Application-Specific)
 * marker segment.  Inner classes are included for JFXX extension
 * marker segments, for different varieties of thumbnails, and for
 * ICC Profile APP2 marker segments.  Any of these secondary types
 * that occur are kept as members of a single JFIFMarkerSegment object.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
        void write(ImageOutputStream ios) throws IOException {

        /**
         * No-op.  Profiles are never written from metadata.
         * They are written from the ColorSpace of the image.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    class ICCMarkerSegment extends MarkerSegment {

    /**
     * An APP2 marker segment containing an ICC profile.  In the stream
     * a profile larger than 64K is broken up into a series of chunks.
     * This inner class represents the complete profile as a single object,
     * combining chunks as necessary.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    static void writeICC(ICC_Profile profile, ImageOutputStream ios)

    /**
     * Write out the given profile to the stream, embedded in
     * the necessary number of APP2 segments, per the ICC spec.
     * This is the only mechanism for writing an ICC profile
     * to a stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    class JFIFThumbJPEG extends JFIFThumb {

    /**
     * A JFIF thumbnail stored as a JPEG stream.  No JFIF or
     * JFIF extension markers are permitted.  There is no need
     * to clip these, but the entire image must fit into a
     * single JFXX marker segment.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    class JFIFThumbPalette extends JFIFThumbUncompressed {

    /**
     * A JFIF thumbnail stored as an indexed palette image
     * using an RGB palette.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    class JFIFThumbRGB extends JFIFThumbUncompressed {

    /**
     * A JFIF thumbnail stored as RGB, one byte per channel,
     * interleaved.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    abstract class JFIFThumb implements Cloneable {

    /**
     * A superclass for the varieties of thumbnails that can
     * be stored in a JFIF extension marker segment.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    class JFIFExtensionMarkerSegment extends MarkerSegment {

    /**
     * A JFIF extension APP0 marker segment.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    void print() {

    /**
     * Prints out the contents of this object to System.out for debugging.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    static void writeDefaultJFIF(ImageOutputStream ios,
                                 List thumbnails,
                                 ICC_Profile iccProfile,
                                 JPEGImageWriter writer)

    /**
     * Writes out a default JFIF marker segment to the given
     * output stream.  If <code>thumbnails</code> is not <code>null</code>,
     * writes out the set of thumbnail images as JFXX marker segments, or
     * incorporated into the JFIF segment if appropriate.
     * If <code>iccProfile</code> is not <code>null</code>,
     * writes out the profile after the JFIF segment using as many APP2
     * marker segments as necessary.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    private static BufferedImage expandGrayThumb(BufferedImage thumb) {

    /**
     * Return an RGB image that is the expansion of the given grayscale
     * image.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    private void writeJFXXSegment(int index,
                                  BufferedImage thumbnail,
                                  ImageOutputStream ios,
                                  JPEGImageWriter writer) throws IOException {

    /**
     * Writes out a new JFXX extension segment, without saving it.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    void writeWithThumbs(ImageOutputStream ios,
                         List thumbnails,
                         JPEGImageWriter writer) throws IOException {

    /**
     * Write out this JFIF Marker Segment, including a thumbnail or
     * appending a series of JFXX Marker Segments, as appropriate.
     * Warnings and progress reports are sent to the writer argument.
     * The list of thumbnails is matched to the list of JFXX extension
     * segments, if any, in order to determine how to encode the
     * thumbnails.  If there are more thumbnails than metadata segments,
     * default encoding is used for the extra thumbnails.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    void write(ImageOutputStream ios,
               BufferedImage thumb,
               JPEGImageWriter writer) throws IOException {

    /**
     * Writes the data for this segment to the stream in
     * valid JPEG format.  The length written takes the thumbnail
     * width and height into account.  If necessary, the thumbnail
     * is clipped to 255 x 255 and a warning is sent to the writer
     * argument.  Progress updates are sent to the writer argument.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    void write(ImageOutputStream ios,
               JPEGImageWriter writer) throws IOException {

    /**
     * Writes the data for this segment to the stream in
     * valid JPEG format.  Assumes that there will be no thumbnail.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    void updateFromNativeNode(Node node, boolean fromScratch)

    /**
     * Updates the data in this object from the given DOM Node tree.
     * If fromScratch is true, this object is being constructed.
     * Otherwise an existing object is being modified.
     * Throws an IIOInvalidTreeException if the tree is invalid in
     * any way.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    IIOMetadataNode getNativeNode() {

    /**
     * Returns a tree of DOM nodes representing this object and any
     * subordinate JFXX extension or ICC Profile segments.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    void addICC(ICC_ColorSpace cs) throws IOException {

    /**
     * Add an ICC Profile APP2 segment by constructing it from
     * the given ICC_ColorSpace object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    void addICC(JPEGBuffer buffer) throws IOException {

    /**
     * Adds an ICC Profile APP2 segment from the stream wrapped
     * in the JPEGBuffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    void addJFXX(JPEGBuffer buffer, JPEGImageReader reader)

    /**
     * Add an JFXX extension marker segment from the stream wrapped
     * in the JPEGBuffer to the list of extension segments.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    protected Object clone() {

    /**
     * Returns a deep-copy clone of this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    JFIFMarkerSegment(Node node) throws IIOInvalidTreeException {

    /**
     * Constructs a JFIF header from a DOM Node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    JFIFMarkerSegment(JPEGBuffer buffer) throws IOException {

    /**
     * Constructs a JFIF header by reading from a stream wrapped
     * in a JPEGBuffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    JFIFMarkerSegment() {

    /**
     * Default constructor.  Used to create a default JFIF header
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    private ICCMarkerSegment tempICCSegment = null;

    /**
     * A placeholder for an ICC profile marker segment under
     * construction.  The segment is not added to the list
     * until all chunks have been read.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
    private boolean inICC = false;

    /**
     * Set to <code>true</code> when reading the chunks of an
     * ICC profile.  All chunks are consolidated to create a single
     * "segment" containing all the chunks.  This flag is a state
     * variable identifying whether to construct a new segment or
     * append to an old one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JFIFMarkerSegment.java
class JFIFMarkerSegment extends MarkerSegment {

/**
 * A JFIF (JPEG File Interchange Format) APP0 (Application-Specific)
 * marker segment.  Inner classes are included for JFXX extension
 * marker segments, for different varieties of thumbnails, and for
 * ICC Profile APP2 marker segments.  Any of these secondary types
 * that occur are kept as members of a single JFIFMarkerSegment object.
 */
