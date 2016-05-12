_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Timestamp.java
    final public String toString() {

    /**
     * Returns a <CODE>String</CODE> representation of the <CODE>TimeStamp</CODE> object.
     * @return A <CODE>String</CODE> representation of the <CODE>TimeStamp</CODE> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Timestamp.java
    final public long getDateTime() {

    /**
     * Gets the current date.
     * @return A <CODE>long</CODE> representing the current date.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Timestamp.java
    final public synchronized Date getDate() {

    /**
     * Gets the current date.
     * @return A <CODE>Date</CODE> object representing the current date.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Timestamp.java
    final public long getSysUpTime() {

    /**
     * Gets the time (in hundredths of a second) since the network management portion of the system
     * was last re-initialized.
     * @return The <CODE>sysUpTime</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Timestamp.java
    final public synchronized SnmpTimeticks getTimeTicks() {

    /**
     * Gets the <CODE>SnmpTimeticks</CODE> object corresponding to the <CODE>TimeStamp</CODE> object.
     * @return The <CODE>SnmpTimeticks</CODE> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Timestamp.java
    public Timestamp(long uptime) {

    /**
     * Creates a <CODE>TimeStamp</CODE> object using the user parameters.
     * @param uptime The time (in hundredths of a second) since the
     * network management portion of the system was last re-initialized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Timestamp.java
    public Timestamp(long uptime, long when) {

    /**
     * Creates a <CODE>TimeStamp</CODE> object using the user parameters.
     * @param uptime The time (in hundredths of a second) since the
     * network management portion of the system was last re-initialized.
     * @param when The current time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Timestamp.java
    public Timestamp() {

    /**
     * The default constructor. <CODE>Sysuptime</CODE> is 0.
     * This simply indicates when this object was created.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Timestamp.java
    private SnmpTimeticks uptimeCache = null ;

    /**
     * The <CODE>SnmpTimeticks</CODE> object corresponding to the <CODE>TimeStamp</CODE> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Timestamp.java
    private long crtime ;

    /**
     * A <CODE>long</CODE> representing the current date.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Timestamp.java
    private long sysUpTime ;

    /**
     * The time (in hundreds of a second) since the network management portion of the system
     * was last re-initialized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Timestamp.java
public class Timestamp implements java.io.Serializable {

/**
 * This class is used by the {@link com.sun.jmx.snmp.SnmpVarBindList SnmpVarBindList} object.
 * An <CODE>SnmpVarBindList</CODE> time stamp object represents the time stamp when the list was updated
 * with the response variables.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Timestamp.java
    final public String toString() {

    /**
     * Returns a <CODE>String</CODE> representation of the <CODE>TimeStamp</CODE> object.
     * @return A <CODE>String</CODE> representation of the <CODE>TimeStamp</CODE> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Timestamp.java
    final public long getDateTime() {

    /**
     * Gets the current date.
     * @return A <CODE>long</CODE> representing the current date.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Timestamp.java
    final public synchronized Date getDate() {

    /**
     * Gets the current date.
     * @return A <CODE>Date</CODE> object representing the current date.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Timestamp.java
    final public long getSysUpTime() {

    /**
     * Gets the time (in hundredths of a second) since the network management portion of the system
     * was last re-initialized.
     * @return The <CODE>sysUpTime</CODE>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Timestamp.java
    final public synchronized SnmpTimeticks getTimeTicks() {

    /**
     * Gets the <CODE>SnmpTimeticks</CODE> object corresponding to the <CODE>TimeStamp</CODE> object.
     * @return The <CODE>SnmpTimeticks</CODE> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Timestamp.java
    public Timestamp(long uptime) {

    /**
     * Creates a <CODE>TimeStamp</CODE> object using the user parameters.
     * @param uptime The time (in hundredths of a second) since the
     * network management portion of the system was last re-initialized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Timestamp.java
    public Timestamp(long uptime, long when) {

    /**
     * Creates a <CODE>TimeStamp</CODE> object using the user parameters.
     * @param uptime The time (in hundredths of a second) since the
     * network management portion of the system was last re-initialized.
     * @param when The current time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Timestamp.java
    public Timestamp() {

    /**
     * The default constructor. <CODE>Sysuptime</CODE> is 0.
     * This simply indicates when this object was created.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Timestamp.java
    private SnmpTimeticks uptimeCache = null ;

    /**
     * The <CODE>SnmpTimeticks</CODE> object corresponding to the <CODE>TimeStamp</CODE> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Timestamp.java
    private long crtime ;

    /**
     * A <CODE>long</CODE> representing the current date.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Timestamp.java
    private long sysUpTime ;

    /**
     * The time (in hundreds of a second) since the network management portion of the system
     * was last re-initialized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/Timestamp.java
public class Timestamp implements java.io.Serializable {

/**
 * This class is used by the {@link com.sun.jmx.snmp.SnmpVarBindList SnmpVarBindList} object.
 * An <CODE>SnmpVarBindList</CODE> time stamp object represents the time stamp when the list was updated
 * with the response variables.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Timestamp.java
    public String toString() {

    /**
     * Returns a string describing this timestamp.
     *
     * @return A string comprising the date and time of the timestamp and
     *         its signer's certificate.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Timestamp.java
    public boolean equals(Object obj) {

    /**
     * Tests for equality between the specified object and this
     * timestamp. Two timestamps are considered equal if the date and time of
     * their timestamp's and their signer's certificate paths are equal.
     *
     * @param obj the object to test for equality with this timestamp.
     *
     * @return true if the timestamp are considered equal, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Timestamp.java
    public int hashCode() {

    /**
     * Returns the hash code value for this timestamp.
     * The hash code is generated using the date and time of the timestamp
     * and the TSA's certificate path.
     *
     * @return a hash code value for this timestamp.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Timestamp.java
    public CertPath getSignerCertPath() {

    /**
     * Returns the certificate path for the Timestamping Authority.
     *
     * @return The TSA's certificate path.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Timestamp.java
    public Date getTimestamp() {

    /**
     * Returns the date and time when the timestamp was generated.
     *
     * @return The timestamp's date and time.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Timestamp.java
    public Timestamp(Date timestamp, CertPath signerCertPath) {

    /**
     * Constructs a Timestamp.
     *
     * @param timestamp is the timestamp's date and time. It must not be null.
     * @param signerCertPath is the TSA's certificate path. It must not be null.
     * @throws NullPointerException if timestamp or signerCertPath is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Timestamp.java
    private CertPath signerCertPath;

    /**
     * The TSA's certificate path.
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Timestamp.java
    private Date timestamp;

    /**
     * The timestamp's date and time
     *
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Timestamp.java
public final class Timestamp implements Serializable {

/**
 * This class encapsulates information about a signed timestamp.
 * It is immutable.
 * It includes the timestamp's date and time as well as information about the
 * Timestamping Authority (TSA) which generated and signed the timestamp.
 *
 * @since 1.5
 * @author Vincent Ryan
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Timestamp.java
    @Override

    /**
     * Converts this {@code Timestamp} object to an {@code Instant}.
     * <p>
     * The conversion creates an {@code Instant} that represents the same
     * point on the time-line as this {@code Timestamp}.
     *
     * @return an instant representing the same point on the time-line
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Timestamp.java
    public static Timestamp from(Instant instant) {

    /**
     * Obtains an instance of {@code Timestamp} from an {@link Instant} object.
     * <p>
     * {@code Instant} can store points on the time-line further in the future
     * and further in the past than {@code Date}. In this scenario, this method
     * will throw an exception.
     *
     * @param instant  the instant to convert
     * @return an {@code Timestamp} representing the same point on the time-line as
     *  the provided instant
     * @exception NullPointerException if {@code instant} is null.
     * @exception IllegalArgumentException if the instant is too large to
     *  represent as a {@code Timesamp}
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Timestamp.java
    @SuppressWarnings("deprecation")

    /**
     * Converts this {@code Timestamp} object to a {@code LocalDateTime}.
     * <p>
     * The conversion creates a {@code LocalDateTime} that represents the
     * same year, month, day of month, hours, minutes, seconds and nanos
     * date-time value as this {@code Timestamp} in the local time zone.
     *
     * @return a {@code LocalDateTime} object representing the same date-time value
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Timestamp.java
    @SuppressWarnings("deprecation")

    /**
     * Obtains an instance of {@code Timestamp} from a {@code LocalDateTime}
     * object, with the same year, month, day of month, hours, minutes,
     * seconds and nanos date-time value as the provided {@code LocalDateTime}.
     * <p>
     * The provided {@code LocalDateTime} is interpreted as the local
     * date-time in the local time zone.
     *
     * @param dateTime a {@code LocalDateTime} to convert
     * @return a {@code Timestamp} object
     * @exception NullPointerException if {@code dateTime} is null.
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Timestamp.java
    @Override

    /**
     * {@inheritDoc}
     *
     * The {@code hashCode} method uses the underlying {@code java.util.Date}
     * implementation and therefore does not include nanos in its computation.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Timestamp.java
    public int compareTo(java.util.Date o) {

    /**
     * Compares this <code>Timestamp</code> object to the given
     * <code>Date</code> object.
     *
     * @param o the <code>Date</code> to be compared to
     *          this <code>Timestamp</code> object
     * @return  the value <code>0</code> if this <code>Timestamp</code> object
     *          and the given object are equal; a value less than <code>0</code>
     *          if this  <code>Timestamp</code> object is before the given argument;
     *          and a value greater than <code>0</code> if this
     *          <code>Timestamp</code> object is after the given argument.
     *
     * @since   1.5
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Timestamp.java
    public int compareTo(Timestamp ts) {

    /**
     * Compares this <code>Timestamp</code> object to the given
     * <code>Timestamp</code> object.
     *
     * @param   ts   the <code>Timestamp</code> object to be compared to
     *                this <code>Timestamp</code> object
     * @return  the value <code>0</code> if the two <code>Timestamp</code>
     *          objects are equal; a value less than <code>0</code> if this
     *          <code>Timestamp</code> object is before the given argument;
     *          and a value greater than <code>0</code> if this
     *          <code>Timestamp</code> object is after the given argument.
     * @since   1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Timestamp.java
    public boolean after(Timestamp ts) {

    /**
     * Indicates whether this <code>Timestamp</code> object is
     * later than the given <code>Timestamp</code> object.
     *
     * @param ts the <code>Timestamp</code> value to compare with
     * @return <code>true</code> if this <code>Timestamp</code> object is later;
     *        <code>false</code> otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Timestamp.java
    public boolean before(Timestamp ts) {

    /**
     * Indicates whether this <code>Timestamp</code> object is
     * earlier than the given <code>Timestamp</code> object.
     *
     * @param ts the <code>Timestamp</code> value to compare with
     * @return <code>true</code> if this <code>Timestamp</code> object is earlier;
     *        <code>false</code> otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Timestamp.java
    public boolean equals(java.lang.Object ts) {

    /**
     * Tests to see if this <code>Timestamp</code> object is
     * equal to the given object.
     *
     * This version of the method <code>equals</code> has been added
     * to fix the incorrect
     * signature of <code>Timestamp.equals(Timestamp)</code> and to preserve backward
     * compatibility with existing class files.
     *
     * Note: This method is not symmetric with respect to the
     * <code>equals(Object)</code> method in the base class.
     *
     * @param ts the <code>Object</code> value to compare with
     * @return <code>true</code> if the given <code>Object</code> is an instance
     *         of a <code>Timestamp</code> that
     *         is equal to this <code>Timestamp</code> object;
     *         <code>false</code> otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Timestamp.java
    public boolean equals(Timestamp ts) {

    /**
     * Tests to see if this <code>Timestamp</code> object is
     * equal to the given <code>Timestamp</code> object.
     *
     * @param ts the <code>Timestamp</code> value to compare with
     * @return <code>true</code> if the given <code>Timestamp</code>
     *         object is equal to this <code>Timestamp</code> object;
     *         <code>false</code> otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Timestamp.java
    public void setNanos(int n) {

    /**
     * Sets this <code>Timestamp</code> object's <code>nanos</code> field
     * to the given value.
     *
     * @param n the new fractional seconds component
     * @exception java.lang.IllegalArgumentException if the given argument
     *            is greater than 999999999 or less than 0
     * @see #getNanos
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Timestamp.java
    public int getNanos() {

    /**
     * Gets this <code>Timestamp</code> object's <code>nanos</code> value.
     *
     * @return this <code>Timestamp</code> object's fractional seconds component
     * @see #setNanos
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Timestamp.java
    @SuppressWarnings("deprecation")

    /**
     * Formats a timestamp in JDBC timestamp escape format.
     *         <code>yyyy-mm-dd hh:mm:ss.fffffffff</code>,
     * where <code>ffffffffff</code> indicates nanoseconds.
     * <P>
     * @return a <code>String</code> object in
     *           <code>yyyy-mm-dd hh:mm:ss.fffffffff</code> format
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Timestamp.java
    public static Timestamp valueOf(String s) {

    /**
     * Converts a <code>String</code> object in JDBC timestamp escape format to a
     * <code>Timestamp</code> value.
     *
     * @param s timestamp in format <code>yyyy-[m]m-[d]d hh:mm:ss[.f...]</code>.  The
     * fractional seconds may be omitted. The leading zero for <code>mm</code>
     * and <code>dd</code> may also be omitted.
     *
     * @return corresponding <code>Timestamp</code> value
     * @exception java.lang.IllegalArgumentException if the given argument
     * does not have the format <code>yyyy-[m]m-[d]d hh:mm:ss[.f...]</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Timestamp.java
    private int nanos;

    /**
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Timestamp.java
    public long getTime() {

    /**
     * Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT
     * represented by this <code>Timestamp</code> object.
     *
     * @return  the number of milliseconds since January 1, 1970, 00:00:00 GMT
     *          represented by this date.
     * @see #setTime
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Timestamp.java
    public void setTime(long time) {

    /**
     * Sets this <code>Timestamp</code> object to represent a point in time that is
     * <tt>time</tt> milliseconds after January 1, 1970 00:00:00 GMT.
     *
     * @param time   the number of milliseconds.
     * @see #getTime
     * @see #Timestamp(long time)
     * @see java.util.Calendar
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Timestamp.java
    public Timestamp(long time) {

    /**
     * Constructs a <code>Timestamp</code> object
     * using a milliseconds time value. The
     * integral seconds are stored in the underlying date value; the
     * fractional seconds are stored in the <code>nanos</code> field of
     * the <code>Timestamp</code> object.
     *
     * @param time milliseconds since January 1, 1970, 00:00:00 GMT.
     *        A negative number is the number of milliseconds before
     *         January 1, 1970, 00:00:00 GMT.
     * @see java.util.Calendar
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Timestamp.java
    @Deprecated

    /**
     * Constructs a <code>Timestamp</code> object initialized
     * with the given values.
     *
     * @param year the year minus 1900
     * @param month 0 to 11
     * @param date 1 to 31
     * @param hour 0 to 23
     * @param minute 0 to 59
     * @param second 0 to 59
     * @param nano 0 to 999,999,999
     * @deprecated instead use the constructor <code>Timestamp(long millis)</code>
     * @exception IllegalArgumentException if the nano argument is out of bounds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Timestamp.java
public class Timestamp extends java.util.Date {

/**
 * <P>A thin wrapper around <code>java.util.Date</code> that allows
 * the JDBC API to identify this as an SQL <code>TIMESTAMP</code> value.
 * It adds the ability
 * to hold the SQL <code>TIMESTAMP</code> fractional seconds value, by allowing
 * the specification of fractional seconds to a precision of nanoseconds.
 * A Timestamp also provides formatting and
 * parsing operations to support the JDBC escape syntax for timestamp values.
 *
 * <p>The precision of a Timestamp object is calculated to be either:
 * <ul>
 * <li><code>19 </code>, which is the number of characters in yyyy-mm-dd hh:mm:ss
 * <li> <code> 20 + s </code>, which is the number
 * of characters in the yyyy-mm-dd hh:mm:ss.[fff...] and <code>s</code> represents  the scale of the given Timestamp,
 * its fractional seconds precision.
 *</ul>
 *
 * <P><B>Note:</B> This type is a composite of a <code>java.util.Date</code> and a
 * separate nanoseconds value. Only integral seconds are stored in the
 * <code>java.util.Date</code> component. The fractional seconds - the nanos - are
 * separate.  The <code>Timestamp.equals(Object)</code> method never returns
 * <code>true</code> when passed an object
 * that isn't an instance of <code>java.sql.Timestamp</code>,
 * because the nanos component of a date is unknown.
 * As a result, the <code>Timestamp.equals(Object)</code>
 * method is not symmetric with respect to the
 * <code>java.util.Date.equals(Object)</code>
 * method.  Also, the <code>hashCode</code> method uses the underlying
 * <code>java.util.Date</code>
 * implementation and therefore does not include nanos in its computation.
 * <P>
 * Due to the differences between the <code>Timestamp</code> class
 * and the <code>java.util.Date</code>
 * class mentioned above, it is recommended that code not view
 * <code>Timestamp</code> values generically as an instance of
 * <code>java.util.Date</code>.  The
 * inheritance relationship between <code>Timestamp</code>
 * and <code>java.util.Date</code> really
 * denotes implementation inheritance, and not type inheritance.
 */
