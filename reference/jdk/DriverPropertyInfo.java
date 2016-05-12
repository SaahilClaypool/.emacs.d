_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/DriverPropertyInfo.java
    public String[] choices = null;

    /**
     * An array of possible values if the value for the field
         * <code>DriverPropertyInfo.value</code> may be selected
         * from a particular set of values; otherwise null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/DriverPropertyInfo.java
    public String value = null;

    /**
     * The <code>value</code> field specifies the current value of
         * the property, based on a combination of the information
         * supplied to the method <code>getPropertyInfo</code>, the
     * Java environment, and the driver-supplied default values.  This field
     * may be null if no value is known.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/DriverPropertyInfo.java
    public boolean required = false;

    /**
     * The <code>required</code> field is <code>true</code> if a value must be
         * supplied for this property
     * during <code>Driver.connect</code> and <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/DriverPropertyInfo.java
    public String description = null;

    /**
     * A brief description of the property, which may be null.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/DriverPropertyInfo.java
    public String name;

    /**
     * The name of the property.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/DriverPropertyInfo.java
    public DriverPropertyInfo(String name, String value) {

    /**
     * Constructs a <code>DriverPropertyInfo</code> object with a  given
     * name and value.  The <code>description</code> and <code>choices</code>
     * are initialized to <code>null</code> and <code>required</code> is initialized
     * to <code>false</code>.
     *
     * @param name the name of the property
     * @param value the current value, which may be null
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/sql/DriverPropertyInfo.java
public class DriverPropertyInfo {

/**
 * <p>Driver properties for making a connection. The
 * <code>DriverPropertyInfo</code> class is of interest only to advanced programmers
 * who need to interact with a Driver via the method
 * <code>getDriverProperties</code> to discover
 * and supply properties for connections.
 */
