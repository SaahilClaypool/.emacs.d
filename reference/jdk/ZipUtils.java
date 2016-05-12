_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipUtils.java
    public static final long get64(byte b[], int off) {

    /**
     * Fetches signed 64-bit value from byte array at specified offset.
     * The bytes are assumed to be in Intel (little-endian) byte order.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipUtils.java
    public static final long get32(byte b[], int off) {

    /**
     * Fetches unsigned 32-bit value from byte array at specified offset.
     * The bytes are assumed to be in Intel (little-endian) byte order.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipUtils.java
    public static final int get16(byte b[], int off) {

    /**
     * Fetches unsigned 16-bit value from byte array at specified offset.
     * The bytes are assumed to be in Intel (little-endian) byte order.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipUtils.java
    public static long javaToExtendedDosTime(long time) {

    /**
     * Converts Java time to DOS time, encoding any milliseconds lost
     * in the conversion into the upper half of the returned long.
     *
     * @param time milliseconds since epoch
     * @return DOS time with 2s remainder encoded into upper half
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipUtils.java
    @SuppressWarnings("deprecation") // Use of date methods

    /**
     * Converts Java time to DOS time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipUtils.java
    public static long extendedDosToJavaTime(long xdostime) {

    /**
     * Converts extended DOS time to Java time, where up to 1999 milliseconds
     * might be encoded into the upper half of the returned long.
     *
     * @param xdostime the extended DOS time value
     * @return milliseconds since epoch
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipUtils.java
    private static long dosToJavaTime(long dtime) {

    /**
     * Converts DOS time to Java time (number of milliseconds since epoch).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipUtils.java
    public static final long fileTimeToUnixTime(FileTime ftime) {

    /**
     * Converts FileTime to "standard Unix time".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipUtils.java
    public static final FileTime unixTimeToFileTime(long utime) {

    /**
     * Converts "standard Unix time"(in seconds, UTC/GMT) to FileTime
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipUtils.java
    public static final long fileTimeToWinTime(FileTime ftime) {

    /**
     * Converts FileTime to Windows time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/zip/ZipUtils.java
    public static final FileTime winTimeToFileTime(long wtime) {

    /**
     * Converts Windows time (in microseconds, UTC/GMT) time to FileTime.
     */
