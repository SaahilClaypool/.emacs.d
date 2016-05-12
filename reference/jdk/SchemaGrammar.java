_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public XSObjectList getAnnotations() {

    /**
     * @see org.apache.xerces.xs.XSNamespaceItem#getAnnotations()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public XSModel toXSModel() {

    /**
     * Return an <code>XSModel</code> that represents components in this schema
     * grammar.
     *
     * @return  an <code>XSModel</code> representing this schema grammar
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public StringList getDocumentLocations() {

    /**
     * [document location]
     * @see <a href="http://www.w3.org/TR/xmlschema-1/#sd-document_location">[document location]</a>
     * @return a list of document information item
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public XSNotationDeclaration getNotationDeclaration(String name) {

    /**
     * Convenience method. Returns a top-level notation declaration.
     *
     * @param name      The name of the declaration.
     * @return A top-level notation declaration or null if such declaration
     *         does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public XSModelGroupDefinition getModelGroupDefinition(String name) {

    /**
     * Convenience method. Returns a top-level model group definition.
     *
     * @param name      The name of the definition.
     * @return A top-level model group definition definition or null if such
     *         definition does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public XSAttributeGroupDefinition getAttributeGroup(String name) {

    /**
     * Convenience method. Returns a top-level attribute group definition.
     * @param name The name of the definition.
     * @return A top-level attribute group definition or null if such
     *   definition does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public XSElementDeclaration getElementDeclaration(String name) {

    /**
     * Convenience method. Returns a top-level element declaration.
     * @param name The name of the declaration.
     * @return A top-level element declaration or null if such declaration
     *   does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public XSAttributeDeclaration getAttributeDeclaration(String name) {

    /**
     * Convenience method. Returns a top-level attribute declaration.
     * @param name The name of the declaration.
     * @return A top-level attribute declaration or null if such declaration
     *   does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public XSTypeDefinition getTypeDefinition(String name) {

    /**
     * Convenience method. Returns a top-level simple or complex type
     * definition.
     * @param name The name of the definition.
     * @return An <code>XSTypeDefinition</code> or null if such definition
     *   does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public synchronized XSNamedMap getComponents(short objectType) {

    /**
     * [schema components]: a list of top-level components, i.e. element
     * declarations, attribute declarations, etc.
     * @param objectType The type of the declaration, i.e.
     *   <code>ELEMENT_DECLARATION</code>. Note that
     *   <code>XSTypeDefinition.SIMPLE_TYPE</code> and
     *   <code>XSTypeDefinition.COMPLEX_TYPE</code> can also be used as the
     *   <code>objectType</code> to retrieve only complex types or simple
     *   types, instead of all types.
     * @return  A list of top-level definition of the specified type in
     *   <code>objectType</code> or an empty <code>XSNamedMap</code> if no
     *   such definitions exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public String getSchemaNamespace() {

    /**
     * [schema namespace]
     * @see <a href="http://www.w3.org/TR/xmlschema-1/#nsi-schema_namespace">[schema namespace]</a>
     * @return The target namespace of this item.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    final XSElementDecl[] getSubstitutionGroups() {

    /**
     * get all substitution group information: for the 3 constraint checking
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    final void setUncheckedTypeNum(int newSize) {

    /**
     * after the first-round checking, some types don't need to be checked
     * against UPA again. here we trim the array to the proper size.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    final SimpleLocator[] getRGLocators() {

    /**
     * get the error locator of all redefined groups
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    final XSGroupDecl[] getRedefinedGroupDecls() {

    /**
     * get all redefined groups: for later constraint checking
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    final SimpleLocator[] getUncheckedCTLocators() {

    /**
     * get the error locator of all complex type decls
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    final XSComplexTypeDecl[] getUncheckedComplexTypeDecls() {

    /**
     * get all complex type decls: for later constraint checking
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public void addRedefinedGroupDecl(XSGroupDecl derived, XSGroupDecl base, SimpleLocator locator) {

    /**
     * add a group redefined by restriction: for later constraint checking
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public void addComplexTypeDecl(XSComplexTypeDecl decl, SimpleLocator locator) {

    /**
     * add one complex type decl: for later constraint checking
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public final boolean hasIDConstraints() {

    /**
     * get one identity constraint
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public final IdentityConstraint getIDConstraintDecl(String declName) {

    /**
     * get one identity constraint
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public final XSTypeDefinition getGlobalTypeDecl(String declName) {

    /**
     * get one global type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public final XSNotationDecl getGlobalNotationDecl(String declName) {

    /**
     * get one global notation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public final XSGroupDecl getGlobalGroupDecl(String declName) {

    /**
     * get one global group
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public final XSElementDecl getGlobalElementDecl(String declName) {

    /**
     * get one global element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public final XSAttributeGroupDecl getGlobalAttributeGroupDecl(String declName) {

    /**
     * get one global attribute group
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public final XSAttributeDecl getGlobalAttributeDecl(String declName) {

    /**
     * get one global attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public final void addIDConstraintDecl(XSElementDecl elmDecl, IdentityConstraint decl) {

    /**
     * register one identity constraint
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public void addGlobalSimpleTypeDecl(XSSimpleType decl) {

    /**
     * register one global simple type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public void addGlobalComplexTypeDecl(XSComplexTypeDecl decl) {

    /**
     * register one global complex type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public void addGlobalTypeDecl(XSTypeDefinition decl) {

    /**
     * register one global type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public void addGlobalNotationDecl(XSNotationDecl decl) {

    /**
     * register one global notation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public void addGlobalGroupDecl(XSGroupDecl decl) {

    /**
     * register one global group
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public void addGlobalElementDeclAll(XSElementDecl decl) {

    /**
     * register one global element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public void addGlobalAttributeGroupDecl(XSAttributeGroupDecl decl) {

    /**
     * register one global attribute group
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public void addGlobalAttributeDecl(XSAttributeDecl decl) {

    /**
     * register one global attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public final String getTargetNamespace() {

    /**
     * Returns this grammar's target namespace.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
        private Schema4Annotations() {

        /**
         * Special constructor to create a schema
         * capable of validating annotations.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
        public static final Schema4Annotations INSTANCE = new Schema4Annotations();

        /**
         * Singleton instance.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public static final class Schema4Annotations extends SchemaGrammar {

    /**
     * <p>A partial schema for schemas for validating annotations.</p>
     *
     * @xerces.internal
     *
     * @author Michael Glavassevich, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
        public BuiltinSchemaGrammar(int grammar, short schemaVersion) {

        /**
         * Special constructor to create the grammars for the schema namespaces
         *
         * @param grammar
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public SchemaGrammar(String targetNamespace, XSDDescription grammarDesc,
                SymbolTable symbolTable) {

    /**
     * Default constructor.
     *
     * @param targetNamespace
     * @param grammarDesc the XMLGrammarDescription corresponding to this objec
     *          at the least a systemId should always be known.
     * @param symbolTable   needed for annotation support
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
public class SchemaGrammar implements XSGrammar, XSNamespaceItem {

/**
 * This class is to hold all schema component declaration that are declared
 * within one namespace.
 *
 * The Grammar class this class extends contains what little
 * commonality there is between XML Schema and DTD grammars.  It's
 * useful to distinguish grammar objects from other kinds of object
 * when they exist in pools or caches.
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 * @author Elena Litani, IBM
 *
 * @version $Id: SchemaGrammar.java,v 1.7 2010-11-01 04:39:55 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public XSObjectList getAnnotations() {

    /**
     * @see org.apache.xerces.xs.XSNamespaceItem#getAnnotations()
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public XSModel toXSModel() {

    /**
     * Return an <code>XSModel</code> that represents components in this schema
     * grammar.
     *
     * @return  an <code>XSModel</code> representing this schema grammar
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public StringList getDocumentLocations() {

    /**
     * [document location]
     * @see <a href="http://www.w3.org/TR/xmlschema-1/#sd-document_location">[document location]</a>
     * @return a list of document information item
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public XSNotationDeclaration getNotationDeclaration(String name) {

    /**
     * Convenience method. Returns a top-level notation declaration.
     *
     * @param name      The name of the declaration.
     * @return A top-level notation declaration or null if such declaration
     *         does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public XSModelGroupDefinition getModelGroupDefinition(String name) {

    /**
     * Convenience method. Returns a top-level model group definition.
     *
     * @param name      The name of the definition.
     * @return A top-level model group definition definition or null if such
     *         definition does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public XSAttributeGroupDefinition getAttributeGroup(String name) {

    /**
     * Convenience method. Returns a top-level attribute group definition.
     * @param name The name of the definition.
     * @return A top-level attribute group definition or null if such
     *   definition does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public XSElementDeclaration getElementDeclaration(String name) {

    /**
     * Convenience method. Returns a top-level element declaration.
     * @param name The name of the declaration.
     * @return A top-level element declaration or null if such declaration
     *   does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public XSAttributeDeclaration getAttributeDeclaration(String name) {

    /**
     * Convenience method. Returns a top-level attribute declaration.
     * @param name The name of the declaration.
     * @return A top-level attribute declaration or null if such declaration
     *   does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public XSTypeDefinition getTypeDefinition(String name) {

    /**
     * Convenience method. Returns a top-level simple or complex type
     * definition.
     * @param name The name of the definition.
     * @return An <code>XSTypeDefinition</code> or null if such definition
     *   does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public synchronized XSNamedMap getComponents(short objectType) {

    /**
     * [schema components]: a list of top-level components, i.e. element
     * declarations, attribute declarations, etc.
     * @param objectType The type of the declaration, i.e.
     *   <code>ELEMENT_DECLARATION</code>. Note that
     *   <code>XSTypeDefinition.SIMPLE_TYPE</code> and
     *   <code>XSTypeDefinition.COMPLEX_TYPE</code> can also be used as the
     *   <code>objectType</code> to retrieve only complex types or simple
     *   types, instead of all types.
     * @return  A list of top-level definition of the specified type in
     *   <code>objectType</code> or an empty <code>XSNamedMap</code> if no
     *   such definitions exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public String getSchemaNamespace() {

    /**
     * [schema namespace]
     * @see <a href="http://www.w3.org/TR/xmlschema-1/#nsi-schema_namespace">[schema namespace]</a>
     * @return The target namespace of this item.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    final XSElementDecl[] getSubstitutionGroups() {

    /**
     * get all substitution group information: for the 3 constraint checking
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    final void setUncheckedTypeNum(int newSize) {

    /**
     * after the first-round checking, some types don't need to be checked
     * against UPA again. here we trim the array to the proper size.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    final SimpleLocator[] getRGLocators() {

    /**
     * get the error locator of all redefined groups
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    final XSGroupDecl[] getRedefinedGroupDecls() {

    /**
     * get all redefined groups: for later constraint checking
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    final SimpleLocator[] getUncheckedCTLocators() {

    /**
     * get the error locator of all complex type decls
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    final XSComplexTypeDecl[] getUncheckedComplexTypeDecls() {

    /**
     * get all complex type decls: for later constraint checking
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public void addRedefinedGroupDecl(XSGroupDecl derived, XSGroupDecl base, SimpleLocator locator) {

    /**
     * add a group redefined by restriction: for later constraint checking
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public void addComplexTypeDecl(XSComplexTypeDecl decl, SimpleLocator locator) {

    /**
     * add one complex type decl: for later constraint checking
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public final boolean hasIDConstraints() {

    /**
     * get one identity constraint
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public final IdentityConstraint getIDConstraintDecl(String declName) {

    /**
     * get one identity constraint
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public final XSTypeDefinition getGlobalTypeDecl(String declName) {

    /**
     * get one global type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public final XSNotationDecl getGlobalNotationDecl(String declName) {

    /**
     * get one global notation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public final XSGroupDecl getGlobalGroupDecl(String declName) {

    /**
     * get one global group
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public final XSElementDecl getGlobalElementDecl(String declName) {

    /**
     * get one global element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public final XSAttributeGroupDecl getGlobalAttributeGroupDecl(String declName) {

    /**
     * get one global attribute group
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public final XSAttributeDecl getGlobalAttributeDecl(String declName) {

    /**
     * get one global attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public final void addIDConstraintDecl(XSElementDecl elmDecl, IdentityConstraint decl) {

    /**
     * register one identity constraint
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public void addGlobalSimpleTypeDecl(XSSimpleType decl) {

    /**
     * register one global simple type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public void addGlobalComplexTypeDecl(XSComplexTypeDecl decl) {

    /**
     * register one global complex type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public void addGlobalTypeDecl(XSTypeDefinition decl) {

    /**
     * register one global type
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public void addGlobalNotationDecl(XSNotationDecl decl) {

    /**
     * register one global notation
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public void addGlobalGroupDecl(XSGroupDecl decl) {

    /**
     * register one global group
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public void addGlobalElementDeclAll(XSElementDecl decl) {

    /**
     * register one global element
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public void addGlobalAttributeGroupDecl(XSAttributeGroupDecl decl) {

    /**
     * register one global attribute group
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public void addGlobalAttributeDecl(XSAttributeDecl decl) {

    /**
     * register one global attribute
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public final String getTargetNamespace() {

    /**
     * Returns this grammar's target namespace.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
        private Schema4Annotations() {

        /**
         * Special constructor to create a schema
         * capable of validating annotations.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
        public static final Schema4Annotations INSTANCE = new Schema4Annotations();

        /**
         * Singleton instance.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public static final class Schema4Annotations extends SchemaGrammar {

    /**
     * <p>A partial schema for schemas for validating annotations.</p>
     *
     * @xerces.internal
     *
     * @author Michael Glavassevich, IBM
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
        public BuiltinSchemaGrammar(int grammar, short schemaVersion) {

        /**
         * Special constructor to create the grammars for the schema namespaces
         *
         * @param grammar
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
    public SchemaGrammar(String targetNamespace, XSDDescription grammarDesc,
                SymbolTable symbolTable) {

    /**
     * Default constructor.
     *
     * @param targetNamespace
     * @param grammarDesc the XMLGrammarDescription corresponding to this objec
     *          at the least a systemId should always be known.
     * @param symbolTable   needed for annotation support
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaGrammar.java
public class SchemaGrammar implements XSGrammar, XSNamespaceItem {

/**
 * This class is to hold all schema component declaration that are declared
 * within one namespace.
 *
 * The Grammar class this class extends contains what little
 * commonality there is between XML Schema and DTD grammars.  It's
 * useful to distinguish grammar objects from other kinds of object
 * when they exist in pools or caches.
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 * @author Elena Litani, IBM
 *
 * @version $Id: SchemaGrammar.java,v 1.7 2010-11-01 04:39:55 joehw Exp $
 */
