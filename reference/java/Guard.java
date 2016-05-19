_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/orbutil/fsm/Guard.java
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
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/corba/se/spi/orbutil/fsm/Guard.java
public interface Guard

/**
 *
 * @author Ken Cavanaugh
 */
