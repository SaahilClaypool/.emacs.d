_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/DurationDV.java
    protected  short compareDates(DateTimeData date1, DateTimeData date2, boolean strict) {

    /**
     * Compares 2 given durations. (refer to W3C Schema Datatypes "3.2.6 duration")
     *
     * @param date1  Unnormalized duration
     * @param date2  Unnormalized duration
     * @param strict (min/max)Exclusive strict == true ( LESS_THAN ) or ( GREATER_THAN )
     *               (min/max)Inclusive strict == false (LESS_EQUAL) or (GREATER_EQUAL)
     * @return INDETERMINATE if the order relationship between date1 and date2 is indeterminate.
     * EQUAL if the order relation between date1 and date2 is EQUAL.
     * If the strict parameter is true, return LESS_THAN if date1 is less than date2 and
     * return GREATER_THAN if date1 is greater than date2.
     * If the strict parameter is false, return LESS_THAN if date1 is less than OR equal to date2 and
     * return GREATER_THAN if date1 is greater than OR equal to date2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/DurationDV.java
    protected DateTimeData parse(String str, int durationType) throws SchemaDateTimeException{

    /**
     * Parses, validates and computes normalized version of duration object
     *
     * @param str    The lexical representation of duration object PnYn MnDTnH nMnS
     * @param durationType
     * @return normalized date representation
     * @exception SchemaDateTimeException Invalid lexical representation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/DurationDV.java
public class DurationDV extends AbstractDateTimeDV {

/**
 * Validator for &lt;duration&gt; datatype (W3C Schema Datatypes)
 *
 * @xerces.internal
 *
 * @author Elena Litani
 * @author Gopal Sharma, SUN Microsystem Inc.
 * @version $Id: DurationDV.java,v 1.7 2010-11-01 04:39:47 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/DurationDV.java
    protected  short compareDates(DateTimeData date1, DateTimeData date2, boolean strict) {

    /**
     * Compares 2 given durations. (refer to W3C Schema Datatypes "3.2.6 duration")
     *
     * @param date1  Unnormalized duration
     * @param date2  Unnormalized duration
     * @param strict (min/max)Exclusive strict == true ( LESS_THAN ) or ( GREATER_THAN )
     *               (min/max)Inclusive strict == false (LESS_EQUAL) or (GREATER_EQUAL)
     * @return INDETERMINATE if the order relationship between date1 and date2 is indeterminate.
     * EQUAL if the order relation between date1 and date2 is EQUAL.
     * If the strict parameter is true, return LESS_THAN if date1 is less than date2 and
     * return GREATER_THAN if date1 is greater than date2.
     * If the strict parameter is false, return LESS_THAN if date1 is less than OR equal to date2 and
     * return GREATER_THAN if date1 is greater than OR equal to date2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/DurationDV.java
    protected DateTimeData parse(String str, int durationType) throws SchemaDateTimeException{

    /**
     * Parses, validates and computes normalized version of duration object
     *
     * @param str    The lexical representation of duration object PnYn MnDTnH nMnS
     * @param durationType
     * @return normalized date representation
     * @exception SchemaDateTimeException Invalid lexical representation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/DurationDV.java
public class DurationDV extends AbstractDateTimeDV {

/**
 * Validator for &lt;duration&gt; datatype (W3C Schema Datatypes)
 *
 * @xerces.internal
 *
 * @author Elena Litani
 * @author Gopal Sharma, SUN Microsystem Inc.
 * @version $Id: DurationDV.java,v 1.7 2010-11-01 04:39:47 joehw Exp $
 */
