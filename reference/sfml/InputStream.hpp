_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/InputStream.hpp

////////////////////////////////////////////////////////////
/// \class sf::InputStream
/// \ingroup system
///
/// This class allows users to define their own file input sources
/// from which SFML can load resources.
///
/// SFML resource classes like sf::Texture and
/// sf::SoundBuffer provide loadFromFile and loadFromMemory functions,
/// which read data from conventional sources. However, if you
/// have data coming from a different source (over a network,
/// embedded, encrypted, compressed, etc) you can derive your
/// own class from sf::InputStream and load SFML resources with
/// their loadFromStream function.
///
/// Usage example:
/// \code
/// // custom stream class that reads from inside a zip file
/// class ZipStream : public sf::InputStream
/// {
/// public :
/// 
///     ZipStream(std::string archive);
///
///     bool open(std::string filename);
///
///     Int64 read(void* data, Int64 size);
/// 
///     Int64 seek(Int64 position);
///     
///     Int64 tell();
/// 
///     Int64 getSize();
///
/// private :
///
///     ...
/// };
///
/// // now you can load textures...
/// sf::Texture texture;
/// ZipStream stream("resources.zip");
/// stream.open("images/img.png");
/// texture.loadFromStream(stream);
///
/// // musics...
/// sf::Music music;
/// ZipStream stream("resources.zip");
/// stream.open("musics/msc.ogg");
/// music.openFromStream(stream);
///
/// // etc.
/// \endcode
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/InputStream.hpp
    virtual Int64 getSize() = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Return the size of the stream
    ///
    /// \return The total number of bytes available in the stream, or -1 on error
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/InputStream.hpp
    virtual Int64 tell() = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Get the current reading position in the stream
    ///
    /// \return The current position, or -1 on error.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/InputStream.hpp
    virtual Int64 seek(Int64 position) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Change the current reading position
    ///
    /// \param position The position to seek to, from the beginning
    ///
    /// \return The position actually sought to, or -1 on error
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/InputStream.hpp
    virtual Int64 read(void* data, Int64 size) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Read data from the stream
    ///
    /// After reading, the stream's reading position must be
    /// advanced by the amount of bytes read.
    ///
    /// \param data Buffer where to copy the read data
    /// \param size Desired number of bytes to read
    ///
    /// \return The number of bytes actually read, or -1 on error
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/InputStream.hpp
    virtual ~InputStream() {}

    ////////////////////////////////////////////////////////////
    /// \brief Virtual destructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/InputStream.hpp
class InputStream

////////////////////////////////////////////////////////////
/// \brief Abstract class for custom file input streams
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/InputStream.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/InputStream.hpp
#ifndef SFML_INPUTSTREAM_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//System/InputStream.hpp
//

////////////////////////////////////////////////////////////
