_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/TagStack.java
    public String toString() {

    /**
     * Convert to a string.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/TagStack.java
    boolean terminate() {

    /**
     * Return true if the current state can be terminated.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/TagStack.java
    boolean advance(Element elem) {

    /**
     * Advance the state by reducing the given element.
     * Returns false if the element is not legal and the
     * state is not advanced.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/TagStack.java
    boolean excluded(int elemIndex) {

    /**
     * Return true if the element that is contained at
     * the index specified by the parameter is part of
     * the exclusions specified in the DTD for the element
     * currently on the TagStack.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/TagStack.java
    public ContentModel contentModel() {

    /**
     * Return the ContentModel that must be satisfied by
     * what comes next in the input stream.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/TagStack.java
    public Element first() {

    /**
     * Return the element that must come next in the
     * input stream.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/TagStack.java
    TagStack(TagElement tag, TagStack next) {

    /**
     * Construct a stack element.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/TagStack.java
final

/**
 * A stack of tags. Used while parsing an HTML document.
 * It, together with the ContentModelStates, defines the
 * complete state of the parser while reading a document.
 * When a start tag is encountered an element is pushed onto
 * the stack, when an end tag is enountered an element is popped
 * of the stack.
 *
 * @see Parser
 * @see DTD
 * @see ContentModelState
 * @author      Arthur van Hoff
 */
