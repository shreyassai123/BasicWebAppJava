# Extreme Startup

In today's lecture, we will be engaging in an interactive programming exercise, set up as a game.

The idea of the exercise is that you are part of an extreme startup that is rapidly iterating to meet customer demand.
This exercise will be performed in teams.

Your team will set up a small web app and log into a game website.  The game server will send requests to your web app, and your web app will (hopefully) respond to them.  The game server will then check the answer your web app sends, and score your team.  There will be a leaderboard where you can check your progress.  The game will proceed in rounds, where the requests sent will become more complicated over time.

The point of the exercise isn't to develop a perfect web application in response to the game server, but to engage in rapid/continuous iteration and deployment, and reflect on the challenges.

We have set up this repository with a simple Java web server as a starting point, that you can deploy within codespaces.

## BasicWebApp Java

Forked from https://github.com/rchatley/BasicWebApp

This code and repository is deliberately simple.

This is a Java application that provides a simple web server that listens on port 8080 and provides a single `/api` endpoint.

Queries received on the `/api` endpoint are handed to `QueryProcessor.process(String)`

The project is set up using maven; note the `pom.xml`

You can run it in the usual ways --- from the Maven view in VSCode, using maven at the command line, or selecting "run" on the main method, as examples.

## Initial setup and deployment

As a team, you need at least one person to have opened up the project and launched a codespace with it.
When you get the code built and running, it will launch the web app within codespaces, and codespaces will automatically set up port forwarding for you.

By default, this URL is private within a LAN.  You can make it public by either:

* Selecting "Make Public" in the VSCode prompt that appears after the application launches.  It reads "Your application running on port 8080 is available..." "Make Public" is a button below the message.

Or:

1. Navigate to the Ports tab
2. Right-click the entry for port 8080
3. Select "Port Visibility"
4. Select "Public"

Note that this allows your private code, deployed within codespaces, to serve a publicly-facing web app!

You can also visit your web app yourself by navigating to that URL; from a browser, you may need to select "Continue" the first time you visit a web app served from a codespace.

## Enter the competition

Navigate to https://extreme-startup.fly.dev/

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
