_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ChunkedIntArray.java
  void readSlot(int position, int[] buffer)

  /**
   * Retrieve the contents of a record into a user-supplied buffer array.
   * Used to reduce addressing overhead when code will access several
   * columns of the record.
   * @param position int Record number
   * @param buffer int[] Integer array provided by user, must be large enough
   * to hold a complete record.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ChunkedIntArray.java
  void writeSlot(int position, int w0, int w1, int w2, int w3)

  /**
   * Overwrite an entire (4-integer) record at the specified index.
   * Mostly used to create record 0, the Document node.
   * @param position integer Record number
   * @param w0 int
   * @param w1 int
   * @param w2 int
   * @param w3 int
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ChunkedIntArray.java
  void writeEntry(int position, int offset, int value) throws ArrayIndexOutOfBoundsException

  /**
   * Overwrite the integer found at a specific record and column.
   * Used to back-patch existing records, most often changing their
   * "next sibling" reference from 0 (unknown) to something meaningful
   * @param position int Record number
   * @param offset int Column number
   * @param value int New contents
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ChunkedIntArray.java
  void discardLast()

  /** Disard the highest-numbered record. This is used in the string-buffer
   CIA; when only a single characters() chunk has been recieved, its index
   is moved into the Text node rather than being referenced by indirection
   into the text accumulator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ChunkedIntArray.java
  int slotsUsed()

  /**
   * @return int index of highest-numbered record currently in use
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ChunkedIntArray.java
  int readEntry(int position, int offset) throws ArrayIndexOutOfBoundsException

  /**
   * Retrieve an integer from the CIA by record number and column within
   * the record, both 0-based (though position 0 is reserved for special
   * purposes).
   * @param position int Record number
   * @param slotpos int Column number
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ChunkedIntArray.java
  int appendSlot(int w0, int w1, int w2, int w3)

  /**
   * Append a 4-integer record to the CIA, starting with record 1. (Since
   * arrays are initialized to all-0, 0 has been reserved as the "unknown"
   * value in DTM.)
   * @return the index at which this record was inserted.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ChunkedIntArray.java
  ChunkedIntArray(int slotsize)

  /**
   * Create a new CIA with specified record size. Currently record size MUST
   * be a power of two... and in fact is hardcoded to 4.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ChunkedIntArray.java
final class ChunkedIntArray

/**
 * <code>ChunkedIntArray</code> is an extensible array of blocks of integers.
 * (I'd consider Vector, but it's unable to handle integers except by
 * turning them into Objects.)

 * <p>Making this a separate class means some call-and-return overhead. But
 * doing it all inline tends to be fragile and expensive in coder time,
 * not to mention driving up code size. If you want to inline it, feel free.
 * The Java text suggest that private and Final methods may be inlined,
 * and one can argue that this beast need not be made subclassable...</p>
 *
 * <p>%REVIEW% This has strong conceptual overlap with the IntVector class.
 * It would probably be a good thing to merge the two, when time permits.<p>
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ChunkedIntArray.java
  void readSlot(int position, int[] buffer)

  /**
   * Retrieve the contents of a record into a user-supplied buffer array.
   * Used to reduce addressing overhead when code will access several
   * columns of the record.
   * @param position int Record number
   * @param buffer int[] Integer array provided by user, must be large enough
   * to hold a complete record.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ChunkedIntArray.java
  void writeSlot(int position, int w0, int w1, int w2, int w3)

  /**
   * Overwrite an entire (4-integer) record at the specified index.
   * Mostly used to create record 0, the Document node.
   * @param position integer Record number
   * @param w0 int
   * @param w1 int
   * @param w2 int
   * @param w3 int
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ChunkedIntArray.java
  void writeEntry(int position, int offset, int value) throws ArrayIndexOutOfBoundsException

  /**
   * Overwrite the integer found at a specific record and column.
   * Used to back-patch existing records, most often changing their
   * "next sibling" reference from 0 (unknown) to something meaningful
   * @param position int Record number
   * @param offset int Column number
   * @param value int New contents
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ChunkedIntArray.java
  void discardLast()

  /** Disard the highest-numbered record. This is used in the string-buffer
   CIA; when only a single characters() chunk has been recieved, its index
   is moved into the Text node rather than being referenced by indirection
   into the text accumulator.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ChunkedIntArray.java
  int slotsUsed()

  /**
   * @return int index of highest-numbered record currently in use
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ChunkedIntArray.java
  int readEntry(int position, int offset) throws ArrayIndexOutOfBoundsException

  /**
   * Retrieve an integer from the CIA by record number and column within
   * the record, both 0-based (though position 0 is reserved for special
   * purposes).
   * @param position int Record number
   * @param slotpos int Column number
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ChunkedIntArray.java
  int appendSlot(int w0, int w1, int w2, int w3)

  /**
   * Append a 4-integer record to the CIA, starting with record 1. (Since
   * arrays are initialized to all-0, 0 has been reserved as the "unknown"
   * value in DTM.)
   * @return the index at which this record was inserted.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ChunkedIntArray.java
  ChunkedIntArray(int slotsize)

  /**
   * Create a new CIA with specified record size. Currently record size MUST
   * be a power of two... and in fact is hardcoded to 4.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/ChunkedIntArray.java
final class ChunkedIntArray

/**
 * <code>ChunkedIntArray</code> is an extensible array of blocks of integers.
 * (I'd consider Vector, but it's unable to handle integers except by
 * turning them into Objects.)

 * <p>Making this a separate class means some call-and-return overhead. But
 * doing it all inline tends to be fragile and expensive in coder time,
 * not to mention driving up code size. If you want to inline it, feel free.
 * The Java text suggest that private and Final methods may be inlined,
 * and one can argue that this beast need not be made subclassable...</p>
 *
 * <p>%REVIEW% This has strong conceptual overlap with the IntVector class.
 * It would probably be a good thing to merge the two, when time permits.<p>
 */
