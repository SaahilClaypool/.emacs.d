_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/encoding/OutputObject.java
public interface OutputObject

/**
 * <p> An <code>OutputObject</code> is the interface used by the
 * presentation block to give programming language typed data to
 * the encoding block to be encoded and sent in a message. </p>
 *
 * <p> The implementation of an <code>OutputObject</code> contains the
 * encoded data.  When the presentation block gives programming language
 * typed data to
 * <code>OutputObject</code>, the
 * implementation of <code>OutputObject</code> is responsible for converting
 * that data to the encoded representation of the data for a particular
 * encoding.</p>
 *
 * <p>A particular <em>encoding</em> would subclass
 * <code>OutputObject</code>.  The subclass would provide methods to set
 * the data types appropriate to the presentation block (e.g., simple
 * types such as int or boolean, all the way to any type derived from
 * <code>java.io.Serializable</code>.).</p>
 *
 * <p>Note: the protocol block may also use the <code>OutputObject</code> to
 * set header metadata.</p>
 *
 * @author Harold Carr
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/encoding/OutputObject.java
public interface OutputObject

/**
 * <p> An <code>OutputObject</code> is the interface used by the
 * presentation block to give programming language typed data to
 * the encoding block to be encoded and sent in a message. </p>
 *
 * <p> The implementation of an <code>OutputObject</code> contains the
 * encoded data.  When the presentation block gives programming language
 * typed data to
 * <code>OutputObject</code>, the
 * implementation of <code>OutputObject</code> is responsible for converting
 * that data to the encoded representation of the data for a particular
 * encoding.</p>
 *
 * <p>A particular <em>encoding</em> would subclass
 * <code>OutputObject</code>.  The subclass would provide methods to set
 * the data types appropriate to the presentation block (e.g., simple
 * types such as int or boolean, all the way to any type derived from
 * <code>java.io.Serializable</code>.).</p>
 *
 * <p>Note: the protocol block may also use the <code>OutputObject</code> to
 * set header metadata.</p>
 *
 * @author Harold Carr
*/
