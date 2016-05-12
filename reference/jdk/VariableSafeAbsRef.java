_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/VariableSafeAbsRef.java
  public XObject execute(XPathContext xctxt, boolean destructiveOK)

  /**
   * Dereference the variable, and return the reference value.  Note that lazy
   * evaluation will occur.  If a variable within scope is not found, a warning
   * will be sent to the error listener, and an empty nodeset will be returned.
   *
   *
   * @param xctxt The runtime execution context.
   *
   * @return The evaluated variable, or an empty nodeset if not found.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/VariableSafeAbsRef.java
public class VariableSafeAbsRef extends Variable

/**
 * This is a "smart" variable reference that is used in situations where
 * an absolute path is optimized into a variable reference, but may
 * be used in some situations where the document context may have changed.
 * For instance, in select="document(doc/@href)//name[//salary &gt; 7250]", the
 * root in the predicate will be different for each node in the set.  While
 * this is easy to detect statically in this case, in other cases static
 * detection would be very hard or impossible.  So, this class does a dynamic check
 * to make sure the document context of the referenced variable is the same as
 * the current document context, and, if it is not, execute the referenced variable's
 * expression with the current context instead.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/VariableSafeAbsRef.java
  public XObject execute(XPathContext xctxt, boolean destructiveOK)

  /**
   * Dereference the variable, and return the reference value.  Note that lazy
   * evaluation will occur.  If a variable within scope is not found, a warning
   * will be sent to the error listener, and an empty nodeset will be returned.
   *
   *
   * @param xctxt The runtime execution context.
   *
   * @return The evaluated variable, or an empty nodeset if not found.
   *
   * @throws javax.xml.transform.TransformerException
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/operations/VariableSafeAbsRef.java
public class VariableSafeAbsRef extends Variable

/**
 * This is a "smart" variable reference that is used in situations where
 * an absolute path is optimized into a variable reference, but may
 * be used in some situations where the document context may have changed.
 * For instance, in select="document(doc/@href)//name[//salary &gt; 7250]", the
 * root in the predicate will be different for each node in the set.  While
 * this is easy to detect statically in this case, in other cases static
 * detection would be very hard or impossible.  So, this class does a dynamic check
 * to make sure the document context of the referenced variable is the same as
 * the current document context, and, if it is not, execute the referenced variable's
 * expression with the current context instead.
 */
