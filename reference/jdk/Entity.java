_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Entity.java
    public static int name2type(String nm) {

    /**
     * Converts <code>nm</code> string to the corresponding
     * entity type.  If the string does not have a corresponding
     * entity type, returns the type corresponding to "CDATA".
     * Valid entity types are: "PUBLIC", "CDATA", "SDATA", "PI",
     * "STARTTAG", "ENDTAG", "MS", "MD", "SYSTEM".
     *
     * @param nm the string to be converted
     * @return the corresponding entity type, or the type corresponding
     *   to "CDATA", if none exists
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Entity.java
    public String getString() {

    /**
     * Returns the data as a <code>String</code>.
     * @return the data as a <code>String</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Entity.java
    public char getData()[] {

    /**
     * Returns the <code>data</code>.
     * @return the <code>data</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Entity.java
    public boolean isGeneral() {

    /**
     * Returns <code>true</code> if it is a general entity.
     * @return <code>true</code> if it is a general entity
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Entity.java
    public boolean isParameter() {

    /**
     * Returns <code>true</code> if it is a parameter entity.
     * @return <code>true</code> if it is a parameter entity
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Entity.java
    public int getType() {

    /**
     * Gets the type of the entity.
     * @return the type of the entity
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Entity.java
    public String getName() {

    /**
     * Gets the name of the entity.
     * @return the name of the entity, as a <code>String</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Entity.java
    public Entity(String name, int type, char data[]) {

    /**
     * Creates an entity.
     * @param name the name of the entity
     * @param type the type of the entity
     * @param data the char array of data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/Entity.java
public final

/**
 * An entity is described in a DTD using the ENTITY construct.
 * It defines the type and value of the the entity.
 *
 * @see DTD
 * @author Arthur van Hoff
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Entity.java
    public String getXmlVersion();

    /**
     * An attribute specifying, as part of the text declaration, the version
     * number of this entity, when it is an external parsed entity. This is
     * <code>null</code> otherwise.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Entity.java
    public String getXmlEncoding();

    /**
     * An attribute specifying, as part of the text declaration, the encoding
     * of this entity, when it is an external parsed entity. This is
     * <code>null</code> otherwise.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Entity.java
    public String getInputEncoding();

    /**
     * An attribute specifying the encoding used for this entity at the time
     * of parsing, when it is an external parsed entity. This is
     * <code>null</code> if it an entity from the internal subset or if it
     * is not known.
     * @since DOM Level 3
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Entity.java
    public String getNotationName();

    /**
     * For unparsed entities, the name of the notation for the entity. For
     * parsed entities, this is <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Entity.java
    public String getSystemId();

    /**
     * The system identifier associated with the entity if specified, and
     * <code>null</code> otherwise. This may be an absolute URI or not.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/w3c/dom/Entity.java
public interface Entity extends Node {

/**
 * This interface represents a known entity, either parsed or unparsed, in an
 * XML document. Note that this models the entity itself <em>not</em> the entity declaration.
 * <p>The <code>nodeName</code> attribute that is inherited from
 * <code>Node</code> contains the name of the entity.
 * <p>An XML processor may choose to completely expand entities before the
 * structure model is passed to the DOM; in this case there will be no
 * <code>EntityReference</code> nodes in the document tree.
 * <p>XML does not mandate that a non-validating XML processor read and
 * process entity declarations made in the external subset or declared in
 * parameter entities. This means that parsed entities declared in the
 * external subset need not be expanded by some classes of applications, and
 * that the replacement text of the entity may not be available. When the <a href='http://www.w3.org/TR/2004/REC-xml-20040204#intern-replacement'>
 * replacement text</a> is available, the corresponding <code>Entity</code> node's child list
 * represents the structure of that replacement value. Otherwise, the child
 * list is empty.
 * <p>DOM Level 3 does not support editing <code>Entity</code> nodes; if a
 * user wants to make changes to the contents of an <code>Entity</code>,
 * every related <code>EntityReference</code> node has to be replaced in the
 * structure model by a clone of the <code>Entity</code>'s contents, and
 * then the desired changes must be made to each of those clones instead.
 * <code>Entity</code> nodes and all their descendants are readonly.
 * <p>An <code>Entity</code> node does not have any parent.
 * <p ><b>Note:</b> If the entity contains an unbound namespace prefix, the
 * <code>namespaceURI</code> of the corresponding node in the
 * <code>Entity</code> node subtree is <code>null</code>. The same is true
 * for <code>EntityReference</code> nodes that refer to this entity, when
 * they are created using the <code>createEntityReference</code> method of
 * the <code>Document</code> interface.
 * <p>See also the <a href='http://www.w3.org/TR/2004/REC-DOM-Level-3-Core-20040407'>Document Object Model (DOM) Level 3 Core Specification</a>.
 */
