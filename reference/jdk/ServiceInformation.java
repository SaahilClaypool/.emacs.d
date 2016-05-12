_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ServiceInformation.java
    public ServiceInformation(int[] __service_options,
                              org.omg.CORBA.ServiceDetail[] __service_details)

    /** Constructs a ServiceInformation object with the given service_options
    * and service_details.
    * @param __service_options An array of ints describing the service options.
    * @param __service_details An array of ServiceDetails describing the service
    * details.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ServiceInformation.java
    public ServiceInformation() { }

    /** Constructs a ServiceInformation object with empty service_options
    * and service_details.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ServiceInformation.java
    public org.omg.CORBA.ServiceDetail[] service_details;

    /** Array of ServiceDetails giving more details about the service.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ServiceInformation.java
    public int[] service_options;

    /** Array of ints representing service options.
    */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//org/omg/CORBA/ServiceInformation.java
public final class ServiceInformation implements org.omg.CORBA.portable.IDLEntity

/** An IDL struct in the CORBA module that
 *  stores information about a CORBA service available in the
 *  ORB implementation and is obtained from the <tt>ORB.get_service_information</tt>
 *  method.
 */
