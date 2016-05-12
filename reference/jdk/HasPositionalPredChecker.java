_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/HasPositionalPredChecker.java
  public boolean visitPredicate(ExpressionOwner owner, Expression pred)

  /**
   * Visit a predicate within a location path.  Note that there isn't a
   * proper unique component for predicates, and that the expression will
   * be called also for whatever type Expression is.
   *
   * @param owner The owner of the expression, to which the expression can
   *              be reset if rewriting takes place.
   * @param pred The predicate object.
   * @return true if the sub expressions should be traversed.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/HasPositionalPredChecker.java
//      public boolean visitVariableRef(ExpressionOwner owner, Variable var)

//      /**
//       * Visit a variable reference.
//       * @param owner The owner of the expression, to which the expression can
//       *              be reset if rewriting takes place.
//       * @param var The variable reference object.
//       * @return true if the sub expressions should be traversed.
//       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/HasPositionalPredChecker.java
        public boolean visitFunction(ExpressionOwner owner, Function func)

        /**
         * Visit a function.
         * @param owner The owner of the expression, to which the expression can
         *              be reset if rewriting takes place.
         * @param func The function reference object.
         * @return true if the sub expressions should be traversed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/HasPositionalPredChecker.java
        public static boolean check(LocPathIterator path)

        /**
         * Process the LocPathIterator to see if it contains variables
         * or functions that may make it context dependent.
         * @param path LocPathIterator that is assumed to be absolute, but needs checking.
         * @return true if the path is confirmed to be absolute, false if it
         * may contain context dependencies.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/HasPositionalPredChecker.java
  public boolean visitPredicate(ExpressionOwner owner, Expression pred)

  /**
   * Visit a predicate within a location path.  Note that there isn't a
   * proper unique component for predicates, and that the expression will
   * be called also for whatever type Expression is.
   *
   * @param owner The owner of the expression, to which the expression can
   *              be reset if rewriting takes place.
   * @param pred The predicate object.
   * @return true if the sub expressions should be traversed.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/HasPositionalPredChecker.java
//      public boolean visitVariableRef(ExpressionOwner owner, Variable var)

//      /**
//       * Visit a variable reference.
//       * @param owner The owner of the expression, to which the expression can
//       *              be reset if rewriting takes place.
//       * @param var The variable reference object.
//       * @return true if the sub expressions should be traversed.
//       */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/HasPositionalPredChecker.java
        public boolean visitFunction(ExpressionOwner owner, Function func)

        /**
         * Visit a function.
         * @param owner The owner of the expression, to which the expression can
         *              be reset if rewriting takes place.
         * @param func The function reference object.
         * @return true if the sub expressions should be traversed.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/axes/HasPositionalPredChecker.java
        public static boolean check(LocPathIterator path)

        /**
         * Process the LocPathIterator to see if it contains variables
         * or functions that may make it context dependent.
         * @param path LocPathIterator that is assumed to be absolute, but needs checking.
         * @return true if the path is confirmed to be absolute, false if it
         * may contain context dependencies.
         */
