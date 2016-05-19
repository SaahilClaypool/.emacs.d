_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/ContentModel.java
    public String toString() {

    /**
     * Convert to a string.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/ContentModel.java
    public Element first() {

    /**
     * Return the element that must be next.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/ContentModel.java
    public boolean first(Object token) {

    /**
     * Return true if the token could potentially be the
     * first token in the input stream.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/ContentModel.java
     public void getElements(Vector<Element> elemVec) {

    /**
     * Update elemVec with the list of elements that are
     * part of the this contentModel.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/ContentModel.java
    public boolean empty() {

    /**
     * Return true if the content model could
     * match an empty input stream.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/ContentModel.java
    public ContentModel(int type, Object content, ContentModel next) {

    /**
     * Create a content model of a particular type.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/ContentModel.java
    public ContentModel(int type, ContentModel content) {

    /**
     * Create a content model of a particular type.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/ContentModel.java
    public ContentModel(Element content) {

    /**
     * Create a content model for an element.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/ContentModel.java
    public ContentModel next;

    /**
     * The next content model (in a ',', '|' or '&amp;' expression).
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/ContentModel.java
    public Object content;

    /**
     * The content. Either an Element or a ContentModel.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/ContentModel.java
    public int type;

    /**
     * Type. Either '*', '?', '+', ',', '|', '&amp;'.
     */
_func_
swing
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource/javax/swing//text/html/parser/ContentModel.java
public final class ContentModel implements Serializable {

/**
 * A representation of a content model. A content model is
 * basically a restricted BNF expression. It is restricted in
 * the sense that it must be deterministic. This means that you
 * don't have to represent it as a finite state automaton.<p>
 * See Annex H on page 556 of the SGML handbook for more information.
 *
 * @author   Arthur van Hoff
 *
 */
