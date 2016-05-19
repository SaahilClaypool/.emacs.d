_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/GetPropertyAction.java
    public Object run() {

    /**
     * Determines the string value of the system property whose
     * name was specified in the constructor.
     *
     * @return the string value of the system property,
     *         or the default value if there is no property with that key.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/GetPropertyAction.java
    public GetPropertyAction(String theProp, String defaultVal) {

    /**
     * Constructor that takes the name of the system property and the default
     * value of that property.
     *
     * @param theProp the name of the system property.
     * @param defaulVal the default value.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/GetPropertyAction.java
    public GetPropertyAction(String theProp) {

    /**
     * Constructor that takes the name of the system property whose
     * string value needs to be determined.
     *
     * @param theProp the name of the system property.
     */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/impl/orbutil/GetPropertyAction.java
public class GetPropertyAction implements java.security.PrivilegedAction {

/**
 * A convenience class for retrieving the string value of a system
 * property as a privileged action.  This class is directly copied
 * from sun.security.action.GetPropertyAction in order to avoid
 * depending on the sun.security.action package.
 *
 * <p>An instance of this class can be used as the argument of
 * <code>AccessController.doPrivileged</code>.
 *
 * <p>The following code retrieves the value of the system
 * property named <code>"prop"</code> as a privileged action: <p>
 *
 * <pre>
 * String s = (String) java.security.AccessController.doPrivileged(
 *                         new GetPropertyAction("prop"));
 * </pre>
 *
 * @author Roland Schemers
 * @author Ken Cavanaugh
 * @see java.security.PrivilegedAction
 * @see java.security.AccessController
 */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/mbeanserver/GetPropertyAction.java
public class GetPropertyAction implements PrivilegedAction<String> {

/**
 * Utility class to be used by the method <tt>AccessControler.doPrivileged</tt>
 * to get a system property.
 *
 * @since 1.5
 */
