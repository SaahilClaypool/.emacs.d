_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundBufferRecorder.hpp

////////////////////////////////////////////////////////////
/// \class sf::SoundBufferRecorder
/// \ingroup audio
///
/// sf::SoundBufferRecorder allows to access a recorded sound
/// through a sf::SoundBuffer, so that it can be played, saved
/// to a file, etc.
///
/// It has the same simple interface as its base class (start(), stop())
/// and adds a function to retrieve the recorded sound buffer
/// (getBuffer()).
///
/// As usual, don't forget to call the isAvailable() function
/// before using this class (see sf::SoundRecorder for more details
/// about this).
///
/// Usage example:
/// \code
/// if (sf::SoundBufferRecorder::isAvailable())
/// {
///     // Record some audio data
///     sf::SoundBufferRecorder recorder;
///     recorder.start();
///     ...
///     recorder.stop();
///
///     // Get the buffer containing the captured audio data
///     const sf::SoundBuffer& buffer = recorder.getBuffer();
///
///     // Save it to a file (for example...)
///     buffer.saveToFile("my_record.ogg");
/// }
/// \endcode
///
/// \see sf::SoundRecorder
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundBufferRecorder.hpp
};

    ////////////////////////////////////////////////////////////
    std::vector<Int16> m_samples; ///< Temporary sample buffer to hold the recorded data
    SoundBuffer        m_buffer;  ///< Sound buffer that will contain the recorded data
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundBufferRecorder.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundBufferRecorder.hpp
    virtual void onStop();

    ////////////////////////////////////////////////////////////
    /// \brief Stop capturing audio data
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundBufferRecorder.hpp
    virtual bool onProcessSamples(const Int16* samples, std::size_t sampleCount);

    ////////////////////////////////////////////////////////////
    /// \brief Process a new chunk of recorded samples
    ///
    /// \param samples     Pointer to the new chunk of recorded samples
    /// \param sampleCount Number of samples pointed by \a samples
    ///
    /// \return True to continue the capture, or false to stop it
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundBufferRecorder.hpp
    virtual bool onStart();

    ////////////////////////////////////////////////////////////
    /// \brief Start capturing audio data
    ///
    /// \return True to start the capture, or false to abort it
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundBufferRecorder.hpp
    const SoundBuffer& getBuffer() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the sound buffer containing the captured audio data
    ///
    /// The sound buffer is valid only after the capture has ended.
    /// This function provides a read-only access to the internal
    /// sound buffer, but it can be copied if you need to
    /// make any modification to it.
    ///
    /// \return Read-only access to the sound buffer
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundBufferRecorder.hpp
class SFML_AUDIO_API SoundBufferRecorder : public SoundRecorder

////////////////////////////////////////////////////////////
/// \brief Specialized SoundRecorder which stores the captured
///        audio data into a sound buffer
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundBufferRecorder.hpp
#include <SFML/Audio/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundBufferRecorder.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundBufferRecorder.hpp
#ifndef SFML_SOUNDBUFFERRECORDER_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundBufferRecorder.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundBufferRecorder.hpp

////////////////////////////////////////////////////////////
/// \class sf::SoundBufferRecorder
/// \ingroup audio
///
/// sf::SoundBufferRecorder allows to access a recorded sound
/// through a sf::SoundBuffer, so that it can be played, saved
/// to a file, etc.
///
/// It has the same simple interface as its base class (start(), stop())
/// and adds a function to retrieve the recorded sound buffer
/// (getBuffer()).
///
/// As usual, don't forget to call the isAvailable() function
/// before using this class (see sf::SoundRecorder for more details
/// about this).
///
/// Usage example:
/// \code
/// if (sf::SoundBufferRecorder::isAvailable())
/// {
///     // Record some audio data
///     sf::SoundBufferRecorder recorder;
///     recorder.start();
///     ...
///     recorder.stop();
///
///     // Get the buffer containing the captured audio data
///     const sf::SoundBuffer& buffer = recorder.getBuffer();
///
///     // Save it to a file (for example...)
///     buffer.saveToFile("my_record.ogg");
/// }
/// \endcode
///
/// \see sf::SoundRecorder
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundBufferRecorder.hpp
};

    ////////////////////////////////////////////////////////////
    std::vector<Int16> m_samples; ///< Temporary sample buffer to hold the recorded data
    SoundBuffer        m_buffer;  ///< Sound buffer that will contain the recorded data
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundBufferRecorder.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundBufferRecorder.hpp
    virtual void onStop();

    ////////////////////////////////////////////////////////////
    /// \brief Stop capturing audio data
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundBufferRecorder.hpp
    virtual bool onProcessSamples(const Int16* samples, std::size_t sampleCount);

    ////////////////////////////////////////////////////////////
    /// \brief Process a new chunk of recorded samples
    ///
    /// \param samples     Pointer to the new chunk of recorded samples
    /// \param sampleCount Number of samples pointed by \a samples
    ///
    /// \return True to continue the capture, or false to stop it
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundBufferRecorder.hpp
    virtual bool onStart();

    ////////////////////////////////////////////////////////////
    /// \brief Start capturing audio data
    ///
    /// \return True to start the capture, or false to abort it
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundBufferRecorder.hpp
    const SoundBuffer& getBuffer() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the sound buffer containing the captured audio data
    ///
    /// The sound buffer is valid only after the capture has ended.
    /// This function provides a read-only access to the internal
    /// sound buffer, but it can be copied if you need to
    /// make any modification to it.
    ///
    /// \return Read-only access to the sound buffer
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundBufferRecorder.hpp
class SFML_AUDIO_API SoundBufferRecorder : public SoundRecorder

////////////////////////////////////////////////////////////
/// \brief Specialized SoundRecorder which stores the captured
///        audio data into a sound buffer
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundBufferRecorder.hpp
#include <SFML/Audio/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundBufferRecorder.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundBufferRecorder.hpp
#ifndef SFML_SOUNDBUFFERRECORDER_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundBufferRecorder.hpp
//

////////////////////////////////////////////////////////////
