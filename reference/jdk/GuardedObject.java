_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/GuardedObject.java
    private void writeObject(java.io.ObjectOutputStream oos)

    /**
     * Writes this object out to a stream (i.e., serializes it).
     * We check the guard if there is one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/GuardedObject.java
    public Object getObject()

    /**
     * Retrieves the guarded object, or throws an exception if access
     * to the guarded object is denied by the guard.
     *
     * @return the guarded object.
     *
     * @exception SecurityException if access to the guarded object is
     * denied.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/GuardedObject.java
    public GuardedObject(Object object, Guard guard)

    /**
     * Constructs a GuardedObject using the specified object and guard.
     * If the Guard object is null, then no restrictions will
     * be placed on who can access the object.
     *
     * @param object the object to be guarded.
     *
     * @param guard the Guard object that guards access to the object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/GuardedObject.java
public class GuardedObject implements java.io.Serializable {

/**
 * A GuardedObject is an object that is used to protect access to
 * another object.
 *
 * <p>A GuardedObject encapsulates a target object and a Guard object,
 * such that access to the target object is possible
 * only if the Guard object allows it.
 * Once an object is encapsulated by a GuardedObject,
 * access to that object is controlled by the {@code getObject}
 * method, which invokes the
 * {@code checkGuard} method on the Guard object that is
 * guarding access. If access is not allowed,
 * an exception is thrown.
 *
 * @see Guard
 * @see Permission
 *
 * @author Roland Schemers
 * @author Li Gong
 */
