_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicationException.java
    public Throwable getTargetException() {

    /**
     * Get the thrown target exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicationException.java
    public CommunicationException(String msg) {

    /**
     * Constructs a CommunicationException with a detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicationException.java
    public CommunicationException(Throwable target, String msg) {

    /**
     * Constructs a CommunicationException with a target exception
     * and a detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicationException.java
    public CommunicationException(Throwable target) {

    /**
     * Constructs a CommunicationException with a target exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicationException.java
public class CommunicationException extends javax.management.JMRuntimeException {

/**
 * Represents exceptions raised due to communications problems,
 * for example when a managed object server is out of reach.<p>
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicationException.java
    public Throwable getTargetException() {

    /**
     * Get the thrown target exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicationException.java
    public CommunicationException(String msg) {

    /**
     * Constructs a CommunicationException with a detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicationException.java
    public CommunicationException(Throwable target, String msg) {

    /**
     * Constructs a CommunicationException with a target exception
     * and a detail message.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicationException.java
    public CommunicationException(Throwable target) {

    /**
     * Constructs a CommunicationException with a target exception.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/jmx/snmp/daemon/CommunicationException.java
public class CommunicationException extends javax.management.JMRuntimeException {

/**
 * Represents exceptions raised due to communications problems,
 * for example when a managed object server is out of reach.<p>
 *
 * <p><b>This API is a Sun Microsystems internal API  and is subject
 * to change without notice.</b></p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/CommunicationException.java
    private static final long serialVersionUID = 3618507780299986611L;

    /**
     * Use serialVersionUID from JNDI 1.1.1 for interoperability
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/CommunicationException.java
    public CommunicationException() {

    /**
      * Constructs a new instance of CommunicationException.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/naming/CommunicationException.java
public class CommunicationException extends NamingException {

/**
  * This exception is thrown when the client is
  * unable to communicate with the directory or naming service.
  * The inability to communicate with the service might be a result
  * of many factors, such as network partitioning, hardware or interface problems,
  * failures on either the client or server side.
  * This exception is meant to be used to capture such communication problems.
  * <p>
  * Synchronization and serialization issues that apply to NamingException
  * apply directly here.
  *
  * @author Rosanna Lee
  * @author Scott Seligman
  * @since 1.3
  */
