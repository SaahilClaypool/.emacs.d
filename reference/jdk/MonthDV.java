_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/MonthDV.java
    protected String dateToString(DateTimeData date) {

    /**
     * Converts month object representation to String
     *
     * @param date   month object
     * @return lexical representation of month: --MM with an optional time zone sign
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/MonthDV.java
    /*protected  short compareDates(DateTimeData date1, DateTimeData date2) {

    /**
     * Overwrite compare algorithm to optimize month comparison
     *
     * REVISIT: this one is lack of the third parameter: boolean strict, so it
     *          doesn't override the method in the base. But maybe this method
     *          is not correctly implemented, and I did encounter errors when
     *          trying to add the extra parameter. I'm leaving it as is. -SG
     *
     * @param date1
     * @param date2
     * @return less, greater, equal, indeterminate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/MonthDV.java
    protected DateTimeData parse(String str) throws SchemaDateTimeException{

    /**
     * Parses, validates and computes normalized version of gMonth object
     *
     * @param str    The lexical representation of gMonth object --MM
     *               with possible time zone Z or (-),(+)hh:mm
     * @return normalized date representation
     * @exception SchemaDateTimeException Invalid lexical representation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/MonthDV.java
    public Object getActualValue(String content, ValidationContext context) throws InvalidDatatypeValueException{

    /**
     * Convert a string to a compiled form
     *
     * @param  content The lexical representation of gMonth
     * @return a valid and normalized gMonth object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/MonthDV.java
public class MonthDV extends AbstractDateTimeDV {

/**
 * Validator for &lt;gMonth&gt; datatype (W3C Schema Datatypes)
 *
 * @xerces.internal
 *
 * @author Elena Litani
 * @author Gopal Sharma, SUN Microsystem Inc.
 *
 * @version $Id: MonthDV.java,v 1.8 2010-11-01 04:39:47 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/MonthDV.java
    protected String dateToString(DateTimeData date) {

    /**
     * Converts month object representation to String
     *
     * @param date   month object
     * @return lexical representation of month: --MM with an optional time zone sign
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/MonthDV.java
    /*protected  short compareDates(DateTimeData date1, DateTimeData date2) {

    /**
     * Overwrite compare algorithm to optimize month comparison
     *
     * REVISIT: this one is lack of the third parameter: boolean strict, so it
     *          doesn't override the method in the base. But maybe this method
     *          is not correctly implemented, and I did encounter errors when
     *          trying to add the extra parameter. I'm leaving it as is. -SG
     *
     * @param date1
     * @param date2
     * @return less, greater, equal, indeterminate
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/MonthDV.java
    protected DateTimeData parse(String str) throws SchemaDateTimeException{

    /**
     * Parses, validates and computes normalized version of gMonth object
     *
     * @param str    The lexical representation of gMonth object --MM
     *               with possible time zone Z or (-),(+)hh:mm
     * @return normalized date representation
     * @exception SchemaDateTimeException Invalid lexical representation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/MonthDV.java
    public Object getActualValue(String content, ValidationContext context) throws InvalidDatatypeValueException{

    /**
     * Convert a string to a compiled form
     *
     * @param  content The lexical representation of gMonth
     * @return a valid and normalized gMonth object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/MonthDV.java
public class MonthDV extends AbstractDateTimeDV {

/**
 * Validator for &lt;gMonth&gt; datatype (W3C Schema Datatypes)
 *
 * @xerces.internal
 *
 * @author Elena Litani
 * @author Gopal Sharma, SUN Microsystem Inc.
 *
 * @version $Id: MonthDV.java,v 1.8 2010-11-01 04:39:47 joehw Exp $
 */
