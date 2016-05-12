_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context, int expandedTypeID)

    /**
     * By the nature of the stateless traversal, the context node can not be
     * returned or the iteration will go into an infinate loop.  So to traverse
     * an axis, the first function must be used to get the first node.
     *
     * <p>This method needs to be overloaded only by those axis that process
     * the self node. <\p>
     *
     * @param context The context node of this traversal. This is the point
     * of origin for the traversal -- its "root node" or starting point.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context)

    /**
     * Return the root.
     *
     * @param context The context node of this traversal.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected int getSubtreeRoot(int handle)

    /**
     * Get the first potential identity that can be returned.
     * @param handle handle to the root context.
     * @return identity of the root of the subtree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected int getFirstPotential(int identity)

    /**
     * Get the first potential identity that can be returned, which is the axis
     * root context in this case.
     *
     * @param identity The node identity of the root context of the traversal.
     *
     * @return The identity argument.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class DescendantFromRootTraverser extends DescendantTraverser

  /**
   * A non-xpath axis, returns all nodes that aren't namespaces or attributes,
   * from but not including the root.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context, int expandedTypeID)

    /**
     * By the nature of the stateless traversal, the context node can not be
     * returned or the iteration will go into an infinate loop.  So to traverse
     * an axis, the first function must be used to get the first node.
     *
     * <p>This method needs to be overloaded only by those axis that process
     * the self node. <\p>
     *
     * @param context The context node of this traversal. This is the point
     * of origin for the traversal -- its "root node" or starting point.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context)

    /**
     * Return the root.
     *
     * @param context The context node of this traversal.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected int getSubtreeRoot(int handle)

    /**
     * Get the first potential identity that can be returned.
     * @param handle handle to the root context.
     * @return identity of the root of the subtree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected int getFirstPotential(int identity)

    /**
     * Get the first potential identity that can be returned, which is the axis
     * root context in this case.
     *
     * @param identity The node identity of the root context of the traversal.
     *
     * @return The identity argument.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class DescendantOrSelfFromRootTraverser extends DescendantTraverser

  /**
   * A non-xpath axis, returns all nodes that aren't namespaces or attributes,
   * from and including the root.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return Always return NULL for this axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context, int expandedTypeID)

    /**
     * Return the root if it matches the expanded type ID,
     * else return null (nothing found)
     *
     * @param context The context node of this traversal.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class RootTraverser extends AllFromRootTraverser

  /**
   * Implements traversal of the Self axis.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context, int expandedTypeID)

    /**
     * Return the root if it matches the expanded type ID.
     *
     * @param context The context node of this traversal.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context)

    /**
     * Return the root.
     *
     * @param context The context node of this traversal.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class AllFromRootTraverser extends AllFromNodeTraverser

  /**
   * Implements traversal of the Ancestor access, in reverse document order.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return Always return NULL for this axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context, int expandedTypeID)

    /**
     * By the nature of the stateless traversal, the context node can not be
     * returned or the iteration will go into an infinate loop.  To see if
     * the self node should be processed, use this function.  If the context
     * node does not match the expanded type ID, this function will return
     * false.
     *
     * @param context The context node of this traversal.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context)

    /**
     * By the nature of the stateless traversal, the context node can not be
     * returned or the iteration will go into an infinate loop.  To see if
     * the self node should be processed, use this function.
     *
     * @param context The context node of this traversal.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class SelfTraverser extends DTMAxisTraverser

  /**
   * Implements traversal of the Self axis.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class PrecedingSiblingTraverser extends DTMAxisTraverser

  /**
   * Implements traversal of the Ancestor access, in reverse document order.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class PrecedingAndAncestorTraverser extends DTMAxisTraverser

  /**
   * Implements traversal of the Ancestor and the Preceding axis,
   * in reverse document order.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected boolean isAncestor(int contextIdent, int currentIdent)

    /**
     * Tell if the current identity is an ancestor of the context identity.
     * This is an expensive operation, made worse by the stateless traversal.
     * But the preceding axis is used fairly infrequently.
     *
     * @param contextIdent The context node of the axis traversal.
     * @param currentIdent The node in question.
     * @return true if the currentIdent node is an ancestor of contextIdent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class PrecedingTraverser extends DTMAxisTraverser

  /**
   * Implements traversal of the Ancestor access, in reverse document order.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int current, int expandedTypeID)

    /**
     * By the nature of the stateless traversal, the context node can not be
     * returned or the iteration will go into an infinate loop.  So to traverse
     * an axis, the first function must be used to get the first node.
     *
     * <p>This method needs to be overloaded only by those axis that process
     * the self node. <\p>
     *
     * @param context The context node of this traversal. This is the point
     * of origin for the traversal -- its "root node" or starting point.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context)

    /**
     * By the nature of the stateless traversal, the context node can not be
     * returned or the iteration will go into an infinate loop.  So to traverse
     * an axis, the first function must be used to get the first node.
     *
     * <p>This method needs to be overloaded only by those axis that process
     * the self node. <\p>
     *
     * @param context The context node of this traversal. This is the point
     * that the traversal starts from.
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class ParentTraverser extends DTMAxisTraverser

  /**
   * Implements traversal of the Ancestor access, in reverse document order.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class NamespaceTraverser extends DTMAxisTraverser

  /**
   * Implements traversal of the Ancestor access, in reverse document order.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class NamespaceDeclsTraverser extends DTMAxisTraverser

  /**
   * Implements traversal of the Ancestor access, in reverse document order.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class FollowingSiblingTraverser extends DTMAxisTraverser

  /**
   * Implements traversal of the Ancestor access, in reverse document order.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context, int expandedTypeID)

    /**
     * Get the first of the following.
     *
     * @param context The context node of this traversal. This is the point
     * of origin for the traversal -- its "root node" or starting point.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context)

    /**
     * Get the first of the following.
     *
     * @param context The context node of this traversal. This is the point
     * that the traversal starts from.
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class FollowingTraverser extends DescendantTraverser

  /**
   * Implements traversal of the following access, in document order.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class AllFromNodeTraverser extends DescendantOrSelfTraverser

  /**
   * Implements traversal of the entire subtree, including the root node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context)

    /**
     * By the nature of the stateless traversal, the context node can not be
     * returned or the iteration will go into an infinate loop.  To see if
     * the self node should be processed, use this function.
     *
     * @param context The context node of this traversal.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected int getFirstPotential(int identity)

    /**
     * Get the first potential identity that can be returned, which is the
     * axis context, in this case.
     *
     * @param identity The node identity of the root context of the traversal.
     *
     * @return The axis context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class DescendantOrSelfTraverser extends DescendantTraverser

  /**
   * Implements traversal of the Ancestor access, in reverse document order.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context, int expandedTypeID)

    /**
     * By the nature of the stateless traversal, the context node can not be
     * returned or the iteration will go into an infinate loop.  So to traverse
     * an axis, the first function must be used to get the first node.
     *
     * <p>This method needs to be overloaded only by those axis that process
     * the self node. <\p>
     *
     * @param context The context node of this traversal. This is the point
     * of origin for the traversal -- its "root node" or starting point.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected boolean isAfterAxis(int axisRoot, int identity)

    /**
     * Tell if a node is outside the axis being traversed.  This method must be
     * implemented by derived classes, and must be robust enough to handle any
     * node that occurs after the axis root.
     *
     * @param axisRoot The root identity of the axis.
     * @param identity The node in question.
     *
     * @return true if the given node falls outside the axis being traversed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected boolean isDescendant(int subtreeRootIdentity, int identity)

    /**
     * Tell if this node identity is a descendant.  Assumes that
     * the node info for the element has already been obtained.
     *
     * %REVIEW% This is really parentFollowsRootInDocumentOrder ...
     * which fails if the parent starts after the root ends.
     * May be sufficient for this class's logic, but misleadingly named!
     *
     * @param subtreeRootIdentity The root context of the subtree in question.
     * @param identity The index number of the node in question.
     * @return true if the index is a descendant of _startNode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected int getSubtreeRoot(int handle)

    /**
     * Get the subtree root identity from the handle that was passed in by
     * the caller.  Derived classes may override this to change the root
     * context of the traversal.
     *
     * @param handle handle to the root context.
     * @return identity of the root of the subtree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected boolean axisHasBeenProcessed(int axisRoot)

    /**
     * Tell if the axis has been fully processed to tell if a the wait for
     * an arriving node should terminate.
     *
     * @param axisRoot The root identity of the axis.
     *
     * @return true if the axis has been fully processed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected int getFirstPotential(int identity)

    /**
     * Get the first potential identity that can be returned.  This should
     * be overridded by classes that need to return the self node.
     *
     * @param identity The node identity of the root context of the traversal.
     *
     * @return The first potential node that can be in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class DescendantTraverser extends IndexedDTMAxisTraverser

  /**
   * Implements traversal of the Ancestor access, in reverse document order.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected int getNextIndexed(int axisRoot, int nextPotential,
                                 int expandedTypeID)

    /**
     * Get the next indexed node that matches the expanded type ID.  Before
     * calling this function, one should first call
     * {@link #isIndexed(int) isIndexed} to make sure that the index can
     * contain nodes that match the given expanded type ID.
     *
     * @param axisRoot The root identity of the axis.
     * @param nextPotential The node found must match or occur after this node.
     * @param expandedTypeID The expanded type ID for the request.
     *
     * @return The node ID or NULL if not found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected abstract boolean axisHasBeenProcessed(int axisRoot);

    /**
     * Tell if the axis has been fully processed to tell if a the wait for
     * an arriving node should terminate.  This method must be implemented
     * be a derived class.
     *
     * @param axisRoot The root identity of the axis.
     *
     * @return true if the axis has been fully processed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected abstract boolean isAfterAxis(int axisRoot, int identity);

    /**
     * Tell if a node is outside the axis being traversed.  This method must be
     * implemented by derived classes, and must be robust enough to handle any
     * node that occurs after the axis root.
     *
     * @param axisRoot The root identity of the axis.
     * @param identity The node in question.
     *
     * @return true if the given node falls outside the axis being traversed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected final boolean isIndexed(int expandedTypeID)

    /**
     * Tell if the indexing is on and the given expanded type ID matches
     * what is in the indexes.  Derived classes should call this before
     * calling {@link #getNextIndexed(int, int, int) getNextIndexed} method.
     *
     * @param expandedTypeID The expanded type ID being requested.
     *
     * @return true if it is OK to call the
     *         {@link #getNextIndexed(int, int, int) getNextIndexed} method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private abstract class IndexedDTMAxisTraverser extends DTMAxisTraverser

  /**
   * Super class for derived classes that want a convenient way to access
   * the indexing mechanism.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context, int expandedTypeID)

    /**
     * By the nature of the stateless traversal, the context node can not be
     * returned or the iteration will go into an infinate loop.  So to traverse
     * an axis, the first function must be used to get the first node.
     *
     * <p>This method needs to be overloaded only by those axis that process
     * the self node. <\p>
     *
     * @param context The context node of this traversal. This is the point
     * of origin for the traversal -- its "root node" or starting point.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context)

    /**
     * By the nature of the stateless traversal, the context node can not be
     * returned or the iteration will go into an infinate loop.  So to traverse
     * an axis, the first function must be used to get the first node.
     *
     * <p>This method needs to be overloaded only by those axis that process
     * the self node. <\p>
     *
     * @param context The context node of this traversal. This is the point
     * that the traversal starts from.
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected int getNextIndexed(int axisRoot, int nextPotential,
                                 int expandedTypeID)

    /**
     * Get the next indexed node that matches the expanded type ID.  Before
     * calling this function, one should first call
     * {@link #isIndexed(int) isIndexed} to make sure that the index can
     * contain nodes that match the given expanded type ID.
     *
     * @param axisRoot The root identity of the axis.
     * @param nextPotential The node found must match or occur after this node.
     * @param expandedTypeID The expanded type ID for the request.
     *
     * @return The node ID or NULL if not found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class ChildTraverser extends DTMAxisTraverser

  /**
   * Implements traversal of the Ancestor access, in reverse document order.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class AttributeTraverser extends DTMAxisTraverser

  /**
   * Implements traversal of the Attribute access
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context, int expandedTypeID)

    /**
     * By the nature of the stateless traversal, the context node can not be
     * returned or the iteration will go into an infinate loop.  To see if
     * the self node should be processed, use this function.  If the context
     * node does not match the expanded type ID, this function will return
     * false.
     *
     * @param context The context node of this traversal.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context)

    /**
     * By the nature of the stateless traversal, the context node can not be
     * returned or the iteration will go into an infinate loop.  To see if
     * the self node should be processed, use this function.
     *
     * @param context The context node of this traversal.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class AncestorOrSelfTraverser extends AncestorTraverser

  /**
   * Implements traversal of the Ancestor access, in reverse document order.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node if this iteration.
     * @param current The current node of the iteration.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class AncestorTraverser extends DTMAxisTraverser

  /**
   * Implements traversal of the Ancestor access, in reverse document order.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  public DTMAxisTraverser getAxisTraverser(final int axis)

  /**
   * This returns a stateless "traverser", that can navigate
   * over an XPath axis, though perhaps not in document order.
   *
   * @param axis One of Axes.ANCESTORORSELF, etc.
   *
   * @return A DTMAxisTraverser, or null if the given axis isn't supported.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  public DTMDefaultBaseTraversers(DTMManager mgr, Source source,
                                  int dtmIdentity,
                                  DTMWSFilter whiteSpaceFilter,
                                  XMLStringFactory xstringfactory,
                                  boolean doIndexing,
                                  int blocksize,
                                  boolean usePrevsib,
                                  boolean newNameTable)

  /**
   * Construct a DTMDefaultBaseTraversers object from a DOM node.
   *
   * @param mgr The DTMManager who owns this DTM.
   * @param source The object that is used to specify the construction source.
   * @param dtmIdentity The DTM identity ID for this DTM.
   * @param whiteSpaceFilter The white space filter for this DTM, which may
   *                         be null.
   * @param xstringfactory The factory to use for creating XMLStrings.
   * @param doIndexing true if the caller considers it worth it to use
   *                   indexing schemes.
   * @param blocksize The block size of the DTM.
   * @param usePrevsib true if we want to build the previous sibling node array.
   * @param newNameTable true if we want to use a new ExpandedNameTable for this DTM.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  public DTMDefaultBaseTraversers(DTMManager mgr, Source source,
                                  int dtmIdentity,
                                  DTMWSFilter whiteSpaceFilter,
                                  XMLStringFactory xstringfactory,
                                  boolean doIndexing)

  /**
   * Construct a DTMDefaultBaseTraversers object from a DOM node.
   *
   * @param mgr The DTMManager who owns this DTM.
   * @param source The object that is used to specify the construction source.
   * @param dtmIdentity The DTM identity ID for this DTM.
   * @param whiteSpaceFilter The white space filter for this DTM, which may
   *                         be null.
   * @param xstringfactory The factory to use for creating XMLStrings.
   * @param doIndexing true if the caller considers it worth it to use
   *                   indexing schemes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
public abstract class DTMDefaultBaseTraversers extends DTMDefaultBase

/**
 * This class implements the traversers for DTMDefaultBase.
 *
 * PLEASE NOTE that the public interface for all traversers should be
 * in terms of DTM Node Handles... but they may use the internal node
 * identity indices within their logic, for efficiency's sake. Be very
 * careful to avoid confusing these when maintaining this code.
 * */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context, int expandedTypeID)

    /**
     * By the nature of the stateless traversal, the context node can not be
     * returned or the iteration will go into an infinate loop.  So to traverse
     * an axis, the first function must be used to get the first node.
     *
     * <p>This method needs to be overloaded only by those axis that process
     * the self node. <\p>
     *
     * @param context The context node of this traversal. This is the point
     * of origin for the traversal -- its "root node" or starting point.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context)

    /**
     * Return the root.
     *
     * @param context The context node of this traversal.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected int getSubtreeRoot(int handle)

    /**
     * Get the first potential identity that can be returned.
     * @param handle handle to the root context.
     * @return identity of the root of the subtree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected int getFirstPotential(int identity)

    /**
     * Get the first potential identity that can be returned, which is the axis
     * root context in this case.
     *
     * @param identity The node identity of the root context of the traversal.
     *
     * @return The identity argument.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class DescendantFromRootTraverser extends DescendantTraverser

  /**
   * A non-xpath axis, returns all nodes that aren't namespaces or attributes,
   * from but not including the root.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context, int expandedTypeID)

    /**
     * By the nature of the stateless traversal, the context node can not be
     * returned or the iteration will go into an infinate loop.  So to traverse
     * an axis, the first function must be used to get the first node.
     *
     * <p>This method needs to be overloaded only by those axis that process
     * the self node. <\p>
     *
     * @param context The context node of this traversal. This is the point
     * of origin for the traversal -- its "root node" or starting point.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context)

    /**
     * Return the root.
     *
     * @param context The context node of this traversal.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected int getSubtreeRoot(int handle)

    /**
     * Get the first potential identity that can be returned.
     * @param handle handle to the root context.
     * @return identity of the root of the subtree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected int getFirstPotential(int identity)

    /**
     * Get the first potential identity that can be returned, which is the axis
     * root context in this case.
     *
     * @param identity The node identity of the root context of the traversal.
     *
     * @return The identity argument.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class DescendantOrSelfFromRootTraverser extends DescendantTraverser

  /**
   * A non-xpath axis, returns all nodes that aren't namespaces or attributes,
   * from and including the root.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return Always return NULL for this axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context, int expandedTypeID)

    /**
     * Return the root if it matches the expanded type ID,
     * else return null (nothing found)
     *
     * @param context The context node of this traversal.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class RootTraverser extends AllFromRootTraverser

  /**
   * Implements traversal of the Self axis.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context, int expandedTypeID)

    /**
     * Return the root if it matches the expanded type ID.
     *
     * @param context The context node of this traversal.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context)

    /**
     * Return the root.
     *
     * @param context The context node of this traversal.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class AllFromRootTraverser extends AllFromNodeTraverser

  /**
   * Implements traversal of the Ancestor access, in reverse document order.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return Always return NULL for this axis.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context, int expandedTypeID)

    /**
     * By the nature of the stateless traversal, the context node can not be
     * returned or the iteration will go into an infinate loop.  To see if
     * the self node should be processed, use this function.  If the context
     * node does not match the expanded type ID, this function will return
     * false.
     *
     * @param context The context node of this traversal.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context)

    /**
     * By the nature of the stateless traversal, the context node can not be
     * returned or the iteration will go into an infinate loop.  To see if
     * the self node should be processed, use this function.
     *
     * @param context The context node of this traversal.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class SelfTraverser extends DTMAxisTraverser

  /**
   * Implements traversal of the Self axis.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class PrecedingSiblingTraverser extends DTMAxisTraverser

  /**
   * Implements traversal of the Ancestor access, in reverse document order.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class PrecedingAndAncestorTraverser extends DTMAxisTraverser

  /**
   * Implements traversal of the Ancestor and the Preceding axis,
   * in reverse document order.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected boolean isAncestor(int contextIdent, int currentIdent)

    /**
     * Tell if the current identity is an ancestor of the context identity.
     * This is an expensive operation, made worse by the stateless traversal.
     * But the preceding axis is used fairly infrequently.
     *
     * @param contextIdent The context node of the axis traversal.
     * @param currentIdent The node in question.
     * @return true if the currentIdent node is an ancestor of contextIdent.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class PrecedingTraverser extends DTMAxisTraverser

  /**
   * Implements traversal of the Ancestor access, in reverse document order.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int current, int expandedTypeID)

    /**
     * By the nature of the stateless traversal, the context node can not be
     * returned or the iteration will go into an infinate loop.  So to traverse
     * an axis, the first function must be used to get the first node.
     *
     * <p>This method needs to be overloaded only by those axis that process
     * the self node. <\p>
     *
     * @param context The context node of this traversal. This is the point
     * of origin for the traversal -- its "root node" or starting point.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context)

    /**
     * By the nature of the stateless traversal, the context node can not be
     * returned or the iteration will go into an infinate loop.  So to traverse
     * an axis, the first function must be used to get the first node.
     *
     * <p>This method needs to be overloaded only by those axis that process
     * the self node. <\p>
     *
     * @param context The context node of this traversal. This is the point
     * that the traversal starts from.
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class ParentTraverser extends DTMAxisTraverser

  /**
   * Implements traversal of the Ancestor access, in reverse document order.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class NamespaceTraverser extends DTMAxisTraverser

  /**
   * Implements traversal of the Ancestor access, in reverse document order.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class NamespaceDeclsTraverser extends DTMAxisTraverser

  /**
   * Implements traversal of the Ancestor access, in reverse document order.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class FollowingSiblingTraverser extends DTMAxisTraverser

  /**
   * Implements traversal of the Ancestor access, in reverse document order.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context, int expandedTypeID)

    /**
     * Get the first of the following.
     *
     * @param context The context node of this traversal. This is the point
     * of origin for the traversal -- its "root node" or starting point.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context)

    /**
     * Get the first of the following.
     *
     * @param context The context node of this traversal. This is the point
     * that the traversal starts from.
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class FollowingTraverser extends DescendantTraverser

  /**
   * Implements traversal of the following access, in document order.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class AllFromNodeTraverser extends DescendantOrSelfTraverser

  /**
   * Implements traversal of the entire subtree, including the root node.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context)

    /**
     * By the nature of the stateless traversal, the context node can not be
     * returned or the iteration will go into an infinate loop.  To see if
     * the self node should be processed, use this function.
     *
     * @param context The context node of this traversal.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected int getFirstPotential(int identity)

    /**
     * Get the first potential identity that can be returned, which is the
     * axis context, in this case.
     *
     * @param identity The node identity of the root context of the traversal.
     *
     * @return The axis context.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class DescendantOrSelfTraverser extends DescendantTraverser

  /**
   * Implements traversal of the Ancestor access, in reverse document order.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context, int expandedTypeID)

    /**
     * By the nature of the stateless traversal, the context node can not be
     * returned or the iteration will go into an infinate loop.  So to traverse
     * an axis, the first function must be used to get the first node.
     *
     * <p>This method needs to be overloaded only by those axis that process
     * the self node. <\p>
     *
     * @param context The context node of this traversal. This is the point
     * of origin for the traversal -- its "root node" or starting point.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected boolean isAfterAxis(int axisRoot, int identity)

    /**
     * Tell if a node is outside the axis being traversed.  This method must be
     * implemented by derived classes, and must be robust enough to handle any
     * node that occurs after the axis root.
     *
     * @param axisRoot The root identity of the axis.
     * @param identity The node in question.
     *
     * @return true if the given node falls outside the axis being traversed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected boolean isDescendant(int subtreeRootIdentity, int identity)

    /**
     * Tell if this node identity is a descendant.  Assumes that
     * the node info for the element has already been obtained.
     *
     * %REVIEW% This is really parentFollowsRootInDocumentOrder ...
     * which fails if the parent starts after the root ends.
     * May be sufficient for this class's logic, but misleadingly named!
     *
     * @param subtreeRootIdentity The root context of the subtree in question.
     * @param identity The index number of the node in question.
     * @return true if the index is a descendant of _startNode.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected int getSubtreeRoot(int handle)

    /**
     * Get the subtree root identity from the handle that was passed in by
     * the caller.  Derived classes may override this to change the root
     * context of the traversal.
     *
     * @param handle handle to the root context.
     * @return identity of the root of the subtree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected boolean axisHasBeenProcessed(int axisRoot)

    /**
     * Tell if the axis has been fully processed to tell if a the wait for
     * an arriving node should terminate.
     *
     * @param axisRoot The root identity of the axis.
     *
     * @return true if the axis has been fully processed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected int getFirstPotential(int identity)

    /**
     * Get the first potential identity that can be returned.  This should
     * be overridded by classes that need to return the self node.
     *
     * @param identity The node identity of the root context of the traversal.
     *
     * @return The first potential node that can be in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class DescendantTraverser extends IndexedDTMAxisTraverser

  /**
   * Implements traversal of the Ancestor access, in reverse document order.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected int getNextIndexed(int axisRoot, int nextPotential,
                                 int expandedTypeID)

    /**
     * Get the next indexed node that matches the expanded type ID.  Before
     * calling this function, one should first call
     * {@link #isIndexed(int) isIndexed} to make sure that the index can
     * contain nodes that match the given expanded type ID.
     *
     * @param axisRoot The root identity of the axis.
     * @param nextPotential The node found must match or occur after this node.
     * @param expandedTypeID The expanded type ID for the request.
     *
     * @return The node ID or NULL if not found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected abstract boolean axisHasBeenProcessed(int axisRoot);

    /**
     * Tell if the axis has been fully processed to tell if a the wait for
     * an arriving node should terminate.  This method must be implemented
     * be a derived class.
     *
     * @param axisRoot The root identity of the axis.
     *
     * @return true if the axis has been fully processed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected abstract boolean isAfterAxis(int axisRoot, int identity);

    /**
     * Tell if a node is outside the axis being traversed.  This method must be
     * implemented by derived classes, and must be robust enough to handle any
     * node that occurs after the axis root.
     *
     * @param axisRoot The root identity of the axis.
     * @param identity The node in question.
     *
     * @return true if the given node falls outside the axis being traversed.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected final boolean isIndexed(int expandedTypeID)

    /**
     * Tell if the indexing is on and the given expanded type ID matches
     * what is in the indexes.  Derived classes should call this before
     * calling {@link #getNextIndexed(int, int, int) getNextIndexed} method.
     *
     * @param expandedTypeID The expanded type ID being requested.
     *
     * @return true if it is OK to call the
     *         {@link #getNextIndexed(int, int, int) getNextIndexed} method.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private abstract class IndexedDTMAxisTraverser extends DTMAxisTraverser

  /**
   * Super class for derived classes that want a convenient way to access
   * the indexing mechanism.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context, int expandedTypeID)

    /**
     * By the nature of the stateless traversal, the context node can not be
     * returned or the iteration will go into an infinate loop.  So to traverse
     * an axis, the first function must be used to get the first node.
     *
     * <p>This method needs to be overloaded only by those axis that process
     * the self node. <\p>
     *
     * @param context The context node of this traversal. This is the point
     * of origin for the traversal -- its "root node" or starting point.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context)

    /**
     * By the nature of the stateless traversal, the context node can not be
     * returned or the iteration will go into an infinate loop.  So to traverse
     * an axis, the first function must be used to get the first node.
     *
     * <p>This method needs to be overloaded only by those axis that process
     * the self node. <\p>
     *
     * @param context The context node of this traversal. This is the point
     * that the traversal starts from.
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    protected int getNextIndexed(int axisRoot, int nextPotential,
                                 int expandedTypeID)

    /**
     * Get the next indexed node that matches the expanded type ID.  Before
     * calling this function, one should first call
     * {@link #isIndexed(int) isIndexed} to make sure that the index can
     * contain nodes that match the given expanded type ID.
     *
     * @param axisRoot The root identity of the axis.
     * @param nextPotential The node found must match or occur after this node.
     * @param expandedTypeID The expanded type ID for the request.
     *
     * @return The node ID or NULL if not found.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class ChildTraverser extends DTMAxisTraverser

  /**
   * Implements traversal of the Ancestor access, in reverse document order.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class AttributeTraverser extends DTMAxisTraverser

  /**
   * Implements traversal of the Attribute access
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context, int expandedTypeID)

    /**
     * By the nature of the stateless traversal, the context node can not be
     * returned or the iteration will go into an infinate loop.  To see if
     * the self node should be processed, use this function.  If the context
     * node does not match the expanded type ID, this function will return
     * false.
     *
     * @param context The context node of this traversal.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int first(int context)

    /**
     * By the nature of the stateless traversal, the context node can not be
     * returned or the iteration will go into an infinate loop.  To see if
     * the self node should be processed, use this function.
     *
     * @param context The context node of this traversal.
     *
     * @return the first node in the traversal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class AncestorOrSelfTraverser extends AncestorTraverser

  /**
   * Implements traversal of the Ancestor access, in reverse document order.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current, int expandedTypeID)

    /**
     * Traverse to the next node after the current node that is matched
     * by the expanded type ID.
     *
     * @param context The context node of this iteration.
     * @param current The current node of the iteration.
     * @param expandedTypeID The expanded type ID that must match.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
    public int next(int context, int current)

    /**
     * Traverse to the next node after the current node.
     *
     * @param context The context node if this iteration.
     * @param current The current node of the iteration.
     *
     * @return the next node in the iteration, or DTM.NULL.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  private class AncestorTraverser extends DTMAxisTraverser

  /**
   * Implements traversal of the Ancestor access, in reverse document order.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  public DTMAxisTraverser getAxisTraverser(final int axis)

  /**
   * This returns a stateless "traverser", that can navigate
   * over an XPath axis, though perhaps not in document order.
   *
   * @param axis One of Axes.ANCESTORORSELF, etc.
   *
   * @return A DTMAxisTraverser, or null if the given axis isn't supported.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  public DTMDefaultBaseTraversers(DTMManager mgr, Source source,
                                  int dtmIdentity,
                                  DTMWSFilter whiteSpaceFilter,
                                  XMLStringFactory xstringfactory,
                                  boolean doIndexing,
                                  int blocksize,
                                  boolean usePrevsib,
                                  boolean newNameTable)

  /**
   * Construct a DTMDefaultBaseTraversers object from a DOM node.
   *
   * @param mgr The DTMManager who owns this DTM.
   * @param source The object that is used to specify the construction source.
   * @param dtmIdentity The DTM identity ID for this DTM.
   * @param whiteSpaceFilter The white space filter for this DTM, which may
   *                         be null.
   * @param xstringfactory The factory to use for creating XMLStrings.
   * @param doIndexing true if the caller considers it worth it to use
   *                   indexing schemes.
   * @param blocksize The block size of the DTM.
   * @param usePrevsib true if we want to build the previous sibling node array.
   * @param newNameTable true if we want to use a new ExpandedNameTable for this DTM.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
  public DTMDefaultBaseTraversers(DTMManager mgr, Source source,
                                  int dtmIdentity,
                                  DTMWSFilter whiteSpaceFilter,
                                  XMLStringFactory xstringfactory,
                                  boolean doIndexing)

  /**
   * Construct a DTMDefaultBaseTraversers object from a DOM node.
   *
   * @param mgr The DTMManager who owns this DTM.
   * @param source The object that is used to specify the construction source.
   * @param dtmIdentity The DTM identity ID for this DTM.
   * @param whiteSpaceFilter The white space filter for this DTM, which may
   *                         be null.
   * @param xstringfactory The factory to use for creating XMLStrings.
   * @param doIndexing true if the caller considers it worth it to use
   *                   indexing schemes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xml/internal/dtm/ref/DTMDefaultBaseTraversers.java
public abstract class DTMDefaultBaseTraversers extends DTMDefaultBase

/**
 * This class implements the traversers for DTMDefaultBase.
 *
 * PLEASE NOTE that the public interface for all traversers should be
 * in terms of DTM Node Handles... but they may use the internal node
 * identity indices within their logic, for efficiency's sake. Be very
 * careful to avoid confusing these when maintaining this code.
 * */
