_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final int MIN_TIMEZONE_OFFSET = 14 * 60;

        /**
         * W3C XML Schema min timezone offset is +14:00. Zone offset is in minutes.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final int MAX_TIMEZONE_OFFSET = -14 * 60;

        /**
         * W3C XML Schema max timezone offset is -14:00. Zone offset is in minutes.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final QName DURATION_YEARMONTH = new QName(XMLConstants.W3C_XPATH_DATATYPE_NS_URI, "yearMonthDuration");

        /**
         * <p>Fully qualified name for XQuery 1.0 and XPath 2.0 datatype <code>yearMonthDuration</code>.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final QName DURATION_DAYTIME = new QName(XMLConstants.W3C_XPATH_DATATYPE_NS_URI, "dayTimeDuration");

        /**
         * <p>Fully qualified name for XQuery 1.0 and XPath 2.0 datatype <code>dayTimeDuration</code>.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final QName DURATION = new QName(XMLConstants.W3C_XML_SCHEMA_NS_URI, "duration");

        /**
         * <p>Fully qualified name for W3C XML Schema datatype <code>duration</code>.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final QName GDAY = new QName(XMLConstants.W3C_XML_SCHEMA_NS_URI, "gDay");

        /**
         * <p>Fully qualified name for W3C XML Schema 1.0 datatype <code>gDay</code>.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final QName GMONTH = new QName(XMLConstants.W3C_XML_SCHEMA_NS_URI, "gMonth");

        /**
         * <p>Fully qualified name for W3C XML Schema 1.0 datatype <code>gMonth</code>.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final QName GYEAR = new QName(XMLConstants.W3C_XML_SCHEMA_NS_URI, "gYear");

        /**
         * <p>Fully qualified name for W3C XML Schema 1.0 datatype <code>gYear</code>.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final QName GMONTHDAY = new QName(XMLConstants.W3C_XML_SCHEMA_NS_URI, "gMonthDay");

        /**
         * <p>Fully qualified name for W3C XML Schema 1.0 datatype <code>gMonthDay</code>.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final QName GYEARMONTH = new QName(XMLConstants.W3C_XML_SCHEMA_NS_URI, "gYearMonth");

        /**
         * <p>Fully qualified name for W3C XML Schema 1.0 datatype <code>gYearMonth</code>.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final QName DATE = new QName(XMLConstants.W3C_XML_SCHEMA_NS_URI, "date");

        /**
         * <p>Fully qualified name for W3C XML Schema 1.0 datatype <code>date</code>.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final QName TIME = new QName(XMLConstants.W3C_XML_SCHEMA_NS_URI, "time");

        /**
         * <p>Fully qualified name for W3C XML Schema 1.0 datatype <code>time</code>.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final QName DATETIME = new QName(XMLConstants.W3C_XML_SCHEMA_NS_URI, "dateTime");

        /**
         * <p>Fully qualified name for W3C XML Schema 1.0 datatype <code>dateTime</code>.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
                public int getId() {

                /**
                 * <p>Get id of this Field.</p>
                 *
                 * @return Id of field.
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
                public String toString() { return str; }

                /**
                 * Returns a field name in English. This method
                 * is intended to be used for debugging/diagnosis
                 * and not for display to end-users.
                 *
                 * @return
                 *      a non-null valid String constant.
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
                private Field(final String str, final int id) {

                /**
                 * <p>Construct a <code>Field</code> with specified values.</p>
                 * @param str <code>String</code> representation of <code>Field</code>
                 * @param id  <code>int</code> representation of <code>Field</code>
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
                private final String str;

                /**
                 * <p><code>String</code> representation of <code>Field</code>.</p>
                 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final class Field {

        /**
         * Type-safe enum class that represents six fields
         * of the {@link Duration} class.
         * @since 1.5
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final Field SECONDS = new Field("SECONDS", 5);

        /**
         * <p>A constant that represents the seconds field.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final Field MINUTES = new Field("MINUTES", 4);

        /**
         * <p>A constant that represents the minutes field.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final Field HOURS = new Field("HOURS", 3);

        /**
         * <p>A constant that represents the hours field.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final Field DAYS = new Field("DAYS", 2);

        /**
         * <p>A constant that represents the days field.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final Field MONTHS = new Field("MONTHS", 1);

        /**
         * <p>A constant that represents the months field.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final Field YEARS = new Field("YEARS", 0);

        /**
         * <p>A constant that represents the years field.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final int FIELD_UNDEFINED = Integer.MIN_VALUE;

        /**
         * Designation that an "int" field is not set.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final int INDETERMINATE =  2;

        /**
         * <p>Comparison result.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final int GREATER =  1;

        /**
         * <p>Comparison result.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final int EQUAL =  0;

        /**
         * <p>Comparison result.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final int LESSER = -1;

        /**
         * <p>Comparison result.</p>
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final int DECEMBER = 12;

        /**
         * Value for twelve month of year.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final int NOVEMBER = 11;

        /**
         * Value for eleven month of year.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final int OCTOBER = 10;

        /**
         * Value for tenth month of year.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final int SEPTEMBER = 9;

        /**
         * Value for ninth month of year.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final int AUGUST   = 8;

        /**
         * Value for eighth month of year.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final int JULY     = 7;

        /**
         * Value for seventh month of year.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final int JUNE     = 6;

        /**
         * Value for sixth month of year.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final int MAY      = 5;

        /**
         * Value for fifth month of year.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final int APRIL    = 4;

        /**
         * Value for fourth month of year.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final int MARCH    = 3;

        /**
         * Value for third month of year.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final int FEBRUARY = 2;

        /**
         * Value for second month of year.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        public static final int JANUARY  = 1;

        /**
         * Value for first month of year.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
        private DatatypeConstants() {

    /**
     * <p>Private constructor to prevent instantiation.</p>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/datatype/DatatypeConstants.java
public final class DatatypeConstants {

/**
 * <p>Utility class to contain basic Datatype values as constants.</p>
 *
 * @author <a href="mailto:Jeff.Suttor@Sun.com">Jeff Suttor</a>
 * @since 1.5
 */
