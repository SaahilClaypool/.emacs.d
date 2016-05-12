_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectStack.java
  public Object clone()

  /**
   * Returns clone of current ObjectStack
   *
   * @return clone of current ObjectStack
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectStack.java
  public int search(Object o)

  /**
   * Returns where an object is on this stack.
   *
   * @param   o   the desired object.
   * @return  the distance from the top of the stack where the object is]
   *          located; the return value <code>-1</code> indicates that the
   *          object is not on the stack.
   * @since   JDK1.0
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectStack.java
  public boolean empty()

  /**
   * Tests if this stack is empty.
   *
   * @return  <code>true</code> if this stack is empty;
   *          <code>false</code> otherwise.
   * @since   JDK1.0
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectStack.java
  public void setTop(Object val)

  /**
   * Sets an object at a the top of the statck
   *
   *
   * @param val object to set at the top
   * @throws  EmptyStackException  if this stack is empty.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectStack.java
  public Object peek(int n)

  /**
   * Looks at the object at the position the stack counting down n items.
   *
   * @param n The number of items down, indexed from zero.
   * @return     the object at n items down.
   * @throws  EmptyStackException  if this stack is empty.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectStack.java
  public Object peek()

  /**
   * Looks at the object at the top of this stack without removing it
   * from the stack.
   *
   * @return     the object at the top of this stack.
   * @throws  EmptyStackException  if this stack is empty.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectStack.java
  public void quickPop(int n)

  /**
   * Quickly pops a number of items from the stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectStack.java
  public Object pop()

  /**
   * Removes the object at the top of this stack and returns that
   * object as the value of this function.
   *
   * @return     The object at the top of this stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectStack.java
  public Object push(Object i)

  /**
   * Pushes an item onto the top of this stack.
   *
   * @param   i   the int to be pushed onto this stack.
   * @return  the <code>item</code> argument.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectStack.java
  public ObjectStack (ObjectStack v)

  /**
   * Copy constructor for ObjectStack
   *
   * @param v ObjectStack to copy
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectStack.java
  public ObjectStack(int blocksize)

  /**
   * Construct a ObjectVector, using the given block size.
   *
   * @param blocksize Size of block to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectStack.java
  public ObjectStack()

  /**
   * Default constructor.  Note that the default
   * block size is very small, for small lists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectStack.java
public class ObjectStack extends ObjectVector

/**
 * Implement a stack of simple integers.
 *
 * %OPT%
 * This is currently based on ObjectVector, which permits fast acess but pays a
 * heavy recopying penalty if/when its size is increased. If we expect deep
 * stacks, we should consider a version based on ChunkedObjectVector.
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectStack.java
  public Object clone()

  /**
   * Returns clone of current ObjectStack
   *
   * @return clone of current ObjectStack
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectStack.java
  public int search(Object o)

  /**
   * Returns where an object is on this stack.
   *
   * @param   o   the desired object.
   * @return  the distance from the top of the stack where the object is]
   *          located; the return value <code>-1</code> indicates that the
   *          object is not on the stack.
   * @since   JDK1.0
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectStack.java
  public boolean empty()

  /**
   * Tests if this stack is empty.
   *
   * @return  <code>true</code> if this stack is empty;
   *          <code>false</code> otherwise.
   * @since   JDK1.0
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectStack.java
  public void setTop(Object val)

  /**
   * Sets an object at a the top of the statck
   *
   *
   * @param val object to set at the top
   * @throws  EmptyStackException  if this stack is empty.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectStack.java
  public Object peek(int n)

  /**
   * Looks at the object at the position the stack counting down n items.
   *
   * @param n The number of items down, indexed from zero.
   * @return     the object at n items down.
   * @throws  EmptyStackException  if this stack is empty.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectStack.java
  public Object peek()

  /**
   * Looks at the object at the top of this stack without removing it
   * from the stack.
   *
   * @return     the object at the top of this stack.
   * @throws  EmptyStackException  if this stack is empty.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectStack.java
  public void quickPop(int n)

  /**
   * Quickly pops a number of items from the stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectStack.java
  public Object pop()

  /**
   * Removes the object at the top of this stack and returns that
   * object as the value of this function.
   *
   * @return     The object at the top of this stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectStack.java
  public Object push(Object i)

  /**
   * Pushes an item onto the top of this stack.
   *
   * @param   i   the int to be pushed onto this stack.
   * @return  the <code>item</code> argument.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectStack.java
  public ObjectStack (ObjectStack v)

  /**
   * Copy constructor for ObjectStack
   *
   * @param v ObjectStack to copy
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectStack.java
  public ObjectStack(int blocksize)

  /**
   * Construct a ObjectVector, using the given block size.
   *
   * @param blocksize Size of block to allocate
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectStack.java
  public ObjectStack()

  /**
   * Default constructor.  Note that the default
   * block size is very small, for small lists.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/utils/ObjectStack.java
public class ObjectStack extends ObjectVector

/**
 * Implement a stack of simple integers.
 *
 * %OPT%
 * This is currently based on ObjectVector, which permits fast acess but pays a
 * heavy recopying penalty if/when its size is increased. If we expect deep
 * stacks, we should consider a version based on ChunkedObjectVector.
 * @xsl.usage internal
 */
