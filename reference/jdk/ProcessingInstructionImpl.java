_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ProcessingInstructionImpl.java
    public String getBaseURI() {

   /**
     * Returns the absolute base URI of this node or null if the implementation
     * wasn't able to obtain an absolute URI. Note: If the URI is malformed, a
     * null is returned.
     *
     * @return The absolute base URI of this node or null.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ProcessingInstructionImpl.java
    public void setData(String data) {

    /**
     * Change the data content of this PI.
     * Note that setData is aliased to setNodeValue.
     * @see #getData().
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if node is read-only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ProcessingInstructionImpl.java
    public String getData() {

    /**
     * A PI's data content tells the processor what we actually want it
     * to do.  It is defined slightly differently in HTML and XML.
     * <p>
     * In XML, the data begins with the non-whitespace character
     * immediately after the target -- @see getTarget().
     * <p>
     * In HTML, the data begins with the character immediately after the
     * "&lt;?" token that begins the PI.
     * <p>
     * Note that getNodeValue is aliased to getData
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ProcessingInstructionImpl.java
    public String getTarget() {

    /**
     * A PI's "target" states what processor channel the PI's data
     * should be directed to. It is defined differently in HTML and XML.
     * <p>
     * In XML, a PI's "target" is the first (whitespace-delimited) token
     * following the "<?" token that begins the PI.
     * <p>
     * In HTML, target is always null.
     * <p>
     * Note that getNodeName is aliased to getTarget.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ProcessingInstructionImpl.java
    public String getNodeName() {

    /**
     * Returns the target
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ProcessingInstructionImpl.java
    public short getNodeType() {

    /**
     * A short integer indicating what type of node this is. The named
     * constants for this value are defined in the org.w3c.dom.Node interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ProcessingInstructionImpl.java
    public ProcessingInstructionImpl(CoreDocumentImpl ownerDoc,
                                     String target, String data) {

    /** Factory constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ProcessingInstructionImpl.java
    static final long serialVersionUID = 7554435174099981510L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ProcessingInstructionImpl.java
public class ProcessingInstructionImpl

/**
 * Processing Instructions (PIs) permit documents to carry
 * processor-specific information alongside their actual content. PIs
 * are most common in XML, but they are supported in HTML as well.
 *
 * This class inherits from CharacterDataImpl to reuse its setNodeValue method.
 *
 * @xerces.internal
 *
 * @since  PR-DOM-Level-1-19980818.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ProcessingInstructionImpl.java
    public String getBaseURI() {

   /**
     * Returns the absolute base URI of this node or null if the implementation
     * wasn't able to obtain an absolute URI. Note: If the URI is malformed, a
     * null is returned.
     *
     * @return The absolute base URI of this node or null.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ProcessingInstructionImpl.java
    public void setData(String data) {

    /**
     * Change the data content of this PI.
     * Note that setData is aliased to setNodeValue.
     * @see #getData().
     * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) if node is read-only.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ProcessingInstructionImpl.java
    public String getData() {

    /**
     * A PI's data content tells the processor what we actually want it
     * to do.  It is defined slightly differently in HTML and XML.
     * <p>
     * In XML, the data begins with the non-whitespace character
     * immediately after the target -- @see getTarget().
     * <p>
     * In HTML, the data begins with the character immediately after the
     * "&lt;?" token that begins the PI.
     * <p>
     * Note that getNodeValue is aliased to getData
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ProcessingInstructionImpl.java
    public String getTarget() {

    /**
     * A PI's "target" states what processor channel the PI's data
     * should be directed to. It is defined differently in HTML and XML.
     * <p>
     * In XML, a PI's "target" is the first (whitespace-delimited) token
     * following the "<?" token that begins the PI.
     * <p>
     * In HTML, target is always null.
     * <p>
     * Note that getNodeName is aliased to getTarget.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ProcessingInstructionImpl.java
    public String getNodeName() {

    /**
     * Returns the target
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ProcessingInstructionImpl.java
    public short getNodeType() {

    /**
     * A short integer indicating what type of node this is. The named
     * constants for this value are defined in the org.w3c.dom.Node interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ProcessingInstructionImpl.java
    public ProcessingInstructionImpl(CoreDocumentImpl ownerDoc,
                                     String target, String data) {

    /** Factory constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ProcessingInstructionImpl.java
    static final long serialVersionUID = 7554435174099981510L;

    /** Serialization version. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/dom/ProcessingInstructionImpl.java
public class ProcessingInstructionImpl

/**
 * Processing Instructions (PIs) permit documents to carry
 * processor-specific information alongside their actual content. PIs
 * are most common in XML, but they are supported in HTML as well.
 *
 * This class inherits from CharacterDataImpl to reuse its setNodeValue method.
 *
 * @xerces.internal
 *
 * @since  PR-DOM-Level-1-19980818.
 */
