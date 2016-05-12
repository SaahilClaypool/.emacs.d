_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    private void addToCurrentGroup(int contentSpec) {

    /**
     * Add XMLContentSpec to the current group.
     *
     * @param contentSpec handle to the XMLContentSpec to add to the current group
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    private void initializeContentModelStacks() {

    /**
     * Initialize the stacks which temporarily hold content models.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    private int addContentSpecNodes(int begin, int end) {

    /**
     * Creates a subtree from the leaf nodes at the current depth.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    protected final void addContentSpecToElement(XMLElementDecl elementDecl) {

    /**
     * Adds the content spec to the given element declaration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    public final void endDTD(Augmentations augs) throws XNIException {

    /**
     * The end of the DTD.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    public final void endGroup(Augmentations augs) throws XNIException {

    /**
     * The end of a group for mixed or children content models.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    public final void occurrence(short occurrence, Augmentations augs) throws XNIException {

    /**
     * The occurrence count for a child in a children content model or
     * for the mixed content model group.
     *
     * @param occurrence The occurrence count for the last element
     *                   or group.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see org.apache.xerces.xni.XMLDTDContentModelHandler#OCCURS_ZERO_OR_ONE
     * @see org.apache.xerces.xni.XMLDTDContentModelHandler#OCCURS_ZERO_OR_MORE
     * @see org.apache.xerces.xni.XMLDTDContentModelHandler#OCCURS_ONE_OR_MORE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    public final void separator(short separator, Augmentations augs) throws XNIException {

    /**
     * The separator between choices or sequences of a mixed or children
     * content model.
     *
     * @param separator The type of children separator.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see org.apache.xerces.xni.XMLDTDContentModelHandler#SEPARATOR_CHOICE
     * @see org.apache.xerces.xni.XMLDTDContentModelHandler#SEPARATOR_SEQUENCE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    public final void element(String elementName, Augmentations augs) throws XNIException {

    /**
     * A referenced element in a mixed or children content model.
     *
     * @param elementName The name of the referenced element.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    public final void pcdata(Augmentations augs) throws XNIException {

    /**
     * The appearance of "#PCDATA" within a group signifying a
     * mixed content model. This method will be the first called
     * following the content model's <code>startGroup()</code>.
     *
     *@param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see #startGroup
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    public final void startGroup(Augmentations augs) throws XNIException {

    /**
     * A start of either a mixed or children content model. A mixed
     * content model will immediately be followed by a call to the
     * <code>pcdata()</code> method. A children content model will
     * contain additional groups and/or elements.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see #any
     * @see #empty
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    public final void startContentModel(String elementName, Augmentations augs)

    /**
     * The start of a content model. Depending on the type of the content
     * model, specific methods may be called between the call to the
     * startContentModel method and the call to the endContentModel method.
     *
     * @param elementName The name of the element.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    public BalancedDTDGrammar(SymbolTable symbolTable, XMLDTDDescription desc) {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    private int [] fGroupIndexStackSizes;

    /** Sizes of the allocated portions of each int[] in fGroupIndexStack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    private int [][] fGroupIndexStack;

    /** Holder for choice/sequence/leaf groups at each depth. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    private short [] fOpStack = null;

    /** Children content model operation stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    private int fDepth = 0;

    /** Stack depth */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    private boolean fMixed;

    /** Mixed. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
final class BalancedDTDGrammar extends DTDGrammar {

/**
 * <p>A DTD grammar that produces balanced syntax trees.</p>
 *
 * @xerces.internal
 *
 * @author Michael Glavassevich, IBM
 * @version $Id: BalancedDTDGrammar.java,v 1.1 2010/08/11 07:18:38 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    private void addToCurrentGroup(int contentSpec) {

    /**
     * Add XMLContentSpec to the current group.
     *
     * @param contentSpec handle to the XMLContentSpec to add to the current group
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    private void initializeContentModelStacks() {

    /**
     * Initialize the stacks which temporarily hold content models.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    private int addContentSpecNodes(int begin, int end) {

    /**
     * Creates a subtree from the leaf nodes at the current depth.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    protected final void addContentSpecToElement(XMLElementDecl elementDecl) {

    /**
     * Adds the content spec to the given element declaration.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    public final void endDTD(Augmentations augs) throws XNIException {

    /**
     * The end of the DTD.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    public final void endGroup(Augmentations augs) throws XNIException {

    /**
     * The end of a group for mixed or children content models.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    public final void occurrence(short occurrence, Augmentations augs) throws XNIException {

    /**
     * The occurrence count for a child in a children content model or
     * for the mixed content model group.
     *
     * @param occurrence The occurrence count for the last element
     *                   or group.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see org.apache.xerces.xni.XMLDTDContentModelHandler#OCCURS_ZERO_OR_ONE
     * @see org.apache.xerces.xni.XMLDTDContentModelHandler#OCCURS_ZERO_OR_MORE
     * @see org.apache.xerces.xni.XMLDTDContentModelHandler#OCCURS_ONE_OR_MORE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    public final void separator(short separator, Augmentations augs) throws XNIException {

    /**
     * The separator between choices or sequences of a mixed or children
     * content model.
     *
     * @param separator The type of children separator.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see org.apache.xerces.xni.XMLDTDContentModelHandler#SEPARATOR_CHOICE
     * @see org.apache.xerces.xni.XMLDTDContentModelHandler#SEPARATOR_SEQUENCE
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    public final void element(String elementName, Augmentations augs) throws XNIException {

    /**
     * A referenced element in a mixed or children content model.
     *
     * @param elementName The name of the referenced element.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    public final void pcdata(Augmentations augs) throws XNIException {

    /**
     * The appearance of "#PCDATA" within a group signifying a
     * mixed content model. This method will be the first called
     * following the content model's <code>startGroup()</code>.
     *
     *@param augs Additional information that may include infoset
     *                      augmentations.
     *
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see #startGroup
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    public final void startGroup(Augmentations augs) throws XNIException {

    /**
     * A start of either a mixed or children content model. A mixed
     * content model will immediately be followed by a call to the
     * <code>pcdata()</code> method. A children content model will
     * contain additional groups and/or elements.
     *
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     *
     * @see #any
     * @see #empty
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    public final void startContentModel(String elementName, Augmentations augs)

    /**
     * The start of a content model. Depending on the type of the content
     * model, specific methods may be called between the call to the
     * startContentModel method and the call to the endContentModel method.
     *
     * @param elementName The name of the element.
     * @param augs Additional information that may include infoset
     *                      augmentations.
     * @throws XNIException Thrown by handler to signal an error.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    public BalancedDTDGrammar(SymbolTable symbolTable, XMLDTDDescription desc) {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    private int [] fGroupIndexStackSizes;

    /** Sizes of the allocated portions of each int[] in fGroupIndexStack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    private int [][] fGroupIndexStack;

    /** Holder for choice/sequence/leaf groups at each depth. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    private short [] fOpStack = null;

    /** Children content model operation stack. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    private int fDepth = 0;

    /** Stack depth */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
    private boolean fMixed;

    /** Mixed. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/BalancedDTDGrammar.java
final class BalancedDTDGrammar extends DTDGrammar {

/**
 * <p>A DTD grammar that produces balanced syntax trees.</p>
 *
 * @xerces.internal
 *
 * @author Michael Glavassevich, IBM
 * @version $Id: BalancedDTDGrammar.java,v 1.1 2010/08/11 07:18:38 joehw Exp $
 */
