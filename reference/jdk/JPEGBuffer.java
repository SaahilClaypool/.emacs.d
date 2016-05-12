_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JPEGBuffer.java
    void print(int count) {

    /**
     * Prints the contents of the buffer, in hex.
     * @param count the number of bytes to print,
     * starting at the current available byte.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JPEGBuffer.java
    boolean scanForFF(JPEGImageReader reader) throws IOException {

    /**
     * Scan the buffer until the next 0xff byte, reloading
     * the buffer as necessary.  The buffer position is left
     * pointing to the first non-0xff byte after a run of
     * 0xff bytes.  If the end of the stream is encountered,
     * an EOI marker is inserted into the buffer and <code>true</code>
     * is returned.  Otherwise returns <code>false</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JPEGBuffer.java
    long getStreamPosition() throws IOException {

    /**
     * Return the stream position corresponding to the next
     * available byte in the buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JPEGBuffer.java
    void pushBack() throws IOException {

    /**
     * Push back the remaining contents of the buffer by
     * repositioning the input stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JPEGBuffer.java
    void skipData(int count) throws IOException {

    /**
     * Skips <code>count</code> bytes, leaving the buffer
     * in an appropriate state.  If the end of the stream is
     * encountered, an <code>IIOException</code> is thrown with the
     * message "Image Format Error".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JPEGBuffer.java
    void readData(byte [] data) throws IOException {

    /**
     * Fills the data array from the stream, starting with
     * the buffer and then reading directly from the stream
     * if necessary.  The buffer is left in an appropriate
     * state.  If the end of the stream is encountered, an
     * <code>IIOException</code> is thrown with the
     * message "Image Format Error".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JPEGBuffer.java
    void loadBuf(int count) throws IOException {

    /**
     * Ensures that there are at least <code>count</code> bytes available
     * in the buffer, loading more data and moving any remaining
     * bytes to the front.  A count of 0 means to just fill the buffer.
     * If the count is larger than the buffer size, just fills the buffer.
     * If the end of the stream is encountered before a non-0 count can
     * be satisfied, an <code>IIOException</code> is thrown with the
     * message "Image Format Error".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JPEGBuffer.java
    ImageInputStream iis;

    /**
     * The ImageInputStream buffered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JPEGBuffer.java
    int bufPtr;

    /**
     * A pointer to the next available byte in the buffer.  This is
     * used to read data from the buffer and must be updated to
     * move through the buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JPEGBuffer.java
    int bufAvail;

    /**
     * The number of bytes available for reading from the buffer.
     * Anytime data is read from the buffer, this should be updated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JPEGBuffer.java
    byte [] buf;

    /**
     * The actual buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JPEGBuffer.java
    final int BUFFER_SIZE = 4096;

    /**
     * The size of the buffer.  This is large enough to hold all
     * known marker segments (other than thumbnails and icc profiles)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JPEGBuffer.java
class JPEGBuffer {

/**
 * A class wrapping a buffer and its state.  For efficiency,
 * the members are made visible to other classes in this package.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JPEGBuffer.java
    void print(int count) {

    /**
     * Prints the contents of the buffer, in hex.
     * @param count the number of bytes to print,
     * starting at the current available byte.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JPEGBuffer.java
    boolean scanForFF(JPEGImageReader reader) throws IOException {

    /**
     * Scan the buffer until the next 0xff byte, reloading
     * the buffer as necessary.  The buffer position is left
     * pointing to the first non-0xff byte after a run of
     * 0xff bytes.  If the end of the stream is encountered,
     * an EOI marker is inserted into the buffer and <code>true</code>
     * is returned.  Otherwise returns <code>false</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JPEGBuffer.java
    long getStreamPosition() throws IOException {

    /**
     * Return the stream position corresponding to the next
     * available byte in the buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JPEGBuffer.java
    void pushBack() throws IOException {

    /**
     * Push back the remaining contents of the buffer by
     * repositioning the input stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JPEGBuffer.java
    void skipData(int count) throws IOException {

    /**
     * Skips <code>count</code> bytes, leaving the buffer
     * in an appropriate state.  If the end of the stream is
     * encountered, an <code>IIOException</code> is thrown with the
     * message "Image Format Error".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JPEGBuffer.java
    void readData(byte [] data) throws IOException {

    /**
     * Fills the data array from the stream, starting with
     * the buffer and then reading directly from the stream
     * if necessary.  The buffer is left in an appropriate
     * state.  If the end of the stream is encountered, an
     * <code>IIOException</code> is thrown with the
     * message "Image Format Error".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JPEGBuffer.java
    void loadBuf(int count) throws IOException {

    /**
     * Ensures that there are at least <code>count</code> bytes available
     * in the buffer, loading more data and moving any remaining
     * bytes to the front.  A count of 0 means to just fill the buffer.
     * If the count is larger than the buffer size, just fills the buffer.
     * If the end of the stream is encountered before a non-0 count can
     * be satisfied, an <code>IIOException</code> is thrown with the
     * message "Image Format Error".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JPEGBuffer.java
    ImageInputStream iis;

    /**
     * The ImageInputStream buffered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JPEGBuffer.java
    int bufPtr;

    /**
     * A pointer to the next available byte in the buffer.  This is
     * used to read data from the buffer and must be updated to
     * move through the buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JPEGBuffer.java
    int bufAvail;

    /**
     * The number of bytes available for reading from the buffer.
     * Anytime data is read from the buffer, this should be updated.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JPEGBuffer.java
    byte [] buf;

    /**
     * The actual buffer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JPEGBuffer.java
    final int BUFFER_SIZE = 4096;

    /**
     * The size of the buffer.  This is large enough to hold all
     * known marker segments (other than thumbnails and icc profiles)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/imageio/plugins/jpeg/JPEGBuffer.java
class JPEGBuffer {

/**
 * A class wrapping a buffer and its state.  For efficiency,
 * the members are made visible to other classes in this package.
 */
