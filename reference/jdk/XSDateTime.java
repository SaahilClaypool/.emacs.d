_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
    public Duration getDuration();

    /**
     * @return a Duration (if applicable otherwise null)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
    public XMLGregorianCalendar getXMLGregorianCalendar();

    /**
     * @return an un-normalized XMLGregorianCalendar (if applicable otherwise null)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
    public boolean isNormalized();

    /**
     * @return whether a date-time related object is normalized or not
     *         (value is not useful for types where timezone is not specified)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
    public XSDateTime normalize();

    /**
     * @return a new date-time related object with normalized values
     *         (has no effect on objects already
     *          normalized)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
    public String getLexicalValue();

    /**
     * @return the original lexical value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
    public int getTimeZoneMinutes();

    /**
     * @return timezone minutes (for GMT-xx:xx this will be negative),
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
    public int getTimeZoneHours();

    /**
     * @return timezone hours (for GMT-xx:xx this will be negative),
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
    public boolean hasTimeZone();

    /**
     * @return boolean (true when timezone is specified in the original lexical value)
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
    public double getSeconds();

    /**
     * @return seconds - can be negative only for durations;
     *                   For duration types, it returns days*24*3600 + hours*3600
     *                                                  + minutes*60 + seconds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
    public int getMinutes();

    /**
     * @return minutes - cannot be negative;
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
    public int getHours();

    /**
     * @return hours - cannot be negative;
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
    public int getDays();

    /**
     * @return days - cannot be negative;
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
    public int getMonths();

    /**
     * @return months - can be negative only for duration types;
     *                  For duration types, it returns years*12 + months
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
    public int getYears();

    /**
     * @return years - can be negative for date-time related types;
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
public interface XSDateTime {

/**
 * <p>Interface to expose the values for all date-time related types. The following
 * table shows the methods defined for various XML Schema 1.0 built-in types. 'X'
 * marks whether a particular method is defined for a particular type. Accessing undefined
 * methods may return unexpected values.
 *
 * <table border="1">
 * <br/>
 * <tr>
 * <td> XML Schema Datatype </td>
 * <td> getYears() </td>
 * <td> getMonths() </td>
 * <td> getDays() </td>
 * <td> getHours() </td>
 * <td> getMinutes() </td>
 * <td> getSeconds() </td>
 * <td> getTimeZoneHours() </td>
 * <td> getTimeZoneMinutes() </td>
 * <td> getXMLGregorianCalendar() </td>
 * <td> getDuration() </td>
 * <td> hasTimeZone() </td>
 * <td> normalize() </td>
 * <td> isNormalized() </td>
 * <td> getLexicalValue() </td>
 * </tr>
 * <tr>
 * <td> gYear </td>
 * <td>X</td>
 * <td>-</td>
 * <td>-</td>
 * <td>-</td>
 * <td>-</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * </tr>
 * <tr>
 * <td> gMonth </td>
 * <td>-</td>
 * <td>X</td>
 * <td>-</td>
 * <td>-</td>
 * <td>-</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * </tr>
 * <tr>
 * <td> gDay </td>
 * <td>-</td>
 * <td>-</td>
 * <td>X</td>
 * <td>-</td>
 * <td>-</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * </tr>
 * <tr>
 * <td> gYearMonth </td>
 * <td>X</td>
 * <td>X</td>
 * <td>-</td>
 * <td>-</td>
 * <td>-</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * </tr>
 * <tr>
 * <td> gMonthDay </td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>-</td>
 * <td>-</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * </tr>
 * <tr>
 * <td> date </td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>-</td>
 * <td>-</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * </tr>
 * <tr>
 * <td> time </td>
 * <td>-</td>
 * <td>-</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * </tr>
 * <tr>
 * <td> datetime </td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * </tr>
 * <tr>
 * <td> duration </td>
 * <td>-</td>
 * <td>X</td>
 * <td>-</td>
 * <td>-</td>
 * <td>-</td>
 * <td>X</td>
 * <td>-</td>
 * <td>-</td>
 * <td>-</td>
 * <td>X</td>
 * <td>-</td>
 * <td>-</td>
 * <td>-</td>
 * <td>X</td>
 * </tr>
 * </table>
 * </p>
 *
 * @author Ankit Pasricha, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
    public Duration getDuration();

    /**
     * @return a Duration (if applicable otherwise null)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
    public XMLGregorianCalendar getXMLGregorianCalendar();

    /**
     * @return an un-normalized XMLGregorianCalendar (if applicable otherwise null)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
    public boolean isNormalized();

    /**
     * @return whether a date-time related object is normalized or not
     *         (value is not useful for types where timezone is not specified)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
    public XSDateTime normalize();

    /**
     * @return a new date-time related object with normalized values
     *         (has no effect on objects already
     *          normalized)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
    public String getLexicalValue();

    /**
     * @return the original lexical value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
    public int getTimeZoneMinutes();

    /**
     * @return timezone minutes (for GMT-xx:xx this will be negative),
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
    public int getTimeZoneHours();

    /**
     * @return timezone hours (for GMT-xx:xx this will be negative),
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
    public boolean hasTimeZone();

    /**
     * @return boolean (true when timezone is specified in the original lexical value)
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
    public double getSeconds();

    /**
     * @return seconds - can be negative only for durations;
     *                   For duration types, it returns days*24*3600 + hours*3600
     *                                                  + minutes*60 + seconds
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
    public int getMinutes();

    /**
     * @return minutes - cannot be negative;
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
    public int getHours();

    /**
     * @return hours - cannot be negative;
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
    public int getDays();

    /**
     * @return days - cannot be negative;
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
    public int getMonths();

    /**
     * @return months - can be negative only for duration types;
     *                  For duration types, it returns years*12 + months
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
    public int getYears();

    /**
     * @return years - can be negative for date-time related types;
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/XSDateTime.java
public interface XSDateTime {

/**
 * <p>Interface to expose the values for all date-time related types. The following
 * table shows the methods defined for various XML Schema 1.0 built-in types. 'X'
 * marks whether a particular method is defined for a particular type. Accessing undefined
 * methods may return unexpected values.
 *
 * <table border="1">
 * <br/>
 * <tr>
 * <td> XML Schema Datatype </td>
 * <td> getYears() </td>
 * <td> getMonths() </td>
 * <td> getDays() </td>
 * <td> getHours() </td>
 * <td> getMinutes() </td>
 * <td> getSeconds() </td>
 * <td> getTimeZoneHours() </td>
 * <td> getTimeZoneMinutes() </td>
 * <td> getXMLGregorianCalendar() </td>
 * <td> getDuration() </td>
 * <td> hasTimeZone() </td>
 * <td> normalize() </td>
 * <td> isNormalized() </td>
 * <td> getLexicalValue() </td>
 * </tr>
 * <tr>
 * <td> gYear </td>
 * <td>X</td>
 * <td>-</td>
 * <td>-</td>
 * <td>-</td>
 * <td>-</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * </tr>
 * <tr>
 * <td> gMonth </td>
 * <td>-</td>
 * <td>X</td>
 * <td>-</td>
 * <td>-</td>
 * <td>-</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * </tr>
 * <tr>
 * <td> gDay </td>
 * <td>-</td>
 * <td>-</td>
 * <td>X</td>
 * <td>-</td>
 * <td>-</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * </tr>
 * <tr>
 * <td> gYearMonth </td>
 * <td>X</td>
 * <td>X</td>
 * <td>-</td>
 * <td>-</td>
 * <td>-</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * </tr>
 * <tr>
 * <td> gMonthDay </td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>-</td>
 * <td>-</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * </tr>
 * <tr>
 * <td> date </td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>-</td>
 * <td>-</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * </tr>
 * <tr>
 * <td> time </td>
 * <td>-</td>
 * <td>-</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * </tr>
 * <tr>
 * <td> datetime </td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>-</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * <td>X</td>
 * </tr>
 * <tr>
 * <td> duration </td>
 * <td>-</td>
 * <td>X</td>
 * <td>-</td>
 * <td>-</td>
 * <td>-</td>
 * <td>X</td>
 * <td>-</td>
 * <td>-</td>
 * <td>-</td>
 * <td>X</td>
 * <td>-</td>
 * <td>-</td>
 * <td>-</td>
 * <td>X</td>
 * </tr>
 * </table>
 * </p>
 *
 * @author Ankit Pasricha, IBM
 *
 */
