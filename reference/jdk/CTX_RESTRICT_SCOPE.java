_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/CTX_RESTRICT_SCOPE.java
  int value = 15;

/**
 * The field containing the <code>int</code> value of a
 * <code>CTX_RESTRICT_SCOPE</code> flag.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/CTX_RESTRICT_SCOPE.java
public interface CTX_RESTRICT_SCOPE {

/**
 * A flag that can be used as the second parameter to the method
 * <code>Context.get_values</code> to restrict the search scope.
 * When this flag is used, it restricts the search for
 * context values to this particular <code>Context</code> object
 * or to the scope specified in the first parameter to
 * <code>Context.get_values</code>.
 * <P>
 * Usage:
 * <PRE>
 *     NVList props = myContext.get_values("_USER",
 *                     CTX_RESTRICT_SCOPE.value, "id*");
 * </PRE>
 *
 * @see org.omg.CORBA.Context#get_values(String, int, String)
 * @since   JDK1.2
 */
