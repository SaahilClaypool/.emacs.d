_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/event/PrintJobEvent.java
    public DocPrintJob getPrintJob() {

    /**
     * Determines the <code>DocPrintJob</code> to which this print job
     * event pertains.
     *
     * @return  the <code>DocPrintJob</code> object that represents the
     *          print job that reports the events encapsulated by this
     *          <code>PrintJobEvent</code>.
     *
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/event/PrintJobEvent.java
    public int getPrintEventType() {

    /**
     * Gets the reason for this event.
     * @return  reason int.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/event/PrintJobEvent.java
    public PrintJobEvent( DocPrintJob source, int reason) {

   /**
     * Constructs a <code>PrintJobEvent</code> object.
     *
     * @param source  a <code>DocPrintJob</code> object
     * @param reason  an int specifying the reason.
     * @throws IllegalArgumentException if <code>source</code> is
     *         <code>null</code>.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/event/PrintJobEvent.java
   public static final int DATA_TRANSFER_COMPLETE    = 106;

   /**
    * The job is not necessarily printed yet, but the data has been transferred
    * successfully from the client to the print service. The client may
    * free data resources.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/event/PrintJobEvent.java
   public static final int NO_MORE_EVENTS    = 105;

   /**
    * Not all print services may be capable of delivering interesting
    * events, or even telling when a job is complete. This message indicates
    * the print job has no further information or communication
    * with the print service. This message should always be delivered
    * if a terminal event (completed/failed/canceled) is not delivered.
    * For example, if messages such as JOB_COMPLETE have NOT been received
    * before receiving this message, the only inference that should be drawn
    * is that the print service does not support delivering such an event.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/event/PrintJobEvent.java
   public static final int REQUIRES_ATTENTION = 104;

   /**
    * The print service indicates that a - possibly transient - problem
    * may require external intervention before the print service can
    * continue.  One example of an event that can
    * generate this message is when the printer runs out of paper.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/event/PrintJobEvent.java
   public static final int JOB_FAILED         = 103;

   /**
    * The print service reports that the job cannot be completed.
    * The application must resubmit the job.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/event/PrintJobEvent.java
   public static final int JOB_COMPLETE       = 102;

   /**
    * The document cis completely printed.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/event/PrintJobEvent.java
   public static final int JOB_CANCELED   = 101;

   /**
    * The job was canceled by the {@link javax.print.PrintService PrintService}.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//javax/print/event/PrintJobEvent.java
public class PrintJobEvent extends PrintEvent {

/**
 *
 * Class <code>PrintJobEvent</code> encapsulates common events a print job
 * reports to let a listener know of progress in the processing of the
 * {@link DocPrintJob}.
 *
 */
