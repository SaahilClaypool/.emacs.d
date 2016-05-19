_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/HyperlinkEvent.java
        public String toString() {

        /**
         * Converts the type to a string.
         *
         * @return the string
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/HyperlinkEvent.java
        public static final EventType ACTIVATED = new EventType("ACTIVATED");

        /**
         * Activated type.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/HyperlinkEvent.java
        public static final EventType EXITED = new EventType("EXITED");

        /**
         * Exited type.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/HyperlinkEvent.java
        public static final EventType ENTERED = new EventType("ENTERED");

        /**
         * Entered type.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/HyperlinkEvent.java
    public static final class EventType {

    /**
     * Defines the ENTERED, EXITED, and ACTIVATED event types, along
     * with their string representations, returned by toString().
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/HyperlinkEvent.java
    public InputEvent getInputEvent() {

    /**
     * Returns the {@code InputEvent} that triggered the hyperlink event.
     * This will typically be a {@code MouseEvent}.  If a constructor is used
     * that does not specify an {@code InputEvent}, or @{code null}
     * was specified as the {@code InputEvent}, this returns {@code null}.
     *
     * @return  InputEvent that triggered the hyperlink event, or null
     * @since 1.7
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/HyperlinkEvent.java
    public Element getSourceElement() {

    /**
     * Returns the <code>Element</code> that corresponds to the source of the
     * event. This will typically be an <code>Element</code> representing
     * an anchor. If a constructor that is used that does not specify a source
     * <code>Element</code>, or null was specified as the source
     * <code>Element</code>, this will return null.
     *
     * @return Element indicating source of event, or null
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/HyperlinkEvent.java
    public URL getURL() {

    /**
     * Gets the URL that the link refers to.
     *
     * @return the URL
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/HyperlinkEvent.java
    public String getDescription() {

    /**
     * Get the description of the link as a string.
     * This may be useful if a URL can't be formed
     * from the description, in which case the associated
     * URL would be null.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/HyperlinkEvent.java
    public EventType getEventType() {

    /**
     * Gets the type of event.
     *
     * @return the type
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/HyperlinkEvent.java
    public HyperlinkEvent(Object source, EventType type, URL u, String desc,
                          Element sourceElement, InputEvent inputEvent) {

    /**
     * Creates a new object representing a hypertext link event.
     *
     * @param source the object responsible for the event
     * @param type the event type
     * @param u the affected URL.  This may be null if a valid URL
     *   could not be created.
     * @param desc the description of the link.  This may be useful
     *   when attempting to form a URL resulted in a MalformedURLException.
     *   The description provides the text used when attempting to form the
     *   URL.
     * @param sourceElement Element in the Document representing the
     *   anchor
     * @param inputEvent  InputEvent that triggered the hyperlink event
     * @since 1.7
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/HyperlinkEvent.java
    public HyperlinkEvent(Object source, EventType type, URL u, String desc,
                          Element sourceElement) {

    /**
     * Creates a new object representing a hypertext link event.
     *
     * @param source the object responsible for the event
     * @param type the event type
     * @param u the affected URL.  This may be null if a valid URL
     *   could not be created.
     * @param desc the description of the link.  This may be useful
     *   when attempting to form a URL resulted in a MalformedURLException.
     *   The description provides the text used when attempting to form the
     *   URL.
     * @param sourceElement Element in the Document representing the
     *   anchor
     * @since 1.4
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/HyperlinkEvent.java
    public HyperlinkEvent(Object source, EventType type, URL u, String desc) {

    /**
     * Creates a new object representing a hypertext link event.
     *
     * @param source the object responsible for the event
     * @param type the event type
     * @param u the affected URL.  This may be null if a valid URL
     *   could not be created.
     * @param desc the description of the link.  This may be useful
     *   when attempting to form a URL resulted in a MalformedURLException.
     *   The description provides the text used when attempting to form the
     *   URL.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/HyperlinkEvent.java
    public HyperlinkEvent(Object source, EventType type, URL u) {

    /**
     * Creates a new object representing a hypertext link event.
     * The other constructor is preferred, as it provides more
     * information if a URL could not be formed.  This constructor
     * is primarily for backward compatibility.
     *
     * @param source the object responsible for the event
     * @param type the event type
     * @param u the affected URL
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/HyperlinkEvent.java
public class HyperlinkEvent extends EventObject {

/**
 * HyperlinkEvent is used to notify interested parties that
 * something has happened with respect to a hypertext link.
 * <p>
 * <strong>Warning:</strong>
 * Serialized objects of this class will not be compatible with
 * future Swing releases. The current serialization support is
 * appropriate for short term storage or RMI between applications running
 * the same version of Swing.  As of 1.4, support for long term storage
 * of all JavaBeans&trade;
 * has been added to the <code>java.beans</code> package.
 * Please see {@link java.beans.XMLEncoder}.
 *
 * @author  Timothy Prinzing
 */
