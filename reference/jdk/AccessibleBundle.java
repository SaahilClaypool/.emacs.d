_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleBundle.java
    public String toString() {

    /**
     * Gets localized string describing the key using the default locale.
     * @return a localized String describing the key using the default locale
     * @see #toDisplayString
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleBundle.java
    public String toDisplayString() {

    /**
     * Gets localized string describing the key using the default locale.
     * @return a localized String describing the key for the default locale
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleBundle.java
    public String toDisplayString(Locale locale) {

    /**
     * Obtains the key as a localized string.
     * If a localized string cannot be found for the key, the
     * locale independent key stored in the role will be returned.
     *
     * @param locale the locale for which to obtain a localized string
     * @return a localized String for the key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleBundle.java
    protected String toDisplayString(String resourceBundleName,
                                     Locale locale) {

    /**
     * Obtains the key as a localized string.
     * If a localized string cannot be found for the key, the
     * locale independent key stored in the role will be returned.
     * This method is intended to be used only by subclasses so that they
     * can specify their own resource bundles which contain localized
     * strings for their keys.
     * @param resourceBundleName the name of the resource bundle to use for
     * lookup
     * @param locale the locale for which to obtain a localized string
     * @return a localized String for the key.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleBundle.java
    protected String key = null;

    /**
     * The locale independent name of the state.  This is a programmatic
     * name that is not intended to be read by humans.
     * @see #toDisplayString
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleBundle.java
    public AccessibleBundle() {

    /**
     * Construct an {@code AccessibleBundle}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/accessibility/AccessibleBundle.java
public abstract class AccessibleBundle {

/**
 * <p>Base class used to maintain a strongly typed enumeration.  This is
 * the superclass of {@link AccessibleState} and {@link AccessibleRole}.
 * <p>The toDisplayString method allows you to obtain the localized string
 * for a locale independent key from a predefined ResourceBundle for the
 * keys defined in this class.  This localized string is intended to be
 * readable by humans.
 *
 * @see AccessibleRole
 * @see AccessibleState
 *
 * @author      Willie Walker
 * @author      Peter Korn
 * @author      Lynn Monsanto
 */
