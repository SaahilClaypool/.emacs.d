_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/Control.java
    public byte[] getEncodedValue();

    /**
      * Retrieves the ASN.1 BER encoded value of the LDAP control.
      * The result is the raw BER bytes including the tag and length of
      * the control's value. It does not include the controls OID or criticality.
      *
      * Null is returned if the value is absent.
      *
      * @return A possibly null byte array representing the ASN.1 BER encoded
      *         value of the LDAP control.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/Control.java
    public boolean isCritical();

    /**
      * Determines the criticality of the LDAP control.
      * A critical control must not be ignored by the server.
      * In other words, if the server receives a critical control
      * that it does not support, regardless of whether the control
      * makes sense for the operation, the operation will not be performed
      * and an <tt>OperationNotSupportedException</tt> will be thrown.
      * @return true if this control is critical; false otherwise.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/Control.java
    public String getID();

    /**
      * Retrieves the object identifier assigned for the LDAP control.
      *
      * @return The non-null object identifier string.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/Control.java
    public static final boolean NONCRITICAL = false;

    /**
      * Indicates a non-critical control.
      * The value of this constant is <tt>false</tt>.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/ldap/Control.java
public interface Control extends java.io.Serializable {

/**
  * This interface represents an LDAPv3 control as defined in
  * <A HREF="http://www.ietf.org/rfc/rfc2251.txt">RFC 2251</A>.
  *<p>
  * The LDAPv3 protocol uses controls to send and receive additional data
  * to affect the behavior of predefined operations.
  * Controls can be sent along with any LDAP operation to the server.
  * These are referred to as <em>request controls</em>. For example, a
  * "sort" control can be sent with an LDAP search operation to
  * request that the results be returned in a particular order.
  * Solicited and unsolicited controls can also be returned with
  * responses from the server. Such controls are referred to as
  * <em>response controls</em>. For example, an LDAP server might
  * define a special control to return change notifications.
  *<p>
  * This interface is used to represent both request and response controls.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  * @author Vincent Ryan
  *
  * @see ControlFactory
  * @since 1.3
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/Control.java
        public final String toString() {

        /**
         * Provides the <code>String</code> representation of the control type.  This <code>String</code> is
         * the same name that was passed to the constructor.
         *
         * @return the control type name
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/Control.java
        public final int hashCode() {

        /**
         * Finalizes the hashCode method
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/Control.java
        public final boolean equals(Object obj) {

        /**
         * Finalizes the equals method
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/Control.java
        protected Type(String name) {

        /**
         * Constructs a new control type with the name specified.
         * The name should be a descriptive string appropriate for
         * labelling the control in an application, such as "Gain" or "Balance."
         * @param name  the name of the new control type.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/Control.java
        private String name;

        /**
         * Type name.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/Control.java
    public static class Type {

    /**
     * An instance of the <code>Type</code> class represents the type of
     * the control.  Static instances are provided for the
     * common types.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/Control.java
    public String toString() {

    /**
     * Obtains a String describing the control type and its current state.
     * @return a String representation of the Control.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/Control.java
    public Type getType() {

    /**
     * Obtains the control's type.
     * @return the control's type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/Control.java
    protected Control(Type type) {

    /**
     * Constructs a Control with the specified type.
     * @param type the kind of control desired
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/Control.java
    private final Type type;

    /**
     * The control type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/sound/sampled/Control.java
public abstract class Control {

/**
 * {@link Line Lines} often have a set of controls, such as gain and pan, that affect
 * the audio signal passing through the line.  Java Sound's <code>Line</code> objects
 * let you obtain a particular control object by passing its class as the
 * argument to a {@link Line#getControl(Control.Type) getControl} method.
 * <p>
 * Because the various types of controls have different purposes and features,
 * all of their functionality is accessed from the subclasses that define
 * each kind of control.
 *
 * @author Kara Kytle
 *
 * @see Line#getControls
 * @see Line#isControlSupported
 * @since 1.3
 */
