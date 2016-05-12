_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineParameters.java
    public SnmpEngineId getEngineId() {

    /**
     * Get the engine Id.
     * @return The engineId.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineParameters.java
    public void setEngineId(SnmpEngineId engineId) {

    /**
     * Set the engine Id.
     * @param engineId The engine Id to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineParameters.java
    public boolean isEncryptionEnabled() {

    /**
     * Check if encryption is activated. By default the encryption is not activated.
     * @return The encryption activation status.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineParameters.java
    public void deactivateEncryption() {

    /**
     * Deactivate SNMP V3 encryption. By default the encryption is not activated. Be sure that the security provider classes needed for DES are in your classpath (eg:JCE classes)
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineParameters.java
    public void activateEncryption() {

    /**
     * Activate SNMP V3 encryption. By default the encryption is not activated. Be sure that the security provider classes needed for DES are in your classpath (eg:JCE classes)
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineParameters.java
    public UserAcl getUserAcl() {

    /**
     * Gets the customized user ACL.
     * @return The customized user ACL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineParameters.java
    public void setUserAcl(UserAcl uacl) {

    /**
     * Sets a customized user ACL. User Acl is used in order to check
     * access for SNMP V3 requests. If no ACL is provided,
     * <CODE>com.sun.jmx.snmp.usm.UserAcl.UserAcl</CODE> is instantiated.
     * @param uacl The user ACL to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineParameters.java
    public String getSecurityFile() {

    /**
     * Gets the file to use for SNMP Runtime Lcd.
     * @return The security file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineParameters.java
    public void setSecurityFile(String securityFile) {

    /**
     * Sets the file to use for SNMP Runtime Lcd. If no file is provided, the default location will be checked.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineParameters.java
public class SnmpEngineParameters implements Serializable {

/**
 * This class is used to pass some specific parameters to an <CODE>
 * SnmpEngineFactory </CODE>.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineParameters.java
    public SnmpEngineId getEngineId() {

    /**
     * Get the engine Id.
     * @return The engineId.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineParameters.java
    public void setEngineId(SnmpEngineId engineId) {

    /**
     * Set the engine Id.
     * @param engineId The engine Id to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineParameters.java
    public boolean isEncryptionEnabled() {

    /**
     * Check if encryption is activated. By default the encryption is not activated.
     * @return The encryption activation status.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineParameters.java
    public void deactivateEncryption() {

    /**
     * Deactivate SNMP V3 encryption. By default the encryption is not activated. Be sure that the security provider classes needed for DES are in your classpath (eg:JCE classes)
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineParameters.java
    public void activateEncryption() {

    /**
     * Activate SNMP V3 encryption. By default the encryption is not activated. Be sure that the security provider classes needed for DES are in your classpath (eg:JCE classes)
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineParameters.java
    public UserAcl getUserAcl() {

    /**
     * Gets the customized user ACL.
     * @return The customized user ACL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineParameters.java
    public void setUserAcl(UserAcl uacl) {

    /**
     * Sets a customized user ACL. User Acl is used in order to check
     * access for SNMP V3 requests. If no ACL is provided,
     * <CODE>com.sun.jmx.snmp.usm.UserAcl.UserAcl</CODE> is instantiated.
     * @param uacl The user ACL to use.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineParameters.java
    public String getSecurityFile() {

    /**
     * Gets the file to use for SNMP Runtime Lcd.
     * @return The security file.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineParameters.java
    public void setSecurityFile(String securityFile) {

    /**
     * Sets the file to use for SNMP Runtime Lcd. If no file is provided, the default location will be checked.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpEngineParameters.java
public class SnmpEngineParameters implements Serializable {

/**
 * This class is used to pass some specific parameters to an <CODE>
 * SnmpEngineFactory </CODE>.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 * @since 1.5
 */
