_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/BerEncoder.java
  protected final void putOidValue(final long[] s) {

  /**
  * Put an oid and move the current position backward.
  *
  * @param s The oid to encode.
  */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/BerEncoder.java
  protected final void putStringValue(byte[] s) {

  /**
  * Put a byte string and move the current position backward.
  *
  * @param s The byte string to encode.
  */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/BerEncoder.java
  protected final void putIntegerValue(long v) {

  /**
  * Put an integer value expressed as a long.
  *
  * @param v The integer to encode.
  */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/BerEncoder.java
  protected final void putIntegerValue(int v) {

  /**
  * Put an integer value and move the current position backward.
  *
  * @param v The integer to encode.
  */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/BerEncoder.java
  protected final void putLength(final int length) {

  /**
  * Put a length and move the current position backward.
  *
  * @param length The length to encode.
  */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/BerEncoder.java
  /**

  ////////////////////////// PROTECTED ///////////////////////////////
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/BerEncoder.java
  public void closeSequence(int tag) {

  /**
  * Close a sequence with the specified tag.
  */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/BerEncoder.java
  public void closeSequence() {

  /**
  * Close a sequence.
  * The decode pull the stack to know the end of the current sequence.
  */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/BerEncoder.java
  public void openSequence() {

  /**
  * Open a sequence.
  * The encoder push the current position on its stack.
  */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/BerEncoder.java
  public void putAny(byte[] s, int byteCount) {

  /**
  * Put an <CODE>ANY</CODE> value. Only the first <CODE>byteCount</CODE> are considered.
  *
  * @param s The encoding of the <CODE>ANY</CODE> value.
  * @param byteCount The number of bytes of the encoding.
  */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/BerEncoder.java
  public void putAny(byte[] s) {

  /**
  * Put an <CODE>ANY</CODE> value. In fact, this method does not encode anything.
  * It simply copies the specified bytes into the encoding.
  *
  * @param s The encoding of the <CODE>ANY</CODE> value.
  */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/BerEncoder.java
  public void putNull(int tag) {

  /**
  * Put a <CODE>NULL</CODE> value with a specified tag.
  *
  * @param tag The tag to encode.
  */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/BerEncoder.java
  public void putNull() {

  /**
  * Put a <CODE>NULL</CODE> value.
  */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/BerEncoder.java
  public void putOid(long[] s, int tag) {

  /**
  * Put an object identifier with a specified tag.
  *
  * @param s The integer to encode.
  * @param tag The tag to encode.
  */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/BerEncoder.java
  public void putOid(long[] s) {

  /**
  * Put an object identifier.
  *
  * @param s The oid to encode.
  */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/BerEncoder.java
  public void putOctetString(byte[] s, int tag) {

  /**
  * Put an octet string with a specified tag.
  *
  * @param s The bytes to encode
  * @param tag The tag to encode.
  */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/BerEncoder.java
  public void putOctetString(byte[] s) {

  /**
  * Put an octet string.
  *
  * @param s The bytes to encode
  */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/BerEncoder.java
  public void putInteger(long v, int tag) {

  /**
  * Put an integer expressed as a long with the specified tag.
  *
  * @param v The long to encode
  * @param tag The tag to encode.
  */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/BerEncoder.java
  public void putInteger(long v) {

  /**
  * Put an integer expressed as a long.
  *
  * @param v The long to encode.
  */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/BerEncoder.java
  public void putInteger(int v, int tag) {

  /**
  * Put an integer with the specified tag.
  *
  * @param v The integer to encode.
  * @param tag The tag to encode.
  */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/BerEncoder.java
  public void putInteger(int v) {

  /**
  * Put an integer.
  *
  * @param v The integer to encode.
  */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/BerEncoder.java
  public int trim() {

  /**
  * Trim the encoding data and returns the length of the encoding.
  *
  * The encoder does backward encoding : so the bytes buffer is
  * filled from end to start. The encoded data must be shift before
  * the buffer can be used. This is the purpose of the <CODE>trim</CODE> method.
  *
  * After a call to the <CODE>trim</CODE> method, the encoder is reinitialized and <CODE>putXXX</CODE>
  * overwrite any existing encoded data.
  *
  * @return The length of the encoded data.
  */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/BerEncoder.java
  public BerEncoder(byte b[]) {

  /**
  * Constructs a new encoder and attaches it to the specified byte string.
  *
  * @param b The byte string containing the encoded data.
  */
_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/snmp/BerEncoder.java
public class BerEncoder {

/**
 * The <CODE>BerEncoder</CODE> class is used for encoding data using BER.
 *
 * A <CODE>BerEncoder</CODE> needs to be set up with a byte buffer. The encoded
 * data are stored in this byte buffer.
 * <P>
 * NOTE : the buffer is filled from end to start. This means the caller
 * needs to encode its data in the reverse order.
 *
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 *
 * @since 1.5
 */
