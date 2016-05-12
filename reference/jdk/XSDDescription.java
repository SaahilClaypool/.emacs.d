_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public void reset(){

    /**
     *  resets all the fields
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public int hashCode() {

    /**
     * Returns the hash code of this grammar
     *
     * @return The hash code
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public boolean equals(Object descObj) {

    /**
     * Compares this grammar with the given grammar. Currently, we compare
     * the target namespaces.
     *
     * @param descObj The description of the grammar to be compared with
     * @return        True if they are equal, else false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public boolean isExternal() {

    /**
     * @return true is the schema is external
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public XMLAttributes getAttributes() {

    /**
     * If a call is triggered by an element/attribute/xsi:type in the instance,
     * this call returns all attribute of such element (or enclosing element).
     *
     * @return  all attributes of the tiggering/enclosing element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public QName getEnclosingElementName() {

    /**
     * If a call is triggered by an attribute or xsi:type, then this mehtod
     * returns the enclosing element of such element.
     *
     * @return  the name of the enclosing element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public QName getTriggeringComponent() {

    /**
     * If a call is triggered by an element/attribute/xsi:type in the instance,
     * this call returns the name of such triggering component: the name of
     * the element/attribute, or the value of the xsi:type.
     *
     * @return  the name of the triggering component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public String[] getLocationHints() {

    /**
     * For import and references from the instance document, it's possible to
     * have multiple hints for one namespace. So this method returns an array,
     * which contains all location hints.
     *
     * @return  an array of all location hints associated to the expected
     *          target namespace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public String getTargetNamespace() {

    /**
     * If the context is "include" or "redefine", then return the target
     * namespace of the enclosing schema document; otherwise, the expected
     * target namespace of this document.
     *
     * @return  the expected/enclosing target namespace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public short getContextType() {

    /**
     * Get the context. The returned value is one of the pre-defined
     * CONTEXT_xxx constants.
     *
     * @return  the value indicating the context
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public String getGrammarType() {

    /**
     * the type of the grammar (e.g., DTD or XSD);
     *
     * @see com.sun.org.apache.xerces.internal.xni.grammars.Grammar
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public final static short CONTEXT_XSITYPE   = 7;

    /**
     * Indicate that the parse of the current schema document is triggered by
     * the occurrence of an "xsi:type" attribute, whose value (a QName) has
     * the target namespace of this schema document as its namespace.
     * This value is only used if we do defer the loading of schema documents
     * until a component from that namespace is referenced from the instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public final static short CONTEXT_ELEMENT   = 5;

    /**
     * Indicate that the parse of the current schema document is triggered by
     * the occurrence of an element whose namespace is the target namespace
     * of this schema document. This value is only used if we do defer the
     * loading of schema documents until a component from that namespace is
     * referenced from the instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public final static short CONTEXT_PREPARSE  = 3;

    /**
     * Indicate that the current schema document is being preparsed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public final static short CONTEXT_REDEFINE  = 1;

    /**
     * Indicate that the current schema document is <redefine>d by another
     * schema document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public final static short CONTEXT_INITIALIZE = -1;

    /**
     * Indicate that this description was just initialized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
public class XSDDescription extends XMLResourceIdentifierImpl

/**
 * All information specific to XML Schema grammars.
 *
 * @xerces.internal
 *
 * @author Neil Graham, IBM
 * @author Neeraj Bajaj, SUN Microsystems.
 *
 * @version $Id: XSDDescription.java,v 1.6 2010-11-01 04:39:55 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public void reset(){

    /**
     *  resets all the fields
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public int hashCode() {

    /**
     * Returns the hash code of this grammar
     *
     * @return The hash code
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public boolean equals(Object descObj) {

    /**
     * Compares this grammar with the given grammar. Currently, we compare
     * the target namespaces.
     *
     * @param descObj The description of the grammar to be compared with
     * @return        True if they are equal, else false
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public boolean isExternal() {

    /**
     * @return true is the schema is external
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public XMLAttributes getAttributes() {

    /**
     * If a call is triggered by an element/attribute/xsi:type in the instance,
     * this call returns all attribute of such element (or enclosing element).
     *
     * @return  all attributes of the tiggering/enclosing element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public QName getEnclosingElementName() {

    /**
     * If a call is triggered by an attribute or xsi:type, then this mehtod
     * returns the enclosing element of such element.
     *
     * @return  the name of the enclosing element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public QName getTriggeringComponent() {

    /**
     * If a call is triggered by an element/attribute/xsi:type in the instance,
     * this call returns the name of such triggering component: the name of
     * the element/attribute, or the value of the xsi:type.
     *
     * @return  the name of the triggering component
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public String[] getLocationHints() {

    /**
     * For import and references from the instance document, it's possible to
     * have multiple hints for one namespace. So this method returns an array,
     * which contains all location hints.
     *
     * @return  an array of all location hints associated to the expected
     *          target namespace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public String getTargetNamespace() {

    /**
     * If the context is "include" or "redefine", then return the target
     * namespace of the enclosing schema document; otherwise, the expected
     * target namespace of this document.
     *
     * @return  the expected/enclosing target namespace
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public short getContextType() {

    /**
     * Get the context. The returned value is one of the pre-defined
     * CONTEXT_xxx constants.
     *
     * @return  the value indicating the context
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public String getGrammarType() {

    /**
     * the type of the grammar (e.g., DTD or XSD);
     *
     * @see com.sun.org.apache.xerces.internal.xni.grammars.Grammar
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public final static short CONTEXT_XSITYPE   = 7;

    /**
     * Indicate that the parse of the current schema document is triggered by
     * the occurrence of an "xsi:type" attribute, whose value (a QName) has
     * the target namespace of this schema document as its namespace.
     * This value is only used if we do defer the loading of schema documents
     * until a component from that namespace is referenced from the instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public final static short CONTEXT_ELEMENT   = 5;

    /**
     * Indicate that the parse of the current schema document is triggered by
     * the occurrence of an element whose namespace is the target namespace
     * of this schema document. This value is only used if we do defer the
     * loading of schema documents until a component from that namespace is
     * referenced from the instance.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public final static short CONTEXT_PREPARSE  = 3;

    /**
     * Indicate that the current schema document is being preparsed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public final static short CONTEXT_REDEFINE  = 1;

    /**
     * Indicate that the current schema document is <redefine>d by another
     * schema document.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
    public final static short CONTEXT_INITIALIZE = -1;

    /**
     * Indicate that this description was just initialized.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDDescription.java
public class XSDDescription extends XMLResourceIdentifierImpl

/**
 * All information specific to XML Schema grammars.
 *
 * @xerces.internal
 *
 * @author Neil Graham, IBM
 * @author Neeraj Bajaj, SUN Microsystems.
 *
 * @version $Id: XSDDescription.java,v 1.6 2010-11-01 04:39:55 joehw Exp $
 */
