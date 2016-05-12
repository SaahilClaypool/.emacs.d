_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSAllCM.java
    public Vector whatCanGoHere(int[] state) {

    /**
     * Check which elements are valid to appear at this point. This method also
     * works if the state is in error, in which case it returns what should
     * have been seen.
     *
     * @param state  the current state
     * @return       a Vector whose entries are instances of
     *               either XSWildcardDecl or XSElementDecl.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSAllCM.java
    public boolean checkUniqueParticleAttribution(SubstitutionGroupHandler subGroupHandler) throws XMLSchemaException {

    /**
     * check whether this content violates UPA constraint.
     *
     * @param subGroupHandler the substitution group handler
     * @return true if this content model contains other or list wildcard
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSAllCM.java
    public boolean endContentModel (int[] currentState) {

    /**
     * The method indicates the end of list of children
     *
     * @param currentState  Current state of the content model
     * @return true if the last state was a valid final state
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSAllCM.java
    public Object oneTransition (QName elementName, int[] currentState, SubstitutionGroupHandler subGroupHandler) {

    /**
     * The method corresponds to one transition in the content model.
     *
     * @param elementName
     * @param currentState  Current state
     * @return an element decl object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSAllCM.java
    public int[] startContentModel() {

    /**
     * This methods to be called on entering a first element whose type
     * has this content model. It will return the initial state of the
     * content model
     *
     * @return Start state of the content model
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSAllCM.java
public class XSAllCM implements XSCMValidator {

/**
 * XSAllCM implements XSCMValidator and handles &lt;all&gt;.
 *
 * @xerces.internal
 *
 * @author Pavani Mukthipudi, Sun Microsystems Inc.
 * @version $Id: XSAllCM.java,v 1.10 2010-11-01 04:39:58 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSAllCM.java
    public Vector whatCanGoHere(int[] state) {

    /**
     * Check which elements are valid to appear at this point. This method also
     * works if the state is in error, in which case it returns what should
     * have been seen.
     *
     * @param state  the current state
     * @return       a Vector whose entries are instances of
     *               either XSWildcardDecl or XSElementDecl.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSAllCM.java
    public boolean checkUniqueParticleAttribution(SubstitutionGroupHandler subGroupHandler) throws XMLSchemaException {

    /**
     * check whether this content violates UPA constraint.
     *
     * @param subGroupHandler the substitution group handler
     * @return true if this content model contains other or list wildcard
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSAllCM.java
    public boolean endContentModel (int[] currentState) {

    /**
     * The method indicates the end of list of children
     *
     * @param currentState  Current state of the content model
     * @return true if the last state was a valid final state
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSAllCM.java
    public Object oneTransition (QName elementName, int[] currentState, SubstitutionGroupHandler subGroupHandler) {

    /**
     * The method corresponds to one transition in the content model.
     *
     * @param elementName
     * @param currentState  Current state
     * @return an element decl object
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSAllCM.java
    public int[] startContentModel() {

    /**
     * This methods to be called on entering a first element whose type
     * has this content model. It will return the initial state of the
     * content model
     *
     * @return Start state of the content model
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSAllCM.java
public class XSAllCM implements XSCMValidator {

/**
 * XSAllCM implements XSCMValidator and handles &lt;all&gt;.
 *
 * @xerces.internal
 *
 * @author Pavani Mukthipudi, Sun Microsystems Inc.
 * @version $Id: XSAllCM.java,v 1.10 2010-11-01 04:39:58 joehw Exp $
 */
