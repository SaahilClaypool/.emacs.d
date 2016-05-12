_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/ChannelBinding.java
    public int hashCode() {

    /**
     * Returns a hashcode value for this ChannelBinding object.
     *
     * @return a hashCode value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/ChannelBinding.java
    public boolean equals(Object obj) {

    /**
     * Compares two instances of ChannelBinding.
     *
     * @param obj another ChannelBinding to compare this one with
     * @return true if the two ChannelBinding's contain
     * the same values for the initiator and acceptor addresses and the
     * application data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/ChannelBinding.java
    public byte[] getApplicationData() {

    /**
     * Get the application specified data for this channel binding.
     *
     * @return the application data being used as part of the
     * ChannelBinding. <code>null</code> is returned if no application data
     * has been specified for the channel binding.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/ChannelBinding.java
    public InetAddress getAcceptorAddress() {

    /**
     * Get the acceptor's address for this channel binding.
     *
     * @return the acceptor's address. null is returned if the address has
     * not been set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/ChannelBinding.java
    public InetAddress getInitiatorAddress() {

    /**
     * Get the initiator's address for this channel binding.
     *
     * @return the initiator's address. <code>null</code> is returned if
     * the address has not been set.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/ChannelBinding.java
    public ChannelBinding(byte[] appData) {

    /**
     * Creates a ChannelBinding object without any addressing information.
     *
     * @param appData application supplied data to be used as part of the
     * channel bindings.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/ChannelBinding.java
    public ChannelBinding(InetAddress initAddr, InetAddress acceptAddr,
                        byte[] appData) {

    /**
     * Create a ChannelBinding object with user supplied address information
     * and data.  <code>null</code> values can be used for any fields which the
     * application does not want to specify.
     *
     * @param initAddr the address of the context initiator.
     * <code>null</code> value can be supplied to indicate that the
     * application does not want to set this value.
     * @param acceptAddr the address of the context
     * acceptor. <code>null</code> value can be supplied to indicate that
     * the application does not want to set this value.
     * @param appData application supplied data to be used as part of the
     * channel bindings. <code>null</code> value can be supplied to
     * indicate that the application does not want to set this value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/ChannelBinding.java
public class ChannelBinding {

/**
 * This class encapsulates the concept of caller-provided channel
 * binding information. Channel bindings are used to strengthen the
 * quality with which peer entity authentication is provided during
 * context establishment.  They enable the GSS-API callers to bind the
 * establishment of the security context to relevant characteristics
 * like addresses or to application specific data.<p>
 *
 * The caller initiating the security context must determine the
 * appropriate channel binding values to set in the GSSContext object.
 * The acceptor must provide an identical binding in order to validate
 * that received tokens possess correct channel-related characteristics.<p>
 *
 * Use of channel bindings is optional in GSS-API. ChannelBinding can be
 * set for the {@link GSSContext GSSContext} using the {@link
 * GSSContext#setChannelBinding(ChannelBinding) setChannelBinding} method
 * before the first call to {@link GSSContext#initSecContext(byte[], int, int)
 * initSecContext} or {@link GSSContext#acceptSecContext(byte[], int, int)
 * acceptSecContext} has been performed.  Unless the <code>setChannelBinding</code>
 * method has been used to set the ChannelBinding for a GSSContext object,
 * <code>null</code> ChannelBinding will be assumed. <p>
 *
 * Conceptually, the GSS-API concatenates the initiator and acceptor
 * address information, and the application supplied byte array to form an
 * octet string.  The mechanism calculates a MIC over this octet string and
 * binds the MIC to the context establishment token emitted by
 * <code>initSecContext</code> method of the <code>GSSContext</code>
 * interface.  The same bindings are set by the context acceptor for its
 * <code>GSSContext</code> object and during processing of the
 * <code>acceptSecContext</code> method a MIC is calculated in the same
 * way. The calculated MIC is compared with that found in the token, and if
 * the MICs differ, accept will throw a <code>GSSException</code> with the
 * major code set to {@link GSSException#BAD_BINDINGS BAD_BINDINGS}, and
 * the context will not be established. Some mechanisms may include the
 * actual channel binding data in the token (rather than just a MIC);
 * applications should therefore not use confidential data as
 * channel-binding components.<p>
 *
 *  Individual mechanisms may impose additional constraints on addresses
 *  that may appear in channel bindings.  For example, a mechanism may
 *  verify that the initiator address field of the channel binding
 *  contains the correct network address of the host system.  Portable
 *  applications should therefore ensure that they either provide correct
 *  information for the address fields, or omit setting of the addressing
 *  information.
 *
 * @author Mayank Upadhyay
 * @since 1.4
 */
