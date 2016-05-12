_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Tripwire.java
    static void trip(Class<?> trippingClass, String msg) {

    /**
     * Produces a log warning, using {@code PlatformLogger.getLogger(className)},
     * using the supplied message.  The class name of {@code trippingClass} will
     * be used as the first parameter to the message.
     *
     * @param trippingClass Name of the class generating the message
     * @param msg A message format string of the type expected by
     * {@link PlatformLogger}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Tripwire.java
    static final boolean ENABLED = AccessController.doPrivileged(
            (PrivilegedAction<Boolean>) () -> Boolean.getBoolean(TRIPWIRE_PROPERTY));

    /** Should debugging checks be enabled? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/Tripwire.java
final class Tripwire {

/**
 * Utility class for detecting inadvertent uses of boxing in
 * {@code java.util} classes.  The detection is turned on or off based on
 * whether the system property {@code org.openjdk.java.util.stream.tripwire} is
 * considered {@code true} according to {@link Boolean#getBoolean(String)}.
 * This should normally be turned off for production use.
 *
 * @apiNote
 * Typical usage would be for boxing code to do:
 * <pre>{@code
 *     if (Tripwire.ENABLED)
 *         Tripwire.trip(getClass(), "{0} calling PrimitiveIterator.OfInt.nextInt()");
 * }</pre>
 *
 * @since 1.8
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/Tripwire.java
    static void trip(Class<?> trippingClass, String msg) {

    /**
     * Produces a log warning, using {@code PlatformLogger.getLogger(className)},
     * using the supplied message.  The class name of {@code trippingClass} will
     * be used as the first parameter to the message.
     *
     * @param trippingClass Name of the class generating the message
     * @param msg A message format string of the type expected by
     * {@link PlatformLogger}
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/Tripwire.java
    static final boolean ENABLED = AccessController.doPrivileged(
            (PrivilegedAction<Boolean>) () -> Boolean.getBoolean(TRIPWIRE_PROPERTY));

    /** Should debugging checks be enabled? */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/util/stream/Tripwire.java
final class Tripwire {

/**
 * Utility class for detecting inadvertent uses of boxing in
 * {@code java.util.stream} classes.  The detection is turned on or off based on
 * whether the system property {@code org.openjdk.java.util.stream.tripwire} is
 * considered {@code true} according to {@link Boolean#getBoolean(String)}.
 * This should normally be turned off for production use.
 *
 * @apiNote
 * Typical usage would be for boxing code to do:
 * <pre>{@code
 *     if (Tripwire.ENABLED)
 *         Tripwire.trip(getClass(), "{0} calling Sink.OfInt.accept(Integer)");
 * }</pre>
 *
 * @since 1.8
 */
