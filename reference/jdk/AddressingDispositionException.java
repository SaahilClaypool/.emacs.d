_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/protocol/AddressingDispositionException.java
public class AddressingDispositionException extends RuntimeException {

/**
 * This exception is thrown while reading GIOP 1.2 Request, LocateRequest
 * to indicate that a TargetAddress disposition is unacceptable.
 * If this exception is caught explicitly, this need to be rethrown. This
 * is eventually handled within RequestPRocessor and an appropriate reply
 * is sent back to the client.
 *
 * GIOP 1.2 allows three dispositions : KeyAddr (ObjectKey), ProfileAddr (ior
 * profile), IORAddressingInfo (IOR). If the ORB does not support the
 * disposition contained in the GIOP Request / LocateRequest 1.2 message,
 * then it sends a Reply / LocateReply indicating the correct disposition,
 * which the client ORB shall use to transparently retry the request
 * with the correct disposition.
 *
 */
_func_
jdk
c:/Users/saahil claypool/Documents/JDKSource//com/sun/corba/se/impl/protocol/AddressingDispositionException.java
public class AddressingDispositionException extends RuntimeException {

/**
 * This exception is thrown while reading GIOP 1.2 Request, LocateRequest
 * to indicate that a TargetAddress disposition is unacceptable.
 * If this exception is caught explicitly, this need to be rethrown. This
 * is eventually handled within RequestPRocessor and an appropriate reply
 * is sent back to the client.
 *
 * GIOP 1.2 allows three dispositions : KeyAddr (ObjectKey), ProfileAddr (ior
 * profile), IORAddressingInfo (IOR). If the ORB does not support the
 * disposition contained in the GIOP Request / LocateRequest 1.2 message,
 * then it sends a Reply / LocateReply indicating the correct disposition,
 * which the client ORB shall use to transparently retry the request
 * with the correct disposition.
 *
 */
