_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public String getMessage() {

    /**
     * Returns a textual representation of both the major and the minor
     * status codes.
     *
     * @return a String with the error descriptions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public String toString() {

    /**
     * Returns a textual representation of both the major and the minor
     * status codes.
     *
     * @return a String with the error descriptions
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public void setMinor(int minorCode, String message) {

    /**
     * Used by the exception thrower to set the mechanism
     * level minor error code and its string explanation.  This is used by
     * mechanism providers to indicate error details.
     *
     * @param minorCode the mechanism specific error code
     * @param message textual explanation of the mechanism error code
     * @see #getMinor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public String getMinorString() {

    /**
     * Returns a string explaining the mechanism specific error code.
     * If the minor status code is 0, then no mechanism level error details
     * will be available.
     *
     * @return String a textual explanation of mechanism error code
     * @see #getMinor
     * @see #getMajorString
     * @see #toString
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public String getMajorString() {

    /**
     * Returns a string explaining the GSS-API level major error code in
     * this exception.
     *
     * @return String explanation string for the major error code
     * @see #getMajor
     * @see #toString
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public int  getMinor(){

    /**
     * Returns the mechanism level error code for the problem causing this
     * exception to be thrown. The minor code is set by the underlying
     * mechanism.
     *
     * @return int the mechanism error code; 0 indicates that it has not
     * been set.
     * @see #getMinorString
     * @see #setMinor
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public int getMajor() {

    /**
     * Returns the GSS-API level major error code for the problem causing
     * this exception to be thrown. Major error codes are
     * defined at the mechanism independent GSS-API level in this
     * class. Mechanism specific error codes that might provide more
     * information are set as the minor error code.
     *
     * @return int the GSS-API level major error code causing this exception
     * @see #getMajorString
     * @see #getMinor
     * @see #getMinorString
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public GSSException (int majorCode, int minorCode, String minorString) {

    /**
     * Creates a GSSException object with the specified major code, minor
     * code, and minor code textual explanation.  This constructor is to be
     * used when the exception is originating from the underlying mechanism
     * level. It allows the setting of both the GSS code and the mechanism
     * code.
     *
     * @param majorCode the GSS error code for the problem causing this
     * exception to be thrown.
     * @param minorCode the mechanism level error code for the problem
     * causing this exception to be thrown.
     * @param minorString the textual explanation of the mechanism error
     * code.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    GSSException (int majorCode, String majorString) {

    /**
     * Construct a GSSException object with a specified major code and a
     * specific major string for it.
     *
     * @param majorCode the fatal error code causing this exception.
     * @param majorString an expicit message to be included in this exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public GSSException (int majorCode) {

    /**
     *  Creates a GSSException object with a specified major code.
     *
     * @param majorCode the The GSS error code for the problem causing this
     * exception to be thrown.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    private String majorString = null;

   /**
    * Alternate text string for major code
    *
    * @serial
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    private String minorMessage = null;

   /**
    * The text string for minor code
    *
    * @serial
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    private int minor = 0;

   /**
    * The minor code for this exception
    *
    * @serial
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    private int major;

   /**
    * The major code for this exception
    *
    * @serial
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public static final int GAP_TOKEN = 22;

    /**
     * An expected per-message token was not received.  This is a
     * fatal error code that may occur during context establishment.
     * It is not used to indicate supplementary status values.
     * The MessageProp object is used for that purpose.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public static final int UNSEQ_TOKEN = 21;

    /**
     * A later token has already been processed.  This is a
     * fatal error code that may occur during context establishment.
     * It is not used to indicate supplementary status values.
     * The MessageProp object is used for that purpose.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public static final int OLD_TOKEN = 20;

    /**
     * The token's validity period has expired.  This is a
     * fatal error code that may occur during context establishment.
     * It is not used to indicate supplementary status values.
     * The MessageProp object is used for that purpose.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public static final int DUPLICATE_TOKEN = 19;

    /**
     * The token was a duplicate of an earlier token.
     * This is a fatal error code that may occur during
     * context establishment.  It is not used to indicate
     * supplementary status values. The MessageProp object is
     * used for that purpose.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public static final int NAME_NOT_MN = 18;

    /**
     * Name contains multi-mechanism elements.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public static final int DUPLICATE_ELEMENT = 17;

    /**
     * Duplicate credential element requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public static final int UNAVAILABLE = 16;

    /**
     * Operation unavailable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public static final int UNAUTHORIZED = 15;

    /**
     * Operation unauthorized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public static final int BAD_QOP = 14;

    /**
     * Unsupported QOP value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public static final int NO_CRED = 13;

    /**
     * Invalid credentials.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public static final int NO_CONTEXT = 12;

    /**
     * Invalid security context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public static final int FAILURE = 11;

    /**
     * General failure, unspecified at GSS-API level.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public static final int DEFECTIVE_TOKEN = 10;

    /**
     * Defective token.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public static final int DEFECTIVE_CREDENTIAL = 9;

    /**
     * Defective credentials.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public static final int CREDENTIALS_EXPIRED  = 8;

    /**
     * Expired credentials.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public static final int CONTEXT_EXPIRED = 7;

    /**
     * Security context expired.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public static final int BAD_MIC = 6;

    /**
     * Token had invalid integrity check.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    /*

    /**
     * Invalid status code.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public static final int BAD_NAMETYPE = 4;

    /**
     * Name of unsupported type provided.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public static final int BAD_NAME = 3;

    /**
     * Invalid name provided.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public static final int BAD_MECH = 2;

    /**
     * Unsupported mechanism requested.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
    public static final int BAD_BINDINGS = 1; //start with 1

    /**
     * Channel bindings mismatch.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/GSSException.java
public class GSSException extends Exception {

/**
 * This exception is thrown whenever a GSS-API error occurs, including
 * any mechanism specific error.  It may contain both the major and the
 * minor GSS-API status codes.  Major error codes are those defined at the
 * GSS-API level in this class. Minor error codes are mechanism specific
 * error codes that can provide additional information. The underlying
 * mechanism implementation is responsible for setting appropriate minor
 * status codes when throwing this exception.  Aside from delivering the
 * numeric error codes to the caller, this class performs the mapping from
 * their numeric values to textual representations. <p>
 *
 * @author Mayank Upadhyay
 * @since 1.4
 */
