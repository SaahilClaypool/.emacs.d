_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/ContactInfoListIterator.java
    public RuntimeException getFailureException();

    /**
     * The exception to report to the presentation block.
     *
     * @return If the iterator reaches the end before the invocation
     * is successful one returns this exception (previously reported to
     * the iterator via {@link #reportException}).

     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/ContactInfoListIterator.java
    public boolean reportException(ContactInfo contactInfo,
                                   RuntimeException exception);

    /**
     * Used to report information to the iterator to be used
     * in future invocations.
     *
     * @param contactInfo The
     * {@link com.sun.corba.se.pept.transport.ContactInfo ContactInfo}
     * in effect when an invocation exception occurs.
     * @param exception The
     * {@link java.lang.RuntimeException RuntimeException}.
     *
     * @return Returns true if the request should be retried.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/ContactInfoListIterator.java
    public void reportSuccess(ContactInfo contactInfo);

    /**
     * Used to report information to the iterator to be used
     * in future invocations.
     *
     * @param contactInfo The
     * {@link com.sun.corba.se.pept.transport.ContactInfo ContactInfo}
     * obtained from this iterator which resulted in a successful invocation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/ContactInfoListIterator.java
    public ContactInfoList getContactInfoList();

    /**
     * The underlying list for this iterator.
     *
     * @return The underlying list for this iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/ContactInfoListIterator.java
public interface ContactInfoListIterator

/**
 * <code>ContactInfoIterator</code> is used to retrieve individual
 * {@link com.sun.corba.se.pept.transport.ContactInfo ContactInfo}.
 *
 * @author Harold Carr
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/ContactInfoListIterator.java
    public RuntimeException getFailureException();

    /**
     * The exception to report to the presentation block.
     *
     * @return If the iterator reaches the end before the invocation
     * is successful one returns this exception (previously reported to
     * the iterator via {@link #reportException}).

     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/ContactInfoListIterator.java
    public boolean reportException(ContactInfo contactInfo,
                                   RuntimeException exception);

    /**
     * Used to report information to the iterator to be used
     * in future invocations.
     *
     * @param contactInfo The
     * {@link com.sun.corba.se.pept.transport.ContactInfo ContactInfo}
     * in effect when an invocation exception occurs.
     * @param exception The
     * {@link java.lang.RuntimeException RuntimeException}.
     *
     * @return Returns true if the request should be retried.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/ContactInfoListIterator.java
    public void reportSuccess(ContactInfo contactInfo);

    /**
     * Used to report information to the iterator to be used
     * in future invocations.
     *
     * @param contactInfo The
     * {@link com.sun.corba.se.pept.transport.ContactInfo ContactInfo}
     * obtained from this iterator which resulted in a successful invocation.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/ContactInfoListIterator.java
    public ContactInfoList getContactInfoList();

    /**
     * The underlying list for this iterator.
     *
     * @return The underlying list for this iterator.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/pept/transport/ContactInfoListIterator.java
public interface ContactInfoListIterator

/**
 * <code>ContactInfoIterator</code> is used to retrieve individual
 * {@link com.sun.corba.se.pept.transport.ContactInfo ContactInfo}.
 *
 * @author Harold Carr
 */
