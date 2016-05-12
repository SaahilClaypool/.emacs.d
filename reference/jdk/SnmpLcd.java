_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpLcd.java
    public SnmpModelLcd getModelLcd(SnmpSubSystem sys,
                                    int id) {

    /**
     * Gets an Lcd model.
     * @param sys The subsytem managing the model
     * @param id The model Id.
     * @return The Lcd model or null if no Lcd model were found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpLcd.java
    public void removeModelLcd(SnmpSubSystem sys,
                                int id)

     /**
     * Removes an Lcd model.
     * @param sys The subsytem managing the model.
     * @param id The model Id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpLcd.java
    public abstract void  storeEngineId(SnmpEngineId id);

    /**
     * Persists the engine Id.
     * @param id The engine Id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpLcd.java
    public abstract void storeEngineBoots(int i);

    /**
     * Persists the number of reboots.
     * @param i Reboot number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpLcd.java
    public abstract int getEngineBoots();

    /**
     * Returns the number of time the engine rebooted.
     * @return The number of reboots or -1 if the information is not present in the Lcd.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpLcd.java
public abstract class SnmpLcd {

/**
 * Class to extend in order to develop a customized Local Configuration Datastore. The Lcd is used by the <CODE>SnmpEngine</CODE> to store and retrieve data.
 *<P> <CODE>SnmpLcd</CODE> manages the Lcds needed by every {@link com.sun.jmx.snmp.internal.SnmpModel SnmpModel}. It is possible to add and remove {@link com.sun.jmx.snmp.internal.SnmpModelLcd SnmpModelLcd}.</P>
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpLcd.java
    public SnmpModelLcd getModelLcd(SnmpSubSystem sys,
                                    int id) {

    /**
     * Gets an Lcd model.
     * @param sys The subsytem managing the model
     * @param id The model Id.
     * @return The Lcd model or null if no Lcd model were found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpLcd.java
    public void removeModelLcd(SnmpSubSystem sys,
                                int id)

     /**
     * Removes an Lcd model.
     * @param sys The subsytem managing the model.
     * @param id The model Id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpLcd.java
    public abstract void  storeEngineId(SnmpEngineId id);

    /**
     * Persists the engine Id.
     * @param id The engine Id.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpLcd.java
    public abstract void storeEngineBoots(int i);

    /**
     * Persists the number of reboots.
     * @param i Reboot number.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpLcd.java
    public abstract int getEngineBoots();

    /**
     * Returns the number of time the engine rebooted.
     * @return The number of reboots or -1 if the information is not present in the Lcd.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/internal/SnmpLcd.java
public abstract class SnmpLcd {

/**
 * Class to extend in order to develop a customized Local Configuration Datastore. The Lcd is used by the <CODE>SnmpEngine</CODE> to store and retrieve data.
 *<P> <CODE>SnmpLcd</CODE> manages the Lcds needed by every {@link com.sun.jmx.snmp.internal.SnmpModel SnmpModel}. It is possible to add and remove {@link com.sun.jmx.snmp.internal.SnmpModelLcd SnmpModelLcd}.</P>
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
