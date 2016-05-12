_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ServiceDetail.java
    public ServiceDetail(int service_detail_type, byte[] service_detail) {

    /**
     * Constructs a <code>ServiceDetail</code> object with the given
     * ORB service type and the given description.
     *
     * @param service_detail_type an <code>int</code> specifying the type of
     *                            ORB service
     * @param service_detail a <code>byte</code> array describing the ORB service
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ServiceDetail.java
    public ServiceDetail() { }

    /**
     * Constructs a <code>ServiceDetail</code> object with 0 for the type of
     * ORB service and an empty description.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ServiceDetail.java
    public byte[] service_detail;

    /**
     * The data describing the ORB service that this <code>ServiceDetail</code>
     * object represents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ServiceDetail.java
    public int service_detail_type;

    /**
     * The type of the ORB service that this <code>ServiceDetail</code>
     * object represents.
     */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ServiceDetail.java
public final class ServiceDetail implements org.omg.CORBA.portable.IDLEntity

/**
 * An object that represents an ORB service: its <code>service_detail_type</code>
 * field contains the type of the ORB service, and its <code>service_detail</code>
 * field contains a description of the ORB service.

 *
 * @author RIP Team
 */
