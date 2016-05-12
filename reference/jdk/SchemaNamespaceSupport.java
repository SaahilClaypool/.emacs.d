_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaNamespaceSupport.java
    public String [] getEffectiveLocalContext() {

    /**
     * This method returns an array of Strings, as would be stored in
     * a NamespaceSupport object.  This array contains all
     * declarations except those at the global level.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaNamespaceSupport.java
    public void setEffectiveContext (String [] namespaceDecls) {

    /**
     * This method takes a set of Strings, as stored in a
     * NamespaceSupport object, and "fools" the object into thinking
     * that this is one unified context.  This is meant to be used in
     * conjunction with things like local elements, whose declarations
     * may be deeply nested but which for all practical purposes may
     * be regarded as being one level below the global <schema>
     * element--at least with regard to namespace declarations.
     * It's worth noting that the context from which the strings are
     * being imported had better be using the same SymbolTable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaNamespaceSupport.java
public class SchemaNamespaceSupport

/**
 * This class customizes the behaviour of the util.NamespaceSupport
 * class in order to easily implement some features that we need for
 * efficient schema handling.  It will not be generally useful.
 *
 * @xerces.internal
 *
 * @author Neil Graham, IBM
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaNamespaceSupport.java
    public String [] getEffectiveLocalContext() {

    /**
     * This method returns an array of Strings, as would be stored in
     * a NamespaceSupport object.  This array contains all
     * declarations except those at the global level.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaNamespaceSupport.java
    public void setEffectiveContext (String [] namespaceDecls) {

    /**
     * This method takes a set of Strings, as stored in a
     * NamespaceSupport object, and "fools" the object into thinking
     * that this is one unified context.  This is meant to be used in
     * conjunction with things like local elements, whose declarations
     * may be deeply nested but which for all practical purposes may
     * be regarded as being one level below the global <schema>
     * element--at least with regard to namespace declarations.
     * It's worth noting that the context from which the strings are
     * being imported had better be using the same SymbolTable.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/SchemaNamespaceSupport.java
public class SchemaNamespaceSupport

/**
 * This class customizes the behaviour of the util.NamespaceSupport
 * class in order to easily implement some features that we need for
 * efficient schema handling.  It will not be generally useful.
 *
 * @xerces.internal
 *
 * @author Neil Graham, IBM
 *
 */
