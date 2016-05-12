_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public boolean functionAvailable(String methName)

  /**
   * Tell if a built-in, non-namespaced function is available.
   *
   * @param methName The local name of the function.
   *
   * @return True if the function can be executed.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public int installFunction(String name, Class func)

  /**
   * Install a built-in function.
   * @param name The unqualified name of the function, must not be null
   * @param func A Implementation of an XPath Function object.
   * @return the position of the function in the internal index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  Object getFunctionID(String key){

  /**
   * Obtain a function ID from a given function name
   * @param key the function name in a java.lang.String format.
   * @return a function ID, which may correspond to one of the FUNC_XXX values
   * found in {@link com.sun.org.apache.xpath.internal.compiler.FunctionTable}, but may be a
   * value installed by an external module.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  Function getFunction(int which)

  /**
   * Obtain a new Function object from a function ID.
   *
   * @param which  The function ID, which may correspond to one of the FUNC_XXX
   *    values found in {@link com.sun.org.apache.xpath.internal.compiler.FunctionTable}, but may
   *    be a value installed by an external module.
   *
   * @return a a new Function instance.
   *
   * @throws javax.xml.transform.TransformerException if ClassNotFoundException,
   *    IllegalAccessException, or InstantiationException is thrown.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  String getFunctionName(int funcID) {

  /**
   * Return the name of the a function in the static table. Needed to avoid
   * making the table publicly available.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  private int m_funcNextFreeIndex = NUM_BUILT_IN_FUNCS;

  /**
   * The index to the next free function index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  private static final int NUM_ALLOWABLE_ADDINS = 30;

  /**
   * Number of built-in functions that may be added.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  private static final int NUM_BUILT_IN_FUNCS = 37;

  /**
   * Number of built in functions.  Be sure to update this as
   * built-in functions are added.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  private HashMap m_functionID_customer = new HashMap();

  /**
   * Table of function name to function ID associations for customized functions
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  private Class m_functions_customer[] = new Class[NUM_ALLOWABLE_ADDINS];

  /**
   * The function table contains customized functions
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  private static HashMap m_functionID = new HashMap();

  /** Table of function name to function ID associations. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  private static Class m_functions[];

  /**
   * The function table.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_DOCLOCATION = 35;

  /** The 'document-location()' id (Proprietary). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_UNPARSED_ENTITY_URI = 36;

  /** The 'unparsed-entity-uri()' id (XSLT). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_EXT_ELEM_AVAILABLE = 34;

  /** The 'element-available()' id (XSLT). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_EXT_FUNCTION_AVAILABLE = 33;

  /** The 'function-available()' id (XSLT). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_LANG = 32;

  /** The 'lang()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_SYSTEM_PROPERTY = 31;

  /** The 'system-property()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_STRING_LENGTH = 30;

  /** The 'string-length()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_SUBSTRING = 29;

  /** The 'substring()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_CONCAT = 27;

  /** The 'concat()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_TRANSLATE = 26;

  /** The 'translate()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_NORMALIZE_SPACE = 25;

  /** The 'normalize-space()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_SUBSTRING_AFTER = 24;

  /** The 'substring-after()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_SUBSTRING_BEFORE = 23;

  /** The 'substring-before()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_CONTAINS = 22;

  /** The 'contains()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_STARTS_WITH = 21;

  /** The 'starts-with()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_STRING = 20;

  /** The 'string()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_SUM = 19;

  /** The 'sum()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_ROUND = 18;

  /** The 'round()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_CEILING = 17;

  /** The 'ceiling()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_FLOOR = 16;

  /** The 'floor()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_NUMBER = 15;

  /** The 'number()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_BOOLEAN = 14;

  /** The 'boolean()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_FALSE = 13;

  /** The 'false()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_TRUE = 12;

  /** The 'true()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_NOT = 11;

  /** The 'not()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_GENERATE_ID = 10;

  /** The 'generate-id()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_QNAME = 9;

  /** The 'name()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_NAMESPACE = 8;

  /** The 'namespace-uri()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_LOCAL_PART = 7;

  /** The 'local-name()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_KEY = 5;

  /** The 'key()' id (XSLT). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_ID = 4;

  /** The 'id()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_COUNT = 3;

  /** The 'count()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_POSITION = 2;

  /** The 'position()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_LAST = 1;

  /** The 'last()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_CURRENT = 0;

  /** The 'current()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
public class FunctionTable

/**
 * The function table for XPath.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public boolean functionAvailable(String methName)

  /**
   * Tell if a built-in, non-namespaced function is available.
   *
   * @param methName The local name of the function.
   *
   * @return True if the function can be executed.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public int installFunction(String name, Class func)

  /**
   * Install a built-in function.
   * @param name The unqualified name of the function, must not be null
   * @param func A Implementation of an XPath Function object.
   * @return the position of the function in the internal index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  Object getFunctionID(String key){

  /**
   * Obtain a function ID from a given function name
   * @param key the function name in a java.lang.String format.
   * @return a function ID, which may correspond to one of the FUNC_XXX values
   * found in {@link com.sun.org.apache.xpath.internal.compiler.FunctionTable}, but may be a
   * value installed by an external module.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  Function getFunction(int which)

  /**
   * Obtain a new Function object from a function ID.
   *
   * @param which  The function ID, which may correspond to one of the FUNC_XXX
   *    values found in {@link com.sun.org.apache.xpath.internal.compiler.FunctionTable}, but may
   *    be a value installed by an external module.
   *
   * @return a a new Function instance.
   *
   * @throws javax.xml.transform.TransformerException if ClassNotFoundException,
   *    IllegalAccessException, or InstantiationException is thrown.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  String getFunctionName(int funcID) {

  /**
   * Return the name of the a function in the static table. Needed to avoid
   * making the table publicly available.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  private int m_funcNextFreeIndex = NUM_BUILT_IN_FUNCS;

  /**
   * The index to the next free function index.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  private static final int NUM_ALLOWABLE_ADDINS = 30;

  /**
   * Number of built-in functions that may be added.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  private static final int NUM_BUILT_IN_FUNCS = 37;

  /**
   * Number of built in functions.  Be sure to update this as
   * built-in functions are added.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  private HashMap m_functionID_customer = new HashMap();

  /**
   * Table of function name to function ID associations for customized functions
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  private Class m_functions_customer[] = new Class[NUM_ALLOWABLE_ADDINS];

  /**
   * The function table contains customized functions
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  private static HashMap m_functionID = new HashMap();

  /** Table of function name to function ID associations. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  private static Class m_functions[];

  /**
   * The function table.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_DOCLOCATION = 35;

  /** The 'document-location()' id (Proprietary). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_UNPARSED_ENTITY_URI = 36;

  /** The 'unparsed-entity-uri()' id (XSLT). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_EXT_ELEM_AVAILABLE = 34;

  /** The 'element-available()' id (XSLT). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_EXT_FUNCTION_AVAILABLE = 33;

  /** The 'function-available()' id (XSLT). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_LANG = 32;

  /** The 'lang()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_SYSTEM_PROPERTY = 31;

  /** The 'system-property()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_STRING_LENGTH = 30;

  /** The 'string-length()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_SUBSTRING = 29;

  /** The 'substring()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_CONCAT = 27;

  /** The 'concat()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_TRANSLATE = 26;

  /** The 'translate()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_NORMALIZE_SPACE = 25;

  /** The 'normalize-space()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_SUBSTRING_AFTER = 24;

  /** The 'substring-after()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_SUBSTRING_BEFORE = 23;

  /** The 'substring-before()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_CONTAINS = 22;

  /** The 'contains()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_STARTS_WITH = 21;

  /** The 'starts-with()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_STRING = 20;

  /** The 'string()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_SUM = 19;

  /** The 'sum()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_ROUND = 18;

  /** The 'round()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_CEILING = 17;

  /** The 'ceiling()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_FLOOR = 16;

  /** The 'floor()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_NUMBER = 15;

  /** The 'number()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_BOOLEAN = 14;

  /** The 'boolean()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_FALSE = 13;

  /** The 'false()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_TRUE = 12;

  /** The 'true()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_NOT = 11;

  /** The 'not()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_GENERATE_ID = 10;

  /** The 'generate-id()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_QNAME = 9;

  /** The 'name()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_NAMESPACE = 8;

  /** The 'namespace-uri()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_LOCAL_PART = 7;

  /** The 'local-name()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_KEY = 5;

  /** The 'key()' id (XSLT). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_ID = 4;

  /** The 'id()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_COUNT = 3;

  /** The 'count()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_POSITION = 2;

  /** The 'position()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_LAST = 1;

  /** The 'last()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
  public static final int FUNC_CURRENT = 0;

  /** The 'current()' id. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/compiler/FunctionTable.java
public class FunctionTable

/**
 * The function table for XPath.
 */
