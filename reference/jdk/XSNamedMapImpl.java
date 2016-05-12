_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMapImpl.java
    private static final class XSNamedMapEntry implements Map.Entry {

    /** An entry in the XSNamedMap. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMapImpl.java
    public synchronized XSObject item(int index) {

    /**
     * Returns the <code>index</code>th item in the collection or
     * <code>null</code> if <code>index</code> is greater than or equal to
     * the number of objects in the list. The index starts at 0.
     * @param index  index into the collection.
     * @return  The <code>XSObject</code> at the <code>index</code>th
     *   position in the <code>XSObjectList</code>, or <code>null</code> if
     *   the index specified is not valid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMapImpl.java
    public XSObject itemByName(String namespace, String localName) {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMapImpl.java
    public synchronized int getLength() {

    /**
     * The number of <code>XSObjects</code> in the <code>XSObjectList</code>.
     * The range of valid child object indices is 0 to <code>length-1</code>
     * inclusive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMapImpl.java
    public XSNamedMapImpl(XSObject[] array, int length) {

    /**
     * Construct an XSNamedMap implementation one namespace from an array
     *
     * @param array     containing all components
     * @param length    number of components
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMapImpl.java
    public XSNamedMapImpl(String[] namespaces, SymbolHash[] maps, int num) {

    /**
     * Construct an XSNamedMap implementation for a list of namespaces
     *
     * @param namespaces the namespaces to which the components belong
     * @param maps       the maps from local names to components
     * @param num        the number of namespaces
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMapImpl.java
    public XSNamedMapImpl(String namespace, SymbolHash map) {

    /**
     * Construct an XSNamedMap implementation for one namespace
     *
     * @param namespace the namespace to which the components belong
     * @param map       the map from local names to components
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMapImpl.java
    public static final XSNamedMapImpl EMPTY_MAP = new XSNamedMapImpl(new XSObject[0], 0);

    /**
     * An immutable empty map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMapImpl.java
public class XSNamedMapImpl extends AbstractMap implements XSNamedMap {

/**
 * Containts the map between qnames and XSObject's.
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 *
 * @version $Id: XSNamedMapImpl.java,v 1.7 2010-11-01 04:40:06 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMapImpl.java
    private static final class XSNamedMapEntry implements Map.Entry {

    /** An entry in the XSNamedMap. **/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMapImpl.java
    public synchronized XSObject item(int index) {

    /**
     * Returns the <code>index</code>th item in the collection or
     * <code>null</code> if <code>index</code> is greater than or equal to
     * the number of objects in the list. The index starts at 0.
     * @param index  index into the collection.
     * @return  The <code>XSObject</code> at the <code>index</code>th
     *   position in the <code>XSObjectList</code>, or <code>null</code> if
     *   the index specified is not valid.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMapImpl.java
    public XSObject itemByName(String namespace, String localName) {

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMapImpl.java
    public synchronized int getLength() {

    /**
     * The number of <code>XSObjects</code> in the <code>XSObjectList</code>.
     * The range of valid child object indices is 0 to <code>length-1</code>
     * inclusive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMapImpl.java
    public XSNamedMapImpl(XSObject[] array, int length) {

    /**
     * Construct an XSNamedMap implementation one namespace from an array
     *
     * @param array     containing all components
     * @param length    number of components
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMapImpl.java
    public XSNamedMapImpl(String[] namespaces, SymbolHash[] maps, int num) {

    /**
     * Construct an XSNamedMap implementation for a list of namespaces
     *
     * @param namespaces the namespaces to which the components belong
     * @param maps       the maps from local names to components
     * @param num        the number of namespaces
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMapImpl.java
    public XSNamedMapImpl(String namespace, SymbolHash map) {

    /**
     * Construct an XSNamedMap implementation for one namespace
     *
     * @param namespace the namespace to which the components belong
     * @param map       the map from local names to components
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMapImpl.java
    public static final XSNamedMapImpl EMPTY_MAP = new XSNamedMapImpl(new XSObject[0], 0);

    /**
     * An immutable empty map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMapImpl.java
public class XSNamedMapImpl extends AbstractMap implements XSNamedMap {

/**
 * Containts the map between qnames and XSObject's.
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 *
 * @version $Id: XSNamedMapImpl.java,v 1.7 2010-11-01 04:40:06 joehw Exp $
 */
