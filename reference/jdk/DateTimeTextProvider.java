_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeTextProvider.java
        Iterator<Entry<String, Long>> getTextIterator(TextStyle style) {

        /**
         * Gets an iterator of text to field for the specified style for the purpose of parsing.
         * <p>
         * The iterator must be returned in order from the longest text to the shortest.
         *
         * @param style  the style to get text for, null for all parsable text
         * @return the iterator of text to field pairs, in order from longest text to shortest text,
         *  null if the style is not parsable
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeTextProvider.java
        String getText(long value, TextStyle style) {

        /**
         * Gets the text for the specified field value, locale and style
         * for the purpose of printing.
         *
         * @param value  the value to get text for, not null
         * @param style  the style to get text for, not null
         * @return the text for the field value, null if no text found
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeTextProvider.java
        LocaleStore(Map<TextStyle, Map<Long, String>> valueTextMap) {

        /**
         * Constructor.
         *
         * @param valueTextMap  the map of values to text to store, assigned and not altered, not null
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeTextProvider.java
        private final Map<TextStyle, List<Entry<String, Long>>> parsable;

        /**
         * Parsable data.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeTextProvider.java
    static final class LocaleStore {

    /**
     * Stores the text for a single locale.
     * <p>
     * Some fields have a textual representation, such as day-of-week or month-of-year.
     * These textual representations can be captured in this class for printing
     * and parsing.
     * <p>
     * This class is immutable and thread-safe.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeTextProvider.java
    @SuppressWarnings("unchecked")

    /**
     * Returns the localized resource of the given key and locale, or null
     * if no localized resource is available.
     *
     * @param key  the key of the localized resource, not null
     * @param locale  the locale, not null
     * @return the localized resource, or null if not available
     * @throws NullPointerException if key or locale is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeTextProvider.java
    private static <A, B> Entry<A, B> createEntry(A text, B field) {

    /**
     * Helper method to create an immutable entry.
     *
     * @param text  the text, not null
     * @param field  the field, not null
     * @return the entry, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeTextProvider.java
    public Iterator<Entry<String, Long>> getTextIterator(Chronology chrono, TemporalField field,
                                                         TextStyle style, Locale locale) {

    /**
     * Gets an iterator of text to field for the specified chrono, field, locale and style
     * for the purpose of parsing.
     * <p>
     * The iterator must be returned in order from the longest text to the shortest.
     * <p>
     * The null return value should be used if there is no applicable parsable text, or
     * if the text would be a numeric representation of the value.
     * Text can only be parsed if all the values for that field-style-locale combination are unique.
     *
     * @param chrono  the Chronology to get text for, not null
     * @param field  the field to get text for, not null
     * @param style  the style to get text for, null for all parsable text
     * @param locale  the locale to get text for, not null
     * @return the iterator of text to field pairs, in order from longest text to shortest text,
     *  null if the field or style is not parsable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeTextProvider.java
    public Iterator<Entry<String, Long>> getTextIterator(TemporalField field, TextStyle style, Locale locale) {

    /**
     * Gets an iterator of text to field for the specified field, locale and style
     * for the purpose of parsing.
     * <p>
     * The iterator must be returned in order from the longest text to the shortest.
     * <p>
     * The null return value should be used if there is no applicable parsable text, or
     * if the text would be a numeric representation of the value.
     * Text can only be parsed if all the values for that field-style-locale combination are unique.
     *
     * @param field  the field to get text for, not null
     * @param style  the style to get text for, null for all parsable text
     * @param locale  the locale to get text for, not null
     * @return the iterator of text to field pairs, in order from longest text to shortest text,
     *  null if the field or style is not parsable
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeTextProvider.java
    public String getText(Chronology chrono, TemporalField field, long value,
                                    TextStyle style, Locale locale) {

    /**
     * Gets the text for the specified chrono, field, locale and style
     * for the purpose of formatting.
     * <p>
     * The text associated with the value is returned.
     * The null return value should be used if there is no applicable text, or
     * if the text would be a numeric representation of the value.
     *
     * @param chrono  the Chronology to get text for, not null
     * @param field  the field to get text for, not null
     * @param value  the field value to get text for, not null
     * @param style  the style to get text for, not null
     * @param locale  the locale to get text for, not null
     * @return the text for the field value, null if no text found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeTextProvider.java
    public String getText(TemporalField field, long value, TextStyle style, Locale locale) {

    /**
     * Gets the text for the specified field, locale and style
     * for the purpose of formatting.
     * <p>
     * The text associated with the value is returned.
     * The null return value should be used if there is no applicable text, or
     * if the text would be a numeric representation of the value.
     *
     * @param field  the field to get text for, not null
     * @param value  the field value to get text for, not null
     * @param style  the style to get text for, not null
     * @param locale  the locale to get text for, not null
     * @return the text for the field value, null if no text found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeTextProvider.java
    static DateTimeTextProvider getInstance() {

    /**
     * Gets the provider of text.
     *
     * @return the provider, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeTextProvider.java
    private static final ConcurrentMap<Entry<TemporalField, Locale>, Object> CACHE = new ConcurrentHashMap<>(16, 0.75f, 2);

    /** Cache. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DateTimeTextProvider.java
class DateTimeTextProvider {

/**
 * A provider to obtain the textual form of a date-time field.
 *
 * @implSpec
 * Implementations must be thread-safe.
 * Implementations should cache the textual information.
 *
 * @since 1.8
 */
