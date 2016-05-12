_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/ByteOrder.java
    public String toString() {

    /**
     * Constructs a string describing this object.
     *
     * <p> This method returns the string <tt>"BIG_ENDIAN"</tt> for {@link
     * #BIG_ENDIAN} and <tt>"LITTLE_ENDIAN"</tt> for {@link #LITTLE_ENDIAN}.
     * </p>
     *
     * @return  The specified string
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/ByteOrder.java
    public static ByteOrder nativeOrder() {

    /**
     * Retrieves the native byte order of the underlying platform.
     *
     * <p> This method is defined so that performance-sensitive Java code can
     * allocate direct buffers with the same byte order as the hardware.
     * Native code libraries are often more efficient when such buffers are
     * used.  </p>
     *
     * @return  The native byte order of the hardware upon which this Java
     *          virtual machine is running
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/ByteOrder.java
    public static final ByteOrder LITTLE_ENDIAN

    /**
     * Constant denoting little-endian byte order.  In this order, the bytes of
     * a multibyte value are ordered from least significant to most
     * significant.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/ByteOrder.java
    public static final ByteOrder BIG_ENDIAN

    /**
     * Constant denoting big-endian byte order.  In this order, the bytes of a
     * multibyte value are ordered from most significant to least significant.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/nio/ByteOrder.java
public final class ByteOrder {

/**
 * A typesafe enumeration for byte orders.
 *
 * @author Mark Reinhold
 * @author JSR-51 Expert Group
 * @since 1.4
 */
