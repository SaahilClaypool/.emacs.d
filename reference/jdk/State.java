_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/State.java
    void postAction( FSM fsm ) ;

    /** Method that defines action that occurs whenever this state is exited.
    * Any exceptions thrown by this method are ignored.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/State.java
    void preAction( FSM fsm ) ;

    /** Method that defines action that occurs whenever this state is entered.
    * Any exceptions thrown by this method are ignored.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/State.java
public interface State

/**
 * This interface must be implemented by any class that is used as
 * a state in a FSM.  The FSM only needs the identity of this
 * object, so all that is really needs is the default equals implementation.
 * The toString() method should also be overridden to give a concise
 * description or name of the state.  The StateImpl class handles this.
 * <P>
 * Pre- and post- actions are taken only on completed transitions between
 * different states.  Assume that the FSM is in state A, and the FSM will
 * transition to state B under input I with action X.  If A != B and X completes
 * successfully, then after X completes execution, A.postAction is executed,
 * followed by B.preAction.
 *
 * @author Ken Cavanaugh
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/State.java
    void postAction( FSM fsm ) ;

    /** Method that defines action that occurs whenever this state is exited.
    * Any exceptions thrown by this method are ignored.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/State.java
    void preAction( FSM fsm ) ;

    /** Method that defines action that occurs whenever this state is entered.
    * Any exceptions thrown by this method are ignored.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/spi/orbutil/fsm/State.java
public interface State

/**
 * This interface must be implemented by any class that is used as
 * a state in a FSM.  The FSM only needs the identity of this
 * object, so all that is really needs is the default equals implementation.
 * The toString() method should also be overridden to give a concise
 * description or name of the state.  The StateImpl class handles this.
 * <P>
 * Pre- and post- actions are taken only on completed transitions between
 * different states.  Assume that the FSM is in state A, and the FSM will
 * transition to state B under input I with action X.  If A != B and X completes
 * successfully, then after X completes execution, A.postAction is executed,
 * followed by B.preAction.
 *
 * @author Ken Cavanaugh
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/State.java
    protected abstract boolean isInState(T c);

    /**
     * <p>Gets whether the specified JComponent is in the custom state represented
     * by this class. <em>This is an extremely performance sensitive loop.</em>
     * Please take proper precautions to ensure that it executes quickly.</p>
     *
     * <p>Nimbus uses this method to help determine what state a JComponent is
     * in. For example, a custom State could exist for JProgressBar such that
     * it would return <code>true</code> when the progress bar is indeterminate.
     * Such an implementation of this method would simply be:</p>
     *
     * <pre><code> return c.isIndeterminate();</code></pre>
     *
     * @param c the JComponent to test. This will never be null.
     * @return true if <code>c</code> is in the custom state represented by
     *         this <code>State</code> instance
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/State.java
    boolean isInState(T c, int s) {

    /**
     * <p>This is the main entry point, called by NimbusStyle.</p>
     *
     * <p>There are both custom states and standard states. Standard states
     * correlate to the states defined in SynthConstants. When a UI delegate
     * constructs a SynthContext, it specifies the state that the component is
     * in according to the states defined in SynthConstants. Our NimbusStyle
     * will then take this state, and query each State instance in the style
     * asking whether isInState(c, s).</p>
     *
     * <p>Now, only the standard states care about the "s" param. So we have
     * this odd arrangement:</p>
     * <ul>
     *     <li>NimbusStyle calls State.isInState(c, s)</li>
     *     <li>State.isInState(c, s) simply delegates to State.isInState(c)</li>
     *     <li><em>EXCEPT</em>, StandardState overrides State.isInState(c, s) and
     *         returns directly from that method after checking its state, and
     *         does not call isInState(c) (since it is not needed for standard states).</li>
     * </ul>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/State.java
    protected State(String name) {

    /**
     * <p>Create a new custom State. Specify the name for the state. The name should
     * be unique within the states set for any one particular component.
     * The name of the state should coincide with the name used in UIDefaults.</p>
     *
     * <p>For example, the following would be correct:</p>
     * <pre><code>
     *     defaults.put("Button.States", "Enabled, Foo, Disabled");
     *     defaults.put("Button.Foo", new FooState("Foo"));
     * </code></pre>
     *
     * @param name a simple user friendly name for the state, such as "Indeterminate"
     *        or "EmbeddedPanel" or "Blurred". It is customary to use camel case,
     *        with the first letter capitalized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/plaf/nimbus/State.java
public abstract class State<T extends JComponent>{

/**
 * <p>Represents a built in, or custom, state in Nimbus.</p>
 *
 * <p>Synth provides several built in states, which are:
 * <ul>
 *  <li>Enabled</li>
 *  <li>Mouse Over</li>
 *  <li>Pressed</li>
 *  <li>Disabled</li>
 *  <li>Focused</li>
 *  <li>Selected</li>
 *  <li>Default</li>
 * </ul>
 *
 * <p>However, there are many more states that could be described in a LookAndFeel, and it
 * would be nice to style components differently based on these different states.
 * For example, a progress bar could be "indeterminate". It would be very convenient
 * to allow this to be defined as a "state".</p>
 *
 * <p>This class, State, is intended to be used for such situations.
 * Simply implement the abstract #isInState method. It returns true if the given
 * JComponent is "in this state", false otherwise. This method will be called
 * <em>many</em> times in <em>performance sensitive loops</em>. It must execute
 * very quickly.</p>
 *
 * <p>For example, the following might be an implementation of a custom
 * "Indeterminate" state for JProgressBars:</p>
 *
 * <pre><code>
 *     public final class IndeterminateState extends State&lt;JProgressBar&gt; {
 *         public IndeterminateState() {
 *             super("Indeterminate");
 *         }
 *
 *         &#64;Override
 *         protected boolean isInState(JProgressBar c) {
 *             return c.isIndeterminate();
 *         }
 *     }
 * </code></pre>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableServer/POAManagerPackage/State.java
public class State implements org.omg.CORBA.portable.IDLEntity

/**
	 * Specifies the states for the POAManager
	 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/PortableServer/POAManagerPackage/State.java


/**
* org/omg/PortableServer/POAManagerPackage/State.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/workspace/8-2-build-windows-amd64-cygwin/jdk8u65/4987/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Tuesday, October 6, 2015 4:40:34 PM PDT
*/
