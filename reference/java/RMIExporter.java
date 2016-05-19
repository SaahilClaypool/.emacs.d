_func_
java
c:/Users/Saahil/OneDrive/Code/EmacsPackage/jdksource//com/sun/jmx/remote/internal/RMIExporter.java
public interface RMIExporter {

/**
 * <p>Unpublished interface controlling how the RMI Connector Server
 * exports objects.  The RMIServerImpl object and each
 * RMIConnectionImpl object are exported using the exporter.  The
 * default exporter calls {@link
 * UnicastRemoteObject#exportObject(Remote, int,
 * RMIClientSocketFactory, RMIServerSocketFactory)} to export objects
 * and {@link UnicastRemoteObject#unexportObject(Remote, boolean)} to
 * unexport them.  A replacement exporter can be specified via the
 * {@link #EXPORTER_ATTRIBUTE} property in the environment Map passed
 * to the RMI connector server.</p>
 */
