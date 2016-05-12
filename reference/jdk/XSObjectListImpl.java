_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSObjectListImpl.java
    public XSObject item(int index) {

    /**
     * Returns the <code>index</code>th item in the collection. The index
     * starts at 0. If <code>index</code> is greater than or equal to the
     * number of nodes in the list, this returns <code>null</code>.
     * @param index index into the collection.
     * @return The XSObject at the <code>index</code>th position in the
     *   <code>XSObjectList</code>, or <code>null</code> if that is not a
     *   valid index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSObjectListImpl.java
    public int getLength() {

    /**
     * The number of <code>XSObjects</code> in the list. The range of valid
     * child node indices is 0 to <code>length-1</code> inclusive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSObjectListImpl.java
    public XSObjectListImpl(XSObject[] array, int length) {

    /**
     * Construct an XSObjectList implementation
     *
     * @param array     the data array
     * @param length    the number of elements
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSObjectListImpl.java
    public static final XSObjectListImpl EMPTY_LIST = new XSObjectListImpl(new XSObject[0], 0);

    /**
     * An immutable empty list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSObjectListImpl.java
public class XSObjectListImpl extends AbstractList implements XSObjectList {

/**
 * Containts a list of XSObject's.
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 *
 * @version $Id: XSObjectListImpl.java,v 1.7 2010-11-01 04:40:06 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSObjectListImpl.java
    public XSObject item(int index) {

    /**
     * Returns the <code>index</code>th item in the collection. The index
     * starts at 0. If <code>index</code> is greater than or equal to the
     * number of nodes in the list, this returns <code>null</code>.
     * @param index index into the collection.
     * @return The XSObject at the <code>index</code>th position in the
     *   <code>XSObjectList</code>, or <code>null</code> if that is not a
     *   valid index.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSObjectListImpl.java
    public int getLength() {

    /**
     * The number of <code>XSObjects</code> in the list. The range of valid
     * child node indices is 0 to <code>length-1</code> inclusive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSObjectListImpl.java
    public XSObjectListImpl(XSObject[] array, int length) {

    /**
     * Construct an XSObjectList implementation
     *
     * @param array     the data array
     * @param length    the number of elements
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSObjectListImpl.java
    public static final XSObjectListImpl EMPTY_LIST = new XSObjectListImpl(new XSObject[0], 0);

    /**
     * An immutable empty list.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/util/XSObjectListImpl.java
public class XSObjectListImpl extends AbstractList implements XSObjectList {

/**
 * Containts a list of XSObject's.
 *
 * @xerces.internal
 *
 * @author Sandy Gao, IBM
 *
 * @version $Id: XSObjectListImpl.java,v 1.7 2010-11-01 04:40:06 joehw Exp $
 */
