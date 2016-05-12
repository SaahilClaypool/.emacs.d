_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public void reset() {

    /** <p><code>reset()</code> is designed to allow the reuse of existing
     * <code>XMLGregorianCalendar</code>s thus saving resources associated
     *  with the creation of new <code>XMLGregorianCalendar</code>s.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    static BigInteger sanitize(Number value, int signum) {

    /**
     * Compute <code>value*signum</code> where value==null is treated as
     * value==0.
     * @return non-null {@link BigInteger}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private int print4Number( char[] out, int bufptr, int number ) {

    /**
     * Prints an int as four digits into the buffer.
     *
     * @param number
     *      Number to be printed. Must be positive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private int print2Number( char[] out, int bufptr, int number ) {

    /**
     * Prints an int as two digits into the buffer.
     *
     * @param number
     *      Number to be printed. Must be positive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private String format( String format ) {

    /**
     * Prints this object according to the format specification.
     *
     * <p>
     * I wrote a custom format method for a particular format string to
     * see if it improves the performance, but it didn't. So this interpreting
     * approach isn't too bad.
     *
     * <p>
     * StringBuffer -> StringBuilder change had a very visible impact.
     * It almost cut the execution time to half, but unfortunately we can't use it
     * because we need to run on JDK 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
        public void parse() throws IllegalArgumentException {

        /**
         * <p>Parse a formated <code>String</code> into an <code>XMLGregorianCalendar</code>.</p>
         *
         * <p>If <code>String</code> is not formated as a legal <code>XMLGregorianCalendar</code> value,
         * an <code>IllegalArgumentException</code> is thrown.</p>
         *
         * @throws IllegalArgumentException If <code>String</code> is not formated as a legal <code>XMLGregorianCalendar</code> value.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public void clear() {

    /**
     * <p>Unset all fields to undefined.</p>
     *
     * <p>Set all int fields to {@link DatatypeConstants#FIELD_UNDEFINED} and reference fields
     * to null.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
   public Object clone() {

    /**
     * <p>Creates and returns a copy of this object.</p>
     *
     * @return copy of this <code>Object</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public TimeZone getTimeZone(int defaultZoneoffset) {

    /**
     * <p>Returns a <code>java.util.TimeZone</code> for this class.</p>
     *
     * <p>If timezone field is defined for this instance,
     * returns TimeZone initialized with custom timezone id
     * of zoneoffset. If timezone field is undefined,
     * try the defaultZoneoffset that was passed in.
     * If defaultZoneoffset is DatatypeConstants.FIELD_UNDEFINED, return
     * default timezone for this host.
     * (Same default as java.util.GregorianCalendar).</p>
     *
     * @param defaultZoneoffset default zoneoffset if this zoneoffset is
     * {@link DatatypeConstants#FIELD_UNDEFINED}.
     *
     * @return TimeZone for this.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public GregorianCalendar toGregorianCalendar(TimeZone timezone,
                                                 Locale aLocale,
                                                 XMLGregorianCalendar defaults) {

    /**
     * <p>Convert <code>this</code> along with provided parameters
     * to <code>java.util.GregorianCalendar</code> instance.</p>
     *
     * <p> Since XML Schema 1.0 date/time datetypes has no concept of
     * timezone ids or daylight savings timezone ids, this conversion operation
     * allows the user to explicitly specify one with
     * <code>timezone</code> parameter.</p>
     *
     * <p>To compute the return value's <code>TimeZone</code> field,
     * <ul>
     * <li>when parameter <code>timeZone</code> is non-null,
     * it is the timezone field.</li>
     * <li>else when <code>this.getTimezone() != DatatypeConstants.FIELD_UNDEFINED</code>,
     * create a <code>java.util.TimeZone</code> with a custom timezone id
     * using the <code>this.getTimezone()</code>.</li>
     * <li>else when <code>defaults.getTimezone() != DatatypeConstants.FIELD_UNDEFINED</code>,
     * create a <code>java.util.TimeZone</code> with a custom timezone id
     * using <code>defaults.getTimezone()</code>.</li>
     * <li>else use the <code>GregorianCalendar</code> default timezone value
     * for the host is definedas specified by
     * <code>java.util.TimeZone.getDefault()</code>.</li></p>
     *
     * <p>To ensure consistency in conversion implementations, the new
     * <code>GregorianCalendar</code> should be instantiated in following
     * manner.
     * <ul>
     *   <li>Create a new <code>java.util.GregorianCalendar(TimeZone,
     *       Locale)</code> with TimeZone set as specified above and the
     *       <code>Locale</code> parameter.
     *   </li>
     *   <li>Initialize all GregorianCalendar fields by calling {(@link GegorianCalendar#clear()}.</li>
     *   <li>Obtain a pure Gregorian Calendar by invoking
     *   <code>GregorianCalendar.setGregorianChange(
     *   new Date(Long.MIN_VALUE))</code>.</li>
     *   <li>Its fields ERA, YEAR, MONTH, DAY_OF_MONTH, HOUR_OF_DAY,
     *       MINUTE, SECOND and MILLISECOND are set using the method
     *       <code>Calendar.set(int,int)</code></li>
     * </ul>
     *
     * @param timezone provide Timezone. <code>null</code> is a legal value.
     * @param aLocale  provide explicit Locale. Use default GregorianCalendar locale if
     *                 value is <code>null</code>.
     * @param defaults provide default field values to use when corresponding
     *                 field for this instance is DatatypeConstants.FIELD_UNDEFINED or null.
     *                 If <code>defaults</code>is <code>null</code> or a field
     *                 within the specified <code>defaults</code> is undefined,
     *                 just use <code>java.util.GregorianCalendar</code> defaults.
     * @return a java.util.GregorianCalendar conversion of this instance.
     *
     * @see #LEAP_YEAR_DEFAULT
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private Locale getDefaultLocale() {

    /**
     *
     * @return default locale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
        Locale locale = getDefaultLocale();

        /** Use the following instead for JDK7 only:
         * Locale locale = Locale.getDefault(Locale.Category.FORMAT);
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public java.util.GregorianCalendar toGregorianCalendar() {

    /**
     * <p>Convert <code>this</code> to <code>java.util.GregorianCalendar</code>.</p>
     *
     * <p>When <code>this</code> instance has an undefined field, this
     * conversion relies on the <code>java.util.GregorianCalendar</code> default
     * for its corresponding field. A notable difference between
     * XML Schema 1.0 date/time datatypes and <code>java.util.GregorianCalendar</code>
     * is that Timezone value is optional for date/time datatypes and it is
     * a required field for <code>java.util.GregorianCalendar</code>. See javadoc
     * for <code>java.util.TimeZone.getDefault()</code> on how the default
     * is determined. To explicitly specify the <code>TimeZone</code>
     * instance, see
     * {@link #toGregorianCalendar(TimeZone, Locale, XMLGregorianCalendar)}.</p>
     *
     * <table border="2" rules="all" cellpadding="2">
     *   <thead>
     *     <tr>
     *       <th align="center" colspan="2">
     *          Field by Field Conversion from this class to
     *          <code>java.util.GregorianCalendar</code>
     *       </th>
     *     </tr>
     *   </thead>
     *   <tbody>
     *     <tr>
     *        <th><code>java.util.GregorianCalendar</code> field</th>
     *        <th><code>javax.xml.datatype.XMLGregorianCalendar</code> field</th>
     *     </tr>
     *     <tr>
     *       <th><code>ERA</code></th>
     *       <th>{@link #getEonAndYear()}<code>.signum() < 0 ? GregorianCalendar.BC : GregorianCalendar.AD</code></th>
     *     </tr>
     *     <tr>
     *       <th><code>YEAR</code></th>
     *       <th>{@link #getEonAndYear()}<code>.abs().intValue()</code><i>*</i></th>
     *     </tr>
     *     <tr>
     *       <th><code>MONTH</code></th>
     *       <th>{@link #getMonth()}<code> - 1</code></th>
     *     </tr>
     *     <tr>
     *       <th><code>DAY_OF_MONTH</code></th>
     *       <th>{@link #getDay()}</th>
     *     </tr>
     *     <tr>
     *       <th><code>AM_PM</code></th>
     *       <th>{@link #getHour()} < 12 : Calendar.AM : Calendar.PM</th>
     *     </tr>
     *     <tr>
     *       <th><code>HOUR_OF_DAY</code></th>
     *       <th>{@link #getHour()}</th>
     *     </tr>
     *     <tr>
     *       <th><code>MINUTE</code></th>
     *       <th>{@link #getMinute()}</th>
     *     </tr>
     *     <tr>
     *       <th><code>SECOND</code></th>
     *       <th>{@link #getSecond()}</th>
     *     </tr>
     *     <tr>
     *       <th><code>MILLISECOND</code></th>
     *       <th>get millisecond order from {@link #getFractionalSecond()}<i>*</i> </th>
     *     </tr>
     *     <tr>
     *       <th><code>GregorianCalendar.setTimeZone(TimeZone)</code></th>
     *       <th>{@link #getTimezone()} formatted into Custom timezone id</th>
     *     </tr>
     *   </tbody>
     * </table>
     * <i>*</i> designates possible loss of precision during the conversion due
     * to source datatype having higer precison than target datatype.
     *
     * <p>To ensure consistency in conversion implementations, the new
     * <code>GregorianCalendar</code> should be instantiated in following
     * manner.
     * <ul>
     *   <li>Using <code>timeZone</code> value as defined above, create a new
     * <code>java.util.GregorianCalendar(timeZone,Locale.getDefault())</code>.
     *   </li>
     *   <li>Initialize all GregorianCalendar fields by calling {(@link GegorianCalendar#clear()}.</li>
     *   <li>Obtain a pure Gregorian Calendar by invoking
     *   <code>GregorianCalendar.setGregorianChange(
     *   new Date(Long.MIN_VALUE))</code>.</li>
     *   <li>Its fields ERA, YEAR, MONTH, DAY_OF_MONTH, HOUR_OF_DAY,
     *       MINUTE, SECOND and MILLISECOND are set using the method
     *       <code>Calendar.set(int,int)</code></li>
     * </ul>
     * </p>
     *
     * @see #toGregorianCalendar(java.util.TimeZone, java.util.Locale, XMLGregorianCalendar)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public void add(Duration duration) {

    /**
     * <p>Add <code>duration</code> to this instance.<\p>
     *
     * <p>The computation is specified in
     * <a href="http://www.w3.org/TR/xmlschema-2/#adding-durations-to-dateTimes">XML Schema 1.0 Part 2, Appendix E,
     * <i>Adding durations to dateTimes</i>></a>.
     * <a href="#datetimefieldsmapping">date/time field mapping table</a>
     * defines the mapping from XML Schema 1.0 <code>dateTime</code> fields
     * to this class' representation of those fields.</p>
     *
     * @param duration Duration to add to this <code>XMLGregorianCalendar</code>.
     *
     * @throws NullPointerException  when <code>duration</code> parameter is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public boolean isValid() {

    /**
     * Validate instance by <code>getXMLSchemaType()</code> constraints.
     * @return true if data values are valid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public QName getXMLSchemaType() {

    /**
     * <p>Return the name of the XML Schema date/time type that this instance
     * maps to. Type is computed based on fields that are set.</p>
     *
     * <table border="2" rules="all" cellpadding="2">
     *   <thead>
     *     <tr>
     *       <th align="center" colspan="7">
     *         Required fields for XML Schema 1.0 Date/Time Datatypes.<br/>
     *         <i>(timezone is optional for all date/time datatypes)</i>
     *       </th>
     *     </tr>
     *   </thead>
     *   <tbody>
     *     <tr>
     *       <td>Datatype</td>
     *       <td>year</td>
     *       <td>month</td>
     *       <td>day</td>
     *       <td>hour</td>
     *       <td>minute</td>
     *       <td>second</td>
     *     </tr>
     *     <tr>
     *       <td>{@link DatatypeConstants#DATETIME}</td>
     *       <td>X</td>
     *       <td>X</td>
     *       <td>X</td>
     *       <td>X</td>
     *       <td>X</td>
     *       <td>X</td>
     *     </tr>
     *     <tr>
     *       <td>{@link DatatypeConstants#DATE}</td>
     *       <td>X</td>
     *       <td>X</td>
     *       <td>X</td>
     *       <td></td>
     *       <td></td>
     *       <td></td>
     *     </tr>
     *     <tr>
     *       <td>{@link DatatypeConstants#TIME}</td>
     *       <td></td>
     *       <td></td>
     *       <td></td>
     *       <td>X</td>
     *       <td>X</td>
     *       <td>X</td>
     *     </tr>
     *     <tr>
     *       <td>{@link DatatypeConstants#GYEARMONTH}</td>
     *       <td>X</td>
     *       <td>X</td>
     *       <td></td>
     *       <td></td>
     *       <td></td>
     *       <td></td>
     *     </tr>
     *     <tr>
     *       <td>{@link DatatypeConstants#GMONTHDAY}</td>
     *       <td></td>
     *       <td>X</td>
     *       <td>X</td>
     *       <td></td>
     *       <td></td>
     *       <td></td>
     *     </tr>
     *     <tr>
     *       <td>{@link DatatypeConstants#GYEAR}</td>
     *       <td>X</td>
     *       <td></td>
     *       <td></td>
     *       <td></td>
     *       <td></td>
     *       <td></td>
     *     </tr>
     *     <tr>
     *       <td>{@link DatatypeConstants#GMONTH}</td>
     *       <td></td>
     *       <td>X</td>
     *       <td></td>
     *       <td></td>
     *       <td></td>
     *       <td></td>
     *     </tr>
     *     <tr>
     *       <td>{@link DatatypeConstants#GDAY}</td>
     *       <td></td>
     *       <td></td>
     *       <td>X</td>
     *       <td></td>
     *       <td></td>
     *       <td></td>
     *     </tr>
     *   </tbody>
     * </table>
     *
     * @throws java.lang.IllegalStateException if the combination of set fields
     *    does not match one of the eight defined XML Schema builtin
     *    date/time datatypes.
     * @return One of the following class constants:
     *   {@link DatatypeConstants#DATETIME},
     *   {@link DatatypeConstants#TIME},
     *   {@link DatatypeConstants#DATE},
     *   {@link DatatypeConstants#GYEARMONTH},
     *   {@link DatatypeConstants#GMONTHDAY},
     *   {@link DatatypeConstants#GYEAR},
     *   {@link DatatypeConstants#GMONTH} or
     *   {@link DatatypeConstants#GDAY}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public String toXMLFormat() {

    /**
     * <p>Return the lexical representation of <code>this</code> instance.
     * The format is specified in
     * <a href="http://www.w3.org/TR/xmlschema-2/#dateTime-order">XML Schema 1.0 Part 2, Section 3.2.[7-14].1,
     * <i>Lexical Representation</i>".</a></p>
     *
     * <p>Specific target lexical representation format is determined by
     * {@link #getXMLSchemaType()}.</p>
     *
     * @return XML, as <code>String</code>, representation of this <code>XMLGregorianCalendar</code>
     *
     * @throws java.lang.IllegalStateException if the combination of set fields
     *    does not match one of the eight defined XML Schema builtin date/time datatypes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public static XMLGregorianCalendar parse(String lexicalRepresentation) {

    /**
     * <p>Constructs a new XMLGregorianCalendar object by
     * parsing its lexical string representation as defined in
     * <a href="http://www.w3.org/TR/xmlschema-2/#dateTime-order">XML Schema 1.0 Part 2, Section 3.2.[7-14].1,
     * <i>Lexical Representation</i>.</a></p>
     *
     * <p>The string representation may not have any leading and trailing whitespaces.</p>
     *
     * <p>The parsing is done field by field so that
     * the following holds for any lexically correct string x:</p>
     * <pre>
     * new XMLGregorianCalendar(x).toXMLFormat().equals(x)
     * </pre>
     * Except for the noted lexical/canonical representation mismatches
     * listed in <a href="http://www.w3.org/2001/05/xmlschema-errata#e2-45">
     * XML Schema 1.0 errata, Section 3.2.7.2</a>.
     *
     * <p>Returns a non-null valid XMLGregorianCalendar object that holds the value
     * indicated by the lexicalRepresentation parameter.</p>
     *
     * @param lexicalRepresentation Lexical representation of one the 8 XML Schema calendar datatypes.
     *
     * @return <code>XMLGregorianCalendar</code> created from parsing <code>lexicalRepresentation</code> parameter.
     *
     * @throws IllegalArgumentException
     *      If the given string does not conform to the aforementioned
     *      specification.
     * @throws NullPointerException
     *      If the given string is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public int hashCode() {

    /**
     * <p>Returns a hash code consistent with the definition of the equals method.</p>
     *
     * @return hash code of this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public boolean equals(Object obj) {

    /**
     * <p>Indicates whether parameter <code>obj</code> is "equal to" this one.</p>
     *
     * @param obj to compare.
     *
     * @return <code>true</code> when <code>compare(this,(XMLGregorianCalendar)obj) == EQUAL.</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private static int compareField(int Pfield, int Qfield) {

    /**
     * <p>Implement Step B from
     * http://www.w3.org/TR/xmlschema-2/#dateTime-order.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private static int internalCompare(XMLGregorianCalendar P,
                                       XMLGregorianCalendar Q) {

    /**
     *
     *  <p>Implements Step B from http://www.w3.org/TR/xmlschema-2/#dateTime-order </p>
     * @param P calendar instance with normalized timezone offset or
     *          having same timezone as Q
     * @param Q calendar instance with normalized timezone offset or
     *          having same timezone as P
     *
     * @return result of comparing P and Q, value of
     *   {@link DatatypeConstants#EQUAL},
     *   {@link DatatypeConstants#LESSER},
     *   {@link DatatypeConstants#GREATER} or
     *   {@link DatatypeConstants#INDETERMINATE}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private XMLGregorianCalendar normalizeToTimezone(int timezone) {

        /**
         * <p>Normalize this instance to UTC.</p>
         *
         * <p>2000-03-04T23:00:00+03:00 normalizes to 2000-03-04T20:00:00Z</p>
         * <p>Implements W3C XML Schema Part 2, Section 3.2.7.3 (A).</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public XMLGregorianCalendar normalize() {

    /**
     * <p>Normalize this instance to UTC.</p>
     *
     * <p>2000-03-04T23:00:00+03:00 normalizes to 2000-03-04T20:00:00Z</p>
     * <p>Implements W3C XML Schema Part 2, Section 3.2.7.3 (A).</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public int compare(XMLGregorianCalendar rhs) {

    /**
     * <p>Compare two instances of W3C XML Schema 1.0 date/time datatypes
     * according to partial order relation defined in
     * <a href="http://www.w3.org/TR/xmlschema-2/#dateTime-order">W3C XML Schema 1.0 Part 2, Section 3.2.7.3,
     * <i>Order relation on dateTime</i></a>.</p>
     *
     * <p><code>xsd:dateTime</code> datatype field mapping to accessors of
     * this class are defined in
     * <a href="#datetimefieldmapping">date/time field mapping table</a>.</p>
     *
     * @param rhs instance of <code>XMLGregorianCalendar</code> to compare
     *
     * @return the relationship between <code>lhs</code> and <code>rhs</code> as
     *   {@link DatatypeConstants#LESSER},
     *   {@link DatatypeConstants#EQUAL},
     *   {@link DatatypeConstants#GREATER} or
     *   {@link DatatypeConstants#INDETERMINATE}.
     *
     * @throws NullPointerException if <code>lhs</code> or <code>rhs</code>
     * parameters are null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public void setTime(int hour, int minute, int second, int millisecond) {

    /**
     * <p>Set time as one unit, including optional milliseconds.</p>
     *
     * @param hour value constraints are summarized in
     * <a href="#datetimefield-hour">hour field of date/time field mapping table</a>.
     * @param minute value constraints are summarized in
     * <a href="#datetimefield-minute">minute field of date/time field mapping table</a>.
     * @param second value constraints are summarized in
     * <a href="#datetimefield-second">second field of date/time field mapping table</a>.
     * @param millisecond value of {@link DatatypeConstants#FIELD_UNDEFINED} indicates this
     *                    optional field is not set.
     *
     * @throws IllegalArgumentException if any parameter is
     * outside value constraints for the field as specified in
     * <a href="#datetimefieldmapping">date/time field mapping table</a>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public void setTime(
            int hour,
            int minute,
            int second,
            BigDecimal fractional) {

    /**
     * <p>Set time as one unit, including the optional infinite precison
     * fractional seconds.</p>
     *
     * @param hour value constraints are summarized in
     * <a href="#datetimefield-hour">hour field of date/time field mapping table</a>.
     * @param minute value constraints are summarized in
     * <a href="#datetimefield-minute">minute field of date/time field mapping table</a>.
     * @param second value constraints are summarized in
     * <a href="#datetimefield-second">second field of date/time field mapping table</a>.
     * @param fractional value of <code>null</code> indicates this optional
     *                   field is not set.
     *
     * @throws IllegalArgumentException if any parameter is
     * outside value constraints for the field as specified in
     * <a href="#datetimefieldmapping">date/time field mapping table</a>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public void setTime(int hour, int minute, int second) {

    /**
     * <p>Set time as one unit.</p>
     *
     * @param hour value constraints are summarized in
     * <a href="#datetimefield-hour">hour field of date/time field mapping table</a>.
     * @param minute value constraints are summarized in
     * <a href="#datetimefield-minute">minute field of date/time field mapping table</a>.
     * @param second value constraints are summarized in
     * <a href="#datetimefield-second">second field of date/time field mapping table</a>.
     *
     * @see #setTime(int, int, int, BigDecimal)
     *
     * @throws IllegalArgumentException if any parameter is
     * outside value constraints for the field as specified in
     * <a href="#datetimefieldmapping">date/time field mapping table</a>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public void setTimezone(int offset) {

    /**
     * <p>Set the number of minutes in the timezone offset.</p>
     *
     * <p>Unset this field by invoking the setter with a parameter value of {@link DatatypeConstants#FIELD_UNDEFINED}.</p>
     *
     * @param offset value constraints summarized in <a href="#datetimefield-timezone">
     *   timezone field of date/time field mapping table</a>.
     *
     * @throws IllegalArgumentException if <code>offset</code> parameter is
     * outside value constraints for the field as specified in
     * <a href="#datetimefieldmapping">date/time field mapping table</a>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public void setDay(int day) {

    /**
     * <p>Set days in month.</p>
     *
     * <p>Unset this field by invoking the setter with a parameter value of {@link DatatypeConstants#FIELD_UNDEFINED}.</p>
     *
     * @param day value constraints summarized in <a href="#datetimefield-day">day field of date/time field mapping table</a>.
     *
     * @throws IllegalArgumentException if <code>day</code> parameter is
     * outside value constraints for the field as specified in
     * <a href="#datetimefieldmapping">date/time field mapping table</a>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public void setMonth(int month) {

    /**
     * <p>Set month.</p>
     *
     * <p>Unset this field by invoking the setter with a parameter value of {@link DatatypeConstants#FIELD_UNDEFINED}.</p>
     *
     * @param month value constraints summarized in <a href="#datetimefield-month">month field of date/time field mapping table</a>.
     *
     * @throws IllegalArgumentException if <code>month</code> parameter is
     * outside value constraints for the field as specified in
     * <a href="#datetimefieldmapping">date/time field mapping table</a>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private void setEon(BigInteger eon) {

    /**
     * <p>Set high order part of XSD <code>dateTime</code> year field.</p>
     *
     * <p>Unset this field by invoking the setter with a parameter value of
     * <code>null</code>.</p>
     *
     * @param eon value constraints summarized in <a href="#datetimefield-year">year field of date/time field mapping table</a>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public void setYear(int year) {

    /**
     * <p>Set year of XSD <code>dateTime</code> year field.</p>
     *
     * <p>Unset this field by invoking the setter with a parameter value of
     * {@link DatatypeConstants#FIELD_UNDEFINED}.</p>
     *
     * <p>Note: if the absolute value of the <code>year</code> parameter
     * is less than 10^9, the eon component of the XSD year field is set to
     * <code>null</code> by this method.</p>
     *
     * @param year value constraints are summarized in <a href="#datetimefield-year">year field of date/time field mapping table</a>.
     *   If year is {@link DatatypeConstants#FIELD_UNDEFINED}, then eon is set to <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public void setYear(BigInteger year) {

    /**
     * <p>Set low and high order component of XSD <code>dateTime</code> year field.</p>
     *
     * <p>Unset this field by invoking the setter with a parameter value of <code>null</code>.</p>
     *
     * @param year value constraints summarized in <a href="#datetimefield-year">year field of date/time field mapping table</a>.
     *
     * @throws IllegalArgumentException if <code>year</code> parameter is
     * outside value constraints for the field as specified in
     * <a href="#datetimefieldmapping">date/time field mapping table</a>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public BigDecimal getFractionalSecond() {

    /**
     * <p>Return fractional seconds.</p>
     *
     * <p><code>null</code> is returned when this optional field is not defined.</p>
     *
     * <p>Value constraints are detailed in
     * <a href="#datetimefield-second">second field of date/time field mapping table</a>.</p>
     *
     * <p>This optional field can only have a defined value when the
     * xs:dateTime second field, represented by ({@link #getSecond()},
     * does not return {@link DatatypeConstants#FIELD_UNDEFINED}).</p>
     *
     * @return fractional seconds  of this <code>XMLGregorianCalendar</code>.
     *
     * @see #getSecond()
     * @see #setTime(int, int, int, BigDecimal)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public int getMillisecond() {

    /**
     * <p>Return millisecond precision of {@link #getFractionalSecond()}.<\p>
     *
     * <p>This method represents a convenience accessor to infinite
     * precision fractional second value returned by
     * {@link #getFractionalSecond()}. The returned value is the rounded
     * down to milliseconds value of
     * {@link #getFractionalSecond()}. When {@link #getFractionalSecond()}
     * returns <code>null</code>, this method must return
     * {@link DatatypeConstants#FIELD_UNDEFINED}.</p>
     *
     * <p>Value constraints for this value are summarized in
     * <a href="#datetimefield-second">second field of date/time field mapping table</a>.</p>
     *
     * @return Millisecond  of this <code>XMLGregorianCalendar</code>.
     *
     * @see #getFractionalSecond()
     * @see #setTime(int, int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private BigDecimal getSeconds() {

    /**
     * @return result of adding second and fractional second field
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public int getSecond() {

    /**
     * <p>Return seconds or {@link DatatypeConstants#FIELD_UNDEFINED}.<\p>
     *
     * <p>Returns {@link DatatypeConstants#FIELD_UNDEFINED} if this field is not defined.
     * When this field is not defined, the optional xs:dateTime
     * fractional seconds field, represented by
     * {@link #getFractionalSecond()} and {@link #getMillisecond()},
     * must not be defined.</p>
     *
     * <p>Value constraints for this value are summarized in
     * <a href="#datetimefield-second">second field of date/time field mapping table</a>.</p>
     *
     * @return Second  of this <code>XMLGregorianCalendar</code>.
     *
     * @see #getFractionalSecond()
     * @see #getMillisecond()
     * @see #setTime(int, int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public int getMinute() {

    /**
     * Return minutes or {@link DatatypeConstants#FIELD_UNDEFINED}.<\p>
     * Returns {@link DatatypeConstants#FIELD_UNDEFINED} if this field is not defined.
     *
     * <p>Value constraints for this value are summarized in
     * <a href="#datetimefield-minute">minute field of date/time field mapping table</a>.</p>
     * @see #setTime(int, int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public int getHour() {

    /**
     * Return hours or {@link DatatypeConstants#FIELD_UNDEFINED}.
     * Returns {@link DatatypeConstants#FIELD_UNDEFINED} if this field is not defined.
     *
     * <p>Value constraints for this value are summarized in
     * <a href="#datetimefield-hour">hour field of date/time field mapping table</a>.</p>
     * @see #setTime(int, int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public int getTimezone() {

    /**
     * Return timezone offset in minutes or
     * {@link DatatypeConstants#FIELD_UNDEFINED} if this optional field is not defined.
     *
     * <p>Value constraints for this value are summarized in
     * <a href="#datetimefield-timezone">timezone field of date/time field mapping table</a>.</p>
     *
     * @see #setTimezone(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public int getDay() {

    /**
     * Return day in month or {@link DatatypeConstants#FIELD_UNDEFINED}.</p>
     *
     * <p>Value constraints for this value are summarized in
     * <a href="#datetimefield-day">day field of date/time field mapping table</a>.</p>
     *
     * @see #setDay(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public int getMonth() {

    /**
     * <p>Return number of month or {@link DatatypeConstants#FIELD_UNDEFINED}.</p>
     *
     * <p>Value constraints for this value are summarized in
     * <a href="#datetimefield-month">month field of date/time field mapping table</a>.</p>
     *
     * @return year  of this <code>XMLGregorianCalendar</code>.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public BigInteger getEonAndYear() {

    /**
     * <p>Return XML Schema 1.0 dateTime datatype field for
     * <code>year</code>.</p>
     *
     * <p>Value constraints for this value are summarized in
     * <a href="#datetimefield-year">year field of date/time field mapping table</a>.</p>
     *
     * @return sum of <code>eon</code> and <code>BigInteger.valueOf(year)</code>
     * when both fields are defined. When only <code>year</code> is defined,
     * return it. When both <code>eon</code> and <code>year</code> are not
     * defined, return <code>null</code>.
     *
     * @see #getEon()
     * @see #getYear()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public int getYear() {

    /**
     * <p>Return low order component for XML Schema 1.0 dateTime datatype field for
     * <code>year</code> or {@link DatatypeConstants#FIELD_UNDEFINED}.</p>
     *
     * <p>Value constraints for this value are summarized in
     * <a href="#datetimefield-year">year field of date/time field mapping table</a>.</p>
     *
     * @return year  of this <code>XMLGregorianCalendar</code>.
     *
     * @see #getEon()
     * @see #getEonAndYear()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public BigInteger getEon() {

    /**
     * <p>Return high order component for XML Schema 1.0 dateTime datatype field for
     * <code>year</code>.
     * <code>null</code> if this optional part of the year field is not defined.</p>
     *
     * <p>Value constraints for this value are summarized in
     * <a href="#datetimefield-year">year field of date/time field mapping table</a>.</p>
     * @return eon of this <code>XMLGregorianCalendar</code>. The value
     * returned is an integer multiple of 10^9.
     *
     * @see #getYear()
     * @see #getEonAndYear()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public static XMLGregorianCalendar createTime(
        int hours,
        int minutes,
        int seconds,
        int milliseconds,
        int timezone) {

    /**
     * <p>Create a Java instance of XML Schema builtin datatype time.</p>
     *
     * @param hours number of hours
     * @param minutes number of minutes
     * @param seconds number of seconds
     * @param milliseconds number of milliseconds
     * @param timezone offset in minutes. {@link DatatypeConstants#FIELD_UNDEFINED} indicates optional field is not set.
     *
     * @return <code>XMLGregorianCalendar</code> created from parameter values.
     *
     * @see DatatypeConstants#FIELD_UNDEFINED
     *
     * @throws IllegalArgumentException if any parameter is outside value
     * constraints for the field as specified in
     * <a href="#datetimefieldmapping">date/time field mapping table</a>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public static XMLGregorianCalendar createTime(
        int hours,
        int minutes,
        int seconds,
        BigDecimal fractionalSecond,
        int timezone) {

    /**
     * <p>Create a Java instance of XML Schema builtin datatype time.</p>
     *
     * @param hours number of hours
     * @param minutes number of minutes
     * @param seconds number of seconds
     * @param fractionalSecond value of <code>null</code> indicates that this optional field is not set.
     * @param timezone offset in minutes. {@link DatatypeConstants#FIELD_UNDEFINED} indicates optional field is not set.
     *
     * @return <code>XMLGregorianCalendar</code> created from parameter values.
     *
     * @see DatatypeConstants#FIELD_UNDEFINED
     *
     * @throws IllegalArgumentException if any parameter is outside value
     * constraints for the field as specified in
     * <a href="#datetimefieldmapping">date/time field mapping table</a>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public static XMLGregorianCalendar createTime(
        int hours,
        int minutes,
        int seconds,
                int timezone) {

    /**
     * Create a Java instance of XML Schema builtin datatype <code>time</code>.
     * @param hours number of hours
     * @param minutes number of minutes
     * @param seconds number of seconds
     * @param timezone offset in minutes. {@link DatatypeConstants#FIELD_UNDEFINED} indicates optional field is not set.
     *
     * @return <code>XMLGregorianCalendar</code> created from parameter values.
     *
     * @see DatatypeConstants#FIELD_UNDEFINED
     *
     * @throws IllegalArgumentException if any parameter is outside value
     * constraints for the field as specified in
     * <a href="#datetimefieldmapping">date/time field mapping table</a>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public static XMLGregorianCalendar createDate(
        int year,
        int month,
        int day,
        int timezone) {

    /**
     * <p>Create a Java representation of XML Schema builtin datatype <code>date</code> or <code>g*</code>.</p>
     *
     * <p>For example, an instance of <code>gYear</code> can be created invoking this factory
     * with <code>month</code> and <code>day</code> parameters set to
     * {@link DatatypeConstants#FIELD_UNDEFINED}.</p>
     *
     * @param year of <code>XMLGregorianCalendar</code> to be created.
     * @param month of <code>XMLGregorianCalendar</code> to be created.
     * @param day of <code>XMLGregorianCalendar</code> to be created.
     * @param timezone offset in minutes. {@link DatatypeConstants#FIELD_UNDEFINED} indicates optional field is not set.
     *
     * @return <code>XMLGregorianCalendar</code> created from parameter values.
     *
     * @see DatatypeConstants#FIELD_UNDEFINED
     *
     * @throws IllegalArgumentException if any parameter is outside value
     * constraints for the field as specified in
     * <a href="#datetimefieldmapping">date/time field mapping table</a>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public static XMLGregorianCalendar createDateTime(
        int year,
        int month,
        int day,
        int hours,
        int minutes,
        int seconds,
        int milliseconds,
        int timezone) {

    /**
     * <p>Create a Java representation of XML Schema builtin datatype <code>dateTime</code>.
     * All possible fields are specified for this factory method.</p>
     *
     * @param year represents low-order year.
     * @param month of <code>dateTime</code>
     * @param day of <code>dateTime</code>
     * @param hours of <code>dateTime</code>
     * @param minutes of <code>dateTime</code>
     * @param seconds of <code>dateTime</code>
     * @param milliseconds of <code>dateTime</code>. {@link DatatypeConstants#FIELD_UNDEFINED} indicates optional field is not set.
     * @param timezone offset in minutes. {@link DatatypeConstants#FIELD_UNDEFINED} indicates optional field is not set.
     *
     * @return <code>XMLGregorianCalendar</code> created from parameter values.
     *
     * @throws IllegalArgumentException if any parameter is outside value constraints for the field as specified in
     *   <a href="#datetimefieldmapping">date/time field mapping table</a>.
     *
     * @see DatatypeConstants#FIELD_UNDEFINED
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public static XMLGregorianCalendar createDateTime(
        int year,
        int month,
        int day,
        int hour,
        int minute,
        int second) {

    /**
     * <p>Create a Java instance of XML Schema builtin datatype dateTime.</p>
     *
     * @param year represents both high-order eons and low-order year.
     * @param month of <code>dateTime</code>
     * @param day of <code>dateTime</code>
     * @param hour of <code>dateTime</code>
     * @param minute of <code>dateTime</code>
     * @param second of <code>dateTime</code>
     *
     * @return <code>XMLGregorianCalendar</code> created from parameter values.
     *
     * @throws IllegalArgumentException if any parameter is outside value constraints for the field as specified in
     *   <a href="#datetimefieldmapping">date/time field mapping table</a>.
     *
     * @see DatatypeConstants#FIELD_UNDEFINED
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public static XMLGregorianCalendar createDateTime(
        BigInteger year,
        int month,
        int day,
        int hours,
        int minutes,
        int seconds,
        BigDecimal fractionalSecond,
        int timezone) {

    /**
     * <p>Create a Java representation of XML Schema builtin datatype <code>dateTime</code>.
     * All possible fields are specified for this factory method.</p>
     *
     * @param year represents both high-order eons and low-order year.
     * @param month of <code>dateTime</code>
     * @param day of <code>dateTime</code>
     * @param hours of <code>dateTime</code>
     * @param minutes of <code>dateTime</code>
     * @param seconds of <code>dateTime</code>
     * @param fractionalSecond value of null indicates optional field is absent.
     * @param timezone offset in minutes. {@link DatatypeConstants#FIELD_UNDEFINED} indicates optional field is not set.
     *
     * @return <code>XMLGregorianCalendar</code> created from parameter values.
     *
     * @see DatatypeConstants#FIELD_UNDEFINED
     *
     * @throws IllegalArgumentException if any parameter is outside value
     * constraints for the field as specified in
     * <a href="#datetimefieldmapping">date/time field mapping table</a>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public XMLGregorianCalendarImpl(GregorianCalendar cal) {

        /**
         * <p>Convert a <code>java.util.GregorianCalendar</code> to XML Schema 1.0
         * representation.</p>
         *
         * <table border="2" rules="all" cellpadding="2">
         *   <thead>
         *     <tr>
         *       <th align="center" colspan="2">
         *          Field by Field Conversion from
         *          <code>java.util.GregorianCalendar</code> to this class
         *       </th>
         *     </tr>
         *   </thead>
         *   <tbody>
         *     <tr>
         *        <th><code>javax.xml.datatype.XMLGregorianCalendar</code> field</th>
         *        <th><code>java.util.GregorianCalendar</code> field</th>
         *     </tr>
         *     <tr>
         *       <th>{@link #setYear(int)}</th>
         *       <th><code>ERA == GregorianCalendar.BC ? -YEAR : YEAR</code></th>
         *     </tr>
         *     <tr>
         *       <th>{@link #setMonth(int)}</th>
         *       <th><code>MONTH + 1</code></th>
         *     </tr>
         *     <tr>
         *       <th>{@link #setDay(int)}</th>
         *       <th><code>DAY_OF_MONTH</code></th>
         *     </tr>
         *     <tr>
         *       <th>{@link #setTime(int,int,int, BigDecimal)}</th>
         *       <th><code>HOUR_OF_DAY, MINUTE, SECOND, MILLISECOND</code></th>
         *     </tr>
         *     <tr>
         *       <th>{@link #setTimezone(int)}<i>*</i></th>
         *       <th><code>(ZONE_OFFSET + DST_OFFSET) / (60*1000)</code><br/>
         *       <i>(in minutes)</i>
         *       </th>
         *     </tr>
         *   </tbody>
         * </table>
         * <p><i>*</i>conversion loss of information. It is not possible to represent
         * a <code>java.util.GregorianCalendar</code> daylight savings timezone id in the
         * XML Schema 1.0 date/time datatype representation.</p>
         *
         * <p>To compute the return value's <code>TimeZone</code> field,
         * <ul>
         * <li>when <code>this.getTimezone() != DatatypeConstants.FIELD_UNDEFINED</code>,
         * create a <code>java.util.TimeZone</code> with a custom timezone id
         * using the <code>this.getTimezone()</code>.</li>
         * <li>else use the <code>GregorianCalendar</code> default timezone value
         * for the host is defined as specified by
         * <code>java.util.TimeZone.getDefault()</code>.</li></p>
         *
         * @param cal <code>java.util.GregorianCalendar</code> used to create <code>XMLGregorianCalendar</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private XMLGregorianCalendarImpl(
        int year,
        int month,
        int day,
        int hour,
        int minute,
        int second,
                int millisecond,
        int timezone) {

    /**
     * <p>Private constructor of value spaces that a
     * <code>java.util.GregorianCalendar</code> instance would need to convert to an
     * <code>XMLGregorianCalendar</code> instance.</p>
     *
     * <p><code>XMLGregorianCalendar eon</code> and
     * <code>fractionalSecond</code> are set to <code>null</code></p>
     *
     * @param year of <code>XMLGregorianCalendar</code> to be created.
     * @param month of <code>XMLGregorianCalendar</code> to be created.
     * @param day of <code>XMLGregorianCalendar</code> to be created.
     * @param hour of <code>XMLGregorianCalendar</code> to be created.
     * @param minute of <code>XMLGregorianCalendar</code> to be created.
     * @param second of <code>XMLGregorianCalendar</code> to be created.
     * @param millisecond of <code>XMLGregorianCalendar</code> to be created.
     * @param timezone of <code>XMLGregorianCalendar</code> to be created.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
                }

                        /**
                String yearString = "null";
                if (year != null) {
                    yearString = year.toString();
                }
                String fractionalSecondString = "null";
                if (fractionalSecond != null) {
                    fractionalSecondString = fractionalSecond.toString();
                }

                throw new IllegalArgumentException(
                    "year = " + yearString
                    + ", month = " + month
                    + ", day = " + day
                    + ", hour = " + hour
                    + ", minute = " + minute
                    + ", second = " + second
                    + ", fractionalSecond = " + fractionalSecondString
                    + ", timezone = " + timezone
                    + ", is not a valid representation of an XML Gregorian Calendar value."
                );
                */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    protected XMLGregorianCalendarImpl(
        BigInteger year,
        int month,
        int day,
        int hour,
        int minute,
        int second,
        BigDecimal fractionalSecond,
        int timezone) {

    /**
     * <p>Private constructor allowing for complete value spaces allowed by
     * W3C XML Schema 1.0 recommendation for xsd:dateTime and related
     * builtin datatypes. Note that <code>year</code> parameter supports
     * arbitrarily large numbers and fractionalSecond has infinite
     * precision.</p>
     *
     * @param year of <code>XMLGregorianCalendar</code> to be created.
     * @param month of <code>XMLGregorianCalendar</code> to be created.
     * @param day of <code>XMLGregorianCalendar</code> to be created.
     * @param hour of <code>XMLGregorianCalendar</code> to be created.
     * @param minute of <code>XMLGregorianCalendar</code> to be created.
     * @param second of <code>XMLGregorianCalendar</code> to be created.
     * @param fractionalSecond of <code>XMLGregorianCalendar</code> to be created.
     * @param timezone of <code>XMLGregorianCalendar</code> to be created.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public XMLGregorianCalendarImpl() {

    /**
     * <p>Create an instance with all date/time datatype fields set to
     * {@link DatatypeConstants#FIELD_UNDEFINED} or null respectively.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    protected XMLGregorianCalendarImpl(String lexicalRepresentation)

    /**
     * Constructs a new XMLGregorianCalendar object.
     *
     * String parsing documented by {@link #parse(String)}.
     *
     * Returns a non-null valid XMLGregorianCalendar object that holds the
     * value indicated by the lexicalRepresentation parameter.
     *
     * @param lexicalRepresentation
     *      Lexical representation of one the eight
     *      XML Schema date/time datatypes.
     * @throws IllegalArgumentException
     *      If the given string does not conform as documented in
     *      {@link #parse(String)}.
     * @throws NullPointerException
     *      If the given string is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public static final XMLGregorianCalendar LEAP_YEAR_DEFAULT =

    /**
     * <p>Use as a template for default field values when
     * converting to a {@link GregorianCalendar}, set to a leap
     * year date of January 1, 0400 at midnight.</p>
     *
     * <p>Fields that are optional for an <code>xsd:dateTime</code> instances are defaulted to not being set to any value.
     * <code>XMLGregorianCalendar</code> fields millisecond, fractional second and timezone return the value indicating
     * that the field is not set, {@link DatatypeConstants#FIELD_UNDEFINED} for millisecond and timezone
     * and <code>null</code> for fractional second.</p>
     *
     * @see #toGregorianCalendar(TimeZone, Locale, XMLGregorianCalendar)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private static final long serialVersionUID = 1L;

    /**
     * <p>Stream Unique Identifier.</p>
     *
     * <p>TODO: Serialization should use the XML string representation as
     * the serialization format to ensure future compatibility.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private static final String FIELD_NAME[] = {

    /**
     * field names indexed by YEAR..TIMEZONE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private static final int TIMEZONE = 7;

    /**
     * Timezone index for MIN_ and MAX_FIELD_VALUES
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private static final int MILLISECOND = 6;

    /**
     * Second index for MIN_ and MAX_FIELD_VALUES.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private static final int SECOND = 5;

    /**
     * Second index for MIN_ and MAX_FIELD_VALUES.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private static final int MINUTE = 4;

    /**
     * Minute index for MIN_ and MAX_FIELD_VALUES.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private static final int HOUR   = 3;

    /**
     * Hour index for MIN_ and MAX_FIELD_VALUES.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private static final int DAY    = 2;

    /**
     * Day index for MIN_ and MAX_FIELD_VALUES.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private static final int MONTH  = 1;

    /**
     * Month index for MIN_ and MAX_FIELD_VALUES.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private static final int YEAR   = 0;

    /**
     * Year index for MIN_ and MAX_FIELD_VALUES.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private static final Date PURE_GREGORIAN_CHANGE =

    /**
     *   <p>Obtain a pure Gregorian Calendar by calling
     *   GregorianCalendar.setChange(PURE_GREGORIAN_CHANGE). </p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private static final BigInteger BILLION = new BigInteger("1000000000");

    /**
     * <p>Constant to represent a billion.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private BigDecimal fractionalSecond = null;

    /**
     * <p>Fractional second of this <code>XMLGregorianCalendar</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private int second = DatatypeConstants.FIELD_UNDEFINED ;

    /**
     * <p>Second of this <code>XMLGregorianCalendar</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private int minute = DatatypeConstants.FIELD_UNDEFINED;

    /**
     * <p>Minute of this <code>XMLGregorianCalendar</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private int hour = DatatypeConstants.FIELD_UNDEFINED;

    /**
     * <p>Hour of this <code>XMLGregorianCalendar</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private int timezone = DatatypeConstants.FIELD_UNDEFINED;

    /**
     * <p>Timezone of this <code>XMLGregorianCalendar</code> in minutes.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private int day = DatatypeConstants.FIELD_UNDEFINED;

    /**
     * <p>Day of this <code>XMLGregorianCalendar</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private int month = DatatypeConstants.FIELD_UNDEFINED;

    /**
     * <p>Month of this <code>XMLGregorianCalendar</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private int year = DatatypeConstants.FIELD_UNDEFINED;

    /**
     * <p>Year of this <code>XMLGregorianCalendar</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private BigInteger eon = null;

    /**
     * <p>Eon of this <code>XMLGregorianCalendar</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
public class XMLGregorianCalendarImpl

/**
 * <p>Representation for W3C XML Schema 1.0 date/time datatypes.
 * Specifically, these date/time datatypes are
 * {@link DatatypeConstants#DATETIME dateTime},
 * {@link DatatypeConstants#TIME time},
 * {@link DatatypeConstants#DATE date},
 * {@link DatatypeConstants#GYEARMONTH gYearMonth},
 * {@link DatatypeConstants#GMONTHDAY gMonthDay},
 * {@link DatatypeConstants#GYEAR gYear},
 * {@link DatatypeConstants#GMONTH gMonth} and
 * {@link DatatypeConstants#GDAY gDay}
 * defined in the XML Namespace
 * <code>"http://www.w3.org/2001/XMLSchema"</code>.
 * These datatypes are normatively defined in
 * <a href="http://www.w3.org/TR/xmlschema-2/#dateTime">W3C XML Schema 1.0 Part 2, Section 3.2.7-14</a>.</p>
 *
 * <p>The table below defines the mapping between XML Schema 1.0
 * date/time datatype fields and this class' fields. It also summarizes
 * the value constraints for the date and time fields defined in
 * <a href="http://www.w3.org/TR/xmlschema-2/#isoformats">W3C XML Schema 1.0 Part 2, Appendix D,
 * <i>ISO 8601 Date and Time Formats</i></a>.</p>
 *
 * <a name="datetimefieldsmapping"/>
 * <table border="2" rules="all" cellpadding="2">
 *   <thead>
 *     <tr>
 *       <th align="center" colspan="3">
 *         Date/time datatype field mapping between XML Schema 1.0 and Java representation
 *       </th>
 *     </tr>
 *   </thead>
 *   <tbody>
 *     <tr>
 *       <th>XML Schema 1.0<br/>
 *           datatype<br/>
 *            field</th>
 *       <th>Related<br/>XMLGregorianCalendar<br/>Accessor(s)</th>
 *       <th>Value Range</th>
 *     </tr>
 *     <a name="datetimefield-year"/>
 *     <tr>
 *       <td> year </td>
 *       <td> {@link #getYear()} + {@link #getEon()} or<br/>
 *            {@link #getEonAndYear}
 *       </td>
 *       <td> <code>getYear()</code> is a value between -(10^9-1) to (10^9)-1
 *            or {@link DatatypeConstants#FIELD_UNDEFINED}.<br/>
 *            {@link #getEon()} is high order year value in billion of years.<br/>
 *            <code>getEon()</code> has values greater than or equal to (10^9) or less than or equal to -(10^9).
 *            A value of null indicates field is undefined.</br>
 *            Given that <a href="http://www.w3.org/2001/05/xmlschema-errata#e2-63">XML Schema 1.0 errata</a> states that the year zero
 *            will be a valid lexical value in a future version of XML Schema,
 *            this class allows the year field to be set to zero. Otherwise,
 *            the year field value is handled exactly as described
 *            in the errata and [ISO-8601-1988]. Note that W3C XML Schema 1.0
 *            validation does not allow for the year field to have a value of zero.
 *            </td>
 *     </tr>
 *     <a name="datetimefield-month"/>
 *     <tr>
 *       <td> month </td>
 *       <td> {@link #getMonth()} </td>
 *       <td> 1 to 12 or {@link DatatypeConstants#FIELD_UNDEFINED} </td>
 *     </tr>
 *     <a name="datetimefield-day"/>
 *     <tr>
 *       <td> day </td>
 *       <td> {@link #getDay()} </td>
 *       <td> Independent of month, max range is 1 to 31 or {@link DatatypeConstants#FIELD_UNDEFINED}.<br/>
 *            The normative value constraint stated relative to month
 *            field's value is in <a href="http://www.w3.org/TR/xmlschema-2/#isoformats">W3C XML Schema 1.0 Part 2, Appendix D</a>.
 *       </td>
 *     </tr>
 *     <a name="datetimefield-hour"/>
 *     <tr>
 *       <td> hour </td>
 *       <td> {@link #getHour()} </td>
 *       <td>
 *         0 to 23 or {@link DatatypeConstants#FIELD_UNDEFINED}.
 *         An hour value of 24 is allowed to be set in the lexical space provided the minute and second
 *         field values are zero. However, an hour value of 24 is not allowed in value space and will be
 *         transformed to represent the value of the first instance of the following day as per
 *         <a href="http://www.w3.org/TR/xmlschema-2/#built-in-primitive-datatypes">
 *         XML Schema Part 2: Datatypes Second Edition, 3.2 Primitive datatypes</a>.
 *       </td>
 *     </tr>
 *     <a name="datetimefield-minute"/>
 *     <tr>
 *       <td> minute </td>
 *       <td> {@link #getMinute()} </td>
 *       <td> 0 to 59 or {@link DatatypeConstants#FIELD_UNDEFINED} </td>
 *     </tr>
 *     <a name="datetimefield-second"/>
 *     <tr>
 *       <td>second</td>
 *       <td>
 *         {@link #getSecond()} + {@link #getMillisecond()}/1000 or<br/>
 *         {@link #getSecond()} + {@link #getFractionalSecond()}
 *       </td>
 *       <td>
 *         {@link #getSecond()} from 0 to 60 or {@link DatatypeConstants#FIELD_UNDEFINED}.<br/>
 *         <i>(Note: 60 only allowable for leap second.)</i><br/>
 *         {@link #getFractionalSecond()} allows for infinite precision over the range from 0.0 to 1.0 when
 *         the {@link #getSecond()} is defined.<br/>
 *         <code>FractionalSecond</code> is optional and has a value of <code>null</code> when it is undefined.<br />
 *            {@link #getMillisecond()} is the convenience
 *            millisecond precision of value of {@link #getFractionalSecond()}.
 *       </td>
 *     </tr>
 *     <tr id="datetimefield-timezone">
 *       <td> timezone </td>
 *       <td> {@link #getTimezone()} </td>
 *       <td> Number of minutes or {@link DatatypeConstants#FIELD_UNDEFINED}.
 *         Value range from -14 hours (-14 * 60 minutes) to 14 hours (14 * 60 minutes).
 *       </td>
 *     </tr>
 *   </tbody>
 *  </table>
 *
 * <p>All maximum value space constraints listed for the fields in the table
 * above are checked by factory methods, setter methods and parse methods of
 * this class. <code>IllegalArgumentException</code> is thrown when
 * parameter's value is outside the maximum value constraint for the field.
 * Validation checks, for example, whether days in month should be
 * limited to 29, 30 or 31 days, that are dependent on the values of other
 * fields are not checked by these methods.
 * </p>
 *
 * <p>The following operations are defined for this class:
 * <ul>
 *   <li>factory methods to create instances</li>
 *   <li>accessors/mutators for independent date/time fields</li>
 *   <li>conversion between this class and W3C XML Schema 1.0 lexical representation</li>
 *   <li>conversion between this class and <code>java.util.GregorianCalendar</code></li>
 *   <li>partial order relation comparator method, {@link #compare(XMLGregorianCalendar)}</li>
 *   <li>{@link #equals(Object)} defined relative to {@link #compare(XMLGregorianCalendar)}.</li>
 *   <li> addition operation with {@link javax.xml.datatype.Duration}.
 * instance as defined in <a href="http://www.w3.org/TR/xmlschema-2/#adding-durations-to-dateTimes">
 * W3C XML Schema 1.0 Part 2, Appendix E, <i>Adding durations to dateTimes</i></a>.</li>
 * </ul>
 * </p>
 *
 * @author <a href="mailto:Kohsuke.Kawaguchi@Sun.com">Kohsuke Kawaguchi</a>
 * @author <a href="mailto:Joseph.Fialli@Sun.com">Joseph Fialli</a>
 * @author <a href="mailto:Sunitha.Reddy@Sun.com">Sunitha Reddy</a>
 * @version $Revision: 1.14 $, $Date: 2010-11-10 07:41:41 $
 * @see javax.xml.datatype.Duration
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public void reset() {

    /** <p><code>reset()</code> is designed to allow the reuse of existing
     * <code>XMLGregorianCalendar</code>s thus saving resources associated
     *  with the creation of new <code>XMLGregorianCalendar</code>s.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    static BigInteger sanitize(Number value, int signum) {

    /**
     * Compute <code>value*signum</code> where value==null is treated as
     * value==0.
     * @return non-null {@link BigInteger}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private int print4Number( char[] out, int bufptr, int number ) {

    /**
     * Prints an int as four digits into the buffer.
     *
     * @param number
     *      Number to be printed. Must be positive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private int print2Number( char[] out, int bufptr, int number ) {

    /**
     * Prints an int as two digits into the buffer.
     *
     * @param number
     *      Number to be printed. Must be positive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private String format( String format ) {

    /**
     * Prints this object according to the format specification.
     *
     * <p>
     * I wrote a custom format method for a particular format string to
     * see if it improves the performance, but it didn't. So this interpreting
     * approach isn't too bad.
     *
     * <p>
     * StringBuffer -> StringBuilder change had a very visible impact.
     * It almost cut the execution time to half, but unfortunately we can't use it
     * because we need to run on JDK 1.3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
        public void parse() throws IllegalArgumentException {

        /**
         * <p>Parse a formated <code>String</code> into an <code>XMLGregorianCalendar</code>.</p>
         *
         * <p>If <code>String</code> is not formated as a legal <code>XMLGregorianCalendar</code> value,
         * an <code>IllegalArgumentException</code> is thrown.</p>
         *
         * @throws IllegalArgumentException If <code>String</code> is not formated as a legal <code>XMLGregorianCalendar</code> value.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public void clear() {

    /**
     * <p>Unset all fields to undefined.</p>
     *
     * <p>Set all int fields to {@link DatatypeConstants#FIELD_UNDEFINED} and reference fields
     * to null.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
   public Object clone() {

    /**
     * <p>Creates and returns a copy of this object.</p>
     *
     * @return copy of this <code>Object</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public TimeZone getTimeZone(int defaultZoneoffset) {

    /**
     * <p>Returns a <code>java.util.TimeZone</code> for this class.</p>
     *
     * <p>If timezone field is defined for this instance,
     * returns TimeZone initialized with custom timezone id
     * of zoneoffset. If timezone field is undefined,
     * try the defaultZoneoffset that was passed in.
     * If defaultZoneoffset is DatatypeConstants.FIELD_UNDEFINED, return
     * default timezone for this host.
     * (Same default as java.util.GregorianCalendar).</p>
     *
     * @param defaultZoneoffset default zoneoffset if this zoneoffset is
     * {@link DatatypeConstants#FIELD_UNDEFINED}.
     *
     * @return TimeZone for this.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public GregorianCalendar toGregorianCalendar(TimeZone timezone,
                                                 Locale aLocale,
                                                 XMLGregorianCalendar defaults) {

    /**
     * <p>Convert <code>this</code> along with provided parameters
     * to <code>java.util.GregorianCalendar</code> instance.</p>
     *
     * <p> Since XML Schema 1.0 date/time datetypes has no concept of
     * timezone ids or daylight savings timezone ids, this conversion operation
     * allows the user to explicitly specify one with
     * <code>timezone</code> parameter.</p>
     *
     * <p>To compute the return value's <code>TimeZone</code> field,
     * <ul>
     * <li>when parameter <code>timeZone</code> is non-null,
     * it is the timezone field.</li>
     * <li>else when <code>this.getTimezone() != DatatypeConstants.FIELD_UNDEFINED</code>,
     * create a <code>java.util.TimeZone</code> with a custom timezone id
     * using the <code>this.getTimezone()</code>.</li>
     * <li>else when <code>defaults.getTimezone() != DatatypeConstants.FIELD_UNDEFINED</code>,
     * create a <code>java.util.TimeZone</code> with a custom timezone id
     * using <code>defaults.getTimezone()</code>.</li>
     * <li>else use the <code>GregorianCalendar</code> default timezone value
     * for the host is definedas specified by
     * <code>java.util.TimeZone.getDefault()</code>.</li></p>
     *
     * <p>To ensure consistency in conversion implementations, the new
     * <code>GregorianCalendar</code> should be instantiated in following
     * manner.
     * <ul>
     *   <li>Create a new <code>java.util.GregorianCalendar(TimeZone,
     *       Locale)</code> with TimeZone set as specified above and the
     *       <code>Locale</code> parameter.
     *   </li>
     *   <li>Initialize all GregorianCalendar fields by calling {(@link GegorianCalendar#clear()}.</li>
     *   <li>Obtain a pure Gregorian Calendar by invoking
     *   <code>GregorianCalendar.setGregorianChange(
     *   new Date(Long.MIN_VALUE))</code>.</li>
     *   <li>Its fields ERA, YEAR, MONTH, DAY_OF_MONTH, HOUR_OF_DAY,
     *       MINUTE, SECOND and MILLISECOND are set using the method
     *       <code>Calendar.set(int,int)</code></li>
     * </ul>
     *
     * @param timezone provide Timezone. <code>null</code> is a legal value.
     * @param aLocale  provide explicit Locale. Use default GregorianCalendar locale if
     *                 value is <code>null</code>.
     * @param defaults provide default field values to use when corresponding
     *                 field for this instance is DatatypeConstants.FIELD_UNDEFINED or null.
     *                 If <code>defaults</code>is <code>null</code> or a field
     *                 within the specified <code>defaults</code> is undefined,
     *                 just use <code>java.util.GregorianCalendar</code> defaults.
     * @return a java.util.GregorianCalendar conversion of this instance.
     *
     * @see #LEAP_YEAR_DEFAULT
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private Locale getDefaultLocale() {

    /**
     *
     * @return default locale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
        Locale locale = getDefaultLocale();

        /** Use the following instead for JDK7 only:
         * Locale locale = Locale.getDefault(Locale.Category.FORMAT);
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public java.util.GregorianCalendar toGregorianCalendar() {

    /**
     * <p>Convert <code>this</code> to <code>java.util.GregorianCalendar</code>.</p>
     *
     * <p>When <code>this</code> instance has an undefined field, this
     * conversion relies on the <code>java.util.GregorianCalendar</code> default
     * for its corresponding field. A notable difference between
     * XML Schema 1.0 date/time datatypes and <code>java.util.GregorianCalendar</code>
     * is that Timezone value is optional for date/time datatypes and it is
     * a required field for <code>java.util.GregorianCalendar</code>. See javadoc
     * for <code>java.util.TimeZone.getDefault()</code> on how the default
     * is determined. To explicitly specify the <code>TimeZone</code>
     * instance, see
     * {@link #toGregorianCalendar(TimeZone, Locale, XMLGregorianCalendar)}.</p>
     *
     * <table border="2" rules="all" cellpadding="2">
     *   <thead>
     *     <tr>
     *       <th align="center" colspan="2">
     *          Field by Field Conversion from this class to
     *          <code>java.util.GregorianCalendar</code>
     *       </th>
     *     </tr>
     *   </thead>
     *   <tbody>
     *     <tr>
     *        <th><code>java.util.GregorianCalendar</code> field</th>
     *        <th><code>javax.xml.datatype.XMLGregorianCalendar</code> field</th>
     *     </tr>
     *     <tr>
     *       <th><code>ERA</code></th>
     *       <th>{@link #getEonAndYear()}<code>.signum() < 0 ? GregorianCalendar.BC : GregorianCalendar.AD</code></th>
     *     </tr>
     *     <tr>
     *       <th><code>YEAR</code></th>
     *       <th>{@link #getEonAndYear()}<code>.abs().intValue()</code><i>*</i></th>
     *     </tr>
     *     <tr>
     *       <th><code>MONTH</code></th>
     *       <th>{@link #getMonth()}<code> - 1</code></th>
     *     </tr>
     *     <tr>
     *       <th><code>DAY_OF_MONTH</code></th>
     *       <th>{@link #getDay()}</th>
     *     </tr>
     *     <tr>
     *       <th><code>AM_PM</code></th>
     *       <th>{@link #getHour()} < 12 : Calendar.AM : Calendar.PM</th>
     *     </tr>
     *     <tr>
     *       <th><code>HOUR_OF_DAY</code></th>
     *       <th>{@link #getHour()}</th>
     *     </tr>
     *     <tr>
     *       <th><code>MINUTE</code></th>
     *       <th>{@link #getMinute()}</th>
     *     </tr>
     *     <tr>
     *       <th><code>SECOND</code></th>
     *       <th>{@link #getSecond()}</th>
     *     </tr>
     *     <tr>
     *       <th><code>MILLISECOND</code></th>
     *       <th>get millisecond order from {@link #getFractionalSecond()}<i>*</i> </th>
     *     </tr>
     *     <tr>
     *       <th><code>GregorianCalendar.setTimeZone(TimeZone)</code></th>
     *       <th>{@link #getTimezone()} formatted into Custom timezone id</th>
     *     </tr>
     *   </tbody>
     * </table>
     * <i>*</i> designates possible loss of precision during the conversion due
     * to source datatype having higer precison than target datatype.
     *
     * <p>To ensure consistency in conversion implementations, the new
     * <code>GregorianCalendar</code> should be instantiated in following
     * manner.
     * <ul>
     *   <li>Using <code>timeZone</code> value as defined above, create a new
     * <code>java.util.GregorianCalendar(timeZone,Locale.getDefault())</code>.
     *   </li>
     *   <li>Initialize all GregorianCalendar fields by calling {(@link GegorianCalendar#clear()}.</li>
     *   <li>Obtain a pure Gregorian Calendar by invoking
     *   <code>GregorianCalendar.setGregorianChange(
     *   new Date(Long.MIN_VALUE))</code>.</li>
     *   <li>Its fields ERA, YEAR, MONTH, DAY_OF_MONTH, HOUR_OF_DAY,
     *       MINUTE, SECOND and MILLISECOND are set using the method
     *       <code>Calendar.set(int,int)</code></li>
     * </ul>
     * </p>
     *
     * @see #toGregorianCalendar(java.util.TimeZone, java.util.Locale, XMLGregorianCalendar)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public void add(Duration duration) {

    /**
     * <p>Add <code>duration</code> to this instance.<\p>
     *
     * <p>The computation is specified in
     * <a href="http://www.w3.org/TR/xmlschema-2/#adding-durations-to-dateTimes">XML Schema 1.0 Part 2, Appendix E,
     * <i>Adding durations to dateTimes</i>></a>.
     * <a href="#datetimefieldsmapping">date/time field mapping table</a>
     * defines the mapping from XML Schema 1.0 <code>dateTime</code> fields
     * to this class' representation of those fields.</p>
     *
     * @param duration Duration to add to this <code>XMLGregorianCalendar</code>.
     *
     * @throws NullPointerException  when <code>duration</code> parameter is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public boolean isValid() {

    /**
     * Validate instance by <code>getXMLSchemaType()</code> constraints.
     * @return true if data values are valid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public QName getXMLSchemaType() {

    /**
     * <p>Return the name of the XML Schema date/time type that this instance
     * maps to. Type is computed based on fields that are set.</p>
     *
     * <table border="2" rules="all" cellpadding="2">
     *   <thead>
     *     <tr>
     *       <th align="center" colspan="7">
     *         Required fields for XML Schema 1.0 Date/Time Datatypes.<br/>
     *         <i>(timezone is optional for all date/time datatypes)</i>
     *       </th>
     *     </tr>
     *   </thead>
     *   <tbody>
     *     <tr>
     *       <td>Datatype</td>
     *       <td>year</td>
     *       <td>month</td>
     *       <td>day</td>
     *       <td>hour</td>
     *       <td>minute</td>
     *       <td>second</td>
     *     </tr>
     *     <tr>
     *       <td>{@link DatatypeConstants#DATETIME}</td>
     *       <td>X</td>
     *       <td>X</td>
     *       <td>X</td>
     *       <td>X</td>
     *       <td>X</td>
     *       <td>X</td>
     *     </tr>
     *     <tr>
     *       <td>{@link DatatypeConstants#DATE}</td>
     *       <td>X</td>
     *       <td>X</td>
     *       <td>X</td>
     *       <td></td>
     *       <td></td>
     *       <td></td>
     *     </tr>
     *     <tr>
     *       <td>{@link DatatypeConstants#TIME}</td>
     *       <td></td>
     *       <td></td>
     *       <td></td>
     *       <td>X</td>
     *       <td>X</td>
     *       <td>X</td>
     *     </tr>
     *     <tr>
     *       <td>{@link DatatypeConstants#GYEARMONTH}</td>
     *       <td>X</td>
     *       <td>X</td>
     *       <td></td>
     *       <td></td>
     *       <td></td>
     *       <td></td>
     *     </tr>
     *     <tr>
     *       <td>{@link DatatypeConstants#GMONTHDAY}</td>
     *       <td></td>
     *       <td>X</td>
     *       <td>X</td>
     *       <td></td>
     *       <td></td>
     *       <td></td>
     *     </tr>
     *     <tr>
     *       <td>{@link DatatypeConstants#GYEAR}</td>
     *       <td>X</td>
     *       <td></td>
     *       <td></td>
     *       <td></td>
     *       <td></td>
     *       <td></td>
     *     </tr>
     *     <tr>
     *       <td>{@link DatatypeConstants#GMONTH}</td>
     *       <td></td>
     *       <td>X</td>
     *       <td></td>
     *       <td></td>
     *       <td></td>
     *       <td></td>
     *     </tr>
     *     <tr>
     *       <td>{@link DatatypeConstants#GDAY}</td>
     *       <td></td>
     *       <td></td>
     *       <td>X</td>
     *       <td></td>
     *       <td></td>
     *       <td></td>
     *     </tr>
     *   </tbody>
     * </table>
     *
     * @throws java.lang.IllegalStateException if the combination of set fields
     *    does not match one of the eight defined XML Schema builtin
     *    date/time datatypes.
     * @return One of the following class constants:
     *   {@link DatatypeConstants#DATETIME},
     *   {@link DatatypeConstants#TIME},
     *   {@link DatatypeConstants#DATE},
     *   {@link DatatypeConstants#GYEARMONTH},
     *   {@link DatatypeConstants#GMONTHDAY},
     *   {@link DatatypeConstants#GYEAR},
     *   {@link DatatypeConstants#GMONTH} or
     *   {@link DatatypeConstants#GDAY}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public String toXMLFormat() {

    /**
     * <p>Return the lexical representation of <code>this</code> instance.
     * The format is specified in
     * <a href="http://www.w3.org/TR/xmlschema-2/#dateTime-order">XML Schema 1.0 Part 2, Section 3.2.[7-14].1,
     * <i>Lexical Representation</i>".</a></p>
     *
     * <p>Specific target lexical representation format is determined by
     * {@link #getXMLSchemaType()}.</p>
     *
     * @return XML, as <code>String</code>, representation of this <code>XMLGregorianCalendar</code>
     *
     * @throws java.lang.IllegalStateException if the combination of set fields
     *    does not match one of the eight defined XML Schema builtin date/time datatypes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public static XMLGregorianCalendar parse(String lexicalRepresentation) {

    /**
     * <p>Constructs a new XMLGregorianCalendar object by
     * parsing its lexical string representation as defined in
     * <a href="http://www.w3.org/TR/xmlschema-2/#dateTime-order">XML Schema 1.0 Part 2, Section 3.2.[7-14].1,
     * <i>Lexical Representation</i>.</a></p>
     *
     * <p>The string representation may not have any leading and trailing whitespaces.</p>
     *
     * <p>The parsing is done field by field so that
     * the following holds for any lexically correct string x:</p>
     * <pre>
     * new XMLGregorianCalendar(x).toXMLFormat().equals(x)
     * </pre>
     * Except for the noted lexical/canonical representation mismatches
     * listed in <a href="http://www.w3.org/2001/05/xmlschema-errata#e2-45">
     * XML Schema 1.0 errata, Section 3.2.7.2</a>.
     *
     * <p>Returns a non-null valid XMLGregorianCalendar object that holds the value
     * indicated by the lexicalRepresentation parameter.</p>
     *
     * @param lexicalRepresentation Lexical representation of one the 8 XML Schema calendar datatypes.
     *
     * @return <code>XMLGregorianCalendar</code> created from parsing <code>lexicalRepresentation</code> parameter.
     *
     * @throws IllegalArgumentException
     *      If the given string does not conform to the aforementioned
     *      specification.
     * @throws NullPointerException
     *      If the given string is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public int hashCode() {

    /**
     * <p>Returns a hash code consistent with the definition of the equals method.</p>
     *
     * @return hash code of this object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public boolean equals(Object obj) {

    /**
     * <p>Indicates whether parameter <code>obj</code> is "equal to" this one.</p>
     *
     * @param obj to compare.
     *
     * @return <code>true</code> when <code>compare(this,(XMLGregorianCalendar)obj) == EQUAL.</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private static int compareField(int Pfield, int Qfield) {

    /**
     * <p>Implement Step B from
     * http://www.w3.org/TR/xmlschema-2/#dateTime-order.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private static int internalCompare(XMLGregorianCalendar P,
                                       XMLGregorianCalendar Q) {

    /**
     *
     *  <p>Implements Step B from http://www.w3.org/TR/xmlschema-2/#dateTime-order </p>
     * @param P calendar instance with normalized timezone offset or
     *          having same timezone as Q
     * @param Q calendar instance with normalized timezone offset or
     *          having same timezone as P
     *
     * @return result of comparing P and Q, value of
     *   {@link DatatypeConstants#EQUAL},
     *   {@link DatatypeConstants#LESSER},
     *   {@link DatatypeConstants#GREATER} or
     *   {@link DatatypeConstants#INDETERMINATE}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private XMLGregorianCalendar normalizeToTimezone(int timezone) {

        /**
         * <p>Normalize this instance to UTC.</p>
         *
         * <p>2000-03-04T23:00:00+03:00 normalizes to 2000-03-04T20:00:00Z</p>
         * <p>Implements W3C XML Schema Part 2, Section 3.2.7.3 (A).</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public XMLGregorianCalendar normalize() {

    /**
     * <p>Normalize this instance to UTC.</p>
     *
     * <p>2000-03-04T23:00:00+03:00 normalizes to 2000-03-04T20:00:00Z</p>
     * <p>Implements W3C XML Schema Part 2, Section 3.2.7.3 (A).</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public int compare(XMLGregorianCalendar rhs) {

    /**
     * <p>Compare two instances of W3C XML Schema 1.0 date/time datatypes
     * according to partial order relation defined in
     * <a href="http://www.w3.org/TR/xmlschema-2/#dateTime-order">W3C XML Schema 1.0 Part 2, Section 3.2.7.3,
     * <i>Order relation on dateTime</i></a>.</p>
     *
     * <p><code>xsd:dateTime</code> datatype field mapping to accessors of
     * this class are defined in
     * <a href="#datetimefieldmapping">date/time field mapping table</a>.</p>
     *
     * @param rhs instance of <code>XMLGregorianCalendar</code> to compare
     *
     * @return the relationship between <code>lhs</code> and <code>rhs</code> as
     *   {@link DatatypeConstants#LESSER},
     *   {@link DatatypeConstants#EQUAL},
     *   {@link DatatypeConstants#GREATER} or
     *   {@link DatatypeConstants#INDETERMINATE}.
     *
     * @throws NullPointerException if <code>lhs</code> or <code>rhs</code>
     * parameters are null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public void setTime(int hour, int minute, int second, int millisecond) {

    /**
     * <p>Set time as one unit, including optional milliseconds.</p>
     *
     * @param hour value constraints are summarized in
     * <a href="#datetimefield-hour">hour field of date/time field mapping table</a>.
     * @param minute value constraints are summarized in
     * <a href="#datetimefield-minute">minute field of date/time field mapping table</a>.
     * @param second value constraints are summarized in
     * <a href="#datetimefield-second">second field of date/time field mapping table</a>.
     * @param millisecond value of {@link DatatypeConstants#FIELD_UNDEFINED} indicates this
     *                    optional field is not set.
     *
     * @throws IllegalArgumentException if any parameter is
     * outside value constraints for the field as specified in
     * <a href="#datetimefieldmapping">date/time field mapping table</a>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public void setTime(
            int hour,
            int minute,
            int second,
            BigDecimal fractional) {

    /**
     * <p>Set time as one unit, including the optional infinite precison
     * fractional seconds.</p>
     *
     * @param hour value constraints are summarized in
     * <a href="#datetimefield-hour">hour field of date/time field mapping table</a>.
     * @param minute value constraints are summarized in
     * <a href="#datetimefield-minute">minute field of date/time field mapping table</a>.
     * @param second value constraints are summarized in
     * <a href="#datetimefield-second">second field of date/time field mapping table</a>.
     * @param fractional value of <code>null</code> indicates this optional
     *                   field is not set.
     *
     * @throws IllegalArgumentException if any parameter is
     * outside value constraints for the field as specified in
     * <a href="#datetimefieldmapping">date/time field mapping table</a>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public void setTime(int hour, int minute, int second) {

    /**
     * <p>Set time as one unit.</p>
     *
     * @param hour value constraints are summarized in
     * <a href="#datetimefield-hour">hour field of date/time field mapping table</a>.
     * @param minute value constraints are summarized in
     * <a href="#datetimefield-minute">minute field of date/time field mapping table</a>.
     * @param second value constraints are summarized in
     * <a href="#datetimefield-second">second field of date/time field mapping table</a>.
     *
     * @see #setTime(int, int, int, BigDecimal)
     *
     * @throws IllegalArgumentException if any parameter is
     * outside value constraints for the field as specified in
     * <a href="#datetimefieldmapping">date/time field mapping table</a>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public void setTimezone(int offset) {

    /**
     * <p>Set the number of minutes in the timezone offset.</p>
     *
     * <p>Unset this field by invoking the setter with a parameter value of {@link DatatypeConstants#FIELD_UNDEFINED}.</p>
     *
     * @param offset value constraints summarized in <a href="#datetimefield-timezone">
     *   timezone field of date/time field mapping table</a>.
     *
     * @throws IllegalArgumentException if <code>offset</code> parameter is
     * outside value constraints for the field as specified in
     * <a href="#datetimefieldmapping">date/time field mapping table</a>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public void setDay(int day) {

    /**
     * <p>Set days in month.</p>
     *
     * <p>Unset this field by invoking the setter with a parameter value of {@link DatatypeConstants#FIELD_UNDEFINED}.</p>
     *
     * @param day value constraints summarized in <a href="#datetimefield-day">day field of date/time field mapping table</a>.
     *
     * @throws IllegalArgumentException if <code>day</code> parameter is
     * outside value constraints for the field as specified in
     * <a href="#datetimefieldmapping">date/time field mapping table</a>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public void setMonth(int month) {

    /**
     * <p>Set month.</p>
     *
     * <p>Unset this field by invoking the setter with a parameter value of {@link DatatypeConstants#FIELD_UNDEFINED}.</p>
     *
     * @param month value constraints summarized in <a href="#datetimefield-month">month field of date/time field mapping table</a>.
     *
     * @throws IllegalArgumentException if <code>month</code> parameter is
     * outside value constraints for the field as specified in
     * <a href="#datetimefieldmapping">date/time field mapping table</a>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private void setEon(BigInteger eon) {

    /**
     * <p>Set high order part of XSD <code>dateTime</code> year field.</p>
     *
     * <p>Unset this field by invoking the setter with a parameter value of
     * <code>null</code>.</p>
     *
     * @param eon value constraints summarized in <a href="#datetimefield-year">year field of date/time field mapping table</a>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public void setYear(int year) {

    /**
     * <p>Set year of XSD <code>dateTime</code> year field.</p>
     *
     * <p>Unset this field by invoking the setter with a parameter value of
     * {@link DatatypeConstants#FIELD_UNDEFINED}.</p>
     *
     * <p>Note: if the absolute value of the <code>year</code> parameter
     * is less than 10^9, the eon component of the XSD year field is set to
     * <code>null</code> by this method.</p>
     *
     * @param year value constraints are summarized in <a href="#datetimefield-year">year field of date/time field mapping table</a>.
     *   If year is {@link DatatypeConstants#FIELD_UNDEFINED}, then eon is set to <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public void setYear(BigInteger year) {

    /**
     * <p>Set low and high order component of XSD <code>dateTime</code> year field.</p>
     *
     * <p>Unset this field by invoking the setter with a parameter value of <code>null</code>.</p>
     *
     * @param year value constraints summarized in <a href="#datetimefield-year">year field of date/time field mapping table</a>.
     *
     * @throws IllegalArgumentException if <code>year</code> parameter is
     * outside value constraints for the field as specified in
     * <a href="#datetimefieldmapping">date/time field mapping table</a>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public BigDecimal getFractionalSecond() {

    /**
     * <p>Return fractional seconds.</p>
     *
     * <p><code>null</code> is returned when this optional field is not defined.</p>
     *
     * <p>Value constraints are detailed in
     * <a href="#datetimefield-second">second field of date/time field mapping table</a>.</p>
     *
     * <p>This optional field can only have a defined value when the
     * xs:dateTime second field, represented by ({@link #getSecond()},
     * does not return {@link DatatypeConstants#FIELD_UNDEFINED}).</p>
     *
     * @return fractional seconds  of this <code>XMLGregorianCalendar</code>.
     *
     * @see #getSecond()
     * @see #setTime(int, int, int, BigDecimal)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public int getMillisecond() {

    /**
     * <p>Return millisecond precision of {@link #getFractionalSecond()}.<\p>
     *
     * <p>This method represents a convenience accessor to infinite
     * precision fractional second value returned by
     * {@link #getFractionalSecond()}. The returned value is the rounded
     * down to milliseconds value of
     * {@link #getFractionalSecond()}. When {@link #getFractionalSecond()}
     * returns <code>null</code>, this method must return
     * {@link DatatypeConstants#FIELD_UNDEFINED}.</p>
     *
     * <p>Value constraints for this value are summarized in
     * <a href="#datetimefield-second">second field of date/time field mapping table</a>.</p>
     *
     * @return Millisecond  of this <code>XMLGregorianCalendar</code>.
     *
     * @see #getFractionalSecond()
     * @see #setTime(int, int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private BigDecimal getSeconds() {

    /**
     * @return result of adding second and fractional second field
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public int getSecond() {

    /**
     * <p>Return seconds or {@link DatatypeConstants#FIELD_UNDEFINED}.<\p>
     *
     * <p>Returns {@link DatatypeConstants#FIELD_UNDEFINED} if this field is not defined.
     * When this field is not defined, the optional xs:dateTime
     * fractional seconds field, represented by
     * {@link #getFractionalSecond()} and {@link #getMillisecond()},
     * must not be defined.</p>
     *
     * <p>Value constraints for this value are summarized in
     * <a href="#datetimefield-second">second field of date/time field mapping table</a>.</p>
     *
     * @return Second  of this <code>XMLGregorianCalendar</code>.
     *
     * @see #getFractionalSecond()
     * @see #getMillisecond()
     * @see #setTime(int, int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public int getMinute() {

    /**
     * Return minutes or {@link DatatypeConstants#FIELD_UNDEFINED}.<\p>
     * Returns {@link DatatypeConstants#FIELD_UNDEFINED} if this field is not defined.
     *
     * <p>Value constraints for this value are summarized in
     * <a href="#datetimefield-minute">minute field of date/time field mapping table</a>.</p>
     * @see #setTime(int, int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public int getHour() {

    /**
     * Return hours or {@link DatatypeConstants#FIELD_UNDEFINED}.
     * Returns {@link DatatypeConstants#FIELD_UNDEFINED} if this field is not defined.
     *
     * <p>Value constraints for this value are summarized in
     * <a href="#datetimefield-hour">hour field of date/time field mapping table</a>.</p>
     * @see #setTime(int, int, int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public int getTimezone() {

    /**
     * Return timezone offset in minutes or
     * {@link DatatypeConstants#FIELD_UNDEFINED} if this optional field is not defined.
     *
     * <p>Value constraints for this value are summarized in
     * <a href="#datetimefield-timezone">timezone field of date/time field mapping table</a>.</p>
     *
     * @see #setTimezone(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public int getDay() {

    /**
     * Return day in month or {@link DatatypeConstants#FIELD_UNDEFINED}.</p>
     *
     * <p>Value constraints for this value are summarized in
     * <a href="#datetimefield-day">day field of date/time field mapping table</a>.</p>
     *
     * @see #setDay(int)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public int getMonth() {

    /**
     * <p>Return number of month or {@link DatatypeConstants#FIELD_UNDEFINED}.</p>
     *
     * <p>Value constraints for this value are summarized in
     * <a href="#datetimefield-month">month field of date/time field mapping table</a>.</p>
     *
     * @return year  of this <code>XMLGregorianCalendar</code>.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public BigInteger getEonAndYear() {

    /**
     * <p>Return XML Schema 1.0 dateTime datatype field for
     * <code>year</code>.</p>
     *
     * <p>Value constraints for this value are summarized in
     * <a href="#datetimefield-year">year field of date/time field mapping table</a>.</p>
     *
     * @return sum of <code>eon</code> and <code>BigInteger.valueOf(year)</code>
     * when both fields are defined. When only <code>year</code> is defined,
     * return it. When both <code>eon</code> and <code>year</code> are not
     * defined, return <code>null</code>.
     *
     * @see #getEon()
     * @see #getYear()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public int getYear() {

    /**
     * <p>Return low order component for XML Schema 1.0 dateTime datatype field for
     * <code>year</code> or {@link DatatypeConstants#FIELD_UNDEFINED}.</p>
     *
     * <p>Value constraints for this value are summarized in
     * <a href="#datetimefield-year">year field of date/time field mapping table</a>.</p>
     *
     * @return year  of this <code>XMLGregorianCalendar</code>.
     *
     * @see #getEon()
     * @see #getEonAndYear()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public BigInteger getEon() {

    /**
     * <p>Return high order component for XML Schema 1.0 dateTime datatype field for
     * <code>year</code>.
     * <code>null</code> if this optional part of the year field is not defined.</p>
     *
     * <p>Value constraints for this value are summarized in
     * <a href="#datetimefield-year">year field of date/time field mapping table</a>.</p>
     * @return eon of this <code>XMLGregorianCalendar</code>. The value
     * returned is an integer multiple of 10^9.
     *
     * @see #getYear()
     * @see #getEonAndYear()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public static XMLGregorianCalendar createTime(
        int hours,
        int minutes,
        int seconds,
        int milliseconds,
        int timezone) {

    /**
     * <p>Create a Java instance of XML Schema builtin datatype time.</p>
     *
     * @param hours number of hours
     * @param minutes number of minutes
     * @param seconds number of seconds
     * @param milliseconds number of milliseconds
     * @param timezone offset in minutes. {@link DatatypeConstants#FIELD_UNDEFINED} indicates optional field is not set.
     *
     * @return <code>XMLGregorianCalendar</code> created from parameter values.
     *
     * @see DatatypeConstants#FIELD_UNDEFINED
     *
     * @throws IllegalArgumentException if any parameter is outside value
     * constraints for the field as specified in
     * <a href="#datetimefieldmapping">date/time field mapping table</a>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public static XMLGregorianCalendar createTime(
        int hours,
        int minutes,
        int seconds,
        BigDecimal fractionalSecond,
        int timezone) {

    /**
     * <p>Create a Java instance of XML Schema builtin datatype time.</p>
     *
     * @param hours number of hours
     * @param minutes number of minutes
     * @param seconds number of seconds
     * @param fractionalSecond value of <code>null</code> indicates that this optional field is not set.
     * @param timezone offset in minutes. {@link DatatypeConstants#FIELD_UNDEFINED} indicates optional field is not set.
     *
     * @return <code>XMLGregorianCalendar</code> created from parameter values.
     *
     * @see DatatypeConstants#FIELD_UNDEFINED
     *
     * @throws IllegalArgumentException if any parameter is outside value
     * constraints for the field as specified in
     * <a href="#datetimefieldmapping">date/time field mapping table</a>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public static XMLGregorianCalendar createTime(
        int hours,
        int minutes,
        int seconds,
                int timezone) {

    /**
     * Create a Java instance of XML Schema builtin datatype <code>time</code>.
     * @param hours number of hours
     * @param minutes number of minutes
     * @param seconds number of seconds
     * @param timezone offset in minutes. {@link DatatypeConstants#FIELD_UNDEFINED} indicates optional field is not set.
     *
     * @return <code>XMLGregorianCalendar</code> created from parameter values.
     *
     * @see DatatypeConstants#FIELD_UNDEFINED
     *
     * @throws IllegalArgumentException if any parameter is outside value
     * constraints for the field as specified in
     * <a href="#datetimefieldmapping">date/time field mapping table</a>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public static XMLGregorianCalendar createDate(
        int year,
        int month,
        int day,
        int timezone) {

    /**
     * <p>Create a Java representation of XML Schema builtin datatype <code>date</code> or <code>g*</code>.</p>
     *
     * <p>For example, an instance of <code>gYear</code> can be created invoking this factory
     * with <code>month</code> and <code>day</code> parameters set to
     * {@link DatatypeConstants#FIELD_UNDEFINED}.</p>
     *
     * @param year of <code>XMLGregorianCalendar</code> to be created.
     * @param month of <code>XMLGregorianCalendar</code> to be created.
     * @param day of <code>XMLGregorianCalendar</code> to be created.
     * @param timezone offset in minutes. {@link DatatypeConstants#FIELD_UNDEFINED} indicates optional field is not set.
     *
     * @return <code>XMLGregorianCalendar</code> created from parameter values.
     *
     * @see DatatypeConstants#FIELD_UNDEFINED
     *
     * @throws IllegalArgumentException if any parameter is outside value
     * constraints for the field as specified in
     * <a href="#datetimefieldmapping">date/time field mapping table</a>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public static XMLGregorianCalendar createDateTime(
        int year,
        int month,
        int day,
        int hours,
        int minutes,
        int seconds,
        int milliseconds,
        int timezone) {

    /**
     * <p>Create a Java representation of XML Schema builtin datatype <code>dateTime</code>.
     * All possible fields are specified for this factory method.</p>
     *
     * @param year represents low-order year.
     * @param month of <code>dateTime</code>
     * @param day of <code>dateTime</code>
     * @param hours of <code>dateTime</code>
     * @param minutes of <code>dateTime</code>
     * @param seconds of <code>dateTime</code>
     * @param milliseconds of <code>dateTime</code>. {@link DatatypeConstants#FIELD_UNDEFINED} indicates optional field is not set.
     * @param timezone offset in minutes. {@link DatatypeConstants#FIELD_UNDEFINED} indicates optional field is not set.
     *
     * @return <code>XMLGregorianCalendar</code> created from parameter values.
     *
     * @throws IllegalArgumentException if any parameter is outside value constraints for the field as specified in
     *   <a href="#datetimefieldmapping">date/time field mapping table</a>.
     *
     * @see DatatypeConstants#FIELD_UNDEFINED
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public static XMLGregorianCalendar createDateTime(
        int year,
        int month,
        int day,
        int hour,
        int minute,
        int second) {

    /**
     * <p>Create a Java instance of XML Schema builtin datatype dateTime.</p>
     *
     * @param year represents both high-order eons and low-order year.
     * @param month of <code>dateTime</code>
     * @param day of <code>dateTime</code>
     * @param hour of <code>dateTime</code>
     * @param minute of <code>dateTime</code>
     * @param second of <code>dateTime</code>
     *
     * @return <code>XMLGregorianCalendar</code> created from parameter values.
     *
     * @throws IllegalArgumentException if any parameter is outside value constraints for the field as specified in
     *   <a href="#datetimefieldmapping">date/time field mapping table</a>.
     *
     * @see DatatypeConstants#FIELD_UNDEFINED
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public static XMLGregorianCalendar createDateTime(
        BigInteger year,
        int month,
        int day,
        int hours,
        int minutes,
        int seconds,
        BigDecimal fractionalSecond,
        int timezone) {

    /**
     * <p>Create a Java representation of XML Schema builtin datatype <code>dateTime</code>.
     * All possible fields are specified for this factory method.</p>
     *
     * @param year represents both high-order eons and low-order year.
     * @param month of <code>dateTime</code>
     * @param day of <code>dateTime</code>
     * @param hours of <code>dateTime</code>
     * @param minutes of <code>dateTime</code>
     * @param seconds of <code>dateTime</code>
     * @param fractionalSecond value of null indicates optional field is absent.
     * @param timezone offset in minutes. {@link DatatypeConstants#FIELD_UNDEFINED} indicates optional field is not set.
     *
     * @return <code>XMLGregorianCalendar</code> created from parameter values.
     *
     * @see DatatypeConstants#FIELD_UNDEFINED
     *
     * @throws IllegalArgumentException if any parameter is outside value
     * constraints for the field as specified in
     * <a href="#datetimefieldmapping">date/time field mapping table</a>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public XMLGregorianCalendarImpl(GregorianCalendar cal) {

        /**
         * <p>Convert a <code>java.util.GregorianCalendar</code> to XML Schema 1.0
         * representation.</p>
         *
         * <table border="2" rules="all" cellpadding="2">
         *   <thead>
         *     <tr>
         *       <th align="center" colspan="2">
         *          Field by Field Conversion from
         *          <code>java.util.GregorianCalendar</code> to this class
         *       </th>
         *     </tr>
         *   </thead>
         *   <tbody>
         *     <tr>
         *        <th><code>javax.xml.datatype.XMLGregorianCalendar</code> field</th>
         *        <th><code>java.util.GregorianCalendar</code> field</th>
         *     </tr>
         *     <tr>
         *       <th>{@link #setYear(int)}</th>
         *       <th><code>ERA == GregorianCalendar.BC ? -YEAR : YEAR</code></th>
         *     </tr>
         *     <tr>
         *       <th>{@link #setMonth(int)}</th>
         *       <th><code>MONTH + 1</code></th>
         *     </tr>
         *     <tr>
         *       <th>{@link #setDay(int)}</th>
         *       <th><code>DAY_OF_MONTH</code></th>
         *     </tr>
         *     <tr>
         *       <th>{@link #setTime(int,int,int, BigDecimal)}</th>
         *       <th><code>HOUR_OF_DAY, MINUTE, SECOND, MILLISECOND</code></th>
         *     </tr>
         *     <tr>
         *       <th>{@link #setTimezone(int)}<i>*</i></th>
         *       <th><code>(ZONE_OFFSET + DST_OFFSET) / (60*1000)</code><br/>
         *       <i>(in minutes)</i>
         *       </th>
         *     </tr>
         *   </tbody>
         * </table>
         * <p><i>*</i>conversion loss of information. It is not possible to represent
         * a <code>java.util.GregorianCalendar</code> daylight savings timezone id in the
         * XML Schema 1.0 date/time datatype representation.</p>
         *
         * <p>To compute the return value's <code>TimeZone</code> field,
         * <ul>
         * <li>when <code>this.getTimezone() != DatatypeConstants.FIELD_UNDEFINED</code>,
         * create a <code>java.util.TimeZone</code> with a custom timezone id
         * using the <code>this.getTimezone()</code>.</li>
         * <li>else use the <code>GregorianCalendar</code> default timezone value
         * for the host is defined as specified by
         * <code>java.util.TimeZone.getDefault()</code>.</li></p>
         *
         * @param cal <code>java.util.GregorianCalendar</code> used to create <code>XMLGregorianCalendar</code>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private XMLGregorianCalendarImpl(
        int year,
        int month,
        int day,
        int hour,
        int minute,
        int second,
                int millisecond,
        int timezone) {

    /**
     * <p>Private constructor of value spaces that a
     * <code>java.util.GregorianCalendar</code> instance would need to convert to an
     * <code>XMLGregorianCalendar</code> instance.</p>
     *
     * <p><code>XMLGregorianCalendar eon</code> and
     * <code>fractionalSecond</code> are set to <code>null</code></p>
     *
     * @param year of <code>XMLGregorianCalendar</code> to be created.
     * @param month of <code>XMLGregorianCalendar</code> to be created.
     * @param day of <code>XMLGregorianCalendar</code> to be created.
     * @param hour of <code>XMLGregorianCalendar</code> to be created.
     * @param minute of <code>XMLGregorianCalendar</code> to be created.
     * @param second of <code>XMLGregorianCalendar</code> to be created.
     * @param millisecond of <code>XMLGregorianCalendar</code> to be created.
     * @param timezone of <code>XMLGregorianCalendar</code> to be created.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
                }

                        /**
                String yearString = "null";
                if (year != null) {
                    yearString = year.toString();
                }
                String fractionalSecondString = "null";
                if (fractionalSecond != null) {
                    fractionalSecondString = fractionalSecond.toString();
                }

                throw new IllegalArgumentException(
                    "year = " + yearString
                    + ", month = " + month
                    + ", day = " + day
                    + ", hour = " + hour
                    + ", minute = " + minute
                    + ", second = " + second
                    + ", fractionalSecond = " + fractionalSecondString
                    + ", timezone = " + timezone
                    + ", is not a valid representation of an XML Gregorian Calendar value."
                );
                */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    protected XMLGregorianCalendarImpl(
        BigInteger year,
        int month,
        int day,
        int hour,
        int minute,
        int second,
        BigDecimal fractionalSecond,
        int timezone) {

    /**
     * <p>Private constructor allowing for complete value spaces allowed by
     * W3C XML Schema 1.0 recommendation for xsd:dateTime and related
     * builtin datatypes. Note that <code>year</code> parameter supports
     * arbitrarily large numbers and fractionalSecond has infinite
     * precision.</p>
     *
     * @param year of <code>XMLGregorianCalendar</code> to be created.
     * @param month of <code>XMLGregorianCalendar</code> to be created.
     * @param day of <code>XMLGregorianCalendar</code> to be created.
     * @param hour of <code>XMLGregorianCalendar</code> to be created.
     * @param minute of <code>XMLGregorianCalendar</code> to be created.
     * @param second of <code>XMLGregorianCalendar</code> to be created.
     * @param fractionalSecond of <code>XMLGregorianCalendar</code> to be created.
     * @param timezone of <code>XMLGregorianCalendar</code> to be created.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public XMLGregorianCalendarImpl() {

    /**
     * <p>Create an instance with all date/time datatype fields set to
     * {@link DatatypeConstants#FIELD_UNDEFINED} or null respectively.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    protected XMLGregorianCalendarImpl(String lexicalRepresentation)

    /**
     * Constructs a new XMLGregorianCalendar object.
     *
     * String parsing documented by {@link #parse(String)}.
     *
     * Returns a non-null valid XMLGregorianCalendar object that holds the
     * value indicated by the lexicalRepresentation parameter.
     *
     * @param lexicalRepresentation
     *      Lexical representation of one the eight
     *      XML Schema date/time datatypes.
     * @throws IllegalArgumentException
     *      If the given string does not conform as documented in
     *      {@link #parse(String)}.
     * @throws NullPointerException
     *      If the given string is null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    public static final XMLGregorianCalendar LEAP_YEAR_DEFAULT =

    /**
     * <p>Use as a template for default field values when
     * converting to a {@link GregorianCalendar}, set to a leap
     * year date of January 1, 0400 at midnight.</p>
     *
     * <p>Fields that are optional for an <code>xsd:dateTime</code> instances are defaulted to not being set to any value.
     * <code>XMLGregorianCalendar</code> fields millisecond, fractional second and timezone return the value indicating
     * that the field is not set, {@link DatatypeConstants#FIELD_UNDEFINED} for millisecond and timezone
     * and <code>null</code> for fractional second.</p>
     *
     * @see #toGregorianCalendar(TimeZone, Locale, XMLGregorianCalendar)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private static final long serialVersionUID = 1L;

    /**
     * <p>Stream Unique Identifier.</p>
     *
     * <p>TODO: Serialization should use the XML string representation as
     * the serialization format to ensure future compatibility.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private static final String FIELD_NAME[] = {

    /**
     * field names indexed by YEAR..TIMEZONE.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private static final int TIMEZONE = 7;

    /**
     * Timezone index for MIN_ and MAX_FIELD_VALUES
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private static final int MILLISECOND = 6;

    /**
     * Second index for MIN_ and MAX_FIELD_VALUES.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private static final int SECOND = 5;

    /**
     * Second index for MIN_ and MAX_FIELD_VALUES.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private static final int MINUTE = 4;

    /**
     * Minute index for MIN_ and MAX_FIELD_VALUES.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private static final int HOUR   = 3;

    /**
     * Hour index for MIN_ and MAX_FIELD_VALUES.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private static final int DAY    = 2;

    /**
     * Day index for MIN_ and MAX_FIELD_VALUES.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private static final int MONTH  = 1;

    /**
     * Month index for MIN_ and MAX_FIELD_VALUES.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private static final int YEAR   = 0;

    /**
     * Year index for MIN_ and MAX_FIELD_VALUES.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private static final Date PURE_GREGORIAN_CHANGE =

    /**
     *   <p>Obtain a pure Gregorian Calendar by calling
     *   GregorianCalendar.setChange(PURE_GREGORIAN_CHANGE). </p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private static final BigInteger BILLION = new BigInteger("1000000000");

    /**
     * <p>Constant to represent a billion.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private BigDecimal fractionalSecond = null;

    /**
     * <p>Fractional second of this <code>XMLGregorianCalendar</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private int second = DatatypeConstants.FIELD_UNDEFINED ;

    /**
     * <p>Second of this <code>XMLGregorianCalendar</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private int minute = DatatypeConstants.FIELD_UNDEFINED;

    /**
     * <p>Minute of this <code>XMLGregorianCalendar</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private int hour = DatatypeConstants.FIELD_UNDEFINED;

    /**
     * <p>Hour of this <code>XMLGregorianCalendar</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private int timezone = DatatypeConstants.FIELD_UNDEFINED;

    /**
     * <p>Timezone of this <code>XMLGregorianCalendar</code> in minutes.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private int day = DatatypeConstants.FIELD_UNDEFINED;

    /**
     * <p>Day of this <code>XMLGregorianCalendar</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private int month = DatatypeConstants.FIELD_UNDEFINED;

    /**
     * <p>Month of this <code>XMLGregorianCalendar</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private int year = DatatypeConstants.FIELD_UNDEFINED;

    /**
     * <p>Year of this <code>XMLGregorianCalendar</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
    private BigInteger eon = null;

    /**
     * <p>Eon of this <code>XMLGregorianCalendar</code>.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/jaxp/datatype/XMLGregorianCalendarImpl.java
public class XMLGregorianCalendarImpl

/**
 * <p>Representation for W3C XML Schema 1.0 date/time datatypes.
 * Specifically, these date/time datatypes are
 * {@link DatatypeConstants#DATETIME dateTime},
 * {@link DatatypeConstants#TIME time},
 * {@link DatatypeConstants#DATE date},
 * {@link DatatypeConstants#GYEARMONTH gYearMonth},
 * {@link DatatypeConstants#GMONTHDAY gMonthDay},
 * {@link DatatypeConstants#GYEAR gYear},
 * {@link DatatypeConstants#GMONTH gMonth} and
 * {@link DatatypeConstants#GDAY gDay}
 * defined in the XML Namespace
 * <code>"http://www.w3.org/2001/XMLSchema"</code>.
 * These datatypes are normatively defined in
 * <a href="http://www.w3.org/TR/xmlschema-2/#dateTime">W3C XML Schema 1.0 Part 2, Section 3.2.7-14</a>.</p>
 *
 * <p>The table below defines the mapping between XML Schema 1.0
 * date/time datatype fields and this class' fields. It also summarizes
 * the value constraints for the date and time fields defined in
 * <a href="http://www.w3.org/TR/xmlschema-2/#isoformats">W3C XML Schema 1.0 Part 2, Appendix D,
 * <i>ISO 8601 Date and Time Formats</i></a>.</p>
 *
 * <a name="datetimefieldsmapping"/>
 * <table border="2" rules="all" cellpadding="2">
 *   <thead>
 *     <tr>
 *       <th align="center" colspan="3">
 *         Date/time datatype field mapping between XML Schema 1.0 and Java representation
 *       </th>
 *     </tr>
 *   </thead>
 *   <tbody>
 *     <tr>
 *       <th>XML Schema 1.0<br/>
 *           datatype<br/>
 *            field</th>
 *       <th>Related<br/>XMLGregorianCalendar<br/>Accessor(s)</th>
 *       <th>Value Range</th>
 *     </tr>
 *     <a name="datetimefield-year"/>
 *     <tr>
 *       <td> year </td>
 *       <td> {@link #getYear()} + {@link #getEon()} or<br/>
 *            {@link #getEonAndYear}
 *       </td>
 *       <td> <code>getYear()</code> is a value between -(10^9-1) to (10^9)-1
 *            or {@link DatatypeConstants#FIELD_UNDEFINED}.<br/>
 *            {@link #getEon()} is high order year value in billion of years.<br/>
 *            <code>getEon()</code> has values greater than or equal to (10^9) or less than or equal to -(10^9).
 *            A value of null indicates field is undefined.</br>
 *            Given that <a href="http://www.w3.org/2001/05/xmlschema-errata#e2-63">XML Schema 1.0 errata</a> states that the year zero
 *            will be a valid lexical value in a future version of XML Schema,
 *            this class allows the year field to be set to zero. Otherwise,
 *            the year field value is handled exactly as described
 *            in the errata and [ISO-8601-1988]. Note that W3C XML Schema 1.0
 *            validation does not allow for the year field to have a value of zero.
 *            </td>
 *     </tr>
 *     <a name="datetimefield-month"/>
 *     <tr>
 *       <td> month </td>
 *       <td> {@link #getMonth()} </td>
 *       <td> 1 to 12 or {@link DatatypeConstants#FIELD_UNDEFINED} </td>
 *     </tr>
 *     <a name="datetimefield-day"/>
 *     <tr>
 *       <td> day </td>
 *       <td> {@link #getDay()} </td>
 *       <td> Independent of month, max range is 1 to 31 or {@link DatatypeConstants#FIELD_UNDEFINED}.<br/>
 *            The normative value constraint stated relative to month
 *            field's value is in <a href="http://www.w3.org/TR/xmlschema-2/#isoformats">W3C XML Schema 1.0 Part 2, Appendix D</a>.
 *       </td>
 *     </tr>
 *     <a name="datetimefield-hour"/>
 *     <tr>
 *       <td> hour </td>
 *       <td> {@link #getHour()} </td>
 *       <td>
 *         0 to 23 or {@link DatatypeConstants#FIELD_UNDEFINED}.
 *         An hour value of 24 is allowed to be set in the lexical space provided the minute and second
 *         field values are zero. However, an hour value of 24 is not allowed in value space and will be
 *         transformed to represent the value of the first instance of the following day as per
 *         <a href="http://www.w3.org/TR/xmlschema-2/#built-in-primitive-datatypes">
 *         XML Schema Part 2: Datatypes Second Edition, 3.2 Primitive datatypes</a>.
 *       </td>
 *     </tr>
 *     <a name="datetimefield-minute"/>
 *     <tr>
 *       <td> minute </td>
 *       <td> {@link #getMinute()} </td>
 *       <td> 0 to 59 or {@link DatatypeConstants#FIELD_UNDEFINED} </td>
 *     </tr>
 *     <a name="datetimefield-second"/>
 *     <tr>
 *       <td>second</td>
 *       <td>
 *         {@link #getSecond()} + {@link #getMillisecond()}/1000 or<br/>
 *         {@link #getSecond()} + {@link #getFractionalSecond()}
 *       </td>
 *       <td>
 *         {@link #getSecond()} from 0 to 60 or {@link DatatypeConstants#FIELD_UNDEFINED}.<br/>
 *         <i>(Note: 60 only allowable for leap second.)</i><br/>
 *         {@link #getFractionalSecond()} allows for infinite precision over the range from 0.0 to 1.0 when
 *         the {@link #getSecond()} is defined.<br/>
 *         <code>FractionalSecond</code> is optional and has a value of <code>null</code> when it is undefined.<br />
 *            {@link #getMillisecond()} is the convenience
 *            millisecond precision of value of {@link #getFractionalSecond()}.
 *       </td>
 *     </tr>
 *     <tr id="datetimefield-timezone">
 *       <td> timezone </td>
 *       <td> {@link #getTimezone()} </td>
 *       <td> Number of minutes or {@link DatatypeConstants#FIELD_UNDEFINED}.
 *         Value range from -14 hours (-14 * 60 minutes) to 14 hours (14 * 60 minutes).
 *       </td>
 *     </tr>
 *   </tbody>
 *  </table>
 *
 * <p>All maximum value space constraints listed for the fields in the table
 * above are checked by factory methods, setter methods and parse methods of
 * this class. <code>IllegalArgumentException</code> is thrown when
 * parameter's value is outside the maximum value constraint for the field.
 * Validation checks, for example, whether days in month should be
 * limited to 29, 30 or 31 days, that are dependent on the values of other
 * fields are not checked by these methods.
 * </p>
 *
 * <p>The following operations are defined for this class:
 * <ul>
 *   <li>factory methods to create instances</li>
 *   <li>accessors/mutators for independent date/time fields</li>
 *   <li>conversion between this class and W3C XML Schema 1.0 lexical representation</li>
 *   <li>conversion between this class and <code>java.util.GregorianCalendar</code></li>
 *   <li>partial order relation comparator method, {@link #compare(XMLGregorianCalendar)}</li>
 *   <li>{@link #equals(Object)} defined relative to {@link #compare(XMLGregorianCalendar)}.</li>
 *   <li> addition operation with {@link javax.xml.datatype.Duration}.
 * instance as defined in <a href="http://www.w3.org/TR/xmlschema-2/#adding-durations-to-dateTimes">
 * W3C XML Schema 1.0 Part 2, Appendix E, <i>Adding durations to dateTimes</i></a>.</li>
 * </ul>
 * </p>
 *
 * @author <a href="mailto:Kohsuke.Kawaguchi@Sun.com">Kohsuke Kawaguchi</a>
 * @author <a href="mailto:Joseph.Fialli@Sun.com">Joseph Fialli</a>
 * @author <a href="mailto:Sunitha.Reddy@Sun.com">Sunitha Reddy</a>
 * @version $Revision: 1.14 $, $Date: 2010-11-10 07:41:41 $
 * @see javax.xml.datatype.Duration
 * @since 1.5
 */
