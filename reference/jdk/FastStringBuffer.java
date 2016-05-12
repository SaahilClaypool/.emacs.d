_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  private FastStringBuffer(FastStringBuffer source)

  /**
   * Encapsulation c'tor. After this is called, the source FastStringBuffer
   * will be reset to use the new object as its m_innerFSB, and will have
   * had its chunk size reset appropriately. IT SHOULD NEVER BE CALLED
   * EXCEPT WHEN source.length()==1<<(source.m_chunkBits+source.m_rebundleBits)
   *
   * NEEDSDOC @param source
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  private void getChars(int srcBegin, int srcEnd, char dst[], int dstBegin)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public void sendSAXComment(
          org.xml.sax.ext.LexicalHandler ch, int start, int length)

        /**
   * Sends the specified range of characters as sax Comment.
   * <p>
   * Note that, unlike sendSAXcharacters, this has to be done as a single
   * call to LexicalHandler#comment.
   *
   * @param ch SAX LexicalHandler object to receive the event.
   * @param start Offset of first character in the range.
   * @param length Number of characters to send.
   * @exception org.xml.sax.SAXException may be thrown by handler's
   * characters() method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public static void sendNormalizedSAXcharacters(char ch[],
             int start, int length,
             org.xml.sax.ContentHandler handler)

  /**
   * Directly normalize and dispatch the character array.
   *
   * @param ch The characters from the XML document.
   * @param start The start position in the array.
   * @param length The number of characters to read from the array.
   * @param handler SAX ContentHandler object to receive the event.
   * @exception org.xml.sax.SAXException Any SAX exception, possibly
   *            wrapping another exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  static int sendNormalizedSAXcharacters(char ch[],
             int start, int length,
             org.xml.sax.ContentHandler handler,
                                                 int edgeTreatmentFlags)

  /**
   * Internal method to directly normalize and dispatch the character array.
   * This version is aware of the fact that it may be called several times
   * in succession if the data is made up of multiple "chunks", and thus
   * must actively manage the handling of leading and trailing whitespace.
   *
   * Note: The recursion is due to the possible recursion of inner FSBs.
   *
   * @param ch The characters from the XML document.
   * @param start The start position in the array.
   * @param length The number of characters to read from the array.
   * @param handler SAX ContentHandler object to receive the event.
   * @param edgeTreatmentFlags How leading/trailing spaces should be handled.
   * This is a bitfield contining two flags, bitwise-ORed together:
   * <dl>
   * <dt>SUPPRESS_LEADING_WS</dt>
   * <dd>When false, causes leading whitespace to be converted to a single
   * space; when true, causes it to be discarded entirely.
   * Should be set TRUE for the first chunk, and (in multi-chunk output)
   * whenever the previous chunk ended in retained whitespace.</dd>
   * <dt>SUPPRESS_TRAILING_WS</dt>
   * <dd>When false, causes trailing whitespace to be converted to a single
   * space; when true, causes it to be discarded entirely.
   * Should be set TRUE for the last or only chunk.
   * </dd>
   * </dl>
   * @return normalization status, as in the edgeTreatmentFlags parameter:
   * <dl>
   * <dt>0</dt>
   * <dd>if this output did not end in retained whitespace, and thus whitespace
   * at the start of the following chunk (if any) should be converted to a
   * single space.
   * <dt>SUPPRESS_LEADING_WS</dt>
   * <dd>if this output ended in retained whitespace, and thus whitespace
   * at the start of the following chunk (if any) should be completely
   * suppressed.</dd>
   * </dd>
   * </dl>
   *
   *
   * @exception org.xml.sax.SAXException Any SAX exception, possibly
   *            wrapping another exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public int sendNormalizedSAXcharacters(
          org.xml.sax.ContentHandler ch, int start, int length)

  /**
   * Sends the specified range of characters as one or more SAX characters()
   * events, normalizing the characters according to XSLT rules.
   *
   * @param ch SAX ContentHandler object to receive the event.
   * @param start Offset of first character in the range.
   * @param length Number of characters to send.
   * @return normalization status to apply to next chunk (because we may
   * have been called recursively to process an inner FSB):
   * <dl>
   * <dt>0</dt>
   * <dd>if this output did not end in retained whitespace, and thus whitespace
   * at the start of the following chunk (if any) should be converted to a
   * single space.
   * <dt>SUPPRESS_LEADING_WS</dt>
   * <dd>if this output ended in retained whitespace, and thus whitespace
   * at the start of the following chunk (if any) should be completely
   * suppressed.</dd>
   * </dd>
   * </dl>
   * @exception org.xml.sax.SAXException may be thrown by handler's
   * characters() method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public void sendSAXcharacters(
          org.xml.sax.ContentHandler ch, int start, int length)

  /**
   * Sends the specified range of characters as one or more SAX characters()
   * events.
   * Note that the buffer reference passed to the ContentHandler may be
   * invalidated if the FastStringBuffer is edited; it's the user's
   * responsibility to manage access to the FastStringBuffer to prevent this
   * problem from arising.
   * <p>
   * Note too that there is no promise that the output will be sent as a
   * single call. As is always true in SAX, one logical string may be split
   * across multiple blocks of memory and hence delivered as several
   * successive events.
   *
   * @param ch SAX ContentHandler object to receive the event.
   * @param start Offset of first character in the range.
   * @param length Number of characters to send.
   * @exception org.xml.sax.SAXException may be thrown by handler's
   * characters() method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public char charAt(int pos)

  /**
   * Get a single character from the string buffer.
   *
   *
   * @param pos character position requested.
   * @return A character from the requested position.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  StringBuffer getString(StringBuffer sb, int startChunk, int startColumn,
                         int length)

  /**
   * Internal support for toString() and getString().
   * PLEASE NOTE SIGNATURE CHANGE from earlier versions; it now appends into
   * and returns a StringBuffer supplied by the caller. This simplifies
   * m_innerFSB support.
   * <p>
   * Note that this operation has been somewhat deoptimized by the shift to a
   * chunked array, as there is no factory method to produce a String object
   * directly from an array of arrays and hence a double copy is needed.
   * By presetting length we hope to minimize the heap overhead of building
   * the intermediate StringBuffer.
   * <p>
   * (It really is a pity that Java didn't design String as a final subclass
   * of MutableString, rather than having StringBuffer be a separate hierarchy.
   * We'd avoid a <strong>lot</strong> of double-buffering.)
   *
   *
   * @param sb
   * @param startChunk
   * @param startColumn
   * @param length
   *
   * @return the contents of the FastStringBuffer as a standard Java string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  StringBuffer getString(StringBuffer sb, int start, int length)

  /**
   * @param sb StringBuffer to be appended to
   * @param start Offset of first character in the range.
   * @param length Number of characters to send.
   * @return sb with the requested text appended to it
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public String getString(int start, int length)

  /**
   * @param start Offset of first character in the range.
   * @param length Number of characters to send.
   * @return a new String object initialized from the specified range of
   * characters.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public boolean isWhitespace(int start, int length)

  /**
   * @return true if the specified range of characters are all whitespace,
   * as defined by XMLCharacterRecognizer.
   * <p>
   * CURRENTLY DOES NOT CHECK FOR OUT-OF-RANGE.
   *
   * @param start Offset of first character in the range.
   * @param length Number of characters to send.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public final void append(FastStringBuffer value)

  /**
   * Append the contents of another FastStringBuffer onto
   * this FastStringBuffer, growing the storage if necessary.
   * <p>
   * NOTE THAT after calling append(), previously obtained
   * references to m_array[] may no longer be valid.
   *
   * @param value FastStringBuffer whose contents are
   * to be appended.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public final void append(char[] chars, int start, int length)

  /**
   * Append part of the contents of a Character Array onto the
   * FastStringBuffer,  growing the storage if necessary.
   * <p>
   * NOTE THAT after calling append(), previously obtained
   * references to m_array[] may no longer be valid.
   *
   * @param chars character array from which data is to be copied
   * @param start offset in chars of first character to be copied,
   * zero-based.
   * @param length number of characters to be copied
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public final void append(StringBuffer value)

  /**
   * Append the contents of a StringBuffer onto the FastStringBuffer,
   * growing the storage if necessary.
   * <p>
   * NOTE THAT after calling append(), previously obtained
   * references to m_array[] may no longer be valid.
   *
   * @param value StringBuffer whose contents are to be appended.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public final void append(String value)

  /**
   * Append the contents of a String onto the FastStringBuffer,
   * growing the storage if necessary.
   * <p>
   * NOTE THAT after calling append(), previously obtained
   * references to m_array[] may no longer be valid.
   *
   * @param value String whose contents are to be appended.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public final void append(char value)

  /**
   * Append a single character onto the FastStringBuffer, growing the
   * storage if necessary.
   * <p>
   * NOTE THAT after calling append(), previously obtained
   * references to m_array[][] may no longer be valid....
   * though in fact they should be in this instance.
   *
   * @param value character to be appended.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public final String toString()

  /**
   * Note that this operation has been somewhat deoptimized by the shift to a
   * chunked array, as there is no factory method to produce a String object
   * directly from an array of arrays and hence a double copy is needed.
   * By using ensureCapacity we hope to minimize the heap overhead of building
   * the intermediate StringBuffer.
   * <p>
   * (It really is a pity that Java didn't design String as a final subclass
   * of MutableString, rather than having StringBuffer be a separate hierarchy.
   * We'd avoid a <strong>lot</strong> of double-buffering.)
   *
   * @return the contents of the FastStringBuffer as a standard Java string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  private final void setLength(int l, FastStringBuffer rootFSB)

  /**
   * Subroutine for the public setLength() method. Deals with the fact
   * that truncation may require restoring one of the innerFSBs
   *
   * NEEDSDOC @param l
   * NEEDSDOC @param rootFSB
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public final void setLength(int l)

  /**
   * Directly set how much of the FastStringBuffer's storage is to be
   * considered part of its content. This is a fast but hazardous
   * operation. It is not protected against negative values, or values
   * greater than the amount of storage currently available... and even
   * if additional storage does exist, its contents are unpredictable.
   * The only safe use for our setLength() is to truncate the FastStringBuffer
   * to a shorter string.
   *
   * @param l New length. If l<0 or l>=getLength(), this operation will
   * not report an error but future operations will almost certainly fail.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public final void reset()

  /**
   * Discard the content of the FastStringBuffer, and most of the memory
   * that was allocated by it, restoring the initial state. Note that this
   * may eventually be different from setLength(0), which see.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public final int length()

  /**
   * Get the length of the list. Synonym for size().
   *
   * @return the number of characters in the FastStringBuffer's content.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public final int size()

  /**
   * Get the length of the list. Synonym for length().
   *
   * @return the number of characters in the FastStringBuffer's content.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public FastStringBuffer()

  /**
   * Construct a FastStringBuffer, using a default allocation policy.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public FastStringBuffer(int initChunkBits)

  /**
   * Construct a FastStringBuffer, using default maxChunkBits and
   * rebundleBits values.
   * <p>
   * ISSUE: Should this call assert initial size, or fixed size?
   * Now configured as initial, with a default for fixed.
   *
   * NEEDSDOC @param initChunkBits
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public FastStringBuffer(int initChunkBits, int maxChunkBits)

  /**
   * Construct a FastStringBuffer, using a default rebundleBits value.
   *
   * NEEDSDOC @param initChunkBits
   * NEEDSDOC @param maxChunkBits
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public FastStringBuffer(int initChunkBits, int maxChunkBits,
                          int rebundleBits)

  /**
   * Construct a FastStringBuffer, with allocation policy as per parameters.
   * <p>
   * For coding convenience, I've expressed both allocation sizes in terms of
   * a number of bits. That's needed for the final size of a chunk,
   * to permit fast and efficient shift-and-mask addressing. It's less critical
   * for the inital size, and may be reconsidered.
   * <p>
   * An alternative would be to accept integer sizes and round to powers of two;
   * that really doesn't seem to buy us much, if anything.
   *
   * @param initChunkBits Length in characters of the initial allocation
   * of a chunk, expressed in log-base-2. (That is, 10 means allocate 1024
   * characters.) Later chunks will use larger allocation units, to trade off
   * allocation speed of large document against storage efficiency of small
   * ones.
   * @param maxChunkBits Number of character-offset bits that should be used for
   * addressing within a chunk. Maximum length of a chunk is 2^chunkBits
   * characters.
   * @param rebundleBits Number of character-offset bits that addressing should
   * advance before we attempt to take a step from initChunkBits to maxChunkBits
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  FastStringBuffer m_innerFSB = null;

  /**
   * Field m_innerFSB, when non-null, is a FastStringBuffer whose total
   * length equals m_chunkSize, and which replaces m_array[0]. This allows
   * building a hierarchy of FastStringBuffers, where early appends use
   * a smaller chunkSize (for less wasted memory overhead) but later
   * ones use a larger chunkSize (for less heap activity overhead).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  int m_firstFree = 0;

  /**
   * Field m_firstFree is an index into m_array[m_lastChunk][], pointing to
   * the first character in the Chunked Array which is not part of the
   * FastStringBuffer's current content. Since m_array[][] is zero-based,
   * the length of that content can be calculated as
   * (m_lastChunk<<m_chunkBits) + m_firstFree
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  int m_lastChunk = 0;

  /**
   * Field m_lastChunk is an index into m_array[], pointing to the last
   * chunk of the Chunked Array currently in use. Note that additional
   * chunks may actually be allocated, eg if the FastStringBuffer had
   * previously been truncated or if someone issued an ensureSpace request.
   * <p>
   * The insertion point for append operations is addressed by the combination
   * of m_lastChunk and m_firstFree.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  char[][] m_array;

  /**
   * Field m_array holds the string buffer's text contents, using an
   * array-of-arrays. Note that this array, and the arrays it contains, may be
   * reallocated when necessary in order to allow the buffer to grow;
   * references to them should be considered to be invalidated after any
   * append. However, the only time these arrays are directly exposed
   * is in the sendSAXcharacters call.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  int m_chunkMask;  // =m_chunkSize-1;

  /**
   * Field m_chunkMask is m_chunkSize-1 -- in other words, m_chunkBits
   * worth of low-order '1' bits, useful for shift-and-mask addressing
   * within the chunks.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  int m_chunkSize;  // =1<<(m_chunkBits-1);

  /**
   * Field m_chunkSize establishes the maximum size of one chunk of the array
   * as 2**chunkbits characters.
   * (Which may also be the minimum size if we aren't tuning for storage)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  int m_rebundleBits = 2;

  /**
   * Field m_rechunkBits affects our chunk-growth strategy, by saying how
   * many chunks should be allocated at one size before we encapsulate them
   * into the first chunk of the next size up. For example, if m_rechunkBits
   * is set to 3, then after 8 chunks at a given size we will rebundle
   * them as the first element of a FastStringBuffer using a chunk size
   * 8 times larger (chunkBits shifted left three bits).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  int m_maxChunkBits = 15;

  /**
   * Field m_maxChunkBits affects our chunk-growth strategy, by saying what
   * the largest permissible chunk size is in this particular FastStringBuffer
   * hierarchy.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  int m_chunkBits = 15;

        /**
   * Field m_chunkBits sets our chunking strategy, by saying how many
   * bits of index can be used within a single chunk before flowing over
   * to the next chunk. For example, if m_chunkbits is set to 15, each
   * chunk can contain up to 2^15 (32K) characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
        private static final int CARRY_WS=0x04;

        /** Manifest constant: Carry trailing whitespace of one chunk as leading
         * whitespace of the next chunk. Used internally; I don't see any reason
         * to make it public right now.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
        public static final int SUPPRESS_BOTH

        /** Manifest constant: Suppress both leading and trailing whitespace.
         * This should be used when normalize-to-SAX is called for a complete string.
         * (I'm not wild about the name of this one. Ideas welcome.)
         * @see #sendNormalizedSAXcharacters(org.xml.sax.ContentHandler,int,int)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
        public static final int SUPPRESS_TRAILING_WS=0x02;

        /** Manifest constant: Suppress trailing whitespace.
         * This should be used when normalize-to-SAX is called for the last chunk of a
         * multi-chunk output; it may have to be or'ed with SUPPRESS_LEADING_WS.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
        public static final int SUPPRESS_LEADING_WS=0x01;

        /** Manifest constant: Suppress leading whitespace.
         * This should be used when normalize-to-SAX is called for the first chunk of a
         * multi-chunk output, or one following unsuppressed whitespace in a previous
         * chunk.
         * @see #sendNormalizedSAXcharacters(org.xml.sax.ContentHandler,int,int)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
        // %BUG% %REVIEW% *****PROBLEM SUSPECTED: If data from an FSB is being copied

  /**/static final int DEBUG_FORCE_INIT_BITS=0;
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
public class FastStringBuffer

/**
 * Bare-bones, unsafe, fast string buffer. No thread-safety, no
 * parameter range checking, exposed fields. Note that in typical
 * applications, thread-safety of a StringBuffer is a somewhat
 * dubious concept in any case.
 * <p>
 * Note that Stree and DTM used a single FastStringBuffer as a string pool,
 * by recording start and length indices within this single buffer. This
 * minimizes heap overhead, but of course requires more work when retrieving
 * the data.
 * <p>
 * FastStringBuffer operates as a "chunked buffer". Doing so
 * reduces the need to recopy existing information when an append
 * exceeds the space available; we just allocate another chunk and
 * flow across to it. (The array of chunks may need to grow,
 * admittedly, but that's a much smaller object.) Some excess
 * recopying may arise when we extract Strings which cross chunk
 * boundaries; larger chunks make that less frequent.
 * <p>
 * The size values are parameterized, to allow tuning this code. In
 * theory, Result Tree Fragments might want to be tuned differently
 * from the main document's text.
 * <p>
 * %REVIEW% An experiment in self-tuning is
 * included in the code (using nested FastStringBuffers to achieve
 * variation in chunk sizes), but this implementation has proven to
 * be problematic when data may be being copied from the FSB into itself.
 * We should either re-architect that to make this safe (if possible)
 * or remove that code and clean up for performance/maintainability reasons.
 * <p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  private FastStringBuffer(FastStringBuffer source)

  /**
   * Encapsulation c'tor. After this is called, the source FastStringBuffer
   * will be reset to use the new object as its m_innerFSB, and will have
   * had its chunk size reset appropriately. IT SHOULD NEVER BE CALLED
   * EXCEPT WHEN source.length()==1<<(source.m_chunkBits+source.m_rebundleBits)
   *
   * NEEDSDOC @param source
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  private void getChars(int srcBegin, int srcEnd, char dst[], int dstBegin)

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
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public void sendSAXComment(
          org.xml.sax.ext.LexicalHandler ch, int start, int length)

        /**
   * Sends the specified range of characters as sax Comment.
   * <p>
   * Note that, unlike sendSAXcharacters, this has to be done as a single
   * call to LexicalHandler#comment.
   *
   * @param ch SAX LexicalHandler object to receive the event.
   * @param start Offset of first character in the range.
   * @param length Number of characters to send.
   * @exception org.xml.sax.SAXException may be thrown by handler's
   * characters() method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public static void sendNormalizedSAXcharacters(char ch[],
             int start, int length,
             org.xml.sax.ContentHandler handler)

  /**
   * Directly normalize and dispatch the character array.
   *
   * @param ch The characters from the XML document.
   * @param start The start position in the array.
   * @param length The number of characters to read from the array.
   * @param handler SAX ContentHandler object to receive the event.
   * @exception org.xml.sax.SAXException Any SAX exception, possibly
   *            wrapping another exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  static int sendNormalizedSAXcharacters(char ch[],
             int start, int length,
             org.xml.sax.ContentHandler handler,
                                                 int edgeTreatmentFlags)

  /**
   * Internal method to directly normalize and dispatch the character array.
   * This version is aware of the fact that it may be called several times
   * in succession if the data is made up of multiple "chunks", and thus
   * must actively manage the handling of leading and trailing whitespace.
   *
   * Note: The recursion is due to the possible recursion of inner FSBs.
   *
   * @param ch The characters from the XML document.
   * @param start The start position in the array.
   * @param length The number of characters to read from the array.
   * @param handler SAX ContentHandler object to receive the event.
   * @param edgeTreatmentFlags How leading/trailing spaces should be handled.
   * This is a bitfield contining two flags, bitwise-ORed together:
   * <dl>
   * <dt>SUPPRESS_LEADING_WS</dt>
   * <dd>When false, causes leading whitespace to be converted to a single
   * space; when true, causes it to be discarded entirely.
   * Should be set TRUE for the first chunk, and (in multi-chunk output)
   * whenever the previous chunk ended in retained whitespace.</dd>
   * <dt>SUPPRESS_TRAILING_WS</dt>
   * <dd>When false, causes trailing whitespace to be converted to a single
   * space; when true, causes it to be discarded entirely.
   * Should be set TRUE for the last or only chunk.
   * </dd>
   * </dl>
   * @return normalization status, as in the edgeTreatmentFlags parameter:
   * <dl>
   * <dt>0</dt>
   * <dd>if this output did not end in retained whitespace, and thus whitespace
   * at the start of the following chunk (if any) should be converted to a
   * single space.
   * <dt>SUPPRESS_LEADING_WS</dt>
   * <dd>if this output ended in retained whitespace, and thus whitespace
   * at the start of the following chunk (if any) should be completely
   * suppressed.</dd>
   * </dd>
   * </dl>
   *
   *
   * @exception org.xml.sax.SAXException Any SAX exception, possibly
   *            wrapping another exception.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public int sendNormalizedSAXcharacters(
          org.xml.sax.ContentHandler ch, int start, int length)

  /**
   * Sends the specified range of characters as one or more SAX characters()
   * events, normalizing the characters according to XSLT rules.
   *
   * @param ch SAX ContentHandler object to receive the event.
   * @param start Offset of first character in the range.
   * @param length Number of characters to send.
   * @return normalization status to apply to next chunk (because we may
   * have been called recursively to process an inner FSB):
   * <dl>
   * <dt>0</dt>
   * <dd>if this output did not end in retained whitespace, and thus whitespace
   * at the start of the following chunk (if any) should be converted to a
   * single space.
   * <dt>SUPPRESS_LEADING_WS</dt>
   * <dd>if this output ended in retained whitespace, and thus whitespace
   * at the start of the following chunk (if any) should be completely
   * suppressed.</dd>
   * </dd>
   * </dl>
   * @exception org.xml.sax.SAXException may be thrown by handler's
   * characters() method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public void sendSAXcharacters(
          org.xml.sax.ContentHandler ch, int start, int length)

  /**
   * Sends the specified range of characters as one or more SAX characters()
   * events.
   * Note that the buffer reference passed to the ContentHandler may be
   * invalidated if the FastStringBuffer is edited; it's the user's
   * responsibility to manage access to the FastStringBuffer to prevent this
   * problem from arising.
   * <p>
   * Note too that there is no promise that the output will be sent as a
   * single call. As is always true in SAX, one logical string may be split
   * across multiple blocks of memory and hence delivered as several
   * successive events.
   *
   * @param ch SAX ContentHandler object to receive the event.
   * @param start Offset of first character in the range.
   * @param length Number of characters to send.
   * @exception org.xml.sax.SAXException may be thrown by handler's
   * characters() method.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public char charAt(int pos)

  /**
   * Get a single character from the string buffer.
   *
   *
   * @param pos character position requested.
   * @return A character from the requested position.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  StringBuffer getString(StringBuffer sb, int startChunk, int startColumn,
                         int length)

  /**
   * Internal support for toString() and getString().
   * PLEASE NOTE SIGNATURE CHANGE from earlier versions; it now appends into
   * and returns a StringBuffer supplied by the caller. This simplifies
   * m_innerFSB support.
   * <p>
   * Note that this operation has been somewhat deoptimized by the shift to a
   * chunked array, as there is no factory method to produce a String object
   * directly from an array of arrays and hence a double copy is needed.
   * By presetting length we hope to minimize the heap overhead of building
   * the intermediate StringBuffer.
   * <p>
   * (It really is a pity that Java didn't design String as a final subclass
   * of MutableString, rather than having StringBuffer be a separate hierarchy.
   * We'd avoid a <strong>lot</strong> of double-buffering.)
   *
   *
   * @param sb
   * @param startChunk
   * @param startColumn
   * @param length
   *
   * @return the contents of the FastStringBuffer as a standard Java string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  StringBuffer getString(StringBuffer sb, int start, int length)

  /**
   * @param sb StringBuffer to be appended to
   * @param start Offset of first character in the range.
   * @param length Number of characters to send.
   * @return sb with the requested text appended to it
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public String getString(int start, int length)

  /**
   * @param start Offset of first character in the range.
   * @param length Number of characters to send.
   * @return a new String object initialized from the specified range of
   * characters.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public boolean isWhitespace(int start, int length)

  /**
   * @return true if the specified range of characters are all whitespace,
   * as defined by XMLCharacterRecognizer.
   * <p>
   * CURRENTLY DOES NOT CHECK FOR OUT-OF-RANGE.
   *
   * @param start Offset of first character in the range.
   * @param length Number of characters to send.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public final void append(FastStringBuffer value)

  /**
   * Append the contents of another FastStringBuffer onto
   * this FastStringBuffer, growing the storage if necessary.
   * <p>
   * NOTE THAT after calling append(), previously obtained
   * references to m_array[] may no longer be valid.
   *
   * @param value FastStringBuffer whose contents are
   * to be appended.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public final void append(char[] chars, int start, int length)

  /**
   * Append part of the contents of a Character Array onto the
   * FastStringBuffer,  growing the storage if necessary.
   * <p>
   * NOTE THAT after calling append(), previously obtained
   * references to m_array[] may no longer be valid.
   *
   * @param chars character array from which data is to be copied
   * @param start offset in chars of first character to be copied,
   * zero-based.
   * @param length number of characters to be copied
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public final void append(StringBuffer value)

  /**
   * Append the contents of a StringBuffer onto the FastStringBuffer,
   * growing the storage if necessary.
   * <p>
   * NOTE THAT after calling append(), previously obtained
   * references to m_array[] may no longer be valid.
   *
   * @param value StringBuffer whose contents are to be appended.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public final void append(String value)

  /**
   * Append the contents of a String onto the FastStringBuffer,
   * growing the storage if necessary.
   * <p>
   * NOTE THAT after calling append(), previously obtained
   * references to m_array[] may no longer be valid.
   *
   * @param value String whose contents are to be appended.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public final void append(char value)

  /**
   * Append a single character onto the FastStringBuffer, growing the
   * storage if necessary.
   * <p>
   * NOTE THAT after calling append(), previously obtained
   * references to m_array[][] may no longer be valid....
   * though in fact they should be in this instance.
   *
   * @param value character to be appended.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public final String toString()

  /**
   * Note that this operation has been somewhat deoptimized by the shift to a
   * chunked array, as there is no factory method to produce a String object
   * directly from an array of arrays and hence a double copy is needed.
   * By using ensureCapacity we hope to minimize the heap overhead of building
   * the intermediate StringBuffer.
   * <p>
   * (It really is a pity that Java didn't design String as a final subclass
   * of MutableString, rather than having StringBuffer be a separate hierarchy.
   * We'd avoid a <strong>lot</strong> of double-buffering.)
   *
   * @return the contents of the FastStringBuffer as a standard Java string.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  private final void setLength(int l, FastStringBuffer rootFSB)

  /**
   * Subroutine for the public setLength() method. Deals with the fact
   * that truncation may require restoring one of the innerFSBs
   *
   * NEEDSDOC @param l
   * NEEDSDOC @param rootFSB
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public final void setLength(int l)

  /**
   * Directly set how much of the FastStringBuffer's storage is to be
   * considered part of its content. This is a fast but hazardous
   * operation. It is not protected against negative values, or values
   * greater than the amount of storage currently available... and even
   * if additional storage does exist, its contents are unpredictable.
   * The only safe use for our setLength() is to truncate the FastStringBuffer
   * to a shorter string.
   *
   * @param l New length. If l<0 or l>=getLength(), this operation will
   * not report an error but future operations will almost certainly fail.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public final void reset()

  /**
   * Discard the content of the FastStringBuffer, and most of the memory
   * that was allocated by it, restoring the initial state. Note that this
   * may eventually be different from setLength(0), which see.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public final int length()

  /**
   * Get the length of the list. Synonym for size().
   *
   * @return the number of characters in the FastStringBuffer's content.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public final int size()

  /**
   * Get the length of the list. Synonym for length().
   *
   * @return the number of characters in the FastStringBuffer's content.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public FastStringBuffer()

  /**
   * Construct a FastStringBuffer, using a default allocation policy.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public FastStringBuffer(int initChunkBits)

  /**
   * Construct a FastStringBuffer, using default maxChunkBits and
   * rebundleBits values.
   * <p>
   * ISSUE: Should this call assert initial size, or fixed size?
   * Now configured as initial, with a default for fixed.
   *
   * NEEDSDOC @param initChunkBits
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public FastStringBuffer(int initChunkBits, int maxChunkBits)

  /**
   * Construct a FastStringBuffer, using a default rebundleBits value.
   *
   * NEEDSDOC @param initChunkBits
   * NEEDSDOC @param maxChunkBits
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  public FastStringBuffer(int initChunkBits, int maxChunkBits,
                          int rebundleBits)

  /**
   * Construct a FastStringBuffer, with allocation policy as per parameters.
   * <p>
   * For coding convenience, I've expressed both allocation sizes in terms of
   * a number of bits. That's needed for the final size of a chunk,
   * to permit fast and efficient shift-and-mask addressing. It's less critical
   * for the inital size, and may be reconsidered.
   * <p>
   * An alternative would be to accept integer sizes and round to powers of two;
   * that really doesn't seem to buy us much, if anything.
   *
   * @param initChunkBits Length in characters of the initial allocation
   * of a chunk, expressed in log-base-2. (That is, 10 means allocate 1024
   * characters.) Later chunks will use larger allocation units, to trade off
   * allocation speed of large document against storage efficiency of small
   * ones.
   * @param maxChunkBits Number of character-offset bits that should be used for
   * addressing within a chunk. Maximum length of a chunk is 2^chunkBits
   * characters.
   * @param rebundleBits Number of character-offset bits that addressing should
   * advance before we attempt to take a step from initChunkBits to maxChunkBits
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  FastStringBuffer m_innerFSB = null;

  /**
   * Field m_innerFSB, when non-null, is a FastStringBuffer whose total
   * length equals m_chunkSize, and which replaces m_array[0]. This allows
   * building a hierarchy of FastStringBuffers, where early appends use
   * a smaller chunkSize (for less wasted memory overhead) but later
   * ones use a larger chunkSize (for less heap activity overhead).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  int m_firstFree = 0;

  /**
   * Field m_firstFree is an index into m_array[m_lastChunk][], pointing to
   * the first character in the Chunked Array which is not part of the
   * FastStringBuffer's current content. Since m_array[][] is zero-based,
   * the length of that content can be calculated as
   * (m_lastChunk<<m_chunkBits) + m_firstFree
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  int m_lastChunk = 0;

  /**
   * Field m_lastChunk is an index into m_array[], pointing to the last
   * chunk of the Chunked Array currently in use. Note that additional
   * chunks may actually be allocated, eg if the FastStringBuffer had
   * previously been truncated or if someone issued an ensureSpace request.
   * <p>
   * The insertion point for append operations is addressed by the combination
   * of m_lastChunk and m_firstFree.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  char[][] m_array;

  /**
   * Field m_array holds the string buffer's text contents, using an
   * array-of-arrays. Note that this array, and the arrays it contains, may be
   * reallocated when necessary in order to allow the buffer to grow;
   * references to them should be considered to be invalidated after any
   * append. However, the only time these arrays are directly exposed
   * is in the sendSAXcharacters call.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  int m_chunkMask;  // =m_chunkSize-1;

  /**
   * Field m_chunkMask is m_chunkSize-1 -- in other words, m_chunkBits
   * worth of low-order '1' bits, useful for shift-and-mask addressing
   * within the chunks.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  int m_chunkSize;  // =1<<(m_chunkBits-1);

  /**
   * Field m_chunkSize establishes the maximum size of one chunk of the array
   * as 2**chunkbits characters.
   * (Which may also be the minimum size if we aren't tuning for storage)
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  int m_rebundleBits = 2;

  /**
   * Field m_rechunkBits affects our chunk-growth strategy, by saying how
   * many chunks should be allocated at one size before we encapsulate them
   * into the first chunk of the next size up. For example, if m_rechunkBits
   * is set to 3, then after 8 chunks at a given size we will rebundle
   * them as the first element of a FastStringBuffer using a chunk size
   * 8 times larger (chunkBits shifted left three bits).
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  int m_maxChunkBits = 15;

  /**
   * Field m_maxChunkBits affects our chunk-growth strategy, by saying what
   * the largest permissible chunk size is in this particular FastStringBuffer
   * hierarchy.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
  int m_chunkBits = 15;

        /**
   * Field m_chunkBits sets our chunking strategy, by saying how many
   * bits of index can be used within a single chunk before flowing over
   * to the next chunk. For example, if m_chunkbits is set to 15, each
   * chunk can contain up to 2^15 (32K) characters
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
        private static final int CARRY_WS=0x04;

        /** Manifest constant: Carry trailing whitespace of one chunk as leading
         * whitespace of the next chunk. Used internally; I don't see any reason
         * to make it public right now.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
        public static final int SUPPRESS_BOTH

        /** Manifest constant: Suppress both leading and trailing whitespace.
         * This should be used when normalize-to-SAX is called for a complete string.
         * (I'm not wild about the name of this one. Ideas welcome.)
         * @see #sendNormalizedSAXcharacters(org.xml.sax.ContentHandler,int,int)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
        public static final int SUPPRESS_TRAILING_WS=0x02;

        /** Manifest constant: Suppress trailing whitespace.
         * This should be used when normalize-to-SAX is called for the last chunk of a
         * multi-chunk output; it may have to be or'ed with SUPPRESS_LEADING_WS.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
        public static final int SUPPRESS_LEADING_WS=0x01;

        /** Manifest constant: Suppress leading whitespace.
         * This should be used when normalize-to-SAX is called for the first chunk of a
         * multi-chunk output, or one following unsuppressed whitespace in a previous
         * chunk.
         * @see #sendNormalizedSAXcharacters(org.xml.sax.ContentHandler,int,int)
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
        // %BUG% %REVIEW% *****PROBLEM SUSPECTED: If data from an FSB is being copied

  /**/static final int DEBUG_FORCE_INIT_BITS=0;
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/FastStringBuffer.java
public class FastStringBuffer

/**
 * Bare-bones, unsafe, fast string buffer. No thread-safety, no
 * parameter range checking, exposed fields. Note that in typical
 * applications, thread-safety of a StringBuffer is a somewhat
 * dubious concept in any case.
 * <p>
 * Note that Stree and DTM used a single FastStringBuffer as a string pool,
 * by recording start and length indices within this single buffer. This
 * minimizes heap overhead, but of course requires more work when retrieving
 * the data.
 * <p>
 * FastStringBuffer operates as a "chunked buffer". Doing so
 * reduces the need to recopy existing information when an append
 * exceeds the space available; we just allocate another chunk and
 * flow across to it. (The array of chunks may need to grow,
 * admittedly, but that's a much smaller object.) Some excess
 * recopying may arise when we extract Strings which cross chunk
 * boundaries; larger chunks make that less frequent.
 * <p>
 * The size values are parameterized, to allow tuning this code. In
 * theory, Result Tree Fragments might want to be tuned differently
 * from the main document's text.
 * <p>
 * %REVIEW% An experiment in self-tuning is
 * included in the code (using nested FastStringBuffers to achieve
 * variation in chunk sizes), but this implementation has proven to
 * be problematic when data may be being copied from the FSB into itself.
 * We should either re-architect that to make this safe (if possible)
 * or remove that code and clean up for performance/maintainability reasons.
 * <p>
 */
