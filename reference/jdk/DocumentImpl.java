_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    private void writeObject(ObjectOutputStream out) throws IOException {

    /**
     * @serialData Serialized fields. Convert Maps to Hashtables and Lists
     * to Vectors for backward compatibility.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void renamedElement(Element oldEl, Element newEl) {

    /**
     * A method to be called when an element has been renamed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void renamedAttrNode(Attr oldAt, Attr newAt) {

    /**
     * A method to be called when an attribute node has been renamed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void removedAttrNode(AttrImpl attr, NodeImpl oldOwner, String name) {

    /**
     * A method to be called when an attribute node has been removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void setAttrNode(AttrImpl attr, AttrImpl previous) {

    /**
     * A method to be called when an attribute node has been set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void modifiedAttrValue(AttrImpl attr, String oldvalue) {

    /**
     * A method to be called when an attribute value has been modified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void replacedNode(NodeImpl node) {

    /**
     * A method to be called when a node has been replaced in the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void replacingData (NodeImpl node) {

    /**
     * A method to be called when character data is about to be replaced in the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void replacingNode(NodeImpl node) {

    /**
     * A method to be called when a node is about to be replaced in the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void removedNode(NodeImpl node, boolean replace) {

    /**
     * A method to be called when a node has been removed from the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void removingNode(NodeImpl node, NodeImpl oldChild, boolean replace) {

    /**
     * A method to be called when a node is about to be removed from the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void insertedNode(NodeImpl node, NodeImpl newInternal, boolean replace) {

    /**
     * A method to be called when a node has been inserted in the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void insertingNode(NodeImpl node, boolean replace) {

    /**
     * A method to be called when a node is about to be inserted in the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void replacedCharacterData(NodeImpl node, String oldvalue, String value) {

    /**
     * A method to be called when a character data node has been replaced
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void modifiedCharacterData(NodeImpl node, String oldvalue, String value, boolean replace) {

    /**
     * A method to be called when a character data node has been modified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void modifyingCharacterData(NodeImpl node, boolean replace) {

    /**
     * A method to be called when a character data node has been modified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    protected void saveEnclosingAttr(NodeImpl node) {

    /**
     * NON-DOM INTERNAL: Pre-mutation context check, in
     * preparation for later generating DOMAttrModified events.
     * Determines whether this node is within an Attr
     * @param node node to get enclosing attribute for
     * @return either a description of that Attr, or null if none such.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    protected void dispatchAggregateEvents(NodeImpl node,
                                           AttrImpl enclosingAttr,
                                           String oldvalue, short change) {

    /**
     * NON-DOM INTERNAL: Generate the "aggregated" post-mutation events
     * DOMAttrModified and DOMSubtreeModified.
     * Both of these should be issued only once for each user-requested
     * mutation operation, even if that involves multiple changes to
     * the DOM.
     * For example, if a DOM operation makes multiple changes to a single
     * Attr before returning, it would be nice to generate only one
     * DOMAttrModified, and multiple changes over larger scope but within
     * a recognizable single subtree might want to generate only one
     * DOMSubtreeModified, sent to their lowest common ancestor.
     * <p>
     * To manage this, use the "internal" versions of insert and remove
     * with MUTATION_LOCAL, then make an explicit call to this routine
     * at the higher level. Some examples now exist in our code.
     *
     * @param node The node to dispatch to
     * @param enclosingAttr The Attr node (if any) whose value has been changed
     * as a result of the DOM operation. Null if none such.
     * @param oldValue The String value previously held by the
     * enclosingAttr. Ignored if none such.
     * @param change Type of modification to the attr. See
     * MutationEvent.attrChange
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    protected void dispatchAggregateEvents(NodeImpl node, EnclosingAttr ea) {

    /**
     * NON-DOM INTERNAL: Convenience wrapper for calling
     * dispatchAggregateEvents when the context was established
     * by <code>savedEnclosingAttr</code>.
     * @param node node to dispatch to
     * @param ea description of Attr affected by current operation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    class EnclosingAttr implements Serializable {

    /**
     * NON-DOM INTERNAL: Return object for getEnclosingAttr. Carries
     * (two values, the Attr node affected (if any) and its previous
     * string value. Simple struct, no methods.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    protected void dispatchingEventToSubtree(Node n, Event e) {

    /**
     * Dispatches event to the target node's descendents recursively
     *
     * @param n node to dispatch to
     * @param e event to be sent to that node and its subtree
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    protected void dispatchEventToSubtree(Node n, Event e) {

    /**
     * NON-DOM INTERNAL: DOMNodeInsertedIntoDocument and ...RemovedFrom...
     * are dispatched to an entire subtree. This is the distribution code
     * therefor. They DO NOT bubble, thanks be, but may be captured.
     * <p>
     * Similar to code in dispatchingEventToSubtree however this method
     * is only used on the target node and does not start a dispatching chain
     * on the sibling of the target node as this is not part of the subtree
     * ***** At the moment I'm being sloppy and using the normal
     * capture dispatcher on every node. This could be optimized hugely
     * by writing a capture engine that tracks our position in the tree to
     * update the capture chain without repeated chases up to root.
     * @param n target node (that was directly inserted or removed)
     * @param e event to be sent to that node and its subtree
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    @Override

    /**
     * Introduced in DOM Level 2. <p>
     * Distribution engine for DOM Level 2 Events.
     * <p>
     * Event propagation runs as follows:
     * <ol>
     * <li>Event is dispatched to a particular target node, which invokes
     *   this code. Note that the event's stopPropagation flag is
     *   cleared when dispatch begins; thereafter, if it has
     *   been set before processing of a node commences, we instead
     *   immediately advance to the DEFAULT phase.
     * <li>The node's ancestors are established as destinations for events.
     *   For capture and bubble purposes, node ancestry is determined at
     *   the time dispatch starts. If an event handler alters the document
     *   tree, that does not change which nodes will be informed of the event.
     * <li>CAPTURING_PHASE: Ancestors are scanned, root to target, for
     *   Capturing listeners. If found, they are invoked (see below).
     * <li>AT_TARGET:
     *   Event is dispatched to NON-CAPTURING listeners on the
     *   target node. Note that capturing listeners on this node are _not_
     *   invoked.
     * <li>BUBBLING_PHASE: Ancestors are scanned, target to root, for
     *   non-capturing listeners.
     * <li>Default processing: Some DOMs have default behaviors bound to
     *   specific nodes. If this DOM does, and if the event's preventDefault
     *   flag has not been set, we now return to the target node and process
     *   its default handler for this event, if any.
     * </ol>
     * <p>
     * Note that registration of handlers during processing of an event does
     * not take effect during this phase of this event; they will not be called
     * until the next time this node is visited by dispatchEvent. On the other
     * hand, removals take effect immediately.
     * <p>
     * If an event handler itself causes events to be dispatched, they are
     * processed synchronously, before processing resumes
     * on the event which triggered them. Please be aware that this may
     * result in events arriving at listeners "out of order" relative
     * to the actual sequence of requests.
     * <p>
     * Note that our implementation resets the event's stop/prevent flags
     * when dispatch begins.
     * I believe the DOM's intent is that event objects be redispatchable,
     * though it isn't stated in those terms.
     * @param node node to dispatch to
     * @param event the event object to be dispatched to
     *              registered EventListeners
     * @return true if the event's <code>preventDefault()</code>
     *              method was invoked by an EventListener; otherwise false.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    @Override

    /**
     * Introduced in DOM Level 2. <p> Deregister an event listener previously
     * registered with this Node.  A listener must be independently removed
     * from the Capturing and Bubbling roles. Redundant removals (of listeners
     * not currently registered for this role) are ignored.
     * @param node node to remove listener from
     * @param type Event name (NOT event group!) to listen for.
     * @param listener Who gets called when event is dispatched
     * @param useCapture True iff listener is registered on
     *  capturing phase rather than at-target or bubbling
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    @Override

    /**
     * Introduced in DOM Level 2. <p> Register an event listener with this
     * Node. A listener may be independently registered as both Capturing and
     * Bubbling, but may only be registered once per role; redundant
     * registrations are ignored.
     * @param node node to add listener to
     * @param type Event name (NOT event group!) to listen for.
     * @param listener Who gets called when event is dispatched
     * @param useCapture True iff listener is registered on
     *  capturing phase rather than at-target or bubbling
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
        LEntry(String type, EventListener listener, boolean useCapture)

        /** NON-DOM INTERNAL: Constructor for Listener list Entry
         * @param type Event name (NOT event group!) to listen for.
         * @param listener Who gets called when event is dispatched
         * @param useCaptue True iff listener is registered on
         *  capturing phase rather than at-target or bubbling
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    private List<LEntry> getEventListeners(NodeImpl n) {

    /**
     * Retreive event listener registered on a given node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    private void setEventListeners(NodeImpl n, List<LEntry> listeners) {

    /**
     * Store event listener registered on a given node
     * This is another place where we could use weak references! Indeed, the
     * node here won't be GC'ed as long as some listener is registered on it,
     * since the eventsListeners table will have a reference to the node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    boolean getMutationEvents() {

    /**
     * Returns true if the DOM implementation generates mutation events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void setMutationEvents(boolean set) {

    /**
     * Sets whether the DOM implementation generates mutation events
     * upon operations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    public Event createEvent(String type)

    /**
     * Introduced in DOM Level 2. Optional. <p>
     * Create and return Event objects.
     *
     * @param type The eventType parameter specifies the type of Event
     * interface to be created.  If the Event interface specified is supported
     * by the implementation this method will return a new Event of the
     * interface type requested. If the Event is to be dispatched via the
     * dispatchEvent method the appropriate event init method must be called
     * after creation in order to initialize the Event's values.  As an
     * example, a user wishing to synthesize some kind of Event would call
     * createEvent with the parameter "Events". The initEvent method could then
     * be called on the newly created Event to set the specific type of Event
     * to be dispatched and set its context information.
     * @return Newly created Event
     * @exception DOMException NOT_SUPPORTED_ERR: Raised if the implementation
     * does not support the type of Event interface requested
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void splitData(Node node, Node newNode, int offset) {

    /**
     * A method to be called when a text node has been split,
     * so that live objects can be notified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void insertedText(NodeImpl node, int offset, int count) {

    /**
     * A method to be called when some text was inserted into a text node,
     * so that live objects can be notified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void deletedText(NodeImpl node, int offset, int count) {

    /**
     * A method to be called when some text was deleted from a text node,
     * so that live objects can be notified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void replacedText(NodeImpl node) {

    /**
     * A method to be called when some text was changed in a text node,
     * so that live objects can be notified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void removeRange(Range range) {

    /** Not a client function. Called by Range.detach(),
     *  so a Range can remove itself from the list of
     *  Ranges.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    public Range createRange() {

    /**
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
     void removeNodeIterator(NodeIterator nodeIterator) {

    /** This is not called by the developer client. The
     *  developer client uses the detach() function on the
     *  NodeIterator itself. <p>
     *
     *  This function is called from the NodeIterator#detach().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    public TreeWalker createTreeWalker(Node root,
                                       int whatToShow,
                                       NodeFilter filter,
                                       boolean entityReferenceExpansion)

    /**
     * Create and return a TreeWalker.
     *
     * @param root The root of the iterator.
     * @param whatToShow The whatToShow mask.
     * @param filter The NodeFilter installed. Null means no filter.
     * @param entityReferenceExpansion true to expand the contents of
     *                                 EntityReference nodes
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    public TreeWalker createTreeWalker(Node root,
                                       short whatToShow,
                                       NodeFilter filter)

    /**
     * NON-DOM extension:
     * Create and return a TreeWalker.
     *
     * @param root The root of the iterator.
     * @param whatToShow The whatToShow mask.
     * @param filter The NodeFilter installed. Null means no filter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    public NodeIterator createNodeIterator(Node root,
                                           int whatToShow,
                                           NodeFilter filter,
                                           boolean entityReferenceExpansion)

    /**
     * Create and return a NodeIterator. The NodeIterator is
     * added to a list of NodeIterators so that it can be
     * removed to free up the DOM Nodes it references.
     *
     * @param root The root of the iterator.
     * @param whatToShow The whatToShow mask.
     * @param filter The NodeFilter installed. Null means no filter.
     * @param entityReferenceExpansion true to expand the contents of
     *                                 EntityReference nodes
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    public NodeIterator createNodeIterator(Node root,
                                           short whatToShow,
                                           NodeFilter filter)

    /**
     * NON-DOM extension:
     * Create and return a NodeIterator. The NodeIterator is
     * added to a list of NodeIterators so that it can be
     * removed to free up the DOM Nodes it references.
     *
     * @param root The root of the iterator.
     * @param whatToShow The whatToShow mask.
     * @param filter The NodeFilter installed. Null means no filter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    public DOMImplementation getImplementation() {

    /**
     * Retrieve information describing the abilities of this particular
     * DOM implementation. Intended to support applications that may be
     * using DOMs retrieved from several different sources, potentially
     * with different underlying representations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    public Node cloneNode(boolean deep) {

    /**
     * Deep-clone a document, including fixing ownerDoc for the cloned
     * children. Note that this requires bypassing the WRONG_DOCUMENT_ERR
     * protection. I've chosen to implement it by calling importNode
     * which is DOM Level 2.
     *
     * @return org.w3c.dom.Node
     * @param deep boolean, iff true replicate children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    public DocumentImpl(DocumentType doctype, boolean grammarAccess) {

    /** For DOM2 support. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    public DocumentImpl(DocumentType doctype)

    /**
     * For DOM2 support.
     * The createDocument factory method is in DOMImplementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    public DocumentImpl(boolean grammarAccess) {

    /** Constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    public DocumentImpl() {

    /**
     * NON-DOM: Actually creating a Document is outside the DOM's spec,
     * since it has to operate in terms of a particular implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    private static final ObjectStreamField[] serialPersistentFields =

    /**
     * @serialField iterators Vector Node iterators
     * @serialField ranges Vector ranges
     * @serialField eventListeners Hashtable Event listeners
     * @serialField mutationEvents boolean Bypass mutation events firing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    protected boolean mutationEvents = false;

    /** Bypass mutation events firing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    protected Map<NodeImpl, List<LEntry>> eventListeners;

    /** Table for event listeners registered to this document nodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    // REVISIT: Should this be transient? -Ac

     /** Ranges */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    // REVISIT: Should this be transient? -Ac

    /** Iterators */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    static final long serialVersionUID = 515687835542616694L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
public class DocumentImpl

/**
 * The Document interface represents the entire HTML or XML document.
 * Conceptually, it is the root of the document tree, and provides the
 * primary access to the document's data.
 * <P>
 * Since elements, text nodes, comments, processing instructions,
 * etc. cannot exist outside the context of a Document, the Document
 * interface also contains the factory methods needed to create these
 * objects. The Node objects created have a ownerDocument attribute
 * which associates them with the Document within whose context they
 * were created.
 * <p>
 * The DocumentImpl class also implements the DOM Level 2 DocumentTraversal
 * interface. This interface is comprised of factory methods needed to
 * create NodeIterators and TreeWalkers. The process of creating NodeIterator
 * objects also adds these references to this document.
 * After finishing with an iterator it is important to remove the object
 * using the remove methods in this implementation. This allows the release of
 * the references from the iterator objects to the DOM Nodes.
 * <p>
 * <b>Note:</b> When any node in the document is serialized, the
 * entire document is serialized along with it.
 *
 * @xerces.internal
 *
 * @author Arnaud  Le Hors, IBM
 * @author Joe Kesselman, IBM
 * @author Andy Clark, IBM
 * @author Ralf Pfeiffer, IBM
 * @version $Id: DocumentImpl.java,v 1.6 2010/07/20 20:25:24 joehw Exp $
 * @since  PR-DOM-Level-1-19980818.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    private void writeObject(ObjectOutputStream out) throws IOException {

    /**
     * @serialData Serialized fields. Convert Maps to Hashtables and Lists
     * to Vectors for backward compatibility.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void renamedElement(Element oldEl, Element newEl) {

    /**
     * A method to be called when an element has been renamed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void renamedAttrNode(Attr oldAt, Attr newAt) {

    /**
     * A method to be called when an attribute node has been renamed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void removedAttrNode(AttrImpl attr, NodeImpl oldOwner, String name) {

    /**
     * A method to be called when an attribute node has been removed
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void setAttrNode(AttrImpl attr, AttrImpl previous) {

    /**
     * A method to be called when an attribute node has been set
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void modifiedAttrValue(AttrImpl attr, String oldvalue) {

    /**
     * A method to be called when an attribute value has been modified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void replacedNode(NodeImpl node) {

    /**
     * A method to be called when a node has been replaced in the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void replacingData (NodeImpl node) {

    /**
     * A method to be called when character data is about to be replaced in the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void replacingNode(NodeImpl node) {

    /**
     * A method to be called when a node is about to be replaced in the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void removedNode(NodeImpl node, boolean replace) {

    /**
     * A method to be called when a node has been removed from the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void removingNode(NodeImpl node, NodeImpl oldChild, boolean replace) {

    /**
     * A method to be called when a node is about to be removed from the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void insertedNode(NodeImpl node, NodeImpl newInternal, boolean replace) {

    /**
     * A method to be called when a node has been inserted in the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void insertingNode(NodeImpl node, boolean replace) {

    /**
     * A method to be called when a node is about to be inserted in the tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void replacedCharacterData(NodeImpl node, String oldvalue, String value) {

    /**
     * A method to be called when a character data node has been replaced
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void modifiedCharacterData(NodeImpl node, String oldvalue, String value, boolean replace) {

    /**
     * A method to be called when a character data node has been modified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void modifyingCharacterData(NodeImpl node, boolean replace) {

    /**
     * A method to be called when a character data node has been modified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    protected void saveEnclosingAttr(NodeImpl node) {

    /**
     * NON-DOM INTERNAL: Pre-mutation context check, in
     * preparation for later generating DOMAttrModified events.
     * Determines whether this node is within an Attr
     * @param node node to get enclosing attribute for
     * @return either a description of that Attr, or null if none such.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    protected void dispatchAggregateEvents(NodeImpl node,
                                           AttrImpl enclosingAttr,
                                           String oldvalue, short change) {

    /**
     * NON-DOM INTERNAL: Generate the "aggregated" post-mutation events
     * DOMAttrModified and DOMSubtreeModified.
     * Both of these should be issued only once for each user-requested
     * mutation operation, even if that involves multiple changes to
     * the DOM.
     * For example, if a DOM operation makes multiple changes to a single
     * Attr before returning, it would be nice to generate only one
     * DOMAttrModified, and multiple changes over larger scope but within
     * a recognizable single subtree might want to generate only one
     * DOMSubtreeModified, sent to their lowest common ancestor.
     * <p>
     * To manage this, use the "internal" versions of insert and remove
     * with MUTATION_LOCAL, then make an explicit call to this routine
     * at the higher level. Some examples now exist in our code.
     *
     * @param node The node to dispatch to
     * @param enclosingAttr The Attr node (if any) whose value has been changed
     * as a result of the DOM operation. Null if none such.
     * @param oldValue The String value previously held by the
     * enclosingAttr. Ignored if none such.
     * @param change Type of modification to the attr. See
     * MutationEvent.attrChange
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    protected void dispatchAggregateEvents(NodeImpl node, EnclosingAttr ea) {

    /**
     * NON-DOM INTERNAL: Convenience wrapper for calling
     * dispatchAggregateEvents when the context was established
     * by <code>savedEnclosingAttr</code>.
     * @param node node to dispatch to
     * @param ea description of Attr affected by current operation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    class EnclosingAttr implements Serializable {

    /**
     * NON-DOM INTERNAL: Return object for getEnclosingAttr. Carries
     * (two values, the Attr node affected (if any) and its previous
     * string value. Simple struct, no methods.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    protected void dispatchingEventToSubtree(Node n, Event e) {

    /**
     * Dispatches event to the target node's descendents recursively
     *
     * @param n node to dispatch to
     * @param e event to be sent to that node and its subtree
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    protected void dispatchEventToSubtree(Node n, Event e) {

    /**
     * NON-DOM INTERNAL: DOMNodeInsertedIntoDocument and ...RemovedFrom...
     * are dispatched to an entire subtree. This is the distribution code
     * therefor. They DO NOT bubble, thanks be, but may be captured.
     * <p>
     * Similar to code in dispatchingEventToSubtree however this method
     * is only used on the target node and does not start a dispatching chain
     * on the sibling of the target node as this is not part of the subtree
     * ***** At the moment I'm being sloppy and using the normal
     * capture dispatcher on every node. This could be optimized hugely
     * by writing a capture engine that tracks our position in the tree to
     * update the capture chain without repeated chases up to root.
     * @param n target node (that was directly inserted or removed)
     * @param e event to be sent to that node and its subtree
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    @Override

    /**
     * Introduced in DOM Level 2. <p>
     * Distribution engine for DOM Level 2 Events.
     * <p>
     * Event propagation runs as follows:
     * <ol>
     * <li>Event is dispatched to a particular target node, which invokes
     *   this code. Note that the event's stopPropagation flag is
     *   cleared when dispatch begins; thereafter, if it has
     *   been set before processing of a node commences, we instead
     *   immediately advance to the DEFAULT phase.
     * <li>The node's ancestors are established as destinations for events.
     *   For capture and bubble purposes, node ancestry is determined at
     *   the time dispatch starts. If an event handler alters the document
     *   tree, that does not change which nodes will be informed of the event.
     * <li>CAPTURING_PHASE: Ancestors are scanned, root to target, for
     *   Capturing listeners. If found, they are invoked (see below).
     * <li>AT_TARGET:
     *   Event is dispatched to NON-CAPTURING listeners on the
     *   target node. Note that capturing listeners on this node are _not_
     *   invoked.
     * <li>BUBBLING_PHASE: Ancestors are scanned, target to root, for
     *   non-capturing listeners.
     * <li>Default processing: Some DOMs have default behaviors bound to
     *   specific nodes. If this DOM does, and if the event's preventDefault
     *   flag has not been set, we now return to the target node and process
     *   its default handler for this event, if any.
     * </ol>
     * <p>
     * Note that registration of handlers during processing of an event does
     * not take effect during this phase of this event; they will not be called
     * until the next time this node is visited by dispatchEvent. On the other
     * hand, removals take effect immediately.
     * <p>
     * If an event handler itself causes events to be dispatched, they are
     * processed synchronously, before processing resumes
     * on the event which triggered them. Please be aware that this may
     * result in events arriving at listeners "out of order" relative
     * to the actual sequence of requests.
     * <p>
     * Note that our implementation resets the event's stop/prevent flags
     * when dispatch begins.
     * I believe the DOM's intent is that event objects be redispatchable,
     * though it isn't stated in those terms.
     * @param node node to dispatch to
     * @param event the event object to be dispatched to
     *              registered EventListeners
     * @return true if the event's <code>preventDefault()</code>
     *              method was invoked by an EventListener; otherwise false.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    @Override

    /**
     * Introduced in DOM Level 2. <p> Deregister an event listener previously
     * registered with this Node.  A listener must be independently removed
     * from the Capturing and Bubbling roles. Redundant removals (of listeners
     * not currently registered for this role) are ignored.
     * @param node node to remove listener from
     * @param type Event name (NOT event group!) to listen for.
     * @param listener Who gets called when event is dispatched
     * @param useCapture True iff listener is registered on
     *  capturing phase rather than at-target or bubbling
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    @Override

    /**
     * Introduced in DOM Level 2. <p> Register an event listener with this
     * Node. A listener may be independently registered as both Capturing and
     * Bubbling, but may only be registered once per role; redundant
     * registrations are ignored.
     * @param node node to add listener to
     * @param type Event name (NOT event group!) to listen for.
     * @param listener Who gets called when event is dispatched
     * @param useCapture True iff listener is registered on
     *  capturing phase rather than at-target or bubbling
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
        LEntry(String type, EventListener listener, boolean useCapture)

        /** NON-DOM INTERNAL: Constructor for Listener list Entry
         * @param type Event name (NOT event group!) to listen for.
         * @param listener Who gets called when event is dispatched
         * @param useCaptue True iff listener is registered on
         *  capturing phase rather than at-target or bubbling
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    private List<LEntry> getEventListeners(NodeImpl n) {

    /**
     * Retreive event listener registered on a given node
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    private void setEventListeners(NodeImpl n, List<LEntry> listeners) {

    /**
     * Store event listener registered on a given node
     * This is another place where we could use weak references! Indeed, the
     * node here won't be GC'ed as long as some listener is registered on it,
     * since the eventsListeners table will have a reference to the node.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    boolean getMutationEvents() {

    /**
     * Returns true if the DOM implementation generates mutation events.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void setMutationEvents(boolean set) {

    /**
     * Sets whether the DOM implementation generates mutation events
     * upon operations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    public Event createEvent(String type)

    /**
     * Introduced in DOM Level 2. Optional. <p>
     * Create and return Event objects.
     *
     * @param type The eventType parameter specifies the type of Event
     * interface to be created.  If the Event interface specified is supported
     * by the implementation this method will return a new Event of the
     * interface type requested. If the Event is to be dispatched via the
     * dispatchEvent method the appropriate event init method must be called
     * after creation in order to initialize the Event's values.  As an
     * example, a user wishing to synthesize some kind of Event would call
     * createEvent with the parameter "Events". The initEvent method could then
     * be called on the newly created Event to set the specific type of Event
     * to be dispatched and set its context information.
     * @return Newly created Event
     * @exception DOMException NOT_SUPPORTED_ERR: Raised if the implementation
     * does not support the type of Event interface requested
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void splitData(Node node, Node newNode, int offset) {

    /**
     * A method to be called when a text node has been split,
     * so that live objects can be notified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void insertedText(NodeImpl node, int offset, int count) {

    /**
     * A method to be called when some text was inserted into a text node,
     * so that live objects can be notified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void deletedText(NodeImpl node, int offset, int count) {

    /**
     * A method to be called when some text was deleted from a text node,
     * so that live objects can be notified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void replacedText(NodeImpl node) {

    /**
     * A method to be called when some text was changed in a text node,
     * so that live objects can be notified.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    void removeRange(Range range) {

    /** Not a client function. Called by Range.detach(),
     *  so a Range can remove itself from the list of
     *  Ranges.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    public Range createRange() {

    /**
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
     void removeNodeIterator(NodeIterator nodeIterator) {

    /** This is not called by the developer client. The
     *  developer client uses the detach() function on the
     *  NodeIterator itself. <p>
     *
     *  This function is called from the NodeIterator#detach().
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    public TreeWalker createTreeWalker(Node root,
                                       int whatToShow,
                                       NodeFilter filter,
                                       boolean entityReferenceExpansion)

    /**
     * Create and return a TreeWalker.
     *
     * @param root The root of the iterator.
     * @param whatToShow The whatToShow mask.
     * @param filter The NodeFilter installed. Null means no filter.
     * @param entityReferenceExpansion true to expand the contents of
     *                                 EntityReference nodes
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    public TreeWalker createTreeWalker(Node root,
                                       short whatToShow,
                                       NodeFilter filter)

    /**
     * NON-DOM extension:
     * Create and return a TreeWalker.
     *
     * @param root The root of the iterator.
     * @param whatToShow The whatToShow mask.
     * @param filter The NodeFilter installed. Null means no filter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    public NodeIterator createNodeIterator(Node root,
                                           int whatToShow,
                                           NodeFilter filter,
                                           boolean entityReferenceExpansion)

    /**
     * Create and return a NodeIterator. The NodeIterator is
     * added to a list of NodeIterators so that it can be
     * removed to free up the DOM Nodes it references.
     *
     * @param root The root of the iterator.
     * @param whatToShow The whatToShow mask.
     * @param filter The NodeFilter installed. Null means no filter.
     * @param entityReferenceExpansion true to expand the contents of
     *                                 EntityReference nodes
     * @since WD-DOM-Level-2-19990923
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    public NodeIterator createNodeIterator(Node root,
                                           short whatToShow,
                                           NodeFilter filter)

    /**
     * NON-DOM extension:
     * Create and return a NodeIterator. The NodeIterator is
     * added to a list of NodeIterators so that it can be
     * removed to free up the DOM Nodes it references.
     *
     * @param root The root of the iterator.
     * @param whatToShow The whatToShow mask.
     * @param filter The NodeFilter installed. Null means no filter.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    public DOMImplementation getImplementation() {

    /**
     * Retrieve information describing the abilities of this particular
     * DOM implementation. Intended to support applications that may be
     * using DOMs retrieved from several different sources, potentially
     * with different underlying representations.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    public Node cloneNode(boolean deep) {

    /**
     * Deep-clone a document, including fixing ownerDoc for the cloned
     * children. Note that this requires bypassing the WRONG_DOCUMENT_ERR
     * protection. I've chosen to implement it by calling importNode
     * which is DOM Level 2.
     *
     * @return org.w3c.dom.Node
     * @param deep boolean, iff true replicate children
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    public DocumentImpl(DocumentType doctype, boolean grammarAccess) {

    /** For DOM2 support. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    public DocumentImpl(DocumentType doctype)

    /**
     * For DOM2 support.
     * The createDocument factory method is in DOMImplementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    public DocumentImpl(boolean grammarAccess) {

    /** Constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    public DocumentImpl() {

    /**
     * NON-DOM: Actually creating a Document is outside the DOM's spec,
     * since it has to operate in terms of a particular implementation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    private static final ObjectStreamField[] serialPersistentFields =

    /**
     * @serialField iterators Vector Node iterators
     * @serialField ranges Vector ranges
     * @serialField eventListeners Hashtable Event listeners
     * @serialField mutationEvents boolean Bypass mutation events firing
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    protected boolean mutationEvents = false;

    /** Bypass mutation events firing. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    protected Map<NodeImpl, List<LEntry>> eventListeners;

    /** Table for event listeners registered to this document nodes. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    // REVISIT: Should this be transient? -Ac

     /** Ranges */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    // REVISIT: Should this be transient? -Ac

    /** Iterators */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
    static final long serialVersionUID = 515687835542616694L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/DocumentImpl.java
public class DocumentImpl

/**
 * The Document interface represents the entire HTML or XML document.
 * Conceptually, it is the root of the document tree, and provides the
 * primary access to the document's data.
 * <P>
 * Since elements, text nodes, comments, processing instructions,
 * etc. cannot exist outside the context of a Document, the Document
 * interface also contains the factory methods needed to create these
 * objects. The Node objects created have a ownerDocument attribute
 * which associates them with the Document within whose context they
 * were created.
 * <p>
 * The DocumentImpl class also implements the DOM Level 2 DocumentTraversal
 * interface. This interface is comprised of factory methods needed to
 * create NodeIterators and TreeWalkers. The process of creating NodeIterator
 * objects also adds these references to this document.
 * After finishing with an iterator it is important to remove the object
 * using the remove methods in this implementation. This allows the release of
 * the references from the iterator objects to the DOM Nodes.
 * <p>
 * <b>Note:</b> When any node in the document is serialized, the
 * entire document is serialized along with it.
 *
 * @xerces.internal
 *
 * @author Arnaud  Le Hors, IBM
 * @author Joe Kesselman, IBM
 * @author Andy Clark, IBM
 * @author Ralf Pfeiffer, IBM
 * @version $Id: DocumentImpl.java,v 1.6 2010/07/20 20:25:24 joehw Exp $
 * @since  PR-DOM-Level-1-19980818.
 */
