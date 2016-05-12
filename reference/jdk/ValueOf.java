_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/ValueOf.java
            if (type.identicalTo(Type.NodeSet)) {

            /***
             *** %HZ% Would like to treat result-tree fragments in the same
             *** %HZ% way as node sets for value-of, but that's running into
             *** %HZ% some snags.  Instead, they'll be converted to String
            if (type.identicalTo(Type.ResultTree)) {
                _select = new CastExpr(new CastExpr(_select, Type.NodeSet),
                                       Type.Node);
            } else
            ***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/ValueOf.java
final class ValueOf extends Instruction {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/ValueOf.java
            if (type.identicalTo(Type.NodeSet)) {

            /***
             *** %HZ% Would like to treat result-tree fragments in the same
             *** %HZ% way as node sets for value-of, but that's running into
             *** %HZ% some snags.  Instead, they'll be converted to String
            if (type.identicalTo(Type.ResultTree)) {
                _select = new CastExpr(new CastExpr(_select, Type.NodeSet),
                                       Type.Node);
            } else
            ***/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xalan/internal/xsltc/compiler/ValueOf.java
final class ValueOf extends Instruction {

/**
 * @author Jacek Ambroziak
 * @author Santiago Pericas-Geertsen
 * @author Morten Jorgensen
 */
