_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSCMValidator.java
    public ArrayList checkMinMaxBounds();

    /**
     * Used by constant space algorithm for a{n,m} for n > 1 and
     * m <= unbounded. Called by a validator if validation of
     * countent model succeeds after subsuming a{n,m} to a*
     * (or a+) to check the n and m bounds.
     * Returns <code>null</code> if validation of bounds is
     * successful. Returns a list of strings with error info
     * if not. Even entries in list returned are error codes
     * (used to look up properties) and odd entries are parameters
     * to be passed when formatting error message. Each parameter
     * is associated with the error code that preceeds it in
     * the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSCMValidator.java
    public Vector whatCanGoHere(int[] state);

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSCMValidator.java
    public boolean checkUniqueParticleAttribution(SubstitutionGroupHandler subGroupHandler) throws XMLSchemaException;

    /**
     * check whether this content violates UPA constraint.
     *
     * @param subGroupHandler the substitution group handler
     * @return true if this content model contains other or list wildcard
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSCMValidator.java
    public boolean endContentModel (int[] state);

    /**
     * The method indicates the end of list of children
     *
     * @param state  Current state of the content model
     * @return true if the last state was a valid final state
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSCMValidator.java
    public Object oneTransition (QName elementName, int[] state, SubstitutionGroupHandler subGroupHandler);

    /**
     * The method corresponds to one transaction in the content model.
     *
     * @param elementName
     * @param state  Current state
     * @return element decl or wildcard decl that
     *         corresponds to the element from the Schema grammar
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSCMValidator.java
    public int[] startContentModel();

    /**
     * This methods to be called on entering a first element whose type
     * has this content model. It will return the initial state of the content model
     *
     * @return Start state of the content model
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSCMValidator.java
public interface XSCMValidator {

/**
 * Note: State of the content model is stored in the validator
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 * @author Elena Litani, IBM
 * @version $Id: XSCMValidator.java,v 1.6 2009/07/28 15:18:12 spericas Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSCMValidator.java
    public ArrayList checkMinMaxBounds();

    /**
     * Used by constant space algorithm for a{n,m} for n > 1 and
     * m <= unbounded. Called by a validator if validation of
     * countent model succeeds after subsuming a{n,m} to a*
     * (or a+) to check the n and m bounds.
     * Returns <code>null</code> if validation of bounds is
     * successful. Returns a list of strings with error info
     * if not. Even entries in list returned are error codes
     * (used to look up properties) and odd entries are parameters
     * to be passed when formatting error message. Each parameter
     * is associated with the error code that preceeds it in
     * the list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSCMValidator.java
    public Vector whatCanGoHere(int[] state);

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSCMValidator.java
    public boolean checkUniqueParticleAttribution(SubstitutionGroupHandler subGroupHandler) throws XMLSchemaException;

    /**
     * check whether this content violates UPA constraint.
     *
     * @param subGroupHandler the substitution group handler
     * @return true if this content model contains other or list wildcard
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSCMValidator.java
    public boolean endContentModel (int[] state);

    /**
     * The method indicates the end of list of children
     *
     * @param state  Current state of the content model
     * @return true if the last state was a valid final state
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSCMValidator.java
    public Object oneTransition (QName elementName, int[] state, SubstitutionGroupHandler subGroupHandler);

    /**
     * The method corresponds to one transaction in the content model.
     *
     * @param elementName
     * @param state  Current state
     * @return element decl or wildcard decl that
     *         corresponds to the element from the Schema grammar
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSCMValidator.java
    public int[] startContentModel();

    /**
     * This methods to be called on entering a first element whose type
     * has this content model. It will return the initial state of the content model
     *
     * @return Start state of the content model
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/models/XSCMValidator.java
public interface XSCMValidator {

/**
 * Note: State of the content model is stored in the validator
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 * @author Elena Litani, IBM
 * @version $Id: XSCMValidator.java,v 1.6 2009/07/28 15:18:12 spericas Exp $
 */
