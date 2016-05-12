_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public int getFontTableSize(String strSfntTag);

  /**
   * Returns the size of the table for a specified tag. Tags for sfnt
   * tables include items like <i>cmap</i>, <i>name</i> and <i>head</i>.
   * @param     strSfntTag a four-character code as a
   * <code>String</code>
   * @return the size of the table corresponding to the specified tag.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public int getFontTableSize(int sfntTag);

  /**
   * Returns the size of the table for a specified tag. Tags for sfnt
   * tables include items like <i>cmap</i>, <i>name</i> and <i>head</i>.
   * @param     sfntTag a four-character code as a 32-bit integer
   * @return the size of the table corresponding to the specified
   * tag.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public byte[] getFontTable(String strSfntTag, int offset, int count);

  /**
   * Returns a subset of the table as an array of bytes
   * for a specified tag.  Tags for sfnt tables include items
   * like <i>cmap</i>, <i>name</i> and <i>head</i>. The
   * <code>byte</code> array returned is a copy of the font
   * data in memory.
   * @param     strSfntTag a four-character code as a
   * <code>String</code>
   * @param     offset index of first byte to return from table
   * @param     count  number of bytes to return from table
   * @return a subset of the table corresponding to
   *            <code>strSfntTag</code> and containing the bytes
   *            starting at <code>offset</code> byte and including
   *            <code>count</code> bytes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public byte[] getFontTable(int sfntTag, int offset, int count);

  /**
   * Returns a subset of the table as an array of bytes
   * for a specified tag.  Tags for sfnt tables include
   * items like <i>cmap</i>, <i>name</i> and <i>head</i>.
   * The byte array returned is a copy of the font data in
   * memory.
   * @param     sfntTag a four-character code as a 32-bit integer
   * @param     offset index of first byte to return from table
   * @param     count number of bytes to return from table
   * @return a subset of the table corresponding to
   *            <code>sfntTag</code> and containing the bytes
   *            starting at <code>offset</code> byte and including
   *            <code>count</code> bytes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public byte[] getFontTable(String strSfntTag);

  /**
   * Returns the table as an array of bytes for a specified tag.
   * Tags for sfnt tables include items like <i>cmap</i>,
   * <i>name</i> and <i>head</i>.  The byte array returned is a
   * copy of the font data in memory.
   * @param     strSfntTag a four-character code as a
   *            <code>String</code>
   * @return a <code>byte</code> array that is the table that
   * contains the font data corresponding to the specified
   * tag.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public byte[] getFontTable(int sfntTag);

  /**
   * Returns the table as an array of bytes for a specified tag.
   * Tags for sfnt tables include items like <i>cmap</i>,
   * <i>name</i> and <i>head</i>.  The <code>byte</code> array
   * returned is a copy of the font data in memory.
   * @param     sfntTag a four-character code as a 32-bit integer
   * @return a <code>byte</code> array that is the table that
   * contains the font data corresponding to the specified
   * tag.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public int getVersion();

  /**
   * Returns the version of the <code>OpenType</code> font.
   * 1.0 is represented as 0x00010000.
   * @return the version of the <code>OpenType</code> font.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_TRAK        = 0x7472616b;

  /**
   * Tracking.  Table tag "trak" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_PROP        = 0x70726f70;

  /**
   * Glyph properties.  Table tag "prop" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_OPBD        = 0x6d6f7274;

  /**
   * Optical bounds.  Table tag "opbd" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_MORT        = 0x6d6f7274;

  /**
   * Glyph metamorphosis.  Table tag "mort" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_LCAR        = 0x6c636172;

  /**
   * Ligature caret.   Table tag "lcar" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_JUST        = 0x6a757374;

  /**
   * Justification.  Table tag "just" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_FMTX        = 0x666d7478;

  /**
   * Font metrics.  Table tag "fmtx" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_FDSC        = 0x66647363;

  /**
   * Font descriptors.  Table tag "fdsc" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_FEAT        = 0x66656174;

  /**
   * Feature name.  Table tag "feat" in the Open
    * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_CVAR        = 0x63766172;

   /**
    * CVT variation.  Table tag "cvar" in the Open
    * Type Specification.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_BLOC        = 0x626c6f63;

  /**
   * Bitmap location.  Table tag "bloc" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_BDAT        = 0x62646174;

  /**
   * Bitmap data.  Table tag "bdat" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_AVAR        = 0x61766172;

  /**
   * Axis variation.  Table tag "avar" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_ACNT        = 0x61636e74;

  /**
   * Accent attachment.  Table tag "acnt" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_PCLT        = 0x50434c54;

  /**
   * PCL 5 data.  Table tag "PCLT" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_LTSH        = 0x4c545348;

  /**
   * Linear threshold.  Table tag "LTSH" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_EBSC        = 0x45425343;

  /**
   * Embedded bitmap scaling.  Table tag "EBSC" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_EBLC        = 0x45424c43;

  /**
   * Embedded bitmap location.  Table tag "EBLC" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_EBDT        = 0x45424454;

  /**
   * Embedded bitmap data.  Table tag "EBDT" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_JSTF        = 0x4a535446;

  /**
   * Justification.  Table tag "JSTF" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_GPOS        = 0x47504f53;

  /**
   * Glyph positioning.  Table tag "GPOS" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_GDEF        = 0x47444546;

  /**
   * Glyph definition.  Table tag "GDEF" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_BASE        = 0x42415345;

  /**
   * Baseline data.  Table tag "BASE" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_MMFX        = 0x4d4d4658;

  /**
   * Multiple master font metrics.  Table tag
   * "MMFX" in the Open Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_MMSD        = 0x4d4d5344;

  /**
   * Multiple master supplementary data.  Table tag
   * "MMSD" in the Open Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_CFF = 0x43464620;

  /**
   * Compact font format (Type1 font).  Table tag
   * "CFF " in the Open Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_GVAR        = 0x67766172;

  /**
   * Glyph variation.  Table tag "gvar" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_FVAR        = 0x66766172;

  /**
   * Font variation.   Table tag "fvar" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_FPGM        = 0x6670676d;

  /**
   * Font program.   Table tag "fpgm" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_DSIG        = 0x44534947;

  /**
   * Digital signature.  Table tag "DSIG" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_GSUB        = 0x47535542;

  /**
   * Glyph substitution.  Table tag "GSUB" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_BSLN        = 0x62736c6e;

  /**
   * Baseline table.  Table tag "bsln" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_TYP1        = 0x74797031;

  /**
   * Adobe Type 1 font data.  Table tag "typ1" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_HHEA        = 0x68686561;

  /**
   * Horizontal metrics header.  Table tag "hhea" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_VHEA        = 0x76686561;

  /**
   * Vertical metrics header.  Table tag "vhea" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_VMTX        = 0x766d7478;

  /**
   * Vertical metrics.  Table tag "vmtx" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_VDMX        = 0x56444d58;

  /**
   * Vertical device metrics.  Table tag "VDMX" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_GASP        = 0x67617370;

  /**
   * Grid-fitting and scan conversion procedure.  Table tag
   * "gasp" in the Open Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_CVT = 0x63767420;

  /**
   * Control value table.  Table tag "cvt "
   * in the Open Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_OS2 = 0x4f532f32;

  /**
   * OS/2 and Windows specific metrics.  Table tag "OS/2"
   * in the Open Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_POST        = 0x706f7374;

  /**
   * PostScript Information.  Table tag "post" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_LOCA        = 0x6c6f6361;

  /**
   * Index to location.  Table tag "loca" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_HDMX        = 0x68646d78;

  /**
   * Horizontal device metrics.  Table tag "hdmx" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_KERN        = 0x6b65726e;

  /**
   * Kerning.  Table tag "kern" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_HMTX        = 0x686d7478;

  /**
   * Horizontal metrics.  Table tag "hmtx" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_PREP        = 0x70726570;

  /**
   * CVT preprogram.  Table tag "prep" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_MAXP        = 0x6d617870;

  /**
   * Maximum profile.  Table tag "maxp" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_GLYF        = 0x676c7966;

  /**
   * Glyph data.  Table tag "glyf" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_NAME        = 0x6e616d65;

  /**
   * Naming table.  Table tag "name" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_HEAD        = 0x68656164;

  /**
   * Font header.  Table tag "head" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_CMAP        = 0x636d6170;

  /**
   * Character to glyph mapping.  Table tag "cmap" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
public interface OpenType {

/**
 * The <code>OpenType</code> interface represents OpenType and
 * TrueType fonts.  This interface makes it possible to obtain
 * <i>sfnt</i> tables from the font.  A particular
 * <code>Font</code> object can implement this interface.
 * <p>
 * For more information on TrueType and OpenType fonts, see the
 * OpenType specification.
 * ( <a href="http://www.microsoft.com/typography/otspec/">http://www.microsoft.com/typography/otspec/</a> ).
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public int getFontTableSize(String strSfntTag);

  /**
   * Returns the size of the table for a specified tag. Tags for sfnt
   * tables include items like <i>cmap</i>, <i>name</i> and <i>head</i>.
   * @param     strSfntTag a four-character code as a
   * <code>String</code>
   * @return the size of the table corresponding to the specified tag.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public int getFontTableSize(int sfntTag);

  /**
   * Returns the size of the table for a specified tag. Tags for sfnt
   * tables include items like <i>cmap</i>, <i>name</i> and <i>head</i>.
   * @param     sfntTag a four-character code as a 32-bit integer
   * @return the size of the table corresponding to the specified
   * tag.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public byte[] getFontTable(String strSfntTag, int offset, int count);

  /**
   * Returns a subset of the table as an array of bytes
   * for a specified tag.  Tags for sfnt tables include items
   * like <i>cmap</i>, <i>name</i> and <i>head</i>. The
   * <code>byte</code> array returned is a copy of the font
   * data in memory.
   * @param     strSfntTag a four-character code as a
   * <code>String</code>
   * @param     offset index of first byte to return from table
   * @param     count  number of bytes to return from table
   * @return a subset of the table corresponding to
   *            <code>strSfntTag</code> and containing the bytes
   *            starting at <code>offset</code> byte and including
   *            <code>count</code> bytes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public byte[] getFontTable(int sfntTag, int offset, int count);

  /**
   * Returns a subset of the table as an array of bytes
   * for a specified tag.  Tags for sfnt tables include
   * items like <i>cmap</i>, <i>name</i> and <i>head</i>.
   * The byte array returned is a copy of the font data in
   * memory.
   * @param     sfntTag a four-character code as a 32-bit integer
   * @param     offset index of first byte to return from table
   * @param     count number of bytes to return from table
   * @return a subset of the table corresponding to
   *            <code>sfntTag</code> and containing the bytes
   *            starting at <code>offset</code> byte and including
   *            <code>count</code> bytes.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public byte[] getFontTable(String strSfntTag);

  /**
   * Returns the table as an array of bytes for a specified tag.
   * Tags for sfnt tables include items like <i>cmap</i>,
   * <i>name</i> and <i>head</i>.  The byte array returned is a
   * copy of the font data in memory.
   * @param     strSfntTag a four-character code as a
   *            <code>String</code>
   * @return a <code>byte</code> array that is the table that
   * contains the font data corresponding to the specified
   * tag.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public byte[] getFontTable(int sfntTag);

  /**
   * Returns the table as an array of bytes for a specified tag.
   * Tags for sfnt tables include items like <i>cmap</i>,
   * <i>name</i> and <i>head</i>.  The <code>byte</code> array
   * returned is a copy of the font data in memory.
   * @param     sfntTag a four-character code as a 32-bit integer
   * @return a <code>byte</code> array that is the table that
   * contains the font data corresponding to the specified
   * tag.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public int getVersion();

  /**
   * Returns the version of the <code>OpenType</code> font.
   * 1.0 is represented as 0x00010000.
   * @return the version of the <code>OpenType</code> font.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_TRAK        = 0x7472616b;

  /**
   * Tracking.  Table tag "trak" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_PROP        = 0x70726f70;

  /**
   * Glyph properties.  Table tag "prop" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_OPBD        = 0x6d6f7274;

  /**
   * Optical bounds.  Table tag "opbd" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_MORT        = 0x6d6f7274;

  /**
   * Glyph metamorphosis.  Table tag "mort" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_LCAR        = 0x6c636172;

  /**
   * Ligature caret.   Table tag "lcar" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_JUST        = 0x6a757374;

  /**
   * Justification.  Table tag "just" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_FMTX        = 0x666d7478;

  /**
   * Font metrics.  Table tag "fmtx" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_FDSC        = 0x66647363;

  /**
   * Font descriptors.  Table tag "fdsc" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_FEAT        = 0x66656174;

  /**
   * Feature name.  Table tag "feat" in the Open
    * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_CVAR        = 0x63766172;

   /**
    * CVT variation.  Table tag "cvar" in the Open
    * Type Specification.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_BLOC        = 0x626c6f63;

  /**
   * Bitmap location.  Table tag "bloc" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_BDAT        = 0x62646174;

  /**
   * Bitmap data.  Table tag "bdat" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_AVAR        = 0x61766172;

  /**
   * Axis variation.  Table tag "avar" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_ACNT        = 0x61636e74;

  /**
   * Accent attachment.  Table tag "acnt" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_PCLT        = 0x50434c54;

  /**
   * PCL 5 data.  Table tag "PCLT" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_LTSH        = 0x4c545348;

  /**
   * Linear threshold.  Table tag "LTSH" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_EBSC        = 0x45425343;

  /**
   * Embedded bitmap scaling.  Table tag "EBSC" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_EBLC        = 0x45424c43;

  /**
   * Embedded bitmap location.  Table tag "EBLC" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_EBDT        = 0x45424454;

  /**
   * Embedded bitmap data.  Table tag "EBDT" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_JSTF        = 0x4a535446;

  /**
   * Justification.  Table tag "JSTF" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_GPOS        = 0x47504f53;

  /**
   * Glyph positioning.  Table tag "GPOS" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_GDEF        = 0x47444546;

  /**
   * Glyph definition.  Table tag "GDEF" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_BASE        = 0x42415345;

  /**
   * Baseline data.  Table tag "BASE" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_MMFX        = 0x4d4d4658;

  /**
   * Multiple master font metrics.  Table tag
   * "MMFX" in the Open Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_MMSD        = 0x4d4d5344;

  /**
   * Multiple master supplementary data.  Table tag
   * "MMSD" in the Open Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_CFF = 0x43464620;

  /**
   * Compact font format (Type1 font).  Table tag
   * "CFF " in the Open Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_GVAR        = 0x67766172;

  /**
   * Glyph variation.  Table tag "gvar" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_FVAR        = 0x66766172;

  /**
   * Font variation.   Table tag "fvar" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_FPGM        = 0x6670676d;

  /**
   * Font program.   Table tag "fpgm" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_DSIG        = 0x44534947;

  /**
   * Digital signature.  Table tag "DSIG" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_GSUB        = 0x47535542;

  /**
   * Glyph substitution.  Table tag "GSUB" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_BSLN        = 0x62736c6e;

  /**
   * Baseline table.  Table tag "bsln" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_TYP1        = 0x74797031;

  /**
   * Adobe Type 1 font data.  Table tag "typ1" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_HHEA        = 0x68686561;

  /**
   * Horizontal metrics header.  Table tag "hhea" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_VHEA        = 0x76686561;

  /**
   * Vertical metrics header.  Table tag "vhea" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_VMTX        = 0x766d7478;

  /**
   * Vertical metrics.  Table tag "vmtx" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_VDMX        = 0x56444d58;

  /**
   * Vertical device metrics.  Table tag "VDMX" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_GASP        = 0x67617370;

  /**
   * Grid-fitting and scan conversion procedure.  Table tag
   * "gasp" in the Open Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_CVT = 0x63767420;

  /**
   * Control value table.  Table tag "cvt "
   * in the Open Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_OS2 = 0x4f532f32;

  /**
   * OS/2 and Windows specific metrics.  Table tag "OS/2"
   * in the Open Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_POST        = 0x706f7374;

  /**
   * PostScript Information.  Table tag "post" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_LOCA        = 0x6c6f6361;

  /**
   * Index to location.  Table tag "loca" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_HDMX        = 0x68646d78;

  /**
   * Horizontal device metrics.  Table tag "hdmx" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_KERN        = 0x6b65726e;

  /**
   * Kerning.  Table tag "kern" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_HMTX        = 0x686d7478;

  /**
   * Horizontal metrics.  Table tag "hmtx" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_PREP        = 0x70726570;

  /**
   * CVT preprogram.  Table tag "prep" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_MAXP        = 0x6d617870;

  /**
   * Maximum profile.  Table tag "maxp" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_GLYF        = 0x676c7966;

  /**
   * Glyph data.  Table tag "glyf" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_NAME        = 0x6e616d65;

  /**
   * Naming table.  Table tag "name" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_HEAD        = 0x68656164;

  /**
   * Font header.  Table tag "head" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
  public final static int       TAG_CMAP        = 0x636d6170;

  /**
   * Character to glyph mapping.  Table tag "cmap" in the Open
   * Type Specification.
   */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/font/OpenType.java
public interface OpenType {

/**
 * The <code>OpenType</code> interface represents OpenType and
 * TrueType fonts.  This interface makes it possible to obtain
 * <i>sfnt</i> tables from the font.  A particular
 * <code>Font</code> object can implement this interface.
 * <p>
 * For more information on TrueType and OpenType fonts, see the
 * OpenType specification.
 * ( <a href="http://www.microsoft.com/typography/otspec/">http://www.microsoft.com/typography/otspec/</a> ).
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenType.java
    private void readObject(ObjectInputStream in)

    /**
     * Deserializes an {@link OpenType} from an {@link java.io.ObjectInputStream}.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenType.java
    public abstract String toString() ;

    /**
     * Returns a string representation of this open type instance.
     *
     * @return the string representation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenType.java
    public abstract boolean equals(Object obj) ;

    /**
     * Compares the specified <code>obj</code> parameter with this
     * open type instance for equality.
     *
     * @param obj the object to compare to.
     *
     * @return true if this object and <code>obj</code> are equal.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenType.java
    boolean isAssignableFrom(OpenType<?> ot) {

    /**
     * Tests whether values of the given type can be assigned to this open type.
     * The default implementation of this method returns true only if the
     * types are equal.
     *
     * @param ot the type to be tested.
     *
     * @return true if {@code ot} is assignable to this open type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenType.java
    public abstract boolean isValue(Object obj) ;

    /**
     * Tests whether <var>obj</var> is a value for this open type.
     *
     * @param obj the object to be tested for validity.
     *
     * @return <code>true</code> if <var>obj</var> is a value for this
     * open type, <code>false</code> otherwise.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenType.java
    public boolean isArray() {

    /**
     * Returns <code>true</code> if the open data values this open
     * type describes are arrays, <code>false</code> otherwise.
     *
     * @return true if this is an array type.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenType.java
    public String getDescription() {

    /**
     * Returns the text description of this <code>OpenType</code> instance.
     *
     * @return the description.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenType.java
    public String getTypeName() {

    /**
     * Returns the name of this <code>OpenType</code> instance.
     *
     * @return the type name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenType.java
    public String getClassName() {

    /**
     * Returns the fully qualified Java class name of the open data values
     * this open type describes.
     * The only possible Java class names for open data values are listed in
     * {@link #ALLOWED_CLASSNAMES_LIST ALLOWED_CLASSNAMES_LIST}.
     * A multidimensional array of any one of these classes or their
     * corresponding primitive types is also an allowed class,
     * in which case the class name follows the rules defined by the method
     * {@link Class#getName() getName()} of <code>java.lang.Class</code>.
     * For example, a 3-dimensional array of Strings has for class name
     * &quot;<code>[[[Ljava.lang.String;</code>&quot; (without the quotes),
     * a 3-dimensional array of Integers has for class name
     * &quot;<code>[[[Ljava.lang.Integer;</code>&quot; (without the quotes),
     * and a 3-dimensional array of int has for class name
     * &quot;<code>[[[I</code>&quot; (without the quotes)
     *
     * @return the class name.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenType.java
    protected OpenType(String  className,
                       String  typeName,
                       String  description) throws OpenDataException {

    /**
     * Constructs an <code>OpenType</code> instance (actually a subclass instance as <code>OpenType</code> is abstract),
     * checking for the validity of the given parameters.
     * The validity constraints are described below for each parameter.
     * <br>&nbsp;
     * @param  className  The fully qualified Java class name of the open data values this open type describes.
     *                    The valid Java class names allowed for open data values are listed in
     *                    {@link #ALLOWED_CLASSNAMES_LIST ALLOWED_CLASSNAMES_LIST}.
     *                    A multidimensional array of any one of these classes
     *                    or their corresponding primitive types is also an allowed class,
     *                    in which case the class name follows the rules defined by the method
     *                    {@link Class#getName() getName()} of <code>java.lang.Class</code>.
     *                    For example, a 3-dimensional array of Strings has for class name
     *                    &quot;<code>[[[Ljava.lang.String;</code>&quot; (without the quotes).
     * <br>&nbsp;
     * @param  typeName  The name given to the open type this instance represents; cannot be a null or empty string.
     * <br>&nbsp;
     * @param  description  The human readable description of the open type this instance represents;
     *                      cannot be a null or empty string.
     * <br>&nbsp;
     * @throws IllegalArgumentException  if <var>className</var>, <var>typeName</var> or <var>description</var>
     *                                   is a null or empty string
     * <br>&nbsp;
     * @throws OpenDataException  if <var>className</var> is not one of the allowed Java class names for open data
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenType.java
    private transient Descriptor descriptor;

    /**
     * Cached Descriptor for this OpenType, constructed on demand.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenType.java
    private transient boolean isArray = false;

    /**
     * Tells if this type describes an array (checked in constructor).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenType.java
    private String typeName;

    /**
     * @serial The name given to this type (should not be null or empty).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenType.java
    private String description;

    /**
     * @serial The type description (should not be null or empty).
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenType.java
    private String className;

    /**
     * @serial The fully qualified Java class name of open data values this
     *         type describes.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenType.java
    @Deprecated

    /**
     * @deprecated Use {@link #ALLOWED_CLASSNAMES_LIST ALLOWED_CLASSNAMES_LIST} instead.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenType.java
    public static final List<String> ALLOWED_CLASSNAMES_LIST =

    /**
     * List of the fully qualified names of the Java classes allowed for open
     * data values. A multidimensional array of any one of these classes or
     * their corresponding primitive types is also an allowed class for open
     * data values.
     *
       <pre>ALLOWED_CLASSNAMES_LIST = {
        "java.lang.Void",
        "java.lang.Boolean",
        "java.lang.Character",
        "java.lang.Byte",
        "java.lang.Short",
        "java.lang.Integer",
        "java.lang.Long",
        "java.lang.Float",
        "java.lang.Double",
        "java.lang.String",
        "java.math.BigDecimal",
        "java.math.BigInteger",
        "java.util.Date",
        "javax.management.ObjectName",
        CompositeData.class.getName(),
        TabularData.class.getName() } ;
       </pre>
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/management/openmbean/OpenType.java
public abstract class OpenType<T> implements Serializable {

/**
 * The <code>OpenType</code> class is the parent abstract class of all classes which describe the actual <i>open type</i>
 * of open data values.
 * <p>
 * An <i>open type</i> is defined by:
 * <ul>
 *  <li>the fully qualified Java class name of the open data values this type describes;
 *      note that only a limited set of Java classes is allowed for open data values
 *      (see {@link #ALLOWED_CLASSNAMES_LIST ALLOWED_CLASSNAMES_LIST}),</li>
 *  <li>its name,</li>
 *  <li>its description.</li>
 * </ul>
 *
 * @param <T> the Java type that instances described by this type must
 * have.  For example, {@link SimpleType#INTEGER} is a {@code
 * SimpleType<Integer>} which is a subclass of {@code OpenType<Integer>},
 * meaning that an attribute, parameter, or return value that is described
 * as a {@code SimpleType.INTEGER} must have Java type
 * {@link Integer}.
 *
 * @since 1.5
 */
