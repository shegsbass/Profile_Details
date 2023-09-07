# Slack Profile to GitHub Mobile App

A mobile application that prominently features Slack Name, Slack profile picture, and includes an “Open GitHub” button. When pressed, a process indicator appears before loading a WebView component that allows users to access the GitHub profile within the application itself.

## Project Overview

This mobile application is built using the Android platform and Jetpack Compose UI toolkit. It serves as a convenient way to view a user's Slack profile information and quickly access their GitHub profile within the app.

## Features

- Display Slack Name and Slack profile picture.
- Open the user's GitHub profile within the app using Android webView component.
- Display a loading indicator while the GitHub profile is being loaded.

## Setup Instructions

Follow these steps to set up and run the project on your local development environment:

1. **Clone the Repository:**

   ```shell
   git clone https://github.com/shegsbass/Profile_Details.git

Open the Project:

2. Open the project in Android Studio.

3. Run the App:

4. Build and run the app on your Android emulator or physical device.

5. Explore the App:

Explore the app's features, including viewing Slack Name, profile picture, and opening a GitHub profile within the app.

## Navigation Dependency
dependencies {
        val nav_version = "2.6.0"
        
        implementation("androidx.navigation:navigation-compose:$nav_version")
    }

## Assumptions
- This project assumes that you have a working Android development environment set up with Android Studio.
- This project assumes that you are familiar with Jetpack Compose.
