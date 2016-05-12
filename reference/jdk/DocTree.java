_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
    <R, D> R accept(DocTreeVisitor<R,D> visitor, D data);

    /**
     * Accept method used to implement the visitor pattern.  The
     * visitor pattern is used to implement operations on trees.
     *
     * @param <R> result type of this operation.
     * @param <D> type of additional data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
    Kind getKind();

    /**
     * Gets the kind of this tree.
     *
     * @return the kind of this tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        OTHER;

        /**
         * An implementation-reserved node. This is the not the node
         * you are looking for.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        VERSION("version"),

        /**
         * Used for instances of {@link VersionTree}
         * representing an @version tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        VALUE("value"),

        /**
         * Used for instances of {@link ValueTree}
         * representing an @value tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        UNKNOWN_INLINE_TAG,

        /**
         * Used for instances of {@link UnknownInlineTagTree}
         * representing an unknown inline tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        UNKNOWN_BLOCK_TAG,

        /**
         * Used for instances of {@link UnknownBlockTagTree}
         * representing an unknown block tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        THROWS("throws"),

        /**
         * Used for instances of {@link ThrowsTree}
         * representing an @throws tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        TEXT,

        /**
         * Used for instances of {@link TextTree}
         * representing some documentation text.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        START_ELEMENT,

        /**
         * Used for instances of {@link EndElementTree}
         * representing the start of an HTML element.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        SINCE("since"),

        /**
         * Used for instances of {@link SinceTree}
         * representing an @since tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        SERIAL_FIELD("serialField"),

        /**
         * Used for instances of {@link SerialFieldTree}
         * representing an @serialField tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        SERIAL_DATA("serialData"),

        /**
         * Used for instances of {@link SerialDataTree}
         * representing an @serialData tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        SERIAL("serial"),

        /**
         * Used for instances of {@link SerialTree}
         * representing an @serial tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        SEE("see"),

        /**
         * Used for instances of {@link SeeTree}
         * representing an @see tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        RETURN("return"),

        /**
         * Used for instances of {@link ReturnTree}
         * representing an @return tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        REFERENCE,

        /**
         * Used for instances of {@link ReferenceTree}
         * representing a reference to a element in the
         * Java programming language.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        PARAM("param"),

        /**
         * Used for instances of {@link ParamTree}
         * representing an @param tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        LITERAL("literal"),

        /**
         * Used for instances of {@link LiteralTree}
         * representing an @literal tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        LINK_PLAIN("linkplain"),

        /**
         * Used for instances of {@link LinkTree}
         * representing an @linkplain tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        LINK("link"),

        /**
         * Used for instances of {@link LinkTree}
         * representing an @link tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        INHERIT_DOC("inheritDoc"),

        /**
         * Used for instances of {@link InheritDocTree}
         * representing an @inheritDoc tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        IDENTIFIER,

        /**
         * Used for instances of {@link IdentifierTree}
         * representing an identifier.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        EXCEPTION("exception"),

        /**
         * Used for instances of {@link ThrowsTree}
         * representing an @exception tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        ERRONEOUS,

        /**
         * Used for instances of {@link ErroneousTree}
         * representing some invalid text.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        ENTITY,

        /**
         * Used for instances of {@link EntityTree}
         * representing an HTML entity.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        END_ELEMENT,

        /**
         * Used for instances of {@link EndElementTree}
         * representing the end of an HTML element.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        DOC_ROOT("docRoot"),

        /**
         * Used for instances of {@link DocRootTree}
         * representing an @docRoot tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        DOC_COMMENT,

        /**
         * Used for instances of {@link DocCommentTree}
         * representing a complete doc comment.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        DEPRECATED("deprecated"),

        /**
         * Used for instances of {@link DeprecatedTree}
         * representing an @deprecated tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        COMMENT,

        /**
         * Used for instances of {@link CommentTree}
         * representing an HTML comment.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        CODE("code"),

        /**
         * Used for instances of {@link LiteralTree}
         * representing an @code tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        AUTHOR("author"),

        /**
         * Used for instances of {@link AuthorTree}
         * representing an @author tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        ATTRIBUTE,

        /**
         * Used for instances of {@link AttributeTree}
         * representing an HTML attribute.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
@jdk.Exported

/**
 * Common interface for all nodes in a documentation syntax tree.
 *
 * @since 1.8
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
    <R, D> R accept(DocTreeVisitor<R,D> visitor, D data);

    /**
     * Accept method used to implement the visitor pattern.  The
     * visitor pattern is used to implement operations on trees.
     *
     * @param <R> result type of this operation.
     * @param <D> type of additional data.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
    Kind getKind();

    /**
     * Gets the kind of this tree.
     *
     * @return the kind of this tree.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        OTHER;

        /**
         * An implementation-reserved node. This is the not the node
         * you are looking for.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        VERSION("version"),

        /**
         * Used for instances of {@link VersionTree}
         * representing an @version tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        VALUE("value"),

        /**
         * Used for instances of {@link ValueTree}
         * representing an @value tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        UNKNOWN_INLINE_TAG,

        /**
         * Used for instances of {@link UnknownInlineTagTree}
         * representing an unknown inline tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        UNKNOWN_BLOCK_TAG,

        /**
         * Used for instances of {@link UnknownBlockTagTree}
         * representing an unknown block tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        THROWS("throws"),

        /**
         * Used for instances of {@link ThrowsTree}
         * representing an @throws tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        TEXT,

        /**
         * Used for instances of {@link TextTree}
         * representing some documentation text.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        START_ELEMENT,

        /**
         * Used for instances of {@link EndElementTree}
         * representing the start of an HTML element.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        SINCE("since"),

        /**
         * Used for instances of {@link SinceTree}
         * representing an @since tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        SERIAL_FIELD("serialField"),

        /**
         * Used for instances of {@link SerialFieldTree}
         * representing an @serialField tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        SERIAL_DATA("serialData"),

        /**
         * Used for instances of {@link SerialDataTree}
         * representing an @serialData tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        SERIAL("serial"),

        /**
         * Used for instances of {@link SerialTree}
         * representing an @serial tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        SEE("see"),

        /**
         * Used for instances of {@link SeeTree}
         * representing an @see tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        RETURN("return"),

        /**
         * Used for instances of {@link ReturnTree}
         * representing an @return tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        REFERENCE,

        /**
         * Used for instances of {@link ReferenceTree}
         * representing a reference to a element in the
         * Java programming language.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        PARAM("param"),

        /**
         * Used for instances of {@link ParamTree}
         * representing an @param tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        LITERAL("literal"),

        /**
         * Used for instances of {@link LiteralTree}
         * representing an @literal tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        LINK_PLAIN("linkplain"),

        /**
         * Used for instances of {@link LinkTree}
         * representing an @linkplain tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        LINK("link"),

        /**
         * Used for instances of {@link LinkTree}
         * representing an @link tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        INHERIT_DOC("inheritDoc"),

        /**
         * Used for instances of {@link InheritDocTree}
         * representing an @inheritDoc tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        IDENTIFIER,

        /**
         * Used for instances of {@link IdentifierTree}
         * representing an identifier.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        EXCEPTION("exception"),

        /**
         * Used for instances of {@link ThrowsTree}
         * representing an @exception tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        ERRONEOUS,

        /**
         * Used for instances of {@link ErroneousTree}
         * representing some invalid text.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        ENTITY,

        /**
         * Used for instances of {@link EntityTree}
         * representing an HTML entity.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        END_ELEMENT,

        /**
         * Used for instances of {@link EndElementTree}
         * representing the end of an HTML element.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        DOC_ROOT("docRoot"),

        /**
         * Used for instances of {@link DocRootTree}
         * representing an @docRoot tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        DOC_COMMENT,

        /**
         * Used for instances of {@link DocCommentTree}
         * representing a complete doc comment.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        DEPRECATED("deprecated"),

        /**
         * Used for instances of {@link DeprecatedTree}
         * representing an @deprecated tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        COMMENT,

        /**
         * Used for instances of {@link CommentTree}
         * representing an HTML comment.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        CODE("code"),

        /**
         * Used for instances of {@link LiteralTree}
         * representing an @code tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        AUTHOR("author"),

        /**
         * Used for instances of {@link AuthorTree}
         * representing an @author tag.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
        ATTRIBUTE,

        /**
         * Used for instances of {@link AttributeTree}
         * representing an HTML attribute.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/source/doctree/DocTree.java
@jdk.Exported

/**
 * Common interface for all nodes in a documentation syntax tree.
 *
 * @since 1.8
 */
