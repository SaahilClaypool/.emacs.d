_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SequencedEvent.java
    final void dispose() {

    /**
     * Disposes of this instance. This method is invoked once the nested event
     * has been dispatched and handled, or when the peer of the target of the
     * nested event has been disposed with a call to Component.removeNotify.
     *
     * NOTE: Locking protocol.  Since SunToolkit.postEvent can get EventQueue lock,
     * it shall never be called while holding the lock on the list,
     * as EventQueue lock is held during dispatching and dispatch() will get
     * lock on the list. The locks should be acquired in the same order.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SequencedEvent.java
    public final boolean isFirstOrDisposed() {

    /**
     * Sequenced events are dispatched in order, so we cannot dispatch
     * until we are the first sequenced event in the queue (i.e. it's our
     * turn).  But while we wait for our turn to dispatch, the event
     * could have been disposed for a number of reasons.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SequencedEvent.java
    private final static boolean isOwnerAppContextDisposed(SequencedEvent se) {

    /**
     * true only if event exists and nested source appContext is disposed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SequencedEvent.java
    public final void dispatch() {

    /**
     * Dispatches the nested event after all previous nested events have been
     * dispatched or disposed. If this method is invoked before all previous nested events
     * have been dispatched, then this method blocks until such a point is
     * reached.
     * While waiting disposes nested events to disposed AppContext
     *
     * NOTE: Locking protocol.  Since dispose() can get EventQueue lock,
     * dispatch() shall never call dispose() while holding the lock on the list,
     * as EventQueue lock is held during dispatching.  The locks should be acquired
     * in the same order.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SequencedEvent.java
    public SequencedEvent(AWTEvent nested) {

    /**
     * Constructs a new SequencedEvent which will dispatch the specified
     * nested event.
     *
     * @param nested the AWTEvent which this SequencedEvent's dispatch()
     *        method will dispatch
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SequencedEvent.java
class SequencedEvent extends AWTEvent implements ActiveEvent {

/**
 * A mechanism for ensuring that a series of AWTEvents are executed in a
 * precise order, even across multiple AppContexts. The nested events will be
 * dispatched in the order in which their wrapping SequencedEvents were
 * constructed. The only exception to this rule is if the peer of the target of
 * the nested event was destroyed (with a call to Component.removeNotify)
 * before the wrapping SequencedEvent was able to be dispatched. In this case,
 * the nested event is never dispatched.
 *
 * @author David Mendenhall
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SequencedEvent.java
    final void dispose() {

    /**
     * Disposes of this instance. This method is invoked once the nested event
     * has been dispatched and handled, or when the peer of the target of the
     * nested event has been disposed with a call to Component.removeNotify.
     *
     * NOTE: Locking protocol.  Since SunToolkit.postEvent can get EventQueue lock,
     * it shall never be called while holding the lock on the list,
     * as EventQueue lock is held during dispatching and dispatch() will get
     * lock on the list. The locks should be acquired in the same order.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SequencedEvent.java
    public final boolean isFirstOrDisposed() {

    /**
     * Sequenced events are dispatched in order, so we cannot dispatch
     * until we are the first sequenced event in the queue (i.e. it's our
     * turn).  But while we wait for our turn to dispatch, the event
     * could have been disposed for a number of reasons.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SequencedEvent.java
    private final static boolean isOwnerAppContextDisposed(SequencedEvent se) {

    /**
     * true only if event exists and nested source appContext is disposed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SequencedEvent.java
    public final void dispatch() {

    /**
     * Dispatches the nested event after all previous nested events have been
     * dispatched or disposed. If this method is invoked before all previous nested events
     * have been dispatched, then this method blocks until such a point is
     * reached.
     * While waiting disposes nested events to disposed AppContext
     *
     * NOTE: Locking protocol.  Since dispose() can get EventQueue lock,
     * dispatch() shall never call dispose() while holding the lock on the list,
     * as EventQueue lock is held during dispatching.  The locks should be acquired
     * in the same order.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SequencedEvent.java
    public SequencedEvent(AWTEvent nested) {

    /**
     * Constructs a new SequencedEvent which will dispatch the specified
     * nested event.
     *
     * @param nested the AWTEvent which this SequencedEvent's dispatch()
     *        method will dispatch
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/SequencedEvent.java
class SequencedEvent extends AWTEvent implements ActiveEvent {

/**
 * A mechanism for ensuring that a series of AWTEvents are executed in a
 * precise order, even across multiple AppContexts. The nested events will be
 * dispatched in the order in which their wrapping SequencedEvents were
 * constructed. The only exception to this rule is if the peer of the target of
 * the nested event was destroyed (with a call to Component.removeNotify)
 * before the wrapping SequencedEvent was able to be dispatched. In this case,
 * the nested event is never dispatched.
 *
 * @author David Mendenhall
 */
