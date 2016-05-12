_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
    <R,D> R accept(TreeVisitor<R,D> visitor, D data);

    /**
     * Accept method used to implement the visitor pattern.  The
     * visitor pattern is used to implement operations on trees.
     *
     * @param <R> result type of this operation.
     * @param <D> type of additional data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
    Kind getKind();

    /**
     * Gets the kind of this tree.
     *
     * @return the kind of this tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        OTHER(null);

        /**
         * An implementation-reserved node. This is the not the node
         * you are looking for.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        ANNOTATION_TYPE(ClassTree.class),

        /**
         * Used for instances of {@link ClassTree} representing annotation types.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        ENUM(ClassTree.class),

        /**
         * Used for instances of {@link ClassTree} representing enums.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        INTERFACE(ClassTree.class),

        /**
         * Used for instances of {@link ClassTree} representing interfaces.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        ERRONEOUS(ErroneousTree.class),

        /**
         * Used for instances of {@link ErroneousTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        SUPER_WILDCARD(WildcardTree.class),

        /**
         * Used for instances of {@link WildcardTree} representing
         * a super bounded wildcard type argument.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        EXTENDS_WILDCARD(WildcardTree.class),

        /**
         * Used for instances of {@link WildcardTree} representing
         * an extends bounded wildcard type argument.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        UNBOUNDED_WILDCARD(WildcardTree.class),

        /**
         * Used for instances of {@link WildcardTree} representing
         * an unbounded wildcard type argument.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        NULL_LITERAL(LiteralTree.class),

        /**
         * Used for instances of {@link LiteralTree} representing
         * the use of {@code null}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        STRING_LITERAL(LiteralTree.class),

        /**
         * Used for instances of {@link LiteralTree} representing
         * a string literal expression of type {@link String}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        CHAR_LITERAL(LiteralTree.class),

        /**
         * Used for instances of {@link LiteralTree} representing
         * a character literal expression of type {@code char}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        BOOLEAN_LITERAL(LiteralTree.class),

        /**
         * Used for instances of {@link LiteralTree} representing
         * a boolean literal expression of type {@code boolean}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        DOUBLE_LITERAL(LiteralTree.class),

        /**
         * Used for instances of {@link LiteralTree} representing
         * a floating-point literal expression of type {@code double}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        FLOAT_LITERAL(LiteralTree.class),

        /**
         * Used for instances of {@link LiteralTree} representing
         * a floating-point literal expression of type {@code float}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        LONG_LITERAL(LiteralTree.class),

        /**
         * Used for instances of {@link LiteralTree} representing
         * an integral literal expression of type {@code long}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        INT_LITERAL(LiteralTree.class),

        /**
         * Used for instances of {@link LiteralTree} representing
         * an integral literal expression of type {@code int}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        OR_ASSIGNMENT(CompoundAssignmentTree.class),

        /**
         * Used for instances of {@link CompoundAssignmentTree} representing
         * bitwise and logical "or" assignment {@code |=}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        XOR_ASSIGNMENT(CompoundAssignmentTree.class),

        /**
         * Used for instances of {@link CompoundAssignmentTree} representing
         * bitwise and logical "xor" assignment {@code ^=}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        AND_ASSIGNMENT(CompoundAssignmentTree.class),

        /**
         * Used for instances of {@link CompoundAssignmentTree} representing
         * bitwise and logical "and" assignment {@code &=}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        UNSIGNED_RIGHT_SHIFT_ASSIGNMENT(CompoundAssignmentTree.class),

        /**
         * Used for instances of {@link CompoundAssignmentTree} representing
         * unsigned right shift assignment {@code >>>=}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        RIGHT_SHIFT_ASSIGNMENT(CompoundAssignmentTree.class),

        /**
         * Used for instances of {@link CompoundAssignmentTree} representing
         * right shift assignment {@code >>=}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        LEFT_SHIFT_ASSIGNMENT(CompoundAssignmentTree.class),

        /**
         * Used for instances of {@link CompoundAssignmentTree} representing
         * left shift assignment {@code <<=}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        MINUS_ASSIGNMENT(CompoundAssignmentTree.class),

        /**
         * Used for instances of {@link CompoundAssignmentTree} representing
         * subtraction assignment {@code -=}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        PLUS_ASSIGNMENT(CompoundAssignmentTree.class),

        /**
         * Used for instances of {@link CompoundAssignmentTree} representing
         * addition or string concatenation assignment {@code +=}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        REMAINDER_ASSIGNMENT(CompoundAssignmentTree.class),

        /**
         * Used for instances of {@link CompoundAssignmentTree} representing
         * remainder assignment {@code %=}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        DIVIDE_ASSIGNMENT(CompoundAssignmentTree.class),

        /**
         * Used for instances of {@link CompoundAssignmentTree} representing
         * division assignment {@code /=}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        MULTIPLY_ASSIGNMENT(CompoundAssignmentTree.class),

        /**
         * Used for instances of {@link CompoundAssignmentTree} representing
         * multiplication assignment {@code *=}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        CONDITIONAL_OR(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * conditional-or {@code ||}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        CONDITIONAL_AND(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * conditional-and {@code &&}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        OR(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * bitwise and logical "or" {@code |}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        XOR(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * bitwise and logical "xor" {@code ^}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        AND(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * bitwise and logical "and" {@code &}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        NOT_EQUAL_TO(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * not-equal-to {@code !=}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        EQUAL_TO(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * equal-to {@code ==}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        GREATER_THAN_EQUAL(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * greater-than-equal {@code >=}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        LESS_THAN_EQUAL(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * less-than-equal {@code <=}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        GREATER_THAN(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * greater-than {@code >}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        LESS_THAN(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * less-than {@code <}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        UNSIGNED_RIGHT_SHIFT(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * unsigned right shift {@code >>>}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        RIGHT_SHIFT(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * right shift {@code >>}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        LEFT_SHIFT(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * left shift {@code <<}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        MINUS(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * subtraction {@code -}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        PLUS(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * addition or string concatenation {@code +}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        REMAINDER(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * remainder {@code %}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        DIVIDE(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * division {@code /}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        MULTIPLY(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * multiplication {@code *}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        LOGICAL_COMPLEMENT(UnaryTree.class),

        /**
         * Used for instances of {@link UnaryTree} representing logical
         * complement operator {@code !}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        BITWISE_COMPLEMENT(UnaryTree.class),

        /**
         * Used for instances of {@link UnaryTree} representing bitwise
         * complement operator {@code ~}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        UNARY_MINUS(UnaryTree.class),

        /**
         * Used for instances of {@link UnaryTree} representing unary minus
         * operator {@code -}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        UNARY_PLUS(UnaryTree.class),

        /**
         * Used for instances of {@link UnaryTree} representing unary plus
         * operator {@code +}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        PREFIX_DECREMENT(UnaryTree.class),

        /**
         * Used for instances of {@link UnaryTree} representing prefix
         * decrement operator {@code --}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        PREFIX_INCREMENT(UnaryTree.class),

        /**
         * Used for instances of {@link UnaryTree} representing prefix
         * increment operator {@code ++}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        POSTFIX_DECREMENT(UnaryTree.class),

        /**
         * Used for instances of {@link UnaryTree} representing postfix
         * decrement operator {@code --}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        POSTFIX_INCREMENT(UnaryTree.class),

        /**
         * Used for instances of {@link UnaryTree} representing postfix
         * increment operator {@code ++}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        WHILE_LOOP(WhileLoopTree.class),

        /**
         * Used for instances of {@link WhileLoopTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        VARIABLE(VariableTree.class),

        /**
         * Used for instances of {@link VariableTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        TYPE_PARAMETER(TypeParameterTree.class),

        /**
         * Used for instances of {@link TypeParameterTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        TYPE_CAST(TypeCastTree.class),

        /**
         * Used for instances of {@link TypeCastTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        INTERSECTION_TYPE(IntersectionTypeTree.class),

        /**
         * Used for instances of {@link IntersectionTypeTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        UNION_TYPE(UnionTypeTree.class),

        /**
         * Used for instances of {@link UnionTypeTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        PARAMETERIZED_TYPE(ParameterizedTypeTree.class),

        /**
         * Used for instances of {@link ParameterizedTypeTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        TRY(TryTree.class),

        /**
         * Used for instances of {@link TryTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        THROW(ThrowTree.class),

        /**
         * Used for instances of {@link ThrowTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        SYNCHRONIZED(SynchronizedTree.class),

        /**
         * Used for instances of {@link SynchronizedTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        SWITCH(SwitchTree.class),

        /**
         * Used for instances of {@link SwitchTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        EMPTY_STATEMENT(EmptyStatementTree.class),

        /**
         * Used for instances of {@link EmptyStatementTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        RETURN(ReturnTree.class),

        /**
         * Used for instances of {@link ReturnTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        PRIMITIVE_TYPE(PrimitiveTypeTree.class),

        /**
         * Used for instances of {@link PrimitiveTypeTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        PARENTHESIZED(ParenthesizedTree.class),

        /**
         * Used for instances of {@link ParenthesizedTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        LAMBDA_EXPRESSION(LambdaExpressionTree.class),

        /**
         * Used for instances of {@link LambdaExpressionTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        NEW_CLASS(NewClassTree.class),

        /**
         * Used for instances of {@link NewClassTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        NEW_ARRAY(NewArrayTree.class),

        /**
         * Used for instances of {@link NewArrayTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        MODIFIERS(ModifiersTree.class),

        /**
         * Used for instances of {@link ModifiersTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        METHOD_INVOCATION(MethodInvocationTree.class),

        /**
         * Used for instances of {@link MethodInvocationTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        METHOD(MethodTree.class),

        /**
         * Used for instances of {@link MethodTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        LABELED_STATEMENT(LabeledStatementTree.class),

        /**
         * Used for instances of {@link LabeledStatementTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        INSTANCE_OF(InstanceOfTree.class),

        /**
         * Used for instances of {@link InstanceOfTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        IMPORT(ImportTree.class),

        /**
         * Used for instances of {@link ImportTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        IF(IfTree.class),

        /**
         * Used for instances of {@link IfTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        IDENTIFIER(IdentifierTree.class),

        /**
         * Used for instances of {@link IdentifierTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        FOR_LOOP(ForLoopTree.class),

        /**
         * Used for instances of {@link ForLoopTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        MEMBER_REFERENCE(MemberReferenceTree.class),

        /**
         * Used for instances of {@link MemberReferenceTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        MEMBER_SELECT(MemberSelectTree.class),

        /**
         * Used for instances of {@link MemberSelectTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        EXPRESSION_STATEMENT(ExpressionStatementTree.class),

        /**
         * Used for instances of {@link ExpressionStatementTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        ENHANCED_FOR_LOOP(EnhancedForLoopTree.class),

        /**
         * Used for instances of {@link EnhancedForLoopTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        DO_WHILE_LOOP(DoWhileLoopTree.class),

        /**
         * Used for instances of {@link DoWhileLoopTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        CONTINUE(ContinueTree.class),

        /**
         * Used for instances of {@link ContinueTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        CONDITIONAL_EXPRESSION(ConditionalExpressionTree.class),

        /**
         * Used for instances of {@link ConditionalExpressionTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        COMPILATION_UNIT(CompilationUnitTree.class),

        /**
         * Used for instances of {@link CompilationUnitTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        CLASS(ClassTree.class),

        /**
         * Used for instances of {@link ClassTree} representing classes.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        CATCH(CatchTree.class),

        /**
         * Used for instances of {@link CatchTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        CASE(CaseTree.class),

        /**
         * Used for instances of {@link CaseTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        BREAK(BreakTree.class),

        /**
         * Used for instances of {@link BreakTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        BLOCK(BlockTree.class),

        /**
         * Used for instances of {@link BlockTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        ASSIGNMENT(AssignmentTree.class),

        /**
         * Used for instances of {@link AssignmentTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        ASSERT(AssertTree.class),

        /**
         * Used for instances of {@link AssertTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        ARRAY_TYPE(ArrayTypeTree.class),

        /**
         * Used for instances of {@link ArrayTypeTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        ARRAY_ACCESS(ArrayAccessTree.class),

        /**
         * Used for instances of {@link ArrayAccessTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        TYPE_ANNOTATION(AnnotationTree.class),

        /**
         * Used for instances of {@link AnnotationTree}
         * representing type annotations.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        ANNOTATION(AnnotationTree.class),

        /**
         * Used for instances of {@link AnnotationTree}
         * representing declaration annotations.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
    @jdk.Exported

    /**
     * Enumerates all kinds of trees.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
@jdk.Exported

/**
 * Common interface for all nodes in an abstract syntax tree.
 *
 * <p><b>WARNING:</b> This interface and its sub-interfaces are
 * subject to change as the Java&trade; programming language evolves.
 * These interfaces are implemented by the JDK Java compiler (javac)
 * and should not be implemented either directly or indirectly by
 * other applications.
 *
 * @author Peter von der Ah&eacute;
 * @author Jonathan Gibbons
 *
 * @since 1.6
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
    <R,D> R accept(TreeVisitor<R,D> visitor, D data);

    /**
     * Accept method used to implement the visitor pattern.  The
     * visitor pattern is used to implement operations on trees.
     *
     * @param <R> result type of this operation.
     * @param <D> type of additional data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
    Kind getKind();

    /**
     * Gets the kind of this tree.
     *
     * @return the kind of this tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        OTHER(null);

        /**
         * An implementation-reserved node. This is the not the node
         * you are looking for.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        ANNOTATION_TYPE(ClassTree.class),

        /**
         * Used for instances of {@link ClassTree} representing annotation types.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        ENUM(ClassTree.class),

        /**
         * Used for instances of {@link ClassTree} representing enums.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        INTERFACE(ClassTree.class),

        /**
         * Used for instances of {@link ClassTree} representing interfaces.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        ERRONEOUS(ErroneousTree.class),

        /**
         * Used for instances of {@link ErroneousTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        SUPER_WILDCARD(WildcardTree.class),

        /**
         * Used for instances of {@link WildcardTree} representing
         * a super bounded wildcard type argument.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        EXTENDS_WILDCARD(WildcardTree.class),

        /**
         * Used for instances of {@link WildcardTree} representing
         * an extends bounded wildcard type argument.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        UNBOUNDED_WILDCARD(WildcardTree.class),

        /**
         * Used for instances of {@link WildcardTree} representing
         * an unbounded wildcard type argument.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        NULL_LITERAL(LiteralTree.class),

        /**
         * Used for instances of {@link LiteralTree} representing
         * the use of {@code null}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        STRING_LITERAL(LiteralTree.class),

        /**
         * Used for instances of {@link LiteralTree} representing
         * a string literal expression of type {@link String}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        CHAR_LITERAL(LiteralTree.class),

        /**
         * Used for instances of {@link LiteralTree} representing
         * a character literal expression of type {@code char}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        BOOLEAN_LITERAL(LiteralTree.class),

        /**
         * Used for instances of {@link LiteralTree} representing
         * a boolean literal expression of type {@code boolean}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        DOUBLE_LITERAL(LiteralTree.class),

        /**
         * Used for instances of {@link LiteralTree} representing
         * a floating-point literal expression of type {@code double}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        FLOAT_LITERAL(LiteralTree.class),

        /**
         * Used for instances of {@link LiteralTree} representing
         * a floating-point literal expression of type {@code float}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        LONG_LITERAL(LiteralTree.class),

        /**
         * Used for instances of {@link LiteralTree} representing
         * an integral literal expression of type {@code long}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        INT_LITERAL(LiteralTree.class),

        /**
         * Used for instances of {@link LiteralTree} representing
         * an integral literal expression of type {@code int}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        OR_ASSIGNMENT(CompoundAssignmentTree.class),

        /**
         * Used for instances of {@link CompoundAssignmentTree} representing
         * bitwise and logical "or" assignment {@code |=}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        XOR_ASSIGNMENT(CompoundAssignmentTree.class),

        /**
         * Used for instances of {@link CompoundAssignmentTree} representing
         * bitwise and logical "xor" assignment {@code ^=}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        AND_ASSIGNMENT(CompoundAssignmentTree.class),

        /**
         * Used for instances of {@link CompoundAssignmentTree} representing
         * bitwise and logical "and" assignment {@code &=}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        UNSIGNED_RIGHT_SHIFT_ASSIGNMENT(CompoundAssignmentTree.class),

        /**
         * Used for instances of {@link CompoundAssignmentTree} representing
         * unsigned right shift assignment {@code >>>=}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        RIGHT_SHIFT_ASSIGNMENT(CompoundAssignmentTree.class),

        /**
         * Used for instances of {@link CompoundAssignmentTree} representing
         * right shift assignment {@code >>=}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        LEFT_SHIFT_ASSIGNMENT(CompoundAssignmentTree.class),

        /**
         * Used for instances of {@link CompoundAssignmentTree} representing
         * left shift assignment {@code <<=}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        MINUS_ASSIGNMENT(CompoundAssignmentTree.class),

        /**
         * Used for instances of {@link CompoundAssignmentTree} representing
         * subtraction assignment {@code -=}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        PLUS_ASSIGNMENT(CompoundAssignmentTree.class),

        /**
         * Used for instances of {@link CompoundAssignmentTree} representing
         * addition or string concatenation assignment {@code +=}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        REMAINDER_ASSIGNMENT(CompoundAssignmentTree.class),

        /**
         * Used for instances of {@link CompoundAssignmentTree} representing
         * remainder assignment {@code %=}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        DIVIDE_ASSIGNMENT(CompoundAssignmentTree.class),

        /**
         * Used for instances of {@link CompoundAssignmentTree} representing
         * division assignment {@code /=}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        MULTIPLY_ASSIGNMENT(CompoundAssignmentTree.class),

        /**
         * Used for instances of {@link CompoundAssignmentTree} representing
         * multiplication assignment {@code *=}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        CONDITIONAL_OR(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * conditional-or {@code ||}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        CONDITIONAL_AND(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * conditional-and {@code &&}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        OR(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * bitwise and logical "or" {@code |}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        XOR(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * bitwise and logical "xor" {@code ^}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        AND(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * bitwise and logical "and" {@code &}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        NOT_EQUAL_TO(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * not-equal-to {@code !=}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        EQUAL_TO(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * equal-to {@code ==}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        GREATER_THAN_EQUAL(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * greater-than-equal {@code >=}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        LESS_THAN_EQUAL(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * less-than-equal {@code <=}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        GREATER_THAN(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * greater-than {@code >}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        LESS_THAN(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * less-than {@code <}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        UNSIGNED_RIGHT_SHIFT(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * unsigned right shift {@code >>>}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        RIGHT_SHIFT(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * right shift {@code >>}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        LEFT_SHIFT(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * left shift {@code <<}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        MINUS(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * subtraction {@code -}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        PLUS(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * addition or string concatenation {@code +}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        REMAINDER(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * remainder {@code %}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        DIVIDE(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * division {@code /}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        MULTIPLY(BinaryTree.class),

        /**
         * Used for instances of {@link BinaryTree} representing
         * multiplication {@code *}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        LOGICAL_COMPLEMENT(UnaryTree.class),

        /**
         * Used for instances of {@link UnaryTree} representing logical
         * complement operator {@code !}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        BITWISE_COMPLEMENT(UnaryTree.class),

        /**
         * Used for instances of {@link UnaryTree} representing bitwise
         * complement operator {@code ~}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        UNARY_MINUS(UnaryTree.class),

        /**
         * Used for instances of {@link UnaryTree} representing unary minus
         * operator {@code -}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        UNARY_PLUS(UnaryTree.class),

        /**
         * Used for instances of {@link UnaryTree} representing unary plus
         * operator {@code +}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        PREFIX_DECREMENT(UnaryTree.class),

        /**
         * Used for instances of {@link UnaryTree} representing prefix
         * decrement operator {@code --}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        PREFIX_INCREMENT(UnaryTree.class),

        /**
         * Used for instances of {@link UnaryTree} representing prefix
         * increment operator {@code ++}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        POSTFIX_DECREMENT(UnaryTree.class),

        /**
         * Used for instances of {@link UnaryTree} representing postfix
         * decrement operator {@code --}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        POSTFIX_INCREMENT(UnaryTree.class),

        /**
         * Used for instances of {@link UnaryTree} representing postfix
         * increment operator {@code ++}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        WHILE_LOOP(WhileLoopTree.class),

        /**
         * Used for instances of {@link WhileLoopTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        VARIABLE(VariableTree.class),

        /**
         * Used for instances of {@link VariableTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        TYPE_PARAMETER(TypeParameterTree.class),

        /**
         * Used for instances of {@link TypeParameterTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        TYPE_CAST(TypeCastTree.class),

        /**
         * Used for instances of {@link TypeCastTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        INTERSECTION_TYPE(IntersectionTypeTree.class),

        /**
         * Used for instances of {@link IntersectionTypeTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        UNION_TYPE(UnionTypeTree.class),

        /**
         * Used for instances of {@link UnionTypeTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        PARAMETERIZED_TYPE(ParameterizedTypeTree.class),

        /**
         * Used for instances of {@link ParameterizedTypeTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        TRY(TryTree.class),

        /**
         * Used for instances of {@link TryTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        THROW(ThrowTree.class),

        /**
         * Used for instances of {@link ThrowTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        SYNCHRONIZED(SynchronizedTree.class),

        /**
         * Used for instances of {@link SynchronizedTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        SWITCH(SwitchTree.class),

        /**
         * Used for instances of {@link SwitchTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        EMPTY_STATEMENT(EmptyStatementTree.class),

        /**
         * Used for instances of {@link EmptyStatementTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        RETURN(ReturnTree.class),

        /**
         * Used for instances of {@link ReturnTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        PRIMITIVE_TYPE(PrimitiveTypeTree.class),

        /**
         * Used for instances of {@link PrimitiveTypeTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        PARENTHESIZED(ParenthesizedTree.class),

        /**
         * Used for instances of {@link ParenthesizedTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        LAMBDA_EXPRESSION(LambdaExpressionTree.class),

        /**
         * Used for instances of {@link LambdaExpressionTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        NEW_CLASS(NewClassTree.class),

        /**
         * Used for instances of {@link NewClassTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        NEW_ARRAY(NewArrayTree.class),

        /**
         * Used for instances of {@link NewArrayTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        MODIFIERS(ModifiersTree.class),

        /**
         * Used for instances of {@link ModifiersTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        METHOD_INVOCATION(MethodInvocationTree.class),

        /**
         * Used for instances of {@link MethodInvocationTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        METHOD(MethodTree.class),

        /**
         * Used for instances of {@link MethodTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        LABELED_STATEMENT(LabeledStatementTree.class),

        /**
         * Used for instances of {@link LabeledStatementTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        INSTANCE_OF(InstanceOfTree.class),

        /**
         * Used for instances of {@link InstanceOfTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        IMPORT(ImportTree.class),

        /**
         * Used for instances of {@link ImportTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        IF(IfTree.class),

        /**
         * Used for instances of {@link IfTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        IDENTIFIER(IdentifierTree.class),

        /**
         * Used for instances of {@link IdentifierTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        FOR_LOOP(ForLoopTree.class),

        /**
         * Used for instances of {@link ForLoopTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        MEMBER_REFERENCE(MemberReferenceTree.class),

        /**
         * Used for instances of {@link MemberReferenceTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        MEMBER_SELECT(MemberSelectTree.class),

        /**
         * Used for instances of {@link MemberSelectTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        EXPRESSION_STATEMENT(ExpressionStatementTree.class),

        /**
         * Used for instances of {@link ExpressionStatementTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        ENHANCED_FOR_LOOP(EnhancedForLoopTree.class),

        /**
         * Used for instances of {@link EnhancedForLoopTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        DO_WHILE_LOOP(DoWhileLoopTree.class),

        /**
         * Used for instances of {@link DoWhileLoopTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        CONTINUE(ContinueTree.class),

        /**
         * Used for instances of {@link ContinueTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        CONDITIONAL_EXPRESSION(ConditionalExpressionTree.class),

        /**
         * Used for instances of {@link ConditionalExpressionTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        COMPILATION_UNIT(CompilationUnitTree.class),

        /**
         * Used for instances of {@link CompilationUnitTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        CLASS(ClassTree.class),

        /**
         * Used for instances of {@link ClassTree} representing classes.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        CATCH(CatchTree.class),

        /**
         * Used for instances of {@link CatchTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        CASE(CaseTree.class),

        /**
         * Used for instances of {@link CaseTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        BREAK(BreakTree.class),

        /**
         * Used for instances of {@link BreakTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        BLOCK(BlockTree.class),

        /**
         * Used for instances of {@link BlockTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        ASSIGNMENT(AssignmentTree.class),

        /**
         * Used for instances of {@link AssignmentTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        ASSERT(AssertTree.class),

        /**
         * Used for instances of {@link AssertTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        ARRAY_TYPE(ArrayTypeTree.class),

        /**
         * Used for instances of {@link ArrayTypeTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        ARRAY_ACCESS(ArrayAccessTree.class),

        /**
         * Used for instances of {@link ArrayAccessTree}.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        TYPE_ANNOTATION(AnnotationTree.class),

        /**
         * Used for instances of {@link AnnotationTree}
         * representing type annotations.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
        ANNOTATION(AnnotationTree.class),

        /**
         * Used for instances of {@link AnnotationTree}
         * representing declaration annotations.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
    @jdk.Exported

    /**
     * Enumerates all kinds of trees.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/tree/Tree.java
@jdk.Exported

/**
 * Common interface for all nodes in an abstract syntax tree.
 *
 * <p><b>WARNING:</b> This interface and its sub-interfaces are
 * subject to change as the Java&trade; programming language evolves.
 * These interfaces are implemented by the JDK Java compiler (javac)
 * and should not be implemented either directly or indirectly by
 * other applications.
 *
 * @author Peter von der Ah&eacute;
 * @author Jonathan Gibbons
 *
 * @since 1.6
 */
