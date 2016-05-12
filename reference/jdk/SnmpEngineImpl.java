_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public static void checkSecurityLevel(byte msgFlags)

    /**
     * Checks the passed msg flags according to the rules specified in RFC 2572.
     * @param msgFlags The msg flags.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public SnmpAccessControlSubSystem getAccessControlSubSystem() {

    /**
     * Returns the Access Control Sub System.
     * @return The Access Control Sub System.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public void setAccessControlSubSystem(SnmpAccessControlSubSystem sys) {

     /**
     * Sets the Access Control Sub System.
     * @param sys The Access Control Sub System.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public void setSecuritySubSystem(SnmpSecuritySubSystem sys) {

    /**
     * Sets the Security Sub System.
     * @param sys The Security Sub System.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public SnmpSecuritySubSystem getSecuritySubSystem() {

     /**
     * Returns the Security Sub System.
     * @return The Security Sub System.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public void setMsgProcessingSubSystem(SnmpMsgProcessingSubSystem sys) {

    /**
     * Sets the Message Processing Sub System.
     * @param sys The Message Processing Sub System.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public SnmpMsgProcessingSubSystem getMsgProcessingSubSystem() {

    /**
     * Returns the Message Processing Sub System.
     * @return The Message Processing Sub System.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public synchronized boolean isCheckOidActivated() {

    /**
     * Access Control check or not the oids. By default is false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public synchronized void deactivateCheckOid() {

    /**
     * Access Control will not check the oids. By default is false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public synchronized void activateCheckOid() {

    /**
     * Access Control will check the oids. By default is false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public SnmpEngineImpl(SnmpEngineFactory fact,
                          SnmpLcd lcd) throws UnknownHostException {

    /**
     * Constructor. A Local Configuration Datastore is passed to the engine. It will be used to store and retrieve data (engine ID, engine boots).
     * <P> WARNING : The SnmpEngineId is computed as follow:
     * <ul>
     * <li> If an lcd file is provided containing the property "localEngineID", this property value is used.</li>.
     * <li> If not, a time based engineID is computed.</li>
     * </ul>
     * When no configuration nor java property is set for the engine ID value, a unique time based engine ID will be generated.
     * This constructor should be called by an <CODE>SnmpEngineFactory</CODE>. Don't call it directly.
     * @param fact The factory used to instantiate this engine.
     * @param lcd The local configuration datastore.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public SnmpEngineImpl(SnmpEngineFactory fact,
                          SnmpLcd lcd,
                          int port) throws UnknownHostException {

    /**
     * Constructor. A Local Configuration Datastore is passed to the engine. It will be used to store and retrieve data (engine ID, engine boots).
     * <P> WARNING : The SnmpEngineId is computed as follow:
     * <ul>
     * <li> If an lcd file is provided containing the property "localEngineID", this property value is used.</li>.
     * <li> If not, The passed port is used to compute one.</li>
     * </ul>
     * This constructor should be called by an <CODE>SnmpEngineFactory</CODE>. Don't call it directly.
     * @param fact The factory used to instantiate this engine.
     * @param lcd The local configuration datastore
     * @param port UDP port to use in order to calculate the engine ID.
     * @throws UnknownHostException Exception thrown, if the host name located in the property "localEngineID" is invalid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public SnmpEngineImpl(SnmpEngineFactory fact,
                          SnmpLcd lcd,
                          InetAddress address,
                          int port) throws UnknownHostException {

    /**
     * Constructor. A Local Configuration Datastore is passed to the engine. It will be used to store and retrieve data (engine ID, engine boots).
     * <P> WARNING : The SnmpEngineId is computed as follow:
     * <ul>
     * <li> If an lcd file is provided containing the property "localEngineID", this property value is used.</li>.
     * <li> If not, the passed address and port are used to compute one.</li>
     * </ul>
     * This constructor should be called by an <CODE>SnmpEngineFactory</CODE>. Don't call it directly.
     * @param fact The factory used to instantiate this engine.
     * @param lcd The local configuration datastore.
     * @param port UDP port to use in order to calculate the engine ID.
     * @param address An IP address used to calculate the engine ID.
     * @throws UnknownHostException Exception thrown, if the host name located in the property "localEngineID" is invalid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public SnmpEngineImpl(SnmpEngineFactory fact,
                          SnmpLcd lcd,
                          SnmpEngineId engineid) throws UnknownHostException {

     /**
     * Constructor. A Local Configuration Datastore is passed to the engine. It will be used to store and retrieve data (engine Id, engine boots).
     * <P> WARNING : The SnmpEngineId is computed as follow:
     * <ul>
     * <li> If an lcd file is provided containing the property "localEngineID", this property value is used.</li>.
     * <li> If not, if the passed engineID is not null, this engine ID is used.</li>
     * <li> If not, a time based engineID is computed.</li>
     * </ul>
     * This constructor should be called by an <CODE>SnmpEngineFactory</CODE>. Don't call it directly.
     * @param fact The factory used to instantiate this engine.
     * @param lcd The local configuration datastore.
     * @param engineid The engine ID to use. If null is provided, an SnmpEngineId is computed using the current time.
     * @throws UnknownHostException Exception thrown, if the host name located in the property "localEngineID" is invalid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public int getEngineBoots() {

    /**
     * Gets the engine boot number. This is the number of time this engine has rebooted. Each time an <CODE>SnmpEngine</CODE> is instantiated, it will read this value in its Lcd, and store back the value incremented by one.
     * @return The engine's number of reboot.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public SnmpLcd getLcd() {

    /**
     * Gets the engine Lcd.
     * @return The engine Lcd.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public SnmpUsmKeyHandler getUsmKeyHandler() {

    /**
     * Gets the Usm key handler.
     * @return The key handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public SnmpEngineId getEngineId() {

    /**
     * Gets the engine Id. This is unique for each engine.
     * @return The engine Id object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public synchronized int getEngineTime() {

    /**
     * Gets the engine time in seconds. This is the time from the last reboot.
     * @return The time from the last reboot.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public static final int authPrivMask = 3;

    /**
     * Mask used to isolate authentication and privacy information within a message flag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public static final int authMask = 1;

    /**
     * Mask used to isolate authentication information within a message flag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public static final int authPriv = 3;

    /**
     * Security level. Authentication, privacy. Value is 3,
     * as defined in RFC 2572
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public static final int noAuthNoPriv = 0;

    /**
     * Security level. No authentication, no privacy. Value is 0,
     * as defined in RFC 2572
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
public class SnmpEngineImpl implements SnmpEngine, Serializable {

/**
 * This engine is conformant with the RFC 2571. It is the main object within
 * an SNMP entity (agent, manager...).
 * To an engine is associated an {@link com.sun.jmx.snmp.SnmpEngineId}.
 * The way the engineId is retrieved is linked to the way the engine is
 * instantiated. See each <CODE>SnmpEngine</CODE> constructor for more details.
 * An engine is composed of a set of sub systems
 * {@link com.sun.jmx.snmp.internal.SnmpSubSystem}. An <CODE>SNMP</CODE>
 * engine can contain a:
 *<ul>
 *<li> Message Processing Sub System :
 * {@link com.sun.jmx.snmp.internal.SnmpMsgProcessingSubSystem}</li>
 *<li> Security Sub System :
 * {@link com.sun.jmx.snmp.internal.SnmpSecuritySubSystem} </li>
 *<li> Access Control Sub System :
 * {@link com.sun.jmx.snmp.internal.SnmpAccessControlSubSystem}</li>
 *</ul>
 *<P> Each sub system contains a set of models. A model is an implementation
 * of a particular treatement (eg: the User based Security Model defined in
 * RFC 2574 is a functional element dealing with authentication and privacy).
 *</P>
 * Engine instantiation is based on a factory. This factory, implementing
 * mandatorily {@link com.sun.jmx.snmp.SnmpEngineFactory  SnmpEngineFactory}
 * is set in the method <CODE>setFactory</CODE>.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public static void checkSecurityLevel(byte msgFlags)

    /**
     * Checks the passed msg flags according to the rules specified in RFC 2572.
     * @param msgFlags The msg flags.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public SnmpAccessControlSubSystem getAccessControlSubSystem() {

    /**
     * Returns the Access Control Sub System.
     * @return The Access Control Sub System.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public void setAccessControlSubSystem(SnmpAccessControlSubSystem sys) {

     /**
     * Sets the Access Control Sub System.
     * @param sys The Access Control Sub System.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public void setSecuritySubSystem(SnmpSecuritySubSystem sys) {

    /**
     * Sets the Security Sub System.
     * @param sys The Security Sub System.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public SnmpSecuritySubSystem getSecuritySubSystem() {

     /**
     * Returns the Security Sub System.
     * @return The Security Sub System.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public void setMsgProcessingSubSystem(SnmpMsgProcessingSubSystem sys) {

    /**
     * Sets the Message Processing Sub System.
     * @param sys The Message Processing Sub System.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public SnmpMsgProcessingSubSystem getMsgProcessingSubSystem() {

    /**
     * Returns the Message Processing Sub System.
     * @return The Message Processing Sub System.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public synchronized boolean isCheckOidActivated() {

    /**
     * Access Control check or not the oids. By default is false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public synchronized void deactivateCheckOid() {

    /**
     * Access Control will not check the oids. By default is false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public synchronized void activateCheckOid() {

    /**
     * Access Control will check the oids. By default is false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public SnmpEngineImpl(SnmpEngineFactory fact,
                          SnmpLcd lcd) throws UnknownHostException {

    /**
     * Constructor. A Local Configuration Datastore is passed to the engine. It will be used to store and retrieve data (engine ID, engine boots).
     * <P> WARNING : The SnmpEngineId is computed as follow:
     * <ul>
     * <li> If an lcd file is provided containing the property "localEngineID", this property value is used.</li>.
     * <li> If not, a time based engineID is computed.</li>
     * </ul>
     * When no configuration nor java property is set for the engine ID value, a unique time based engine ID will be generated.
     * This constructor should be called by an <CODE>SnmpEngineFactory</CODE>. Don't call it directly.
     * @param fact The factory used to instantiate this engine.
     * @param lcd The local configuration datastore.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public SnmpEngineImpl(SnmpEngineFactory fact,
                          SnmpLcd lcd,
                          int port) throws UnknownHostException {

    /**
     * Constructor. A Local Configuration Datastore is passed to the engine. It will be used to store and retrieve data (engine ID, engine boots).
     * <P> WARNING : The SnmpEngineId is computed as follow:
     * <ul>
     * <li> If an lcd file is provided containing the property "localEngineID", this property value is used.</li>.
     * <li> If not, The passed port is used to compute one.</li>
     * </ul>
     * This constructor should be called by an <CODE>SnmpEngineFactory</CODE>. Don't call it directly.
     * @param fact The factory used to instantiate this engine.
     * @param lcd The local configuration datastore
     * @param port UDP port to use in order to calculate the engine ID.
     * @throws UnknownHostException Exception thrown, if the host name located in the property "localEngineID" is invalid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public SnmpEngineImpl(SnmpEngineFactory fact,
                          SnmpLcd lcd,
                          InetAddress address,
                          int port) throws UnknownHostException {

    /**
     * Constructor. A Local Configuration Datastore is passed to the engine. It will be used to store and retrieve data (engine ID, engine boots).
     * <P> WARNING : The SnmpEngineId is computed as follow:
     * <ul>
     * <li> If an lcd file is provided containing the property "localEngineID", this property value is used.</li>.
     * <li> If not, the passed address and port are used to compute one.</li>
     * </ul>
     * This constructor should be called by an <CODE>SnmpEngineFactory</CODE>. Don't call it directly.
     * @param fact The factory used to instantiate this engine.
     * @param lcd The local configuration datastore.
     * @param port UDP port to use in order to calculate the engine ID.
     * @param address An IP address used to calculate the engine ID.
     * @throws UnknownHostException Exception thrown, if the host name located in the property "localEngineID" is invalid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public SnmpEngineImpl(SnmpEngineFactory fact,
                          SnmpLcd lcd,
                          SnmpEngineId engineid) throws UnknownHostException {

     /**
     * Constructor. A Local Configuration Datastore is passed to the engine. It will be used to store and retrieve data (engine Id, engine boots).
     * <P> WARNING : The SnmpEngineId is computed as follow:
     * <ul>
     * <li> If an lcd file is provided containing the property "localEngineID", this property value is used.</li>.
     * <li> If not, if the passed engineID is not null, this engine ID is used.</li>
     * <li> If not, a time based engineID is computed.</li>
     * </ul>
     * This constructor should be called by an <CODE>SnmpEngineFactory</CODE>. Don't call it directly.
     * @param fact The factory used to instantiate this engine.
     * @param lcd The local configuration datastore.
     * @param engineid The engine ID to use. If null is provided, an SnmpEngineId is computed using the current time.
     * @throws UnknownHostException Exception thrown, if the host name located in the property "localEngineID" is invalid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public int getEngineBoots() {

    /**
     * Gets the engine boot number. This is the number of time this engine has rebooted. Each time an <CODE>SnmpEngine</CODE> is instantiated, it will read this value in its Lcd, and store back the value incremented by one.
     * @return The engine's number of reboot.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public SnmpLcd getLcd() {

    /**
     * Gets the engine Lcd.
     * @return The engine Lcd.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public SnmpUsmKeyHandler getUsmKeyHandler() {

    /**
     * Gets the Usm key handler.
     * @return The key handler.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public SnmpEngineId getEngineId() {

    /**
     * Gets the engine Id. This is unique for each engine.
     * @return The engine Id object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public synchronized int getEngineTime() {

    /**
     * Gets the engine time in seconds. This is the time from the last reboot.
     * @return The time from the last reboot.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public static final int authPrivMask = 3;

    /**
     * Mask used to isolate authentication and privacy information within a message flag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public static final int authMask = 1;

    /**
     * Mask used to isolate authentication information within a message flag.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public static final int authPriv = 3;

    /**
     * Security level. Authentication, privacy. Value is 3,
     * as defined in RFC 2572
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
    public static final int noAuthNoPriv = 0;

    /**
     * Security level. No authentication, no privacy. Value is 0,
     * as defined in RFC 2572
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpEngineImpl.java
public class SnmpEngineImpl implements SnmpEngine, Serializable {

/**
 * This engine is conformant with the RFC 2571. It is the main object within
 * an SNMP entity (agent, manager...).
 * To an engine is associated an {@link com.sun.jmx.snmp.SnmpEngineId}.
 * The way the engineId is retrieved is linked to the way the engine is
 * instantiated. See each <CODE>SnmpEngine</CODE> constructor for more details.
 * An engine is composed of a set of sub systems
 * {@link com.sun.jmx.snmp.internal.SnmpSubSystem}. An <CODE>SNMP</CODE>
 * engine can contain a:
 *<ul>
 *<li> Message Processing Sub System :
 * {@link com.sun.jmx.snmp.internal.SnmpMsgProcessingSubSystem}</li>
 *<li> Security Sub System :
 * {@link com.sun.jmx.snmp.internal.SnmpSecuritySubSystem} </li>
 *<li> Access Control Sub System :
 * {@link com.sun.jmx.snmp.internal.SnmpAccessControlSubSystem}</li>
 *</ul>
 *<P> Each sub system contains a set of models. A model is an implementation
 * of a particular treatement (eg: the User based Security Model defined in
 * RFC 2574 is a functional element dealing with authentication and privacy).
 *</P>
 * Engine instantiation is based on a factory. This factory, implementing
 * mandatorily {@link com.sun.jmx.snmp.SnmpEngineFactory  SnmpEngineFactory}
 * is set in the method <CODE>setFactory</CODE>.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
