_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/Messages.java
    private final String createMsg(
        ListResourceBundle fResourceBundle,
        String msgKey,
        Object args[]) //throws Exception

    /**
     * Creates a message from the specified key and replacement
     * arguments, localized to the given locale.
     *
     * @param errorCode The key for the message text.
     *
     * @param fResourceBundle The resource bundle to use.
     * @param msgKey  The message key to use.
     * @param args      The arguments to be used as replacement text
     *                  in the message created.
     *
     * @return The formatted message string.
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/Messages.java
    public final String createMessage(String msgKey, Object args[])

    /**
     * Creates a message from the specified key and replacement
     * arguments, localized to the given locale.
     *
     * @param msgKey  The key for the message text.
     * @param args    The arguments to be used as replacement text
     * in the message created.
     *
     * @return The formatted message string.
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/Messages.java
    private Locale getLocale()

    /**
     * Get the Locale object that is being used.
     *
     * @return non-null reference to Locale object.
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/Messages.java
    Messages(String resourceBundle)

    /**
     * Constructor.
     * @param resourceBundle the class name of the ListResourceBundle
     * that the instance of this class is associated with and will use when
     * creating messages.
     * The class name is without a language suffix. If the value passed
     * is null then loadResourceBundle(errorResourceClass) needs to be called
     * explicitly before any messages are created.
     *
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/Messages.java
    private String m_resourceBundleName;

    /** The class name of the error message string table with no language suffix. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/Messages.java
    private ListResourceBundle m_resourceBundle;

    /** The language specific resource object for messages.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/Messages.java
    private final Locale m_locale = Locale.getDefault();

    /** The local object to use.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/Messages.java
public final class Messages

/**
 * A utility class for issuing error messages.
 *
 * A user of this class normally would create a singleton
 * instance of this class, passing the name
 * of the message class on the constructor. For example:
 * <CODE>
 * static Messages x = new Messages("org.package.MyMessages");
 * </CODE>
 * Later the message is typically generated this way if there are no
 * substitution arguments:
 * <CODE>
 * String msg = x.createMessage(org.package.MyMessages.KEY_ONE, null);
 * </CODE>
 * If there are arguments substitutions then something like this:
 * <CODE>
 * String filename = ...;
 * String directory = ...;
 * String msg = x.createMessage(org.package.MyMessages.KEY_TWO,
 *   new Object[] {filename, directory) );
 * </CODE>
 *
 * The constructor of an instance of this class must be given
 * the class name of a class that extends java.util.ListResourceBundle
 * ("org.package.MyMessages" in the example above).
 * The name should not have any language suffix
 * which will be added automatically by this utility class.
 *
 * The message class ("org.package.MyMessages")
 * must define the abstract method getContents() that is
 * declared in its base class, for example:
 * <CODE>
 * public Object[][] getContents() {return contents;}
 * </CODE>
 *
 * It is suggested that the message class expose its
 * message keys like this:
 * <CODE>
 *   public static final String KEY_ONE = "KEY1";
 *   public static final String KEY_TWO = "KEY2";
 *   . . .
 * </CODE>
 * and used through their names (KEY_ONE ...) rather than
 * their values ("KEY1" ...).
 *
 * The field contents (returned by getContents()
 * should be initialized something like this:
 * <CODE>
 * public static final Object[][] contents = {
 * { KEY_ONE, "Something has gone wrong!" },
 * { KEY_TWO, "The file ''{0}'' does not exist in directory ''{1}''." },
 * . . .
 * { KEY_N, "Message N" }  }
 * </CODE>
 *
 * Where that section of code with the KEY to Message mappings
 * (where the message classes 'contents' field is initialized)
 * can have the Message strings translated in an alternate language
 * in a errorResourceClass with a language suffix.
 *
 *
 * This class is not a public API, it is only public because it is
 * used in com.sun.org.apache.xml.internal.serializer.
 *
 *  @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/Messages.java
    private final String createMsg(
        ListResourceBundle fResourceBundle,
        String msgKey,
        Object args[]) //throws Exception

    /**
     * Creates a message from the specified key and replacement
     * arguments, localized to the given locale.
     *
     * @param errorCode The key for the message text.
     *
     * @param fResourceBundle The resource bundle to use.
     * @param msgKey  The message key to use.
     * @param args      The arguments to be used as replacement text
     *                  in the message created.
     *
     * @return The formatted message string.
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/Messages.java
    public final String createMessage(String msgKey, Object args[])

    /**
     * Creates a message from the specified key and replacement
     * arguments, localized to the given locale.
     *
     * @param msgKey  The key for the message text.
     * @param args    The arguments to be used as replacement text
     * in the message created.
     *
     * @return The formatted message string.
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/Messages.java
    private Locale getLocale()

    /**
     * Get the Locale object that is being used.
     *
     * @return non-null reference to Locale object.
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/Messages.java
    Messages(String resourceBundle)

    /**
     * Constructor.
     * @param resourceBundle the class name of the ListResourceBundle
     * that the instance of this class is associated with and will use when
     * creating messages.
     * The class name is without a language suffix. If the value passed
     * is null then loadResourceBundle(errorResourceClass) needs to be called
     * explicitly before any messages are created.
     *
     * @xsl.usage internal
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/Messages.java
    private String m_resourceBundleName;

    /** The class name of the error message string table with no language suffix. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/Messages.java
    private ListResourceBundle m_resourceBundle;

    /** The language specific resource object for messages.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/Messages.java
    private final Locale m_locale = Locale.getDefault();

    /** The local object to use.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/Messages.java
public final class Messages

/**
 * A utility class for issuing error messages.
 *
 * A user of this class normally would create a singleton
 * instance of this class, passing the name
 * of the message class on the constructor. For example:
 * <CODE>
 * static Messages x = new Messages("org.package.MyMessages");
 * </CODE>
 * Later the message is typically generated this way if there are no
 * substitution arguments:
 * <CODE>
 * String msg = x.createMessage(org.package.MyMessages.KEY_ONE, null);
 * </CODE>
 * If there are arguments substitutions then something like this:
 * <CODE>
 * String filename = ...;
 * String directory = ...;
 * String msg = x.createMessage(org.package.MyMessages.KEY_TWO,
 *   new Object[] {filename, directory) );
 * </CODE>
 *
 * The constructor of an instance of this class must be given
 * the class name of a class that extends java.util.ListResourceBundle
 * ("org.package.MyMessages" in the example above).
 * The name should not have any language suffix
 * which will be added automatically by this utility class.
 *
 * The message class ("org.package.MyMessages")
 * must define the abstract method getContents() that is
 * declared in its base class, for example:
 * <CODE>
 * public Object[][] getContents() {return contents;}
 * </CODE>
 *
 * It is suggested that the message class expose its
 * message keys like this:
 * <CODE>
 *   public static final String KEY_ONE = "KEY1";
 *   public static final String KEY_TWO = "KEY2";
 *   . . .
 * </CODE>
 * and used through their names (KEY_ONE ...) rather than
 * their values ("KEY1" ...).
 *
 * The field contents (returned by getContents()
 * should be initialized something like this:
 * <CODE>
 * public static final Object[][] contents = {
 * { KEY_ONE, "Something has gone wrong!" },
 * { KEY_TWO, "The file ''{0}'' does not exist in directory ''{1}''." },
 * . . .
 * { KEY_N, "Message N" }  }
 * </CODE>
 *
 * Where that section of code with the KEY to Message mappings
 * (where the message classes 'contents' field is initialized)
 * can have the Message strings translated in an alternate language
 * in a errorResourceClass with a language suffix.
 *
 *
 * This class is not a public API, it is only public because it is
 * used in com.sun.org.apache.xml.internal.serializer.
 *
 *  @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/Messages.java
    static String format( String property, Object[] args ) {

    /** Loads a string resource and formats it with specified arguments. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/Messages.java
class Messages

/**
 * Formats error messages.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/Messages.java
    static String format( String property, Object[] args ) {

    /** Loads a string resource and formats it with specified arguments. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/helpers/Messages.java
class Messages

/**
 * Formats error messages.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/util/Messages.java
    static String format( String property, Object[] args ) {

    /** Loads a string resource and formats it with specified arguments. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/bind/util/Messages.java
class Messages

/**
 * Formats error messages.
 */
