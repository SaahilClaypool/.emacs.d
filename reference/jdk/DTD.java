_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/DTD.java
    public void read(DataInputStream in) throws IOException {

    /**
     * Recreates a DTD from an archived format.
     * @param in  the <code>DataInputStream</code> to read from
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/DTD.java
    public static DTD getDTD(String name) throws IOException {

    /**
     * Returns a DTD with the specified <code>name</code>.  If
     * a DTD with that name doesn't exist, one is created
     * and returned.  Any uppercase characters in the name
     * are converted to lowercase.
     *
     * @param name the name of the DTD
     * @return the DTD which corresponds to <code>name</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/DTD.java
    private static final Object DTD_HASH_KEY = new Object();

    /**
     * The hashtable key of DTDs in AppContext.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/DTD.java
    public String toString() {

    /**
     * Returns a string representation of this DTD.
     * @return the string representation of this DTD
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/DTD.java
    protected ContentModel defContentModel(int type, Object obj, ContentModel next) {

    /**
     * Creates and returns a new content model.
     * @param type the type of the new content model
     * @return the new <code>ContentModel</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/DTD.java
    protected AttributeList defAttributeList(String name, int type, int modifier, String value, String values, AttributeList atts) {

    /**
     * Creates and returns an <code>AttributeList</code>.
     * @param name the attribute list's name
     * @return the new <code>AttributeList</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/DTD.java
    protected Element defElement(String name, int type,
                       boolean omitStart, boolean omitEnd, ContentModel content,
                       String[] exclusions, String[] inclusions, AttributeList atts) {

    /**
     * Creates and returns an <code>Element</code>.
     * @param name the element's name
     * @return the new <code>Element</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/DTD.java
    protected Entity defEntity(String name, int type, String str) {

    /**
     * Creates and returns an <code>Entity</code>.
     * @param name the entity's name
     * @return the new <code>Entity</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/DTD.java
    public Entity defEntity(String name, int type, int ch) {

    /**
     * Creates and returns a character <code>Entity</code>.
     * @param name the entity's name
     * @return the new character <code>Entity</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/DTD.java
    public void defineAttributes(String name, AttributeList atts) {

    /**
     * Defines attributes for an {@code Element}.
     *
     * @param name the name of the <code>Element</code>
     * @param atts the <code>AttributeList</code> specifying the
     *    <code>Element</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/DTD.java
    public Element defineElement(String name, int type,
                       boolean omitStart, boolean omitEnd, ContentModel content,
                       BitSet exclusions, BitSet inclusions, AttributeList atts) {

    /**
     * Returns the <code>Element</code> which matches the
     * specified parameters.  If one doesn't exist, a new
     * one is created and returned.
     *
     * @param name the name of the <code>Element</code>
     * @param type the type of the <code>Element</code>
     * @param omitStart <code>true</code> if start should be omitted
     * @param omitEnd  <code>true</code> if end should be omitted
     * @param content  the <code>ContentModel</code>
     * @param atts the <code>AttributeList</code> specifying the
     *    <code>Element</code>
     * @return the <code>Element</code> specified
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/DTD.java
    public Entity defineEntity(String name, int type, char data[]) {

    /**
     * Defines an entity.  If the <code>Entity</code> specified
     * by <code>name</code>, <code>type</code>, and <code>data</code>
     * exists, it is returned; otherwise a new <code>Entity</code>
     * is created and is returned.
     *
     * @param name the name of the <code>Entity</code> as a <code>String</code>
     * @param type the type of the <code>Entity</code>
     * @param data the <code>Entity</code>'s data
     * @return the <code>Entity</code> requested or a new <code>Entity</code>
     *   if not found
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/DTD.java
    public Element getElement(int index) {

    /**
     * Gets an element by index.
     *
     * @param index the requested index
     * @return the <code>Element</code> corresponding to
     *   <code>index</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/DTD.java
    public Element getElement(String name) {

    /**
     * Gets an element by name. A new element is
     * created if the element doesn't exist.
     *
     * @param name the requested <code>String</code>
     * @return the <code>Element</code> corresponding to
     *   <code>name</code>, which may be newly created
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/DTD.java
    boolean elementExists(String name) {

    /**
     * Returns <code>true</code> if the element is part of the DTD,
     * otherwise returns <code>false</code>.
     *
     * @param  name the requested <code>String</code>
     * @return <code>true</code> if <code>name</code> exists as
     *   part of the DTD, otherwise returns <code>false</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/DTD.java
    public Entity getEntity(int ch) {

    /**
     * Gets a character entity.
     * @return the <code>Entity</code> corresponding to the
     *    <code>ch</code> character
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/DTD.java
    public Entity getEntity(String name) {

    /**
     * Gets an entity by name.
     * @return the <code>Entity</code> corresponding to the
     *   <code>name</code> <code>String</code>
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/DTD.java
    public String getName() {

    /**
     * Gets the name of the DTD.
     * @return the name of the DTD
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/DTD.java
    protected DTD(String name) {

    /**
     * Creates a new DTD with the specified name.
     * @param name the name, as a <code>String</code> of the new DTD
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/swing/text/html/parser/DTD.java
public

/**
 * The representation of an SGML DTD.  DTD describes a document
 * syntax and is used in parsing of HTML documents.  It contains
 * a list of elements and their attributes as well as a list of
 * entities defined in the DTD.
 *
 * @see Element
 * @see AttributeList
 * @see ContentModel
 * @see Parser
 * @author Arthur van Hoff
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/DTD.java
  List getEntities();

  /**
   * Return a List containing the general entities,
   * both external and internal, declared in the DTD.
   * This list must contain EntityDeclaration events.
   * @see EntityDeclaration
   * @return an unordered list of EntityDeclaration events
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/DTD.java
  List getNotations();

  /**
   * Return a List containing the notations declared in the DTD.
   * This list must contain NotationDeclaration events.
   * @see NotationDeclaration
   * @return an unordered list of NotationDeclaration events
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/DTD.java
  Object getProcessedDTD();

  /**
   * Returns an implementation defined representation of the DTD.
   * This method may return null if no representation is available.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/DTD.java
  String getDocumentTypeDeclaration();

  /**
   * Returns the entire Document Type Declaration as a string, including
   * the internal DTD subset.
   * This may be null if there is not an internal subset.
   * If it is not null it must return the entire
   * Document Type Declaration which matches the doctypedecl
   * production in the XML 1.0 specification
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/xml/stream/events/DTD.java
public interface DTD extends XMLEvent {

/**
 * This is the top level interface for events dealing with DTDs
 *
 * @version 1.0
 * @author Copyright (c) 2009 by Oracle Corporation. All Rights Reserved.
 * @since 1.6
 */
