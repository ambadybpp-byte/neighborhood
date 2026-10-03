# AGENTS.md

## Purpose

NEIGHBORHOOD is a native Kotlin Android application for civic intelligence. The current milestone is strictly the app foundation: a launchable Home screen and the architecture needed to grow safely.

## Technology Rules

- Use Kotlin for Android production code.
- Keep the application native and Android-first.
- Prefer Jetpack and AndroidX APIs before third-party libraries.
- Add a dependency only when a current, implemented requirement needs it.
- Keep Gradle versions centralized in `gradle/libs.versions.toml`.
- Maintain Java 17 bytecode compatibility and keep the Gradle runtime compatible with the Android Gradle Plugin.

## Architecture

- `feature/*` owns UI routes, screen state, and UI-specific behavior.
- `domain/*` will own civic-report models, repository contracts, and use cases. It must not depend on Android framework, database, network, or UI code.
- `data/*` will implement domain contracts for local storage, network, and on-device ML.
- `core/*` holds small, shared cross-cutting components. Do not place product-specific features there.
- `MainActivity` stays limited to application composition and navigation hosting.

Keep Android framework integrations behind narrow interfaces where that improves testability. Introduce modules only when a boundary has enough code or build-time ownership to justify one.

## Product Boundaries for This Milestone

Do not add:

- Camera or media capture flows
- TensorFlow Lite models or inference
- Severity scoring or simulated classification
- GPS/location collection
- Database, backend, authentication, or networking
- Maps, geocoding, clustering, or hotspot logic

Do not use fabricated responses or placeholder flows that imply these capabilities exist.

## Code Quality

- Write focused, idiomatic Kotlin.
- Keep composables small and accessible.
- Use Material 3 styling consistently.
- Add unit tests when behavior is introduced; avoid tests that only assert framework rendering.
- Run `.\gradlew.bat assembleDebug` before considering a change complete.
- Do not reformat or rewrite unrelated code.
