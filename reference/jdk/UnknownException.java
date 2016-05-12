_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/UnknownException.java
    public UnknownException(Throwable ex) {

    /**
     * Constructs an UnknownException object.
     * @param ex a Throwable object--to be wrapped in this exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/UnknownException.java
public class UnknownException extends org.omg.CORBA.SystemException {

/**
 * The org.omg.CORBA.portable.UnknownException is used for reporting
 * unknown exceptions between ties and ORBs and between ORBs and stubs.
 * It provides a Java representation of an UNKNOWN system exception
 * that has an UnknownExceptionInfo service context.
 * If the CORBA system exception org.omg.CORBA.portable.UnknownException
 * is thrown, then the stub does one of the following:
 * (1) Translates it to org.omg.CORBA.UNKNOWN.
 * (2) Translates it to the nested exception that the UnknownException contains.
 * (3) Passes it on directly to the user.
 */
