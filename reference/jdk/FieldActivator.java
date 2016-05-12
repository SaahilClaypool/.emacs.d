_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/FieldActivator.java
    public void endValueScopeFor(IdentityConstraint identityConstraint, int initialDepth);

    /**
     * Ends the value scope for the specified identity constraint.
     *
     * @param identityConstraint The identity constraint.
     * @param initialDepth  the 0-indexed depth where the Selector began to match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/FieldActivator.java
    public Boolean mayMatch(Field field);

    /**
     * Returns whether the given field is permitted to match a value.
     *
     * @param field The field that may be permitted to be matched.
     * @return Boolean indicating whether the field may be matched.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/FieldActivator.java
    public void setMayMatch(Field field, Boolean state);

    /**
     * Sets whether the given field is permitted to match a value.
     * This should be used to catch instance documents that try
     * and match a field several times in the same scope.
     *
     * @param field The field that may be permitted to be matched.
     * @param state Boolean indiciating whether the field may be matched.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/FieldActivator.java
    public XPathMatcher activateField(Field field, int initialDepth);

    /**
     * Request to activate the specified field. This method returns the
     * matcher for the field.
     * It's also important for the implementor to ensure that it marks whether a Field
     * is permitted to match a value--that is, to call the setMayMatch(Field, Boolean) method.
     *
     * @param field The field to activate.
     * @param initialDepth the 0-indexed depth in the instance document at which the Selector began to match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/FieldActivator.java
    public void startValueScopeFor(IdentityConstraint identityConstraint,
            int initialDepth);

    /**
     * Start the value scope for the specified identity constraint. This
     * method is called when the selector matches in order to initialize
     * the value store.
     *
     * @param identityConstraint The identity constraint.
     * @param initialDepth  the depth at which the selector began matching
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/FieldActivator.java
public interface FieldActivator {

/**
 * Interface for a field activator. The field activator is responsible
 * for activating fields within a specific scope; the caller merely
 * requests the fields to be activated.
 *
 * @xerces.internal
 *
 * @author Andy Clark, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/FieldActivator.java
    public void endValueScopeFor(IdentityConstraint identityConstraint, int initialDepth);

    /**
     * Ends the value scope for the specified identity constraint.
     *
     * @param identityConstraint The identity constraint.
     * @param initialDepth  the 0-indexed depth where the Selector began to match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/FieldActivator.java
    public Boolean mayMatch(Field field);

    /**
     * Returns whether the given field is permitted to match a value.
     *
     * @param field The field that may be permitted to be matched.
     * @return Boolean indicating whether the field may be matched.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/FieldActivator.java
    public void setMayMatch(Field field, Boolean state);

    /**
     * Sets whether the given field is permitted to match a value.
     * This should be used to catch instance documents that try
     * and match a field several times in the same scope.
     *
     * @param field The field that may be permitted to be matched.
     * @param state Boolean indiciating whether the field may be matched.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/FieldActivator.java
    public XPathMatcher activateField(Field field, int initialDepth);

    /**
     * Request to activate the specified field. This method returns the
     * matcher for the field.
     * It's also important for the implementor to ensure that it marks whether a Field
     * is permitted to match a value--that is, to call the setMayMatch(Field, Boolean) method.
     *
     * @param field The field to activate.
     * @param initialDepth the 0-indexed depth in the instance document at which the Selector began to match.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/FieldActivator.java
    public void startValueScopeFor(IdentityConstraint identityConstraint,
            int initialDepth);

    /**
     * Start the value scope for the specified identity constraint. This
     * method is called when the selector matches in order to initialize
     * the value store.
     *
     * @param identityConstraint The identity constraint.
     * @param initialDepth  the depth at which the selector began matching
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/FieldActivator.java
public interface FieldActivator {

/**
 * Interface for a field activator. The field activator is responsible
 * for activating fields within a specific scope; the caller merely
 * requests the fields to be activated.
 *
 * @xerces.internal
 *
 * @author Andy Clark, IBM
 *
 */
