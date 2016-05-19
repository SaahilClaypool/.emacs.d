_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/util/EnvHelp.java
    public static boolean isServerDaemon(Map<String, ?> env) {

    /**
     * Returns true if {@value SERVER_DAEMON} is specified in the {@code env}
     * as a key and its value is a String and it is equal to true ignoring case.
     *
     * @param env
     * @return
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/util/EnvHelp.java
    public static final String JMX_SERVER_DAEMON = "jmx.remote.x.daemon";

    /**
     * <p>Name of the attribute that specifies whether a connector server
     * should not prevent the VM from exiting
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/util/EnvHelp.java
    public static <K, V> Hashtable<K, V> mapToHashtable(Map<K, V> map) {

    /**
     * Converts a map into a valid hash table, i.e.
     * it removes all the 'null' values from the map.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/util/EnvHelp.java
    public static boolean computeBooleanFromString( String stringBoolean, boolean defaultValue) {

    /**
     * Computes a boolean value from a string value retrieved from a
     * property in the given map.
     *
     * @param stringBoolean the string value that must be converted
     * into a boolean value.
     * @param defaultValue a default value to return in case no property
     *        was defined.
     *
     * @return
     *   <ul>
     *   <li>{@code defaultValue} if {@code stringBoolean}
     *   is {@code null}</li>
     *   <li>{@code false} if
     *       {@code stringBoolean.equalsIgnoreCase("false")}
     *       is {@code true}</li>
     *   <li>{@code true} if
     *       {@code stringBoolean.equalsIgnoreCase("true")}
     *       is {@code true}</li>
     *   </ul>
     *
     * @throws IllegalArgumentException if
     * {@code ((String)env.get(prop)).equalsIgnoreCase("false")} and
     * {@code ((String)env.get(prop)).equalsIgnoreCase("true")} are
     * {@code false}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/util/EnvHelp.java
    public static boolean computeBooleanFromString(String stringBoolean) {

    /**
     * Computes a boolean value from a string value retrieved from a
     * property in the given map.
     *
     * @param stringBoolean the string value that must be converted
     * into a boolean value.
     *
     * @return
     *   <ul>
     *   <li>{@code false} if {@code stringBoolean} is {@code null}</li>
     *   <li>{@code false} if
     *       {@code stringBoolean.equalsIgnoreCase("false")}
     *       is {@code true}</li>
     *   <li>{@code true} if
     *       {@code stringBoolean.equalsIgnoreCase("true")}
     *       is {@code true}</li>
     *   </ul>
     *
     * @throws IllegalArgumentException if
     * {@code ((String)env.get(prop)).equalsIgnoreCase("false")} and
     * {@code ((String)env.get(prop)).equalsIgnoreCase("true")} are
     * {@code false}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/util/EnvHelp.java
    public static long getConnectionCheckPeriod(Map<String, ?> env) {

    /**
     * Returns the client connection check period.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/util/EnvHelp.java
    public static final String CLIENT_CONNECTION_CHECK_PERIOD =

    /**
     * <p>Name of the attribute that specifies the period in
     * millisecond for a client to check its connection.  The default
     * value is 60000 milliseconds.</p>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/util/EnvHelp.java
    public static long getServerConnectionTimeout(Map<String, ?> env) {

    /**
     * Returns the server side connection timeout.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/util/EnvHelp.java
    public static final String SERVER_CONNECTION_TIMEOUT =

    /**
     * <p>Name of the attribute that specifies the timeout to keep a
     * server side connection after answering last client request.
     * The default value is 120000 milliseconds.</p>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/util/EnvHelp.java
    /* This list is copied directly from the spec, plus

    /**
     * Default list of attributes not to show.
     * @see #HIDDEN_ATTRIBUTES
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/util/EnvHelp.java
    public static final String HIDDEN_ATTRIBUTES =

    /**
     * The value of this attribute, if present, is a string specifying
     * what other attributes should not appear in
     * JMXConnectorServer.getAttributes().  It is a space-separated
     * list of attribute patterns, where each pattern is either an
     * attribute name, or an attribute prefix followed by a "*"
     * character.  The "*" has no special significance anywhere except
     * at the end of a pattern.  By default, this list is added to the
     * list defined by {@link #DEFAULT_HIDDEN_ATTRIBUTES} (which
     * uses the same format).  If the value of this attribute begins
     * with an "=", then the remainder of the string defines the
     * complete list of attribute patterns.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/util/EnvHelp.java
    private static void purgeUnserializable(Collection<?> objects) {

    /**
     * Remove from the given Collection any element that is not a
     * serializable object.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/util/EnvHelp.java
    public static long getIntegerAttribute(Map<String, ?> env, String name,
                                           long defaultValue, long minValue,
                                           long maxValue) {

    /**
     * Get an integer-valued attribute with name <code>name</code>
     * from <code>env</code>.  If <code>env</code> is null, or does
     * not contain an entry for <code>name</code>, return
     * <code>defaultValue</code>.  The value may be a Number, or it
     * may be a String that is parsable as a long.  It must be at
     * least <code>minValue</code> and at most<code>maxValue</code>.
     *
     * @throws IllegalArgumentException if <code>env</code> contains
     * an entry for <code>name</code> but it does not meet the
     * constraints above.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/util/EnvHelp.java
    public static final String NOTIF_ACCESS_CONTROLLER =

    /**
     * <p>Name of the attribute that specifies an object that will check
     * accesses to add/removeNotificationListener and also attempts to
     * receive notifications.  The value associated with this attribute
     * should be a <code>NotificationAccessController</code> object.
     * The default value is null.</p>
     * This field is not public because of its com.sun dependency.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/util/EnvHelp.java
    public static long getFetchTimeout(Map<String, ?> env) {

    /**
     * Returns the timeout for a client to fetch notifications.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/util/EnvHelp.java
    public static final String FETCH_TIMEOUT =

    /**
     * <p>Name of the attribute that specifies the timeout for a
     * client to fetch notifications from its server. The value
     * associated with this attribute should be a <code>Long</code>
     * object.  The default value is 60000 milliseconds.</p>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/util/EnvHelp.java
    public static int getMaxFetchNotifNumber(Map<String, ?> env) {

    /**
     * Returns the maximum notification number which a client will
     * fetch every time.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/util/EnvHelp.java
    public static final String MAX_FETCH_NOTIFS =

    /**
     * <p>Name of the attribute that specifies the maximum number of
     * notifications that a client will fetch from its server.. The
     * value associated with this attribute should be an
     * <code>Integer</code> object.  The default value is 1000.</p>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/util/EnvHelp.java
    public static int getNotifBufferSize(Map<String, ?> env) {

    /**
     * Returns the size of a notification buffer for a connector server.
     * The default value is 1000.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/util/EnvHelp.java
    public static final String BUFFER_SIZE_PROPERTY =

    /**
     * <p>Name of the attribute that specifies the size of a notification
     * buffer for a connector server. The default value is 1000.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/util/EnvHelp.java
    public static Throwable getCause(Throwable t) {

    /**
     * Returns the cause field of a {@code Throwable} object.
     * The cause field can be got only if <var>t</var> has an
     * {@link Throwable#getCause()} method (JDK Version >= 1.4)
     * @param t {@code Throwable} on which the cause must be set.
     * @return the cause if getCause() succeeded and the got value is not
     * null, otherwise return the <var>t</var>.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/util/EnvHelp.java
    public static <T extends Throwable> T initCause(T throwable,
                                                    Throwable cause) {

    /**
     * Initialize the cause field of a {@code Throwable} object.
     *
     * @param throwable The {@code Throwable} on which the cause is set.
     * @param cause The cause to set on the supplied {@code Throwable}.
     * @return the {@code Throwable} with the cause field initialized.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/util/EnvHelp.java
    public static ClassLoader resolveClientClassLoader(Map<String, ?> env) {

    /**
     * Get the Connector Client default class loader.
     * <p>
     * Returns:
     * <p>
     * <ul>
     * <li>
     *     The ClassLoader object found in <var>env</var> for
     *     <code>jmx.remote.default.class.loader</code>, if any.
     * </li>
     * <li>The <tt>Thread.currentThread().getContextClassLoader()</tt>
     *     otherwise.
     * </li>
     * </ul>
     * <p>
     * Usually a Connector Client will call
     * <pre>
     * ClassLoader dcl = EnvHelp.resolveClientClassLoader(env);
     * </pre>
     * in its <code>connect(Map env)</code> method.
     *
     * @return The connector client default class loader.
     *
     * @exception IllegalArgumentException if
     * <code>jmx.remote.default.class.loader</code> is specified
     * and is not an instance of {@link ClassLoader}.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/util/EnvHelp.java
    public static ClassLoader resolveServerClassLoader(Map<String, ?> env,
                                                       MBeanServer mbs)

    /**
     * Get the Connector Server default class loader.
     * <p>
     * Returns:
     * <p>
     * <ul>
     * <li>
     *     The ClassLoader object found in <var>env</var> for
     *     <code>jmx.remote.default.class.loader</code>, if any.
     * </li>
     * <li>
     *     The ClassLoader pointed to by the ObjectName found in
     *     <var>env</var> for <code>jmx.remote.default.class.loader.name</code>,
     *     and registered in <var>mbs</var> if any.
     * </li>
     * <li>
     *     The current thread's context classloader otherwise.
     * </li>
     * </ul>
     *
     * @param env Environment attributes.
     * @param mbs The MBeanServer for which the connector server provides
     * remote access.
     *
     * @return the connector server's default class loader.
     *
     * @exception IllegalArgumentException if one of the following is true:
     * <ul>
     * <li>both
     *     <code>jmx.remote.default.class.loader</code> and
     *     <code>jmx.remote.default.class.loader.name</code> are specified,
     * </li>
     * <li>or
     *     <code>jmx.remote.default.class.loader</code> is not
     *     an instance of {@link ClassLoader},
     * </li>
     * <li>or
     *     <code>jmx.remote.default.class.loader.name</code> is not
     *     an instance of {@link ObjectName},
     * </li>
     * <li>or
     *     <code>jmx.remote.default.class.loader.name</code> is specified
     *     but <var>mbs</var> is null.
     * </li>
     * @exception InstanceNotFoundException if
     * <code>jmx.remote.default.class.loader.name</code> is specified
     * and the ClassLoader MBean is not found in <var>mbs</var>.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/util/EnvHelp.java
    private static final String DEFAULT_CLASS_LOADER_NAME =

    /**
     * <p>Name of the attribute that specifies a default class loader
     *    ObjectName.
     * The value associated with this attribute is an ObjectName object</p>
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/util/EnvHelp.java
    private static final String DEFAULT_CLASS_LOADER =

    /**
     * <p>Name of the attribute that specifies a default class loader
     * object.
     * The value associated with this attribute is a ClassLoader object</p>
     */
