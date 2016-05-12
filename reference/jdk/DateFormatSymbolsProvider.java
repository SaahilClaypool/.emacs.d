_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/spi/DateFormatSymbolsProvider.java
    public abstract DateFormatSymbols getInstance(Locale locale);

    /**
     * Returns a new <code>DateFormatSymbols</code> instance for the
     * specified locale.
     *
     * @param locale the desired locale
     * @exception NullPointerException if <code>locale</code> is null
     * @exception IllegalArgumentException if <code>locale</code> isn't
     *     one of the locales returned from
     *     {@link java.util.spi.LocaleServiceProvider#getAvailableLocales()
     *     getAvailableLocales()}.
     * @return a <code>DateFormatSymbols</code> instance.
     * @see java.text.DateFormatSymbols#getInstance(java.util.Locale)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/spi/DateFormatSymbolsProvider.java
    protected DateFormatSymbolsProvider() {

    /**
     * Sole constructor.  (For invocation by subclass constructors, typically
     * implicit.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/spi/DateFormatSymbolsProvider.java
public abstract class DateFormatSymbolsProvider extends LocaleServiceProvider {

/**
 * An abstract class for service providers that
 * provide instances of the
 * {@link java.text.DateFormatSymbols DateFormatSymbols} class.
 *
 * @since        1.6
 */
