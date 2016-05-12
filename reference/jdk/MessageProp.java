_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/MessageProp.java
    private void resetStatusValues() {

    /**
     * Resets the supplementary status values to false.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/MessageProp.java
   public void setSupplementaryStates(boolean duplicate,
                  boolean old, boolean unseq, boolean gap,
                  int minorStatus, String minorString) {

    /**
     * This method sets the state for the supplementary information flags
     * and the minor status in MessageProp.  It is not used by the
     * application but by the GSS implementation to return this information
     * to the caller of a per-message context method.
     *
     * @param duplicate true if the token was a duplicate of an earlier
     * token, false otherwise
     * @param old true if the token's validity period has expired, false
     * otherwise
     * @param unseq true if a later token has already been processed, false
     * otherwise
     * @param gap true if one or more predecessor tokens have not yet been
     * successfully processed, false otherwise
     * @param minorStatus the int minor status code for the per-message
     * operation
     * @param  minorString the textual representation of the minorStatus value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/MessageProp.java
    public String getMinorString(){

    /**
     * Retrieves a string explaining the minor status code.
     *
     * @return a String corresponding to the minor status
     * code. <code>null</code> will be returned when no minor status code
     * has been set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/MessageProp.java
    public int getMinorStatus(){

    /**
     * Retrieves the minor status code that the underlying mechanism might
     * have set for this per-message operation.
     *
     * @return the int minor status
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/MessageProp.java
    public boolean isGapToken() {

    /**
     * Tests if an expected token was not received, i.e., one or more
     * predecessor tokens have not yet been successfully processed.
     *
     * @return true if an expected per-message token was not received,
     * false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/MessageProp.java
    public boolean isUnseqToken() {

    /**
     * Tests if a later token had already been processed.
     *
     * @return true if a later token had already been processed, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/MessageProp.java
    public boolean isOldToken() {

    /**
     * Tests if this token's validity period has expired, i.e., the token
     * is too old to be checked for duplication.
     *
     * @return true if the token's validity period has expired, false
     * otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/MessageProp.java
    public boolean isDuplicateToken() {

    /**
     * Tests if this is a duplicate of an earlier token.
     *
     * @return true if this is a duplicate, false otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/MessageProp.java
    public void setPrivacy(boolean privState) {

    /**
     * Sets the privacy state.
     *
     * @param privState true is the privacy (i.e., confidentiality) state
     * is true, false otherwise.
     * @see #getPrivacy
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/MessageProp.java
    public void setQOP(int qop) {

    /**
     * Sets the QOP value.
     *
     * @param qop the int value to set the QOP to
     * @see #getQOP
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/MessageProp.java
    public boolean getPrivacy() {

    /**
     * Retrieves the privacy state.
     *
     * @return true if the privacy (i.e., confidentiality) state is true,
     * false otherwise.
     * @see #setPrivacy
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/MessageProp.java
    public int getQOP() {

    /**
     * Retrieves the QOP value.
     *
     * @return an int representing the QOP value
     * @see #setQOP
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/MessageProp.java
    public MessageProp(int qop, boolean privState) {

    /**
     * Constructor which sets the values for the qop and privacy state.
     *
     * @param qop the QOP value
     * @param privState the privacy (i.e. confidentiality) state
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/MessageProp.java
    public MessageProp(boolean privState) {

   /**
    * Constructor which sets the desired privacy state. The QOP value used
    * is 0.
    *
    * @param privState the privacy (i.e. confidentiality) state
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/MessageProp.java
public class MessageProp {

/**
 * This is a utility class used within the per-message GSSContext
 * methods to convey per-message properties.<p>
 *
 * When used with the GSSContext interface's wrap and getMIC methods, an
 * instance of this class is used to indicate the desired
 * Quality-of-Protection (QOP) and to request if confidentiality services
 * are to be applied to caller supplied data (wrap only).  To request
 * default QOP, the value of 0 should be used for QOP.<p>
 *
 * When used with the unwrap and verifyMIC methods of the GSSContext
 * interface, an instance of this class will be used to indicate the
 * applied QOP and confidentiality services over the supplied message.
 * In the case of verifyMIC, the confidentiality state will always be
 * <code>false</code>.  Upon return from these methods, this object will also
 * contain any supplementary status values applicable to the processed
 * token.  The supplementary status values can indicate old tokens, out
 * of sequence tokens, gap tokens or duplicate tokens.<p>
 *
 * @see GSSContext#wrap
 * @see GSSContext#unwrap
 * @see GSSContext#getMIC
 * @see GSSContext#verifyMIC
 *
 * @author Mayank Upadhyay
 * @since 1.4
 */
