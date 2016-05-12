_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    private int serialVersionOnStream = currentSerialVersion;

    /**
     * Describes the version of <code>DecimalFormatSymbols</code> present on the stream.
     * Possible values are:
     * <ul>
     * <li><b>0</b> (or uninitialized): versions prior to JDK 1.1.6.
     *
     * <li><b>1</b>: Versions written by JDK 1.1.6 or later, which include
     *      two new fields: <code>monetarySeparator</code> and <code>exponential</code>.
     * <li><b>2</b>: Versions written by J2SE 1.4 or later, which include a
     *      new <code>locale</code> field.
     * <li><b>3</b>: Versions written by J2SE 1.6 or later, which include a
     *      new <code>exponentialSeparator</code> field.
     * </ul>
     * When streaming out a <code>DecimalFormatSymbols</code>, the most recent format
     * (corresponding to the highest allowable <code>serialVersionOnStream</code>)
     * is always written.
     *
     * @serial
     * @since JDK 1.1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    private Locale locale;

    /**
     * The locale of these currency format symbols.
     *
     * @serial
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    private  String    exponentialSeparator;       // Field new in JDK 1.6

  /**
   * The string used to separate the mantissa from the exponent.
   * Examples: "x10^" for 1.23x10^4, "E" for 1.23E4.
   * <p>
   * If both <code>exponential</code> and <code>exponentialSeparator</code>
   * exist, this <code>exponentialSeparator</code> has the precedence.
   *
   * @serial
   * @since 1.6
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    private  char    exponential;       // Field new in JDK 1.1.6

    /**
     * The character used to distinguish the exponent in a number formatted
     * in exponential notation, e.g. 'E' for a number such as "1.23E45".
     * <p>
     * Note that the public API provides no way to set this field,
     * even though it is supported by the implementation and the stream format.
     * The intent is that this will be added to the API in the future.
     *
     * @serial
     * @since JDK 1.1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    private  char    monetarySeparator; // Field new in JDK 1.1.6

    /**
     * The decimal separator used when formatting currency values.
     * @serial
     * @since JDK 1.1.6
     * @see #getMonetaryDecimalSeparator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    private  String  intlCurrencySymbol;

    /**
     * ISO 4217 currency code denoting the local currency, e.g. "USD".
     * @serial
     * @see #getInternationalCurrencySymbol
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    private  String  currencySymbol;

    /**
     * String denoting the local currency, e.g. "$".
     * @serial
     * @see #getCurrencySymbol
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    private  char    minusSign;

    /**
     * Character used to represent minus sign.
     * @serial
     * @see #getMinusSign
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    private  String  NaN;

    /**
     * String used to represent "not a number".
     * @serial
     * @see #getNaN
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    private  String  infinity;

    /**
     * String used to represent infinity.
     * @serial
     * @see #getInfinity
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    private  char    patternSeparator;

    /**
     * Character used to separate positive and negative subpatterns
     * in a pattern.
     *
     * @serial
     * @see #getPatternSeparator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    private  char    digit;

    /**
     * Character used for a digit in a pattern.
     *
     * @serial
     * @see #getDigit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    private  char    percent;

    /**
     * Character used for percent sign.
     * @serial
     * @see #getPercent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    private  char    perMill;

    /**
     * Character used for per mille sign.
     *
     * @serial
     * @see #getPerMill
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    private  char    decimalSeparator;

    /**
     * Character used for decimal sign.
     *
     * @serial
     * @see #getDecimalSeparator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    private  char    groupingSeparator;

    /**
     * Character used for thousands separator.
     *
     * @serial
     * @see #getGroupingSeparator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    private  char    zeroDigit;

    /**
     * Character used for zero.
     *
     * @serial
     * @see #getZeroDigit
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    private void readObject(ObjectInputStream stream)

    /**
     * Reads the default serializable fields, provides default values for objects
     * in older serial versions, and initializes non-serializable fields.
     * If <code>serialVersionOnStream</code>
     * is less than 1, initializes <code>monetarySeparator</code> to be
     * the same as <code>decimalSeparator</code> and <code>exponential</code>
     * to be 'E'.
     * If <code>serialVersionOnStream</code> is less than 2,
     * initializes <code>locale</code>to the root locale, and initializes
     * If <code>serialVersionOnStream</code> is less than 3, it initializes
     * <code>exponentialSeparator</code> using <code>exponential</code>.
     * Sets <code>serialVersionOnStream</code> back to the maximum allowed value so that
     * default serialization will work properly if this object is streamed out again.
     * Initializes the currency from the intlCurrencySymbol field.
     *
     * @since JDK 1.1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    private void initialize( Locale locale ) {

    /**
     * Initializes the symbols from the FormatData resource bundle.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    @Override

    /**
     * Override hashCode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    @Override

    /**
     * Override equals.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    @Override

    /**
     * Standard override.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public void setExponentSeparator(String exp)

  /**
   * Sets the string used to separate the mantissa from the exponent.
   * Examples: "x10^" for 1.23x10^4, "E" for 1.23E4.
   *
   * @param exp the exponent separator string
   * @exception NullPointerException if <code>exp</code> is null
   * @see #getExponentSeparator()
   * @since 1.6
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    void setExponentialSymbol(char exp)

    /**
     * Sets the character used to separate the mantissa from the exponent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public String getExponentSeparator()

  /**
   * Returns the string used to separate the mantissa from the exponent.
   * Examples: "x10^" for 1.23x10^4, "E" for 1.23E4.
   *
   * @return the exponent separator string
   * @see #setExponentSeparator(java.lang.String)
   * @since 1.6
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    char getExponentialSymbol()

    /**
     * Returns the character used to separate the mantissa from the exponent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public void setMonetaryDecimalSeparator(char sep)

    /**
     * Sets the monetary decimal separator.
     *
     * @param sep the monetary decimal separator
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public char getMonetaryDecimalSeparator()

    /**
     * Returns the monetary decimal separator.
     *
     * @return the monetary decimal separator
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public void setCurrency(Currency currency) {

    /**
     * Sets the currency of these DecimalFormatSymbols.
     * This also sets the currency symbol attribute to the currency's symbol
     * in the DecimalFormatSymbols' locale, and the international currency
     * symbol attribute to the currency's ISO 4217 currency code.
     *
     * @param currency the new currency to be used
     * @exception NullPointerException if <code>currency</code> is null
     * @since 1.4
     * @see #setCurrencySymbol
     * @see #setInternationalCurrencySymbol
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public Currency getCurrency() {

    /**
     * Gets the currency of these DecimalFormatSymbols. May be null if the
     * currency symbol attribute was previously set to a value that's not
     * a valid ISO 4217 currency code.
     *
     * @return the currency used, or null
     * @since 1.4
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public void setInternationalCurrencySymbol(String currencyCode)

    /**
     * Sets the ISO 4217 currency code of the currency of these
     * DecimalFormatSymbols.
     * If the currency code is valid (as defined by
     * {@link java.util.Currency#getInstance(java.lang.String) Currency.getInstance}),
     * this also sets the currency attribute to the corresponding Currency
     * instance and the currency symbol attribute to the currency's symbol
     * in the DecimalFormatSymbols' locale. If the currency code is not valid,
     * then the currency attribute is set to null and the currency symbol
     * attribute is not modified.
     *
     * @param currencyCode the currency code
     * @see #setCurrency
     * @see #setCurrencySymbol
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public String getInternationalCurrencySymbol()

    /**
     * Returns the ISO 4217 currency code of the currency of these
     * DecimalFormatSymbols.
     *
     * @return the currency code
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public void setCurrencySymbol(String currency)

    /**
     * Sets the currency symbol for the currency of these
     * DecimalFormatSymbols in their locale.
     *
     * @param currency the currency symbol
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public String getCurrencySymbol()

    /**
     * Returns the currency symbol for the currency of these
     * DecimalFormatSymbols in their locale.
     *
     * @return the currency symbol
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public void setMinusSign(char minusSign) {

    /**
     * Sets the character used to represent minus sign. If no explicit
     * negative format is specified, one is formed by prefixing
     * minusSign to the positive format.
     *
     * @param minusSign the character representing minus sign
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public char getMinusSign() {

    /**
     * Gets the character used to represent minus sign. If no explicit
     * negative format is specified, one is formed by prefixing
     * minusSign to the positive format.
     *
     * @return the character representing minus sign
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public void setNaN(String NaN) {

    /**
     * Sets the string used to represent "not a number". Almost always left
     * unchanged.
     *
     * @param NaN the string representing "not a number"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public String getNaN() {

    /**
     * Gets the string used to represent "not a number". Almost always left
     * unchanged.
     *
     * @return the string representing "not a number"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public void setInfinity(String infinity) {

    /**
     * Sets the string used to represent infinity. Almost always left
     * unchanged.
     *
     * @param infinity the string representing infinity
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public String getInfinity() {

    /**
     * Gets the string used to represent infinity. Almost always left
     * unchanged.
     *
     * @return the string representing infinity
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public void setPatternSeparator(char patternSeparator) {

    /**
     * Sets the character used to separate positive and negative subpatterns
     * in a pattern.
     *
     * @param patternSeparator the pattern separator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public char getPatternSeparator() {

    /**
     * Gets the character used to separate positive and negative subpatterns
     * in a pattern.
     *
     * @return the pattern separator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public void setDigit(char digit) {

    /**
     * Sets the character used for a digit in a pattern.
     *
     * @param digit the character used for a digit in a pattern
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public char getDigit() {

    /**
     * Gets the character used for a digit in a pattern.
     *
     * @return the character used for a digit in a pattern
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public void setPercent(char percent) {

    /**
     * Sets the character used for percent sign. Different for Arabic, etc.
     *
     * @param percent the character used for percent sign
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public char getPercent() {

    /**
     * Gets the character used for percent sign. Different for Arabic, etc.
     *
     * @return the character used for percent sign
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public void setPerMill(char perMill) {

    /**
     * Sets the character used for per mille sign. Different for Arabic, etc.
     *
     * @param perMill the character used for per mille sign
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public char getPerMill() {

    /**
     * Gets the character used for per mille sign. Different for Arabic, etc.
     *
     * @return the character used for per mille sign
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public void setDecimalSeparator(char decimalSeparator) {

    /**
     * Sets the character used for decimal sign. Different for French, etc.
     *
     * @param decimalSeparator the character used for decimal sign
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public char getDecimalSeparator() {

    /**
     * Gets the character used for decimal sign. Different for French, etc.
     *
     * @return the character used for decimal sign
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public void setGroupingSeparator(char groupingSeparator) {

    /**
     * Sets the character used for thousands separator. Different for French, etc.
     *
     * @param groupingSeparator the grouping separator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public char getGroupingSeparator() {

    /**
     * Gets the character used for thousands separator. Different for French, etc.
     *
     * @return the grouping separator
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public void setZeroDigit(char zeroDigit) {

    /**
     * Sets the character used for zero. Different for Arabic, etc.
     *
     * @param zeroDigit the character used for zero
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public char getZeroDigit() {

    /**
     * Gets the character used for zero. Different for Arabic, etc.
     *
     * @return the character used for zero
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public static final DecimalFormatSymbols getInstance(Locale locale) {

    /**
     * Gets the <code>DecimalFormatSymbols</code> instance for the specified
     * locale.  This method provides access to <code>DecimalFormatSymbols</code>
     * instances for locales supported by the Java runtime itself as well
     * as for those supported by installed
     * {@link java.text.spi.DecimalFormatSymbolsProvider
     * DecimalFormatSymbolsProvider} implementations.
     * If the specified locale contains the {@link java.util.Locale#UNICODE_LOCALE_EXTENSION}
     * for the numbering system, the instance is initialized with the specified numbering
     * system if the JRE implementation supports it. For example,
     * <pre>
     * NumberFormat.getNumberInstance(Locale.forLanguageTag("th-TH-u-nu-thai"))
     * </pre>
     * This may return a {@code NumberFormat} instance with the Thai numbering system,
     * instead of the Latin numbering system.
     *
     * @param locale the desired locale.
     * @return a <code>DecimalFormatSymbols</code> instance.
     * @exception NullPointerException if <code>locale</code> is null
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public static final DecimalFormatSymbols getInstance() {

    /**
     * Gets the <code>DecimalFormatSymbols</code> instance for the default
     * locale.  This method provides access to <code>DecimalFormatSymbols</code>
     * instances for locales supported by the Java runtime itself as well
     * as for those supported by installed
     * {@link java.text.spi.DecimalFormatSymbolsProvider
     * DecimalFormatSymbolsProvider} implementations.
     * <p>This is equivalent to calling
     * {@link #getInstance(Locale)
     *     getInstance(Locale.getDefault(Locale.Category.FORMAT))}.
     * @see java.util.Locale#getDefault(java.util.Locale.Category)
     * @see java.util.Locale.Category#FORMAT
     * @return a <code>DecimalFormatSymbols</code> instance.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public static Locale[] getAvailableLocales() {

    /**
     * Returns an array of all locales for which the
     * <code>getInstance</code> methods of this class can return
     * localized instances.
     * The returned array represents the union of locales supported by the Java
     * runtime and by installed
     * {@link java.text.spi.DecimalFormatSymbolsProvider DecimalFormatSymbolsProvider}
     * implementations.  It must contain at least a <code>Locale</code>
     * instance equal to {@link java.util.Locale#US Locale.US}.
     *
     * @return an array of locales for which localized
     *         <code>DecimalFormatSymbols</code> instances are available.
     * @since 1.6
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public DecimalFormatSymbols( Locale locale ) {

    /**
     * Create a DecimalFormatSymbols object for the given locale.
     * This constructor can only construct instances for the locales
     * supported by the Java runtime environment, not for those
     * supported by installed
     * {@link java.text.spi.DecimalFormatSymbolsProvider DecimalFormatSymbolsProvider}
     * implementations. For full locale coverage, use the
     * {@link #getInstance(Locale) getInstance} method.
     * If the specified locale contains the {@link java.util.Locale#UNICODE_LOCALE_EXTENSION}
     * for the numbering system, the instance is initialized with the specified numbering
     * system if the JRE implementation supports it. For example,
     * <pre>
     * NumberFormat.getNumberInstance(Locale.forLanguageTag("th-TH-u-nu-thai"))
     * </pre>
     * This may return a {@code NumberFormat} instance with the Thai numbering system,
     * instead of the Latin numbering system.
     *
     * @param locale the desired locale
     * @exception NullPointerException if <code>locale</code> is null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
    public DecimalFormatSymbols() {

    /**
     * Create a DecimalFormatSymbols object for the default
     * {@link java.util.Locale.Category#FORMAT FORMAT} locale.
     * This constructor can only construct instances for the locales
     * supported by the Java runtime environment, not for those
     * supported by installed
     * {@link java.text.spi.DecimalFormatSymbolsProvider DecimalFormatSymbolsProvider}
     * implementations. For full locale coverage, use the
     * {@link #getInstance(Locale) getInstance} method.
     * <p>This is equivalent to calling
     * {@link #DecimalFormatSymbols(Locale)
     *     DecimalFormatSymbols(Locale.getDefault(Locale.Category.FORMAT))}.
     * @see java.util.Locale#getDefault(java.util.Locale.Category)
     * @see java.util.Locale.Category#FORMAT
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/DecimalFormatSymbols.java
public class DecimalFormatSymbols implements Cloneable, Serializable {

/**
 * This class represents the set of symbols (such as the decimal separator,
 * the grouping separator, and so on) needed by <code>DecimalFormat</code>
 * to format numbers. <code>DecimalFormat</code> creates for itself an instance of
 * <code>DecimalFormatSymbols</code> from its locale data.  If you need to change any
 * of these symbols, you can get the <code>DecimalFormatSymbols</code> object from
 * your <code>DecimalFormat</code> and modify it.
 *
 * @see          java.util.Locale
 * @see          DecimalFormat
 * @author       Mark Davis
 * @author       Alan Liu
 */
