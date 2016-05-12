_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/PropertyManager.java
        if (property.equals(Constants.SECURITY_MANAGER)) {

        /**
         * It's possible for users to set a security manager through the interface.
         * If it's the old SecurityManager, convert it to the new XMLSecurityManager
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/PropertyManager.java
    public boolean containsProperty(String property){

    /**
     * public void reset(){
     * supportedProps.clear() ;
     * }
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/PropertyManager.java
    private void initConfigurableReaderProperties(){

    /**
     * Important point:
     * 1. We are not exposing Xerces namespace property. Application should configure namespace through
     * Stax specific property.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/PropertyManager.java
    public PropertyManager(PropertyManager propertyManager){

    /**
     * Initialize this object with the properties taken from passed PropertyManager object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/PropertyManager.java
    public PropertyManager(int context) {

    /** Creates a new instance of PropertyManager */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/PropertyManager.java
    private static final String XML_SECURITY_PROPERTY_MANAGER =

    /** Property identifier: Security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/PropertyManager.java
    private static final String SECURITY_MANAGER = Constants.SECURITY_MANAGER;

    /** Property identifier: Security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/PropertyManager.java
public class PropertyManager {

/**
 *  This class manages different properties related to Stax specification and its implementation.
 * This class constructor also takes itself (PropertyManager object) as parameter and initializes the
 * object with the property taken from the object passed.
 *
 * @author  Neeraj Bajaj, neeraj.bajaj@sun.com
 * @author K.Venugopal@sun.com
 * @author Sunitha Reddy, sunitha.reddy@sun.com
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/PropertyManager.java
        if (property.equals(Constants.SECURITY_MANAGER)) {

        /**
         * It's possible for users to set a security manager through the interface.
         * If it's the old SecurityManager, convert it to the new XMLSecurityManager
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/PropertyManager.java
    public boolean containsProperty(String property){

    /**
     * public void reset(){
     * supportedProps.clear() ;
     * }
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/PropertyManager.java
    private void initConfigurableReaderProperties(){

    /**
     * Important point:
     * 1. We are not exposing Xerces namespace property. Application should configure namespace through
     * Stax specific property.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/PropertyManager.java
    public PropertyManager(PropertyManager propertyManager){

    /**
     * Initialize this object with the properties taken from passed PropertyManager object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/PropertyManager.java
    public PropertyManager(int context) {

    /** Creates a new instance of PropertyManager */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/PropertyManager.java
    private static final String XML_SECURITY_PROPERTY_MANAGER =

    /** Property identifier: Security property manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/PropertyManager.java
    private static final String SECURITY_MANAGER = Constants.SECURITY_MANAGER;

    /** Property identifier: Security manager. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/PropertyManager.java
public class PropertyManager {

/**
 *  This class manages different properties related to Stax specification and its implementation.
 * This class constructor also takes itself (PropertyManager object) as parameter and initializes the
 * object with the property taken from the object passed.
 *
 * @author  Neeraj Bajaj, neeraj.bajaj@sun.com
 * @author K.Venugopal@sun.com
 * @author Sunitha Reddy, sunitha.reddy@sun.com
 */
