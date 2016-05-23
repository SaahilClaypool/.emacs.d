_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp

////////////////////////////////////////////////////////////
/// \class sf::TcpListener
/// \ingroup network
///
/// A listener socket is a special type of socket that listens to
/// a given port and waits for connections on that port.
/// This is all it can do.
///
/// When a new connection is received, you must call accept and
/// the listener returns a new instance of sf::TcpSocket that
/// is properly initialized and can be used to communicate with
/// the new client.
///
/// Listener sockets are specific to the TCP protocol,
/// UDP sockets are connectionless and can therefore communicate
/// directly. As a consequence, a listener socket will always
/// return the new connections as sf::TcpSocket instances.
///
/// A listener is automatically closed on destruction, like all
/// other types of socket. However if you want to stop listening
/// before the socket is destroyed, you can call its close()
/// function.
///
/// Usage example:
/// \code
/// // Create a listener socket and make it wait for new
/// // connections on port 55001
/// sf::TcpListener listener;
/// listener.listen(55001);
///
/// // Endless loop that waits for new connections
/// while (running)
/// {
///     sf::TcpSocket client;
///     if (listener.accept(client) == sf::Socket::Done)
///     {
///         // A new client just connected!
///         std::cout << "New connection received from " << client.getRemoteAddress() << std::endl;
///         doSomethingWith(client);
///     }
/// }
/// \endcode
///
/// \see sf::TcpSocket, sf::Socket
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    Status accept(TcpSocket& socket);

    ////////////////////////////////////////////////////////////
    /// \brief Accept a new connection
    ///
    /// If the socket is in blocking mode, this function will
    /// not return until a connection is actually received.
    ///
    /// \param socket Socket that will hold the new connection
    ///
    /// \return Status code
    ///
    /// \see listen
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    void close();

    ////////////////////////////////////////////////////////////
    /// \brief Stop listening and close the socket
    ///
    /// This function gracefully stops the listener. If the
    /// socket is not listening, this function has no effect.
    ///
    /// \see listen
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    Status listen(unsigned short port);

    ////////////////////////////////////////////////////////////
    /// \brief Start listening for connections
    ///
    /// This functions makes the socket listen to the specified
    /// port, waiting for new connections.
    /// If the socket was previously listening to another port,
    /// it will be stopped first and bound to the new port.
    ///
    /// \param port Port to listen for new connections
    ///
    /// \return Status code
    ///
    /// \see accept, close
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    unsigned short getLocalPort() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the port to which the socket is bound locally
    ///
    /// If the socket is not listening to a port, this function
    /// returns 0.
    ///
    /// \return Port to which the socket is bound
    ///
    /// \see listen
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    TcpListener();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
class SFML_NETWORK_API TcpListener : public Socket

////////////////////////////////////////////////////////////
/// \brief Socket that listens to new TCP connections
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
#include <SFML/Network/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
#ifndef SFML_TCPLISTENER_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp

////////////////////////////////////////////////////////////
/// \class sf::TcpListener
/// \ingroup network
///
/// A listener socket is a special type of socket that listens to
/// a given port and waits for connections on that port.
/// This is all it can do.
///
/// When a new connection is received, you must call accept and
/// the listener returns a new instance of sf::TcpSocket that
/// is properly initialized and can be used to communicate with
/// the new client.
///
/// Listener sockets are specific to the TCP protocol,
/// UDP sockets are connectionless and can therefore communicate
/// directly. As a consequence, a listener socket will always
/// return the new connections as sf::TcpSocket instances.
///
/// A listener is automatically closed on destruction, like all
/// other types of socket. However if you want to stop listening
/// before the socket is destroyed, you can call its close()
/// function.
///
/// Usage example:
/// \code
/// // Create a listener socket and make it wait for new
/// // connections on port 55001
/// sf::TcpListener listener;
/// listener.listen(55001);
///
/// // Endless loop that waits for new connections
/// while (running)
/// {
///     sf::TcpSocket client;
///     if (listener.accept(client) == sf::Socket::Done)
///     {
///         // A new client just connected!
///         std::cout << "New connection received from " << client.getRemoteAddress() << std::endl;
///         doSomethingWith(client);
///     }
/// }
/// \endcode
///
/// \see sf::TcpSocket, sf::Socket
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    Status accept(TcpSocket& socket);

    ////////////////////////////////////////////////////////////
    /// \brief Accept a new connection
    ///
    /// If the socket is in blocking mode, this function will
    /// not return until a connection is actually received.
    ///
    /// \param socket Socket that will hold the new connection
    ///
    /// \return Status code
    ///
    /// \see listen
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    void close();

    ////////////////////////////////////////////////////////////
    /// \brief Stop listening and close the socket
    ///
    /// This function gracefully stops the listener. If the
    /// socket is not listening, this function has no effect.
    ///
    /// \see listen
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    Status listen(unsigned short port);

    ////////////////////////////////////////////////////////////
    /// \brief Start listening for connections
    ///
    /// This functions makes the socket listen to the specified
    /// port, waiting for new connections.
    /// If the socket was previously listening to another port,
    /// it will be stopped first and bound to the new port.
    ///
    /// \param port Port to listen for new connections
    ///
    /// \return Status code
    ///
    /// \see accept, close
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    unsigned short getLocalPort() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the port to which the socket is bound locally
    ///
    /// If the socket is not listening to a port, this function
    /// returns 0.
    ///
    /// \return Port to which the socket is bound
    ///
    /// \see listen
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    TcpListener();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
class SFML_NETWORK_API TcpListener : public Socket

////////////////////////////////////////////////////////////
/// \brief Socket that listens to new TCP connections
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
#include <SFML/Network/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
#ifndef SFML_TCPLISTENER_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp

////////////////////////////////////////////////////////////
/// \class sf::TcpListener
/// \ingroup network
///
/// A listener socket is a special type of socket that listens to
/// a given port and waits for connections on that port.
/// This is all it can do.
///
/// When a new connection is received, you must call accept and
/// the listener returns a new instance of sf::TcpSocket that
/// is properly initialized and can be used to communicate with
/// the new client.
///
/// Listener sockets are specific to the TCP protocol,
/// UDP sockets are connectionless and can therefore communicate
/// directly. As a consequence, a listener socket will always
/// return the new connections as sf::TcpSocket instances.
///
/// A listener is automatically closed on destruction, like all
/// other types of socket. However if you want to stop listening
/// before the socket is destroyed, you can call its close()
/// function.
///
/// Usage example:
/// \code
/// // Create a listener socket and make it wait for new
/// // connections on port 55001
/// sf::TcpListener listener;
/// listener.listen(55001);
///
/// // Endless loop that waits for new connections
/// while (running)
/// {
///     sf::TcpSocket client;
///     if (listener.accept(client) == sf::Socket::Done)
///     {
///         // A new client just connected!
///         std::cout << "New connection received from " << client.getRemoteAddress() << std::endl;
///         doSomethingWith(client);
///     }
/// }
/// \endcode
///
/// \see sf::TcpSocket, sf::Socket
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    Status accept(TcpSocket& socket);

    ////////////////////////////////////////////////////////////
    /// \brief Accept a new connection
    ///
    /// If the socket is in blocking mode, this function will
    /// not return until a connection is actually received.
    ///
    /// \param socket Socket that will hold the new connection
    ///
    /// \return Status code
    ///
    /// \see listen
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    void close();

    ////////////////////////////////////////////////////////////
    /// \brief Stop listening and close the socket
    ///
    /// This function gracefully stops the listener. If the
    /// socket is not listening, this function has no effect.
    ///
    /// \see listen
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    Status listen(unsigned short port);

    ////////////////////////////////////////////////////////////
    /// \brief Start listening for connections
    ///
    /// This functions makes the socket listen to the specified
    /// port, waiting for new connections.
    /// If the socket was previously listening to another port,
    /// it will be stopped first and bound to the new port.
    ///
    /// \param port Port to listen for new connections
    ///
    /// \return Status code
    ///
    /// \see accept, close
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    unsigned short getLocalPort() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the port to which the socket is bound locally
    ///
    /// If the socket is not listening to a port, this function
    /// returns 0.
    ///
    /// \return Port to which the socket is bound
    ///
    /// \see listen
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    TcpListener();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
class SFML_NETWORK_API TcpListener : public Socket

////////////////////////////////////////////////////////////
/// \brief Socket that listens to new TCP connections
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
#include <SFML/Network/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
#ifndef SFML_TCPLISTENER_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp

////////////////////////////////////////////////////////////
/// \class sf::TcpListener
/// \ingroup network
///
/// A listener socket is a special type of socket that listens to
/// a given port and waits for connections on that port.
/// This is all it can do.
///
/// When a new connection is received, you must call accept and
/// the listener returns a new instance of sf::TcpSocket that
/// is properly initialized and can be used to communicate with
/// the new client.
///
/// Listener sockets are specific to the TCP protocol,
/// UDP sockets are connectionless and can therefore communicate
/// directly. As a consequence, a listener socket will always
/// return the new connections as sf::TcpSocket instances.
///
/// A listener is automatically closed on destruction, like all
/// other types of socket. However if you want to stop listening
/// before the socket is destroyed, you can call its close()
/// function.
///
/// Usage example:
/// \code
/// // Create a listener socket and make it wait for new
/// // connections on port 55001
/// sf::TcpListener listener;
/// listener.listen(55001);
///
/// // Endless loop that waits for new connections
/// while (running)
/// {
///     sf::TcpSocket client;
///     if (listener.accept(client) == sf::Socket::Done)
///     {
///         // A new client just connected!
///         std::cout << "New connection received from " << client.getRemoteAddress() << std::endl;
///         doSomethingWith(client);
///     }
/// }
/// \endcode
///
/// \see sf::TcpSocket, sf::Socket
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    Status accept(TcpSocket& socket);

    ////////////////////////////////////////////////////////////
    /// \brief Accept a new connection
    ///
    /// If the socket is in blocking mode, this function will
    /// not return until a connection is actually received.
    ///
    /// \param socket Socket that will hold the new connection
    ///
    /// \return Status code
    ///
    /// \see listen
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    void close();

    ////////////////////////////////////////////////////////////
    /// \brief Stop listening and close the socket
    ///
    /// This function gracefully stops the listener. If the
    /// socket is not listening, this function has no effect.
    ///
    /// \see listen
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    Status listen(unsigned short port);

    ////////////////////////////////////////////////////////////
    /// \brief Start listening for connections
    ///
    /// This functions makes the socket listen to the specified
    /// port, waiting for new connections.
    /// If the socket was previously listening to another port,
    /// it will be stopped first and bound to the new port.
    ///
    /// \param port Port to listen for new connections
    ///
    /// \return Status code
    ///
    /// \see accept, close
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    unsigned short getLocalPort() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the port to which the socket is bound locally
    ///
    /// If the socket is not listening to a port, this function
    /// returns 0.
    ///
    /// \return Port to which the socket is bound
    ///
    /// \see listen
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    TcpListener();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
class SFML_NETWORK_API TcpListener : public Socket

////////////////////////////////////////////////////////////
/// \brief Socket that listens to new TCP connections
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
#include <SFML/Network/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
#ifndef SFML_TCPLISTENER_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp

////////////////////////////////////////////////////////////
/// \class sf::TcpListener
/// \ingroup network
///
/// A listener socket is a special type of socket that listens to
/// a given port and waits for connections on that port.
/// This is all it can do.
///
/// When a new connection is received, you must call accept and
/// the listener returns a new instance of sf::TcpSocket that
/// is properly initialized and can be used to communicate with
/// the new client.
///
/// Listener sockets are specific to the TCP protocol,
/// UDP sockets are connectionless and can therefore communicate
/// directly. As a consequence, a listener socket will always
/// return the new connections as sf::TcpSocket instances.
///
/// A listener is automatically closed on destruction, like all
/// other types of socket. However if you want to stop listening
/// before the socket is destroyed, you can call its close()
/// function.
///
/// Usage example:
/// \code
/// // Create a listener socket and make it wait for new
/// // connections on port 55001
/// sf::TcpListener listener;
/// listener.listen(55001);
///
/// // Endless loop that waits for new connections
/// while (running)
/// {
///     sf::TcpSocket client;
///     if (listener.accept(client) == sf::Socket::Done)
///     {
///         // A new client just connected!
///         std::cout << "New connection received from " << client.getRemoteAddress() << std::endl;
///         doSomethingWith(client);
///     }
/// }
/// \endcode
///
/// \see sf::TcpSocket, sf::Socket
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    Status accept(TcpSocket& socket);

    ////////////////////////////////////////////////////////////
    /// \brief Accept a new connection
    ///
    /// If the socket is in blocking mode, this function will
    /// not return until a connection is actually received.
    ///
    /// \param socket Socket that will hold the new connection
    ///
    /// \return Status code
    ///
    /// \see listen
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    void close();

    ////////////////////////////////////////////////////////////
    /// \brief Stop listening and close the socket
    ///
    /// This function gracefully stops the listener. If the
    /// socket is not listening, this function has no effect.
    ///
    /// \see listen
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    Status listen(unsigned short port);

    ////////////////////////////////////////////////////////////
    /// \brief Start listening for connections
    ///
    /// This functions makes the socket listen to the specified
    /// port, waiting for new connections.
    /// If the socket was previously listening to another port,
    /// it will be stopped first and bound to the new port.
    ///
    /// \param port Port to listen for new connections
    ///
    /// \return Status code
    ///
    /// \see accept, close
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    unsigned short getLocalPort() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the port to which the socket is bound locally
    ///
    /// If the socket is not listening to a port, this function
    /// returns 0.
    ///
    /// \return Port to which the socket is bound
    ///
    /// \see listen
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    TcpListener();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
class SFML_NETWORK_API TcpListener : public Socket

////////////////////////////////////////////////////////////
/// \brief Socket that listens to new TCP connections
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
#include <SFML/Network/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
#ifndef SFML_TCPLISTENER_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp

////////////////////////////////////////////////////////////
/// \class sf::TcpListener
/// \ingroup network
///
/// A listener socket is a special type of socket that listens to
/// a given port and waits for connections on that port.
/// This is all it can do.
///
/// When a new connection is received, you must call accept and
/// the listener returns a new instance of sf::TcpSocket that
/// is properly initialized and can be used to communicate with
/// the new client.
///
/// Listener sockets are specific to the TCP protocol,
/// UDP sockets are connectionless and can therefore communicate
/// directly. As a consequence, a listener socket will always
/// return the new connections as sf::TcpSocket instances.
///
/// A listener is automatically closed on destruction, like all
/// other types of socket. However if you want to stop listening
/// before the socket is destroyed, you can call its close()
/// function.
///
/// Usage example:
/// \code
/// // Create a listener socket and make it wait for new
/// // connections on port 55001
/// sf::TcpListener listener;
/// listener.listen(55001);
///
/// // Endless loop that waits for new connections
/// while (running)
/// {
///     sf::TcpSocket client;
///     if (listener.accept(client) == sf::Socket::Done)
///     {
///         // A new client just connected!
///         std::cout << "New connection received from " << client.getRemoteAddress() << std::endl;
///         doSomethingWith(client);
///     }
/// }
/// \endcode
///
/// \see sf::TcpSocket, sf::Socket
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    Status accept(TcpSocket& socket);

    ////////////////////////////////////////////////////////////
    /// \brief Accept a new connection
    ///
    /// If the socket is in blocking mode, this function will
    /// not return until a connection is actually received.
    ///
    /// \param socket Socket that will hold the new connection
    ///
    /// \return Status code
    ///
    /// \see listen
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    void close();

    ////////////////////////////////////////////////////////////
    /// \brief Stop listening and close the socket
    ///
    /// This function gracefully stops the listener. If the
    /// socket is not listening, this function has no effect.
    ///
    /// \see listen
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    Status listen(unsigned short port);

    ////////////////////////////////////////////////////////////
    /// \brief Start listening for connections
    ///
    /// This functions makes the socket listen to the specified
    /// port, waiting for new connections.
    /// If the socket was previously listening to another port,
    /// it will be stopped first and bound to the new port.
    ///
    /// \param port Port to listen for new connections
    ///
    /// \return Status code
    ///
    /// \see accept, close
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    unsigned short getLocalPort() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the port to which the socket is bound locally
    ///
    /// If the socket is not listening to a port, this function
    /// returns 0.
    ///
    /// \return Port to which the socket is bound
    ///
    /// \see listen
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    TcpListener();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
class SFML_NETWORK_API TcpListener : public Socket

////////////////////////////////////////////////////////////
/// \brief Socket that listens to new TCP connections
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
#include <SFML/Network/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
#ifndef SFML_TCPLISTENER_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp

////////////////////////////////////////////////////////////
/// \class sf::TcpListener
/// \ingroup network
///
/// A listener socket is a special type of socket that listens to
/// a given port and waits for connections on that port.
/// This is all it can do.
///
/// When a new connection is received, you must call accept and
/// the listener returns a new instance of sf::TcpSocket that
/// is properly initialized and can be used to communicate with
/// the new client.
///
/// Listener sockets are specific to the TCP protocol,
/// UDP sockets are connectionless and can therefore communicate
/// directly. As a consequence, a listener socket will always
/// return the new connections as sf::TcpSocket instances.
///
/// A listener is automatically closed on destruction, like all
/// other types of socket. However if you want to stop listening
/// before the socket is destroyed, you can call its close()
/// function.
///
/// Usage example:
/// \code
/// // Create a listener socket and make it wait for new
/// // connections on port 55001
/// sf::TcpListener listener;
/// listener.listen(55001);
///
/// // Endless loop that waits for new connections
/// while (running)
/// {
///     sf::TcpSocket client;
///     if (listener.accept(client) == sf::Socket::Done)
///     {
///         // A new client just connected!
///         std::cout << "New connection received from " << client.getRemoteAddress() << std::endl;
///         doSomethingWith(client);
///     }
/// }
/// \endcode
///
/// \see sf::TcpSocket, sf::Socket
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    Status accept(TcpSocket& socket);

    ////////////////////////////////////////////////////////////
    /// \brief Accept a new connection
    ///
    /// If the socket is in blocking mode, this function will
    /// not return until a connection is actually received.
    ///
    /// \param socket Socket that will hold the new connection
    ///
    /// \return Status code
    ///
    /// \see listen
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    void close();

    ////////////////////////////////////////////////////////////
    /// \brief Stop listening and close the socket
    ///
    /// This function gracefully stops the listener. If the
    /// socket is not listening, this function has no effect.
    ///
    /// \see listen
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    Status listen(unsigned short port);

    ////////////////////////////////////////////////////////////
    /// \brief Start listening for connections
    ///
    /// This functions makes the socket listen to the specified
    /// port, waiting for new connections.
    /// If the socket was previously listening to another port,
    /// it will be stopped first and bound to the new port.
    ///
    /// \param port Port to listen for new connections
    ///
    /// \return Status code
    ///
    /// \see accept, close
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    unsigned short getLocalPort() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the port to which the socket is bound locally
    ///
    /// If the socket is not listening to a port, this function
    /// returns 0.
    ///
    /// \return Port to which the socket is bound
    ///
    /// \see listen
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    TcpListener();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
class SFML_NETWORK_API TcpListener : public Socket

////////////////////////////////////////////////////////////
/// \brief Socket that listens to new TCP connections
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
#include <SFML/Network/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
#ifndef SFML_TCPLISTENER_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp

////////////////////////////////////////////////////////////
/// \class sf::TcpListener
/// \ingroup network
///
/// A listener socket is a special type of socket that listens to
/// a given port and waits for connections on that port.
/// This is all it can do.
///
/// When a new connection is received, you must call accept and
/// the listener returns a new instance of sf::TcpSocket that
/// is properly initialized and can be used to communicate with
/// the new client.
///
/// Listener sockets are specific to the TCP protocol,
/// UDP sockets are connectionless and can therefore communicate
/// directly. As a consequence, a listener socket will always
/// return the new connections as sf::TcpSocket instances.
///
/// A listener is automatically closed on destruction, like all
/// other types of socket. However if you want to stop listening
/// before the socket is destroyed, you can call its close()
/// function.
///
/// Usage example:
/// \code
/// // Create a listener socket and make it wait for new
/// // connections on port 55001
/// sf::TcpListener listener;
/// listener.listen(55001);
///
/// // Endless loop that waits for new connections
/// while (running)
/// {
///     sf::TcpSocket client;
///     if (listener.accept(client) == sf::Socket::Done)
///     {
///         // A new client just connected!
///         std::cout << "New connection received from " << client.getRemoteAddress() << std::endl;
///         doSomethingWith(client);
///     }
/// }
/// \endcode
///
/// \see sf::TcpSocket, sf::Socket
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    Status accept(TcpSocket& socket);

    ////////////////////////////////////////////////////////////
    /// \brief Accept a new connection
    ///
    /// If the socket is in blocking mode, this function will
    /// not return until a connection is actually received.
    ///
    /// \param socket Socket that will hold the new connection
    ///
    /// \return Status code
    ///
    /// \see listen
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    void close();

    ////////////////////////////////////////////////////////////
    /// \brief Stop listening and close the socket
    ///
    /// This function gracefully stops the listener. If the
    /// socket is not listening, this function has no effect.
    ///
    /// \see listen
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    Status listen(unsigned short port);

    ////////////////////////////////////////////////////////////
    /// \brief Start listening for connections
    ///
    /// This functions makes the socket listen to the specified
    /// port, waiting for new connections.
    /// If the socket was previously listening to another port,
    /// it will be stopped first and bound to the new port.
    ///
    /// \param port Port to listen for new connections
    ///
    /// \return Status code
    ///
    /// \see accept, close
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    unsigned short getLocalPort() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the port to which the socket is bound locally
    ///
    /// If the socket is not listening to a port, this function
    /// returns 0.
    ///
    /// \return Port to which the socket is bound
    ///
    /// \see listen
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    TcpListener();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
class SFML_NETWORK_API TcpListener : public Socket

////////////////////////////////////////////////////////////
/// \brief Socket that listens to new TCP connections
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
#include <SFML/Network/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
#ifndef SFML_TCPLISTENER_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp

////////////////////////////////////////////////////////////
/// \class sf::TcpListener
/// \ingroup network
///
/// A listener socket is a special type of socket that listens to
/// a given port and waits for connections on that port.
/// This is all it can do.
///
/// When a new connection is received, you must call accept and
/// the listener returns a new instance of sf::TcpSocket that
/// is properly initialized and can be used to communicate with
/// the new client.
///
/// Listener sockets are specific to the TCP protocol,
/// UDP sockets are connectionless and can therefore communicate
/// directly. As a consequence, a listener socket will always
/// return the new connections as sf::TcpSocket instances.
///
/// A listener is automatically closed on destruction, like all
/// other types of socket. However if you want to stop listening
/// before the socket is destroyed, you can call its close()
/// function.
///
/// Usage example:
/// \code
/// // Create a listener socket and make it wait for new
/// // connections on port 55001
/// sf::TcpListener listener;
/// listener.listen(55001);
///
/// // Endless loop that waits for new connections
/// while (running)
/// {
///     sf::TcpSocket client;
///     if (listener.accept(client) == sf::Socket::Done)
///     {
///         // A new client just connected!
///         std::cout << "New connection received from " << client.getRemoteAddress() << std::endl;
///         doSomethingWith(client);
///     }
/// }
/// \endcode
///
/// \see sf::TcpSocket, sf::Socket
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    Status accept(TcpSocket& socket);

    ////////////////////////////////////////////////////////////
    /// \brief Accept a new connection
    ///
    /// If the socket is in blocking mode, this function will
    /// not return until a connection is actually received.
    ///
    /// \param socket Socket that will hold the new connection
    ///
    /// \return Status code
    ///
    /// \see listen
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    void close();

    ////////////////////////////////////////////////////////////
    /// \brief Stop listening and close the socket
    ///
    /// This function gracefully stops the listener. If the
    /// socket is not listening, this function has no effect.
    ///
    /// \see listen
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    Status listen(unsigned short port);

    ////////////////////////////////////////////////////////////
    /// \brief Start listening for connections
    ///
    /// This functions makes the socket listen to the specified
    /// port, waiting for new connections.
    /// If the socket was previously listening to another port,
    /// it will be stopped first and bound to the new port.
    ///
    /// \param port Port to listen for new connections
    ///
    /// \return Status code
    ///
    /// \see accept, close
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    unsigned short getLocalPort() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the port to which the socket is bound locally
    ///
    /// If the socket is not listening to a port, this function
    /// returns 0.
    ///
    /// \return Port to which the socket is bound
    ///
    /// \see listen
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
    TcpListener();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
class SFML_NETWORK_API TcpListener : public Socket

////////////////////////////////////////////////////////////
/// \brief Socket that listens to new TCP connections
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
#include <SFML/Network/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
#ifndef SFML_TCPLISTENER_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Network/TcpListener.hpp
//

////////////////////////////////////////////////////////////
