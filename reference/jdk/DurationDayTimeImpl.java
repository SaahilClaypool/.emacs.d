_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationDayTimeImpl.java
    public float getValue() {

    /**
     * The value space of xs:dayTimeDuration is the set of fractional second values.
     * @return fractional second values
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationDayTimeImpl.java
    protected DurationDayTimeImpl(final long durationInMilliseconds) {

        /**
         * <p>Create a <code>Duration</code> of type <code>xdt:dayTimeDuration</code> using the specified milliseconds as defined in
         * <a href="http://www.w3.org/TR/xpath-datamodel#dayTimeDuration">
         *   XQuery 1.0 and XPath 2.0 Data Model, xdt:dayTimeDuration</a>.</p>
         *
         * <p>The datatype <code>xdt:dayTimeDuration</code> is a subtype of <code>xs:duration</code>
         * whose lexical representation contains only day, hour, minute, and second components.
         * This datatype resides in the namespace <code>http://www.w3.org/2003/11/xpath-datatypes</code>.</p>
         *
     * <p>All four values are set by computing their values from the specified milliseconds
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
         * so the result of {@link Duration#getDays()} can be influenced.</p>
         *
     * <p>Any remaining milliseconds after determining the day, hour, minute and second are discarded.</p>
     *
     * @param durationInMilliseconds Milliseconds of <code>Duration</code> to create.
     *
     * @return New <code>Duration</code> created with the specified <code>durationInMilliseconds</code>.
     *
     * @see <a href="http://www.w3.org/TR/xpath-datamodel#dayTimeDuration">
     *   XQuery 1.0 and XPath 2.0 Data Model, xdt:dayTimeDuration</a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationDayTimeImpl.java
    protected DurationDayTimeImpl(String lexicalRepresentation) {

        /**
         * <p>Construct a <code>Duration</code> of type <code>xdt:dayTimeDuration</code> by parsing its <code>String</code> representation,
         * "<em>PnDTnHnMnS</em>", <a href="http://www.w3.org/TR/xpath-datamodel#dayTimeDuration">
         *   XQuery 1.0 and XPath 2.0 Data Model, xdt:dayTimeDuration</a>.</p>
         *
         * <p>The datatype <code>xdt:dayTimeDuration</code> is a subtype of <code>xs:duration</code>
         * whose lexical representation contains only day, hour, minute, and second components.
         * This datatype resides in the namespace <code>http://www.w3.org/2003/11/xpath-datatypes</code>.</p>
         *
     * <p>All four values are set and availabe from the created {@link Duration}</p>
         *
     * <p>The XML Schema specification states that values can be of an arbitrary size.
     * Implementations may chose not to or be incapable of supporting arbitrarily large and/or small values.
     * An {@link UnsupportedOperationException} will be thrown with a message indicating implementation limits
     * if implementation capacities are exceeded.</p>
     *
         * @param lexicalRepresentation Lexical representation of a duration.
         *
         * @throws IllegalArgumentException If <code>lexicalRepresentation</code> is not a valid representation of a <code>Duration</code> expressed only in terms of days and time.
         * @throws UnsupportedOperationException If implementation cannot support requested values.
         * @throws NullPointerException If <code>lexicalRepresentation</code> is <code>null</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationDayTimeImpl.java
class DurationDayTimeImpl

/**
 * <p>Represent a subtype <code>xdt:dayTimeDuration</code> of a <code>Duration</code>
 * as specified in <a href="http://www.w3.org/TR/xpath-datamodel#dayTimeDuration">
 *   XQuery 1.0 and XPath 2.0 Data Model, xdt:dayTimeDuration</a>.</p>
 *
 *
 * <p>The DurationYearMonth object represents a period of Gregorian time,
 * with a lexical representation, "<em>PnDTnHnMnS</em>" that contains only year and month components.
 * </p>
 *
 *
 * @author <a href="mailto:Vikram.Aroskar@Sun.COM">Vikram Aroskar</a>
 * @author <a href="mailto:Huizhe.wang@oracle.com">Joe Wang</a>
 * @version $Revision: 1.2 $, $Date: 2010/05/19 23:20:06 $

 * @see XMLGregorianCalendar#add(Duration)
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationDayTimeImpl.java
    public float getValue() {

    /**
     * The value space of xs:dayTimeDuration is the set of fractional second values.
     * @return fractional second values
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationDayTimeImpl.java
    protected DurationDayTimeImpl(final long durationInMilliseconds) {

        /**
         * <p>Create a <code>Duration</code> of type <code>xdt:dayTimeDuration</code> using the specified milliseconds as defined in
         * <a href="http://www.w3.org/TR/xpath-datamodel#dayTimeDuration">
         *   XQuery 1.0 and XPath 2.0 Data Model, xdt:dayTimeDuration</a>.</p>
         *
         * <p>The datatype <code>xdt:dayTimeDuration</code> is a subtype of <code>xs:duration</code>
         * whose lexical representation contains only day, hour, minute, and second components.
         * This datatype resides in the namespace <code>http://www.w3.org/2003/11/xpath-datatypes</code>.</p>
         *
     * <p>All four values are set by computing their values from the specified milliseconds
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
         * so the result of {@link Duration#getDays()} can be influenced.</p>
         *
     * <p>Any remaining milliseconds after determining the day, hour, minute and second are discarded.</p>
     *
     * @param durationInMilliseconds Milliseconds of <code>Duration</code> to create.
     *
     * @return New <code>Duration</code> created with the specified <code>durationInMilliseconds</code>.
     *
     * @see <a href="http://www.w3.org/TR/xpath-datamodel#dayTimeDuration">
     *   XQuery 1.0 and XPath 2.0 Data Model, xdt:dayTimeDuration</a>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationDayTimeImpl.java
    protected DurationDayTimeImpl(String lexicalRepresentation) {

        /**
         * <p>Construct a <code>Duration</code> of type <code>xdt:dayTimeDuration</code> by parsing its <code>String</code> representation,
         * "<em>PnDTnHnMnS</em>", <a href="http://www.w3.org/TR/xpath-datamodel#dayTimeDuration">
         *   XQuery 1.0 and XPath 2.0 Data Model, xdt:dayTimeDuration</a>.</p>
         *
         * <p>The datatype <code>xdt:dayTimeDuration</code> is a subtype of <code>xs:duration</code>
         * whose lexical representation contains only day, hour, minute, and second components.
         * This datatype resides in the namespace <code>http://www.w3.org/2003/11/xpath-datatypes</code>.</p>
         *
     * <p>All four values are set and availabe from the created {@link Duration}</p>
         *
     * <p>The XML Schema specification states that values can be of an arbitrary size.
     * Implementations may chose not to or be incapable of supporting arbitrarily large and/or small values.
     * An {@link UnsupportedOperationException} will be thrown with a message indicating implementation limits
     * if implementation capacities are exceeded.</p>
     *
         * @param lexicalRepresentation Lexical representation of a duration.
         *
         * @throws IllegalArgumentException If <code>lexicalRepresentation</code> is not a valid representation of a <code>Duration</code> expressed only in terms of days and time.
         * @throws UnsupportedOperationException If implementation cannot support requested values.
         * @throws NullPointerException If <code>lexicalRepresentation</code> is <code>null</code>.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/DurationDayTimeImpl.java
class DurationDayTimeImpl

/**
 * <p>Represent a subtype <code>xdt:dayTimeDuration</code> of a <code>Duration</code>
 * as specified in <a href="http://www.w3.org/TR/xpath-datamodel#dayTimeDuration">
 *   XQuery 1.0 and XPath 2.0 Data Model, xdt:dayTimeDuration</a>.</p>
 *
 *
 * <p>The DurationYearMonth object represents a period of Gregorian time,
 * with a lexical representation, "<em>PnDTnHnMnS</em>" that contains only year and month components.
 * </p>
 *
 *
 * @author <a href="mailto:Vikram.Aroskar@Sun.COM">Vikram Aroskar</a>
 * @author <a href="mailto:Huizhe.wang@oracle.com">Joe Wang</a>
 * @version $Revision: 1.2 $, $Date: 2010/05/19 23:20:06 $

 * @see XMLGregorianCalendar#add(Duration)
 */
