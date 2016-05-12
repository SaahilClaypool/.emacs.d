_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
  public void getChars(int srcBegin, int srcEnd, char dst[], int dstBegin)

  /**
   * Copies characters from this string into the destination character
   * array.
   *
   * @param      srcBegin   index of the first character in the string
   *                        to copy.
   * @param      srcEnd     index after the last character in the string
   *                        to copy.
   * @param      dst        the destination array.
   * @param      dstBegin   the start offset in the destination array.
   * @exception IndexOutOfBoundsException If any of the following
   *            is true:
   *            <ul><li><code>srcBegin</code> is negative.
   *            <li><code>srcBegin</code> is greater than <code>srcEnd</code>
   *            <li><code>srcEnd</code> is greater than the length of this
   *                string
   *            <li><code>dstBegin</code> is negative
   *            <li><code>dstBegin+(srcEnd-srcBegin)</code> is larger than
   *                <code>dst.length</code></ul>
   * @exception NullPointerException if <code>dst</code> is <code>null</code>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
  public char charAt(int index)

  /**
   * Returns the character at the specified index. An index ranges
   * from <code>0</code> to <code>length() - 1</code>. The first character
   * of the sequence is at index <code>0</code>, the next at index
   * <code>1</code>, and so on, as for array indexing.
   *
   * @param      index   the index of the character.
   * @return     the character at the specified index of this string.
   *             The first character is at index <code>0</code>.
   * @exception  IndexOutOfBoundsException  if the <code>index</code>
   *             argument is negative or not less than the length of this
   *             string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
  public int length()

  /**
   * Returns the length of this string.
   *
   * @return  the length of the sequence of characters represented by this
   *          object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
  public void dispatchAsComment(org.xml.sax.ext.LexicalHandler lh)

  /**
   * Directly call the
   * comment method on the passed LexicalHandler for the
   * string-value.
   *
   * @param lh A non-null reference to a LexicalHandler.
   *
   * @throws org.xml.sax.SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
  public void dispatchCharactersEvents(org.xml.sax.ContentHandler ch)

  /**
   * Directly call the
   * characters method on the passed ContentHandler for the
   * string-value. Multiple calls to the
   * ContentHandler's characters methods may well occur for a single call to
   * this method.
   *
   * @param ch A non-null reference to a ContentHandler.
   *
   * @throws org.xml.sax.SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
  public Object object()

  /**
   * Since this object is incomplete without the length and the offset, we
   * have to convert to a string when this function is called.
   *
   * @return The java String representation of this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
  public String str()

  /**
   * Cast result object to a string.
   *
   * @return The string this wraps or the empty string if null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
  public boolean hasString()

  /**
   * Tell if this object contains a java String object.
   *
   * @return true if this XMLString can return a string without creating one.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
  public void appendToFsb(com.sun.org.apache.xml.internal.utils.FastStringBuffer fsb)

  /**
   * Cast result object to a string.
   *
   * @return The string this wraps or the empty string if null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
  public FastStringBuffer fsb()

  /**
   * Cast result object to a string.
   *
   * @return The string this wraps or the empty string if null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
  private XStringForChars(String val)

  /**
   * Construct a XNodeSet object.
   *
   * @param val String object this will wrap.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
  public XStringForChars(char[] val, int start, int length)

  /**
   * Construct a XNodeSet object.
   *
   * @param val FastStringBuffer object this will wrap, must be non-null.
   * @param start The start position in the array.
   * @param length The number of characters to read from the array.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
  int m_length;

  /** The length of the string. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
  int m_start;

  /** The start position in the fsb. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
public class XStringForChars extends XString

/**
 * This class will wrap a FastStringBuffer and allow for
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
  public void getChars(int srcBegin, int srcEnd, char dst[], int dstBegin)

  /**
   * Copies characters from this string into the destination character
   * array.
   *
   * @param      srcBegin   index of the first character in the string
   *                        to copy.
   * @param      srcEnd     index after the last character in the string
   *                        to copy.
   * @param      dst        the destination array.
   * @param      dstBegin   the start offset in the destination array.
   * @exception IndexOutOfBoundsException If any of the following
   *            is true:
   *            <ul><li><code>srcBegin</code> is negative.
   *            <li><code>srcBegin</code> is greater than <code>srcEnd</code>
   *            <li><code>srcEnd</code> is greater than the length of this
   *                string
   *            <li><code>dstBegin</code> is negative
   *            <li><code>dstBegin+(srcEnd-srcBegin)</code> is larger than
   *                <code>dst.length</code></ul>
   * @exception NullPointerException if <code>dst</code> is <code>null</code>
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
  public char charAt(int index)

  /**
   * Returns the character at the specified index. An index ranges
   * from <code>0</code> to <code>length() - 1</code>. The first character
   * of the sequence is at index <code>0</code>, the next at index
   * <code>1</code>, and so on, as for array indexing.
   *
   * @param      index   the index of the character.
   * @return     the character at the specified index of this string.
   *             The first character is at index <code>0</code>.
   * @exception  IndexOutOfBoundsException  if the <code>index</code>
   *             argument is negative or not less than the length of this
   *             string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
  public int length()

  /**
   * Returns the length of this string.
   *
   * @return  the length of the sequence of characters represented by this
   *          object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
  public void dispatchAsComment(org.xml.sax.ext.LexicalHandler lh)

  /**
   * Directly call the
   * comment method on the passed LexicalHandler for the
   * string-value.
   *
   * @param lh A non-null reference to a LexicalHandler.
   *
   * @throws org.xml.sax.SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
  public void dispatchCharactersEvents(org.xml.sax.ContentHandler ch)

  /**
   * Directly call the
   * characters method on the passed ContentHandler for the
   * string-value. Multiple calls to the
   * ContentHandler's characters methods may well occur for a single call to
   * this method.
   *
   * @param ch A non-null reference to a ContentHandler.
   *
   * @throws org.xml.sax.SAXException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
  public Object object()

  /**
   * Since this object is incomplete without the length and the offset, we
   * have to convert to a string when this function is called.
   *
   * @return The java String representation of this object.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
  public String str()

  /**
   * Cast result object to a string.
   *
   * @return The string this wraps or the empty string if null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
  public boolean hasString()

  /**
   * Tell if this object contains a java String object.
   *
   * @return true if this XMLString can return a string without creating one.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
  public void appendToFsb(com.sun.org.apache.xml.internal.utils.FastStringBuffer fsb)

  /**
   * Cast result object to a string.
   *
   * @return The string this wraps or the empty string if null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
  public FastStringBuffer fsb()

  /**
   * Cast result object to a string.
   *
   * @return The string this wraps or the empty string if null
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
  private XStringForChars(String val)

  /**
   * Construct a XNodeSet object.
   *
   * @param val String object this will wrap.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
  public XStringForChars(char[] val, int start, int length)

  /**
   * Construct a XNodeSet object.
   *
   * @param val FastStringBuffer object this will wrap, must be non-null.
   * @param start The start position in the array.
   * @param length The number of characters to read from the array.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
  int m_length;

  /** The length of the string. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
  int m_start;

  /** The start position in the fsb. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/objects/XStringForChars.java
public class XStringForChars extends XString

/**
 * This class will wrap a FastStringBuffer and allow for
 */
