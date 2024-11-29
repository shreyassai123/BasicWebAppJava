# Extreme Startup

In today's lecture, we will be engaging in an interactive programming exercise, set up as a game.

The idea of the exercise is that you are part of an extreme startup that is rapidly iterating to meet customer demand.
This exercise will be performed in teams.

Your team will set up a small web app and log into a game website.  The game server will send requests to your web app, and your web app will (hopefully) respond to them.  The game server will then check the answer your web app sends, and score your team.  There will be a leaderboard where you can check your progress.  The game will proceed in rounds, where the requests sent will become more complicated over time.

The point of the exercise isn't to develop a perfect web application in response to the game server, but to engage in rapid/continuous iteration and deployment, and reflect on the challenges.

We have set up this repository with a simple Java web server as a starting point, that you can deploy within Codespaces.

## The Starter Codebase: Basic Web App (Java)

This code is forked from https://github.com/rchatley/BasicWebApp.
It contains a simple Java web server that listens on port 8080 and exposes a single `/api` HTTP endpoint.
Queries received on the `/api` endpoint are handed to `QueryProcessor.process(String)`.

### Getting Started

To run the code locally on your machine, you should use the provided development container.
To use it, you should use CMD (or CTRL) + SHIFT + P to bring up a dropdown menu; from there, you should type or select "Dev Containers: Rebuild Container" to build the development container and drop you in it.

**To run the web app from within VS code,** you can click the "Run" or "Debug" annotation above the `public static void main` in `WebServer.Java`. Clicking the latter will enable the debugger.

![Launching server in VS Code](./images/launch-vscode.png)

**To run the tests from within VS Code,** you can click the green arrow in the gutter next to the test, as shown below.

![Running tests in VS Code](./images/run-tests.png)

**To build and run the web app via the command line,** you will need to execute the following commands within the terminal:

```
mvn clean package
java -jar target/BasicWebApp-1.0-SNAPSHOT.jar
```

**To run the tests via the command line,** you will need to execute the followng command from within the terminal:

```
mvn test
```

## Initial setup and deployment

As a team, you need at least one person to have opened up the project and launched a Codespace with it.
When you get the code built and running, it will launch the web app within Codespaces, and Codespaces will automatically set up port forwarding for you.

By default, this URL is private within a LAN.  You can make it public by either:

* Selecting "Make Public" in the VSCode prompt that appears after the application launches.
It reads "Your application running on port 8080 is available..." "Make Public" is a button below the message.

Or:

1. Navigate to the Ports tab
2. Right-click the entry for port 8080
3. Select "Port Visibility"
4. Select "Public"

Note that this allows your private code, deployed within Codespaces, to serve a publicly-facing web app!

You can also visit your web app yourself by navigating to that URL; from a browser, you may need to select "Continue" the first time you visit a web app served from a Codespace.

## Enter the competition

Navigate to https://extreme-startup.fly.dev

Enter a name for your team, and the game code shared in class.

Enter the URL for your public web app, with /api appended to the end.

_It is very important you include the /api at the end or the game server will not send requests to the correct endpoint._

The game server will periodically send queries to the endpoint.

If it's working, your app (however it's running) will log output indicating the received query.

If you enter the incorrect URL, you can just join the game anew with a new URL (let us know in chat and we can remove the previous entry).

### Warmup

In the warmup round, the game server will only send the query "What is your name?"  The correct answer for your web app is your team name, so you will be giving the "incorrect" response at first.

In warmup, try to get your app to respond correctly.

## Playing subsequent game rounds

When the teams have things set up correctly, we'll move on to real rounds. The queries will become more complicated.

Your goal as a team is to modify your app to respond to the queries correctly.

At this point, your team can work however you like!  If multiple teammates are able to work from their computers, multiple people can code simultaneously.

You can add code, tests, or configuration.
We also have access to GitHub Actions minutes that you can use.

We will warn you before we advance game rounds.
