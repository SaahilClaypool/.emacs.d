_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationYearMonthImpl.java
    public int getValue() {

    /**
     * The value space of xs:yearMonthDuration is the set of xs:integer month values.
     * @return the value of yearMonthDuration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationYearMonthImpl.java
    protected DurationYearMonthImpl(String lexicalRepresentation) {

        /**
         * <p>Construct a <code>Duration</code> of type <code>xdt:yearMonthDuration</code> by parsing its <code>String</code> representation,
         * "<em>PnYnM</em>", <a href="http://www.w3.org/TR/xpath-datamodel#yearMonthDuration">
         *   XQuery 1.0 and XPath 2.0 Data Model, xdt:yearMonthDuration</a>.</p>
         *
         * <p>The datatype <code>xdt:yearMonthDuration</code> is a subtype of <code>xs:duration</code>
         * whose lexical representation contains only year and month components.
         * This datatype resides in the namespace {@link javax.xml.XMLConstants#W3C_XPATH_DATATYPE_NS_URI}.</p>
         *
     * <p>Both values are set and availabe from the created {@link Duration}</p>
         *
     * <p>The XML Schema specification states that values can be of an arbitrary size.
     * Implementations may chose not to or be incapable of supporting arbitrarily large and/or small values.
     * An {@link UnsupportedOperationException} will be thrown with a message indicating implementation limits
     * if implementation capacities are exceeded.</p>
     *
         * @param lexicalRepresentation Lexical representation of a duration.
         *
         * @throws IllegalArgumentException If <code>lexicalRepresentation</code> is not a valid representation of a <code>Duration</code> expressed only in terms of years and months.
         * @throws UnsupportedOperationException If implementation cannot support requested values.
         * @throws NullPointerException If <code>lexicalRepresentation</code> is <code>null</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationYearMonthImpl.java
    protected DurationYearMonthImpl(long durationInMilliseconds) {

        /**
         * <p>Construct a <code>Duration</code> of type <code>xdt:yearMonthDuration</code> using the specified milliseconds as defined in
         * <a href="http://www.w3.org/TR/xpath-datamodel#yearMonthDuration">
         *   XQuery 1.0 and XPath 2.0 Data Model, xdt:yearMonthDuration</a>.</p>
         *
         * <p>The datatype <code>xdt:yearMonthDuration</code> is a subtype of <code>xs:duration</code>
         * whose lexical representation contains only year and month components.
         * This datatype resides in the namespace {@link javax.xml.XMLConstants#W3C_XPATH_DATATYPE_NS_URI}.</p>
         *
     * <p>Both values are set by computing their values from the specified milliseconds
     * and are availabe using the <code>get</code> methods of  the created {@link Duration}.
     * The values conform to and are defined by:</p>
     * <ul>
     *   <li>ISO 8601:2000(E) Section 5.5.3.2 Alternative format</li>
     *   <li><a href="http://www.w3.org/TR/xmlschema-2/#isoformats">
     *     W3C XML Schema 1.0 Part 2, Appendix D, ISO 8601 Date and Time Formats</a>
     *   </li>
     *   <li>{@link XMLGregorianCalendar}  Date/Time Datatype Field Mapping Between XML Schema 1.0 and Java Representation</li>
     * </ul>
     *
         * <p>The default start instance is defined by {@link GregorianCalendar}'s use of the start of the epoch: i.e.,
         * {@link java.util.Calendar#YEAR} = 1970,
         * {@link java.util.Calendar#MONTH} = {@link java.util.Calendar#JANUARY},
         * {@link java.util.Calendar#DATE} = 1, etc.
         * This is important as there are variations in the Gregorian Calendar,
         * e.g. leap years have different days in the month = {@link java.util.Calendar#FEBRUARY}
         * so the result of {@link Duration#getMonths()} can be influenced.</p>
         *
     * <p>Any remaining milliseconds after determining the year and month are discarded.</p>
         *
         * @param durationInMilliseconds Milliseconds of <code>Duration</code> to create.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationYearMonthImpl.java
    protected DurationYearMonthImpl(
        final boolean isPositive,
        final int years,
        final int months) {

        /**
         * <p>Construct a <code>Duration</code> of type <code>xdt:yearMonthDuration</code> using the specified
         * <code>year</code> and <code>month</code> as defined in
         * <a href="http://www.w3.org/TR/xpath-datamodel#yearMonthDuration">
         *   XQuery 1.0 and XPath 2.0 Data Model, xdt:yearMonthDuration</a>.</p>
         *
     * <p>A {@link DatatypeConstants#FIELD_UNDEFINED} value indicates that field is not set.</p>
     *
     * @param isPositive Set to <code>false</code> to create a negative duration. When the length
     *   of the duration is zero, this parameter will be ignored.
         * @param year Year of <code>Duration</code>.
         * @param month Month of <code>Duration</code>.
         *
         * @throws IllegalArgumentException If the values are not a valid representation of a
         * <code>Duration</code>: if any of the fields (year, month) is negative.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationYearMonthImpl.java
    public DurationYearMonthImpl(
        boolean isPositive,
        BigInteger years,
        BigInteger months) {

    /**
     * <p>Constructs a new Duration object by specifying each field individually.</p>
     *
     * <p>All the parameters are optional as long as at least one field is present.
     * If specified, parameters have to be zero or positive.</p>
     *
     * @param isPositive Set to <code>false</code> to create a negative duration. When the length
     *   of the duration is zero, this parameter will be ignored.
     * @param years of this <code>Duration</code>
     * @param months of this <code>Duration</code>
     *
     * @throws IllegalArgumentException
     *    If years, months parameters are all <code>null</code>. Or if any
     *    of those parameters are negative.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationYearMonthImpl.java
class DurationYearMonthImpl

/**
 * <p>Represent a subtype <code>xdt:yearMonthDuration</code> of a <code>Duration</code>
 * as specified in <a href="http://www.w3.org/TR/xpath-datamodel#yearMonthDuration">
 *   XQuery 1.0 and XPath 2.0 Data Model, xdt:yearMonthDuration</a>.</p>
 *
 *
 * <p>The DurationYearMonth object represents a period of Gregorian time,
 * with a lexical representation, "<em>PnYnM</em>" that contains only year and month components.
 * </p>
 *
 *
 * @author <a href="mailto:Vikram.Aroskar@Sun.COM">Vikram Aroskar</a>
 * @author <a href="mailto:Huizhe.wang@oracle.com">Joe Wang</a>
 * @version $Revision: 1.1 $, $Date: 2010/05/19 05:02:55 $

 * @see XMLGregorianCalendar#add(Duration)
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationYearMonthImpl.java
    public int getValue() {

    /**
     * The value space of xs:yearMonthDuration is the set of xs:integer month values.
     * @return the value of yearMonthDuration
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationYearMonthImpl.java
    protected DurationYearMonthImpl(String lexicalRepresentation) {

        /**
         * <p>Construct a <code>Duration</code> of type <code>xdt:yearMonthDuration</code> by parsing its <code>String</code> representation,
         * "<em>PnYnM</em>", <a href="http://www.w3.org/TR/xpath-datamodel#yearMonthDuration">
         *   XQuery 1.0 and XPath 2.0 Data Model, xdt:yearMonthDuration</a>.</p>
         *
         * <p>The datatype <code>xdt:yearMonthDuration</code> is a subtype of <code>xs:duration</code>
         * whose lexical representation contains only year and month components.
         * This datatype resides in the namespace {@link javax.xml.XMLConstants#W3C_XPATH_DATATYPE_NS_URI}.</p>
         *
     * <p>Both values are set and availabe from the created {@link Duration}</p>
         *
     * <p>The XML Schema specification states that values can be of an arbitrary size.
     * Implementations may chose not to or be incapable of supporting arbitrarily large and/or small values.
     * An {@link UnsupportedOperationException} will be thrown with a message indicating implementation limits
     * if implementation capacities are exceeded.</p>
     *
         * @param lexicalRepresentation Lexical representation of a duration.
         *
         * @throws IllegalArgumentException If <code>lexicalRepresentation</code> is not a valid representation of a <code>Duration</code> expressed only in terms of years and months.
         * @throws UnsupportedOperationException If implementation cannot support requested values.
         * @throws NullPointerException If <code>lexicalRepresentation</code> is <code>null</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationYearMonthImpl.java
    protected DurationYearMonthImpl(long durationInMilliseconds) {

        /**
         * <p>Construct a <code>Duration</code> of type <code>xdt:yearMonthDuration</code> using the specified milliseconds as defined in
         * <a href="http://www.w3.org/TR/xpath-datamodel#yearMonthDuration">
         *   XQuery 1.0 and XPath 2.0 Data Model, xdt:yearMonthDuration</a>.</p>
         *
         * <p>The datatype <code>xdt:yearMonthDuration</code> is a subtype of <code>xs:duration</code>
         * whose lexical representation contains only year and month components.
         * This datatype resides in the namespace {@link javax.xml.XMLConstants#W3C_XPATH_DATATYPE_NS_URI}.</p>
         *
     * <p>Both values are set by computing their values from the specified milliseconds
     * and are availabe using the <code>get</code> methods of  the created {@link Duration}.
     * The values conform to and are defined by:</p>
     * <ul>
     *   <li>ISO 8601:2000(E) Section 5.5.3.2 Alternative format</li>
     *   <li><a href="http://www.w3.org/TR/xmlschema-2/#isoformats">
     *     W3C XML Schema 1.0 Part 2, Appendix D, ISO 8601 Date and Time Formats</a>
     *   </li>
     *   <li>{@link XMLGregorianCalendar}  Date/Time Datatype Field Mapping Between XML Schema 1.0 and Java Representation</li>
     * </ul>
     *
         * <p>The default start instance is defined by {@link GregorianCalendar}'s use of the start of the epoch: i.e.,
         * {@link java.util.Calendar#YEAR} = 1970,
         * {@link java.util.Calendar#MONTH} = {@link java.util.Calendar#JANUARY},
         * {@link java.util.Calendar#DATE} = 1, etc.
         * This is important as there are variations in the Gregorian Calendar,
         * e.g. leap years have different days in the month = {@link java.util.Calendar#FEBRUARY}
         * so the result of {@link Duration#getMonths()} can be influenced.</p>
         *
     * <p>Any remaining milliseconds after determining the year and month are discarded.</p>
         *
         * @param durationInMilliseconds Milliseconds of <code>Duration</code> to create.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationYearMonthImpl.java
    protected DurationYearMonthImpl(
        final boolean isPositive,
        final int years,
        final int months) {

        /**
         * <p>Construct a <code>Duration</code> of type <code>xdt:yearMonthDuration</code> using the specified
         * <code>year</code> and <code>month</code> as defined in
         * <a href="http://www.w3.org/TR/xpath-datamodel#yearMonthDuration">
         *   XQuery 1.0 and XPath 2.0 Data Model, xdt:yearMonthDuration</a>.</p>
         *
     * <p>A {@link DatatypeConstants#FIELD_UNDEFINED} value indicates that field is not set.</p>
     *
     * @param isPositive Set to <code>false</code> to create a negative duration. When the length
     *   of the duration is zero, this parameter will be ignored.
         * @param year Year of <code>Duration</code>.
         * @param month Month of <code>Duration</code>.
         *
         * @throws IllegalArgumentException If the values are not a valid representation of a
         * <code>Duration</code>: if any of the fields (year, month) is negative.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationYearMonthImpl.java
    public DurationYearMonthImpl(
        boolean isPositive,
        BigInteger years,
        BigInteger months) {

    /**
     * <p>Constructs a new Duration object by specifying each field individually.</p>
     *
     * <p>All the parameters are optional as long as at least one field is present.
     * If specified, parameters have to be zero or positive.</p>
     *
     * @param isPositive Set to <code>false</code> to create a negative duration. When the length
     *   of the duration is zero, this parameter will be ignored.
     * @param years of this <code>Duration</code>
     * @param months of this <code>Duration</code>
     *
     * @throws IllegalArgumentException
     *    If years, months parameters are all <code>null</code>. Or if any
     *    of those parameters are negative.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationYearMonthImpl.java
class DurationYearMonthImpl

/**
 * <p>Represent a subtype <code>xdt:yearMonthDuration</code> of a <code>Duration</code>
 * as specified in <a href="http://www.w3.org/TR/xpath-datamodel#yearMonthDuration">
 *   XQuery 1.0 and XPath 2.0 Data Model, xdt:yearMonthDuration</a>.</p>
 *
 *
 * <p>The DurationYearMonth object represents a period of Gregorian time,
 * with a lexical representation, "<em>PnYnM</em>" that contains only year and month components.
 * </p>
 *
 *
 * @author <a href="mailto:Vikram.Aroskar@Sun.COM">Vikram Aroskar</a>
 * @author <a href="mailto:Huizhe.wang@oracle.com">Joe Wang</a>
 * @version $Revision: 1.1 $, $Date: 2010/05/19 05:02:55 $

 * @see XMLGregorianCalendar#add(Duration)
 */
