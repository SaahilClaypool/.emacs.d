_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSNamespaceItem.java
    public StringList getDocumentLocations();

    /**
     * [document location] - a list of location URIs for the documents that
     * contributed to the <code>XSModel</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSNamespaceItem.java
    public XSNotationDeclaration getNotationDeclaration(String name);

    /**
     * Convenience method. Returns a top-level notation declaration.
     * @param name The name of the declaration.
     * @return A top-level notation declaration or <code>null</code> if such
     *   a declaration does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSNamespaceItem.java
    public XSModelGroupDefinition getModelGroupDefinition(String name);

    /**
     * Convenience method. Returns a top-level model group definition.
     * @param name The name of the definition.
     * @return A top-level model group definition definition or
     *   <code>null</code> if such a definition does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSNamespaceItem.java
    public XSAttributeGroupDefinition getAttributeGroup(String name);

    /**
     * Convenience method. Returns a top-level attribute group definition.
     * @param name The name of the definition.
     * @return A top-level attribute group definition or <code>null</code> if
     *   such a definition does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSNamespaceItem.java
    public XSTypeDefinition getTypeDefinition(String name);

    /**
     * Convenience method. Returns a top-level simple or complex type
     * definition.
     * @param name The name of the definition.
     * @return An <code>XSTypeDefinition</code> or <code>null</code> if such
     *   a definition does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSNamespaceItem.java
    public XSAttributeDeclaration getAttributeDeclaration(String name);

    /**
     * Convenience method. Returns a top-level attribute declaration.
     * @param name The name of the declaration.
     * @return A top-level attribute declaration or <code>null</code> if such
     *   a declaration does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSNamespaceItem.java
    public XSElementDeclaration getElementDeclaration(String name);

    /**
     * Convenience method. Returns a top-level element declaration.
     * @param name The name of the declaration.
     * @return A top-level element declaration or <code>null</code> if such a
     *   declaration does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSNamespaceItem.java
    public XSObjectList getAnnotations();

    /**
     *  [annotations]: a set of annotations if it exists, otherwise an empty
     * <code>XSObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSNamespaceItem.java
    public XSNamedMap getComponents(short objectType);

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSNamespaceItem.java
public interface XSNamespaceItem {

/**
 * The interface represents the namespace schema information information item.
 * Each namespace schema information information item corresponds to an XML
 * Schema with a unique namespace name.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSNamespaceItem.java
    public StringList getDocumentLocations();

    /**
     * [document location] - a list of location URIs for the documents that
     * contributed to the <code>XSModel</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSNamespaceItem.java
    public XSNotationDeclaration getNotationDeclaration(String name);

    /**
     * Convenience method. Returns a top-level notation declaration.
     * @param name The name of the declaration.
     * @return A top-level notation declaration or <code>null</code> if such
     *   a declaration does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSNamespaceItem.java
    public XSModelGroupDefinition getModelGroupDefinition(String name);

    /**
     * Convenience method. Returns a top-level model group definition.
     * @param name The name of the definition.
     * @return A top-level model group definition definition or
     *   <code>null</code> if such a definition does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSNamespaceItem.java
    public XSAttributeGroupDefinition getAttributeGroup(String name);

    /**
     * Convenience method. Returns a top-level attribute group definition.
     * @param name The name of the definition.
     * @return A top-level attribute group definition or <code>null</code> if
     *   such a definition does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSNamespaceItem.java
    public XSTypeDefinition getTypeDefinition(String name);

    /**
     * Convenience method. Returns a top-level simple or complex type
     * definition.
     * @param name The name of the definition.
     * @return An <code>XSTypeDefinition</code> or <code>null</code> if such
     *   a definition does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSNamespaceItem.java
    public XSAttributeDeclaration getAttributeDeclaration(String name);

    /**
     * Convenience method. Returns a top-level attribute declaration.
     * @param name The name of the declaration.
     * @return A top-level attribute declaration or <code>null</code> if such
     *   a declaration does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSNamespaceItem.java
    public XSElementDeclaration getElementDeclaration(String name);

    /**
     * Convenience method. Returns a top-level element declaration.
     * @param name The name of the declaration.
     * @return A top-level element declaration or <code>null</code> if such a
     *   declaration does not exist.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSNamespaceItem.java
    public XSObjectList getAnnotations();

    /**
     *  [annotations]: a set of annotations if it exists, otherwise an empty
     * <code>XSObjectList</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSNamespaceItem.java
    public XSNamedMap getComponents(short objectType);

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSNamespaceItem.java
public interface XSNamespaceItem {

/**
 * The interface represents the namespace schema information information item.
 * Each namespace schema information information item corresponds to an XML
 * Schema with a unique namespace name.
 */
