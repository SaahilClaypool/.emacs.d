_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/Guard.java
    public Result evaluate( FSM fsm, Input in ) ;

    /** Called by the state engine to determine whether a
    * transition is enabled, defered, or disabled.
    * The result is interpreted as follows:
    * <ul>
    * <li>ENABLED if the transition is ready to proceed
    * <li>DISABLED if the transition is not ready to proceed
    * <li>DEFERED if the action associated with the transition
    * is to be deferred.  This means that the input will not be
    * acted upon, but rather it will be saved for later execution.
    * Typically this is implemented using a CondVar wait, and the
    * blocked thread represents the defered input.  The defered
    * input is retried when the thread runs again.
    * </ul>
    *
    * @param FSM fsm is the state machine causing this action.
    * @param Input in is the input that caused the transition.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/Guard.java
public interface Guard

/**
 *
 * @author Ken Cavanaugh
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/Guard.java
    public Result evaluate( FSM fsm, Input in ) ;

    /** Called by the state engine to determine whether a
    * transition is enabled, defered, or disabled.
    * The result is interpreted as follows:
    * <ul>
    * <li>ENABLED if the transition is ready to proceed
    * <li>DISABLED if the transition is not ready to proceed
    * <li>DEFERED if the action associated with the transition
    * is to be deferred.  This means that the input will not be
    * acted upon, but rather it will be saved for later execution.
    * Typically this is implemented using a CondVar wait, and the
    * blocked thread represents the defered input.  The defered
    * input is retried when the thread runs again.
    * </ul>
    *
    * @param FSM fsm is the state machine causing this action.
    * @param Input in is the input that caused the transition.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/Guard.java
public interface Guard

/**
 *
 * @author Ken Cavanaugh
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Guard.java
    void checkGuard(Object object) throws SecurityException;

    /**
     * Determines whether or not to allow access to the guarded object
     * {@code object}. Returns silently if access is allowed.
     * Otherwise, throws a SecurityException.
     *
     * @param object the object being protected by the guard.
     *
     * @exception SecurityException if access is denied.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/security/Guard.java
public interface Guard {

/**
 * <p> This interface represents a guard, which is an object that is used
 * to protect access to another object.
 *
 * <p>This interface contains a single method, {@code checkGuard},
 * with a single {@code object} argument. {@code checkGuard} is
 * invoked (by the GuardedObject {@code getObject} method)
 * to determine whether or not to allow access to the object.
 *
 * @see GuardedObject
 *
 * @author Roland Schemers
 * @author Li Gong
 */
