_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/UserException.java
    protected UserException(String reason) {

    /**
     * Constructs a <code>UserException</code> object with a
     * detail message. This method is called only by subclasses.
     *
     * @param reason a <code>String</code> object giving the reason for this
     *         exception
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/UserException.java
    protected UserException() {

    /**
     * Constructs a <code>UserException</code> object.
     * This method is called only by subclasses.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/UserException.java
public abstract class UserException extends java.lang.Exception implements org.omg.CORBA.portable.IDLEntity {

/**
 * The root class for CORBA IDL-defined user exceptions.
 * All CORBA user exceptions are checked exceptions, which
 * means that they need to
 * be declared in method signatures.
 *
 * @see <A href="../../../../technotes/guides/idl/jidlExceptions.html">documentation on
 * Java&nbsp;IDL exceptions</A>
 */
