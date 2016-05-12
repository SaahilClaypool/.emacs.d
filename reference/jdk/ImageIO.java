_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    private static boolean doWrite(RenderedImage im, ImageWriter writer,
                                 ImageOutputStream output) throws IOException {

    /**
     * Writes image to output stream  using given image writer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    private static ImageWriter getWriter(RenderedImage im,
                                         String formatName) {

    /**
     * Returns <code>ImageWriter</code> instance according to given
     * rendered image and image format or <code>null</code> if there
     * is no appropriate writer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static boolean write(RenderedImage im,
                                String formatName,
                                OutputStream output) throws IOException {

    /**
     * Writes an image using an arbitrary <code>ImageWriter</code>
     * that supports the given format to an <code>OutputStream</code>.
     *
     * <p> This method <em>does not</em> close the provided
     * <code>OutputStream</code> after the write operation has completed;
     * it is the responsibility of the caller to close the stream, if desired.
     *
     * <p> The current cache settings from <code>getUseCache</code>and
     * <code>getCacheDirectory</code> will be used to control caching.
     *
     * @param im a <code>RenderedImage</code> to be written.
     * @param formatName a <code>String</code> containing the informal
     * name of the format.
     * @param output an <code>OutputStream</code> to be written to.
     *
     * @return <code>false</code> if no appropriate writer is found.
     *
     * @exception IllegalArgumentException if any parameter is
     * <code>null</code>.
     * @exception IOException if an error occurs during writing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static boolean write(RenderedImage im,
                                String formatName,
                                File output) throws IOException {

    /**
     * Writes an image using an arbitrary <code>ImageWriter</code>
     * that supports the given format to a <code>File</code>.  If
     * there is already a <code>File</code> present, its contents are
     * discarded.
     *
     * @param im a <code>RenderedImage</code> to be written.
     * @param formatName a <code>String</code> containing the informal
     * name of the format.
     * @param output a <code>File</code> to be written to.
     *
     * @return <code>false</code> if no appropriate writer is found.
     *
     * @exception IllegalArgumentException if any parameter is
     * <code>null</code>.
     * @exception IOException if an error occurs during writing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static boolean write(RenderedImage im,
                                String formatName,
                                ImageOutputStream output) throws IOException {

    /**
     * Writes an image using the an arbitrary <code>ImageWriter</code>
     * that supports the given format to an
     * <code>ImageOutputStream</code>.  The image is written to the
     * <code>ImageOutputStream</code> starting at the current stream
     * pointer, overwriting existing stream data from that point
     * forward, if present.
     *
     * <p> This method <em>does not</em> close the provided
     * <code>ImageOutputStream</code> after the write operation has completed;
     * it is the responsibility of the caller to close the stream, if desired.
     *
     * @param im a <code>RenderedImage</code> to be written.
     * @param formatName a <code>String</code> containing the informal
     * name of the format.
     * @param output an <code>ImageOutputStream</code> to be written to.
     *
     * @return <code>false</code> if no appropriate writer is found.
     *
     * @exception IllegalArgumentException if any parameter is
     * <code>null</code>.
     * @exception IOException if an error occurs during writing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static BufferedImage read(ImageInputStream stream)

    /**
     * Returns a <code>BufferedImage</code> as the result of decoding
     * a supplied <code>ImageInputStream</code> with an
     * <code>ImageReader</code> chosen automatically from among those
     * currently registered.  If no registered
     * <code>ImageReader</code> claims to be able to read the stream,
     * <code>null</code> is returned.
     *
     * <p> Unlike most other methods in this class, this method <em>does</em>
     * close the provided <code>ImageInputStream</code> after the read
     * operation has completed, unless <code>null</code> is returned,
     * in which case this method <em>does not</em> close the stream.
     *
     * @param stream an <code>ImageInputStream</code> to read from.
     *
     * @return a <code>BufferedImage</code> containing the decoded
     * contents of the input, or <code>null</code>.
     *
     * @exception IllegalArgumentException if <code>stream</code> is
     * <code>null</code>.
     * @exception IOException if an error occurs during reading.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static BufferedImage read(URL input) throws IOException {

    /**
     * Returns a <code>BufferedImage</code> as the result of decoding
     * a supplied <code>URL</code> with an <code>ImageReader</code>
     * chosen automatically from among those currently registered.  An
     * <code>InputStream</code> is obtained from the <code>URL</code>,
     * which is wrapped in an <code>ImageInputStream</code>.  If no
     * registered <code>ImageReader</code> claims to be able to read
     * the resulting stream, <code>null</code> is returned.
     *
     * <p> The current cache settings from <code>getUseCache</code>and
     * <code>getCacheDirectory</code> will be used to control caching in the
     * <code>ImageInputStream</code> that is created.
     *
     * <p> This method does not attempt to locate
     * <code>ImageReader</code>s that can read directly from a
     * <code>URL</code>; that may be accomplished using
     * <code>IIORegistry</code> and <code>ImageReaderSpi</code>.
     *
     * @param input a <code>URL</code> to read from.
     *
     * @return a <code>BufferedImage</code> containing the decoded
     * contents of the input, or <code>null</code>.
     *
     * @exception IllegalArgumentException if <code>input</code> is
     * <code>null</code>.
     * @exception IOException if an error occurs during reading.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static BufferedImage read(InputStream input) throws IOException {

    /**
     * Returns a <code>BufferedImage</code> as the result of decoding
     * a supplied <code>InputStream</code> with an <code>ImageReader</code>
     * chosen automatically from among those currently registered.
     * The <code>InputStream</code> is wrapped in an
     * <code>ImageInputStream</code>.  If no registered
     * <code>ImageReader</code> claims to be able to read the
     * resulting stream, <code>null</code> is returned.
     *
     * <p> The current cache settings from <code>getUseCache</code>and
     * <code>getCacheDirectory</code> will be used to control caching in the
     * <code>ImageInputStream</code> that is created.
     *
     * <p> This method does not attempt to locate
     * <code>ImageReader</code>s that can read directly from an
     * <code>InputStream</code>; that may be accomplished using
     * <code>IIORegistry</code> and <code>ImageReaderSpi</code>.
     *
     * <p> This method <em>does not</em> close the provided
     * <code>InputStream</code> after the read operation has completed;
     * it is the responsibility of the caller to close the stream, if desired.
     *
     * @param input an <code>InputStream</code> to read from.
     *
     * @return a <code>BufferedImage</code> containing the decoded
     * contents of the input, or <code>null</code>.
     *
     * @exception IllegalArgumentException if <code>input</code> is
     * <code>null</code>.
     * @exception IOException if an error occurs during reading.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static BufferedImage read(File input) throws IOException {

    /**
     * Returns a <code>BufferedImage</code> as the result of decoding
     * a supplied <code>File</code> with an <code>ImageReader</code>
     * chosen automatically from among those currently registered.
     * The <code>File</code> is wrapped in an
     * <code>ImageInputStream</code>.  If no registered
     * <code>ImageReader</code> claims to be able to read the
     * resulting stream, <code>null</code> is returned.
     *
     * <p> The current cache settings from <code>getUseCache</code>and
     * <code>getCacheDirectory</code> will be used to control caching in the
     * <code>ImageInputStream</code> that is created.
     *
     * <p> Note that there is no <code>read</code> method that takes a
     * filename as a <code>String</code>; use this method instead after
     * creating a <code>File</code> from the filename.
     *
     * <p> This method does not attempt to locate
     * <code>ImageReader</code>s that can read directly from a
     * <code>File</code>; that may be accomplished using
     * <code>IIORegistry</code> and <code>ImageReaderSpi</code>.
     *
     * @param input a <code>File</code> to read from.
     *
     * @return a <code>BufferedImage</code> containing the decoded
     * contents of the input, or <code>null</code>.
     *
     * @exception IllegalArgumentException if <code>input</code> is
     * <code>null</code>.
     * @exception IOException if an error occurs during reading.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static Iterator<ImageTranscoder>

    /**
     * Returns an <code>Iterator</code> containing all currently
     * registered <code>ImageTranscoder</code>s that claim to be
     * able to transcode between the metadata of the given
     * <code>ImageReader</code> and <code>ImageWriter</code>.
     *
     * @param reader an <code>ImageReader</code>.
     * @param writer an <code>ImageWriter</code>.
     *
     * @return an <code>Iterator</code> containing
     * <code>ImageTranscoder</code>s.
     *
     * @exception IllegalArgumentException if <code>reader</code> or
     * <code>writer</code> is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static Iterator<ImageWriter>

    /**
     * Returns an <code>Iterator</code> containing all currently
     * registered <code>ImageWriter</code>s that claim to be able to
     * encode images of the given layout (specified using an
     * <code>ImageTypeSpecifier</code>) in the given format.
     *
     * @param type an <code>ImageTypeSpecifier</code> indicating the
     * layout of the image to be written.
     * @param formatName the informal name of the <code>format</code>.
     *
     * @return an <code>Iterator</code> containing <code>ImageWriter</code>s.
     *
     * @exception IllegalArgumentException if any parameter is
     * <code>null</code>.
     *
     * @see javax.imageio.spi.ImageWriterSpi#canEncodeImage(ImageTypeSpecifier)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static ImageReader getImageReader(ImageWriter writer) {

    /**
     * Returns an <code>ImageReader</code>corresponding to the given
     * <code>ImageWriter</code>, if there is one, or <code>null</code>
     * if the plug-in for this <code>ImageWriter</code> does not
     * specify a corresponding <code>ImageReader</code>, or if the
     * given <code>ImageWriter</code> is not registered.  This method
     * is provided principally for symmetry with
     * <code>getImageWriter(ImageReader)</code>.  Note that this
     * method returns the "preferred" reader, which is the first in
     * the list returned by
     * javax.imageio.spi.ImageWriterSpi.<code>getImageReaderSpiNames()</code>.
     *
     * @param writer an instance of a registered <code>ImageWriter</code>.
     *
     * @return an <code>ImageReader</code>, or null.
     *
     * @exception IllegalArgumentException if <code>writer</code> is
     * <code>null</code>.
     *
     * @see #getImageWriter(ImageReader)
     * @see javax.imageio.spi.ImageWriterSpi#getImageReaderSpiNames()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static ImageWriter getImageWriter(ImageReader reader) {

    /**
     * Returns an <code>ImageWriter</code>corresponding to the given
     * <code>ImageReader</code>, if there is one, or <code>null</code>
     * if the plug-in for this <code>ImageReader</code> does not
     * specify a corresponding <code>ImageWriter</code>, or if the
     * given <code>ImageReader</code> is not registered.  This
     * mechanism may be used to obtain an <code>ImageWriter</code>
     * that will understand the internal structure of non-pixel
     * metadata (as encoded by <code>IIOMetadata</code> objects)
     * generated by the <code>ImageReader</code>.  By obtaining this
     * data from the <code>ImageReader</code> and passing it on to the
     * <code>ImageWriter</code> obtained with this method, a client
     * program can read an image, modify it in some way, and write it
     * back out preserving all metadata, without having to understand
     * anything about the structure of the metadata, or even about
     * the image format.  Note that this method returns the
     * "preferred" writer, which is the first in the list returned by
     * <code>javax.imageio.spi.ImageReaderSpi.getImageWriterSpiNames()</code>.
     *
     * @param reader an instance of a registered <code>ImageReader</code>.
     *
     * @return an <code>ImageWriter</code>, or null.
     *
     * @exception IllegalArgumentException if <code>reader</code> is
     * <code>null</code>.
     *
     * @see #getImageReader(ImageWriter)
     * @see javax.imageio.spi.ImageReaderSpi#getImageWriterSpiNames()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static Iterator<ImageWriter>

    /**
     * Returns an <code>Iterator</code> containing all currently
     * registered <code>ImageWriter</code>s that claim to be able to
     * encode files with the given MIME type.
     *
     * @param MIMEType a <code>String</code> containing a file
     * suffix (<i>e.g.</i>, "image/jpeg" or "image/x-bmp").
     *
     * @return an <code>Iterator</code> containing <code>ImageWriter</code>s.
     *
     * @exception IllegalArgumentException if <code>MIMEType</code> is
     * <code>null</code>.
     *
     * @see javax.imageio.spi.ImageWriterSpi#getMIMETypes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static Iterator<ImageWriter>

    /**
     * Returns an <code>Iterator</code> containing all currently
     * registered <code>ImageWriter</code>s that claim to be able to
     * encode files with the given suffix.
     *
     * @param fileSuffix a <code>String</code> containing a file
     * suffix (<i>e.g.</i>, "jpg" or "tiff").
     *
     * @return an <code>Iterator</code> containing <code>ImageWriter</code>s.
     *
     * @exception IllegalArgumentException if <code>fileSuffix</code> is
     * <code>null</code>.
     *
     * @see javax.imageio.spi.ImageWriterSpi#getFileSuffixes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static Iterator<ImageWriter>

    /**
     * Returns an <code>Iterator</code> containing all currently
     * registered <code>ImageWriter</code>s that claim to be able to
     * encode the named format.
     *
     * @param formatName a <code>String</code> containing the informal
     * name of a format (<i>e.g.</i>, "jpeg" or "tiff".
     *
     * @return an <code>Iterator</code> containing
     * <code>ImageWriter</code>s.
     *
     * @exception IllegalArgumentException if <code>formatName</code> is
     * <code>null</code>.
     *
     * @see javax.imageio.spi.ImageWriterSpi#getFormatNames
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static String[] getWriterFileSuffixes() {

    /**
     * Returns an array of <code>String</code>s listing all of the
     * file suffixes associated with the formats understood
     * by the current set of registered writers.
     *
     * @return an array of <code>String</code>s.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static String[] getWriterMIMETypes() {

    /**
     * Returns an array of <code>String</code>s listing all of the
     * MIME types understood by the current set of registered
     * writers.
     *
     * @return an array of <code>String</code>s.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static String[] getWriterFormatNames() {

    /**
     * Returns an array of <code>String</code>s listing all of the
     * informal format names understood by the current set of registered
     * writers.
     *
     * @return an array of <code>String</code>s.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static Iterator<ImageReader>

    /**
     * Returns an <code>Iterator</code> containing all currently
     * registered <code>ImageReader</code>s that claim to be able to
     * decode files with the given MIME type.
     *
     * @param MIMEType a <code>String</code> containing a file
     * suffix (<i>e.g.</i>, "image/jpeg" or "image/x-bmp").
     *
     * @return an <code>Iterator</code> containing
     * <code>ImageReader</code>s.
     *
     * @exception IllegalArgumentException if <code>MIMEType</code> is
     * <code>null</code>.
     *
     * @see javax.imageio.spi.ImageReaderSpi#getMIMETypes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static Iterator<ImageReader>

    /**
     * Returns an <code>Iterator</code> containing all currently
     * registered <code>ImageReader</code>s that claim to be able to
     * decode files with the given suffix.
     *
     * @param fileSuffix a <code>String</code> containing a file
     * suffix (<i>e.g.</i>, "jpg" or "tiff").
     *
     * @return an <code>Iterator</code> containing
     * <code>ImageReader</code>s.
     *
     * @exception IllegalArgumentException if <code>fileSuffix</code>
     * is <code>null</code>.
     *
     * @see javax.imageio.spi.ImageReaderSpi#getFileSuffixes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static Iterator<ImageReader>

    /**
     * Returns an <code>Iterator</code> containing all currently
     * registered <code>ImageReader</code>s that claim to be able to
     * decode the named format.
     *
     * @param formatName a <code>String</code> containing the informal
     * name of a format (<i>e.g.</i>, "jpeg" or "tiff".
     *
     * @return an <code>Iterator</code> containing
     * <code>ImageReader</code>s.
     *
     * @exception IllegalArgumentException if <code>formatName</code>
     * is <code>null</code>.
     *
     * @see javax.imageio.spi.ImageReaderSpi#getFormatNames
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static Iterator<ImageReader> getImageReaders(Object input) {

    /**
     * Returns an <code>Iterator</code> containing all currently
     * registered <code>ImageReader</code>s that claim to be able to
     * decode the supplied <code>Object</code>, typically an
     * <code>ImageInputStream</code>.
     *
     * <p> The stream position is left at its prior position upon
     * exit from this method.
     *
     * @param input an <code>ImageInputStream</code> or other
     * <code>Object</code> containing encoded image data.
     *
     * @return an <code>Iterator</code> containing <code>ImageReader</code>s.
     *
     * @exception IllegalArgumentException if <code>input</code> is
     * <code>null</code>.
     *
     * @see javax.imageio.spi.ImageReaderSpi#canDecodeInput
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static String[] getReaderFileSuffixes() {

    /**
     * Returns an array of <code>String</code>s listing all of the
     * file suffixes associated with the formats understood
     * by the current set of registered readers.
     *
     * @return an array of <code>String</code>s.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static String[] getReaderMIMETypes() {

    /**
     * Returns an array of <code>String</code>s listing all of the
     * MIME types understood by the current set of registered
     * readers.
     *
     * @return an array of <code>String</code>s.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static String[] getReaderFormatNames() {

    /**
     * Returns an array of <code>String</code>s listing all of the
     * informal format names understood by the current set of registered
     * readers.
     *
     * @return an array of <code>String</code>s.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static ImageOutputStream createImageOutputStream(Object output)

    /**
     * Returns an <code>ImageOutputStream</code> that will send its
     * output to the given <code>Object</code>.  The set of
     * <code>ImageOutputStreamSpi</code>s registered with the
     * <code>IIORegistry</code> class is queried and the first one
     * that is able to send output from the supplied object is used to
     * create the returned <code>ImageOutputStream</code>.  If no
     * suitable <code>ImageOutputStreamSpi</code> exists,
     * <code>null</code> is returned.
     *
     * <p> The current cache settings from <code>getUseCache</code>and
     * <code>getCacheDirectory</code> will be used to control caching.
     *
     * @param output an <code>Object</code> to be used as an output
     * destination, such as a <code>File</code>, writable
     * <code>RandomAccessFile</code>, or <code>OutputStream</code>.
     *
     * @return an <code>ImageOutputStream</code>, or
     * <code>null</code>.
     *
     * @exception IllegalArgumentException if <code>output</code> is
     * <code>null</code>.
     * @exception IOException if a cache file is needed but cannot be
     * created.
     *
     * @see javax.imageio.spi.ImageOutputStreamSpi
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static ImageInputStream createImageInputStream(Object input)

    /**
     * Returns an <code>ImageInputStream</code> that will take its
     * input from the given <code>Object</code>.  The set of
     * <code>ImageInputStreamSpi</code>s registered with the
     * <code>IIORegistry</code> class is queried and the first one
     * that is able to take input from the supplied object is used to
     * create the returned <code>ImageInputStream</code>.  If no
     * suitable <code>ImageInputStreamSpi</code> exists,
     * <code>null</code> is returned.
     *
     * <p> The current cache settings from <code>getUseCache</code>and
     * <code>getCacheDirectory</code> will be used to control caching.
     *
     * @param input an <code>Object</code> to be used as an input
     * source, such as a <code>File</code>, readable
     * <code>RandomAccessFile</code>, or <code>InputStream</code>.
     *
     * @return an <code>ImageInputStream</code>, or <code>null</code>.
     *
     * @exception IllegalArgumentException if <code>input</code>
     * is <code>null</code>.
     * @exception IOException if a cache file is needed but cannot be
     * created.
     *
     * @see javax.imageio.spi.ImageInputStreamSpi
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static File getCacheDirectory() {

    /**
     * Returns the current value set by
     * <code>setCacheDirectory</code>, or <code>null</code> if no
     * explicit setting has been made.
     *
     * @return a <code>File</code> indicating the directory where
     * cache files will be created, or <code>null</code> to indicate
     * the system-dependent default temporary-file directory.
     *
     * @see #setCacheDirectory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static void setCacheDirectory(File cacheDirectory) {

    /**
     * Sets the directory where cache files are to be created.  A
     * value of <code>null</code> indicates that the system-dependent
     * default temporary-file directory is to be used.  If
     * <code>getUseCache</code> returns false, this value is ignored.
     *
     * @param cacheDirectory a <code>File</code> specifying a directory.
     *
     * @see File#createTempFile(String, String, File)
     *
     * @exception SecurityException if the security manager denies
     * access to the directory.
     * @exception IllegalArgumentException if <code>cacheDir</code> is
     * non-<code>null</code> but is not a directory.
     *
     * @see #getCacheDirectory
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static boolean getUseCache() {

    /**
     * Returns the current value set by <code>setUseCache</code>, or
     * <code>true</code> if no explicit setting has been made.
     *
     * @return true if a disk-based cache may be used for
     * <code>ImageInputStream</code>s and
     * <code>ImageOutputStream</code>s.
     *
     * @see #setUseCache
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static void setUseCache(boolean useCache) {

    /**
     * Sets a flag indicating whether a disk-based cache file should
     * be used when creating <code>ImageInputStream</code>s and
     * <code>ImageOutputStream</code>s.
     *
     * <p> When reading from a standard <code>InputStream</code>, it
     * may be necessary to save previously read information in a cache
     * since the underlying stream does not allow data to be re-read.
     * Similarly, when writing to a standard
     * <code>OutputStream</code>, a cache may be used to allow a
     * previously written value to be changed before flushing it to
     * the final destination.
     *
     * <p> The cache may reside in main memory or on disk.  Setting
     * this flag to <code>false</code> disallows the use of disk for
     * future streams, which may be advantageous when working with
     * small images, as the overhead of creating and destroying files
     * is removed.
     *
     * <p> On startup, the value is set to <code>true</code>.
     *
     * @param useCache a <code>boolean</code> indicating whether a
     * cache file should be used, in cases where it is optional.
     *
     * @see #getUseCache
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    private static boolean hasCachePermission() {

    /**
     * Determines whether the caller has write access to the cache
     * directory, stores the result in the <code>CacheInfo</code> object,
     * and returns the decision.  This method helps to prevent mysterious
     * SecurityExceptions to be thrown when this convenience class is used
     * in an applet, for example.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    private static String getTempDir() {

    /**
     * Returns the default temporary (cache) directory as defined by the
     * java.io.tmpdir system property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    private static synchronized CacheInfo getCacheInfo() {

    /**
     * Returns the <code>CacheInfo</code> object associated with this
     * <code>ThreadGroup</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    static class CacheInfo {

    /**
     * A class to hold information about caching.  Each
     * <code>ThreadGroup</code> will have its own copy
     * via the <code>AppContext</code> mechanism.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    public static void scanForPlugins() {

    /**
     * Scans for plug-ins on the application class path,
     * loads their service provider classes, and registers a service
     * provider instance for each one found with the
     * <code>IIORegistry</code>.
     *
     * <p>This method is needed because the application class path can
     * theoretically change, or additional plug-ins may become available.
     * Rather than re-scanning the classpath on every invocation of the
     * API, the class path is scanned automatically only on the first
     * invocation. Clients can call this method to prompt a re-scan.
     * Thus this method need only be invoked by sophisticated applications
     * which dynamically make new plug-ins available at runtime.
     *
     * <p> The <code>getResources</code> method of the context
     * <code>ClassLoader</code> is used locate JAR files containing
     * files named
     * <code>META-INF/services/javax.imageio.spi.</code><i>classname</i>,
     * where <i>classname</i> is one of <code>ImageReaderSpi</code>,
     * <code>ImageWriterSpi</code>, <code>ImageTranscoderSpi</code>,
     * <code>ImageInputStreamSpi</code>, or
     * <code>ImageOutputStreamSpi</code>, along the application class
     * path.
     *
     * <p> The contents of the located files indicate the names of
     * actual implementation classes which implement the
     * aforementioned service provider interfaces; the default class
     * loader is then used to load each of these classes and to
     * instantiate an instance of each class, which is then placed
     * into the registry for later retrieval.
     *
     * <p> The exact set of locations searched depends on the
     * implementation of the Java runtime environment.
     *
     * @see ClassLoader#getResources
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
    private ImageIO() {}

    /**
     * Constructor is private to prevent instantiation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/imageio/ImageIO.java
public final class ImageIO {

/**
 * A class containing static convenience methods for locating
 * <code>ImageReader</code>s and <code>ImageWriter</code>s, and
 * performing simple encoding and decoding.
 *
 */
