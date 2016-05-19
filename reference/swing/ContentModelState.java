_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/ContentModelState.java
    public ContentModelState advance(Object token) {

    /**
     * Advance this state to a new state. An exception is thrown if the
     * token is illegal at this point in the content model.
     * @return next state after reducing a token
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/ContentModelState.java
    public Element first() {

    /**
     * Check if the state can be terminated. That is there are no more
     * tokens required in the input stream.
     * @return the only possible element that can occur next
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/ContentModelState.java
    public boolean terminate() {

    /**
     * Check if the state can be terminated. That is there are no more
     * tokens required in the input stream.
     * @return true if the model can terminate without further input
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/ContentModelState.java
    public ContentModel getModel() {

    /**
     * Return the content model that is relevant to the current state.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/ContentModelState.java
    ContentModelState(Object content, ContentModelState next, long value) {

    /**
     * Create a content model state for a content model given the
     * remaining state that needs to be reduce.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/ContentModelState.java
    ContentModelState(Object content, ContentModelState next) {

    /**
     * Create a content model state for a content model given the
     * remaining state that needs to be reduce.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/ContentModelState.java
    public ContentModelState(ContentModel model) {

    /**
     * Create a content model state for a content model.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/ContentModelState.java
class ContentModelState {

/**
 * A content model state. This is basically a list of pointers to
 * the BNF expression representing the model (the ContentModel).
 * Each element in a DTD has a content model which describes the
 * elements that may occur inside, and the order in which they can
 * occur.
 * <p>
 * Each time a token is reduced a new state is created.
 * <p>
 * See Annex H on page 556 of the SGML handbook for more information.
 *
 * @see Parser
 * @see DTD
 * @see Element
 * @see ContentModel
 * @author Arthur van Hoff
 */
