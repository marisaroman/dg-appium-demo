# dg-appium-demo
Appium mobile web demo, using dollargeneral.com

## Installation
1. Install the latest version of [Appium](http://appium.io/) 
2. After cloning the repo, navigate into the dg-appium-demo folder on your machine and execute `./gradlew`
3. You must have XCode and the Simulator installed
4. You must have an iPhone X Simulator running iOS 11.4 installed - alternatively, you can update the DesiredCapabilities in the DriverManager class

## Running the Tests
1. Start the Appium server on port 4723 (the default port). 
2. Start the iPhone X 11.4 Simulator
3. From within the dg-appium-demo folder at a command prompt, execute `./gradlew test`
