_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Time.java
    @Override

   /**
    * This method always throws an UnsupportedOperationException and should
    * not be used because SQL {@code Time} values do not have a date
    * component.
    *
    * @exception java.lang.UnsupportedOperationException if this method is invoked
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Time.java
    @SuppressWarnings("deprecation")

    /**
     * Converts this {@code Time} object to a {@code LocalTime}.
     * <p>
     * The conversion creates a {@code LocalTime} that represents the same
     * hour, minute, and second time value as this {@code Time}.
     *
     * @return a {@code LocalTime} object representing the same time value
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Time.java
    @SuppressWarnings("deprecation")

    /**
     * Obtains an instance of {@code Time} from a {@link LocalTime} object
     * with the same hour, minute and second time value as the given
     * {@code LocalTime}.
     *
     * @param time a {@code LocalTime} to convert
     * @return a {@code Time} object
     * @exception NullPointerException if {@code time} is null
     * @since 1.8
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Time.java
    static final long serialVersionUID = 8397324403548013681L;

   /**
    * Private serial version unique ID to ensure serialization
    * compatibility.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Time.java
    @Deprecated

   /**
    * This method is deprecated and should not be used because SQL <code>TIME</code>
    * values do not have a date component.
    *
    * @deprecated
    * @exception java.lang.IllegalArgumentException if this
    *           method is invoked
    * @see #getDate
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Time.java
    @Deprecated

   /**
    * This method is deprecated and should not be used because SQL <code>TIME</code>
    * values do not have a month component.
    *
    * @deprecated
    * @exception java.lang.IllegalArgumentException if this
    *           method is invoked
    * @see #getMonth
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Time.java
    @Deprecated

   /**
    * This method is deprecated and should not be used because SQL <code>TIME</code>
    * values do not have a year component.
    *
    * @deprecated
    * @exception java.lang.IllegalArgumentException if this
    *           method is invoked
    * @see #getYear
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Time.java
    @Deprecated

   /**
    * This method is deprecated and should not be used because SQL <code>TIME</code>
    * values do not have a date component.
    *
    * @deprecated
    * @exception java.lang.IllegalArgumentException if this
    *           method is invoked
    * @see #setDate
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Time.java
    @Deprecated

   /**
    * This method is deprecated and should not be used because SQL <code>TIME</code>
    * values do not have a day component.
    *
    * @deprecated
    * @exception java.lang.IllegalArgumentException if this
    *           method is invoked
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Time.java
    @Deprecated

   /**
    * This method is deprecated and should not be used because SQL <code>TIME</code>
    * values do not have a month component.
    *
    * @deprecated
    * @exception java.lang.IllegalArgumentException if this
    *           method is invoked
    * @see #setMonth
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Time.java
    @Deprecated

   /**
    * This method is deprecated and should not be used because SQL <code>TIME</code>
    * values do not have a year component.
    *
    * @deprecated
    * @exception java.lang.IllegalArgumentException if this
    *           method is invoked
    * @see #setYear
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Time.java
    @SuppressWarnings("deprecation")

    /**
     * Formats a time in JDBC time escape format.
     *
     * @return a <code>String</code> in hh:mm:ss format
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Time.java
    public static Time valueOf(String s) {

    /**
     * Converts a string in JDBC time escape format to a <code>Time</code> value.
     *
     * @param s time in format "hh:mm:ss"
     * @return a corresponding <code>Time</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Time.java
    public void setTime(long time) {

    /**
     * Sets a <code>Time</code> object using a milliseconds time value.
     *
     * @param time milliseconds since January 1, 1970, 00:00:00 GMT;
     *             a negative number is milliseconds before
     *               January 1, 1970, 00:00:00 GMT
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Time.java
    public Time(long time) {

    /**
     * Constructs a <code>Time</code> object using a milliseconds time value.
     *
     * @param time milliseconds since January 1, 1970, 00:00:00 GMT;
     *             a negative number is milliseconds before
     *               January 1, 1970, 00:00:00 GMT
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Time.java
    @Deprecated

    /**
     * Constructs a <code>Time</code> object initialized with the
     * given values for the hour, minute, and second.
     * The driver sets the date components to January 1, 1970.
     * Any method that attempts to access the date components of a
     * <code>Time</code> object will throw a
     * <code>java.lang.IllegalArgumentException</code>.
     * <P>
     * The result is undefined if a given argument is out of bounds.
     *
     * @param hour 0 to 23
     * @param minute 0 to 59
     * @param second 0 to 59
     *
     * @deprecated Use the constructor that takes a milliseconds value
     *             in place of this constructor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/Time.java
public class Time extends java.util.Date {

/**
 * <P>A thin wrapper around the <code>java.util.Date</code> class that allows the JDBC
 * API to identify this as an SQL <code>TIME</code> value. The <code>Time</code>
 * class adds formatting and
 * parsing operations to support the JDBC escape syntax for time
 * values.
 * <p>The date components should be set to the "zero epoch"
 * value of January 1, 1970 and should not be accessed.
 */
