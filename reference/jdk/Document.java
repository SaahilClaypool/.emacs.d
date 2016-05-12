_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Document.java
    public static final String TitleProperty = "title";

    /**
     * The property name for the title of the document, if
     * there is one.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Document.java
    public static final String StreamDescriptionProperty = "stream";

    /**
     * The property name for the description of the stream
     * used to initialize the document.  This should be used
     * if the document was initialized from a stream and
     * anything is known about the stream.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Document.java
    public void render(Runnable r);

    /**
     * Allows the model to be safely rendered in the presence
     * of concurrency, if the model supports being updated asynchronously.
     * The given runnable will be executed in a way that allows it
     * to safely read the model with no changes while the runnable
     * is being executed.  The runnable itself may <em>not</em>
     * make any mutations.
     *
     * @param r a <code>Runnable</code> used to render the model
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Document.java
    public Element getDefaultRootElement();

    /**
     * Returns the root element that views should be based upon,
     * unless some other mechanism for assigning views to element
     * structures is provided.
     *
     * @return the root element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Document.java
    public Element[] getRootElements();

    /**
     * Returns all of the root elements that are defined.
     * <p>
     * Typically there will be only one document structure, but the interface
     * supports building an arbitrary number of structural projections over the
     * text data. The document can have multiple root elements to support
     * multiple document structures.  Some examples might be:
     * </p>
     * <ul>
     * <li>Text direction.
     * <li>Lexical token streams.
     * <li>Parse trees.
     * <li>Conversions to formats other than the native format.
     * <li>Modification specifications.
     * <li>Annotations.
     * </ul>
     *
     * @return the root element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Document.java
    public Position createPosition(int offs) throws BadLocationException;

    /**
     * This method allows an application to mark a place in
     * a sequence of character content. This mark can then be
     * used to tracks change as insertions and removals are made
     * in the content. The policy is that insertions always
     * occur prior to the current position (the most common case)
     * unless the insertion location is zero, in which case the
     * insertion is forced to a position that follows the
     * original position.
     *
     * @param offs  the offset from the start of the document &gt;= 0
     * @return the position
     * @exception BadLocationException  if the given position does not
     *   represent a valid location in the associated document
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Document.java
    public Position getEndPosition();

    /**
     * Returns a position that represents the end of the document.  The
     * position returned can be counted on to track change and stay
     * located at the end of the document.
     *
     * @return the position
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Document.java
    public Position getStartPosition();

    /**
     * Returns a position that represents the start of the document.  The
     * position returned can be counted on to track change and stay
     * located at the beginning of the document.
     *
     * @return the position
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Document.java
    public void getText(int offset, int length, Segment txt) throws BadLocationException;

    /**
     * Fetches the text contained within the given portion
     * of the document.
     * <p>
     * If the partialReturn property on the txt parameter is false, the
     * data returned in the Segment will be the entire length requested and
     * may or may not be a copy depending upon how the data was stored.
     * If the partialReturn property is true, only the amount of text that
     * can be returned without creating a copy is returned.  Using partial
     * returns will give better performance for situations where large
     * parts of the document are being scanned.  The following is an example
     * of using the partial return to access the entire document:
     *
     * <pre><code>
     *
     * &nbsp; int nleft = doc.getDocumentLength();
     * &nbsp; Segment text = new Segment();
     * &nbsp; int offs = 0;
     * &nbsp; text.setPartialReturn(true);
     * &nbsp; while (nleft &gt; 0) {
     * &nbsp;     doc.getText(offs, nleft, text);
     * &nbsp;     // do someting with text
     * &nbsp;     nleft -= text.count;
     * &nbsp;     offs += text.count;
     * &nbsp; }
     *
     * </code></pre>
     *
     * @param offset  the offset into the document representing the desired
     *   start of the text &gt;= 0
     * @param length  the length of the desired string &gt;= 0
     * @param txt the Segment object to return the text in
     *
     * @exception BadLocationException  Some portion of the given range
     *   was not a valid part of the document.  The location in the exception
     *   is the first bad position encountered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Document.java
    public String getText(int offset, int length) throws BadLocationException;

    /**
     * Fetches the text contained within the given portion
     * of the document.
     *
     * @param offset  the offset into the document representing the desired
     *   start of the text &gt;= 0
     * @param length  the length of the desired string &gt;= 0
     * @return the text, in a String of length &gt;= 0
     * @exception BadLocationException  some portion of the given range
     *   was not a valid part of the document.  The location in the exception
     *   is the first bad position encountered.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Document.java
    public void insertString(int offset, String str, AttributeSet a) throws BadLocationException;

    /**
     * Inserts a string of content.  This will cause a DocumentEvent
     * of type DocumentEvent.EventType.INSERT to be sent to the
     * registered DocumentListers, unless an exception is thrown.
     * The DocumentEvent will be delivered by calling the
     * insertUpdate method on the DocumentListener.
     * The offset and length of the generated DocumentEvent
     * will indicate what change was actually made to the Document.
     * <p style="text-align:center"><img src="doc-files/Document-insert.gif"
     *  alt="Diagram shows insertion of 'quick' in 'The quick brown fox'">
     * <p>
     * If the Document structure changed as result of the insertion,
     * the details of what Elements were inserted and removed in
     * response to the change will also be contained in the generated
     * DocumentEvent.  It is up to the implementation of a Document
     * to decide how the structure should change in response to an
     * insertion.
     * <p>
     * If the Document supports undo/redo, an UndoableEditEvent will
     * also be generated.
     *
     * @param offset  the offset into the document to insert the content &gt;= 0.
     *    All positions that track change at or after the given location
     *    will move.
     * @param str    the string to insert
     * @param a      the attributes to associate with the inserted
     *   content.  This may be null if there are no attributes.
     * @exception BadLocationException  the given insert position is not a valid
     * position within the document
     * @see javax.swing.event.DocumentEvent
     * @see javax.swing.event.DocumentListener
     * @see javax.swing.event.UndoableEditEvent
     * @see javax.swing.event.UndoableEditListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Document.java
    public void remove(int offs, int len) throws BadLocationException;

    /**
     * Removes a portion of the content of the document.
     * This will cause a DocumentEvent of type
     * DocumentEvent.EventType.REMOVE to be sent to the
     * registered DocumentListeners, unless an exception
     * is thrown.  The notification will be sent to the
     * listeners by calling the removeUpdate method on the
     * DocumentListeners.
     * <p>
     * To ensure reasonable behavior in the face
     * of concurrency, the event is dispatched after the
     * mutation has occurred. This means that by the time a
     * notification of removal is dispatched, the document
     * has already been updated and any marks created by
     * <code>createPosition</code> have already changed.
     * For a removal, the end of the removal range is collapsed
     * down to the start of the range, and any marks in the removal
     * range are collapsed down to the start of the range.
     * <p style="text-align:center"><img src="doc-files/Document-remove.gif"
     *  alt="Diagram shows removal of 'quick' from 'The quick brown fox.'">
     * <p>
     * If the Document structure changed as result of the removal,
     * the details of what Elements were inserted and removed in
     * response to the change will also be contained in the generated
     * DocumentEvent. It is up to the implementation of a Document
     * to decide how the structure should change in response to a
     * remove.
     * <p>
     * If the Document supports undo/redo, an UndoableEditEvent will
     * also be generated.
     *
     * @param offs  the offset from the beginning &gt;= 0
     * @param len   the number of characters to remove &gt;= 0
     * @exception BadLocationException  some portion of the removal range
     *   was not a valid part of the document.  The location in the exception
     *   is the first bad position encountered.
     * @see javax.swing.event.DocumentEvent
     * @see javax.swing.event.DocumentListener
     * @see javax.swing.event.UndoableEditEvent
     * @see javax.swing.event.UndoableEditListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Document.java
    public void putProperty(Object key, Object value);

    /**
     * Associates a property with the document.  Two standard
     * property keys provided are: <a href="#StreamDescriptionProperty">
     * <code>StreamDescriptionProperty</code></a> and
     * <a href="#TitleProperty"><code>TitleProperty</code></a>.
     * Other properties, such as author, may also be defined.
     *
     * @param key the non-<code>null</code> property key
     * @param value the property value
     * @see #getProperty(Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Document.java
    public Object getProperty(Object key);

    /**
     * Gets the properties associated with the document.
     *
     * @param key a non-<code>null</code> property key
     * @return the properties
     * @see #putProperty(Object, Object)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Document.java
    public void removeUndoableEditListener(UndoableEditListener listener);

    /**
     * Unregisters the given observer from the notification list
     * so it will no longer receive updates.
     *
     * @param listener the observer to register
     * @see javax.swing.event.UndoableEditEvent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Document.java
    public void addUndoableEditListener(UndoableEditListener listener);

    /**
     * Registers the given observer to begin receiving notifications
     * when undoable edits are made to the document.
     *
     * @param listener the observer to register
     * @see javax.swing.event.UndoableEditEvent
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Document.java
    public void removeDocumentListener(DocumentListener listener);

    /**
     * Unregisters the given observer from the notification list
     * so it will no longer receive change updates.
     *
     * @param listener the observer to register
     * @see Document#addDocumentListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Document.java
    public void addDocumentListener(DocumentListener listener);

    /**
     * Registers the given observer to begin receiving notifications
     * when changes are made to the document.
     *
     * @param listener the observer to register
     * @see Document#removeDocumentListener
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Document.java
    public int getLength();

    /**
     * Returns number of characters of content currently
     * in the document.
     *
     * @return number of characters &gt;= 0
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/Document.java
public interface Document {

/**
 * <p>
 * The <code>Document</code> is a container for text that serves
 * as the model for swing text components.  The goal for this
 * interface is to scale from very simple needs (a plain text textfield)
 * to complex needs (an HTML or XML document, for example).
 *
 * <p><b><font size=+1>Content</font></b>
 * <p>
 * At the simplest level, text can be
 * modeled as a linear sequence of characters. To support
 * internationalization, the Swing text model uses
 * <a href="http://www.unicode.org/">unicode</a> characters.
 * The sequence of characters displayed in a text component is
 * generally referred to as the component's <em>content</em>.
 * <p>
 * To refer to locations within the sequence, the coordinates
 * used are the location between two characters.  As the diagram
 * below shows, a location in a text document can be referred to
 * as a position, or an offset. This position is zero-based.
 * <p style="text-align:center"><img src="doc-files/Document-coord.gif"
 * alt="The following text describes this graphic.">
 * <p>
 * In the example, if the content of a document is the
 * sequence "The quick brown fox," as shown in the preceding diagram,
 * the location just before the word "The" is 0, and the location after
 * the word "The" and before the whitespace that follows it is 3.
 * The entire sequence of characters in the sequence "The" is called a
 * <em>range</em>.
 * <p>The following methods give access to the character data
 * that makes up the content.
 * <ul>
 * <li>{@link #getLength()}
 * <li>{@link #getText(int, int)}
 * <li>{@link #getText(int, int, javax.swing.text.Segment)}
 * </ul>
 * <p><b><font size=+1>Structure</font></b>
 * <p>
 * Text is rarely represented simply as featureless content. Rather,
 * text typically has some sort of structure associated with it.
 * Exactly what structure is modeled is up to a particular Document
 * implementation.  It might be as simple as no structure (i.e. a
 * simple text field), or it might be something like diagram below.
 * <p style="text-align:center"><img src="doc-files/Document-structure.gif"
 * alt="Diagram shows Book->Chapter->Paragraph">
 * <p>
 * The unit of structure (i.e. a node of the tree) is referred to
 * by the <a href="Element.html">Element</a> interface.  Each Element
 * can be tagged with a set of attributes.  These attributes
 * (name/value pairs) are defined by the
 * <a href="AttributeSet.html">AttributeSet</a> interface.
 * <p>The following methods give access to the document structure.
 * <ul>
 * <li>{@link #getDefaultRootElement()}
 * <li>{@link #getRootElements()}
 * </ul>
 *
 * <p><b><font size=+1>Mutations</font></b>
 * <p>
 * All documents need to be able to add and remove simple text.
 * Typically, text is inserted and removed via gestures from
 * a keyboard or a mouse.  What effect the insertion or removal
 * has upon the document structure is entirely up to the
 * implementation of the document.
 * <p>The following methods are related to mutation of the
 * document content:
 * <ul>
 * <li>{@link #insertString(int, java.lang.String, javax.swing.text.AttributeSet)}
 * <li>{@link #remove(int, int)}
 * <li>{@link #createPosition(int)}
 * </ul>
 *
 * <p><b><font size=+1>Notification</font></b>
 * <p>
 * Mutations to the <code>Document</code> must be communicated to
 * interested observers.  The notification of change follows the event model
 * guidelines that are specified for JavaBeans.  In the JavaBeans
 * event model, once an event notification is dispatched, all listeners
 * must be notified before any further mutations occur to the source
 * of the event.  Further, order of delivery is not guaranteed.
 * <p>
 * Notification is provided as two separate events,
 * <a href="../event/DocumentEvent.html">DocumentEvent</a>, and
 * <a href="../event/UndoableEditEvent.html">UndoableEditEvent</a>.
 * If a mutation is made to a <code>Document</code> through its api,
 * a <code>DocumentEvent</code> will be sent to all of the registered
 * <code>DocumentListeners</code>.  If the <code>Document</code>
 * implementation supports undo/redo capabilities, an
 * <code>UndoableEditEvent</code> will be sent
 * to all of the registered <code>UndoableEditListener</code>s.
 * If an undoable edit is undone, a <code>DocumentEvent</code> should be
 * fired from the Document to indicate it has changed again.
 * In this case however, there should be no <code>UndoableEditEvent</code>
 * generated since that edit is actually the source of the change
 * rather than a mutation to the <code>Document</code> made through its
 * api.
 * <p style="text-align:center"><img src="doc-files/Document-notification.gif"
 * alt="The preceding text describes this graphic.">
 * <p>
 * Referring to the above diagram, suppose that the component shown
 * on the left mutates the document object represented by the blue
 * rectangle. The document responds by dispatching a DocumentEvent to
 * both component views and sends an UndoableEditEvent to the listening
 * logic, which maintains a history buffer.
 * <p>
 * Now suppose that the component shown on the right mutates the same
 * document.  Again, the document dispatches a DocumentEvent to both
 * component views and sends an UndoableEditEvent to the listening logic
 * that is maintaining the history buffer.
 * <p>
 * If the history buffer is then rolled back (i.e. the last UndoableEdit
 * undone), a DocumentEvent is sent to both views, causing both of them to
 * reflect the undone mutation to the document (that is, the
 * removal of the right component's mutation). If the history buffer again
 * rolls back another change, another DocumentEvent is sent to both views,
 * causing them to reflect the undone mutation to the document -- that is,
 * the removal of the left component's mutation.
 * <p>
 * The methods related to observing mutations to the document are:
 * <ul>
 * <li><a href="#addDocumentListener(javax.swing.event.DocumentListener)">addDocumentListener(DocumentListener)</a>
 * <li><a href="#removeDocumentListener(javax.swing.event.DocumentListener)">removeDocumentListener(DocumentListener)</a>
 * <li><a href="#addUndoableEditListener(javax.swing.event.UndoableEditListener)">addUndoableEditListener(UndoableEditListener)</a>
 * <li><a href="#removeUndoableEditListener(javax.swing.event.UndoableEditListener)">removeUndoableEditListener(UndoableEditListener)</a>
 * </ul>
 *
 * <p><b><font size=+1>Properties</font></b>
 * <p>
 * Document implementations will generally have some set of properties
 * associated with them at runtime.  Two well known properties are the
 * <a href="#StreamDescriptionProperty">StreamDescriptionProperty</a>,
 * which can be used to describe where the <code>Document</code> came from,
 * and the <a href="#TitleProperty">TitleProperty</a>, which can be used to
 * name the <code>Document</code>.  The methods related to the properties are:
 * <ul>
 * <li>{@link #getProperty(java.lang.Object)}
 * <li>{@link #putProperty(java.lang.Object, java.lang.Object)}
 * </ul>
 *
 * <p>For more information on the <code>Document</code> class, see
 * <a href="http://java.sun.com/products/jfc/tsc">The Swing Connection</a>
 * and most particularly the article,
 * <a href="http://java.sun.com/products/jfc/tsc/articles/text/element_interface">
 * The Element Interface</a>.
 *
 * @author  Timothy Prinzing
 *
 * @see javax.swing.event.DocumentEvent
 * @see javax.swing.event.DocumentListener
 * @see javax.swing.event.UndoableEditEvent
 * @see javax.swing.event.UndoableEditListener
 * @see Element
 * @see Position
 * @see AttributeSet
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Document.java
    public Node renameNode(Node n,
                           String namespaceURI,
                           String qualifiedName)

    /**
     * Rename an existing node of type <code>ELEMENT_NODE</code> or
     * <code>ATTRIBUTE_NODE</code>.
     * <br>When possible this simply changes the name of the given node,
     * otherwise this creates a new node with the specified name and
     * replaces the existing node with the new node as described below.
     * <br>If simply changing the name of the given node is not possible, the
     * following operations are performed: a new node is created, any
     * registered event listener is registered on the new node, any user
     * data attached to the old node is removed from that node, the old node
     * is removed from its parent if it has one, the children are moved to
     * the new node, if the renamed node is an <code>Element</code> its
     * attributes are moved to the new node, the new node is inserted at the
     * position the old node used to have in its parent's child nodes list
     * if it has one, the user data that was attached to the old node is
     * attached to the new node.
     * <br>When the node being renamed is an <code>Element</code> only the
     * specified attributes are moved, default attributes originated from
     * the DTD are updated according to the new element name. In addition,
     * the implementation may update default attributes from other schemas.
     * Applications should use <code>Document.normalizeDocument()</code> to
     * guarantee these attributes are up-to-date.
     * <br>When the node being renamed is an <code>Attr</code> that is
     * attached to an <code>Element</code>, the node is first removed from
     * the <code>Element</code> attributes map. Then, once renamed, either
     * by modifying the existing node or creating a new one as described
     * above, it is put back.
     * <br>In addition,
     * <ul>
     * <li> a user data event <code>NODE_RENAMED</code> is fired,
     * </li>
     * <li>
     * when the implementation supports the feature "MutationNameEvents",
     * each mutation operation involved in this method fires the appropriate
     * event, and in the end the event {
     * <code>http://www.w3.org/2001/xml-events</code>,
     * <code>DOMElementNameChanged</code>} or {
     * <code>http://www.w3.org/2001/xml-events</code>,
     * <code>DOMAttributeNameChanged</code>} is fired.
     * </li>
     * </ul>
     * @param n The node to rename.
     * @param namespaceURI The new namespace URI.
     * @param qualifiedName The new qualified name.
     * @return The renamed node. This is either the specified node or the new
     *   node that was created to replace the specified node.
     * @exception DOMException
     *   NOT_SUPPORTED_ERR: Raised when the type of the specified node is
     *   neither <code>ELEMENT_NODE</code> nor <code>ATTRIBUTE_NODE</code>,
     *   or if the implementation does not support the renaming of the
     *   document element.
     *   <br>INVALID_CHARACTER_ERR: Raised if the new qualified name is not an
     *   XML name according to the XML version in use specified in the
     *   <code>Document.xmlVersion</code> attribute.
     *   <br>WRONG_DOCUMENT_ERR: Raised when the specified node was created
     *   from a different document than this document.
     *   <br>NAMESPACE_ERR: Raised if the <code>qualifiedName</code> is a
     *   malformed qualified name, if the <code>qualifiedName</code> has a
     *   prefix and the <code>namespaceURI</code> is <code>null</code>, or
     *   if the <code>qualifiedName</code> has a prefix that is "xml" and
     *   the <code>namespaceURI</code> is different from "<a href='http://www.w3.org/XML/1998/namespace'>
     *   http://www.w3.org/XML/1998/namespace</a>" [<a href='http://www.w3.org/TR/1999/REC-xml-names-19990114/'>XML Namespaces</a>]
     *   . Also raised, when the node being renamed is an attribute, if the
     *   <code>qualifiedName</code>, or its prefix, is "xmlns" and the
     *   <code>namespaceURI</code> is different from "<a href='http://www.w3.org/2000/xmlns/'>http://www.w3.org/2000/xmlns/</a>".
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Document.java
    public void normalizeDocument();

    /**
     *  This method acts as if the document was going through a save and load
     * cycle, putting the document in a "normal" form. As a consequence,
     * this method updates the replacement tree of
     * <code>EntityReference</code> nodes and normalizes <code>Text</code>
     * nodes, as defined in the method <code>Node.normalize()</code>.
     * <br> Otherwise, the actual result depends on the features being set on
     * the <code>Document.domConfig</code> object and governing what
     * operations actually take place. Noticeably this method could also
     * make the document namespace well-formed according to the algorithm
     * described in , check the character normalization, remove the
     * <code>CDATASection</code> nodes, etc. See
     * <code>DOMConfiguration</code> for details.
     * <pre>// Keep in the document
     * the information defined // in the XML Information Set (Java example)
     * DOMConfiguration docConfig = myDocument.getDomConfig();
     * docConfig.setParameter("infoset", Boolean.TRUE);
     * myDocument.normalizeDocument();</pre>
     *
     * <br>Mutation events, when supported, are generated to reflect the
     * changes occurring on the document.
     * <br> If errors occur during the invocation of this method, such as an
     * attempt to update a read-only node or a <code>Node.nodeName</code>
     * contains an invalid character according to the XML version in use,
     * errors or warnings (<code>DOMError.SEVERITY_ERROR</code> or
     * <code>DOMError.SEVERITY_WARNING</code>) will be reported using the
     * <code>DOMErrorHandler</code> object associated with the "error-handler
     * " parameter. Note this method might also report fatal errors (
     * <code>DOMError.SEVERITY_FATAL_ERROR</code>) if an implementation
     * cannot recover from an error.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Document.java
    public DOMConfiguration getDomConfig();

    /**
     *  The configuration used when <code>Document.normalizeDocument()</code>
     * is invoked.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Document.java
    public Node adoptNode(Node source)

    /**
     *  Attempts to adopt a node from another document to this document. If
     * supported, it changes the <code>ownerDocument</code> of the source
     * node, its children, as well as the attached attribute nodes if there
     * are any. If the source node has a parent it is first removed from the
     * child list of its parent. This effectively allows moving a subtree
     * from one document to another (unlike <code>importNode()</code> which
     * create a copy of the source node instead of moving it). When it
     * fails, applications should use <code>Document.importNode()</code>
     * instead. Note that if the adopted node is already part of this
     * document (i.e. the source and target document are the same), this
     * method still has the effect of removing the source node from the
     * child list of its parent, if any. The following list describes the
     * specifics for each type of node.
     * <dl>
     * <dt>ATTRIBUTE_NODE</dt>
     * <dd>The
     * <code>ownerElement</code> attribute is set to <code>null</code> and
     * the <code>specified</code> flag is set to <code>true</code> on the
     * adopted <code>Attr</code>. The descendants of the source
     * <code>Attr</code> are recursively adopted.</dd>
     * <dt>DOCUMENT_FRAGMENT_NODE</dt>
     * <dd>The
     * descendants of the source node are recursively adopted.</dd>
     * <dt>DOCUMENT_NODE</dt>
     * <dd>
     * <code>Document</code> nodes cannot be adopted.</dd>
     * <dt>DOCUMENT_TYPE_NODE</dt>
     * <dd>
     * <code>DocumentType</code> nodes cannot be adopted.</dd>
     * <dt>ELEMENT_NODE</dt>
     * <dd><em>Specified</em> attribute nodes of the source element are adopted. Default attributes
     * are discarded, though if the document being adopted into defines
     * default attributes for this element name, those are assigned. The
     * descendants of the source element are recursively adopted.</dd>
     * <dt>ENTITY_NODE</dt>
     * <dd>
     * <code>Entity</code> nodes cannot be adopted.</dd>
     * <dt>ENTITY_REFERENCE_NODE</dt>
     * <dd>Only
     * the <code>EntityReference</code> node itself is adopted, the
     * descendants are discarded, since the source and destination documents
     * might have defined the entity differently. If the document being
     * imported into provides a definition for this entity name, its value
     * is assigned.</dd>
     * <dt>NOTATION_NODE</dt>
     * <dd><code>Notation</code> nodes cannot be
     * adopted.</dd>
     * <dt>PROCESSING_INSTRUCTION_NODE, TEXT_NODE, CDATA_SECTION_NODE,
     * COMMENT_NODE</dt>
     * <dd>These nodes can all be adopted. No specifics.</dd>
     * </dl>
     * <p ><b>Note:</b>  Since it does not create new nodes unlike the
     * <code>Document.importNode()</code> method, this method does not raise
     * an <code>INVALID_CHARACTER_ERR</code> exception, and applications
     * should use the <code>Document.normalizeDocument()</code> method to
     * check if an imported name is not an XML name according to the XML
     * version in use.
     * @param source The node to move into this document.
     * @return The adopted node, or <code>null</code> if this operation
     *   fails, such as when the source node comes from a different
     *   implementation.
     * @exception DOMException
     *   NOT_SUPPORTED_ERR: Raised if the source node is of type
     *   <code>DOCUMENT</code>, <code>DOCUMENT_TYPE</code>.
     *   <br>NO_MODIFICATION_ALLOWED_ERR: Raised when the source node is
     *   readonly.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Document.java
    public String getDocumentURI();

    /**
     *  The location of the document or <code>null</code> if undefined or if
     * the <code>Document</code> was created using
     * <code>DOMImplementation.createDocument</code>. No lexical checking is
     * performed when setting this attribute; this could result in a
     * <code>null</code> value returned when using <code>Node.baseURI</code>
     * .
     * <br> Beware that when the <code>Document</code> supports the feature
     * "HTML" [<a href='http://www.w3.org/TR/2003/REC-DOM-Level-2-HTML-20030109'>DOM Level 2 HTML</a>]
     * , the href attribute of the HTML BASE element takes precedence over
     * this attribute when computing <code>Node.baseURI</code>.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Document.java
    public boolean getStrictErrorChecking();

    /**
     * An attribute specifying whether error checking is enforced or not. When
     * set to <code>false</code>, the implementation is free to not test
     * every possible error case normally defined on DOM operations, and not
     * raise any <code>DOMException</code> on DOM operations or report
     * errors while using <code>Document.normalizeDocument()</code>. In case
     * of error, the behavior is undefined. This attribute is
     * <code>true</code> by default.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Document.java
    public String getXmlVersion();

    /**
     *  An attribute specifying, as part of the <a href='http://www.w3.org/TR/2004/REC-xml-20040204#NT-XMLDecl'>XML declaration</a>, the version number of this document. If there is no declaration and if
     * this document supports the "XML" feature, the value is
     * <code>"1.0"</code>. If this document does not support the "XML"
     * feature, the value is always <code>null</code>. Changing this
     * attribute will affect methods that check for invalid characters in
     * XML names. Application should invoke
     * <code>Document.normalizeDocument()</code> in order to check for
     * invalid characters in the <code>Node</code>s that are already part of
     * this <code>Document</code>.
     * <br> DOM applications may use the
     * <code>DOMImplementation.hasFeature(feature, version)</code> method
     * with parameter values "XMLVersion" and "1.0" (respectively) to
     * determine if an implementation supports [<a href='http://www.w3.org/TR/2004/REC-xml-20040204'>XML 1.0</a>]. DOM
     * applications may use the same method with parameter values
     * "XMLVersion" and "1.1" (respectively) to determine if an
     * implementation supports [<a href='http://www.w3.org/TR/2004/REC-xml11-20040204/'>XML 1.1</a>]. In both
     * cases, in order to support XML, an implementation must also support
     * the "XML" feature defined in this specification. <code>Document</code>
     *  objects supporting a version of the "XMLVersion" feature must not
     * raise a <code>NOT_SUPPORTED_ERR</code> exception for the same version
     * number when using <code>Document.xmlVersion</code>.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Document.java
    public boolean getXmlStandalone();

    /**
     * An attribute specifying, as part of the <a href='http://www.w3.org/TR/2004/REC-xml-20040204#NT-XMLDecl'>XML declaration</a>, whether this document is standalone. This is <code>false</code> when
     * unspecified.
     * <p ><b>Note:</b>  No verification is done on the value when setting
     * this attribute. Applications should use
     * <code>Document.normalizeDocument()</code> with the "validate"
     * parameter to verify if the value matches the <a href='http://www.w3.org/TR/2004/REC-xml-20040204#sec-rmd'>validity
     * constraint for standalone document declaration</a> as defined in [<a href='http://www.w3.org/TR/2004/REC-xml-20040204'>XML 1.0</a>].
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Document.java
    public String getXmlEncoding();

    /**
     * An attribute specifying, as part of the <a href='http://www.w3.org/TR/2004/REC-xml-20040204#NT-XMLDecl'>XML declaration</a>, the encoding of this document. This is <code>null</code> when
     * unspecified or when it is not known, such as when the
     * <code>Document</code> was created in memory.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Document.java
    public String getInputEncoding();

    /**
     * An attribute specifying the encoding used for this document at the time
     * of the parsing. This is <code>null</code> when it is not known, such
     * as when the <code>Document</code> was created in memory.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Document.java
    public Element getElementById(String elementId);

    /**
     * Returns the <code>Element</code> that has an ID attribute with the
     * given value. If no such element exists, this returns <code>null</code>
     * . If more than one element has an ID attribute with that value, what
     * is returned is undefined.
     * <br> The DOM implementation is expected to use the attribute
     * <code>Attr.isId</code> to determine if an attribute is of type ID.
     * <p ><b>Note:</b> Attributes with the name "ID" or "id" are not of type
     * ID unless so defined.
     * @param elementId The unique <code>id</code> value for an element.
     * @return The matching element or <code>null</code> if there is none.
     * @since DOM Level 2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Document.java
    public NodeList getElementsByTagNameNS(String namespaceURI,
                                           String localName);

    /**
     * Returns a <code>NodeList</code> of all the <code>Elements</code> with a
     * given local name and namespace URI in document order.
     * @param namespaceURI The namespace URI of the elements to match on. The
     *   special value <code>"*"</code> matches all namespaces.
     * @param localName The local name of the elements to match on. The
     *   special value "*" matches all local names.
     * @return A new <code>NodeList</code> object containing all the matched
     *   <code>Elements</code>.
     * @since DOM Level 2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Document.java
    public Attr createAttributeNS(String namespaceURI,
                                  String qualifiedName)

    /**
     * Creates an attribute of the given qualified name and namespace URI.
     * <br>Per [<a href='http://www.w3.org/TR/1999/REC-xml-names-19990114/'>XML Namespaces</a>]
     * , applications must use the value <code>null</code> as the
     * <code>namespaceURI</code> parameter for methods if they wish to have
     * no namespace.
     * @param namespaceURI The namespace URI of the attribute to create.
     * @param qualifiedName The qualified name of the attribute to
     *   instantiate.
     * @return A new <code>Attr</code> object with the following attributes:
     * <table border='1' cellpadding='3'>
     * <tr>
     * <th>
     *   Attribute</th>
     * <th>Value</th>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'><code>Node.nodeName</code></td>
     * <td valign='top' rowspan='1' colspan='1'>qualifiedName</td>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'>
     *   <code>Node.namespaceURI</code></td>
     * <td valign='top' rowspan='1' colspan='1'><code>namespaceURI</code></td>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'>
     *   <code>Node.prefix</code></td>
     * <td valign='top' rowspan='1' colspan='1'>prefix, extracted from
     *   <code>qualifiedName</code>, or <code>null</code> if there is no
     *   prefix</td>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'><code>Node.localName</code></td>
     * <td valign='top' rowspan='1' colspan='1'>local name, extracted from
     *   <code>qualifiedName</code></td>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'><code>Attr.name</code></td>
     * <td valign='top' rowspan='1' colspan='1'>
     *   <code>qualifiedName</code></td>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'><code>Node.nodeValue</code></td>
     * <td valign='top' rowspan='1' colspan='1'>the empty
     *   string</td>
     * </tr>
     * </table>
     * @exception DOMException
     *   INVALID_CHARACTER_ERR: Raised if the specified
     *   <code>qualifiedName</code> is not an XML name according to the XML
     *   version in use specified in the <code>Document.xmlVersion</code>
     *   attribute.
     *   <br>NAMESPACE_ERR: Raised if the <code>qualifiedName</code> is a
     *   malformed qualified name, if the <code>qualifiedName</code> has a
     *   prefix and the <code>namespaceURI</code> is <code>null</code>, if
     *   the <code>qualifiedName</code> has a prefix that is "xml" and the
     *   <code>namespaceURI</code> is different from "<a href='http://www.w3.org/XML/1998/namespace'>
     *   http://www.w3.org/XML/1998/namespace</a>", if the <code>qualifiedName</code> or its prefix is "xmlns" and the
     *   <code>namespaceURI</code> is different from "<a href='http://www.w3.org/2000/xmlns/'>http://www.w3.org/2000/xmlns/</a>", or if the <code>namespaceURI</code> is "<a href='http://www.w3.org/2000/xmlns/'>http://www.w3.org/2000/xmlns/</a>" and neither the <code>qualifiedName</code> nor its prefix is "xmlns".
     *   <br>NOT_SUPPORTED_ERR: Always thrown if the current document does not
     *   support the <code>"XML"</code> feature, since namespaces were
     *   defined by XML.
     * @since DOM Level 2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Document.java
    public Element createElementNS(String namespaceURI,
                                   String qualifiedName)

    /**
     * Creates an element of the given qualified name and namespace URI.
     * <br>Per [<a href='http://www.w3.org/TR/1999/REC-xml-names-19990114/'>XML Namespaces</a>]
     * , applications must use the value <code>null</code> as the
     * namespaceURI parameter for methods if they wish to have no namespace.
     * @param namespaceURI The namespace URI of the element to create.
     * @param qualifiedName The qualified name of the element type to
     *   instantiate.
     * @return A new <code>Element</code> object with the following
     *   attributes:
     * <table border='1' cellpadding='3'>
     * <tr>
     * <th>Attribute</th>
     * <th>Value</th>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'><code>Node.nodeName</code></td>
     * <td valign='top' rowspan='1' colspan='1'>
     *   <code>qualifiedName</code></td>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'><code>Node.namespaceURI</code></td>
     * <td valign='top' rowspan='1' colspan='1'>
     *   <code>namespaceURI</code></td>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'><code>Node.prefix</code></td>
     * <td valign='top' rowspan='1' colspan='1'>prefix, extracted
     *   from <code>qualifiedName</code>, or <code>null</code> if there is
     *   no prefix</td>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'><code>Node.localName</code></td>
     * <td valign='top' rowspan='1' colspan='1'>local name, extracted from
     *   <code>qualifiedName</code></td>
     * </tr>
     * <tr>
     * <td valign='top' rowspan='1' colspan='1'><code>Element.tagName</code></td>
     * <td valign='top' rowspan='1' colspan='1'>
     *   <code>qualifiedName</code></td>
     * </tr>
     * </table>
     * @exception DOMException
     *   INVALID_CHARACTER_ERR: Raised if the specified
     *   <code>qualifiedName</code> is not an XML name according to the XML
     *   version in use specified in the <code>Document.xmlVersion</code>
     *   attribute.
     *   <br>NAMESPACE_ERR: Raised if the <code>qualifiedName</code> is a
     *   malformed qualified name, if the <code>qualifiedName</code> has a
     *   prefix and the <code>namespaceURI</code> is <code>null</code>, or
     *   if the <code>qualifiedName</code> has a prefix that is "xml" and
     *   the <code>namespaceURI</code> is different from "<a href='http://www.w3.org/XML/1998/namespace'>
     *   http://www.w3.org/XML/1998/namespace</a>" [<a href='http://www.w3.org/TR/1999/REC-xml-names-19990114/'>XML Namespaces</a>]
     *   , or if the <code>qualifiedName</code> or its prefix is "xmlns" and
     *   the <code>namespaceURI</code> is different from "<a href='http://www.w3.org/2000/xmlns/'>http://www.w3.org/2000/xmlns/</a>", or if the <code>namespaceURI</code> is "<a href='http://www.w3.org/2000/xmlns/'>http://www.w3.org/2000/xmlns/</a>" and neither the <code>qualifiedName</code> nor its prefix is "xmlns".
     *   <br>NOT_SUPPORTED_ERR: Always thrown if the current document does not
     *   support the <code>"XML"</code> feature, since namespaces were
     *   defined by XML.
     * @since DOM Level 2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Document.java
    public Node importNode(Node importedNode,
                           boolean deep)

    /**
     * Imports a node from another document to this document, without altering
     * or removing the source node from the original document; this method
     * creates a new copy of the source node. The returned node has no
     * parent; (<code>parentNode</code> is <code>null</code>).
     * <br>For all nodes, importing a node creates a node object owned by the
     * importing document, with attribute values identical to the source
     * node's <code>nodeName</code> and <code>nodeType</code>, plus the
     * attributes related to namespaces (<code>prefix</code>,
     * <code>localName</code>, and <code>namespaceURI</code>). As in the
     * <code>cloneNode</code> operation, the source node is not altered.
     * User data associated to the imported node is not carried over.
     * However, if any <code>UserDataHandlers</code> has been specified
     * along with the associated data these handlers will be called with the
     * appropriate parameters before this method returns.
     * <br>Additional information is copied as appropriate to the
     * <code>nodeType</code>, attempting to mirror the behavior expected if
     * a fragment of XML or HTML source was copied from one document to
     * another, recognizing that the two documents may have different DTDs
     * in the XML case. The following list describes the specifics for each
     * type of node.
     * <dl>
     * <dt>ATTRIBUTE_NODE</dt>
     * <dd>The <code>ownerElement</code> attribute
     * is set to <code>null</code> and the <code>specified</code> flag is
     * set to <code>true</code> on the generated <code>Attr</code>. The
     * descendants of the source <code>Attr</code> are recursively imported
     * and the resulting nodes reassembled to form the corresponding subtree.
     * Note that the <code>deep</code> parameter has no effect on
     * <code>Attr</code> nodes; they always carry their children with them
     * when imported.</dd>
     * <dt>DOCUMENT_FRAGMENT_NODE</dt>
     * <dd>If the <code>deep</code> option
     * was set to <code>true</code>, the descendants of the source
     * <code>DocumentFragment</code> are recursively imported and the
     * resulting nodes reassembled under the imported
     * <code>DocumentFragment</code> to form the corresponding subtree.
     * Otherwise, this simply generates an empty
     * <code>DocumentFragment</code>.</dd>
     * <dt>DOCUMENT_NODE</dt>
     * <dd><code>Document</code>
     * nodes cannot be imported.</dd>
     * <dt>DOCUMENT_TYPE_NODE</dt>
     * <dd><code>DocumentType</code>
     * nodes cannot be imported.</dd>
     * <dt>ELEMENT_NODE</dt>
     * <dd><em>Specified</em> attribute nodes of the source element are imported, and the generated
     * <code>Attr</code> nodes are attached to the generated
     * <code>Element</code>. Default attributes are <em>not</em> copied, though if the document being imported into defines default
     * attributes for this element name, those are assigned. If the
     * <code>importNode</code> <code>deep</code> parameter was set to
     * <code>true</code>, the descendants of the source element are
     * recursively imported and the resulting nodes reassembled to form the
     * corresponding subtree.</dd>
     * <dt>ENTITY_NODE</dt>
     * <dd><code>Entity</code> nodes can be
     * imported, however in the current release of the DOM the
     * <code>DocumentType</code> is readonly. Ability to add these imported
     * nodes to a <code>DocumentType</code> will be considered for addition
     * to a future release of the DOM.On import, the <code>publicId</code>,
     * <code>systemId</code>, and <code>notationName</code> attributes are
     * copied. If a <code>deep</code> import is requested, the descendants
     * of the the source <code>Entity</code> are recursively imported and
     * the resulting nodes reassembled to form the corresponding subtree.</dd>
     * <dt>
     * ENTITY_REFERENCE_NODE</dt>
     * <dd>Only the <code>EntityReference</code> itself is
     * copied, even if a <code>deep</code> import is requested, since the
     * source and destination documents might have defined the entity
     * differently. If the document being imported into provides a
     * definition for this entity name, its value is assigned.</dd>
     * <dt>NOTATION_NODE</dt>
     * <dd>
     * <code>Notation</code> nodes can be imported, however in the current
     * release of the DOM the <code>DocumentType</code> is readonly. Ability
     * to add these imported nodes to a <code>DocumentType</code> will be
     * considered for addition to a future release of the DOM.On import, the
     * <code>publicId</code> and <code>systemId</code> attributes are copied.
     * Note that the <code>deep</code> parameter has no effect on this type
     * of nodes since they cannot have any children.</dd>
     * <dt>
     * PROCESSING_INSTRUCTION_NODE</dt>
     * <dd>The imported node copies its
     * <code>target</code> and <code>data</code> values from those of the
     * source node.Note that the <code>deep</code> parameter has no effect
     * on this type of nodes since they cannot have any children.</dd>
     * <dt>TEXT_NODE,
     * CDATA_SECTION_NODE, COMMENT_NODE</dt>
     * <dd>These three types of nodes inheriting
     * from <code>CharacterData</code> copy their <code>data</code> and
     * <code>length</code> attributes from those of the source node.Note
     * that the <code>deep</code> parameter has no effect on these types of
     * nodes since they cannot have any children.</dd>
     * </dl>
     * @param importedNode The node to import.
     * @param deep If <code>true</code>, recursively import the subtree under
     *   the specified node; if <code>false</code>, import only the node
     *   itself, as explained above. This has no effect on nodes that cannot
     *   have any children, and on <code>Attr</code>, and
     *   <code>EntityReference</code> nodes.
     * @return The imported node that belongs to this <code>Document</code>.
     * @exception DOMException
     *   NOT_SUPPORTED_ERR: Raised if the type of node being imported is not
     *   supported.
     *   <br>INVALID_CHARACTER_ERR: Raised if one of the imported names is not
     *   an XML name according to the XML version in use specified in the
     *   <code>Document.xmlVersion</code> attribute. This may happen when
     *   importing an XML 1.1 [<a href='http://www.w3.org/TR/2004/REC-xml11-20040204/'>XML 1.1</a>] element
     *   into an XML 1.0 document, for instance.
     * @since DOM Level 2
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Document.java
    public NodeList getElementsByTagName(String tagname);

    /**
     * Returns a <code>NodeList</code> of all the <code>Elements</code> in
     * document order with a given tag name and are contained in the
     * document.
     * @param tagname  The name of the tag to match on. The special value "*"
     *   matches all tags. For XML, the <code>tagname</code> parameter is
     *   case-sensitive, otherwise it depends on the case-sensitivity of the
     *   markup language in use.
     * @return A new <code>NodeList</code> object containing all the matched
     *   <code>Elements</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Document.java
    public EntityReference createEntityReference(String name)

    /**
     * Creates an <code>EntityReference</code> object. In addition, if the
     * referenced entity is known, the child list of the
     * <code>EntityReference</code> node is made the same as that of the
     * corresponding <code>Entity</code> node.
     * <p ><b>Note:</b> If any descendant of the <code>Entity</code> node has
     * an unbound namespace prefix, the corresponding descendant of the
     * created <code>EntityReference</code> node is also unbound; (its
     * <code>namespaceURI</code> is <code>null</code>). The DOM Level 2 and
     * 3 do not support any mechanism to resolve namespace prefixes in this
     * case.
     * @param name The name of the entity to reference.Unlike
     *   <code>Document.createElementNS</code> or
     *   <code>Document.createAttributeNS</code>, no namespace well-formed
     *   checking is done on the entity name. Applications should invoke
     *   <code>Document.normalizeDocument()</code> with the parameter "
     *   namespaces" set to <code>true</code> in order to ensure that the
     *   entity name is namespace well-formed.
     * @return The new <code>EntityReference</code> object.
     * @exception DOMException
     *   INVALID_CHARACTER_ERR: Raised if the specified name is not an XML
     *   name according to the XML version in use specified in the
     *   <code>Document.xmlVersion</code> attribute.
     *   <br>NOT_SUPPORTED_ERR: Raised if this document is an HTML document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Document.java
    public Attr createAttribute(String name)

    /**
     * Creates an <code>Attr</code> of the given name. Note that the
     * <code>Attr</code> instance can then be set on an <code>Element</code>
     * using the <code>setAttributeNode</code> method.
     * <br>To create an attribute with a qualified name and namespace URI, use
     * the <code>createAttributeNS</code> method.
     * @param name The name of the attribute.
     * @return A new <code>Attr</code> object with the <code>nodeName</code>
     *   attribute set to <code>name</code>, and <code>localName</code>,
     *   <code>prefix</code>, and <code>namespaceURI</code> set to
     *   <code>null</code>. The value of the attribute is the empty string.
     * @exception DOMException
     *   INVALID_CHARACTER_ERR: Raised if the specified name is not an XML
     *   name according to the XML version in use specified in the
     *   <code>Document.xmlVersion</code> attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Document.java
    public ProcessingInstruction createProcessingInstruction(String target,
                                                             String data)

    /**
     * Creates a <code>ProcessingInstruction</code> node given the specified
     * name and data strings.
     * @param target The target part of the processing instruction.Unlike
     *   <code>Document.createElementNS</code> or
     *   <code>Document.createAttributeNS</code>, no namespace well-formed
     *   checking is done on the target name. Applications should invoke
     *   <code>Document.normalizeDocument()</code> with the parameter "
     *   namespaces" set to <code>true</code> in order to ensure that the
     *   target name is namespace well-formed.
     * @param data The data for the node.
     * @return The new <code>ProcessingInstruction</code> object.
     * @exception DOMException
     *   INVALID_CHARACTER_ERR: Raised if the specified target is not an XML
     *   name according to the XML version in use specified in the
     *   <code>Document.xmlVersion</code> attribute.
     *   <br>NOT_SUPPORTED_ERR: Raised if this document is an HTML document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Document.java
    public CDATASection createCDATASection(String data)

    /**
     * Creates a <code>CDATASection</code> node whose value is the specified
     * string.
     * @param data The data for the <code>CDATASection</code> contents.
     * @return The new <code>CDATASection</code> object.
     * @exception DOMException
     *   NOT_SUPPORTED_ERR: Raised if this document is an HTML document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Document.java
    public Comment createComment(String data);

    /**
     * Creates a <code>Comment</code> node given the specified string.
     * @param data The data for the node.
     * @return The new <code>Comment</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Document.java
    public Text createTextNode(String data);

    /**
     * Creates a <code>Text</code> node given the specified string.
     * @param data The data for the node.
     * @return The new <code>Text</code> object.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Document.java
    public DocumentFragment createDocumentFragment();

    /**
     * Creates an empty <code>DocumentFragment</code> object.
     * @return A new <code>DocumentFragment</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Document.java
    public Element createElement(String tagName)

    /**
     * Creates an element of the type specified. Note that the instance
     * returned implements the <code>Element</code> interface, so attributes
     * can be specified directly on the returned object.
     * <br>In addition, if there are known attributes with default values,
     * <code>Attr</code> nodes representing them are automatically created
     * and attached to the element.
     * <br>To create an element with a qualified name and namespace URI, use
     * the <code>createElementNS</code> method.
     * @param tagName The name of the element type to instantiate. For XML,
     *   this is case-sensitive, otherwise it depends on the
     *   case-sensitivity of the markup language in use. In that case, the
     *   name is mapped to the canonical form of that markup by the DOM
     *   implementation.
     * @return A new <code>Element</code> object with the
     *   <code>nodeName</code> attribute set to <code>tagName</code>, and
     *   <code>localName</code>, <code>prefix</code>, and
     *   <code>namespaceURI</code> set to <code>null</code>.
     * @exception DOMException
     *   INVALID_CHARACTER_ERR: Raised if the specified name is not an XML
     *   name according to the XML version in use specified in the
     *   <code>Document.xmlVersion</code> attribute.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Document.java
    public Element getDocumentElement();

    /**
     * This is a convenience attribute that allows direct access to the child
     * node that is the document element of the document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Document.java
    public DOMImplementation getImplementation();

    /**
     * The <code>DOMImplementation</code> object that handles this document. A
     * DOM application may use objects from multiple implementations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Document.java
public interface Document extends Node {

/**
 * The <code>Document</code> interface represents the entire HTML or XML
 * document. Conceptually, it is the root of the document tree, and provides
 * the primary access to the document's data.
 * <p>Since elements, text nodes, comments, processing instructions, etc.
 * cannot exist outside the context of a <code>Document</code>, the
 * <code>Document</code> interface also contains the factory methods needed
 * to create these objects. The <code>Node</code> objects created have a
 * <code>ownerDocument</code> attribute which associates them with the
 * <code>Document</code> within whose context they were created.
 * <p>See also the <a href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407'>Document Object Model (DOM) Level 3 Core Specification</a>.
 */
