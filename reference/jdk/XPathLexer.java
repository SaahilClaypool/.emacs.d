_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathLexer.java
        Symbol disambiguateOperator(int ss) throws Exception {

        /**
         * If symbol is first token or if it follows any of the operators
         * listed in http://www.w3.org/TR/xpath#exprlex then treat as a
         * name instead of a keyword (Jira-1912). Look two tokens behind
         * to desambiguate expressions like "* and *" or "and * and".
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathLexer.java
        Symbol disambiguateAxisOrFunction(int ss) throws Exception {

        /**
         * If symbol is not followed by '::' or '(', then treat it as a
         * name instead of an axis or function (Jira-1912).
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathLexer.java
        Symbol disambiguateOperator(int ss) throws Exception {

        /**
         * If symbol is first token or if it follows any of the operators
         * listed in http://www.w3.org/TR/xpath#exprlex then treat as a
         * name instead of a keyword (Jira-1912). Look two tokens behind
         * to desambiguate expressions like "* and *" or "and * and".
         */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/XPathLexer.java
        Symbol disambiguateAxisOrFunction(int ss) throws Exception {

        /**
         * If symbol is not followed by '::' or '(', then treat it as a
         * name instead of an axis or function (Jira-1912).
         */
