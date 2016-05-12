_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    public Object clone() {

    /**
     * Returns a copy of this entry.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    public int hashCode() {

    /**
     * Returns the hash code value for this entry.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    public String toString() {

    /**
     * Returns a string representation of the ZIP entry.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    public boolean isDirectory() {

    /**
     * Returns true if this is a directory entry. A directory entry is
     * defined to be one whose name ends with a '/'.
     * @return true if this is a directory entry
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    public String getComment() {

    /**
     * Returns the comment string for the entry.
     *
     * @return the comment string for the entry, or null if none
     *
     * @see #setComment(String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    public void setComment(String comment) {

    /**
     * Sets the optional comment string for the entry.
     *
     * <p>ZIP entry comments have maximum length of 0xffff. If the length of the
     * specified comment string is greater than 0xFFFF bytes after encoding, only
     * the first 0xFFFF bytes are output to the ZIP file entry.
     *
     * @param comment the comment string
     *
     * @see #getComment()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    public byte[] getExtra() {

    /**
     * Returns the extra field data for the entry.
     *
     * @return the extra field data for the entry, or null if none
     *
     * @see #setExtra(byte[])
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    void setExtra0(byte[] extra, boolean doZIP64) {

    /**
     * Sets the optional extra field data for the entry.
     *
     * @param extra
     *        the extra field data bytes
     * @param doZIP64
     *        if true, set size and csize from ZIP64 fields if present
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    public void setExtra(byte[] extra) {

    /**
     * Sets the optional extra field data for the entry.
     *
     * <p> Invoking this method may change this entry's last modification
     * time, last access time and creation time, if the {@code extra} field
     * data includes the extensible timestamp fields, such as {@code NTFS tag
     * 0x0001} or {@code Info-ZIP Extended Timestamp}, as specified in
     * <a href="http://www.info-zip.org/doc/appnote-19970311-iz.zip">Info-ZIP
     * Application Note 970311</a>.
     *
     * @param  extra
     *         The extra field data bytes
     *
     * @throws IllegalArgumentException if the length of the specified
     *         extra field data is greater than 0xFFFF bytes
     *
     * @see #getExtra()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    public int getMethod() {

    /**
     * Returns the compression method of the entry.
     *
     * @return the compression method of the entry, or -1 if not specified
     * @see #setMethod(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    public void setMethod(int method) {

    /**
     * Sets the compression method for the entry.
     *
     * @param method the compression method, either STORED or DEFLATED
     *
     * @throws  IllegalArgumentException if the specified compression
     *          method is invalid
     * @see #getMethod()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    public long getCrc() {

    /**
     * Returns the CRC-32 checksum of the uncompressed entry data.
     *
     * @return the CRC-32 checksum of the uncompressed entry data, or -1 if
     * not known
     *
     * @see #setCrc(long)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    public void setCrc(long crc) {

    /**
     * Sets the CRC-32 checksum of the uncompressed entry data.
     *
     * @param crc the CRC-32 value
     *
     * @throws IllegalArgumentException if the specified CRC-32 value is
     *         less than 0 or greater than 0xFFFFFFFF
     * @see #getCrc()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    public void setCompressedSize(long csize) {

    /**
     * Sets the size of the compressed entry data.
     *
     * @param csize the compressed size to set to
     *
     * @see #getCompressedSize()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    public long getCompressedSize() {

    /**
     * Returns the size of the compressed entry data.
     *
     * <p> In the case of a stored entry, the compressed size will be the same
     * as the uncompressed size of the entry.
     *
     * @return the size of the compressed entry data, or -1 if not known
     * @see #setCompressedSize(long)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    public long getSize() {

    /**
     * Returns the uncompressed size of the entry data.
     *
     * @return the uncompressed size of the entry data, or -1 if not known
     * @see #setSize(long)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    public void setSize(long size) {

    /**
     * Sets the uncompressed size of the entry data.
     *
     * @param size the uncompressed size in bytes
     *
     * @throws IllegalArgumentException if the specified size is less
     *         than 0, is greater than 0xFFFFFFFF when
     *         <a href="package-summary.html#zip64">ZIP64 format</a> is not supported,
     *         or is less than 0 when ZIP64 is supported
     * @see #getSize()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    public FileTime getCreationTime() {

    /**
     * Returns the creation time of the entry.
     *
     * <p> The creation time is from the extended timestamp fields of
     * entry's {@code optional extra data} when read from a ZIP file
     * or ZIP file formatted stream.
     *
     * @return the creation time of the entry, null if not specified
     * @see #setCreationTime(FileTime)
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    public ZipEntry setCreationTime(FileTime time) {

    /**
     * Sets the creation time of the entry.
     *
     * <p> If set, the creation time will be stored into the extended
     * timestamp fields of entry's {@code optional extra data}, when
     * output to a ZIP file or ZIP file formatted stream.
     *
     * @param  time
     *         The creation time of the entry
     * @return This zip entry
     *
     * @throws NullPointerException if the {@code time} is null
     *
     * @see #getCreationTime()
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    public FileTime getLastAccessTime() {

    /**
     * Returns the last access time of the entry.
     *
     * <p> The last access time is from the extended timestamp fields
     * of entry's {@code optional extra data} when read from a ZIP file
     * or ZIP file formatted stream.
     *
     * @return The last access time of the entry, null if not specified

     * @see #setLastAccessTime(FileTime)
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    public ZipEntry setLastAccessTime(FileTime time) {

    /**
     * Sets the last access time of the entry.
     *
     * <p> If set, the last access time will be stored into the extended
     * timestamp fields of entry's {@code optional extra data}, when output
     * to a ZIP file or ZIP file formatted stream.
     *
     * @param  time
     *         The last access time of the entry
     * @return This zip entry
     *
     * @throws NullPointerException if the {@code time} is null
     *
     * @see #getLastAccessTime()
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    public FileTime getLastModifiedTime() {

    /**
     * Returns the last modification time of the entry.
     *
     * <p> If the entry is read from a ZIP file or ZIP file formatted
     * input stream, this is the last modification time from the zip
     * file entry's {@code optional extra data} if the extended timestamp
     * fields are present. Otherwise the last modification time is read
     * from the entry's {@code date and time fields}, the {@link
     * java.util.TimeZone#getDefault() default TimeZone} is used to convert
     * the standard MS-DOS formatted date and time to the epoch time.
     *
     * @return The last modification time of the entry, null if not specified
     *
     * @see #setLastModifiedTime(FileTime)
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    public ZipEntry setLastModifiedTime(FileTime time) {

    /**
     * Sets the last modification time of the entry.
     *
     * <p> When output to a ZIP file or ZIP file formatted output stream
     * the last modification time set by this method will be stored into
     * zip file entry's {@code date and time fields} in {@code standard
     * MS-DOS date and time format}), and the extended timestamp fields
     * in {@code optional extra data} in UTC time.
     *
     * @param  time
     *         The last modification time of the entry
     * @return This zip entry
     *
     * @throws NullPointerException if the {@code time} is null
     *
     * @see #getLastModifiedTime()
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    public long getTime() {

    /**
     * Returns the last modification time of the entry.
     *
     * <p> If the entry is read from a ZIP file or ZIP file formatted
     * input stream, this is the last modification time from the {@code
     * date and time fields} of the zip file entry. The
     * {@link java.util.TimeZone#getDefault() default TimeZone} is used
     * to convert the standard MS-DOS formatted date and time to the
     * epoch time.
     *
     * @return  The last modification time of the entry in milliseconds
     *          since the epoch, or -1 if not specified
     *
     * @see #setTime(long)
     * @see #setLastModifiedTime(FileTime)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    public void setTime(long time) {

    /**
     * Sets the last modification time of the entry.
     *
     * <p> If the entry is output to a ZIP file or ZIP file formatted
     * output stream the last modification time set by this method will
     * be stored into the {@code date and time fields} of the zip file
     * entry and encoded in standard {@code MS-DOS date and time format}.
     * The {@link java.util.TimeZone#getDefault() default TimeZone} is
     * used to convert the epoch time to the MS-DOS data and time.
     *
     * @param  time
     *         The last modification time of the entry in milliseconds
     *         since the epoch
     *
     * @see #getTime()
     * @see #getLastModifiedTime()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    public String getName() {

    /**
     * Returns the name of the entry.
     * @return the name of the entry
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    ZipEntry() {}

    /**
     * Creates a new un-initialized zip entry
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    public ZipEntry(ZipEntry e) {

    /**
     * Creates a new zip entry with fields taken from the specified
     * zip entry.
     *
     * @param  e
     *         A zip Entry object
     *
     * @throws NullPointerException if the entry object is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    public ZipEntry(String name) {

    /**
     * Creates a new zip entry with the specified name.
     *
     * @param  name
     *         The entry name
     *
     * @throws NullPointerException if the entry name is null
     * @throws IllegalArgumentException if the entry name is longer than
     *         0xFFFF bytes
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    private static final long UPPER_DOSTIME_BOUND =

    /**
     * Approximately 128 years, in milliseconds (ignoring leap years etc).
     *
     * This establish an approximate high-bound value for DOS times in
     * milliseconds since epoch, used to enable an efficient but
     * sufficient bounds check to avoid generating extended last modified
     * time entries.
     *
     * Calculating the exact number is locale dependent, would require loading
     * TimeZone data eagerly, and would make little practical sense. Since DOS
     * times theoretically go to 2107 - with compatibility not guaranteed
     * after 2099 - setting this to a time that is before but near 2099
     * should be sufficient.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    static final long DOSTIME_BEFORE_1980 = (1 << 21) | (1 << 16);

    /**
     * DOS time constant for representing timestamps before 1980.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    public static final int DEFLATED = 8;

    /**
     * Compression method for compressed (deflated) entries.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
    public static final int STORED = 0;

    /**
     * Compression method for uncompressed entries.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipEntry.java
public

/**
 * This class is used to represent a ZIP file entry.
 *
 * @author      David Connelly
 */
