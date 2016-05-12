_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/TimeDV.java
    protected String dateToString(DateTimeData date) {

    /**
     * Converts time object representation to String
     *
     * @param date   time object
     * @return lexical representation of time: hh:mm:ss.sss with an optional time zone sign
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/TimeDV.java
    protected DateTimeData parse(String str) throws SchemaDateTimeException{

    /**
     * Parses, validates and computes normalized version of time object
     *
     * @param str    The lexical representation of time object hh:mm:ss.sss
     *               with possible time zone Z or (-),(+)hh:mm
     *               Pattern: "(\\d\\d):(\\d\\d):(\\d\\d)(\\.(\\d)*)?(Z|(([-+])(\\d\\d)(:(\\d\\d))?))?")
     * @return normalized time representation
     * @exception SchemaDateTimeException Invalid lexical representation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/TimeDV.java
    public Object getActualValue(String content, ValidationContext context) throws InvalidDatatypeValueException{

    /**
     * Convert a string to a compiled form
     *
     * @param  content The lexical representation of time
     * @return a valid and normalized time object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/TimeDV.java
public class TimeDV extends AbstractDateTimeDV {

/**
 * Validator for &lt;time&gt; datatype (W3C Schema Datatypes)
 *
 * @xerces.internal
 *
 * @author Elena Litani
 * @author Gopal Sharma, SUN Microsystem Inc.
 *
 * @version $Id: TimeDV.java,v 1.7 2010-11-01 04:39:47 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/TimeDV.java
    protected String dateToString(DateTimeData date) {

    /**
     * Converts time object representation to String
     *
     * @param date   time object
     * @return lexical representation of time: hh:mm:ss.sss with an optional time zone sign
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/TimeDV.java
    protected DateTimeData parse(String str) throws SchemaDateTimeException{

    /**
     * Parses, validates and computes normalized version of time object
     *
     * @param str    The lexical representation of time object hh:mm:ss.sss
     *               with possible time zone Z or (-),(+)hh:mm
     *               Pattern: "(\\d\\d):(\\d\\d):(\\d\\d)(\\.(\\d)*)?(Z|(([-+])(\\d\\d)(:(\\d\\d))?))?")
     * @return normalized time representation
     * @exception SchemaDateTimeException Invalid lexical representation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/TimeDV.java
    public Object getActualValue(String content, ValidationContext context) throws InvalidDatatypeValueException{

    /**
     * Convert a string to a compiled form
     *
     * @param  content The lexical representation of time
     * @return a valid and normalized time object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/TimeDV.java
public class TimeDV extends AbstractDateTimeDV {

/**
 * Validator for &lt;time&gt; datatype (W3C Schema Datatypes)
 *
 * @xerces.internal
 *
 * @author Elena Litani
 * @author Gopal Sharma, SUN Microsystem Inc.
 *
 * @version $Id: TimeDV.java,v 1.7 2010-11-01 04:39:47 joehw Exp $
 */
