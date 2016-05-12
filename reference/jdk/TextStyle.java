_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/TextStyle.java
    int zoneNameStyleIndex() {

    /**
     * Returns the relative index value to an element of the {@link
     * java.text.DateFormatSymbols#getZoneStrings() DateFormatSymbols.getZoneStrings()}
     * value, 0 for long names and 1 for short names (abbreviations). Note that these values
     * do <em>not</em> correspond to the {@link java.util.TimeZone#LONG} and {@link
     * java.util.TimeZone#SHORT} values.
     *
     * @return the relative index value to time zone names array
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/TextStyle.java
    int toCalendarStyle() {

    /**
     * Returns the {@code Calendar} style corresponding to this {@code TextStyle}.
     *
     * @return the corresponding {@code Calendar} style
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/TextStyle.java
    public TextStyle asNormal() {

    /**
     * Returns the normal style with the same size.
     *
     * @return the normal style with the same size
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/TextStyle.java
    public TextStyle asStandalone() {

    /**
     * Returns the stand-alone style with the same size.
     * @return the stand-alone style with the same size
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/TextStyle.java
    public boolean isStandalone() {

    /**
     * Returns true if the Style is a stand-alone style.
     * @return true if the style is a stand-alone style.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/TextStyle.java
    NARROW(Calendar.NARROW_FORMAT, 1),

    /**
     * Narrow text, typically a single letter.
     * For example, day-of-week Monday might output "M".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/TextStyle.java
    SHORT(Calendar.SHORT_FORMAT, 1),

    /**
     * Short text, typically an abbreviation.
     * For example, day-of-week Monday might output "Mon".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/TextStyle.java
    FULL(Calendar.LONG_FORMAT, 0),

    /**
     * Full text, typically the full description.
     * For example, day-of-week Monday might output "Monday".
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/TextStyle.java
public enum TextStyle {

/**
 * Enumeration of the style of text formatting and parsing.
 * <p>
 * Text styles define three sizes for the formatted text - 'full', 'short' and 'narrow'.
 * Each of these three sizes is available in both 'standard' and 'stand-alone' variations.
 * <p>
 * The difference between the three sizes is obvious in most languages.
 * For example, in English the 'full' month is 'January', the 'short' month is 'Jan'
 * and the 'narrow' month is 'J'. Note that the narrow size is often not unique.
 * For example, 'January', 'June' and 'July' all have the 'narrow' text 'J'.
 * <p>
 * The difference between the 'standard' and 'stand-alone' forms is trickier to describe
 * as there is no difference in English. However, in other languages there is a difference
 * in the word used when the text is used alone, as opposed to in a complete date.
 * For example, the word used for a month when used alone in a date picker is different
 * to the word used for month in association with a day and year in a date.
 *
 * @implSpec
 * This is immutable and thread-safe enum.
 */
