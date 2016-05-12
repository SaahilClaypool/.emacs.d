_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Text.java
    public void loadAsArrayOffsetLength(ClassGenerator classGen,
                                        MethodGenerator methodGen) {

    /**
     * Generates code that loads the array that will contain the character
     * data represented by this Text node, followed by the offset of the
     * data from the start of the array, and then the length of the data.
     *
     * The pre-condition to calling this method is that
     * canLoadAsArrayOffsetLength() returns true.
     * @see #canLoadArrayOffsetLength()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Text.java
    public boolean canLoadAsArrayOffsetLength() {

    /**
     * Check whether this Text node can be stored in a char[] in the translet.
     * Calling this is precondition to calling loadAsArrayOffsetLength.
     * @see #loadAsArrayOffsetLength(ClassGenerator,MethodGenerator)
     * @return true if this Text node can be
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Text.java
    protected void setText(String text) {

    /**
     * Set the text for this node. Appends the given text to any already
     * existing text (using string concatenation, so use only when needed).
     * @param text is the text to wrap inside this node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Text.java
    protected String getText() {

    /**
     * Returns the text wrapped inside this node
     * @return The text wrapped inside this node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Text.java
    public Text(String text) {

    /**
     * Create text syntax tree node.
     * @param text is the text to put in the node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Text.java
    public Text() {

    /**
     * Create a blank Text syntax tree node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Text.java
final class Text extends Instruction {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Text.java
    public void loadAsArrayOffsetLength(ClassGenerator classGen,
                                        MethodGenerator methodGen) {

    /**
     * Generates code that loads the array that will contain the character
     * data represented by this Text node, followed by the offset of the
     * data from the start of the array, and then the length of the data.
     *
     * The pre-condition to calling this method is that
     * canLoadAsArrayOffsetLength() returns true.
     * @see #canLoadArrayOffsetLength()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Text.java
    public boolean canLoadAsArrayOffsetLength() {

    /**
     * Check whether this Text node can be stored in a char[] in the translet.
     * Calling this is precondition to calling loadAsArrayOffsetLength.
     * @see #loadAsArrayOffsetLength(ClassGenerator,MethodGenerator)
     * @return true if this Text node can be
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Text.java
    protected void setText(String text) {

    /**
     * Set the text for this node. Appends the given text to any already
     * existing text (using string concatenation, so use only when needed).
     * @param text is the text to wrap inside this node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Text.java
    protected String getText() {

    /**
     * Returns the text wrapped inside this node
     * @return The text wrapped inside this node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Text.java
    public Text(String text) {

    /**
     * Create text syntax tree node.
     * @param text is the text to put in the node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Text.java
    public Text() {

    /**
     * Create a blank Text syntax tree node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/Text.java
final class Text extends Instruction {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/Text.java
    public boolean isComment();

    /**
     * Retrieves whether this <code>Text</code> object represents a comment.
     *
     * @return <code>true</code> if this <code>Text</code> object is a
     *         comment; <code>false</code> otherwise
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/soap/Text.java
public interface Text extends Node, org.w3c.dom.Text {

/**
 * A representation of a node whose value is text.  A <code>Text</code> object
 * may represent text that is content or text that is a comment.
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Text.java
    public Text replaceWholeText(String content)

    /**
     * Replaces the text of the current node and all logically-adjacent text
     * nodes with the specified text. All logically-adjacent text nodes are
     * removed including the current node unless it was the recipient of the
     * replacement text.
     * <p>This method returns the node which received the replacement text.
     * The returned node is:</p>
     * <ul>
     * <li><code>null</code>, when the replacement text is
     * the empty string;
     * </li>
     * <li>the current node, except when the current node is
     * read-only;
     * </li>
     * <li> a new <code>Text</code> node of the same type (
     * <code>Text</code> or <code>CDATASection</code>) as the current node
     * inserted at the location of the replacement.
     * </li>
     * </ul>
     * <p>For instance, in the above example calling
     * <code>replaceWholeText</code> on the <code>Text</code> node that
     * contains "bar" with "yo" in argument results in the following:</p>
     *
     * <pre>
     *                     +-----+
     *                     | &lt;p&gt; |
     *                     +-----+
     *                        |
     *                        |
     *                     /-----\
     *                     | yo  |
     *                     \-----/
     * </pre>
     * <em>Figure: barTextNode.replaceWholeText("yo") modifies the
     * textual content of barTextNode with "yo"</em>
     *
     * <p>Where the nodes to be removed are read-only descendants of an
     * <code>EntityReference</code>, the <code>EntityReference</code> must
     * be removed instead of the read-only nodes. If any
     * <code>EntityReference</code> to be removed has descendants that are
     * not <code>EntityReference</code>, <code>Text</code>, or
     * <code>CDATASection</code> nodes, the <code>replaceWholeText</code>
     * method must fail before performing any modification of the document,
     * raising a <code>DOMException</code> with the code
     * <code>NO_MODIFICATION_ALLOWED_ERR</code>.</p>
     * <p>For instance, in the example below calling
     * <code>replaceWholeText</code> on the <code>Text</code> node that
     * contains "bar" fails, because the <code>EntityReference</code> node
     * "ent" contains an <code>Element</code> node which cannot be removed.</p>
     * @param content The content of the replacing <code>Text</code> node.
     * @return The <code>Text</code> node created with the specified content.
     * @exception DOMException
     *   NO_MODIFICATION_ALLOWED_ERR: Raised if one of the <code>Text</code>
     *   nodes being replaced is readonly.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Text.java
    public String getWholeText();

    /**
     * Returns all text of <code>Text</code> nodes logically-adjacent text
     * nodes to this node, concatenated in document order.
     * <br>For instance, in the example below <code>wholeText</code> on the
     * <code>Text</code> node that contains "bar" returns "barfoo", while on
     * the <code>Text</code> node that contains "foo" it returns "barfoo".
     *
     * <pre>
     *                     +-----+
     *                     | &lt;p&gt; |
     *                     +-----+
     *                       /\
     *                      /  \
     *               /-----\    +-------+
     *               | bar |    | &amp;ent; |
     *               \-----/    +-------+
     *                              |
     *                              |
     *                           /-----\
     *                           | foo |
     *                           \-----/
     * </pre>
     * <em>Figure: barTextNode.wholeText value is "barfoo"</em>
     *
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Text.java
    public boolean isElementContentWhitespace();

    /**
     * Returns whether this text node contains <a href='http://www.w3.org/TR/2004/REC-xml-infoset-20040204#infoitem.character'>
     * element content whitespace</a>, often abusively called "ignorable whitespace". The text node is
     * determined to contain whitespace in element content during the load
     * of the document or if validation occurs while using
     * <code>Document.normalizeDocument()</code>.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Text.java
public interface Text extends CharacterData {

/**
 * The <code>Text</code> interface inherits from <code>CharacterData</code>
 * and represents the textual content (termed <a href='http://www.w3.org/TR/2004/REC-xml-20040204#syntax'>character data</a> in XML) of an <code>Element</code> or <code>Attr</code>. If there is no
 * markup inside an element's content, the text is contained in a single
 * object implementing the <code>Text</code> interface that is the only
 * child of the element. If there is markup, it is parsed into the
 * information items (elements, comments, etc.) and <code>Text</code> nodes
 * that form the list of children of the element.
 * <p>When a document is first made available via the DOM, there is only one
 * <code>Text</code> node for each block of text. Users may create adjacent
 * <code>Text</code> nodes that represent the contents of a given element
 * without any intervening markup, but should be aware that there is no way
 * to represent the separations between these nodes in XML or HTML, so they
 * will not (in general) persist between DOM editing sessions. The
 * <code>Node.normalize()</code> method merges any such adjacent
 * <code>Text</code> objects into a single node for each block of text.
 * <p> No lexical check is done on the content of a <code>Text</code> node
 * and, depending on its position in the document, some characters must be
 * escaped during serialization using character references; e.g. the
 * characters "&lt;&amp;" if the textual content is part of an element or of
 * an attribute, the character sequence "]]&gt;" when part of an element,
 * the quotation mark character " or the apostrophe character ' when part of
 * an attribute.
 * <p>See also the <a href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407'>Document Object Model (DOM) Level 3 Core Specification</a>.
 */
