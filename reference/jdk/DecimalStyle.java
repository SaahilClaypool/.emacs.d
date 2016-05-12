_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DecimalStyle.java
    @Override

    /**
     * Returns a string describing this DecimalStyle.
     *
     * @return a string description, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DecimalStyle.java
    @Override

    /**
     * A hash code for this DecimalStyle.
     *
     * @return a suitable hash code
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DecimalStyle.java
    @Override

    /**
     * Checks if this DecimalStyle is equal to another DecimalStyle.
     *
     * @param obj  the object to check, null returns false
     * @return true if this is equal to the other date
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DecimalStyle.java
    String convertNumberToI18N(String numericText) {

    /**
     * Converts the input numeric text to the internationalized form using the zero character.
     *
     * @param numericText  the text, consisting of digits 0 to 9, to convert, not null
     * @return the internationalized text, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DecimalStyle.java
    int convertToDigit(char ch) {

    /**
     * Checks whether the character is a digit, based on the currently set zero character.
     *
     * @param ch  the character to check
     * @return the value, 0 to 9, of the character, or -1 if not a digit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DecimalStyle.java
    public DecimalStyle withDecimalSeparator(char decimalSeparator) {

    /**
     * Returns a copy of the info with a new character that represents the decimal point.
     * <p>
     * The character used to represent a decimal point may vary by culture.
     * This method specifies the character to use.
     *
     * @param decimalSeparator  the character for the decimal point
     * @return  a copy with a new character that represents the decimal point, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DecimalStyle.java
    public char getDecimalSeparator() {

    /**
     * Gets the character that represents the decimal point.
     * <p>
     * The character used to represent a decimal point may vary by culture.
     * This method specifies the character to use.
     *
     * @return the character for the decimal point
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DecimalStyle.java
    public DecimalStyle withNegativeSign(char negativeSign) {

    /**
     * Returns a copy of the info with a new character that represents the negative sign.
     * <p>
     * The character used to represent a negative number may vary by culture.
     * This method specifies the character to use.
     *
     * @param negativeSign  the character for the negative sign
     * @return  a copy with a new character that represents the negative sign, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DecimalStyle.java
    public char getNegativeSign() {

    /**
     * Gets the character that represents the negative sign.
     * <p>
     * The character used to represent a negative number may vary by culture.
     * This method specifies the character to use.
     *
     * @return the character for the negative sign
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DecimalStyle.java
    public DecimalStyle withPositiveSign(char positiveSign) {

    /**
     * Returns a copy of the info with a new character that represents the positive sign.
     * <p>
     * The character used to represent a positive number may vary by culture.
     * This method specifies the character to use.
     *
     * @param positiveSign  the character for the positive sign
     * @return  a copy with a new character that represents the positive sign, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DecimalStyle.java
    public char getPositiveSign() {

    /**
     * Gets the character that represents the positive sign.
     * <p>
     * The character used to represent a positive number may vary by culture.
     * This method specifies the character to use.
     *
     * @return the character for the positive sign
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DecimalStyle.java
    public DecimalStyle withZeroDigit(char zeroDigit) {

    /**
     * Returns a copy of the info with a new character that represents zero.
     * <p>
     * The character used to represent digits may vary by culture.
     * This method specifies the zero character to use, which implies the characters for one to nine.
     *
     * @param zeroDigit  the character for zero
     * @return  a copy with a new character that represents zero, not null

     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DecimalStyle.java
    public char getZeroDigit() {

    /**
     * Gets the character that represents zero.
     * <p>
     * The character used to represent digits may vary by culture.
     * This method specifies the zero character to use, which implies the characters for one to nine.
     *
     * @return the character for zero
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DecimalStyle.java
    private DecimalStyle(char zeroChar, char positiveSignChar, char negativeSignChar, char decimalPointChar) {

    /**
     * Restricted constructor.
     *
     * @param zeroChar  the character to use for the digit of zero
     * @param positiveSignChar  the character to use for the positive sign
     * @param negativeSignChar  the character to use for the negative sign
     * @param decimalPointChar  the character to use for the decimal point
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DecimalStyle.java
    public static DecimalStyle of(Locale locale) {

    /**
     * Obtains the DecimalStyle for the specified locale.
     * <p>
     * This method provides access to locale sensitive decimal style symbols.
     *
     * @param locale  the locale, not null
     * @return the decimal style, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DecimalStyle.java
    public static DecimalStyle ofDefaultLocale() {

    /**
     * Obtains the DecimalStyle for the default
     * {@link java.util.Locale.Category#FORMAT FORMAT} locale.
     * <p>
     * This method provides access to locale sensitive decimal style symbols.
     * <p>
     * This is equivalent to calling
     * {@link #of(Locale)
     *     of(Locale.getDefault(Locale.Category.FORMAT))}.
     *
     * @see java.util.Locale.Category#FORMAT
     * @return the decimal style, not null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DecimalStyle.java
    public static Set<Locale> getAvailableLocales() {

    /**
     * Lists all the locales that are supported.
     * <p>
     * The locale 'en_US' will always be present.
     *
     * @return a Set of Locales for which localization is supported
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DecimalStyle.java
    private final char negativeSign;

    /**
     * The negative sign.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DecimalStyle.java
    private final char zeroDigit;

    /**
     * The zero digit.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DecimalStyle.java
    public static final DecimalStyle STANDARD = new DecimalStyle('0', '+', '-', '.');

    /**
     * The standard set of non-localized decimal style symbols.
     * <p>
     * This uses standard ASCII characters for zero, positive, negative and a dot for the decimal point.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/time/format/DecimalStyle.java
public final class DecimalStyle {

/**
 * Localized decimal style used in date and time formatting.
 * <p>
 * A significant part of dealing with dates and times is the localization.
 * This class acts as a central point for accessing the information.
 *
 * @implSpec
 * This class is immutable and thread-safe.
 *
 * @since 1.8
 */
