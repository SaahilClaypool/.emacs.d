_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/BaseSchemaDVFactory.java
    public XSSimpleTypeDecl newXSSimpleTypeDecl() {

    /** Implementation internal **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/BaseSchemaDVFactory.java
    public XSSimpleType createTypeUnion(String name, String targetNamespace,
                                        short finalSet, XSSimpleType[] memberTypes,
                                        XSObjectList annotations) {

    /**
     * Create a new simple type which is derived by union from a list of other
     * simple types.
     *
     * @param name              name of the new type, could be null
     * @param targetNamespace   target namespace of the new type, could be null
     * @param finalSet          value of "final"
     * @param memberTypes       member types of the union type
     * @param annotations       set of annotations
     * @return                  the newly created simple type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/BaseSchemaDVFactory.java
    public XSSimpleType createTypeList(String name, String targetNamespace,
                                       short finalSet, XSSimpleType itemType,
                                       XSObjectList annotations) {

    /**
     * Create a new simple type which is derived by list from another simple
     * type.
     *
     * @param name              name of the new type, could be null
     * @param targetNamespace   target namespace of the new type, could be null
     * @param finalSet          value of "final"
     * @param itemType          item type of the list type
     * @param annotations       set of annotations
     * @return                  the newly created simple type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/BaseSchemaDVFactory.java
    public XSSimpleType createTypeRestriction(String name, String targetNamespace,
                                              short finalSet, XSSimpleType base, XSObjectList annotations) {

    /**
     * Create a new simple type which is derived by restriction from another
     * simple type.
     *
     * @param name              name of the new type, could be null
     * @param targetNamespace   target namespace of the new type, could be null
     * @param finalSet          value of "final"
     * @param base              base type of the new type
     * @param annotations       set of annotations
     * @return                  the newly created simple type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/BaseSchemaDVFactory.java
public abstract class BaseSchemaDVFactory extends SchemaDVFactory {

/**
 * the base factory to create/return built-in schema DVs and create user-defined DVs
 *
 * @xerces.internal
 *
 * @author Neeraj Bajaj, Sun Microsystems, inc.
 * @author Sandy Gao, IBM
 * @author Khaled Noaman, IBM
 *
 * @version $Id: BaseSchemaDVFactory.java,v 1.2 2010-10-26 23:01:03 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/BaseSchemaDVFactory.java
    public XSSimpleTypeDecl newXSSimpleTypeDecl() {

    /** Implementation internal **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/BaseSchemaDVFactory.java
    public XSSimpleType createTypeUnion(String name, String targetNamespace,
                                        short finalSet, XSSimpleType[] memberTypes,
                                        XSObjectList annotations) {

    /**
     * Create a new simple type which is derived by union from a list of other
     * simple types.
     *
     * @param name              name of the new type, could be null
     * @param targetNamespace   target namespace of the new type, could be null
     * @param finalSet          value of "final"
     * @param memberTypes       member types of the union type
     * @param annotations       set of annotations
     * @return                  the newly created simple type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/BaseSchemaDVFactory.java
    public XSSimpleType createTypeList(String name, String targetNamespace,
                                       short finalSet, XSSimpleType itemType,
                                       XSObjectList annotations) {

    /**
     * Create a new simple type which is derived by list from another simple
     * type.
     *
     * @param name              name of the new type, could be null
     * @param targetNamespace   target namespace of the new type, could be null
     * @param finalSet          value of "final"
     * @param itemType          item type of the list type
     * @param annotations       set of annotations
     * @return                  the newly created simple type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/BaseSchemaDVFactory.java
    public XSSimpleType createTypeRestriction(String name, String targetNamespace,
                                              short finalSet, XSSimpleType base, XSObjectList annotations) {

    /**
     * Create a new simple type which is derived by restriction from another
     * simple type.
     *
     * @param name              name of the new type, could be null
     * @param targetNamespace   target namespace of the new type, could be null
     * @param finalSet          value of "final"
     * @param base              base type of the new type
     * @param annotations       set of annotations
     * @return                  the newly created simple type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dv/xs/BaseSchemaDVFactory.java
public abstract class BaseSchemaDVFactory extends SchemaDVFactory {

/**
 * the base factory to create/return built-in schema DVs and create user-defined DVs
 *
 * @xerces.internal
 *
 * @author Neeraj Bajaj, Sun Microsystems, inc.
 * @author Sandy Gao, IBM
 * @author Khaled Noaman, IBM
 *
 * @version $Id: BaseSchemaDVFactory.java,v 1.2 2010-10-26 23:01:03 joehw Exp $
 */
