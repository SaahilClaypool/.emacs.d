_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/ValueStore.java
    public void reportError(String key, Object[] args);

    /**
     * Since the valueStore will have access to an error reporter, this
     * allows it to be called appropriately.
     * @param key  the key of the localized error message
     * @param args  the list of arguments for substitution.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/ValueStore.java
    public void addValue(Field field, Object actualValue, short valueType, ShortList itemValueType);

    /**
     * Adds the specified value to the value store.
     *
     * @param field The field associated to the value. This reference
     *              is used to ensure that each field only adds a value
     *              once within a selection scope.
     * @param actualValue The value to add.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/ValueStore.java
public interface ValueStore {

/**
 * Interface for storing values associated to an identity constraint.
 * Each value stored corresponds to a field declared for the identity
 * constraint. One instance of an object implementing this interface
 * is created for each identity constraint per element declaration in
 * the instance document to store the information for this identity
 * constraint.
 * <p>
 * <strong>Note:</strong> The component performing identity constraint
 * collection and validation is responsible for providing an
 * implementation of this interface. The component is also responsible
 * for performing the necessary checks required by each type of identity
 * constraint.
 *
 * @xerces.internal
 *
 * @author Andy Clark, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/ValueStore.java
    public void reportError(String key, Object[] args);

    /**
     * Since the valueStore will have access to an error reporter, this
     * allows it to be called appropriately.
     * @param key  the key of the localized error message
     * @param args  the list of arguments for substitution.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/ValueStore.java
    public void addValue(Field field, Object actualValue, short valueType, ShortList itemValueType);

    /**
     * Adds the specified value to the value store.
     *
     * @param field The field associated to the value. This reference
     *              is used to ensure that each field only adds a value
     *              once within a selection scope.
     * @param actualValue The value to add.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/identity/ValueStore.java
public interface ValueStore {

/**
 * Interface for storing values associated to an identity constraint.
 * Each value stored corresponds to a field declared for the identity
 * constraint. One instance of an object implementing this interface
 * is created for each identity constraint per element declaration in
 * the instance document to store the information for this identity
 * constraint.
 * <p>
 * <strong>Note:</strong> The component performing identity constraint
 * collection and validation is responsible for providing an
 * implementation of this interface. The component is also responsible
 * for performing the necessary checks required by each type of identity
 * constraint.
 *
 * @xerces.internal
 *
 * @author Andy Clark, IBM
 *
 */
