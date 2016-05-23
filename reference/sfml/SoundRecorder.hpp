_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp

////////////////////////////////////////////////////////////
/// \class sf::SoundRecorder
/// \ingroup audio
///
/// sf::SoundBuffer provides a simple interface to access
/// the audio recording capabilities of the computer
/// (the microphone). As an abstract base class, it only cares
/// about capturing sound samples, the task of making something
/// useful with them is left to the derived class. Note that
/// SFML provides a built-in specialization for saving the
/// captured data to a sound buffer (see sf::SoundBufferRecorder).
///
/// A derived class has only one virtual function to override:
/// \li onProcessSamples provides the new chunks of audio samples while the capture happens
///
/// Moreover, two additionnal virtual functions can be overriden
/// as well if necessary:
/// \li onStart is called before the capture happens, to perform custom initializations
/// \li onStop is called after the capture ends, to perform custom cleanup
///
/// The audio capture feature may not be supported or activated
/// on every platform, thus it is recommended to check its
/// availability with the isAvailable() function. If it returns
/// false, then any attempt to use an audio recorder will fail.
///
/// It is important to note that the audio capture happens in a
/// separate thread, so that it doesn't block the rest of the
/// program. In particular, the onProcessSamples and onStop
/// virtual functions (but not onStart) will be called
/// from this separate thread. It is important to keep this in
/// mind, because you may have to take care of synchronization
/// issues if you share data between threads. 
///
/// Usage example:
/// \code
/// class CustomRecorder : public sf::SoundRecorder
/// {
///     virtual bool onStart() // optional
///     {
///         // Initialize whatever has to be done before the capture starts
///         ...
///
///         // Return true to start playing
///         return true;
///     }
///
///     virtual bool onProcessSamples(const Int16* samples, std::size_t sampleCount)
///     {
///         // Do something with the new chunk of samples (store them, send them, ...)
///         ...
///
///         // Return true to continue playing
///         return true;
///     }
///
///     virtual void onStop() // optional
///     {
///         // Clean up whatever has to be done after the capture ends
///         ...
///     }
/// }
///
/// // Usage
/// if (CustomRecorder::isAvailable())
/// {
///     CustomRecorder recorder;
///     recorder.start();
///     ...
///     recorder.stop();
/// }
/// \endcode
///
/// \see sf::SoundBufferRecorder
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
};

    ////////////////////////////////////////////////////////////
    Thread             m_thread;      ///< Thread running the background recording task
    std::vector<Int16> m_samples;     ///< Buffer to store captured samples
    unsigned int       m_sampleRate;  ///< Sample rate
    bool               m_isCapturing; ///< Capturing state
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void cleanup();

    ////////////////////////////////////////////////////////////
    /// \brief Clean up the recorder's internal resources
    ///
    /// This function is called when the capture stops.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void processCapturedSamples();

    ////////////////////////////////////////////////////////////
    /// \brief Get the new available audio samples and process them
    ///
    /// This function is called continuously during the
    /// capture loop. It retrieves the captured samples and
    /// forwards them to the derived class.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void record();

    ////////////////////////////////////////////////////////////
    /// \brief Function called as the entry point of the thread
    ///
    /// This function starts the recording loop, and returns
    /// only when the capture is stopped.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual void onStop();

    ////////////////////////////////////////////////////////////
    /// \brief Stop capturing audio data
    ///
    /// This virtual function may be overriden by a derived class
    /// if something has to be done every time the capture
    /// ends. If not, this function can be ignored; the default
    /// implementation does nothing.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual bool onProcessSamples(const Int16* samples, std::size_t sampleCount) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Process a new chunk of recorded samples
    ///
    /// This virtual function is called every time a new chunk of
    /// recorded data is available. The derived class can then do
    /// whatever it wants with it (storing it, playing it, sending
    /// it over the network, etc.).
    ///
    /// \param samples     Pointer to the new chunk of recorded samples
    /// \param sampleCount Number of samples pointed by \a samples
    ///
    /// \return True to continue the capture, or false to stop it
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual bool onStart();

    ////////////////////////////////////////////////////////////
    /// \brief Start capturing audio data
    ///
    /// This virtual function may be overriden by a derived class
    /// if something has to be done every time a new capture
    /// starts. If not, this function can be ignored; the default
    /// implementation does nothing.
    ///
    /// \return True to start the capture, or false to abort it
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    SoundRecorder();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// This constructor is only meant to be called by derived classes.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    static bool isAvailable();

    ////////////////////////////////////////////////////////////
    /// \brief Check if the system supports audio capture
    ///
    /// This function should always be called before using
    /// the audio capture features. If it returns false, then
    /// any attempt to use sf::SoundRecorder or one of its derived
    /// classes will fail.
    ///
    /// \return True if audio capture is supported, false otherwise
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    unsigned int getSampleRate() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the sample rate
    ///
    /// The sample rate defines the number of audio samples
    /// captured per second. The higher, the better the quality
    /// (for example, 44100 samples/sec is CD quality).
    ///
    /// \return Sample rate, in samples per second
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void stop();

    ////////////////////////////////////////////////////////////
    /// \brief Stop the capture
    ///
    /// \see start
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void start(unsigned int sampleRate = 44100);

    ////////////////////////////////////////////////////////////
    /// \brief Start the capture
    ///
    /// The \a sampleRate parameter defines the number of audio samples
    /// captured per second. The higher, the better the quality
    /// (for example, 44100 samples/sec is CD quality).
    /// This function uses its own thread so that it doesn't block
    /// the rest of the program while the capture runs.
    /// Please note that only one capture can happen at the same time.
    ///
    /// \param sampleRate Desired capture rate, in number of samples per second
    ///
    /// \see stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual ~SoundRecorder();

    ////////////////////////////////////////////////////////////
    /// \brief destructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
class SFML_AUDIO_API SoundRecorder

////////////////////////////////////////////////////////////
/// \brief Abstract base class for capturing sound data
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
#include <SFML/Audio/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
#ifndef SFML_SOUNDRECORDER_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp

////////////////////////////////////////////////////////////
/// \class sf::SoundRecorder
/// \ingroup audio
///
/// sf::SoundBuffer provides a simple interface to access
/// the audio recording capabilities of the computer
/// (the microphone). As an abstract base class, it only cares
/// about capturing sound samples, the task of making something
/// useful with them is left to the derived class. Note that
/// SFML provides a built-in specialization for saving the
/// captured data to a sound buffer (see sf::SoundBufferRecorder).
///
/// A derived class has only one virtual function to override:
/// \li onProcessSamples provides the new chunks of audio samples while the capture happens
///
/// Moreover, two additionnal virtual functions can be overriden
/// as well if necessary:
/// \li onStart is called before the capture happens, to perform custom initializations
/// \li onStop is called after the capture ends, to perform custom cleanup
///
/// The audio capture feature may not be supported or activated
/// on every platform, thus it is recommended to check its
/// availability with the isAvailable() function. If it returns
/// false, then any attempt to use an audio recorder will fail.
///
/// It is important to note that the audio capture happens in a
/// separate thread, so that it doesn't block the rest of the
/// program. In particular, the onProcessSamples and onStop
/// virtual functions (but not onStart) will be called
/// from this separate thread. It is important to keep this in
/// mind, because you may have to take care of synchronization
/// issues if you share data between threads. 
///
/// Usage example:
/// \code
/// class CustomRecorder : public sf::SoundRecorder
/// {
///     virtual bool onStart() // optional
///     {
///         // Initialize whatever has to be done before the capture starts
///         ...
///
///         // Return true to start playing
///         return true;
///     }
///
///     virtual bool onProcessSamples(const Int16* samples, std::size_t sampleCount)
///     {
///         // Do something with the new chunk of samples (store them, send them, ...)
///         ...
///
///         // Return true to continue playing
///         return true;
///     }
///
///     virtual void onStop() // optional
///     {
///         // Clean up whatever has to be done after the capture ends
///         ...
///     }
/// }
///
/// // Usage
/// if (CustomRecorder::isAvailable())
/// {
///     CustomRecorder recorder;
///     recorder.start();
///     ...
///     recorder.stop();
/// }
/// \endcode
///
/// \see sf::SoundBufferRecorder
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
};

    ////////////////////////////////////////////////////////////
    Thread             m_thread;      ///< Thread running the background recording task
    std::vector<Int16> m_samples;     ///< Buffer to store captured samples
    unsigned int       m_sampleRate;  ///< Sample rate
    bool               m_isCapturing; ///< Capturing state
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void cleanup();

    ////////////////////////////////////////////////////////////
    /// \brief Clean up the recorder's internal resources
    ///
    /// This function is called when the capture stops.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void processCapturedSamples();

    ////////////////////////////////////////////////////////////
    /// \brief Get the new available audio samples and process them
    ///
    /// This function is called continuously during the
    /// capture loop. It retrieves the captured samples and
    /// forwards them to the derived class.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void record();

    ////////////////////////////////////////////////////////////
    /// \brief Function called as the entry point of the thread
    ///
    /// This function starts the recording loop, and returns
    /// only when the capture is stopped.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual void onStop();

    ////////////////////////////////////////////////////////////
    /// \brief Stop capturing audio data
    ///
    /// This virtual function may be overriden by a derived class
    /// if something has to be done every time the capture
    /// ends. If not, this function can be ignored; the default
    /// implementation does nothing.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual bool onProcessSamples(const Int16* samples, std::size_t sampleCount) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Process a new chunk of recorded samples
    ///
    /// This virtual function is called every time a new chunk of
    /// recorded data is available. The derived class can then do
    /// whatever it wants with it (storing it, playing it, sending
    /// it over the network, etc.).
    ///
    /// \param samples     Pointer to the new chunk of recorded samples
    /// \param sampleCount Number of samples pointed by \a samples
    ///
    /// \return True to continue the capture, or false to stop it
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual bool onStart();

    ////////////////////////////////////////////////////////////
    /// \brief Start capturing audio data
    ///
    /// This virtual function may be overriden by a derived class
    /// if something has to be done every time a new capture
    /// starts. If not, this function can be ignored; the default
    /// implementation does nothing.
    ///
    /// \return True to start the capture, or false to abort it
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    SoundRecorder();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// This constructor is only meant to be called by derived classes.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    static bool isAvailable();

    ////////////////////////////////////////////////////////////
    /// \brief Check if the system supports audio capture
    ///
    /// This function should always be called before using
    /// the audio capture features. If it returns false, then
    /// any attempt to use sf::SoundRecorder or one of its derived
    /// classes will fail.
    ///
    /// \return True if audio capture is supported, false otherwise
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    unsigned int getSampleRate() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the sample rate
    ///
    /// The sample rate defines the number of audio samples
    /// captured per second. The higher, the better the quality
    /// (for example, 44100 samples/sec is CD quality).
    ///
    /// \return Sample rate, in samples per second
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void stop();

    ////////////////////////////////////////////////////////////
    /// \brief Stop the capture
    ///
    /// \see start
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void start(unsigned int sampleRate = 44100);

    ////////////////////////////////////////////////////////////
    /// \brief Start the capture
    ///
    /// The \a sampleRate parameter defines the number of audio samples
    /// captured per second. The higher, the better the quality
    /// (for example, 44100 samples/sec is CD quality).
    /// This function uses its own thread so that it doesn't block
    /// the rest of the program while the capture runs.
    /// Please note that only one capture can happen at the same time.
    ///
    /// \param sampleRate Desired capture rate, in number of samples per second
    ///
    /// \see stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual ~SoundRecorder();

    ////////////////////////////////////////////////////////////
    /// \brief destructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
class SFML_AUDIO_API SoundRecorder

////////////////////////////////////////////////////////////
/// \brief Abstract base class for capturing sound data
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
#include <SFML/Audio/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
#ifndef SFML_SOUNDRECORDER_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/Saahil/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp

////////////////////////////////////////////////////////////
/// \class sf::SoundRecorder
/// \ingroup audio
///
/// sf::SoundBuffer provides a simple interface to access
/// the audio recording capabilities of the computer
/// (the microphone). As an abstract base class, it only cares
/// about capturing sound samples, the task of making something
/// useful with them is left to the derived class. Note that
/// SFML provides a built-in specialization for saving the
/// captured data to a sound buffer (see sf::SoundBufferRecorder).
///
/// A derived class has only one virtual function to override:
/// \li onProcessSamples provides the new chunks of audio samples while the capture happens
///
/// Moreover, two additionnal virtual functions can be overriden
/// as well if necessary:
/// \li onStart is called before the capture happens, to perform custom initializations
/// \li onStop is called after the capture ends, to perform custom cleanup
///
/// The audio capture feature may not be supported or activated
/// on every platform, thus it is recommended to check its
/// availability with the isAvailable() function. If it returns
/// false, then any attempt to use an audio recorder will fail.
///
/// It is important to note that the audio capture happens in a
/// separate thread, so that it doesn't block the rest of the
/// program. In particular, the onProcessSamples and onStop
/// virtual functions (but not onStart) will be called
/// from this separate thread. It is important to keep this in
/// mind, because you may have to take care of synchronization
/// issues if you share data between threads. 
///
/// Usage example:
/// \code
/// class CustomRecorder : public sf::SoundRecorder
/// {
///     virtual bool onStart() // optional
///     {
///         // Initialize whatever has to be done before the capture starts
///         ...
///
///         // Return true to start playing
///         return true;
///     }
///
///     virtual bool onProcessSamples(const Int16* samples, std::size_t sampleCount)
///     {
///         // Do something with the new chunk of samples (store them, send them, ...)
///         ...
///
///         // Return true to continue playing
///         return true;
///     }
///
///     virtual void onStop() // optional
///     {
///         // Clean up whatever has to be done after the capture ends
///         ...
///     }
/// }
///
/// // Usage
/// if (CustomRecorder::isAvailable())
/// {
///     CustomRecorder recorder;
///     recorder.start();
///     ...
///     recorder.stop();
/// }
/// \endcode
///
/// \see sf::SoundBufferRecorder
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
};

    ////////////////////////////////////////////////////////////
    Thread             m_thread;      ///< Thread running the background recording task
    std::vector<Int16> m_samples;     ///< Buffer to store captured samples
    unsigned int       m_sampleRate;  ///< Sample rate
    bool               m_isCapturing; ///< Capturing state
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void cleanup();

    ////////////////////////////////////////////////////////////
    /// \brief Clean up the recorder's internal resources
    ///
    /// This function is called when the capture stops.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void processCapturedSamples();

    ////////////////////////////////////////////////////////////
    /// \brief Get the new available audio samples and process them
    ///
    /// This function is called continuously during the
    /// capture loop. It retrieves the captured samples and
    /// forwards them to the derived class.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void record();

    ////////////////////////////////////////////////////////////
    /// \brief Function called as the entry point of the thread
    ///
    /// This function starts the recording loop, and returns
    /// only when the capture is stopped.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual void onStop();

    ////////////////////////////////////////////////////////////
    /// \brief Stop capturing audio data
    ///
    /// This virtual function may be overriden by a derived class
    /// if something has to be done every time the capture
    /// ends. If not, this function can be ignored; the default
    /// implementation does nothing.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual bool onProcessSamples(const Int16* samples, std::size_t sampleCount) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Process a new chunk of recorded samples
    ///
    /// This virtual function is called every time a new chunk of
    /// recorded data is available. The derived class can then do
    /// whatever it wants with it (storing it, playing it, sending
    /// it over the network, etc.).
    ///
    /// \param samples     Pointer to the new chunk of recorded samples
    /// \param sampleCount Number of samples pointed by \a samples
    ///
    /// \return True to continue the capture, or false to stop it
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual bool onStart();

    ////////////////////////////////////////////////////////////
    /// \brief Start capturing audio data
    ///
    /// This virtual function may be overriden by a derived class
    /// if something has to be done every time a new capture
    /// starts. If not, this function can be ignored; the default
    /// implementation does nothing.
    ///
    /// \return True to start the capture, or false to abort it
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    SoundRecorder();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// This constructor is only meant to be called by derived classes.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    static bool isAvailable();

    ////////////////////////////////////////////////////////////
    /// \brief Check if the system supports audio capture
    ///
    /// This function should always be called before using
    /// the audio capture features. If it returns false, then
    /// any attempt to use sf::SoundRecorder or one of its derived
    /// classes will fail.
    ///
    /// \return True if audio capture is supported, false otherwise
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    unsigned int getSampleRate() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the sample rate
    ///
    /// The sample rate defines the number of audio samples
    /// captured per second. The higher, the better the quality
    /// (for example, 44100 samples/sec is CD quality).
    ///
    /// \return Sample rate, in samples per second
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void stop();

    ////////////////////////////////////////////////////////////
    /// \brief Stop the capture
    ///
    /// \see start
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void start(unsigned int sampleRate = 44100);

    ////////////////////////////////////////////////////////////
    /// \brief Start the capture
    ///
    /// The \a sampleRate parameter defines the number of audio samples
    /// captured per second. The higher, the better the quality
    /// (for example, 44100 samples/sec is CD quality).
    /// This function uses its own thread so that it doesn't block
    /// the rest of the program while the capture runs.
    /// Please note that only one capture can happen at the same time.
    ///
    /// \param sampleRate Desired capture rate, in number of samples per second
    ///
    /// \see stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual ~SoundRecorder();

    ////////////////////////////////////////////////////////////
    /// \brief destructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
class SFML_AUDIO_API SoundRecorder

////////////////////////////////////////////////////////////
/// \brief Abstract base class for capturing sound data
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
#include <SFML/Audio/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
#ifndef SFML_SOUNDRECORDER_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp

////////////////////////////////////////////////////////////
/// \class sf::SoundRecorder
/// \ingroup audio
///
/// sf::SoundBuffer provides a simple interface to access
/// the audio recording capabilities of the computer
/// (the microphone). As an abstract base class, it only cares
/// about capturing sound samples, the task of making something
/// useful with them is left to the derived class. Note that
/// SFML provides a built-in specialization for saving the
/// captured data to a sound buffer (see sf::SoundBufferRecorder).
///
/// A derived class has only one virtual function to override:
/// \li onProcessSamples provides the new chunks of audio samples while the capture happens
///
/// Moreover, two additionnal virtual functions can be overriden
/// as well if necessary:
/// \li onStart is called before the capture happens, to perform custom initializations
/// \li onStop is called after the capture ends, to perform custom cleanup
///
/// The audio capture feature may not be supported or activated
/// on every platform, thus it is recommended to check its
/// availability with the isAvailable() function. If it returns
/// false, then any attempt to use an audio recorder will fail.
///
/// It is important to note that the audio capture happens in a
/// separate thread, so that it doesn't block the rest of the
/// program. In particular, the onProcessSamples and onStop
/// virtual functions (but not onStart) will be called
/// from this separate thread. It is important to keep this in
/// mind, because you may have to take care of synchronization
/// issues if you share data between threads. 
///
/// Usage example:
/// \code
/// class CustomRecorder : public sf::SoundRecorder
/// {
///     virtual bool onStart() // optional
///     {
///         // Initialize whatever has to be done before the capture starts
///         ...
///
///         // Return true to start playing
///         return true;
///     }
///
///     virtual bool onProcessSamples(const Int16* samples, std::size_t sampleCount)
///     {
///         // Do something with the new chunk of samples (store them, send them, ...)
///         ...
///
///         // Return true to continue playing
///         return true;
///     }
///
///     virtual void onStop() // optional
///     {
///         // Clean up whatever has to be done after the capture ends
///         ...
///     }
/// }
///
/// // Usage
/// if (CustomRecorder::isAvailable())
/// {
///     CustomRecorder recorder;
///     recorder.start();
///     ...
///     recorder.stop();
/// }
/// \endcode
///
/// \see sf::SoundBufferRecorder
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
};

    ////////////////////////////////////////////////////////////
    Thread             m_thread;      ///< Thread running the background recording task
    std::vector<Int16> m_samples;     ///< Buffer to store captured samples
    unsigned int       m_sampleRate;  ///< Sample rate
    bool               m_isCapturing; ///< Capturing state
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void cleanup();

    ////////////////////////////////////////////////////////////
    /// \brief Clean up the recorder's internal resources
    ///
    /// This function is called when the capture stops.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void processCapturedSamples();

    ////////////////////////////////////////////////////////////
    /// \brief Get the new available audio samples and process them
    ///
    /// This function is called continuously during the
    /// capture loop. It retrieves the captured samples and
    /// forwards them to the derived class.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void record();

    ////////////////////////////////////////////////////////////
    /// \brief Function called as the entry point of the thread
    ///
    /// This function starts the recording loop, and returns
    /// only when the capture is stopped.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual void onStop();

    ////////////////////////////////////////////////////////////
    /// \brief Stop capturing audio data
    ///
    /// This virtual function may be overriden by a derived class
    /// if something has to be done every time the capture
    /// ends. If not, this function can be ignored; the default
    /// implementation does nothing.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual bool onProcessSamples(const Int16* samples, std::size_t sampleCount) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Process a new chunk of recorded samples
    ///
    /// This virtual function is called every time a new chunk of
    /// recorded data is available. The derived class can then do
    /// whatever it wants with it (storing it, playing it, sending
    /// it over the network, etc.).
    ///
    /// \param samples     Pointer to the new chunk of recorded samples
    /// \param sampleCount Number of samples pointed by \a samples
    ///
    /// \return True to continue the capture, or false to stop it
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual bool onStart();

    ////////////////////////////////////////////////////////////
    /// \brief Start capturing audio data
    ///
    /// This virtual function may be overriden by a derived class
    /// if something has to be done every time a new capture
    /// starts. If not, this function can be ignored; the default
    /// implementation does nothing.
    ///
    /// \return True to start the capture, or false to abort it
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    SoundRecorder();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// This constructor is only meant to be called by derived classes.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    static bool isAvailable();

    ////////////////////////////////////////////////////////////
    /// \brief Check if the system supports audio capture
    ///
    /// This function should always be called before using
    /// the audio capture features. If it returns false, then
    /// any attempt to use sf::SoundRecorder or one of its derived
    /// classes will fail.
    ///
    /// \return True if audio capture is supported, false otherwise
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    unsigned int getSampleRate() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the sample rate
    ///
    /// The sample rate defines the number of audio samples
    /// captured per second. The higher, the better the quality
    /// (for example, 44100 samples/sec is CD quality).
    ///
    /// \return Sample rate, in samples per second
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void stop();

    ////////////////////////////////////////////////////////////
    /// \brief Stop the capture
    ///
    /// \see start
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void start(unsigned int sampleRate = 44100);

    ////////////////////////////////////////////////////////////
    /// \brief Start the capture
    ///
    /// The \a sampleRate parameter defines the number of audio samples
    /// captured per second. The higher, the better the quality
    /// (for example, 44100 samples/sec is CD quality).
    /// This function uses its own thread so that it doesn't block
    /// the rest of the program while the capture runs.
    /// Please note that only one capture can happen at the same time.
    ///
    /// \param sampleRate Desired capture rate, in number of samples per second
    ///
    /// \see stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual ~SoundRecorder();

    ////////////////////////////////////////////////////////////
    /// \brief destructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
class SFML_AUDIO_API SoundRecorder

////////////////////////////////////////////////////////////
/// \brief Abstract base class for capturing sound data
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
#include <SFML/Audio/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
#ifndef SFML_SOUNDRECORDER_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp

////////////////////////////////////////////////////////////
/// \class sf::SoundRecorder
/// \ingroup audio
///
/// sf::SoundBuffer provides a simple interface to access
/// the audio recording capabilities of the computer
/// (the microphone). As an abstract base class, it only cares
/// about capturing sound samples, the task of making something
/// useful with them is left to the derived class. Note that
/// SFML provides a built-in specialization for saving the
/// captured data to a sound buffer (see sf::SoundBufferRecorder).
///
/// A derived class has only one virtual function to override:
/// \li onProcessSamples provides the new chunks of audio samples while the capture happens
///
/// Moreover, two additionnal virtual functions can be overriden
/// as well if necessary:
/// \li onStart is called before the capture happens, to perform custom initializations
/// \li onStop is called after the capture ends, to perform custom cleanup
///
/// The audio capture feature may not be supported or activated
/// on every platform, thus it is recommended to check its
/// availability with the isAvailable() function. If it returns
/// false, then any attempt to use an audio recorder will fail.
///
/// It is important to note that the audio capture happens in a
/// separate thread, so that it doesn't block the rest of the
/// program. In particular, the onProcessSamples and onStop
/// virtual functions (but not onStart) will be called
/// from this separate thread. It is important to keep this in
/// mind, because you may have to take care of synchronization
/// issues if you share data between threads. 
///
/// Usage example:
/// \code
/// class CustomRecorder : public sf::SoundRecorder
/// {
///     virtual bool onStart() // optional
///     {
///         // Initialize whatever has to be done before the capture starts
///         ...
///
///         // Return true to start playing
///         return true;
///     }
///
///     virtual bool onProcessSamples(const Int16* samples, std::size_t sampleCount)
///     {
///         // Do something with the new chunk of samples (store them, send them, ...)
///         ...
///
///         // Return true to continue playing
///         return true;
///     }
///
///     virtual void onStop() // optional
///     {
///         // Clean up whatever has to be done after the capture ends
///         ...
///     }
/// }
///
/// // Usage
/// if (CustomRecorder::isAvailable())
/// {
///     CustomRecorder recorder;
///     recorder.start();
///     ...
///     recorder.stop();
/// }
/// \endcode
///
/// \see sf::SoundBufferRecorder
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
};

    ////////////////////////////////////////////////////////////
    Thread             m_thread;      ///< Thread running the background recording task
    std::vector<Int16> m_samples;     ///< Buffer to store captured samples
    unsigned int       m_sampleRate;  ///< Sample rate
    bool               m_isCapturing; ///< Capturing state
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void cleanup();

    ////////////////////////////////////////////////////////////
    /// \brief Clean up the recorder's internal resources
    ///
    /// This function is called when the capture stops.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void processCapturedSamples();

    ////////////////////////////////////////////////////////////
    /// \brief Get the new available audio samples and process them
    ///
    /// This function is called continuously during the
    /// capture loop. It retrieves the captured samples and
    /// forwards them to the derived class.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void record();

    ////////////////////////////////////////////////////////////
    /// \brief Function called as the entry point of the thread
    ///
    /// This function starts the recording loop, and returns
    /// only when the capture is stopped.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual void onStop();

    ////////////////////////////////////////////////////////////
    /// \brief Stop capturing audio data
    ///
    /// This virtual function may be overriden by a derived class
    /// if something has to be done every time the capture
    /// ends. If not, this function can be ignored; the default
    /// implementation does nothing.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual bool onProcessSamples(const Int16* samples, std::size_t sampleCount) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Process a new chunk of recorded samples
    ///
    /// This virtual function is called every time a new chunk of
    /// recorded data is available. The derived class can then do
    /// whatever it wants with it (storing it, playing it, sending
    /// it over the network, etc.).
    ///
    /// \param samples     Pointer to the new chunk of recorded samples
    /// \param sampleCount Number of samples pointed by \a samples
    ///
    /// \return True to continue the capture, or false to stop it
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual bool onStart();

    ////////////////////////////////////////////////////////////
    /// \brief Start capturing audio data
    ///
    /// This virtual function may be overriden by a derived class
    /// if something has to be done every time a new capture
    /// starts. If not, this function can be ignored; the default
    /// implementation does nothing.
    ///
    /// \return True to start the capture, or false to abort it
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    SoundRecorder();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// This constructor is only meant to be called by derived classes.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    static bool isAvailable();

    ////////////////////////////////////////////////////////////
    /// \brief Check if the system supports audio capture
    ///
    /// This function should always be called before using
    /// the audio capture features. If it returns false, then
    /// any attempt to use sf::SoundRecorder or one of its derived
    /// classes will fail.
    ///
    /// \return True if audio capture is supported, false otherwise
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    unsigned int getSampleRate() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the sample rate
    ///
    /// The sample rate defines the number of audio samples
    /// captured per second. The higher, the better the quality
    /// (for example, 44100 samples/sec is CD quality).
    ///
    /// \return Sample rate, in samples per second
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void stop();

    ////////////////////////////////////////////////////////////
    /// \brief Stop the capture
    ///
    /// \see start
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void start(unsigned int sampleRate = 44100);

    ////////////////////////////////////////////////////////////
    /// \brief Start the capture
    ///
    /// The \a sampleRate parameter defines the number of audio samples
    /// captured per second. The higher, the better the quality
    /// (for example, 44100 samples/sec is CD quality).
    /// This function uses its own thread so that it doesn't block
    /// the rest of the program while the capture runs.
    /// Please note that only one capture can happen at the same time.
    ///
    /// \param sampleRate Desired capture rate, in number of samples per second
    ///
    /// \see stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual ~SoundRecorder();

    ////////////////////////////////////////////////////////////
    /// \brief destructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
class SFML_AUDIO_API SoundRecorder

////////////////////////////////////////////////////////////
/// \brief Abstract base class for capturing sound data
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
#include <SFML/Audio/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
#ifndef SFML_SOUNDRECORDER_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp

////////////////////////////////////////////////////////////
/// \class sf::SoundRecorder
/// \ingroup audio
///
/// sf::SoundBuffer provides a simple interface to access
/// the audio recording capabilities of the computer
/// (the microphone). As an abstract base class, it only cares
/// about capturing sound samples, the task of making something
/// useful with them is left to the derived class. Note that
/// SFML provides a built-in specialization for saving the
/// captured data to a sound buffer (see sf::SoundBufferRecorder).
///
/// A derived class has only one virtual function to override:
/// \li onProcessSamples provides the new chunks of audio samples while the capture happens
///
/// Moreover, two additionnal virtual functions can be overriden
/// as well if necessary:
/// \li onStart is called before the capture happens, to perform custom initializations
/// \li onStop is called after the capture ends, to perform custom cleanup
///
/// The audio capture feature may not be supported or activated
/// on every platform, thus it is recommended to check its
/// availability with the isAvailable() function. If it returns
/// false, then any attempt to use an audio recorder will fail.
///
/// It is important to note that the audio capture happens in a
/// separate thread, so that it doesn't block the rest of the
/// program. In particular, the onProcessSamples and onStop
/// virtual functions (but not onStart) will be called
/// from this separate thread. It is important to keep this in
/// mind, because you may have to take care of synchronization
/// issues if you share data between threads. 
///
/// Usage example:
/// \code
/// class CustomRecorder : public sf::SoundRecorder
/// {
///     virtual bool onStart() // optional
///     {
///         // Initialize whatever has to be done before the capture starts
///         ...
///
///         // Return true to start playing
///         return true;
///     }
///
///     virtual bool onProcessSamples(const Int16* samples, std::size_t sampleCount)
///     {
///         // Do something with the new chunk of samples (store them, send them, ...)
///         ...
///
///         // Return true to continue playing
///         return true;
///     }
///
///     virtual void onStop() // optional
///     {
///         // Clean up whatever has to be done after the capture ends
///         ...
///     }
/// }
///
/// // Usage
/// if (CustomRecorder::isAvailable())
/// {
///     CustomRecorder recorder;
///     recorder.start();
///     ...
///     recorder.stop();
/// }
/// \endcode
///
/// \see sf::SoundBufferRecorder
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
};

    ////////////////////////////////////////////////////////////
    Thread             m_thread;      ///< Thread running the background recording task
    std::vector<Int16> m_samples;     ///< Buffer to store captured samples
    unsigned int       m_sampleRate;  ///< Sample rate
    bool               m_isCapturing; ///< Capturing state
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void cleanup();

    ////////////////////////////////////////////////////////////
    /// \brief Clean up the recorder's internal resources
    ///
    /// This function is called when the capture stops.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void processCapturedSamples();

    ////////////////////////////////////////////////////////////
    /// \brief Get the new available audio samples and process them
    ///
    /// This function is called continuously during the
    /// capture loop. It retrieves the captured samples and
    /// forwards them to the derived class.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void record();

    ////////////////////////////////////////////////////////////
    /// \brief Function called as the entry point of the thread
    ///
    /// This function starts the recording loop, and returns
    /// only when the capture is stopped.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual void onStop();

    ////////////////////////////////////////////////////////////
    /// \brief Stop capturing audio data
    ///
    /// This virtual function may be overriden by a derived class
    /// if something has to be done every time the capture
    /// ends. If not, this function can be ignored; the default
    /// implementation does nothing.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual bool onProcessSamples(const Int16* samples, std::size_t sampleCount) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Process a new chunk of recorded samples
    ///
    /// This virtual function is called every time a new chunk of
    /// recorded data is available. The derived class can then do
    /// whatever it wants with it (storing it, playing it, sending
    /// it over the network, etc.).
    ///
    /// \param samples     Pointer to the new chunk of recorded samples
    /// \param sampleCount Number of samples pointed by \a samples
    ///
    /// \return True to continue the capture, or false to stop it
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual bool onStart();

    ////////////////////////////////////////////////////////////
    /// \brief Start capturing audio data
    ///
    /// This virtual function may be overriden by a derived class
    /// if something has to be done every time a new capture
    /// starts. If not, this function can be ignored; the default
    /// implementation does nothing.
    ///
    /// \return True to start the capture, or false to abort it
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    SoundRecorder();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// This constructor is only meant to be called by derived classes.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    static bool isAvailable();

    ////////////////////////////////////////////////////////////
    /// \brief Check if the system supports audio capture
    ///
    /// This function should always be called before using
    /// the audio capture features. If it returns false, then
    /// any attempt to use sf::SoundRecorder or one of its derived
    /// classes will fail.
    ///
    /// \return True if audio capture is supported, false otherwise
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    unsigned int getSampleRate() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the sample rate
    ///
    /// The sample rate defines the number of audio samples
    /// captured per second. The higher, the better the quality
    /// (for example, 44100 samples/sec is CD quality).
    ///
    /// \return Sample rate, in samples per second
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void stop();

    ////////////////////////////////////////////////////////////
    /// \brief Stop the capture
    ///
    /// \see start
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void start(unsigned int sampleRate = 44100);

    ////////////////////////////////////////////////////////////
    /// \brief Start the capture
    ///
    /// The \a sampleRate parameter defines the number of audio samples
    /// captured per second. The higher, the better the quality
    /// (for example, 44100 samples/sec is CD quality).
    /// This function uses its own thread so that it doesn't block
    /// the rest of the program while the capture runs.
    /// Please note that only one capture can happen at the same time.
    ///
    /// \param sampleRate Desired capture rate, in number of samples per second
    ///
    /// \see stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual ~SoundRecorder();

    ////////////////////////////////////////////////////////////
    /// \brief destructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
class SFML_AUDIO_API SoundRecorder

////////////////////////////////////////////////////////////
/// \brief Abstract base class for capturing sound data
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
#include <SFML/Audio/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
#ifndef SFML_SOUNDRECORDER_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp

////////////////////////////////////////////////////////////
/// \class sf::SoundRecorder
/// \ingroup audio
///
/// sf::SoundBuffer provides a simple interface to access
/// the audio recording capabilities of the computer
/// (the microphone). As an abstract base class, it only cares
/// about capturing sound samples, the task of making something
/// useful with them is left to the derived class. Note that
/// SFML provides a built-in specialization for saving the
/// captured data to a sound buffer (see sf::SoundBufferRecorder).
///
/// A derived class has only one virtual function to override:
/// \li onProcessSamples provides the new chunks of audio samples while the capture happens
///
/// Moreover, two additionnal virtual functions can be overriden
/// as well if necessary:
/// \li onStart is called before the capture happens, to perform custom initializations
/// \li onStop is called after the capture ends, to perform custom cleanup
///
/// The audio capture feature may not be supported or activated
/// on every platform, thus it is recommended to check its
/// availability with the isAvailable() function. If it returns
/// false, then any attempt to use an audio recorder will fail.
///
/// It is important to note that the audio capture happens in a
/// separate thread, so that it doesn't block the rest of the
/// program. In particular, the onProcessSamples and onStop
/// virtual functions (but not onStart) will be called
/// from this separate thread. It is important to keep this in
/// mind, because you may have to take care of synchronization
/// issues if you share data between threads. 
///
/// Usage example:
/// \code
/// class CustomRecorder : public sf::SoundRecorder
/// {
///     virtual bool onStart() // optional
///     {
///         // Initialize whatever has to be done before the capture starts
///         ...
///
///         // Return true to start playing
///         return true;
///     }
///
///     virtual bool onProcessSamples(const Int16* samples, std::size_t sampleCount)
///     {
///         // Do something with the new chunk of samples (store them, send them, ...)
///         ...
///
///         // Return true to continue playing
///         return true;
///     }
///
///     virtual void onStop() // optional
///     {
///         // Clean up whatever has to be done after the capture ends
///         ...
///     }
/// }
///
/// // Usage
/// if (CustomRecorder::isAvailable())
/// {
///     CustomRecorder recorder;
///     recorder.start();
///     ...
///     recorder.stop();
/// }
/// \endcode
///
/// \see sf::SoundBufferRecorder
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
};

    ////////////////////////////////////////////////////////////
    Thread             m_thread;      ///< Thread running the background recording task
    std::vector<Int16> m_samples;     ///< Buffer to store captured samples
    unsigned int       m_sampleRate;  ///< Sample rate
    bool               m_isCapturing; ///< Capturing state
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void cleanup();

    ////////////////////////////////////////////////////////////
    /// \brief Clean up the recorder's internal resources
    ///
    /// This function is called when the capture stops.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void processCapturedSamples();

    ////////////////////////////////////////////////////////////
    /// \brief Get the new available audio samples and process them
    ///
    /// This function is called continuously during the
    /// capture loop. It retrieves the captured samples and
    /// forwards them to the derived class.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void record();

    ////////////////////////////////////////////////////////////
    /// \brief Function called as the entry point of the thread
    ///
    /// This function starts the recording loop, and returns
    /// only when the capture is stopped.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual void onStop();

    ////////////////////////////////////////////////////////////
    /// \brief Stop capturing audio data
    ///
    /// This virtual function may be overriden by a derived class
    /// if something has to be done every time the capture
    /// ends. If not, this function can be ignored; the default
    /// implementation does nothing.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual bool onProcessSamples(const Int16* samples, std::size_t sampleCount) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Process a new chunk of recorded samples
    ///
    /// This virtual function is called every time a new chunk of
    /// recorded data is available. The derived class can then do
    /// whatever it wants with it (storing it, playing it, sending
    /// it over the network, etc.).
    ///
    /// \param samples     Pointer to the new chunk of recorded samples
    /// \param sampleCount Number of samples pointed by \a samples
    ///
    /// \return True to continue the capture, or false to stop it
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual bool onStart();

    ////////////////////////////////////////////////////////////
    /// \brief Start capturing audio data
    ///
    /// This virtual function may be overriden by a derived class
    /// if something has to be done every time a new capture
    /// starts. If not, this function can be ignored; the default
    /// implementation does nothing.
    ///
    /// \return True to start the capture, or false to abort it
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    SoundRecorder();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// This constructor is only meant to be called by derived classes.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    static bool isAvailable();

    ////////////////////////////////////////////////////////////
    /// \brief Check if the system supports audio capture
    ///
    /// This function should always be called before using
    /// the audio capture features. If it returns false, then
    /// any attempt to use sf::SoundRecorder or one of its derived
    /// classes will fail.
    ///
    /// \return True if audio capture is supported, false otherwise
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    unsigned int getSampleRate() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the sample rate
    ///
    /// The sample rate defines the number of audio samples
    /// captured per second. The higher, the better the quality
    /// (for example, 44100 samples/sec is CD quality).
    ///
    /// \return Sample rate, in samples per second
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void stop();

    ////////////////////////////////////////////////////////////
    /// \brief Stop the capture
    ///
    /// \see start
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void start(unsigned int sampleRate = 44100);

    ////////////////////////////////////////////////////////////
    /// \brief Start the capture
    ///
    /// The \a sampleRate parameter defines the number of audio samples
    /// captured per second. The higher, the better the quality
    /// (for example, 44100 samples/sec is CD quality).
    /// This function uses its own thread so that it doesn't block
    /// the rest of the program while the capture runs.
    /// Please note that only one capture can happen at the same time.
    ///
    /// \param sampleRate Desired capture rate, in number of samples per second
    ///
    /// \see stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual ~SoundRecorder();

    ////////////////////////////////////////////////////////////
    /// \brief destructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
class SFML_AUDIO_API SoundRecorder

////////////////////////////////////////////////////////////
/// \brief Abstract base class for capturing sound data
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
#include <SFML/Audio/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
#ifndef SFML_SOUNDRECORDER_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp

////////////////////////////////////////////////////////////
/// \class sf::SoundRecorder
/// \ingroup audio
///
/// sf::SoundBuffer provides a simple interface to access
/// the audio recording capabilities of the computer
/// (the microphone). As an abstract base class, it only cares
/// about capturing sound samples, the task of making something
/// useful with them is left to the derived class. Note that
/// SFML provides a built-in specialization for saving the
/// captured data to a sound buffer (see sf::SoundBufferRecorder).
///
/// A derived class has only one virtual function to override:
/// \li onProcessSamples provides the new chunks of audio samples while the capture happens
///
/// Moreover, two additionnal virtual functions can be overriden
/// as well if necessary:
/// \li onStart is called before the capture happens, to perform custom initializations
/// \li onStop is called after the capture ends, to perform custom cleanup
///
/// The audio capture feature may not be supported or activated
/// on every platform, thus it is recommended to check its
/// availability with the isAvailable() function. If it returns
/// false, then any attempt to use an audio recorder will fail.
///
/// It is important to note that the audio capture happens in a
/// separate thread, so that it doesn't block the rest of the
/// program. In particular, the onProcessSamples and onStop
/// virtual functions (but not onStart) will be called
/// from this separate thread. It is important to keep this in
/// mind, because you may have to take care of synchronization
/// issues if you share data between threads. 
///
/// Usage example:
/// \code
/// class CustomRecorder : public sf::SoundRecorder
/// {
///     virtual bool onStart() // optional
///     {
///         // Initialize whatever has to be done before the capture starts
///         ...
///
///         // Return true to start playing
///         return true;
///     }
///
///     virtual bool onProcessSamples(const Int16* samples, std::size_t sampleCount)
///     {
///         // Do something with the new chunk of samples (store them, send them, ...)
///         ...
///
///         // Return true to continue playing
///         return true;
///     }
///
///     virtual void onStop() // optional
///     {
///         // Clean up whatever has to be done after the capture ends
///         ...
///     }
/// }
///
/// // Usage
/// if (CustomRecorder::isAvailable())
/// {
///     CustomRecorder recorder;
///     recorder.start();
///     ...
///     recorder.stop();
/// }
/// \endcode
///
/// \see sf::SoundBufferRecorder
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
};

    ////////////////////////////////////////////////////////////
    Thread             m_thread;      ///< Thread running the background recording task
    std::vector<Int16> m_samples;     ///< Buffer to store captured samples
    unsigned int       m_sampleRate;  ///< Sample rate
    bool               m_isCapturing; ///< Capturing state
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void cleanup();

    ////////////////////////////////////////////////////////////
    /// \brief Clean up the recorder's internal resources
    ///
    /// This function is called when the capture stops.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void processCapturedSamples();

    ////////////////////////////////////////////////////////////
    /// \brief Get the new available audio samples and process them
    ///
    /// This function is called continuously during the
    /// capture loop. It retrieves the captured samples and
    /// forwards them to the derived class.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void record();

    ////////////////////////////////////////////////////////////
    /// \brief Function called as the entry point of the thread
    ///
    /// This function starts the recording loop, and returns
    /// only when the capture is stopped.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual void onStop();

    ////////////////////////////////////////////////////////////
    /// \brief Stop capturing audio data
    ///
    /// This virtual function may be overriden by a derived class
    /// if something has to be done every time the capture
    /// ends. If not, this function can be ignored; the default
    /// implementation does nothing.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual bool onProcessSamples(const Int16* samples, std::size_t sampleCount) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Process a new chunk of recorded samples
    ///
    /// This virtual function is called every time a new chunk of
    /// recorded data is available. The derived class can then do
    /// whatever it wants with it (storing it, playing it, sending
    /// it over the network, etc.).
    ///
    /// \param samples     Pointer to the new chunk of recorded samples
    /// \param sampleCount Number of samples pointed by \a samples
    ///
    /// \return True to continue the capture, or false to stop it
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual bool onStart();

    ////////////////////////////////////////////////////////////
    /// \brief Start capturing audio data
    ///
    /// This virtual function may be overriden by a derived class
    /// if something has to be done every time a new capture
    /// starts. If not, this function can be ignored; the default
    /// implementation does nothing.
    ///
    /// \return True to start the capture, or false to abort it
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    SoundRecorder();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// This constructor is only meant to be called by derived classes.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    static bool isAvailable();

    ////////////////////////////////////////////////////////////
    /// \brief Check if the system supports audio capture
    ///
    /// This function should always be called before using
    /// the audio capture features. If it returns false, then
    /// any attempt to use sf::SoundRecorder or one of its derived
    /// classes will fail.
    ///
    /// \return True if audio capture is supported, false otherwise
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    unsigned int getSampleRate() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the sample rate
    ///
    /// The sample rate defines the number of audio samples
    /// captured per second. The higher, the better the quality
    /// (for example, 44100 samples/sec is CD quality).
    ///
    /// \return Sample rate, in samples per second
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void stop();

    ////////////////////////////////////////////////////////////
    /// \brief Stop the capture
    ///
    /// \see start
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void start(unsigned int sampleRate = 44100);

    ////////////////////////////////////////////////////////////
    /// \brief Start the capture
    ///
    /// The \a sampleRate parameter defines the number of audio samples
    /// captured per second. The higher, the better the quality
    /// (for example, 44100 samples/sec is CD quality).
    /// This function uses its own thread so that it doesn't block
    /// the rest of the program while the capture runs.
    /// Please note that only one capture can happen at the same time.
    ///
    /// \param sampleRate Desired capture rate, in number of samples per second
    ///
    /// \see stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual ~SoundRecorder();

    ////////////////////////////////////////////////////////////
    /// \brief destructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
class SFML_AUDIO_API SoundRecorder

////////////////////////////////////////////////////////////
/// \brief Abstract base class for capturing sound data
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
#include <SFML/Audio/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
#ifndef SFML_SOUNDRECORDER_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
//

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp

////////////////////////////////////////////////////////////
/// \class sf::SoundRecorder
/// \ingroup audio
///
/// sf::SoundBuffer provides a simple interface to access
/// the audio recording capabilities of the computer
/// (the microphone). As an abstract base class, it only cares
/// about capturing sound samples, the task of making something
/// useful with them is left to the derived class. Note that
/// SFML provides a built-in specialization for saving the
/// captured data to a sound buffer (see sf::SoundBufferRecorder).
///
/// A derived class has only one virtual function to override:
/// \li onProcessSamples provides the new chunks of audio samples while the capture happens
///
/// Moreover, two additionnal virtual functions can be overriden
/// as well if necessary:
/// \li onStart is called before the capture happens, to perform custom initializations
/// \li onStop is called after the capture ends, to perform custom cleanup
///
/// The audio capture feature may not be supported or activated
/// on every platform, thus it is recommended to check its
/// availability with the isAvailable() function. If it returns
/// false, then any attempt to use an audio recorder will fail.
///
/// It is important to note that the audio capture happens in a
/// separate thread, so that it doesn't block the rest of the
/// program. In particular, the onProcessSamples and onStop
/// virtual functions (but not onStart) will be called
/// from this separate thread. It is important to keep this in
/// mind, because you may have to take care of synchronization
/// issues if you share data between threads. 
///
/// Usage example:
/// \code
/// class CustomRecorder : public sf::SoundRecorder
/// {
///     virtual bool onStart() // optional
///     {
///         // Initialize whatever has to be done before the capture starts
///         ...
///
///         // Return true to start playing
///         return true;
///     }
///
///     virtual bool onProcessSamples(const Int16* samples, std::size_t sampleCount)
///     {
///         // Do something with the new chunk of samples (store them, send them, ...)
///         ...
///
///         // Return true to continue playing
///         return true;
///     }
///
///     virtual void onStop() // optional
///     {
///         // Clean up whatever has to be done after the capture ends
///         ...
///     }
/// }
///
/// // Usage
/// if (CustomRecorder::isAvailable())
/// {
///     CustomRecorder recorder;
///     recorder.start();
///     ...
///     recorder.stop();
/// }
/// \endcode
///
/// \see sf::SoundBufferRecorder
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
};

    ////////////////////////////////////////////////////////////
    Thread             m_thread;      ///< Thread running the background recording task
    std::vector<Int16> m_samples;     ///< Buffer to store captured samples
    unsigned int       m_sampleRate;  ///< Sample rate
    bool               m_isCapturing; ///< Capturing state
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    // Member data

    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void cleanup();

    ////////////////////////////////////////////////////////////
    /// \brief Clean up the recorder's internal resources
    ///
    /// This function is called when the capture stops.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void processCapturedSamples();

    ////////////////////////////////////////////////////////////
    /// \brief Get the new available audio samples and process them
    ///
    /// This function is called continuously during the
    /// capture loop. It retrieves the captured samples and
    /// forwards them to the derived class.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void record();

    ////////////////////////////////////////////////////////////
    /// \brief Function called as the entry point of the thread
    ///
    /// This function starts the recording loop, and returns
    /// only when the capture is stopped.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual void onStop();

    ////////////////////////////////////////////////////////////
    /// \brief Stop capturing audio data
    ///
    /// This virtual function may be overriden by a derived class
    /// if something has to be done every time the capture
    /// ends. If not, this function can be ignored; the default
    /// implementation does nothing.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual bool onProcessSamples(const Int16* samples, std::size_t sampleCount) = 0;

    ////////////////////////////////////////////////////////////
    /// \brief Process a new chunk of recorded samples
    ///
    /// This virtual function is called every time a new chunk of
    /// recorded data is available. The derived class can then do
    /// whatever it wants with it (storing it, playing it, sending
    /// it over the network, etc.).
    ///
    /// \param samples     Pointer to the new chunk of recorded samples
    /// \param sampleCount Number of samples pointed by \a samples
    ///
    /// \return True to continue the capture, or false to stop it
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual bool onStart();

    ////////////////////////////////////////////////////////////
    /// \brief Start capturing audio data
    ///
    /// This virtual function may be overriden by a derived class
    /// if something has to be done every time a new capture
    /// starts. If not, this function can be ignored; the default
    /// implementation does nothing.
    ///
    /// \return True to start the capture, or false to abort it
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    SoundRecorder();

    ////////////////////////////////////////////////////////////
    /// \brief Default constructor
    ///
    /// This constructor is only meant to be called by derived classes.
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    static bool isAvailable();

    ////////////////////////////////////////////////////////////
    /// \brief Check if the system supports audio capture
    ///
    /// This function should always be called before using
    /// the audio capture features. If it returns false, then
    /// any attempt to use sf::SoundRecorder or one of its derived
    /// classes will fail.
    ///
    /// \return True if audio capture is supported, false otherwise
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    unsigned int getSampleRate() const;

    ////////////////////////////////////////////////////////////
    /// \brief Get the sample rate
    ///
    /// The sample rate defines the number of audio samples
    /// captured per second. The higher, the better the quality
    /// (for example, 44100 samples/sec is CD quality).
    ///
    /// \return Sample rate, in samples per second
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void stop();

    ////////////////////////////////////////////////////////////
    /// \brief Stop the capture
    ///
    /// \see start
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    void start(unsigned int sampleRate = 44100);

    ////////////////////////////////////////////////////////////
    /// \brief Start the capture
    ///
    /// The \a sampleRate parameter defines the number of audio samples
    /// captured per second. The higher, the better the quality
    /// (for example, 44100 samples/sec is CD quality).
    /// This function uses its own thread so that it doesn't block
    /// the rest of the program while the capture runs.
    /// Please note that only one capture can happen at the same time.
    ///
    /// \param sampleRate Desired capture rate, in number of samples per second
    ///
    /// \see stop
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
    virtual ~SoundRecorder();

    ////////////////////////////////////////////////////////////
    /// \brief destructor
    ///
    ////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
class SFML_AUDIO_API SoundRecorder

////////////////////////////////////////////////////////////
/// \brief Abstract base class for capturing sound data
///
////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
#include <SFML/Audio/Export.hpp>

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
// Headers

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
#ifndef SFML_SOUNDRECORDER_HPP

////////////////////////////////////////////////////////////
_func_
sfml
c:/Users/saahil claypool/OneDrive/Code/EmacsPackage/SFML//Audio/SoundRecorder.hpp
//

////////////////////////////////////////////////////////////
