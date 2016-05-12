_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammarBucket.java
    public void putGrammar(DTDGrammar grammar) {

    /**
     * Puts the specified grammar into the grammar pool and associate it to
     * a root element name (this being internal, the lack of generality is irrelevant).
     *
     * @param grammar     The grammar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammarBucket.java
    public DTDGrammarBucket() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammarBucket.java
    protected Map<XMLDTDDescription, DTDGrammar> fGrammars;

    /** Grammars associated with element root name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammarBucket.java
public class DTDGrammarBucket {

/**
 * This very simple class is the skeleton of what the DTDValidator could use
 * to store various grammars that it gets from the GrammarPool.  As in the
 * case of XSGrammarBucket, one thinks of this object as being closely
 * associated with its validator; when fully mature, this class will be
 * filled from the GrammarPool when the DTDValidator is invoked on a
 * document, and, if a new DTD grammar is parsed, the new set will be
 * offered back to the GrammarPool for possible inclusion.
 *
 * @xerces.internal
 *
 * @author Neil Graham, IBM
 *
*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammarBucket.java
    public void putGrammar(DTDGrammar grammar) {

    /**
     * Puts the specified grammar into the grammar pool and associate it to
     * a root element name (this being internal, the lack of generality is irrelevant).
     *
     * @param grammar     The grammar.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammarBucket.java
    public DTDGrammarBucket() {

    /** Default constructor. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammarBucket.java
    protected Map<XMLDTDDescription, DTDGrammar> fGrammars;

    /** Grammars associated with element root name. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/dtd/DTDGrammarBucket.java
public class DTDGrammarBucket {

/**
 * This very simple class is the skeleton of what the DTDValidator could use
 * to store various grammars that it gets from the GrammarPool.  As in the
 * case of XSGrammarBucket, one thinks of this object as being closely
 * associated with its validator; when fully mature, this class will be
 * filled from the GrammarPool when the DTDValidator is invoked on a
 * document, and, if a new DTD grammar is parsed, the new set will be
 * offered back to the GrammarPool for possible inclusion.
 *
 * @xerces.internal
 *
 * @author Neil Graham, IBM
 *
*/
