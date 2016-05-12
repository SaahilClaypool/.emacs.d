_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSNamespaceItem item(int index) {

    /**
     * Returns the <code>index</code>th item in the collection or
     * <code>null</code> if <code>index</code> is greater than or equal to
     * the number of objects in the list. The index starts at 0.
     * @param index  index into the collection.
     * @return  The <code>XSNamespaceItem</code> at the <code>index</code>th
     *   position in the <code>XSNamespaceItemList</code>, or
     *   <code>null</code> if the index specified is not valid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public int getLength() {

    /**
     * The number of <code>XSNamespaceItem</code>s in the list. The range of
     * valid child object indices is 0 to <code>length-1</code> inclusive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSObjectList getSubstitutionGroup(XSElementDeclaration head) {

    /**
     * Convenience method. Returns a list containing the members of the
     * substitution group for the given <code>XSElementDeclaration</code>
     * or an empty <code>XSObjectList</code> if the substitution group
     * contains no members.
     * @param head The substitution group head.
     * @return A list containing the members of the substitution group
     *  for the given <code>XSElementDeclaration</code> or an empty
     *  <code>XSObjectList</code> if the substitution group contains
     *  no members.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public boolean hasIDConstraints() {

    /**
     * REVISIT: to expose identity constraints from XSModel.
     * For now, we only expose whether there are any IDCs.
     * We also need to add these methods to the public
     * XSModel interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public synchronized XSObjectList getAnnotations() {

    /**
     *  [annotations]: a set of annotations if it exists, otherwise an empty
     * <code>XSObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSNotationDeclaration getNotationDeclaration(String name,
                                                 String namespace) {

    /**
     * @see org.apache.xerces.xs.XSModel#getNotationDeclaration(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSModelGroupDefinition getModelGroupDefinition(String name,
                                                          String namespace,
                                                          String loc) {

    /**
     * Convenience method. Returns a top-level model group definition.
     *
     * @param name      The name of the definition.
     * @param namespace The namespace of the definition, otherwise null.
     * @param loc The schema location where the component was defined
     * @return A top-level model group definition definition or null if such
     *         definition does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSModelGroupDefinition getModelGroupDefinition(String name,
                                                          String namespace) {

    /**
     * Convenience method. Returns a top-level model group definition.
     *
     * @param name      The name of the definition.
     * @param namespace The namespace of the definition, otherwise null.
     * @return A top-level model group definition definition or null if such
     *         definition does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSAttributeGroupDefinition getAttributeGroup(String name,
                                                        String namespace,
                                                        String loc) {

    /**
     * Convenience method. Returns a top-level attribute group definition.
     * @param name The name of the definition.
     * @param namespace The namespace of the definition, otherwise null.
     * @param loc The schema location where the component was defined
     * @return A top-level attribute group definition or null if such
     *   definition does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSAttributeGroupDefinition getAttributeGroup(String name,
                                                        String namespace) {

    /**
     * Convenience method. Returns a top-level attribute group definition.
     * @param name The name of the definition.
     * @param namespace The namespace of the definition, otherwise null.
     * @return A top-level attribute group definition or null if such
     *   definition does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSElementDeclaration getElementDeclaration(String name,
                                               String namespace,
                                               String loc) {

    /**
     * Convenience method. Returns a top-level element declaration.
     * @param name The name of the declaration.
     * @param namespace The namespace of the definition, otherwise null.
     * @param loc The schema location where the component was defined
     * @return A top-level element declaration or null if such declaration
     *   does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSElementDeclaration getElementDeclaration(String name,
                                               String namespace) {

    /**
     * Convenience method. Returns a top-level element declaration.
     * @param name The name of the declaration.
     * @param namespace The namespace of the definition, otherwise null.
     * @return A top-level element declaration or null if such declaration
     *   does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSAttributeDeclaration getAttributeDeclaration(String name,
                                                   String namespace,
                                                   String loc) {

    /**
     * Convenience method. Returns a top-level attribute declaration.
     * @param name The name of the declaration.
     * @param namespace The namespace of the definition, otherwise null.
     * @param loc The schema location where the component was defined
     * @return A top-level attribute declaration or null if such declaration
     *   does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSAttributeDeclaration getAttributeDeclaration(String name,
                                                   String namespace) {

    /**
     * Convenience method. Returns a top-level attribute declaration.
     * @param name The name of the declaration.
     * @param namespace The namespace of the definition, otherwise null.
     * @return A top-level attribute declaration or null if such declaration
     *   does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSTypeDefinition getTypeDefinition(String name,
                                              String namespace,
                                              String loc) {

    /**
     * Convenience method. Returns a top-level simple or complex type
     * definition.
     * @param name The name of the definition.
     * @param namespace The namespace of the definition, otherwise null.
     * @param loc The schema location where the component was defined
     * @return An <code>XSTypeDefinition</code> or null if such definition
     *   does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSTypeDefinition getTypeDefinition(String name,
                                              String namespace) {

    /**
     * Convenience method. Returns a top-level simple or complex type
     * definition.
     * @param name The name of the definition.
     * @param namespace The namespace of the definition, otherwise null.
     * @return An <code>XSTypeDefinition</code> or null if such definition
     *   does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public synchronized XSNamedMap getComponentsByNamespace(short objectType,
                                                            String namespace) {

    /**
     * Convenience method. Returns a list of top-level component declarations
     * that are defined within the specified namespace, i.e. element
     * declarations, attribute declarations, etc.
     * @param objectType The type of the declaration, i.e.
     *   <code>ELEMENT_DECLARATION</code>.
     * @param namespace The namespace to which the declaration belongs or
     *   <code>null</code> (for components with no target namespace).
     * @return  A list of top-level definitions of the specified type in
     *   <code>objectType</code> and defined in the specified
     *   <code>namespace</code> or an empty <code>XSNamedMap</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public synchronized XSNamedMap getComponents(short objectType) {

    /**
     * Returns a list of top-level components, i.e. element declarations,
     * attribute declarations, etc.
     * @param objectType The type of the declaration, i.e.
     *   <code>ELEMENT_DECLARATION</code>. Note that
     *   <code>XSTypeDefinition.SIMPLE_TYPE</code> and
     *   <code>XSTypeDefinition.COMPLEX_TYPE</code> can also be used as the
     *   <code>objectType</code> to retrieve only complex types or simple
     *   types, instead of all types.
     * @return  A list of top-level definitions of the specified type in
     *   <code>objectType</code> or an empty <code>XSNamedMap</code> if no
     *   such definitions exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSNamespaceItemList getNamespaceItems() {

    /**
     * A set of namespace schema information information items (of type
     * <code>XSNamespaceItem</code>), one for each namespace name which
     * appears as the target namespace of any schema component in the schema
     * used for that assessment, and one for absent if any schema component
     * in the schema had no target namespace. For more information see
     * schema information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public StringList getNamespaces() {

    /**
     * Convenience method. Returns a list of all namespaces that belong to
     * this schema.
     * @return A list of all namespaces that belong to this schema or
     *   <code>null</code> if all components don't have a targetNamespace.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSModelImpl(SchemaGrammar[] grammars) {

   /**
    * Construct an XSModelImpl, by storing some grammars and grammars imported
    * by them to this object.
    *
    * @param grammars   the array of schema grammars
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
public final class XSModelImpl extends AbstractList implements XSModel, XSNamespaceItemList {

/**
 * Implements XSModel:  a read-only interface that represents an XML Schema,
 * which could be components from different namespaces.
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 *
 * @version $Id: XSModelImpl.java,v 1.7 2010-11-01 04:39:55 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSNamespaceItem item(int index) {

    /**
     * Returns the <code>index</code>th item in the collection or
     * <code>null</code> if <code>index</code> is greater than or equal to
     * the number of objects in the list. The index starts at 0.
     * @param index  index into the collection.
     * @return  The <code>XSNamespaceItem</code> at the <code>index</code>th
     *   position in the <code>XSNamespaceItemList</code>, or
     *   <code>null</code> if the index specified is not valid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public int getLength() {

    /**
     * The number of <code>XSNamespaceItem</code>s in the list. The range of
     * valid child object indices is 0 to <code>length-1</code> inclusive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSObjectList getSubstitutionGroup(XSElementDeclaration head) {

    /**
     * Convenience method. Returns a list containing the members of the
     * substitution group for the given <code>XSElementDeclaration</code>
     * or an empty <code>XSObjectList</code> if the substitution group
     * contains no members.
     * @param head The substitution group head.
     * @return A list containing the members of the substitution group
     *  for the given <code>XSElementDeclaration</code> or an empty
     *  <code>XSObjectList</code> if the substitution group contains
     *  no members.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public boolean hasIDConstraints() {

    /**
     * REVISIT: to expose identity constraints from XSModel.
     * For now, we only expose whether there are any IDCs.
     * We also need to add these methods to the public
     * XSModel interface.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public synchronized XSObjectList getAnnotations() {

    /**
     *  [annotations]: a set of annotations if it exists, otherwise an empty
     * <code>XSObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSNotationDeclaration getNotationDeclaration(String name,
                                                 String namespace) {

    /**
     * @see org.apache.xerces.xs.XSModel#getNotationDeclaration(String, String)
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSModelGroupDefinition getModelGroupDefinition(String name,
                                                          String namespace,
                                                          String loc) {

    /**
     * Convenience method. Returns a top-level model group definition.
     *
     * @param name      The name of the definition.
     * @param namespace The namespace of the definition, otherwise null.
     * @param loc The schema location where the component was defined
     * @return A top-level model group definition definition or null if such
     *         definition does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSModelGroupDefinition getModelGroupDefinition(String name,
                                                          String namespace) {

    /**
     * Convenience method. Returns a top-level model group definition.
     *
     * @param name      The name of the definition.
     * @param namespace The namespace of the definition, otherwise null.
     * @return A top-level model group definition definition or null if such
     *         definition does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSAttributeGroupDefinition getAttributeGroup(String name,
                                                        String namespace,
                                                        String loc) {

    /**
     * Convenience method. Returns a top-level attribute group definition.
     * @param name The name of the definition.
     * @param namespace The namespace of the definition, otherwise null.
     * @param loc The schema location where the component was defined
     * @return A top-level attribute group definition or null if such
     *   definition does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSAttributeGroupDefinition getAttributeGroup(String name,
                                                        String namespace) {

    /**
     * Convenience method. Returns a top-level attribute group definition.
     * @param name The name of the definition.
     * @param namespace The namespace of the definition, otherwise null.
     * @return A top-level attribute group definition or null if such
     *   definition does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSElementDeclaration getElementDeclaration(String name,
                                               String namespace,
                                               String loc) {

    /**
     * Convenience method. Returns a top-level element declaration.
     * @param name The name of the declaration.
     * @param namespace The namespace of the definition, otherwise null.
     * @param loc The schema location where the component was defined
     * @return A top-level element declaration or null if such declaration
     *   does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSElementDeclaration getElementDeclaration(String name,
                                               String namespace) {

    /**
     * Convenience method. Returns a top-level element declaration.
     * @param name The name of the declaration.
     * @param namespace The namespace of the definition, otherwise null.
     * @return A top-level element declaration or null if such declaration
     *   does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSAttributeDeclaration getAttributeDeclaration(String name,
                                                   String namespace,
                                                   String loc) {

    /**
     * Convenience method. Returns a top-level attribute declaration.
     * @param name The name of the declaration.
     * @param namespace The namespace of the definition, otherwise null.
     * @param loc The schema location where the component was defined
     * @return A top-level attribute declaration or null if such declaration
     *   does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSAttributeDeclaration getAttributeDeclaration(String name,
                                                   String namespace) {

    /**
     * Convenience method. Returns a top-level attribute declaration.
     * @param name The name of the declaration.
     * @param namespace The namespace of the definition, otherwise null.
     * @return A top-level attribute declaration or null if such declaration
     *   does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSTypeDefinition getTypeDefinition(String name,
                                              String namespace,
                                              String loc) {

    /**
     * Convenience method. Returns a top-level simple or complex type
     * definition.
     * @param name The name of the definition.
     * @param namespace The namespace of the definition, otherwise null.
     * @param loc The schema location where the component was defined
     * @return An <code>XSTypeDefinition</code> or null if such definition
     *   does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSTypeDefinition getTypeDefinition(String name,
                                              String namespace) {

    /**
     * Convenience method. Returns a top-level simple or complex type
     * definition.
     * @param name The name of the definition.
     * @param namespace The namespace of the definition, otherwise null.
     * @return An <code>XSTypeDefinition</code> or null if such definition
     *   does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public synchronized XSNamedMap getComponentsByNamespace(short objectType,
                                                            String namespace) {

    /**
     * Convenience method. Returns a list of top-level component declarations
     * that are defined within the specified namespace, i.e. element
     * declarations, attribute declarations, etc.
     * @param objectType The type of the declaration, i.e.
     *   <code>ELEMENT_DECLARATION</code>.
     * @param namespace The namespace to which the declaration belongs or
     *   <code>null</code> (for components with no target namespace).
     * @return  A list of top-level definitions of the specified type in
     *   <code>objectType</code> and defined in the specified
     *   <code>namespace</code> or an empty <code>XSNamedMap</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public synchronized XSNamedMap getComponents(short objectType) {

    /**
     * Returns a list of top-level components, i.e. element declarations,
     * attribute declarations, etc.
     * @param objectType The type of the declaration, i.e.
     *   <code>ELEMENT_DECLARATION</code>. Note that
     *   <code>XSTypeDefinition.SIMPLE_TYPE</code> and
     *   <code>XSTypeDefinition.COMPLEX_TYPE</code> can also be used as the
     *   <code>objectType</code> to retrieve only complex types or simple
     *   types, instead of all types.
     * @return  A list of top-level definitions of the specified type in
     *   <code>objectType</code> or an empty <code>XSNamedMap</code> if no
     *   such definitions exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSNamespaceItemList getNamespaceItems() {

    /**
     * A set of namespace schema information information items (of type
     * <code>XSNamespaceItem</code>), one for each namespace name which
     * appears as the target namespace of any schema component in the schema
     * used for that assessment, and one for absent if any schema component
     * in the schema had no target namespace. For more information see
     * schema information.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public StringList getNamespaces() {

    /**
     * Convenience method. Returns a list of all namespaces that belong to
     * this schema.
     * @return A list of all namespaces that belong to this schema or
     *   <code>null</code> if all components don't have a targetNamespace.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
    public XSModelImpl(SchemaGrammar[] grammars) {

   /**
    * Construct an XSModelImpl, by storing some grammars and grammars imported
    * by them to this object.
    *
    * @param grammars   the array of schema grammars
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSModelImpl.java
public final class XSModelImpl extends AbstractList implements XSModel, XSNamespaceItemList {

/**
 * Implements XSModel:  a read-only interface that represents an XML Schema,
 * which could be components from different namespaces.
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 *
 * @version $Id: XSModelImpl.java,v 1.7 2010-11-01 04:39:55 joehw Exp $
 */
