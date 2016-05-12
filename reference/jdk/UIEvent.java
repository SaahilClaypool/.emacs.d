_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/events/UIEvent.java
    public void initUIEvent(String typeArg,
                            boolean canBubbleArg,
                            boolean cancelableArg,
                            AbstractView viewArg,
                            int detailArg);

    /**
     * The <code>initUIEvent</code> method is used to initialize the value of
     * a <code>UIEvent</code> created through the <code>DocumentEvent</code>
     * interface. This method may only be called before the
     * <code>UIEvent</code> has been dispatched via the
     * <code>dispatchEvent</code> method, though it may be called multiple
     * times during that phase if necessary. If called multiple times, the
     * final invocation takes precedence.
     * @param typeArg Specifies the event type.
     * @param canBubbleArg Specifies whether or not the event can bubble.
     * @param cancelableArg Specifies whether or not the event's default
     *   action can be prevented.
     * @param viewArg Specifies the <code>Event</code>'s
     *   <code>AbstractView</code>.
     * @param detailArg Specifies the <code>Event</code>'s detail.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/events/UIEvent.java
    public int getDetail();

    /**
     * Specifies some detail information about the <code>Event</code>,
     * depending on the type of event.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/events/UIEvent.java
public interface UIEvent extends Event {

/**
 * The <code>UIEvent</code> interface provides specific contextual information
 * associated with User Interface events.
 * <p>See also the <a href='http://www.w3.org/TR/2000/REC-DOM-Level-2-Events-20001113'>Document Object Model (DOM) Level 2 Events Specification</a>.
 * @since DOM Level 2
 */
