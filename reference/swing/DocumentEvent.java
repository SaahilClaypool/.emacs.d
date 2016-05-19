_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/DocumentEvent.java
        public Element[] getChildrenAdded();

        /**
         * Gets the child elements that were added to the given
         * parent element.  The element array returned is in the
         * order that the elements lie in the document, and must
         * be contiguous.
         *
         * @return the child elements
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/DocumentEvent.java
        public Element[] getChildrenRemoved();

        /**
         * Gets the child elements that were removed from the
         * given parent element.  The element array returned is
         * sorted in the order that the elements used to lie in
         * the document, and must be contiguous.
         *
         * @return the child elements
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/DocumentEvent.java
        public int getIndex();

        /**
         * Fetches the index within the element represented.
         * This is the location that children were added
         * and/or removed.
         *
         * @return the index &gt;= 0
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/DocumentEvent.java
        public Element getElement();

        /**
         * Returns the element represented.  This is the element
         * that was changed.
         *
         * @return the element
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/DocumentEvent.java
    public interface ElementChange {

    /**
     * Describes changes made to a specific element.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/DocumentEvent.java
        public String toString() {

        /**
         * Converts the type to a string.
         *
         * @return the string
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/DocumentEvent.java
        public static final EventType CHANGE = new EventType("CHANGE");

        /**
         * Change type.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/DocumentEvent.java
        public static final EventType REMOVE = new EventType("REMOVE");

        /**
         * Remove type.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/DocumentEvent.java
        public static final EventType INSERT = new EventType("INSERT");

        /**
         * Insert type.
         */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/DocumentEvent.java
    public static final class EventType {

    /**
     * Enumeration for document event types
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/DocumentEvent.java
    public ElementChange getChange(Element elem);

    /**
     * Gets the change information for the given element.
     * The change information describes what elements were
     * added and removed and the location.  If there were
     * no changes, null is returned.
     * <p>
     * This method is for observers to discover the structural
     * changes that were made.  This means that only elements
     * that existed prior to the mutation (and still exist after
     * the mutation) need to have ElementChange records.
     * The changes made available need not be recursive.
     * <p>
     * For example, if the an element is removed from it's
     * parent, this method should report that the parent
     * changed and provide an ElementChange implementation
     * that describes the change to the parent.  If the
     * child element removed had children, these elements
     * do not need to be reported as removed.
     * <p>
     * If an child element is insert into a parent element,
     * the parent element should report a change.  If the
     * child element also had elements inserted into it
     * (grandchildren to the parent) these elements need
     * not report change.
     *
     * @param elem the element
     * @return the change information, or null if the
     *   element was not modified
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/DocumentEvent.java
    public EventType getType();

    /**
     * Gets the type of event.
     *
     * @return the type
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/DocumentEvent.java
    public Document getDocument();

    /**
     * Gets the document that sourced the change event.
     *
     * @return the document
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/DocumentEvent.java
    public int getLength();

    /**
     * Returns the length of the change.
     *
     * @return the length &gt;= 0
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/DocumentEvent.java
    public int getOffset();

    /**
     * Returns the offset within the document of the start
     * of the change.
     *
     * @return the offset &gt;= 0
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//event/DocumentEvent.java
public interface DocumentEvent {

/**
 * Interface for document change notifications.  This provides
 * detailed information to Document observers about how the
 * Document changed.  It provides high level information such
 * as type of change and where it occurred, as well as the more
 * detailed structural changes (What Elements were inserted and
 * removed).
 *
 * @author  Timothy Prinzing
 * @see javax.swing.text.Document
 * @see DocumentListener
 */
