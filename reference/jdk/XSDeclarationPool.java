_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDeclarationPool.java
    private XSAttributeUseImpl fAttributeUse[][] = new XSAttributeUseImpl[INITIAL_CHUNK_COUNT][];

    /** AttributeUse declaration pool */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDeclarationPool.java
    private XSSimpleTypeDecl fSTDecl[][] = new XSSimpleTypeDecl[INITIAL_CHUNK_COUNT][];

    /** SimpleType declaration pool */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDeclarationPool.java
    private XSComplexTypeDecl fCTDecl[][] = new XSComplexTypeDecl[INITIAL_CHUNK_COUNT][];

    /** ComplexType declaration pool */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDeclarationPool.java
    private XSAttributeDecl fAttrDecl[][] = new XSAttributeDecl[INITIAL_CHUNK_COUNT][];

    /** Attribute declaration pool */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDeclarationPool.java
    private XSModelGroupImpl fModelGroup[][] = new XSModelGroupImpl[INITIAL_CHUNK_COUNT][];

    /** Particle declaration pool */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDeclarationPool.java
    private XSParticleDecl fParticleDecl[][] = new XSParticleDecl[INITIAL_CHUNK_COUNT][];

    /** Particle declaration pool */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDeclarationPool.java
    private XSElementDecl fElementDecl[][] = new XSElementDecl[INITIAL_CHUNK_COUNT][];

    /** Element declaration pool*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDeclarationPool.java
    private static final int INITIAL_CHUNK_COUNT = (1 << (10 - CHUNK_SHIFT)); // 2^10 = 1k

    /** Initial chunk count (). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDeclarationPool.java
    private static final int CHUNK_MASK = CHUNK_SIZE - 1;

    /** Chunk mask (CHUNK_SIZE - 1). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDeclarationPool.java
    private static final int CHUNK_SIZE = 1 << CHUNK_SHIFT;

    /** Chunk size (1 << CHUNK_SHIFT). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDeclarationPool.java
public final class XSDeclarationPool {

/**
 * This class is pool that enables caching of XML Schema declaration objects.
 * Before a compiled grammar object is garbage collected,
 * the implementation will add all XML Schema component
 * declarations to the pool.
 * Note: The cashing mechanism is not implemented yet.
 *
 * @xerces.internal
 *
 * @author Elena Litani, IBM
 * @version $Id: XSDeclarationPool.java,v 1.7 2010-11-01 04:39:55 joehw Exp $
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDeclarationPool.java
    private XSAttributeUseImpl fAttributeUse[][] = new XSAttributeUseImpl[INITIAL_CHUNK_COUNT][];

    /** AttributeUse declaration pool */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDeclarationPool.java
    private XSSimpleTypeDecl fSTDecl[][] = new XSSimpleTypeDecl[INITIAL_CHUNK_COUNT][];

    /** SimpleType declaration pool */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDeclarationPool.java
    private XSComplexTypeDecl fCTDecl[][] = new XSComplexTypeDecl[INITIAL_CHUNK_COUNT][];

    /** ComplexType declaration pool */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDeclarationPool.java
    private XSAttributeDecl fAttrDecl[][] = new XSAttributeDecl[INITIAL_CHUNK_COUNT][];

    /** Attribute declaration pool */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDeclarationPool.java
    private XSModelGroupImpl fModelGroup[][] = new XSModelGroupImpl[INITIAL_CHUNK_COUNT][];

    /** Particle declaration pool */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDeclarationPool.java
    private XSParticleDecl fParticleDecl[][] = new XSParticleDecl[INITIAL_CHUNK_COUNT][];

    /** Particle declaration pool */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDeclarationPool.java
    private XSElementDecl fElementDecl[][] = new XSElementDecl[INITIAL_CHUNK_COUNT][];

    /** Element declaration pool*/
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDeclarationPool.java
    private static final int INITIAL_CHUNK_COUNT = (1 << (10 - CHUNK_SHIFT)); // 2^10 = 1k

    /** Initial chunk count (). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDeclarationPool.java
    private static final int CHUNK_MASK = CHUNK_SIZE - 1;

    /** Chunk mask (CHUNK_SIZE - 1). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDeclarationPool.java
    private static final int CHUNK_SIZE = 1 << CHUNK_SHIFT;

    /** Chunk size (1 << CHUNK_SHIFT). */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/org/apache/xerces/internal/impl/xs/XSDeclarationPool.java
public final class XSDeclarationPool {

/**
 * This class is pool that enables caching of XML Schema declaration objects.
 * Before a compiled grammar object is garbage collected,
 * the implementation will add all XML Schema component
 * declarations to the pool.
 * Note: The cashing mechanism is not implemented yet.
 *
 * @xerces.internal
 *
 * @author Elena Litani, IBM
 * @version $Id: XSDeclarationPool.java,v 1.7 2010-11-01 04:39:55 joehw Exp $
 */
