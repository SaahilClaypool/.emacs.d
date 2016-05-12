_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PrintJob.java
    public void finalize() {

    /**
     * Ends this print job once it is no longer referenced.
     * @see #end
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PrintJob.java
    public abstract void end();

    /**
     * Ends the print job and does any necessary cleanup.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PrintJob.java
    public abstract boolean lastPageFirst();

    /**
     * Returns true if the last page will be printed first.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PrintJob.java
    public abstract int getPageResolution();

    /**
     * Returns the resolution of the page in pixels per inch.
     * Note that this doesn't have to correspond to the physical
     * resolution of the printer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PrintJob.java
    public abstract Dimension getPageDimension();

    /**
     * Returns the dimensions of the page in pixels.
     * The resolution of the page is chosen so that it
     * is similar to the screen resolution.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PrintJob.java
    public abstract Graphics getGraphics();

    /**
     * Gets a Graphics object that will draw to the next page.
     * The page is sent to the printer when the graphics
     * object is disposed.  This graphics object will also implement
     * the PrintGraphics interface.
     * @see PrintGraphics
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PrintJob.java
public abstract class PrintJob {

/**
 * An abstract class which initiates and executes a print job.
 * It provides access to a print graphics object which renders
 * to an appropriate print device.
 *
 * @see Toolkit#getPrintJob
 *
 * @author      Amy Fowler
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PrintJob.java
    public void finalize() {

    /**
     * Ends this print job once it is no longer referenced.
     * @see #end
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PrintJob.java
    public abstract void end();

    /**
     * Ends the print job and does any necessary cleanup.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PrintJob.java
    public abstract boolean lastPageFirst();

    /**
     * Returns true if the last page will be printed first.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PrintJob.java
    public abstract int getPageResolution();

    /**
     * Returns the resolution of the page in pixels per inch.
     * Note that this doesn't have to correspond to the physical
     * resolution of the printer.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PrintJob.java
    public abstract Dimension getPageDimension();

    /**
     * Returns the dimensions of the page in pixels.
     * The resolution of the page is chosen so that it
     * is similar to the screen resolution.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PrintJob.java
    public abstract Graphics getGraphics();

    /**
     * Gets a Graphics object that will draw to the next page.
     * The page is sent to the printer when the graphics
     * object is disposed.  This graphics object will also implement
     * the PrintGraphics interface.
     * @see PrintGraphics
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//java/awt/PrintJob.java
public abstract class PrintJob {

/**
 * An abstract class which initiates and executes a print job.
 * It provides access to a print graphics object which renders
 * to an appropriate print device.
 *
 * @see Toolkit#getPrintJob
 *
 * @author      Amy Fowler
 */
