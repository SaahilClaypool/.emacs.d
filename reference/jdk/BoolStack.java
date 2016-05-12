_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  private void grow()

  /**
   * Grows the size of the stack
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  public boolean isEmpty()

  /**
   * Tests if this stack is empty.
   *
   * @return  <code>true</code> if this stack is empty;
   *          <code>false</code> otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  public final boolean peekOrTrue()

  /**
   * Looks at the object at the top of this stack without removing it
   * from the stack.  If the stack is empty, it returns true.
   *
   * @return     the object at the top of this stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  public final boolean peekOrFalse()

  /**
   * Looks at the object at the top of this stack without removing it
   * from the stack.  If the stack is empty, it returns false.
   *
   * @return     the object at the top of this stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  public final boolean peek()

  /**
   * Looks at the object at the top of this stack without removing it
   * from the stack.
   *
   * @return     the object at the top of this stack.
   * @throws  EmptyStackException  if this stack is empty.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  public final void setTop(boolean b)

  /**
   * Set the item at the top of this stack
   *
   *
   * @param b Object to set at the top of this stack
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  public final boolean popAndTop()

  /**
   * Removes the object at the top of this stack and returns the
   * next object at the top as the value of this function.
   *
   *
   * @return Next object to the top or false if none there
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  public final boolean pop()

  /**
   * Removes the object at the top of this stack and returns that
   * object as the value of this function.
   *
   * @return     The object at the top of this stack.
   * @throws  EmptyStackException  if this stack is empty.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  public final boolean push(boolean val)

  /**
   * Pushes an item onto the top of this stack.
   *
   *
   * @param val the boolean to be pushed onto this stack.
   * @return  the <code>item</code> argument.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  public final void clear()

  /**
   * Clears the stack.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  public final int size()

  /**
   * Get the length of the list.
   *
   * @return Current length of the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  public BoolStack(int size)

  /**
   * Construct a IntVector, using the given block size.
   *
   * @param size array size to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  public BoolStack()

  /**
   * Default constructor.  Note that the default
   * block size is very small, for small lists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  private int m_index;

  /** Index into the array of booleans          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  private int m_allocatedSize;

  /** Array size allocated           */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  private boolean m_values[];

  /** Array of boolean values          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
public final class BoolStack

/**
 * Simple stack for boolean values.
 *
 * This class is a copy of the one in com.sun.org.apache.xml.internal.utils.
 * It exists to cut the serializers dependancy on that package.
 * A minor changes from that package are:
 * doesn't implement Clonable
 *
 * This class is not a public API, it is only public because it is
 * used in com.sun.org.apache.xml.internal.serializer.
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  private void grow()

  /**
   * Grows the size of the stack
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  public boolean isEmpty()

  /**
   * Tests if this stack is empty.
   *
   * @return  <code>true</code> if this stack is empty;
   *          <code>false</code> otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  public final boolean peekOrTrue()

  /**
   * Looks at the object at the top of this stack without removing it
   * from the stack.  If the stack is empty, it returns true.
   *
   * @return     the object at the top of this stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  public final boolean peekOrFalse()

  /**
   * Looks at the object at the top of this stack without removing it
   * from the stack.  If the stack is empty, it returns false.
   *
   * @return     the object at the top of this stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  public final boolean peek()

  /**
   * Looks at the object at the top of this stack without removing it
   * from the stack.
   *
   * @return     the object at the top of this stack.
   * @throws  EmptyStackException  if this stack is empty.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  public final void setTop(boolean b)

  /**
   * Set the item at the top of this stack
   *
   *
   * @param b Object to set at the top of this stack
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  public final boolean popAndTop()

  /**
   * Removes the object at the top of this stack and returns the
   * next object at the top as the value of this function.
   *
   *
   * @return Next object to the top or false if none there
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  public final boolean pop()

  /**
   * Removes the object at the top of this stack and returns that
   * object as the value of this function.
   *
   * @return     The object at the top of this stack.
   * @throws  EmptyStackException  if this stack is empty.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  public final boolean push(boolean val)

  /**
   * Pushes an item onto the top of this stack.
   *
   *
   * @param val the boolean to be pushed onto this stack.
   * @return  the <code>item</code> argument.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  public final void clear()

  /**
   * Clears the stack.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  public final int size()

  /**
   * Get the length of the list.
   *
   * @return Current length of the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  public BoolStack(int size)

  /**
   * Construct a IntVector, using the given block size.
   *
   * @param size array size to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  public BoolStack()

  /**
   * Default constructor.  Note that the default
   * block size is very small, for small lists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  private int m_index;

  /** Index into the array of booleans          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  private int m_allocatedSize;

  /** Array size allocated           */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  private boolean m_values[];

  /** Array of boolean values          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
public final class BoolStack implements Cloneable

/**
 * Simple stack for boolean values.
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  private void grow()

  /**
   * Grows the size of the stack
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  public boolean isEmpty()

  /**
   * Tests if this stack is empty.
   *
   * @return  <code>true</code> if this stack is empty;
   *          <code>false</code> otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  public final boolean peekOrTrue()

  /**
   * Looks at the object at the top of this stack without removing it
   * from the stack.  If the stack is empty, it returns true.
   *
   * @return     the object at the top of this stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  public final boolean peekOrFalse()

  /**
   * Looks at the object at the top of this stack without removing it
   * from the stack.  If the stack is empty, it returns false.
   *
   * @return     the object at the top of this stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  public final boolean peek()

  /**
   * Looks at the object at the top of this stack without removing it
   * from the stack.
   *
   * @return     the object at the top of this stack.
   * @throws  EmptyStackException  if this stack is empty.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  public final void setTop(boolean b)

  /**
   * Set the item at the top of this stack
   *
   *
   * @param b Object to set at the top of this stack
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  public final boolean popAndTop()

  /**
   * Removes the object at the top of this stack and returns the
   * next object at the top as the value of this function.
   *
   *
   * @return Next object to the top or false if none there
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  public final boolean pop()

  /**
   * Removes the object at the top of this stack and returns that
   * object as the value of this function.
   *
   * @return     The object at the top of this stack.
   * @throws  EmptyStackException  if this stack is empty.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  public final boolean push(boolean val)

  /**
   * Pushes an item onto the top of this stack.
   *
   *
   * @param val the boolean to be pushed onto this stack.
   * @return  the <code>item</code> argument.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  public final void clear()

  /**
   * Clears the stack.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  public final int size()

  /**
   * Get the length of the list.
   *
   * @return Current length of the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  public BoolStack(int size)

  /**
   * Construct a IntVector, using the given block size.
   *
   * @param size array size to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  public BoolStack()

  /**
   * Default constructor.  Note that the default
   * block size is very small, for small lists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  private int m_index;

  /** Index into the array of booleans          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  private int m_allocatedSize;

  /** Array size allocated           */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
  private boolean m_values[];

  /** Array of boolean values          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/serializer/utils/BoolStack.java
public final class BoolStack

/**
 * Simple stack for boolean values.
 *
 * This class is a copy of the one in com.sun.org.apache.xml.internal.utils.
 * It exists to cut the serializers dependancy on that package.
 * A minor changes from that package are:
 * doesn't implement Clonable
 *
 * This class is not a public API, it is only public because it is
 * used in com.sun.org.apache.xml.internal.serializer.
 *
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  private void grow()

  /**
   * Grows the size of the stack
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  public boolean isEmpty()

  /**
   * Tests if this stack is empty.
   *
   * @return  <code>true</code> if this stack is empty;
   *          <code>false</code> otherwise.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  public final boolean peekOrTrue()

  /**
   * Looks at the object at the top of this stack without removing it
   * from the stack.  If the stack is empty, it returns true.
   *
   * @return     the object at the top of this stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  public final boolean peekOrFalse()

  /**
   * Looks at the object at the top of this stack without removing it
   * from the stack.  If the stack is empty, it returns false.
   *
   * @return     the object at the top of this stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  public final boolean peek()

  /**
   * Looks at the object at the top of this stack without removing it
   * from the stack.
   *
   * @return     the object at the top of this stack.
   * @throws  EmptyStackException  if this stack is empty.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  public final void setTop(boolean b)

  /**
   * Set the item at the top of this stack
   *
   *
   * @param b Object to set at the top of this stack
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  public final boolean popAndTop()

  /**
   * Removes the object at the top of this stack and returns the
   * next object at the top as the value of this function.
   *
   *
   * @return Next object to the top or false if none there
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  public final boolean pop()

  /**
   * Removes the object at the top of this stack and returns that
   * object as the value of this function.
   *
   * @return     The object at the top of this stack.
   * @throws  EmptyStackException  if this stack is empty.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  public final boolean push(boolean val)

  /**
   * Pushes an item onto the top of this stack.
   *
   *
   * @param val the boolean to be pushed onto this stack.
   * @return  the <code>item</code> argument.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  public final void clear()

  /**
   * Clears the stack.
   *
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  public final int size()

  /**
   * Get the length of the list.
   *
   * @return Current length of the list
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  public BoolStack(int size)

  /**
   * Construct a IntVector, using the given block size.
   *
   * @param size array size to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  public BoolStack()

  /**
   * Default constructor.  Note that the default
   * block size is very small, for small lists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  private int m_index;

  /** Index into the array of booleans          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  private int m_allocatedSize;

  /** Array size allocated           */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
  private boolean m_values[];

  /** Array of boolean values          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/BoolStack.java
public final class BoolStack implements Cloneable

/**
 * Simple stack for boolean values.
 * @xsl.usage internal
 */
