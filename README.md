## Your project name, team name and team member(s) 

Project name: Workout Tracker 

Team name: Ruben

Team members: Ruben

## Describe what you are trying to build, why do you want to build it, what it will be useful for, how it will be used, etc. 

Im trying to build an app I can use to track my workouts. I dont track my workouts and I'd like to start but i'd like to make the app do what i personally want it to and look how i want it to. I hope its use case is that it can show some of your workout data and graph some of that data to show some cool metrics. Hopefully i want to use it to see progress in a graphical format and help pick up trends in my workouts.

## (Important) Draw initial UML class diagram.
classDiagram
    class User {
        - username: String
        - password: String
        - email: String
        + login(): void
        + logout(): void
        + register(): void
    }

    class Workout {
        - date: Date
        - duration: int
        - type: String
        - caloriesBurned: int
        + addWorkout(): void
        + editWorkout(): void
        + deleteWorkout(): void
    }

    class Metrics {
        - weight: double
        - bodyFatPercentage: double
        - muscleMass: double
        + calculateMetrics(): void
    }

    class Graph {
        - dataPoints: List<Double>
        + generateGraph(): void
        + displayGraph(): void
    }

    class App {
        - user: User
        - workoutsList: List<Workout>
        - metricsList: List<Metrics>
        + showWorkoutData(): void
        + showMetricsData(): void
        + showGraph(): void
    }

    class DataVisualization {
        - graphType: String
        - data: List<Double>
        + selectGraphType(): void
        + plotData(): void
    }

    User --> App : owns
    Workout --> App : manages
    Metrics --> App : calculates
    Graph --> App : provides data visualization support

## Plan and estimate of effort.



-develop gui to sort of understand how you want the app to function
-develop the login and authentication, and storing data that pertains to your login.
-develop data entry portions of gui
-develop data visualization portions of your gui 
-develop data structure
-develop way to access, modify/overwrite and read data to be able to plot it
-test the app
-test on other devices
-present
this will take me about the rest of the semester to do 




Planning:

This is the initial phase of the development process, where you define the scope and goals of your application. You should also identify the target audience and the features you want to include.

Requirements gathering:

Once you have a clear understanding of your application, you need to gather detailed requirements. This includes defining the user interface, the database structure, and the business logic.

Design:

This is where you create a blueprint for your application. You will need to define the architecture, the components, and the interfaces.

Implementation:

This is where you start writing the code for your application. You will need to implement the features you defined in the design phase.

Testing:

Once you have implemented the code, you need to test it thoroughly to ensure that it works as expected. You should use a variety of testing techniques, such as unit testing, integration testing, and system testing.

Deployment:

This is the final phase of the development process, where you make your application available to users. You may need to deploy the application to a server or a mobile device.