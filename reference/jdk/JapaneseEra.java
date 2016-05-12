_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseEra.java
    private Object writeReplace() {

    /**
     * Writes the object using a
     * <a href="../../../serialized-form.html#java.time.chrono.Ser">dedicated serialized form</a>.
     * @serialData
     * <pre>
     *  out.writeByte(5);        // identifies a JapaneseEra
     *  out.writeInt(getValue());
     * </pre>
     *
     * @return the instance of {@code Ser}, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseEra.java
    private void readObject(ObjectInputStream s) throws InvalidObjectException {

    /**
     * Defend against malicious streams.
     *
     * @param s the stream to read
     * @throws InvalidObjectException always
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseEra.java
    @Override  // override as super would return range from 0 to 1

    /**
     * Gets the range of valid values for the specified field.
     * <p>
     * The range object expresses the minimum and maximum valid values for a field.
     * This era is used to enhance the accuracy of the returned range.
     * If it is not possible to return the range, because the field is not supported
     * or for some other reason, an exception is thrown.
     * <p>
     * If the field is a {@link ChronoField} then the query is implemented here.
     * The {@code ERA} field returns the range.
     * All other {@code ChronoField} instances will throw an {@code UnsupportedTemporalTypeException}.
     * <p>
     * If the field is not a {@code ChronoField}, then the result of this method
     * is obtained by invoking {@code TemporalField.rangeRefinedBy(TemporalAccessor)}
     * passing {@code this} as the argument.
     * Whether the range can be obtained is determined by the field.
     * <p>
     * The range of valid Japanese eras can change over time due to the nature
     * of the Japanese calendar system.
     *
     * @param field  the field to query the range for, not null
     * @return the range of valid values for the field, not null
     * @throws DateTimeException if the range for the field cannot be obtained
     * @throws UnsupportedTemporalTypeException if the unit is not supported
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseEra.java
    @Override

    /**
     * Gets the numeric era {@code int} value.
     * <p>
     * The {@link #SHOWA} era that contains 1970-01-01 (ISO calendar system) has the value 1.
     * Later eras are numbered from 2 ({@link #HEISEI}).
     * Earlier eras are numbered 0 ({@link #TAISHO}), -1 ({@link #MEIJI})).
     *
     * @return the era value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseEra.java
    private static int ordinal(int eraValue) {

    /**
     * Returns the index into the arrays from the Era value.
     * the eraValue is a valid Era number, -1..2.
     *
     * @param eraValue  the era value to convert to the index
     * @return the index of the current Era
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseEra.java
    static JapaneseEra from(LocalDate date) {

    /**
     * Obtains an instance of {@code JapaneseEra} from a date.
     *
     * @param date  the date, not null
     * @return the Era singleton, never null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseEra.java
    public static JapaneseEra[] values() {

    /**
     * Returns an array of JapaneseEras.
     * <p>
     * This method may be used to iterate over the JapaneseEras as follows:
     * <pre>
     * for (JapaneseEra c : JapaneseEra.values())
     *     System.out.println(c);
     * </pre>
     *
     * @return an array of JapaneseEras
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseEra.java
    public static JapaneseEra valueOf(String japaneseEra) {

    /**
     * Returns the {@code JapaneseEra} with the name.
     * <p>
     * The string must match exactly the name of the era.
     * (Extraneous whitespace characters are not permitted.)
     *
     * @param japaneseEra  the japaneseEra name; non-null
     * @return the {@code JapaneseEra} singleton, never null
     * @throws IllegalArgumentException if there is not JapaneseEra with the specified name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseEra.java
    public static JapaneseEra of(int japaneseEra) {

    /**
     * Obtains an instance of {@code JapaneseEra} from an {@code int} value.
     * <p>
     * The {@link #SHOWA} era that contains 1970-01-01 (ISO calendar system) has the value 1
     * Later era is numbered 2 ({@link #HEISEI}). Earlier eras are numbered 0 ({@link #TAISHO}),
     * -1 ({@link #MEIJI}), only Meiji and later eras are supported.
     *
     * @param japaneseEra  the era to represent
     * @return the {@code JapaneseEra} singleton, not null
     * @throws DateTimeException if the value is invalid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseEra.java
    sun.util.calendar.Era getPrivateEra() {

    /**
     * Returns the Sun private Era instance corresponding to this {@code JapaneseEra}.
     *
     * @return the Sun private Era instance for this {@code JapaneseEra}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseEra.java
    private JapaneseEra(int eraValue, LocalDate since) {

    /**
     * Creates an instance.
     *
     * @param eraValue  the era value, validated
     * @param since  the date representing the first date of the era, validated not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseEra.java
    private final transient int eraValue;

    /**
     * The era value.
     * @serial
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseEra.java
    private static final long serialVersionUID = 1466499369062886794L;

    /**
     * Serialization version.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseEra.java
    public static final JapaneseEra SHOWA = new JapaneseEra(1, LocalDate.of(1926, 12, 25));

    /**
     * The singleton instance for the 'Showa' era (1926-12-25 - 1989-01-07)
     * which has the value 1.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseEra.java
    public static final JapaneseEra MEIJI = new JapaneseEra(-1, LocalDate.of(1868, 1, 1));

    /**
     * The singleton instance for the 'Meiji' era (1868-01-01 - 1912-07-29)
     * which has the value -1.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/chrono/JapaneseEra.java
public final class JapaneseEra

/**
 * An era in the Japanese Imperial calendar system.
 * <p>
 * This class defines the valid eras for the Japanese chronology.
 * Japan introduced the Gregorian calendar starting with Meiji 6.
 * Only Meiji and later eras are supported;
 * dates before Meiji 6, January 1 are not supported.
 *
 * @implSpec
 * This class is immutable and thread-safe.
 *
 * @since 1.8
 */
