_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/Oid.java
    public int hashCode() {

    /**
     * Returns a hashcode value for this Oid.
     *
     * @return a hashCode value
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/Oid.java
    public boolean containedIn(Oid[] oids) {

    /**
     * A utility method to test if this Oid value is contained within the
     * supplied Oid array.
     *
     * @param oids the array of Oid's to search
     * @return true if the array contains this Oid value, false otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/Oid.java
    public byte[] getDER() throws GSSException {

    /**
     * Returns the full ASN.1 DER encoding for this oid object, which
     * includes the tag and length.
     *
     * @return byte array containing the DER encoding of this oid object.
     * @exception GSSException may be thrown when the oid can't be encoded
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/Oid.java
    public boolean equals(Object other) {

    /**
     * Tests if two Oid objects represent the same Object identifier
     * value.
     *
     * @return <code>true</code> if the two Oid objects represent the same
     * value, <code>false</code> otherwise.
     * @param other the Oid object that has to be compared to this one
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/Oid.java
    public String toString() {

    /**
     * Returns a string representation of the oid's integer components
     * in dot separated notation.
     *
     * @return string representation in the following format: "1.2.3.4.5"
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/Oid.java
    static Oid getInstance(String strOid) {

    /**
     * Only for calling by initializators used with declarations.
     *
     * @param strOid
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/Oid.java
    public Oid(byte [] data) throws GSSException {

    /**
     * Creates an Oid object from its ASN.1 DER encoding.  This refers to
     * the full encoding including tag and length.  The structure and
     * encoding of Oids is defined in ISOIEC-8824 and ISOIEC-8825.  This
     * method is identical in functionality to its InputStream conterpart.
     *
     * @param data byte array containing the DER encoded oid
     * @exception GSSException may be thrown when the DER encoding does not
     *     follow the prescribed format.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/Oid.java
    public Oid(InputStream derOid) throws GSSException {

    /**
     * Creates an Oid object from its ASN.1 DER encoding.  This refers to
     * the full encoding including tag and length.  The structure and
     * encoding of Oids is defined in ISOIEC-8824 and ISOIEC-8825.  This
     * method is identical in functionality to its byte array counterpart.
     *
     * @param derOid stream containing the DER encoded oid
     * @exception GSSException may be thrown when the DER encoding does not
     *  follow the prescribed format.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/Oid.java
    public Oid(String strOid) throws GSSException {

    /**
     * Constructs an Oid object from a string representation of its
     * integer components.
     *
     * @param strOid the dot separated string representation of the oid.
     * For instance, "1.2.840.113554.1.2.2".
     * @exception GSSException may be thrown when the string is incorrectly
     *     formatted
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/ietf/jgss/Oid.java
public class Oid {

/**
 * This class represents Universal Object Identifiers (Oids) and their
 * associated operations.<p>
 *
 * Oids are hierarchically globally-interpretable identifiers used
 * within the GSS-API framework to identify mechanisms and name formats.<p>
 *
 * The structure and encoding of Oids is defined in ISOIEC-8824 and
 * ISOIEC-8825.  For example the Oid representation of Kerberos V5
 * mechanism is "1.2.840.113554.1.2.2"<p>
 *
 * The GSSName name class contains public static Oid objects
 * representing the standard name types defined in GSS-API.
 *
 * @author Mayank Upadhyay
 * @since 1.4
 */
