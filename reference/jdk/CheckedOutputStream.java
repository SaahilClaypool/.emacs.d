_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/CheckedOutputStream.java
    public Checksum getChecksum() {

    /**
     * Returns the Checksum for this output stream.
     * @return the Checksum
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/CheckedOutputStream.java
    public void write(byte[] b, int off, int len) throws IOException {

    /**
     * Writes an array of bytes. Will block until the bytes are
     * actually written.
     * @param b the data to be written
     * @param off the start offset of the data
     * @param len the number of bytes to be written
     * @exception IOException if an I/O error has occurred
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/CheckedOutputStream.java
    public void write(int b) throws IOException {

    /**
     * Writes a byte. Will block until the byte is actually written.
     * @param b the byte to be written
     * @exception IOException if an I/O error has occurred
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/CheckedOutputStream.java
    public CheckedOutputStream(OutputStream out, Checksum cksum) {

    /**
     * Creates an output stream with the specified Checksum.
     * @param out the output stream
     * @param cksum the checksum
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/CheckedOutputStream.java
public

/**
 * An output stream that also maintains a checksum of the data being
 * written. The checksum can then be used to verify the integrity of
 * the output data.
 *
 * @see         Checksum
 * @author      David Connelly
 */
