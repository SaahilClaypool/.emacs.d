_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public XObject getVariableOrParam(
          XPathContext xctxt, com.sun.org.apache.xml.internal.utils.QName qname)

  /**
   * Get a variable based on it's qualified name.
   * This is for external use only.
   *
   * @param xctxt The XPath context, which must be passed in order to
   * lazy evaluate variables.
   *
   * @param qname The qualified name of the variable.
   *
   * @return The evaluated value of the variable.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public XObject getGlobalVariable(XPathContext xctxt, final int index, boolean destructiveOK)

  /**
   * Get a global variable or parameter from the global stack frame.
   *
   *
   * @param xctxt The XPath context, which must be passed in order to
   * lazy evaluate variables.
   *
   * @param index Global variable index relative to the global stack
   * frame bottom.
   *
   * @return The value of the variable.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public XObject getGlobalVariable(XPathContext xctxt, final int index)

  /**
   * Get a global variable or parameter from the global stack frame.
   *
   *
   * @param xctxt The XPath context, which must be passed in order to
   * lazy evaluate variables.
   *
   * @param index Global variable index relative to the global stack
   * frame bottom.
   *
   * @return The value of the variable.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public void setGlobalVariable(final int index, final XObject val)

  /**
   * Set a global variable or parameter in the global stack frame.
   *
   *
   * @param index Local variable index relative to the global stack frame
   * bottom.
   *
   * @param val The value of the variable that is being set.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public void clearLocalSlots(int start, int len)

  /**
   * Use this to clear the variables in a section of the stack.  This is
   * used to clear the parameter section of the stack, so that default param
   * values can tell if they've already been set.  It is important to note that
   * this function has a 1K limitation.
   *
   * @param start The start position, relative to the current local stack frame.
   * @param len The number of slots to be cleared.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  private static XObject[] m_nulls = new XObject[CLEARLIMITATION];

  /** NEEDSDOC Field m_nulls          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public boolean isLocalSet(int index) throws TransformerException

  /**
   * Tell if a local variable has been set or not.
   *
   * @param index Local variable index relative to the current stack
   * frame bottom.
   *
   * @return true if the value at the index is not null.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public XObject getLocalVariable(XPathContext xctxt, int index, boolean destructiveOK)

  /**
   * Get a local variable or parameter in the current stack frame.
   *
   *
   * @param xctxt The XPath context, which must be passed in order to
   * lazy evaluate variables.
   *
   * @param index Local variable index relative to the current stack
   * frame bottom.
   *
   * @return The value of the variable.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public XObject getLocalVariable(int index, int frame)

  /**
   * Get a local variable or parameter in the current stack frame.
   *
   *
   * @param index Local variable index relative to the given
   * frame bottom.
   * NEEDSDOC @param frame
   *
   * @return The value of the variable.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public XObject getLocalVariable(XPathContext xctxt, int index)

  /**
   * Get a local variable or parameter in the current stack frame.
   *
   *
   * @param xctxt The XPath context, which must be passed in order to
   * lazy evaluate variables.
   *
   * @param index Local variable index relative to the current stack
   * frame bottom.
   *
   * @return The value of the variable.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public void setLocalVariable(int index, XObject val, int stackFrame)

  /**
   * Set a local variable or parameter in the specified stack frame.
   *
   *
   * @param index Local variable index relative to the current stack
   * frame bottom.
   * NEEDSDOC @param stackFrame
   *
   * @param val The value of the variable that is being set.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public void setLocalVariable(int index, XObject val)

  /**
   * Set a local variable or parameter in the current stack frame.
   *
   *
   * @param index Local variable index relative to the current stack
   * frame bottom.
   *
   * @param val The value of the variable that is being set.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public  void unlink(int currentFrame)

  /**
   * Free up the stack frame that was last allocated with
   * {@link #link(int size)}.
   * @param currentFrame The current frame to set to
   * after the unlink.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public  void unlink()

  /**
   * Free up the stack frame that was last allocated with
   * {@link #link(int size)}.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public int link(final int size)

  /**
   * Allocates memory (called a stackframe) on the stack; used to store
   * local variables and parameter arguments.
   *
   * <p>I use the link/unlink concept because of distant
   * <a href="http://math.millikin.edu/mprogers/Courses/currentCourses/CS481-ComputerArchitecture/cs481.Motorola68000.html">
   * Motorola 68000 assembler</a> memories.</p>
   *
   * @param size The size of the stack frame allocation.  This ammount should
   * normally be the maximum number of variables that you can have allocated
   * at one time in the new stack frame.
   *
   * @return The bottom of the stack frame, from where local variable addressing
   * should start from.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public int getStackFrame()

  /**
   * Get the position from where the search should start,
   * which is either the searchStart property, or the top
   * of the stack if that value is -1.
   *
   * @return The current stack frame position.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public void setStackFrame(int sf)

  /**
   * Set the current stack frame.
   *
   * @param sf The new stack frame position.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public void reset()

  /**
   * Reset the stack to a start position.
   *
   * @return the total size of the execution stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public int size()

  /**
   * Get size of the stack.
   *
   * @return the total size of the execution stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public XObject elementAt(final int i)

  /**
   * Get the element at the given index, regardless of stackframe.
   *
   * @param i index from zero.
   *
   * @return The item at the given index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  int _linksTop;

  /**
   * The top of the links stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  int[] _links = new int[XPathContext.RECURSIONLIMIT];

  /**
   * The stack of frame positions.  I call 'em links because of distant
   * <a href="http://math.millikin.edu/mprogers/Courses/currentCourses/CS481-ComputerArchitecture/cs481.Motorola68000.html">
   * Motorola 68000 assembler</a> memories.  :-)
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  private int _currentFrameBottom;

  /**
   * The bottom index of the current frame (relative to <code>_stackFrames</code>).
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  int _frameTop;

  /**
   * The top of the stack frame (<code>_stackFrames</code>).
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  XObject[] _stackFrames = new XObject[XPathContext.RECURSIONLIMIT * 2];

  /**
   * The stack frame where all variables and params will be kept.
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public synchronized Object clone() throws CloneNotSupportedException

  /**
   * Returns a clone of this variable stack.
   *
   * @return  a clone of this variable stack.
   *
   * @throws CloneNotSupportedException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public VariableStack()

  /**
   * Constructor for a variable stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public static final int CLEARLIMITATION= 1024;

  /**
   * limitation for 1K
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
public class VariableStack implements Cloneable

/**
 * Defines a class to keep track of a stack for
 * template arguments and variables.
 *
 * <p>This has been changed from the previous incarnations of this
 * class to be fairly low level.</p>
 * @xsl.usage internal
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public XObject getVariableOrParam(
          XPathContext xctxt, com.sun.org.apache.xml.internal.utils.QName qname)

  /**
   * Get a variable based on it's qualified name.
   * This is for external use only.
   *
   * @param xctxt The XPath context, which must be passed in order to
   * lazy evaluate variables.
   *
   * @param qname The qualified name of the variable.
   *
   * @return The evaluated value of the variable.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public XObject getGlobalVariable(XPathContext xctxt, final int index, boolean destructiveOK)

  /**
   * Get a global variable or parameter from the global stack frame.
   *
   *
   * @param xctxt The XPath context, which must be passed in order to
   * lazy evaluate variables.
   *
   * @param index Global variable index relative to the global stack
   * frame bottom.
   *
   * @return The value of the variable.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public XObject getGlobalVariable(XPathContext xctxt, final int index)

  /**
   * Get a global variable or parameter from the global stack frame.
   *
   *
   * @param xctxt The XPath context, which must be passed in order to
   * lazy evaluate variables.
   *
   * @param index Global variable index relative to the global stack
   * frame bottom.
   *
   * @return The value of the variable.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public void setGlobalVariable(final int index, final XObject val)

  /**
   * Set a global variable or parameter in the global stack frame.
   *
   *
   * @param index Local variable index relative to the global stack frame
   * bottom.
   *
   * @param val The value of the variable that is being set.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public void clearLocalSlots(int start, int len)

  /**
   * Use this to clear the variables in a section of the stack.  This is
   * used to clear the parameter section of the stack, so that default param
   * values can tell if they've already been set.  It is important to note that
   * this function has a 1K limitation.
   *
   * @param start The start position, relative to the current local stack frame.
   * @param len The number of slots to be cleared.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  private static XObject[] m_nulls = new XObject[CLEARLIMITATION];

  /** NEEDSDOC Field m_nulls          */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public boolean isLocalSet(int index) throws TransformerException

  /**
   * Tell if a local variable has been set or not.
   *
   * @param index Local variable index relative to the current stack
   * frame bottom.
   *
   * @return true if the value at the index is not null.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public XObject getLocalVariable(XPathContext xctxt, int index, boolean destructiveOK)

  /**
   * Get a local variable or parameter in the current stack frame.
   *
   *
   * @param xctxt The XPath context, which must be passed in order to
   * lazy evaluate variables.
   *
   * @param index Local variable index relative to the current stack
   * frame bottom.
   *
   * @return The value of the variable.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public XObject getLocalVariable(int index, int frame)

  /**
   * Get a local variable or parameter in the current stack frame.
   *
   *
   * @param index Local variable index relative to the given
   * frame bottom.
   * NEEDSDOC @param frame
   *
   * @return The value of the variable.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public XObject getLocalVariable(XPathContext xctxt, int index)

  /**
   * Get a local variable or parameter in the current stack frame.
   *
   *
   * @param xctxt The XPath context, which must be passed in order to
   * lazy evaluate variables.
   *
   * @param index Local variable index relative to the current stack
   * frame bottom.
   *
   * @return The value of the variable.
   *
   * @throws TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public void setLocalVariable(int index, XObject val, int stackFrame)

  /**
   * Set a local variable or parameter in the specified stack frame.
   *
   *
   * @param index Local variable index relative to the current stack
   * frame bottom.
   * NEEDSDOC @param stackFrame
   *
   * @param val The value of the variable that is being set.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public void setLocalVariable(int index, XObject val)

  /**
   * Set a local variable or parameter in the current stack frame.
   *
   *
   * @param index Local variable index relative to the current stack
   * frame bottom.
   *
   * @param val The value of the variable that is being set.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public  void unlink(int currentFrame)

  /**
   * Free up the stack frame that was last allocated with
   * {@link #link(int size)}.
   * @param currentFrame The current frame to set to
   * after the unlink.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public  void unlink()

  /**
   * Free up the stack frame that was last allocated with
   * {@link #link(int size)}.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public int link(final int size)

  /**
   * Allocates memory (called a stackframe) on the stack; used to store
   * local variables and parameter arguments.
   *
   * <p>I use the link/unlink concept because of distant
   * <a href="http://math.millikin.edu/mprogers/Courses/currentCourses/CS481-ComputerArchitecture/cs481.Motorola68000.html">
   * Motorola 68000 assembler</a> memories.</p>
   *
   * @param size The size of the stack frame allocation.  This ammount should
   * normally be the maximum number of variables that you can have allocated
   * at one time in the new stack frame.
   *
   * @return The bottom of the stack frame, from where local variable addressing
   * should start from.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public int getStackFrame()

  /**
   * Get the position from where the search should start,
   * which is either the searchStart property, or the top
   * of the stack if that value is -1.
   *
   * @return The current stack frame position.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public void setStackFrame(int sf)

  /**
   * Set the current stack frame.
   *
   * @param sf The new stack frame position.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public void reset()

  /**
   * Reset the stack to a start position.
   *
   * @return the total size of the execution stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public int size()

  /**
   * Get size of the stack.
   *
   * @return the total size of the execution stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public XObject elementAt(final int i)

  /**
   * Get the element at the given index, regardless of stackframe.
   *
   * @param i index from zero.
   *
   * @return The item at the given index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  int _linksTop;

  /**
   * The top of the links stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  int[] _links = new int[XPathContext.RECURSIONLIMIT];

  /**
   * The stack of frame positions.  I call 'em links because of distant
   * <a href="http://math.millikin.edu/mprogers/Courses/currentCourses/CS481-ComputerArchitecture/cs481.Motorola68000.html">
   * Motorola 68000 assembler</a> memories.  :-)
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  private int _currentFrameBottom;

  /**
   * The bottom index of the current frame (relative to <code>_stackFrames</code>).
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  int _frameTop;

  /**
   * The top of the stack frame (<code>_stackFrames</code>).
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  XObject[] _stackFrames = new XObject[XPathContext.RECURSIONLIMIT * 2];

  /**
   * The stack frame where all variables and params will be kept.
   * @serial
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public synchronized Object clone() throws CloneNotSupportedException

  /**
   * Returns a clone of this variable stack.
   *
   * @return  a clone of this variable stack.
   *
   * @throws CloneNotSupportedException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public VariableStack()

  /**
   * Constructor for a variable stack.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
  public static final int CLEARLIMITATION= 1024;

  /**
   * limitation for 1K
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/VariableStack.java
public class VariableStack implements Cloneable

/**
 * Defines a class to keep track of a stack for
 * template arguments and variables.
 *
 * <p>This has been changed from the previous incarnations of this
 * class to be fairly low level.</p>
 * @xsl.usage internal
 */
