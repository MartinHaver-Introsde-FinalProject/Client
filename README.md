# Client
Client is used to interact with the service. Contains the description of the project + figure of system layers.

# 1. About the project
This application is designed to help people struggling with healthy lifestyle issues. Users can easily track their progress in losing weight or reaching other goals they set up for themselves. Moreover the app is helping users achieve their desired weight in two ways. First, there is a goal-setting mechanic that are designed to guide the way of the user. Second, there is a special feature, using which the user can obtain motivational quotes in order to boost his determination even more.

<b>Here is a list of the most important entities in the project:</b>

<b>Person:</b> abstraction of a user, stores info such as name, physical parameters (height, weight, bmi), birth date, etc.

<b>Goal:</b> Goal is a set of Health measures that user wants to achieve in future. User can set up goals for himself in order to guide his progress towards greater fittness.

<b>Activity:</b> Each activity is described by a description and number of calories burned per hour. Activities are suggested to user based on his health measures and goals.

<b>Health Measure:</b> represents health measurement attributes such as weight, height, age, BMR, BMI, etc. These are essential for providing exercising suggestions based upon comparison with recommended BMI for an average healthy person.

<b>Health Measure History:</b> used for tracking of users' progress over time.

# 2. Project architecture
Project consists of 5 services in 3 main layers: User Interface, System logic and Data sources.

![alt tag](https://github.com/MartinHaver-Introsde-FinalProject/Client/blob/master/pictures/architecture.jpg)

# 3. User interface
User can easily communicate with the system through console application.

![alt tag](https://github.com/MartinHaver-Introsde-FinalProject/Client/blob/master/pictures/UI.jpg)

# 4. Documentation
Here are the links to detailed Apiary documentation repositories, each with description given for every web service.

<p>Adapter Service: <a href="http://docs.adapterservice.apiary.io/#">http://docs.adapterservice.apiary.io/#</a></p>
<p>Database Service: <a href="http://docs.databaseservice.apiary.io/#">http://docs.databaseservice.apiary.io/#</a></p>
<p>Storage Service: <a href="http://docs.storageservice1.apiary.io/#">http://docs.storageservice1.apiary.io/#</a></p>
<p>Business Logic Service: <a href="http://docs.businesslogicservice2.apiary.io/#">http://docs.businesslogicservice2.apiary.io/#</a></p>
<p>Process centric service wsdl: <a href="http://vast-sierra-53430.herokuapp.com/ws/people?wsdl">http://vast-sierra-53430.herokuapp.com/ws/people?wsdl</a></p>
