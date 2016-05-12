_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/InsufficientResourcesException.java
    private static final long serialVersionUID = 6227672693037844532L;

    /**
     * Use serialVersionUID from JNDI 1.1.1 for interoperability
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/InsufficientResourcesException.java
    public InsufficientResourcesException() {

    /**
      * Constructs a new instance of InsufficientResourcesException with
      * all name resolution fields and explanation initialized to null.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/InsufficientResourcesException.java
public class InsufficientResourcesException extends NamingException {

/**
  * This exception is thrown when resources are not available to complete
  * the requested operation. This might due to a lack of resources on
  * the server or on the client. There are no restrictions to resource types,
  * as different services might make use of different resources. Such
  * restrictions might be due to physical limits and/or administrative quotas.
  * Examples of limited resources are internal buffers, memory, network bandwidth.
  *<p>
  * InsufficientResourcesException is different from LimitExceededException in that
  * the latter is due to user/system specified limits. See LimitExceededException
  * for details.
  * <p>
  * Synchronization and serialization issues that apply to NamingException
  * apply directly here.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  * @since 1.3
  */
