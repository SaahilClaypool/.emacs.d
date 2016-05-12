_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpUsmKeyHandler.java
    public byte[] calculatePrivDelta(String algoName, byte[] oldKey, byte[] newKey, byte[] random, int deltaSize) throws IllegalArgumentException;

    /**
     * Calculate the delta parameter needed when processing key change for a privacy algorithm. This computation is done by the key change initiator. It MUST be compliant to RFC 2574 description.
     * @param algoName The authentication algorithm to use.
     * @param oldKey The old key.
     * @param newKey The new key.
     * @param random The random value.
     * @param deltaSize The algo delta size.
     * @return The delta.
     * @exception IllegalArgumentException If the algorithm is unknown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpUsmKeyHandler.java
    public byte[] calculateAuthDelta(String algoName, byte[] oldKey, byte[] newKey, byte[] random) throws IllegalArgumentException;

    /**
     * Calculate the delta parameter needed when processing key change. This computation is done by the key change initiator. It MUST be compliant to RFC 2574 description.
     * @param algoName The authentication algorithm to use.
     * @param oldKey The old key.
     * @param newKey The new key.
     * @param random The random value.
     * @return The delta.
     * @exception IllegalArgumentException If the algorithm is unknown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpUsmKeyHandler.java
    public byte[] localizePrivKey(String algoName, byte[] key, SnmpEngineId engineId,int keysize) throws IllegalArgumentException;

    /**
     * Localize the passed privacy key using the passed <CODE>SnmpEngineId</CODE>. It MUST be compliant to RFC 2574 description.
     * @param algoName The authentication algorithm to use.
     * @param key The key to localize;
     * @param engineId The Id used to localize the key.
     * @param keysize The privacy algorithm key size.
     * @return The localized key.
     * @exception IllegalArgumentException If the algorithm is unknown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpUsmKeyHandler.java
    public byte[] password_to_key(String algoName, String password) throws IllegalArgumentException;

    /**
     * Translate a password to a key. It MUST be compliant to RFC 2574 description.
     * @param algoName The authentication algorithm to use.
     * @param password Password to convert.
     * @return The key.
     * @exception IllegalArgumentException If the algorithm is unknown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpUsmKeyHandler.java
    public static int DES_DELTA_SIZE = 16;

    /**
     * DES privacy algorithm delta size. To be used when calculing privacy key delta.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpUsmKeyHandler.java
    public static int DES_KEY_SIZE = 16;

    /**
     * DES privacy algorithm key size. To be used when localizing privacy key
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpUsmKeyHandler.java
public interface SnmpUsmKeyHandler {

/**
 * This interface allows you to compute key localization and delta generation. It is useful when adding user in USM MIB. An instance of <CODE> SnmpUsmKeyHandler </CODE> is associated to each <CODE> SnmpEngine </CODE> object.
 * When computing key, an authentication algorithm is needed. The supported ones are : usmHMACMD5AuthProtocol and usmHMACSHAAuthProtocol.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpUsmKeyHandler.java
    public byte[] calculatePrivDelta(String algoName, byte[] oldKey, byte[] newKey, byte[] random, int deltaSize) throws IllegalArgumentException;

    /**
     * Calculate the delta parameter needed when processing key change for a privacy algorithm. This computation is done by the key change initiator. It MUST be compliant to RFC 2574 description.
     * @param algoName The authentication algorithm to use.
     * @param oldKey The old key.
     * @param newKey The new key.
     * @param random The random value.
     * @param deltaSize The algo delta size.
     * @return The delta.
     * @exception IllegalArgumentException If the algorithm is unknown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpUsmKeyHandler.java
    public byte[] calculateAuthDelta(String algoName, byte[] oldKey, byte[] newKey, byte[] random) throws IllegalArgumentException;

    /**
     * Calculate the delta parameter needed when processing key change. This computation is done by the key change initiator. It MUST be compliant to RFC 2574 description.
     * @param algoName The authentication algorithm to use.
     * @param oldKey The old key.
     * @param newKey The new key.
     * @param random The random value.
     * @return The delta.
     * @exception IllegalArgumentException If the algorithm is unknown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpUsmKeyHandler.java
    public byte[] localizePrivKey(String algoName, byte[] key, SnmpEngineId engineId,int keysize) throws IllegalArgumentException;

    /**
     * Localize the passed privacy key using the passed <CODE>SnmpEngineId</CODE>. It MUST be compliant to RFC 2574 description.
     * @param algoName The authentication algorithm to use.
     * @param key The key to localize;
     * @param engineId The Id used to localize the key.
     * @param keysize The privacy algorithm key size.
     * @return The localized key.
     * @exception IllegalArgumentException If the algorithm is unknown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpUsmKeyHandler.java
    public byte[] password_to_key(String algoName, String password) throws IllegalArgumentException;

    /**
     * Translate a password to a key. It MUST be compliant to RFC 2574 description.
     * @param algoName The authentication algorithm to use.
     * @param password Password to convert.
     * @return The key.
     * @exception IllegalArgumentException If the algorithm is unknown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpUsmKeyHandler.java
    public static int DES_DELTA_SIZE = 16;

    /**
     * DES privacy algorithm delta size. To be used when calculing privacy key delta.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpUsmKeyHandler.java
    public static int DES_KEY_SIZE = 16;

    /**
     * DES privacy algorithm key size. To be used when localizing privacy key
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpUsmKeyHandler.java
public interface SnmpUsmKeyHandler {

/**
 * This interface allows you to compute key localization and delta generation. It is useful when adding user in USM MIB. An instance of <CODE> SnmpUsmKeyHandler </CODE> is associated to each <CODE> SnmpEngine </CODE> object.
 * When computing key, an authentication algorithm is needed. The supported ones are : usmHMACMD5AuthProtocol and usmHMACSHAAuthProtocol.
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
