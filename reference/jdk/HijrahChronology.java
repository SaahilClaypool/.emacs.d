_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    private void readObject(ObjectInputStream s) throws InvalidObjectException {

    /**
     * Defend against malicious streams.
     *
     * @param s the stream to read
     * @throws InvalidObjectException always
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    @Override

    /**
     * Writes the Chronology using a
     * <a href="../../../serialized-form.html#java.time.chrono.Ser">dedicated serialized form</a>.
     * @serialData
     * <pre>
     *  out.writeByte(1);     // identifies a Chronology
     *  out.writeUTF(getId());
     * </pre>
     *
     * @return the instance of {@code Ser}, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    private int[] parseYMD(String string) {

    /**
     * Parse yyyy-MM-dd into a 3 element array [yyyy, mm, dd].
     *
     * @param string the input string
     * @return the 3 element array with year, month, day
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    private int[] parseMonths(String line) {

    /**
     * Parses the 12 months lengths from a property value for a specific year.
     *
     * @param line the value of a year property
     * @return an array of int[12] containing the 12 month lengths
     * @throws IllegalArgumentException if the number of months is not 12
     * @throws NumberFormatException if the 12 tokens are not numbers
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    private int[] createEpochMonths(int epochDay, int minYear, int maxYear, Map<Integer, int[]> years) {

    /**
     * Converts the map of year to month lengths ranging from minYear to maxYear
     * into a linear contiguous array of epochDays. The index is the hijrahMonth
     * computed from year and month and offset by minYear. The value of each
     * entry is the epochDay corresponding to the first day of the month.
     *
     * @param minYear The minimum year for which data is provided
     * @param maxYear The maximum year for which data is provided
     * @param years a Map of year to the array of 12 month lengths
     * @return array of epochDays for each month from min to max
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    private void loadCalendarData() {

    /**
     * Loads and processes the Hijrah calendar properties file for this calendarType.
     * The starting Hijrah date and the corresponding ISO date are
     * extracted and used to calculate the epochDate offset.
     * The version number is identified and ignored.
     * Everything else is the data for a year with containing the length of each
     * of 12 months.
     *
     * @throws DateTimeException if initialization of the calendar data from the
     *     resource fails
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    private static Properties readConfigProperties(final String resource) throws Exception {

    /**
     * Return the configuration properties from the resource.
     * <p>
     * The default location of the variant configuration resource is:
     * <pre>
     *   "$java.home/lib/" + resource-name
     * </pre>
     *
     * @param resource the name of the calendar property resource
     * @return a Properties containing the properties read from the resource.
     * @throws Exception if access to the property resource fails
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    private int epochMonthLength(int epochMonth) {

    /**
     * Returns the length of the epochMonth. It is computed from the start of
     * the following month minus the start of the requested month.
     *
     * @param epochMonth the epochMonth; assumed to be within range
     * @return the length in days of the epochMonth
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    private int yearMonthToDayOfYear(int prolepticYear, int month) {

    /**
     * Returns the day of year for the requested HijrahYear and month.
     *
     * @param prolepticYear the Hijrah year
     * @param month the Hijrah month
     * @return the day of year for the start of the month of the year
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    private int epochMonthToEpochDay(int epochMonth) {

    /**
     * Returns the epochDay for the start of the epochMonth.
     *
     * @param epochMonth the epochMonth
     * @return the epochDay for the start of the epochMonth.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    private int epochMonthToMonth(int epochMonth) {

    /**
     * Returns the Hijrah month from the epochMonth.
     *
     * @param epochMonth the epochMonth
     * @return the month of the Hijrah Year
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    private int yearToEpochMonth(int year) {

    /**
     * Returns the epochMonth for the Hijrah Year.
     *
     * @param year the HijrahYear
     * @return the epochMonth for the beginning of the year.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    private int epochMonthToYear(int epochMonth) {

    /**
     * Returns the year computed from the epochMonth
     *
     * @param epochMonth the epochMonth
     * @return the Hijrah Year
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    private int epochDayToEpochMonth(int epochDay) {

    /**
     * Returns the epochMonth found by locating the epochDay in the table. The
     * epochMonth is the index in the table
     *
     * @param epochDay
     * @return The index of the element of the start of the month containing the
     * epochDay.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    int getSmallestMaximumDayOfYear() {

    /**
     * Returns smallest maximum day-of-year.
     *
     * @return smallest maximum day-of-year
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    int getMaximumDayOfYear() {

    /**
     * Returns maximum day-of-year.
     *
     * @return maximum day-of-year
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    int getMinimumMonthLength() {

    /**
     * Returns smallest maximum day-of-month.
     *
     * @return smallest maximum day-of-month
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    int getMaximumMonthLength() {

    /**
     * Returns maximum day-of-month.
     *
     * @return maximum day-of-month
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    int getMaximumYear() {

    /**
     * Return the maximum supported Hijrah ear.
     *
     * @return the minimum
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    int getMinimumYear() {

    /**
     * Return the minimum supported Hijrah year.
     *
     * @return the minimum
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    int getYearLength(int prolepticYear) {

    /**
     * Returns year length.
     * Note: The 12th month must exist in the data.
     *
     * @param prolepticYear a proleptic year
     * @return year length in days
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    int getMonthLength(int prolepticYear, int monthOfYear) {

    /**
     * Returns month length for the year and month.
     *
     * @param prolepticYear a proleptic year
     * @param monthOfYear a month, 1-origin.
     * @return the length of the month
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    int getDayOfYear(int prolepticYear, int month) {

    /**
     * Returns day of year for the year and month.
     *
     * @param prolepticYear a proleptic year
     * @param month a month, 1-origin
     * @return the day of year, 1-origin
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    long getEpochDay(int prolepticYear, int monthOfYear, int dayOfMonth) {

    /**
     * Return the epoch day computed from Hijrah year, month, and day.
     *
     * @param prolepticYear the year to represent, 0-origin
     * @param monthOfYear the month-of-year to represent, 1-origin
     * @param dayOfMonth the day-of-month to represent, 1-origin
     * @return the epoch day
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    int[] getHijrahDateInfo(int epochDay) {

    /**
     * Returns an array containing the Hijrah year, month and day
     * computed from the epoch day.
     *
     * @param epochDay  the EpochDay
     * @return int[0] = YEAR, int[1] = MONTH, int[2] = DATE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    int checkValidYear(long prolepticYear) {

    /**
     * Check the validity of a year.
     *
     * @param prolepticYear the year to check
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    @Override  // override with covariant return type

    /**
     * Obtains a local date in the Hijrah calendar system from the epoch-day.
     *
     * @param epochDay  the epoch day
     * @return the Hijrah local date, not null
     * @throws DateTimeException if unable to create the date
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    @Override

    /**
     * Obtains a local date in Hijrah calendar system from the
     * proleptic-year and day-of-year fields.
     *
     * @param prolepticYear  the proleptic-year
     * @param dayOfYear  the day-of-year
     * @return the Hijrah local date, not null
     * @throws DateTimeException if the value of the year is out of range,
     *  or if the day-of-year is invalid for the year
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    @Override

    /**
     * Obtains a local date in Hijrah calendar system from the
     * era, year-of-era and day-of-year fields.
     *
     * @param era  the Hijrah era, not null
     * @param yearOfEra  the year-of-era
     * @param dayOfYear  the day-of-year
     * @return the Hijrah local date, not null
     * @throws DateTimeException if unable to create the date
     * @throws ClassCastException if the {@code era} is not a {@code HijrahEra}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    @Override

    /**
     * Obtains a local date in Hijrah calendar system from the
     * proleptic-year, month-of-year and day-of-month fields.
     *
     * @param prolepticYear  the proleptic-year
     * @param month  the month-of-year
     * @param dayOfMonth  the day-of-month
     * @return the Hijrah local date, not null
     * @throws DateTimeException if unable to create the date
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    @Override

    /**
     * Obtains a local date in Hijrah calendar system from the
     * era, year-of-era, month-of-year and day-of-month fields.
     *
     * @param era  the Hijrah era, not null
     * @param yearOfEra  the year-of-era
     * @param month  the month-of-year
     * @param dayOfMonth  the day-of-month
     * @return the Hijrah local date, not null
     * @throws DateTimeException if unable to create the date
     * @throws ClassCastException if the {@code era} is not a {@code HijrahEra}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    @Override

    /**
     * Gets the calendar type of the Islamic calendar.
     * <p>
     * The calendar type is an identifier defined by the
     * <em>Unicode Locale Data Markup Language (LDML)</em> specification.
     * It can be used to lookup the {@code Chronology} using {@link Chronology#of(String)}.
     *
     * @return the calendar system type; non-null if the calendar has
     *    a standard type, otherwise null
     * @see #getId()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    @Override

    /**
     * Gets the ID of the chronology.
     * <p>
     * The ID uniquely identifies the {@code Chronology}. It can be used to
     * lookup the {@code Chronology} using {@link Chronology#of(String)}.
     *
     * @return the chronology ID, non-null
     * @see #getCalendarType()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    private void checkCalendarInit() {

    /**
     * Check and ensure that the calendar data has been initialized.
     * The initialization check is performed at the boundary between
     * public and package methods.  If a public calls another public method
     * a check is not necessary in the caller.
     * The constructors of HijrahDate call {@link #getEpochDay} or
     * {@link #getHijrahDateInfo} so every call from HijrahDate to a
     * HijrahChronology via package private methods has been checked.
     *
     * @throws DateTimeException if the calendar data configuration is
     *     malformed or IOExceptions occur loading the data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    private HijrahChronology(String id) throws DateTimeException {

    /**
     * Create a HijrahChronology for the named variant.
     * The resource and calendar type are retrieved from properties
     * in the {@code calendars.properties}.
     * The property names are {@code "calendar.hijrah." + id}
     * and  {@code "calendar.hijrah." + id + ".type"}
     * @param id the id of the calendar
     * @throws DateTimeException if the calendar type is missing from the properties file.
     * @throws IllegalArgumentException if the id is empty
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    private static void registerVariants() {

    /**
     * For each Hijrah variant listed, create the HijrahChronology and register it.
     * Exceptions during initialization are logged but otherwise ignored.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    static {

    /**
     * Static initialization of the predefined calendars found in the
     * lib/calendars.properties file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    private static final String PROP_PREFIX = "calendar.hijrah.";

    /**
     * Prefix of property names for Hijrah calendar variants.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    private transient int maxYearLength;

    /**
     * The maximum length of a year in days.
     * Computed by {@link #createEpochMonths}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    private transient int maxMonthLength;

    /**
     * The maximum length of a month.
     * Computed by {@link #createEpochMonths}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    private transient int hijrahStartEpochMonth;

    /**
     * The minimum epoch month.
     * Computed by {@link #loadCalendarData}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    private transient int minEpochDay;

    /**
     * The minimum epoch day of this Hijrah calendar.
     * Computed by {@link #loadCalendarData}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    private transient volatile boolean initComplete;

    /**
     * Flag to indicate the initialization of configuration data is complete.
     * @see #checkCalendarInit()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    private static final long serialVersionUID = 3127340209035924785L;

    /**
     * Serialization version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
    private final transient String typeId;

    /**
     * The Hijrah Calendar id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/HijrahChronology.java
public final class HijrahChronology extends AbstractChronology implements Serializable {

/**
 * The Hijrah calendar is a lunar calendar supporting Islamic calendars.
 * <p>
 * The HijrahChronology follows the rules of the Hijrah calendar system. The Hijrah
 * calendar has several variants based on differences in when the new moon is
 * determined to have occurred and where the observation is made.
 * In some variants the length of each month is
 * computed algorithmically from the astronomical data for the moon and earth and
 * in others the length of the month is determined by an authorized sighting
 * of the new moon. For the algorithmically based calendars the calendar
 * can project into the future.
 * For sighting based calendars only historical data from past
 * sightings is available.
 * <p>
 * The length of each month is 29 or 30 days.
 * Ordinary years have 354 days; leap years have 355 days.
 *
 * <p>
 * CLDR and LDML identify variants:
 * <table cellpadding="2" summary="Variants of Hijrah Calendars">
 * <thead>
 * <tr class="tableSubHeadingColor">
 * <th class="colFirst" align="left" >Chronology ID</th>
 * <th class="colFirst" align="left" >Calendar Type</th>
 * <th class="colFirst" align="left" >Locale extension, see {@link java.util.Locale}</th>
 * <th class="colLast" align="left" >Description</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr class="altColor">
 * <td>Hijrah-umalqura</td>
 * <td>islamic-umalqura</td>
 * <td>ca-islamic-umalqura</td>
 * <td>Islamic - Umm Al-Qura calendar of Saudi Arabia</td>
 * </tr>
 * </tbody>
 * </table>
 * <p>Additional variants may be available through {@link Chronology#getAvailableChronologies()}.
 *
 * <p>Example</p>
 * <p>
 * Selecting the chronology from the locale uses {@link Chronology#ofLocale}
 * to find the Chronology based on Locale supported BCP 47 extension mechanism
 * to request a specific calendar ("ca"). For example,
 * </p>
 * <pre>
 *      Locale locale = Locale.forLanguageTag("en-US-u-ca-islamic-umalqura");
 *      Chronology chrono = Chronology.ofLocale(locale);
 * </pre>
 *
 * @implSpec
 * This class is immutable and thread-safe.
 *
 * @implNote
 * Each Hijrah variant is configured individually. Each variant is defined by a
 * property resource that defines the {@code ID}, the {@code calendar type},
 * the start of the calendar, the alignment with the
 * ISO calendar, and the length of each month for a range of years.
 * The variants are identified in the {@code calendars.properties} file.
 * The new properties are prefixed with {@code "calendars.hijrah."}:
 * <table cellpadding="2" border="0" summary="Configuration of Hijrah Calendar Variants">
 * <thead>
 * <tr class="tableSubHeadingColor">
 * <th class="colFirst" align="left">Property Name</th>
 * <th class="colFirst" align="left">Property value</th>
 * <th class="colLast" align="left">Description </th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr class="altColor">
 * <td>calendars.hijrah.{ID}</td>
 * <td>The property resource defining the {@code {ID}} variant</td>
 * <td>The property resource is located with the {@code calendars.properties} file</td>
 * </tr>
 * <tr class="rowColor">
 * <td>calendars.hijrah.{ID}.type</td>
 * <td>The calendar type</td>
 * <td>LDML defines the calendar type names</td>
 * </tr>
 * </tbody>
 * </table>
 * <p>
 * The Hijrah property resource is a set of properties that describe the calendar.
 * The syntax is defined by {@code java.util.Properties#load(Reader)}.
 * <table cellpadding="2" summary="Configuration of Hijrah Calendar">
 * <thead>
 * <tr class="tableSubHeadingColor">
 * <th class="colFirst" align="left" > Property Name</th>
 * <th class="colFirst" align="left" > Property value</th>
 * <th class="colLast" align="left" > Description </th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr class="altColor">
 * <td>id</td>
 * <td>Chronology Id, for example, "Hijrah-umalqura"</td>
 * <td>The Id of the calendar in common usage</td>
 * </tr>
 * <tr class="rowColor">
 * <td>type</td>
 * <td>Calendar type, for example, "islamic-umalqura"</td>
 * <td>LDML defines the calendar types</td>
 * </tr>
 * <tr class="altColor">
 * <td>version</td>
 * <td>Version, for example: "1.8.0_1"</td>
 * <td>The version of the Hijrah variant data</td>
 * </tr>
 * <tr class="rowColor">
 * <td>iso-start</td>
 * <td>ISO start date, formatted as {@code yyyy-MM-dd}, for example: "1900-04-30"</td>
 * <td>The ISO date of the first day of the minimum Hijrah year.</td>
 * </tr>
 * <tr class="altColor">
 * <td>yyyy - a numeric 4 digit year, for example "1434"</td>
 * <td>The value is a sequence of 12 month lengths,
 * for example: "29 30 29 30 29 30 30 30 29 30 29 29"</td>
 * <td>The lengths of the 12 months of the year separated by whitespace.
 * A numeric year property must be present for every year without any gaps.
 * The month lengths must be between 29-32 inclusive.
 * </td>
 * </tr>
 * </tbody>
 * </table>
 *
 * @since 1.8
 */
