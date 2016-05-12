_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/Environment.java
    public abstract void clear();

    /**
     * Clears this <code>Environment</code> object of its exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/Environment.java
    public abstract void exception(java.lang.Exception except);

    /**
     * Inserts the given exception into this <code>Environment</code> object.
     *
     * @param except            the exception to be set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/Environment.java
    public abstract java.lang.Exception exception();

    /**
     * Retrieves the exception in this <code>Environment</code> object.
     *
     * @return                  the exception in this <code>Environment</code> object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/Environment.java
public abstract class Environment {

/**
 * A container (holder) for an exception that is used in <code>Request</code>
 * operations to make exceptions available to the client.  An
 * <code>Environment</code> object is created with the <code>ORB</code>
 * method <code>create_environment</code>.
 *
 * @since   JDK1.2
 */
