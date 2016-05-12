_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/ExtendedSchemaDVFactoryImpl.java
    public SymbolHash getBuiltInTypes() {

    /**
     * get all built-in simple types, which are stored in a hashtable keyed by
     * the name
     *
     * @return      a hashtable which contains all built-in simple types
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/ExtendedSchemaDVFactoryImpl.java
    public XSSimpleType getBuiltInType(String name) {

    /**
     * Get a built-in simple type of the given name
     * REVISIT: its still not decided within the Schema WG how to define the
     *          ur-types and if all simple types should be derived from a
     *          complex type, so as of now we ignore the fact that anySimpleType
     *          is derived from anyType, and pass 'null' as the base of
     *          anySimpleType. It needs to be changed as per the decision taken.
     *
     * @param name  the name of the datatype
     * @return      the datatype validator of the given name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/ExtendedSchemaDVFactoryImpl.java
public class ExtendedSchemaDVFactoryImpl extends BaseSchemaDVFactory {

/**
 * A special factory to create/return built-in schema DVs and create user-defined DVs
 * that includes anyAtomicType, yearMonthDuration and dayTimeDuration
 *
 * @xerces.internal
 *
 * @author Khaled Noaman, IBM
 *
 * @version $Id: ExtendedSchemaDVFactoryImpl.java,v 1.2 2010-10-26 23:01:03 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/ExtendedSchemaDVFactoryImpl.java
    public SymbolHash getBuiltInTypes() {

    /**
     * get all built-in simple types, which are stored in a hashtable keyed by
     * the name
     *
     * @return      a hashtable which contains all built-in simple types
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/ExtendedSchemaDVFactoryImpl.java
    public XSSimpleType getBuiltInType(String name) {

    /**
     * Get a built-in simple type of the given name
     * REVISIT: its still not decided within the Schema WG how to define the
     *          ur-types and if all simple types should be derived from a
     *          complex type, so as of now we ignore the fact that anySimpleType
     *          is derived from anyType, and pass 'null' as the base of
     *          anySimpleType. It needs to be changed as per the decision taken.
     *
     * @param name  the name of the datatype
     * @return      the datatype validator of the given name
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/ExtendedSchemaDVFactoryImpl.java
public class ExtendedSchemaDVFactoryImpl extends BaseSchemaDVFactory {

/**
 * A special factory to create/return built-in schema DVs and create user-defined DVs
 * that includes anyAtomicType, yearMonthDuration and dayTimeDuration
 *
 * @xerces.internal
 *
 * @author Khaled Noaman, IBM
 *
 * @version $Id: ExtendedSchemaDVFactoryImpl.java,v 1.2 2010-10-26 23:01:03 joehw Exp $
 */
