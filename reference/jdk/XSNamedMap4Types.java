_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMap4Types.java
    public synchronized XSObject item(int index) {

    /**
     * Returns the <code>index</code>th item in the map. The index starts at
     * 0. If <code>index</code> is greater than or equal to the number of
     * nodes in the list, this returns <code>null</code>.
     * @param index The position in the map from which the item is to be
     *   retrieved.
     * @return The <code>XSObject</code> at the <code>index</code>th position
     *   in the <code>XSNamedMap</code>, or <code>null</code> if that is
     *   not a valid index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMap4Types.java
    public XSObject itemByName(String namespace, String localName) {

    /**
     * Retrieves an <code>XSObject</code> specified by local name and namespace
     * URI.
     * @param namespace The namespace URI of the <code>XSObject</code> to
     *   retrieve.
     * @param localName The local name of the <code>XSObject</code> to retrieve.
     * @return A <code>XSObject</code> (of any type) with the specified local
     *   name and namespace URI, or <code>null</code> if they do not
     *   identify any <code>XSObject</code> in this map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMap4Types.java
    public synchronized int getLength() {

    /**
     * The number of <code>XSObjects</code> in the <code>XSObjectList</code>. The
     * range of valid child node indices is 0 to <code>length-1</code>
     * inclusive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMap4Types.java
    public XSNamedMap4Types(String[] namespaces, SymbolHash[] maps, int num, short type) {

    /**
     * Construct an XSNamedMap implementation for a list of namespaces
     *
     * @param namespaces the namespaces to which the components belong
     * @param maps       the maps from local names to components
     * @param num        the number of namespaces
     * @param type      the type of components
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMap4Types.java
    public XSNamedMap4Types(String namespace, SymbolHash map, short type) {

    /**
     * Construct an XSNamedMap implementation for one namespace
     *
     * @param namespace the namespace to which the components belong
     * @param map       the map from local names to components
     * @param type      the type of components
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMap4Types.java
public final class XSNamedMap4Types extends XSNamedMapImpl {

/**
 * Containts the map between qnames and XSObject's.
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 *
 * @version $Id: XSNamedMap4Types.java,v 1.7 2010-11-01 04:40:06 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMap4Types.java
    public synchronized XSObject item(int index) {

    /**
     * Returns the <code>index</code>th item in the map. The index starts at
     * 0. If <code>index</code> is greater than or equal to the number of
     * nodes in the list, this returns <code>null</code>.
     * @param index The position in the map from which the item is to be
     *   retrieved.
     * @return The <code>XSObject</code> at the <code>index</code>th position
     *   in the <code>XSNamedMap</code>, or <code>null</code> if that is
     *   not a valid index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMap4Types.java
    public XSObject itemByName(String namespace, String localName) {

    /**
     * Retrieves an <code>XSObject</code> specified by local name and namespace
     * URI.
     * @param namespace The namespace URI of the <code>XSObject</code> to
     *   retrieve.
     * @param localName The local name of the <code>XSObject</code> to retrieve.
     * @return A <code>XSObject</code> (of any type) with the specified local
     *   name and namespace URI, or <code>null</code> if they do not
     *   identify any <code>XSObject</code> in this map.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMap4Types.java
    public synchronized int getLength() {

    /**
     * The number of <code>XSObjects</code> in the <code>XSObjectList</code>. The
     * range of valid child node indices is 0 to <code>length-1</code>
     * inclusive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMap4Types.java
    public XSNamedMap4Types(String[] namespaces, SymbolHash[] maps, int num, short type) {

    /**
     * Construct an XSNamedMap implementation for a list of namespaces
     *
     * @param namespaces the namespaces to which the components belong
     * @param maps       the maps from local names to components
     * @param num        the number of namespaces
     * @param type      the type of components
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMap4Types.java
    public XSNamedMap4Types(String namespace, SymbolHash map, short type) {

    /**
     * Construct an XSNamedMap implementation for one namespace
     *
     * @param namespace the namespace to which the components belong
     * @param map       the map from local names to components
     * @param type      the type of components
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSNamedMap4Types.java
public final class XSNamedMap4Types extends XSNamedMapImpl {

/**
 * Containts the map between qnames and XSObject's.
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 *
 * @version $Id: XSNamedMap4Types.java,v 1.7 2010-11-01 04:40:06 joehw Exp $
 */
