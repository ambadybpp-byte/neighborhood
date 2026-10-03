# NEIGHBORHOOD

NEIGHBORHOOD is a native Android foundation for an AI-powered civic intelligence application. This first milestone provides only a launchable Home screen; camera capture, AI classification, severity assessment, location, persistence, maps, networking, and hotspot analysis are intentionally out of scope.

## Prerequisites

- Android Studio with Android SDK Platform 36 installed
- JDK 17 or newer (the Android Gradle Plugin is configured to run on JDK 17+)
- An Android device or emulator running API 24 or newer

## Build

From the project root on Windows:

```powershell
.\gradlew.bat assembleDebug
```

On macOS or Linux:

```bash
./gradlew assembleDebug
```

The debug APK is written to `app/build/outputs/apk/debug/app-debug.apk`.

## Run

1. Open this directory in Android Studio.
2. Allow Gradle sync to complete.
3. Select an emulator or connected device with API 24+.
4. Run the `app` configuration.

The initial screen intentionally displays only `NEIGHBORHOOD`.

## Project Structure

```text
app/
  src/main/
    java/org/neighborhood/civic/
      core/designsystem/  # Shared Compose visual primitives and theme
      data/               # Future persistence and remote data implementations
      domain/             # Future civic-report business models and use cases
      feature/home/       # Current Home screen
    res/                  # Android resources
```

Future capabilities should be introduced behind the existing architectural boundaries rather than added directly to `MainActivity`:

- CameraX capture: a dedicated feature or platform-facing layer
- TensorFlow Lite: domain-facing classification contract plus data implementation
- Location: platform adapter exposed through a domain contract
- Database and backend: data repositories implementing domain contracts
- Maps and hotspot intelligence: dedicated feature(s) consuming report use cases
