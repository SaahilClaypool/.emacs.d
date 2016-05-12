_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/ByteList.java
    public byte item(int index) throws XSException;

    /**
     * Returns the <code>index</code>th item in the collection. The index
     * starts at 0.
     * @param index  index into the collection.
     * @return  The <code>byte</code> at the <code>index</code>th
     *   position in the <code>ByteList</code>.
     * @exception XSException
     *   INDEX_SIZE_ERR: if <code>index</code> is greater than or equal to the
     *   number of objects in the list or less than zero.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/ByteList.java
    public boolean contains(byte item);

    /**
     * Checks if the <code>byte</code> <code>item</code> is a
     * member of this list.
     * @param item  <code>byte</code> whose presence in this list
     *   is to be tested.
     * @return  True if this list contains the <code>byte</code>
     *   <code>item</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/ByteList.java
    public int getLength();

    /**
     * The number of <code>byte</code>s in the list. The range of
     * valid child object indices is 0 to <code>length-1</code> inclusive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/ByteList.java
public interface ByteList extends List {

/**
 * <p>The <code>ByteList</code> is an immutable ordered collection of
 * <code>byte</code>.</p>
 *
 * @author Ankit Pasricha, IBM
 *
 * @version $Id: ByteList.java,v 1.7 2010-11-01 04:40:31 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/ByteList.java
    public byte item(int index) throws XSException;

    /**
     * Returns the <code>index</code>th item in the collection. The index
     * starts at 0.
     * @param index  index into the collection.
     * @return  The <code>byte</code> at the <code>index</code>th
     *   position in the <code>ByteList</code>.
     * @exception XSException
     *   INDEX_SIZE_ERR: if <code>index</code> is greater than or equal to the
     *   number of objects in the list or less than zero.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/ByteList.java
    public boolean contains(byte item);

    /**
     * Checks if the <code>byte</code> <code>item</code> is a
     * member of this list.
     * @param item  <code>byte</code> whose presence in this list
     *   is to be tested.
     * @return  True if this list contains the <code>byte</code>
     *   <code>item</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/ByteList.java
    public int getLength();

    /**
     * The number of <code>byte</code>s in the list. The range of
     * valid child object indices is 0 to <code>length-1</code> inclusive.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/xs/datatypes/ByteList.java
public interface ByteList extends List {

/**
 * <p>The <code>ByteList</code> is an immutable ordered collection of
 * <code>byte</code>.</p>
 *
 * @author Ankit Pasricha, IBM
 *
 * @version $Id: ByteList.java,v 1.7 2010-11-01 04:40:31 joehw Exp $
 */
