_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Err.hpp

////////////////////////////////////////////////////////////
/// \fn sf::err
/// \ingroup system
///
/// By default, sf::err() outputs to the same location as std::cerr,
/// (-> the stderr descriptor) which is the console if there's
/// one available.
///
/// It is a standard std::ostream instance, so it supports all the
/// insertion operations defined by the STL
/// (operator <<, manipulators, etc.).
///
/// sf::err() can be redirected to write to another output, independantly
/// of std::cerr, by using the rdbuf() function provided by the
/// std::ostream class.
///
/// Example:
/// \code
/// // Redirect to a file
/// std::ofstream file("sfml-log.txt");
/// std::streambuf* previous = sf::err().rdbuf(file.rdbuf());
///
/// // Redirect to nothing
/// sf::err().rdbuf(NULL);
///
/// // Restore the original output
/// sf::err().rdbuf(previous);
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Err.hpp
SFML_SYSTEM_API std::ostream& err();

////////////////////////////////////////////////////////////
/// \brief Standard stream used by SFML to output warnings and errors
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Err.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Err.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Err.hpp
#ifndef SFML_ERR_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Err.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Err.hpp

////////////////////////////////////////////////////////////
/// \fn sf::err
/// \ingroup system
///
/// By default, sf::err() outputs to the same location as std::cerr,
/// (-> the stderr descriptor) which is the console if there's
/// one available.
///
/// It is a standard std::ostream instance, so it supports all the
/// insertion operations defined by the STL
/// (operator <<, manipulators, etc.).
///
/// sf::err() can be redirected to write to another output, independantly
/// of std::cerr, by using the rdbuf() function provided by the
/// std::ostream class.
///
/// Example:
/// \code
/// // Redirect to a file
/// std::ofstream file("sfml-log.txt");
/// std::streambuf* previous = sf::err().rdbuf(file.rdbuf());
///
/// // Redirect to nothing
/// sf::err().rdbuf(NULL);
///
/// // Restore the original output
/// sf::err().rdbuf(previous);
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Err.hpp
SFML_SYSTEM_API std::ostream& err();

////////////////////////////////////////////////////////////
/// \brief Standard stream used by SFML to output warnings and errors
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Err.hpp
#include <SFML/System/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Err.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Err.hpp
#ifndef SFML_ERR_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/Err.hpp
//

////////////////////////////////////////////////////////////
