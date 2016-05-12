_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSEmptyCM.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSEmptyCM.java
    public boolean checkUniqueParticleAttribution(SubstitutionGroupHandler subGroupHandler) throws XMLSchemaException {

    /**
     * check whether this content violates UPA constraint.
     *
     * @param subGroupHandler the substitution group handler
     * @return true if this content model contains other or list wildcard
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSEmptyCM.java
    public boolean endContentModel (int[] currentState){

    /**
     * The method indicates the end of list of children
     *
     * @param currentState Current state of the content model
     * @return true if the last state was a valid final state
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSEmptyCM.java
    public Object oneTransition (QName elementName, int[] currentState, SubstitutionGroupHandler subGroupHandler){

    /**
     * The method corresponds to one transaction in the content model.
     *
     * @param elementName the qualified name of the element
     * @param currentState Current state
     * @param subGroupHandler the substitution group handler
     * @return element index corresponding to the element from the Schema grammar
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSEmptyCM.java
    public int[] startContentModel(){

    /**
     * This methods to be called on entering a first element whose type
     * has this content model. It will return the initial state of the content model
     *
     * @return Start state of the content model
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSEmptyCM.java
public class XSEmptyCM  implements XSCMValidator {

/**
 * XSEmptyCM is a derivative of the abstract content model base class that
 * handles a content model with no chilren (elements).
 *
 * This model validated on the way in.
 *
 * @xerces.internal
 *
 * @author Elena Litani, Lisa Martin
 * @author IBM
 * @version $Id: XSEmptyCM.java,v 1.7 2009/07/28 15:18:11 spericas Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSEmptyCM.java
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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSEmptyCM.java
    public boolean checkUniqueParticleAttribution(SubstitutionGroupHandler subGroupHandler) throws XMLSchemaException {

    /**
     * check whether this content violates UPA constraint.
     *
     * @param subGroupHandler the substitution group handler
     * @return true if this content model contains other or list wildcard
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSEmptyCM.java
    public boolean endContentModel (int[] currentState){

    /**
     * The method indicates the end of list of children
     *
     * @param currentState Current state of the content model
     * @return true if the last state was a valid final state
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSEmptyCM.java
    public Object oneTransition (QName elementName, int[] currentState, SubstitutionGroupHandler subGroupHandler){

    /**
     * The method corresponds to one transaction in the content model.
     *
     * @param elementName the qualified name of the element
     * @param currentState Current state
     * @param subGroupHandler the substitution group handler
     * @return element index corresponding to the element from the Schema grammar
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSEmptyCM.java
    public int[] startContentModel(){

    /**
     * This methods to be called on entering a first element whose type
     * has this content model. It will return the initial state of the content model
     *
     * @return Start state of the content model
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSEmptyCM.java
public class XSEmptyCM  implements XSCMValidator {

/**
 * XSEmptyCM is a derivative of the abstract content model base class that
 * handles a content model with no chilren (elements).
 *
 * This model validated on the way in.
 *
 * @xerces.internal
 *
 * @author Elena Litani, Lisa Martin
 * @author IBM
 * @version $Id: XSEmptyCM.java,v 1.7 2009/07/28 15:18:11 spericas Exp $
 */
