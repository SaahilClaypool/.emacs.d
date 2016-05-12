_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TypeCodePackage/BadKind.java
    public BadKind(String reason) {

    /**
     * Constructs a <code>BadKind</code> exception with the specified
     * reason message.
     * @param reason the String containing a reason message
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/TypeCodePackage/BadKind.java
public final class BadKind extends org.omg.CORBA.UserException {

/**
 * The exception <code>BadKind</code> is thrown when
 * an inappropriate operation is invoked on a <code>TypeCode</code> object. For example,
 * invoking the method <code>discriminator_type()</code> on an instance of
 * <code>TypeCode</code> that does not represent an IDL union will cause the
 * exception <code>BadKind</code> to be thrown.
 *
 * @see org.omg.CORBA.TypeCode
 * @since   JDK1.2
 */
