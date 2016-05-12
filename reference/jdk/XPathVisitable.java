_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitable.java
        public void callVisitors(ExpressionOwner owner, XPathVisitor visitor);

        /**
         * This will traverse the heararchy, calling the visitor for
         * each member.  If the called visitor method returns
         * false, the subtree should not be called.
         *
         * @param owner The owner of the visitor, where that path may be
         *              rewritten if needed.
         * @param visitor The visitor whose appropriate method will be called.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitable.java
public interface XPathVisitable

/**
 * A class that implements this interface will call a XPathVisitor
 * for itself and members within it's heararchy.  If the XPathVisitor's
 * method returns false, the sub-member heararchy will not be
 * traversed.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitable.java
        public void callVisitors(ExpressionOwner owner, XPathVisitor visitor);

        /**
         * This will traverse the heararchy, calling the visitor for
         * each member.  If the called visitor method returns
         * false, the subtree should not be called.
         *
         * @param owner The owner of the visitor, where that path may be
         *              rewritten if needed.
         * @param visitor The visitor whose appropriate method will be called.
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xpath/internal/XPathVisitable.java
public interface XPathVisitable

/**
 * A class that implements this interface will call a XPathVisitor
 * for itself and members within it's heararchy.  If the XPathVisitor's
 * method returns false, the sub-member heararchy will not be
 * traversed.
 */
