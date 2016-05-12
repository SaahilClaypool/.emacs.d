_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    static final class DateTimeData implements XSDateTime {

    /**
     * Represents date time data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected int maxDayInMonthFor(int year, int month) {

    /**
     * Given {year,month} computes maximum number of days for given month
     *
     * @param year
     * @param month
     * @return integer containg the number of days in a given month
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected void resetDateObj(DateTimeData data) {

    /**
     * Resets object representation of date/time
     *
     * @param data date/time object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected void saveUnnormalized(DateTimeData date) {

    /**
     * @param date
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected void normalize(DateTimeData date) {

    /**
     * If timezone present - normalize dateTime [E Adding durations to
     * dateTimes]
     *
     * @param date CCYY-MM-DDThh:mm:ss+03
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected int parseInt(String buffer, int start, int end)

    /**
     * Given start and end position, parses string value
     *
     * @param buffer string to parse
     * @param start start position
     * @param end end position
     * @return return integer representation of characters
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected final boolean isNextCharUTCSign(String buffer, int start, int end) {

    /**
     * Returns
     * <code>true</code> if the character at start is 'Z', '+' or '-'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected int findUTCSign(String buffer, int start, int end) {

    /**
     * Return index of UTC char: 'Z', '+', '-'
     *
     * @param start
     * @param end
     * @return index of the UTC character that was found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
        if (!Constants.SCHEMA_1_1_SUPPORT && data.year == 0) {

        /**
         * XML Schema 1.1 - RQ-123: Allow year 0000 in date related types.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected void validateDateTime(DateTimeData data) {

    /**
     * Validates given date/time object accoring to W3C PR Schema [D.1 ISO 8601
     * Conventions]
     *
     * @param data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected int indexOf(String buffer, int start, int end, char ch) {

    /**
     * Computes index of given char within StringBuffer
     *
     * @param start
     * @param end
     * @param ch character to look for in StringBuffer
     * @return index of ch within StringBuffer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected void getTimeZone(String buffer, DateTimeData data, int sign, int end) throws RuntimeException {

    /**
     * Parses time zone: 'Z' or {+,-} followed by hh:mm
     *
     * @param data
     * @param sign
     * @exception RuntimeException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected void parseTimeZone(String buffer, int start, int end, DateTimeData date) throws RuntimeException {

    /**
     * Shared code from Date and YearMonth datatypes. Finds if time zone sign is
     * present
     *
     * @param end
     * @param date
     * @exception RuntimeException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected int getYearMonth(String buffer, int start, int end, DateTimeData date) throws RuntimeException {

    /**
     * Parses date CCYY-MM
     *
     * @param buffer
     * @param start start position
     * @param end end position
     * @param date
     * @exception RuntimeException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected int getDate(String buffer, int start, int end, DateTimeData date) throws RuntimeException {

    /**
     * Parses date CCYY-MM-DD
     *
     * @param buffer
     * @param start start position
     * @param end end position
     * @param date
     * @exception RuntimeException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected void getTime(String buffer, int start, int end, DateTimeData data) throws RuntimeException {

    /**
     * Parses time hh:mm:ss.sss and time zone if any
     *
     * @param start
     * @param end
     * @param data
     * @exception RuntimeException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected short compareOrder(DateTimeData date1, DateTimeData date2) {

    /**
     * Given normalized values, determines order-relation between give date/time
     * objects.
     *
     * @param date1 date/time object
     * @param date2 date/time object
     * @return 0 if date1 and date2 are equal, a value less than 0 if date1 is
     * less than date2, a value greater than 0 if date1 is greater than date2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected short compareDates(DateTimeData date1, DateTimeData date2, boolean strict) {

    /**
     * Compare algorithm described in dateDime (3.2.7). Duration datatype
     * overwrites this method
     *
     * @param date1 normalized date representation of the first value
     * @param date2 normalized date representation of the second value
     * @param strict
     * @return less, greater, less_equal, greater_equal, equal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
public abstract class AbstractDateTimeDV extends TypeValidator {

/**
 * This is the base class of all date/time datatype validators.
 * It implements common code for parsing, validating and comparing datatypes.
 * Classes that extend this class, must implement parse() method.
 *
 * REVISIT: There are many instance variables, which would cause problems
 *          when we support grammar caching. A grammar is possibly used by
 *          two parser instances at the same time, then the same simple type
 *          decl object can be used to validate two strings at the same time.
 *          -SG
 *
 * @xerces.internal
 *
 * @author Elena Litani
 * @author Len Berman
 * @author Gopal Sharma, SUN Microsystems Inc.
 *
 * @version $Id: AbstractDateTimeDV.java,v 1.7 2010-11-01 04:39:46 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    static final class DateTimeData implements XSDateTime {

    /**
     * Represents date time data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected int maxDayInMonthFor(int year, int month) {

    /**
     * Given {year,month} computes maximum number of days for given month
     *
     * @param year
     * @param month
     * @return integer containg the number of days in a given month
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected void resetDateObj(DateTimeData data) {

    /**
     * Resets object representation of date/time
     *
     * @param data date/time object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected void saveUnnormalized(DateTimeData date) {

    /**
     * @param date
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected void normalize(DateTimeData date) {

    /**
     * If timezone present - normalize dateTime [E Adding durations to
     * dateTimes]
     *
     * @param date CCYY-MM-DDThh:mm:ss+03
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected int parseInt(String buffer, int start, int end)

    /**
     * Given start and end position, parses string value
     *
     * @param buffer string to parse
     * @param start start position
     * @param end end position
     * @return return integer representation of characters
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected final boolean isNextCharUTCSign(String buffer, int start, int end) {

    /**
     * Returns
     * <code>true</code> if the character at start is 'Z', '+' or '-'.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected int findUTCSign(String buffer, int start, int end) {

    /**
     * Return index of UTC char: 'Z', '+', '-'
     *
     * @param start
     * @param end
     * @return index of the UTC character that was found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
        if (!Constants.SCHEMA_1_1_SUPPORT && data.year == 0) {

        /**
         * XML Schema 1.1 - RQ-123: Allow year 0000 in date related types.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected void validateDateTime(DateTimeData data) {

    /**
     * Validates given date/time object accoring to W3C PR Schema [D.1 ISO 8601
     * Conventions]
     *
     * @param data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected int indexOf(String buffer, int start, int end, char ch) {

    /**
     * Computes index of given char within StringBuffer
     *
     * @param start
     * @param end
     * @param ch character to look for in StringBuffer
     * @return index of ch within StringBuffer
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected void getTimeZone(String buffer, DateTimeData data, int sign, int end) throws RuntimeException {

    /**
     * Parses time zone: 'Z' or {+,-} followed by hh:mm
     *
     * @param data
     * @param sign
     * @exception RuntimeException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected void parseTimeZone(String buffer, int start, int end, DateTimeData date) throws RuntimeException {

    /**
     * Shared code from Date and YearMonth datatypes. Finds if time zone sign is
     * present
     *
     * @param end
     * @param date
     * @exception RuntimeException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected int getYearMonth(String buffer, int start, int end, DateTimeData date) throws RuntimeException {

    /**
     * Parses date CCYY-MM
     *
     * @param buffer
     * @param start start position
     * @param end end position
     * @param date
     * @exception RuntimeException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected int getDate(String buffer, int start, int end, DateTimeData date) throws RuntimeException {

    /**
     * Parses date CCYY-MM-DD
     *
     * @param buffer
     * @param start start position
     * @param end end position
     * @param date
     * @exception RuntimeException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected void getTime(String buffer, int start, int end, DateTimeData data) throws RuntimeException {

    /**
     * Parses time hh:mm:ss.sss and time zone if any
     *
     * @param start
     * @param end
     * @param data
     * @exception RuntimeException
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected short compareOrder(DateTimeData date1, DateTimeData date2) {

    /**
     * Given normalized values, determines order-relation between give date/time
     * objects.
     *
     * @param date1 date/time object
     * @param date2 date/time object
     * @return 0 if date1 and date2 are equal, a value less than 0 if date1 is
     * less than date2, a value greater than 0 if date1 is greater than date2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
    protected short compareDates(DateTimeData date1, DateTimeData date2, boolean strict) {

    /**
     * Compare algorithm described in dateDime (3.2.7). Duration datatype
     * overwrites this method
     *
     * @param date1 normalized date representation of the first value
     * @param date2 normalized date representation of the second value
     * @param strict
     * @return less, greater, less_equal, greater_equal, equal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/AbstractDateTimeDV.java
public abstract class AbstractDateTimeDV extends TypeValidator {

/**
 * This is the base class of all date/time datatype validators.
 * It implements common code for parsing, validating and comparing datatypes.
 * Classes that extend this class, must implement parse() method.
 *
 * REVISIT: There are many instance variables, which would cause problems
 *          when we support grammar caching. A grammar is possibly used by
 *          two parser instances at the same time, then the same simple type
 *          decl object can be used to validate two strings at the same time.
 *          -SG
 *
 * @xerces.internal
 *
 * @author Elena Litani
 * @author Len Berman
 * @author Gopal Sharma, SUN Microsystems Inc.
 *
 * @version $Id: AbstractDateTimeDV.java,v 1.7 2010-11-01 04:39:46 joehw Exp $
 */
