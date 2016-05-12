_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/UnknownGroupException.java
    public UnknownGroupException(String s) {

    /**
     * Constructs an <code>UnknownGroupException</code> with the specified
     * detail message.
     *
     * @param s the detail message
     * @since 1.2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/UnknownGroupException.java
    private static final long serialVersionUID = 7056094974750002460L;

    /** indicate compatibility with the Java 2 SDK v1.2 version of class */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/rmi/activation/UnknownGroupException.java
public class UnknownGroupException extends ActivationException {

/**
 * An <code>UnknownGroupException</code> is thrown by methods of classes and
 * interfaces in the <code>java.rmi.activation</code> package when the
 * <code>ActivationGroupID</code> parameter to the method is determined to be
 * invalid, i.e., not known by the <code>ActivationSystem</code>.  An
 * <code>UnknownGroupException</code> is also thrown if the
 * <code>ActivationGroupID</code> in an <code>ActivationDesc</code> refers to
 * a group that is not registered with the <code>ActivationSystem</code>
 *
 * @author  Ann Wollrath
 * @since   1.2
 * @see     java.rmi.activation.Activatable
 * @see     java.rmi.activation.ActivationGroup
 * @see     java.rmi.activation.ActivationGroupID
 * @see     java.rmi.activation.ActivationMonitor
 * @see     java.rmi.activation.ActivationSystem
 */
