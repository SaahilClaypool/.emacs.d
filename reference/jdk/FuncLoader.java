_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FuncLoader.java
  Function getFunction() throws TransformerException

  /**
   * Get a Function instance that this instance is liaisoning for.
   *
   * @return non-null reference to Function derivative.
   *
   * @throws javax.xml.transform.TransformerException if ClassNotFoundException,
   *    IllegalAccessException, or InstantiationException is thrown.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FuncLoader.java
  public FuncLoader(String funcName, int funcID)

  /**
   * Construct a function loader
   *
   * @param funcName The class name of the {com.sun.org.apache.xpath.internal.functions.Function}
   *             class, which, if it does not have a '.' in it, is assumed to
   *             be relative to 'com.sun.org.apache.xpath.internal.functions'.
   * @param funcID  The function ID, which may correspond to one of the FUNC_XXX
   *    values found in {@link com.sun.org.apache.xpath.internal.compiler.FunctionTable}, but may
   *    be a value installed by an external module.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FuncLoader.java
  public String getName()

  /**
   * Get the local class name of the function class.  If function name does
   * not have a '.' in it, it is assumed to be relative to
   * 'com.sun.org.apache.xpath.internal.functions'.
   *
   * @return The class name of the {com.sun.org.apache.xpath.internal.functions.Function} class.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FuncLoader.java
  private String m_funcName;

  /** The class name of the function.  Must not be null.   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FuncLoader.java
  private int m_funcID;

  /** The function ID, which may correspond to one of the FUNC_XXX values
   *  found in {@link com.sun.org.apache.xpath.internal.compiler.FunctionTable}, but may
   *  be a value installed by an external module.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FuncLoader.java
public class FuncLoader

/**
 * Lazy load of functions into the function table as needed, so we don't
 * have to load all the functions allowed in XPath and XSLT on startup.
 * @xsl.usage advanced
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FuncLoader.java
  Function getFunction() throws TransformerException

  /**
   * Get a Function instance that this instance is liaisoning for.
   *
   * @return non-null reference to Function derivative.
   *
   * @throws javax.xml.transform.TransformerException if ClassNotFoundException,
   *    IllegalAccessException, or InstantiationException is thrown.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FuncLoader.java
  public FuncLoader(String funcName, int funcID)

  /**
   * Construct a function loader
   *
   * @param funcName The class name of the {com.sun.org.apache.xpath.internal.functions.Function}
   *             class, which, if it does not have a '.' in it, is assumed to
   *             be relative to 'com.sun.org.apache.xpath.internal.functions'.
   * @param funcID  The function ID, which may correspond to one of the FUNC_XXX
   *    values found in {@link com.sun.org.apache.xpath.internal.compiler.FunctionTable}, but may
   *    be a value installed by an external module.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FuncLoader.java
  public String getName()

  /**
   * Get the local class name of the function class.  If function name does
   * not have a '.' in it, it is assumed to be relative to
   * 'com.sun.org.apache.xpath.internal.functions'.
   *
   * @return The class name of the {com.sun.org.apache.xpath.internal.functions.Function} class.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FuncLoader.java
  private String m_funcName;

  /** The class name of the function.  Must not be null.   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FuncLoader.java
  private int m_funcID;

  /** The function ID, which may correspond to one of the FUNC_XXX values
   *  found in {@link com.sun.org.apache.xpath.internal.compiler.FunctionTable}, but may
   *  be a value installed by an external module.  */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FuncLoader.java
public class FuncLoader

/**
 * Lazy load of functions into the function table as needed, so we don't
 * have to load all the functions allowed in XPath and XSLT on startup.
 * @xsl.usage advanced
 */
