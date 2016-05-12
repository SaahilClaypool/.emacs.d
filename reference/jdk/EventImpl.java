_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/EventImpl.java
    public void preventDefault()

    /** Prevents any default processing built into the target node from
        occurring.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/EventImpl.java
    public void stopPropagation()

    /** Causes exit from in-progress event dispatch before the next
        currentTarget is selected. Replaces the preventBubble() and
        preventCapture() methods which were present in early drafts;
        they may be reintroduced in future levels of the DOM. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/EventImpl.java
    public String getType()

    /** @return event name as a string
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/EventImpl.java
    public EventTarget getTarget()

    /** @return the EventTarget (Node) to which the event was originally
        dispatched.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/EventImpl.java
    public short getEventPhase()

    /** @return the current processing phase for this event --
        CAPTURING_PHASE, AT_TARGET, BUBBLING_PHASE. (There may be
        an internal DEFAULT_PHASE as well, but the users won't see it.) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/EventImpl.java
    public EventTarget getCurrentTarget()

    /** @return the Node (EventTarget) whose EventListeners are currently
        being processed. During capture and bubble phases, this may not be
        the target node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/EventImpl.java
    public boolean getCancelable()

    /** @return true iff this Event is of a class and type which (a) has a
        Default Behavior in this DOM, and (b)allows cancellation (blocking)
        of that behavior. In the generic case, this is False.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/EventImpl.java
    public boolean getBubbles()

    /** @return true iff this Event is of a class and type which supports
        bubbling. In the generic case, this is True.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/EventImpl.java
    public void initEvent(String eventTypeArg, boolean canBubbleArg,
                        boolean cancelableArg)

    /** The DOM doesn't deal with constructors, so instead we have an
        initializer call to set most of the read-only fields. The
        others are set, and reset, by the event subsystem during dispatch.
        <p>
        Note that init() -- and the subclass-specific initWhatever() calls --
        may be reinvoked. At least one initialization is required; repeated
        initializations overwrite the event with new values of their
        parameters.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/EventImpl.java
public class EventImpl implements Event

/**
 * EventImpl is an implementation of the basic "generic" DOM Level 2 Event
 * object. It may be subclassed by more specialized event sets.
 * Note that in our implementation, events are re-dispatchable (dispatch
 * clears the stopPropagation and preventDefault flags before it starts);
 * I believe that is the DOM's intent but I don't see an explicit statement
 * to this effect.
 *
 * @xerces.internal
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/EventImpl.java
    public void preventDefault()

    /** Prevents any default processing built into the target node from
        occurring.
      */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/EventImpl.java
    public void stopPropagation()

    /** Causes exit from in-progress event dispatch before the next
        currentTarget is selected. Replaces the preventBubble() and
        preventCapture() methods which were present in early drafts;
        they may be reintroduced in future levels of the DOM. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/EventImpl.java
    public String getType()

    /** @return event name as a string
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/EventImpl.java
    public EventTarget getTarget()

    /** @return the EventTarget (Node) to which the event was originally
        dispatched.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/EventImpl.java
    public short getEventPhase()

    /** @return the current processing phase for this event --
        CAPTURING_PHASE, AT_TARGET, BUBBLING_PHASE. (There may be
        an internal DEFAULT_PHASE as well, but the users won't see it.) */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/EventImpl.java
    public EventTarget getCurrentTarget()

    /** @return the Node (EventTarget) whose EventListeners are currently
        being processed. During capture and bubble phases, this may not be
        the target node. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/EventImpl.java
    public boolean getCancelable()

    /** @return true iff this Event is of a class and type which (a) has a
        Default Behavior in this DOM, and (b)allows cancellation (blocking)
        of that behavior. In the generic case, this is False.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/EventImpl.java
    public boolean getBubbles()

    /** @return true iff this Event is of a class and type which supports
        bubbling. In the generic case, this is True.
        */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/EventImpl.java
    public void initEvent(String eventTypeArg, boolean canBubbleArg,
                        boolean cancelableArg)

    /** The DOM doesn't deal with constructors, so instead we have an
        initializer call to set most of the read-only fields. The
        others are set, and reset, by the event subsystem during dispatch.
        <p>
        Note that init() -- and the subclass-specific initWhatever() calls --
        may be reinvoked. At least one initialization is required; repeated
        initializations overwrite the event with new values of their
        parameters.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/events/EventImpl.java
public class EventImpl implements Event

/**
 * EventImpl is an implementation of the basic "generic" DOM Level 2 Event
 * object. It may be subclassed by more specialized event sets.
 * Note that in our implementation, events are re-dispatchable (dispatch
 * clears the stopPropagation and preventDefault flags before it starts);
 * I believe that is the DOM's intent but I don't see an explicit statement
 * to this effect.
 *
 * @xerces.internal
 *
 */
