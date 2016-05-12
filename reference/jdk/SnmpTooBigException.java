_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpTooBigException.java
  private int varBindCount ;

  /**
   * The <CODE>varBindCount</CODE>.
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpTooBigException.java
  public int getVarBindCount() {

  /**
   * Returns the number of <CODE>SnmpVarBind</CODE> successfully
   * encoded before the exception was thrown.
   *
   * @return A positive integer (0 means the number is unknown).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpTooBigException.java
  public SnmpTooBigException(int n) {

  /**
   * Builds an <CODE>SnmpTooBigException</CODE> with
   * <CODE>varBindCount</CODE> set to the specified value.
   * @param n The <CODE>varBindCount</CODE> value.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpTooBigException.java
  public SnmpTooBigException() {

  /**
   * Builds an <CODE>SnmpTooBigException</CODE> with
   * <CODE>varBindCount</CODE> set to 0.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpTooBigException.java
public class SnmpTooBigException extends Exception {

/**
 * Is used internally to signal that the size of a PDU exceeds the packet size limitation.
 * <p>
 * You will not usually need to use this class, except if you
 * decide to implement your own
 * {@link com.sun.jmx.snmp.SnmpPduFactory SnmPduFactory} object.
 * <p>
 * The <CODE>varBindCount</CODE> property contains the
 * number of <CODE>SnmpVarBind</CODE> successfully encoded
 * before the exception was thrown. Its value is 0
 * when this number is unknown.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpTooBigException.java
  private int varBindCount ;

  /**
   * The <CODE>varBindCount</CODE>.
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpTooBigException.java
  public int getVarBindCount() {

  /**
   * Returns the number of <CODE>SnmpVarBind</CODE> successfully
   * encoded before the exception was thrown.
   *
   * @return A positive integer (0 means the number is unknown).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpTooBigException.java
  public SnmpTooBigException(int n) {

  /**
   * Builds an <CODE>SnmpTooBigException</CODE> with
   * <CODE>varBindCount</CODE> set to the specified value.
   * @param n The <CODE>varBindCount</CODE> value.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpTooBigException.java
  public SnmpTooBigException() {

  /**
   * Builds an <CODE>SnmpTooBigException</CODE> with
   * <CODE>varBindCount</CODE> set to 0.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/SnmpTooBigException.java
public class SnmpTooBigException extends Exception {

/**
 * Is used internally to signal that the size of a PDU exceeds the packet size limitation.
 * <p>
 * You will not usually need to use this class, except if you
 * decide to implement your own
 * {@link com.sun.jmx.snmp.SnmpPduFactory SnmPduFactory} object.
 * <p>
 * The <CODE>varBindCount</CODE> property contains the
 * number of <CODE>SnmpVarBind</CODE> successfully encoded
 * before the exception was thrown. Its value is 0
 * when this number is unknown.
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
