_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/MBeanServerFileAccessController.java
    public synchronized void refresh() throws IOException {

    /**
     * <p>Refresh the set of username/access level entries.</p>
     *
     * <p>If this instance was created using the
     * {@link #MBeanServerFileAccessController(String)} or
     * {@link #MBeanServerFileAccessController(String,MBeanServer)}
     * constructors to specify a file from which the entries are read,
     * the file is re-read.</p>
     *
     * <p>If this instance was created using the
     * {@link #MBeanServerFileAccessController(Properties)} or
     * {@link #MBeanServerFileAccessController(Properties,MBeanServer)}
     * constructors then a new copy of the <code>Properties</code> object
     * is made.</p>
     *
     * @exception IOException if the file does not exist, is a
     * directory rather than a regular file, or for some other
     * reason cannot be opened for reading.
     *
     * @exception IllegalArgumentException if any of the supplied access
     * level values differs from "readonly" or "readwrite".
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/MBeanServerFileAccessController.java
    @Override

    /**
     * Check if the caller can do unregister operations.  This method does
     * nothing if so, otherwise throws SecurityException.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/MBeanServerFileAccessController.java
    @Override

    /**
     * Check if the caller can create MBeans or instances of the given class.
     * This method does nothing if so, otherwise throws SecurityException.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/MBeanServerFileAccessController.java
    @Override

    /**
     * Check if the caller can do write operations.  This method does
     * nothing if so, otherwise throws SecurityException.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/MBeanServerFileAccessController.java
    @Override

    /**
     * Check if the caller can do read operations. This method does
     * nothing if so, otherwise throws SecurityException.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/MBeanServerFileAccessController.java
    public MBeanServerFileAccessController(Properties accessFileProps,
                                           MBeanServer mbs)

    /**
     * <p>Create a new MBeanServerAccessController that forwards all the
     * MBeanServer requests to the MBeanServer set by invoking the {@link
     * #setMBeanServer} method after doing access checks based on read and
     * write permissions.</p>
     *
     * <p>This instance is initialized from the specified properties
     * instance.  This constructor makes a copy of the properties
     * instance and it is the copy that is consulted to check the
     * username and access level of an incoming connection. The
     * original properties object can be modified without affecting
     * the copy. If the {@link #refresh} method is then called, the
     * <code>MBeanServerFileAccessController</code> will make a new
     * copy of the properties object at that time.</p>
     *
     * @param accessFileProps properties list containing the username/access
     * level entries.
     *
     * @param mbs the MBeanServer object to which requests will be forwarded.
     *
     * @exception IllegalArgumentException if <code>accessFileProps</code> is
     * <code>null</code> or if any of the supplied access level values differs
     * from "readonly" or "readwrite".
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/MBeanServerFileAccessController.java
    public MBeanServerFileAccessController(Properties accessFileProps)

    /**
     * <p>Create a new MBeanServerAccessController that forwards all the
     * MBeanServer requests to the MBeanServer set by invoking the {@link
     * #setMBeanServer} method after doing access checks based on read and
     * write permissions.</p>
     *
     * <p>This instance is initialized from the specified properties
     * instance.  This constructor makes a copy of the properties
     * instance and it is the copy that is consulted to check the
     * username and access level of an incoming connection. The
     * original properties object can be modified without affecting
     * the copy. If the {@link #refresh} method is then called, the
     * <code>MBeanServerFileAccessController</code> will make a new
     * copy of the properties object at that time.</p>
     *
     * @param accessFileProps properties list containing the username/access
     * level entries.
     *
     * @exception IllegalArgumentException if <code>accessFileProps</code> is
     * <code>null</code> or if any of the supplied access level values differs
     * from "readonly" or "readwrite".
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/MBeanServerFileAccessController.java
    public MBeanServerFileAccessController(String accessFileName,
                                           MBeanServer mbs)

    /**
     * <p>Create a new MBeanServerAccessController that forwards all the
     * MBeanServer requests to <code>mbs</code> after doing access checks
     * based on read and write permissions.</p>
     *
     * <p>This instance is initialized from the specified properties file.</p>
     *
     * @param accessFileName name of the file which denotes a properties
     * file on disk containing the username/access level entries.
     *
     * @param mbs the MBeanServer object to which requests will be forwarded.
     *
     * @exception IOException if the file does not exist, is a
     * directory rather than a regular file, or for some other
     * reason cannot be opened for reading.
     *
     * @exception IllegalArgumentException if any of the supplied access
     * level values differs from "readonly" or "readwrite".
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/MBeanServerFileAccessController.java
    public MBeanServerFileAccessController(String accessFileName)

    /**
     * <p>Create a new MBeanServerAccessController that forwards all the
     * MBeanServer requests to the MBeanServer set by invoking the {@link
     * #setMBeanServer} method after doing access checks based on read and
     * write permissions.</p>
     *
     * <p>This instance is initialized from the specified properties file.</p>
     *
     * @param accessFileName name of the file which denotes a properties
     * file on disk containing the username/access level entries.
     *
     * @exception IOException if the file does not exist, is a
     * directory rather than a regular file, or for some other
     * reason cannot be opened for reading.
     *
     * @exception IllegalArgumentException if any of the supplied access
     * level values differs from "readonly" or "readwrite".
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/security/MBeanServerFileAccessController.java
public class MBeanServerFileAccessController

/**
 * <p>An object of this class implements the MBeanServerAccessController
 * interface and, for each of its methods, calls an appropriate checking
 * method and then forwards the request to a wrapped MBeanServer object.
 * The checking method may throw a SecurityException if the operation is
 * not allowed; in this case the request is not forwarded to the
 * wrapped object.</p>
 *
 * <p>This class implements the {@link #checkRead()}, {@link #checkWrite()},
 * {@link #checkCreate(String)}, and {@link #checkUnregister(ObjectName)}
 * methods based on an access level properties file containing username/access
 * level pairs. The set of username/access level pairs is passed either as a
 * filename which denotes a properties file on disk, or directly as an instance
 * of the {@link Properties} class.  In both cases, the name of each property
 * represents a username, and the value of the property is the associated access
 * level.  Thus, any given username either does not exist in the properties or
 * has exactly one access level. The same access level can be shared by several
 * usernames.</p>
 *
 * <p>The supported access level values are {@code readonly} and
 * {@code readwrite}.  The {@code readwrite} access level can be
 * qualified by one or more <i>clauses</i>, where each clause looks
 * like <code>create <i>classNamePattern</i></code> or {@code
 * unregister}.  For example:</p>
 *
 * <pre>
 * monitorRole  readonly
 * controlRole  readwrite \
 *              create javax.management.timer.*,javax.management.monitor.* \
 *              unregister
 * </pre>
 *
 * <p>(The continuation lines with {@code \} come from the parser for
 * Properties files.)</p>
 */
