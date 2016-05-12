_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/MediaTray.java
    protected EnumSyntax[] getEnumValueTable() {

    /**
     * Returns the enumeration value table for class MediaTray.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/MediaTray.java
    protected String[] getStringTable()

    /**
     * Returns the string table for class MediaTray.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/MediaTray.java
    protected MediaTray(int value) {

    /**
     * Construct a new media tray enumeration value with the given integer
     * value.
     *
     * @param  value  Integer value.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/MediaTray.java
    public static final MediaTray SIDE = new MediaTray(7);

    /**
     * The side input tray.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/MediaTray.java
    public static final MediaTray MAIN = new MediaTray(6);

    /**
     * The main input tray in the printer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/MediaTray.java
    public static final MediaTray LARGE_CAPACITY = new MediaTray(5);

    /**
     * The large capacity input tray in the printer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/MediaTray.java
    public static final MediaTray MANUAL = new MediaTray(4);

    /**
     * The manual feed input tray in the printer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/MediaTray.java
    public static final MediaTray ENVELOPE = new MediaTray(3);

    /**
     * The envelope input tray in the printer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/MediaTray.java
    public static final MediaTray BOTTOM = new MediaTray(2);

    /**
     * The bottom input tray in the printer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/MediaTray.java
    public static final MediaTray MIDDLE = new MediaTray(1);

    /**
     * The middle input tray in the printer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/MediaTray.java
    public static final MediaTray TOP = new MediaTray(0);

    /**
     * The top input tray in the printer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/attribute/standard/MediaTray.java
public class MediaTray extends Media implements Attribute {

/**
 * Class MediaTray is a subclass of Media.
 * Class MediaTray is a printing attribute class, an enumeration, that
 * specifies the media tray or bin for the job.
 * This attribute can be used instead of specifying MediaSize or MediaName.
 * <p>
 * Class MediaTray declares keywords for standard media kind values.
 * Implementation- or site-defined names for a media kind attribute may also
 * be created by defining a subclass of class MediaTray.
 * <P>
 * <B>IPP Compatibility:</B> MediaTray is a representation class for
 * values of the IPP "media" attribute which name paper trays.
 * <P>
 *
 */
