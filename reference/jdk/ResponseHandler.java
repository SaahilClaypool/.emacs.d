_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ResponseHandler.java
    OutputStream createExceptionReply();

    /**
     * Called by the servant during a method invocation. The servant
     * should call this method to create a reply marshal buffer if a
     * user exception occurred.
     *
     * @return an OutputStream suitable for marshalling the exception
     * ID and the user exception body.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/portable/ResponseHandler.java
public interface ResponseHandler {

/**
This interface is supplied by an ORB to a servant at invocation time and allows
the servant to later retrieve an OutputStream for returning the invocation results.
*/
