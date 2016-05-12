_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  private final long[] fetchOidValue() throws BerException {

  /**
  * Fetch an oid and move the current position forward.
  *
  * @return The oid
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  private byte[] fetchStringValue() throws BerException {

  /**
  * Fetch a byte string and move the current position forward.
  *
  * @return The byte string
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  private final long fetchIntegerValueAsLong() throws BerException {

  /**
  * Fetch an integer value and return a long value.
  * FIX ME: someday we could have only on fetchIntegerValue() which always
  * returns a long value.
  *
  * @return The integer
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  private int fetchIntegerValue() throws BerException {

  /**
  * Fetch an integer value and move the current position forward.
  *
  * @return The integer
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  private final int fetchLength() throws BerException {

  /**
  * Fetch a length and move the current position forward.
  *
  * @return The length
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  /**

  ////////////////////////// PRIVATE ///////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public int getTag() throws BerException {

  /**
  * Get the tag of the data at the current position.
  * Current position is unchanged.
  *
  * @return The next tag.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public boolean cannotCloseSequence() {

  /**
  * Return <CODE>true</CODE> if the end of the current sequence is not reached.
  * When this method returns <CODE>false</CODE>, <CODE>closeSequence</CODE> can (and must) be
  * invoked.
  *
  * @return <CODE>true</CODE> if there is still some data in the sequence.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public void closeSequence() throws BerException {

  /**
  * Close a sequence.
  * The decode pull the stack and verifies that the current position
  * matches with the calculated end of the sequence. If not it throws
  * an exception.
  *
  * @exception BerException The sequence is not expected to finish here.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public void openSequence(int tag) throws BerException {

  /**
  * Fetch a sequence header with a specific tag.
  *
  * @param tag The expected tag.
  *
  * @exception BerException Current position does not point to a sequence header
  *                         or the tag is not the expected one.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public void openSequence() throws BerException {

  /**
  * Fetch a sequence header.
  * The decoder computes the end position of the sequence and push it
  * on its stack.
  *
  * @exception BerException Current position does not point to a sequence header.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public byte[] fetchAny(int tag) throws BerException {

  /**
  * Fetch an <CODE>ANY</CODE> value with a specific tag.
  *
  * @param tag The expected tag.
  *
  * @return The TLV as a byte array.
  *
  * @exception BerException The next TLV is really badly encoded...
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public byte[] fetchAny() throws BerException {

  /**
  * Fetch an <CODE>ANY</CODE> value. In fact, this method does not decode anything
  * it simply returns the next TLV as an array of bytes.
  *
  * @return The TLV as a byte array.
  *
  * @exception BerException The next TLV is really badly encoded...
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public void fetchNull(int tag) throws BerException {

  /**
  * Fetch a <CODE>NULL</CODE> value with a specified tag.
  *
  * @param tag The expected tag.
  *
  * @exception BerException Current position does not point to
  *            <CODE>NULL</CODE> value or the tag is not the expected one.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public void fetchNull() throws BerException {

  /**
  * Fetch a <CODE>NULL</CODE> value.
  *
  * @exception BerException Current position does not point to <CODE>NULL</CODE> value.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public long[] fetchOid(int tag) throws BerException {

  /**
  * Fetch an object identifier with a specified tag.
  *
  * @param tag The expected tag.
  *
  * @return The decoded object identifier as an array of long.
  *
  * @exception BerException Current position does not point to an oid
  *                         or the tag is not the expected one.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public long[] fetchOid() throws BerException {

  /**
  * Fetch an object identifier.
  *
  * @return The decoded object identifier as an array of long.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public byte[] fetchOctetString(int tag) throws BerException {

  /**
  * Fetch an octet string with a specified tag.
  *
  * @param tag The expected tag.
  *
  * @return The decoded string.
  *
  * @exception BerException Current position does not point to an octet string
  *                         or the tag is not the expected one.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public byte[] fetchOctetString() throws BerException {

  /**
  * Fetch an octet string.
  *
  * @return The decoded string.
  *
  * @exception BerException Current position does not point to an octet string.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public long fetchIntegerAsLong(int tag) throws BerException {

  /**
  * Fetch an integer with the specified tag and return a long value.
  *
  * @param tag The expected tag.
  *
  * @return The decoded integer.
  *
  * @exception BerException Current position does not point to an integer
  *                         or the tag is not the expected one.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public long fetchIntegerAsLong() throws BerException {

  /**
  * Fetch an integer and return a long value.
  *
  * @return The decoded integer.
  *
  * @exception BerException Current position does not point to an integer.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public int fetchInteger(int tag) throws BerException {

  /**
  * Fetch an integer with the specified tag.
  *
  * @param tag The expected tag.
  *
  * @return The decoded integer.
  *
  * @exception BerException Current position does not point to an integer
  *                         or the tag is not the expected one.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public int fetchInteger() throws BerException {

  /**
  * Fetch an integer.
  *
  * @return The decoded integer.
  *
  * @exception BerException Current position does not point to an integer.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public BerDecoder(byte b[]) {

  /**
  * Constructs a new decoder and attaches it to the specified byte string.
  *
  * @param b The byte string containing the encoded data.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
public class BerDecoder {

/**
 * The <CODE>BerDecoder</CODE> class is used for decoding
 * BER-encoded data.
 *
 * A <CODE>BerDecoder</CODE> needs to be set up with the byte string containing
 * the encoding. It maintains a current position in the byte string.
 *
 * Methods allows to fetch integer, string, OID, etc., from the current
 * position. After a fetch the current position is moved forward.
 *
 * A fetch throws a <CODE>BerException</CODE> if the encoding is not of the
 * expected type.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 *
 * @since 1.5
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  private final long[] fetchOidValue() throws BerException {

  /**
  * Fetch an oid and move the current position forward.
  *
  * @return The oid
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  private byte[] fetchStringValue() throws BerException {

  /**
  * Fetch a byte string and move the current position forward.
  *
  * @return The byte string
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  private final long fetchIntegerValueAsLong() throws BerException {

  /**
  * Fetch an integer value and return a long value.
  * FIX ME: someday we could have only on fetchIntegerValue() which always
  * returns a long value.
  *
  * @return The integer
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  private int fetchIntegerValue() throws BerException {

  /**
  * Fetch an integer value and move the current position forward.
  *
  * @return The integer
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  private final int fetchLength() throws BerException {

  /**
  * Fetch a length and move the current position forward.
  *
  * @return The length
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  /**

  ////////////////////////// PRIVATE ///////////////////////////////
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public int getTag() throws BerException {

  /**
  * Get the tag of the data at the current position.
  * Current position is unchanged.
  *
  * @return The next tag.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public boolean cannotCloseSequence() {

  /**
  * Return <CODE>true</CODE> if the end of the current sequence is not reached.
  * When this method returns <CODE>false</CODE>, <CODE>closeSequence</CODE> can (and must) be
  * invoked.
  *
  * @return <CODE>true</CODE> if there is still some data in the sequence.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public void closeSequence() throws BerException {

  /**
  * Close a sequence.
  * The decode pull the stack and verifies that the current position
  * matches with the calculated end of the sequence. If not it throws
  * an exception.
  *
  * @exception BerException The sequence is not expected to finish here.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public void openSequence(int tag) throws BerException {

  /**
  * Fetch a sequence header with a specific tag.
  *
  * @param tag The expected tag.
  *
  * @exception BerException Current position does not point to a sequence header
  *                         or the tag is not the expected one.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public void openSequence() throws BerException {

  /**
  * Fetch a sequence header.
  * The decoder computes the end position of the sequence and push it
  * on its stack.
  *
  * @exception BerException Current position does not point to a sequence header.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public byte[] fetchAny(int tag) throws BerException {

  /**
  * Fetch an <CODE>ANY</CODE> value with a specific tag.
  *
  * @param tag The expected tag.
  *
  * @return The TLV as a byte array.
  *
  * @exception BerException The next TLV is really badly encoded...
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public byte[] fetchAny() throws BerException {

  /**
  * Fetch an <CODE>ANY</CODE> value. In fact, this method does not decode anything
  * it simply returns the next TLV as an array of bytes.
  *
  * @return The TLV as a byte array.
  *
  * @exception BerException The next TLV is really badly encoded...
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public void fetchNull(int tag) throws BerException {

  /**
  * Fetch a <CODE>NULL</CODE> value with a specified tag.
  *
  * @param tag The expected tag.
  *
  * @exception BerException Current position does not point to
  *            <CODE>NULL</CODE> value or the tag is not the expected one.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public void fetchNull() throws BerException {

  /**
  * Fetch a <CODE>NULL</CODE> value.
  *
  * @exception BerException Current position does not point to <CODE>NULL</CODE> value.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public long[] fetchOid(int tag) throws BerException {

  /**
  * Fetch an object identifier with a specified tag.
  *
  * @param tag The expected tag.
  *
  * @return The decoded object identifier as an array of long.
  *
  * @exception BerException Current position does not point to an oid
  *                         or the tag is not the expected one.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public long[] fetchOid() throws BerException {

  /**
  * Fetch an object identifier.
  *
  * @return The decoded object identifier as an array of long.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public byte[] fetchOctetString(int tag) throws BerException {

  /**
  * Fetch an octet string with a specified tag.
  *
  * @param tag The expected tag.
  *
  * @return The decoded string.
  *
  * @exception BerException Current position does not point to an octet string
  *                         or the tag is not the expected one.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public byte[] fetchOctetString() throws BerException {

  /**
  * Fetch an octet string.
  *
  * @return The decoded string.
  *
  * @exception BerException Current position does not point to an octet string.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public long fetchIntegerAsLong(int tag) throws BerException {

  /**
  * Fetch an integer with the specified tag and return a long value.
  *
  * @param tag The expected tag.
  *
  * @return The decoded integer.
  *
  * @exception BerException Current position does not point to an integer
  *                         or the tag is not the expected one.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public long fetchIntegerAsLong() throws BerException {

  /**
  * Fetch an integer and return a long value.
  *
  * @return The decoded integer.
  *
  * @exception BerException Current position does not point to an integer.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public int fetchInteger(int tag) throws BerException {

  /**
  * Fetch an integer with the specified tag.
  *
  * @param tag The expected tag.
  *
  * @return The decoded integer.
  *
  * @exception BerException Current position does not point to an integer
  *                         or the tag is not the expected one.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public int fetchInteger() throws BerException {

  /**
  * Fetch an integer.
  *
  * @return The decoded integer.
  *
  * @exception BerException Current position does not point to an integer.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
  public BerDecoder(byte b[]) {

  /**
  * Constructs a new decoder and attaches it to the specified byte string.
  *
  * @param b The byte string containing the encoded data.
  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/BerDecoder.java
public class BerDecoder {

/**
 * The <CODE>BerDecoder</CODE> class is used for decoding
 * BER-encoded data.
 *
 * A <CODE>BerDecoder</CODE> needs to be set up with the byte string containing
 * the encoding. It maintains a current position in the byte string.
 *
 * Methods allows to fetch integer, string, OID, etc., from the current
 * position. After a fetch the current position is moved forward.
 *
 * A fetch throws a <CODE>BerException</CODE> if the encoding is not of the
 * expected type.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 *
 * @since 1.5
 */
