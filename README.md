# Alumni ENSPM Lite 🎓

A lightweight Android app for ENSP Maroua alumni to connect, share opportunities, and build professional networks. Inspired by the "Facebook Lite" philosophy: ultra-lightweight, optimized for low-end devices and 2G/3G networks.

## 📊 App Overview

**Alumni ENSPM Lite** is a social networking platform for ENSP Maroua graduates featuring:
- **Feed/Posts**: Share updates, photos, and connect with alumni
- **Networking**: Browse alumni directory with filters
- **Opportunities**: Discover internships, trainings, and job offers
- **Profile**: Manage your professional profile and experiences
- **Chat**: Connect with other alumni
- **Notifications**: Stay updated with new activity

## 🎯 Key Features

- ✅ Lightweight: < 15MB APK
- ✅ Offline-First: Works without internet (cached content)
- ✅ Fast: < 2 seconds cold start
- ✅ Low RAM: < 150MB on average
- ✅ Entry-Level Devices: Android 7+ support
- ✅ Flat Design: No heavy animations or shadows
- ✅ Text-First: Content over visuals

## 🛠️ Tech Stack

- **Language**: Kotlin
- **UI**: Jetpack Compose + Material 3
- **Architecture**: MVVM + Clean Architecture
- **DI**: Hilt
- **Network**: Retrofit 2 + OkHttp
- **Serialization**: Moshi
- **Database**: Room + DataStore
- **Images**: Coil (with disk & memory cache)
- **Navigation**: Navigation Compose

## 📋 Project Structure

```
com.enspm.alumni/ 
├── data/ # Data layer 
│ ├── api/ # Retrofit API service 
│ ├── models/ # Data models (User, Post, etc.) 
│ ├── repositories/ # Repository implementations 
│ ├── database/ # Room database setup 
│ └── datastore/ # DataStore preferences 
├── domain/ # Domain layer 
│ ├── models/ # Business logic models 
│ └── repositories/ # Repository interfaces 
├── presentation/ # Presentation layer 
│ ├── ui/ 
│ │ ├── theme/ # Compose theme & colors 
│ │ ├── components/ # Reusable composables 
│ │ ├── screens/ # Screen implementations 
│ │ └── navigation/ # Navigation setup 
│ └── viewmodels/ # ViewModels 
├── di/ # Dependency injection 
└── utils/ # Utilities & constants
```


## 🚀 Getting Started

### Prerequisites
- Android Studio Flamingo or later
- JDK 11+
- Android SDK 24+ (minSdk 24)

### Setup Instructions

1. **Clone the repository**
   ```bash
   git clone https://github.com/bounyamine/alumni-lite.git
   cd alumni-lite
   ```
   
2. **Open in Android Studio**
   ```bash
   # Or open the project directly in Android Studio
   ```

3. **Configure API Base URL**
    - Edit app/src/main/res/values/strings.xml:
   ```bash
   <string name="api_base_url">https://api-alumni.enspm.net/api</string>
   ```
   
4. **Build and Run**
   ```bash
   ./gradlew build
   ./gradlew installDebug
   ```
   
## 🔑 API Configuration
Base URL: `https://api-alumni.enspm.net/api`

Authentication uses Bearer tokens (Sanctum). The app automatically:

- Stores tokens securely in DataStore
- Adds Authorization: Bearer <token> to all requests
- Handles 401 responses (auto-logout)

## 📱 Supported Devices

- Min SDK: Android 7 (API 24)
- Target SDK: Android 14 (API 34)
- RAM: 2GB minimum
- Network: Works on 2G/3G/4G/5G and offline

## 📚 Documentation

- API Integration Guide - Detailed endpoint documentation
- Architecture Guide - System design and patterns
- Build Instructions - Compilation and release process

## 🔄 Development Phases

This project is implemented in 8 phases:

Phase	Duration	Focus
Phase 1	Week 1	Core Infrastructure (DI, Network, Database)
Phase 2	Week 2	Authentication (Login, Logout, OTP)
Phase 3	Week 3	Feed Module (Posts, Comments, Likes)
Phase 4	Week 4	Profile Management (CRUD operations)
Phase 5	Week 5	Networking (Alumni Directory)
Phase 6	Week 6	Opportunities (Stages, Formations, Emplois)
Phase 7	Week 7	Notifications & Chat
Phase 8	Week 8	Organizations, Reports, Forums
Current Status: Phase 1 - In Progress ⚙️

✅ Acceptance Criteria
Each screen must have:

 Offline support (cached content)
 Pagination (infinite scroll)
 Loading states (skeleton shimmer)
 Error states (retry button)
 Empty states (no content)
 Responsive design
 Accessibility support
 Dark mode support
🧪 Testing
bash
# Run unit tests
./gradlew test

# Run instrumented tests
./gradlew connectedAndroidTest

# Check code quality
./gradlew lint

# Generate coverage report
./gradlew testDebugUnitTestCoverage
📦 Build Artifacts
bash
# Debug APK
./gradlew assembleDebug

# Release APK (requires signing)
./gradlew assembleRelease

# App Bundle (for Play Store)

```bash
./gradlew bundleRelease
```
   
## 🎨 Design System

All UI follows the Alumni Design System:

Primary Color: #2563EB (Blue)
Theme: Light + Dark mode
Typography: Roboto font family
Components: Material 3 (elevated, filled, outlined styles)
Spacing: 4dp base unit
Radius: 8dp rounded corners
See Design Tokens for complete specification.

📊 Performance Targets
Metric	Target
APK Size	< 15 MB
Memory Usage	< 150 MB
Startup Time	< 2 seconds
First Paint	< 1 second
Scroll FPS	60 FPS
Cache Hit Rate	> 80%
🐛 Troubleshooting
Images Not Loading
Check API base URL in strings.xml
Verify image paths are correct: {BASE_URL}/storage/{path}
Check Coil disk cache permissions
Authentication Fails
Verify token is stored in DataStore (not SharedPreferences)
Check AuthInterceptor is properly configured
Ensure Bearer token format: Bearer <token>
Network Errors
Test with throttled connection (Chrome DevTools)
Check network interceptor logs
Verify API endpoint URLs
App Crashes
Check Android Studio Logcat for stack traces
Enable StrictMode for debugging
Test on entry-level device
📞 Support & Contribution
Report Issues: GitHub Issues
Discussions: GitHub Discussions
Contributing: See CONTRIBUTING.md
📄 License
This project is licensed under the MIT License - see the LICENSE file for details.

👨‍💻 Author
Bounyamine - GitHub Profile

Built with ❤️ for ENSP Maroua Alumni

Current Build Status: 🔧 Phase 1 - Setting up infrastructure
