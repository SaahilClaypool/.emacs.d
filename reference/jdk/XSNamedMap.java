_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSNamedMap.java
    public XSObject itemByName(String namespace,
                               String localName);

    /**
     * Retrieves an <code>XSObject</code> specified by local name and
     * namespace URI.
     * <br>Per XML Namespaces, applications must use the value <code>null</code> as the
     * <code>namespace</code> parameter for methods if they wish to specify
     * no namespace.
     * @param namespace The namespace URI of the <code>XSObject</code> to
     *   retrieve, or <code>null</code> if the <code>XSObject</code> has no
     *   namespace.
     * @param localName The local name of the <code>XSObject</code> to
     *   retrieve.
     * @return A <code>XSObject</code> (of any type) with the specified local
     *   name and namespace URI, or <code>null</code> if they do not
     *   identify any object in this map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSNamedMap.java
    public XSObject item(int index);

    /**
     *  Returns the <code>index</code>th item in the collection or
     * <code>null</code> if <code>index</code> is greater than or equal to
     * the number of objects in the list. The index starts at 0.
     * @param index  index into the collection.
     * @return  The <code>XSObject</code> at the <code>index</code>th
     *   position in the <code>XSObjectList</code>, or <code>null</code> if
     *   the index specified is not valid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSNamedMap.java
public interface XSNamedMap extends Map {

/**
 * Objects implementing the <code>XSNamedMap</code> interface are used to
 * represent immutable collections of XML Schema components that can be
 * accessed by name. Note that <code>XSNamedMap</code> does not inherit from
 * <code>XSObjectList</code>. The <code>XSObject</code>s in
 * <code>XSNamedMap</code>s are not maintained in any particular order.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSNamedMap.java
    public XSObject itemByName(String namespace,
                               String localName);

    /**
     * Retrieves an <code>XSObject</code> specified by local name and
     * namespace URI.
     * <br>Per XML Namespaces, applications must use the value <code>null</code> as the
     * <code>namespace</code> parameter for methods if they wish to specify
     * no namespace.
     * @param namespace The namespace URI of the <code>XSObject</code> to
     *   retrieve, or <code>null</code> if the <code>XSObject</code> has no
     *   namespace.
     * @param localName The local name of the <code>XSObject</code> to
     *   retrieve.
     * @return A <code>XSObject</code> (of any type) with the specified local
     *   name and namespace URI, or <code>null</code> if they do not
     *   identify any object in this map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSNamedMap.java
    public XSObject item(int index);

    /**
     *  Returns the <code>index</code>th item in the collection or
     * <code>null</code> if <code>index</code> is greater than or equal to
     * the number of objects in the list. The index starts at 0.
     * @param index  index into the collection.
     * @return  The <code>XSObject</code> at the <code>index</code>th
     *   position in the <code>XSObjectList</code>, or <code>null</code> if
     *   the index specified is not valid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/XSNamedMap.java
public interface XSNamedMap extends Map {

/**
 * Objects implementing the <code>XSNamedMap</code> interface are used to
 * represent immutable collections of XML Schema components that can be
 * accessed by name. Note that <code>XSNamedMap</code> does not inherit from
 * <code>XSObjectList</code>. The <code>XSObject</code>s in
 * <code>XSNamedMap</code>s are not maintained in any particular order.
 */
