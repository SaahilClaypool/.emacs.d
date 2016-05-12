_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/spi/CollatorProvider.java
    public abstract Collator getInstance(Locale locale);

    /**
     * Returns a new <code>Collator</code> instance for the specified locale.
     * @param locale the desired locale.
     * @return the <code>Collator</code> for the desired locale.
     * @exception NullPointerException if
     * <code>locale</code> is null
     * @exception IllegalArgumentException if <code>locale</code> isn't
     *     one of the locales returned from
     *     {@link java.util.spi.LocaleServiceProvider#getAvailableLocales()
     *     getAvailableLocales()}.
     * @see java.text.Collator#getInstance(java.util.Locale)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/spi/CollatorProvider.java
    protected CollatorProvider() {

    /**
     * Sole constructor.  (For invocation by subclass constructors, typically
     * implicit.)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/text/spi/CollatorProvider.java
public abstract class CollatorProvider extends LocaleServiceProvider {

/**
 * An abstract class for service providers that
 * provide concrete implementations of the
 * {@link java.text.Collator Collator} class.
 *
 * @since        1.6
 */
