_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/FSMImpl.java
    public void doIt( Input in )

    /** Perform the transition for the given input in the current state.  This proceeds as follows:
    * <p>Let S be the current state of the FSM.
    * If there are guarded actions for S with input in, evaluate their guards successively until
    * all have been evaluted, or one returns a non-DISABLED Result.
    * <ol>
    * <li>If a DEFERED result is returned, retry the input
    * <li>If a ENABLED result is returned, the action for the guarded action
    * is the current action
    * <li>Otherwise there is no enabled action.  If S has a default action and next state, use them; otherwise
    * use the state engine default action (the next state is always the current state).
    * </ol>
    * After the action is available, the transition proceeds as follows:
    * <ol>
    * <li>If the next state is not the current state, execute the current state postAction method.
    * <li>Execute the action.
    * <li>If the next state is not the current state, execute the next state preAction method.
    * <li>Set the current state to the next state.
    * </ol>
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/FSMImpl.java
    public State getState()

    /** Return the current state.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/FSMImpl.java
    public FSMImpl( StateEngine se, State startState )

    /** Create an instance of an FSM using the StateEngine
    * in a particular start state.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/FSMImpl.java
public class FSMImpl implements FSM

/**
 * This is the main class that represents an instance of a state machine
 * using a state engine.  It may be used as a base class, in which case
 * the guards and actions have access to the derived class.
 *
 * @author Ken Cavanaugh
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/FSMImpl.java
    public void doIt( Input in )

    /** Perform the transition for the given input in the current state.  This proceeds as follows:
    * <p>Let S be the current state of the FSM.
    * If there are guarded actions for S with input in, evaluate their guards successively until
    * all have been evaluted, or one returns a non-DISABLED Result.
    * <ol>
    * <li>If a DEFERED result is returned, retry the input
    * <li>If a ENABLED result is returned, the action for the guarded action
    * is the current action
    * <li>Otherwise there is no enabled action.  If S has a default action and next state, use them; otherwise
    * use the state engine default action (the next state is always the current state).
    * </ol>
    * After the action is available, the transition proceeds as follows:
    * <ol>
    * <li>If the next state is not the current state, execute the current state postAction method.
    * <li>Execute the action.
    * <li>If the next state is not the current state, execute the next state preAction method.
    * <li>Set the current state to the next state.
    * </ol>
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/FSMImpl.java
    public State getState()

    /** Return the current state.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/FSMImpl.java
    public FSMImpl( StateEngine se, State startState )

    /** Create an instance of an FSM using the StateEngine
    * in a particular start state.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/FSMImpl.java
public class FSMImpl implements FSM

/**
 * This is the main class that represents an instance of a state machine
 * using a state engine.  It may be used as a base class, in which case
 * the guards and actions have access to the derived class.
 *
 * @author Ken Cavanaugh
 */
