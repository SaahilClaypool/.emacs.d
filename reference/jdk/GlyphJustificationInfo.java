_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
    public final float shrinkRightLimit;

    /**
     * The maximum amount by which the right side of this glyph can shrink
     * (a positive number).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
    public final float shrinkLeftLimit;

    /**
     * The maximum amount by which the left side of this glyph can shrink
     * (a positive number).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
    public final boolean shrinkAbsorb;

    /**
     * If <code>true</code>,this glyph absorbs all remaining shrinkage at
     * this and lower priority levels as it shrinks.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
    public final int shrinkPriority;

    /**
     * The priority level of this glyph as it is shrinking.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
    public final float growRightLimit;

    /**
     * The maximum amount by which the right side of this glyph can grow.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
    public final float growLeftLimit;

    /**
     * The maximum amount by which the left side of this glyph can grow.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
    public final boolean growAbsorb;

    /**
     * If <code>true</code>, this glyph absorbs all extra
     * space at this and lower priority levels when it grows.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
    public final int growPriority;

    /**
     * The priority level of this glyph as it is growing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
    public final float weight;

    /**
     * The weight of this glyph.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
    public static final int PRIORITY_NONE = 3;

    /** The lowest justification priority. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
    public static final int PRIORITY_INTERCHAR = 2;

    /** The second lowest justification priority. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
    public static final int PRIORITY_WHITESPACE = 1;

    /** The second highest justification priority. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
    public static final int PRIORITY_KASHIDA = 0;

    /** The highest justification priority. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
     public GlyphJustificationInfo(float weight,
                                  boolean growAbsorb,
                                  int growPriority,
                                  float growLeftLimit,
                                  float growRightLimit,
                                  boolean shrinkAbsorb,
                                  int shrinkPriority,
                                  float shrinkLeftLimit,
                                  float shrinkRightLimit)

    /**
     * Constructs information about the justification properties of a
     * glyph.
     * @param weight the weight of this glyph when allocating space.  Must be non-negative.
     * @param growAbsorb if <code>true</code> this glyph absorbs
     * all extra space at this priority and lower priority levels when it
     * grows
     * @param growPriority the priority level of this glyph when it
     * grows
     * @param growLeftLimit the maximum amount by which the left side of this
     * glyph can grow.  Must be non-negative.
     * @param growRightLimit the maximum amount by which the right side of this
     * glyph can grow.  Must be non-negative.
     * @param shrinkAbsorb if <code>true</code>, this glyph absorbs all
     * remaining shrinkage at this and lower priority levels when it
     * shrinks
     * @param shrinkPriority the priority level of this glyph when
     * it shrinks
     * @param shrinkLeftLimit the maximum amount by which the left side of this
     * glyph can shrink.  Must be non-negative.
     * @param shrinkRightLimit the maximum amount by which the right side
     * of this glyph can shrink.  Must be non-negative.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
public final class GlyphJustificationInfo {

/**
 * The <code>GlyphJustificationInfo</code> class represents information
 * about the justification properties of a glyph.  A glyph is the visual
 * representation of one or more characters.  Many different glyphs can
 * be used to represent a single character or combination of characters.
 * The four justification properties represented by
 * <code>GlyphJustificationInfo</code> are weight, priority, absorb and
 * limit.
 * <p>
 * Weight is the overall 'weight' of the glyph in the line.  Generally it is
 * proportional to the size of the font.  Glyphs with larger weight are
 * allocated a correspondingly larger amount of the change in space.
 * <p>
 * Priority determines the justification phase in which this glyph is used.
 * All glyphs of the same priority are examined before glyphs of the next
 * priority.  If all the change in space can be allocated to these glyphs
 * without exceeding their limits, then glyphs of the next priority are not
 * examined. There are four priorities, kashida, whitespace, interchar,
 * and none.  KASHIDA is the first priority examined. NONE is the last
 * priority examined.
 * <p>
 * Absorb determines whether a glyph absorbs all change in space.  Within a
 * given priority, some glyphs may absorb all the change in space.  If any of
 * these glyphs are present, no glyphs of later priority are examined.
 * <p>
 * Limit determines the maximum or minimum amount by which the glyph can
 * change. Left and right sides of the glyph can have different limits.
 * <p>
 * Each <code>GlyphJustificationInfo</code> represents two sets of
 * metrics, which are <i>growing</i> and <i>shrinking</i>.  Growing
 * metrics are used when the glyphs on a line are to be
 * spread apart to fit a larger width.  Shrinking metrics are used when
 * the glyphs are to be moved together to fit a smaller width.
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
    public final float shrinkRightLimit;

    /**
     * The maximum amount by which the right side of this glyph can shrink
     * (a positive number).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
    public final float shrinkLeftLimit;

    /**
     * The maximum amount by which the left side of this glyph can shrink
     * (a positive number).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
    public final boolean shrinkAbsorb;

    /**
     * If <code>true</code>,this glyph absorbs all remaining shrinkage at
     * this and lower priority levels as it shrinks.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
    public final int shrinkPriority;

    /**
     * The priority level of this glyph as it is shrinking.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
    public final float growRightLimit;

    /**
     * The maximum amount by which the right side of this glyph can grow.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
    public final float growLeftLimit;

    /**
     * The maximum amount by which the left side of this glyph can grow.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
    public final boolean growAbsorb;

    /**
     * If <code>true</code>, this glyph absorbs all extra
     * space at this and lower priority levels when it grows.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
    public final int growPriority;

    /**
     * The priority level of this glyph as it is growing.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
    public final float weight;

    /**
     * The weight of this glyph.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
    public static final int PRIORITY_NONE = 3;

    /** The lowest justification priority. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
    public static final int PRIORITY_INTERCHAR = 2;

    /** The second lowest justification priority. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
    public static final int PRIORITY_WHITESPACE = 1;

    /** The second highest justification priority. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
    public static final int PRIORITY_KASHIDA = 0;

    /** The highest justification priority. */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
     public GlyphJustificationInfo(float weight,
                                  boolean growAbsorb,
                                  int growPriority,
                                  float growLeftLimit,
                                  float growRightLimit,
                                  boolean shrinkAbsorb,
                                  int shrinkPriority,
                                  float shrinkLeftLimit,
                                  float shrinkRightLimit)

    /**
     * Constructs information about the justification properties of a
     * glyph.
     * @param weight the weight of this glyph when allocating space.  Must be non-negative.
     * @param growAbsorb if <code>true</code> this glyph absorbs
     * all extra space at this priority and lower priority levels when it
     * grows
     * @param growPriority the priority level of this glyph when it
     * grows
     * @param growLeftLimit the maximum amount by which the left side of this
     * glyph can grow.  Must be non-negative.
     * @param growRightLimit the maximum amount by which the right side of this
     * glyph can grow.  Must be non-negative.
     * @param shrinkAbsorb if <code>true</code>, this glyph absorbs all
     * remaining shrinkage at this and lower priority levels when it
     * shrinks
     * @param shrinkPriority the priority level of this glyph when
     * it shrinks
     * @param shrinkLeftLimit the maximum amount by which the left side of this
     * glyph can shrink.  Must be non-negative.
     * @param shrinkRightLimit the maximum amount by which the right side
     * of this glyph can shrink.  Must be non-negative.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/GlyphJustificationInfo.java
public final class GlyphJustificationInfo {

/**
 * The <code>GlyphJustificationInfo</code> class represents information
 * about the justification properties of a glyph.  A glyph is the visual
 * representation of one or more characters.  Many different glyphs can
 * be used to represent a single character or combination of characters.
 * The four justification properties represented by
 * <code>GlyphJustificationInfo</code> are weight, priority, absorb and
 * limit.
 * <p>
 * Weight is the overall 'weight' of the glyph in the line.  Generally it is
 * proportional to the size of the font.  Glyphs with larger weight are
 * allocated a correspondingly larger amount of the change in space.
 * <p>
 * Priority determines the justification phase in which this glyph is used.
 * All glyphs of the same priority are examined before glyphs of the next
 * priority.  If all the change in space can be allocated to these glyphs
 * without exceeding their limits, then glyphs of the next priority are not
 * examined. There are four priorities, kashida, whitespace, interchar,
 * and none.  KASHIDA is the first priority examined. NONE is the last
 * priority examined.
 * <p>
 * Absorb determines whether a glyph absorbs all change in space.  Within a
 * given priority, some glyphs may absorb all the change in space.  If any of
 * these glyphs are present, no glyphs of later priority are examined.
 * <p>
 * Limit determines the maximum or minimum amount by which the glyph can
 * change. Left and right sides of the glyph can have different limits.
 * <p>
 * Each <code>GlyphJustificationInfo</code> represents two sets of
 * metrics, which are <i>growing</i> and <i>shrinking</i>.  Growing
 * metrics are used when the glyphs on a line are to be
 * spread apart to fit a larger width.  Shrinking metrics are used when
 * the glyphs are to be moved together to fit a smaller width.
 */
